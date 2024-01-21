import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class72 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	private int anInt3432;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "J")
	private long aLong114;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "J")
	private long aLong111 = -1L;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
	private int anInt3443 = 0;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "J")
	private long aLong112 = -1L;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!t;")
	private final Class83 aClass83_4;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[B")
	private final byte[] aByteArray39;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!t;II)V")
	public Class72(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass83_4 = arg0;
		this.aLong109 = this.aLong113 = arg0.method2931();
		this.aByteArray40 = new byte[arg1];
		this.aLong110 = 0L;
		this.aByteArray39 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	private void method2623() throws IOException {
		if (this.aLong112 == -1L) {
			return;
		}
		if (this.aLong112 != this.aLong114) {
			this.aClass83_4.method2932(this.aLong112);
			this.aLong114 = this.aLong112;
		}
		this.aClass83_4.method2935(this.aByteArray39, 0, this.anInt3443);
		@Pc(31) long local31 = -1L;
		if (this.aLong112 >= this.aLong111 && this.aLong112 < (long) this.anInt3432 + this.aLong111) {
			local31 = this.aLong112;
		} else if (this.aLong111 >= this.aLong112 && this.aLong111 < (long) this.anInt3443 + this.aLong112) {
			local31 = this.aLong111;
		}
		@Pc(80) long local80 = -1L;
		this.aLong114 += this.anInt3443;
		if (this.aLong113 < this.aLong114) {
			this.aLong113 = this.aLong114;
		}
		if (this.aLong111 < (long) this.anInt3443 + this.aLong112 && (long) this.anInt3432 + this.aLong111 >= (long) this.anInt3443 + this.aLong112) {
			local80 = this.aLong112 + (long) this.anInt3443;
		} else if (this.aLong112 < this.aLong111 + (long) this.anInt3432 && this.aLong111 + (long) this.anInt3432 <= this.aLong112 + (long) this.anInt3443) {
			local80 = (long) this.anInt3432 + this.aLong111;
		}
		if (local31 > -1L && local31 < local80) {
			@Pc(184) int local184 = (int) (local80 - local31);
			Static217.method2361(this.aByteArray39, (int) (local31 - this.aLong112), this.aByteArray40, (int) (local31 - this.aLong111), local184);
		}
		this.aLong112 = -1L;
		this.anInt3443 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)V")
	public void method2625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong109 < (long) arg0 + this.aLong110) {
				this.aLong109 = this.aLong110 + (long) arg0;
			}
			if (this.aLong112 != -1L && (this.aLong110 < this.aLong112 || (long) this.anInt3443 + this.aLong112 < this.aLong110)) {
				this.method2623();
			}
			if (this.aLong112 != -1L && (long) this.aByteArray39.length + this.aLong112 < (long) arg0 + this.aLong110) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray39.length + this.aLong112 - this.aLong110);
				Static217.method2361(arg2, arg1, this.aByteArray39, (int) (this.aLong110 - this.aLong112), local91);
				arg1 += local91;
				this.aLong110 += local91;
				this.anInt3443 = this.aByteArray39.length;
				arg0 -= local91;
				this.method2623();
			}
			if (arg0 > this.aByteArray39.length) {
				@Pc(139) long local139 = -1L;
				@Pc(141) long local141 = -1L;
				if (this.aLong110 != this.aLong114) {
					this.aClass83_4.method2932(this.aLong110);
					this.aLong114 = this.aLong110;
				}
				this.aClass83_4.method2935(arg2, arg1, arg0);
				this.aLong114 += arg0;
				if (this.aLong114 > this.aLong113) {
					this.aLong113 = this.aLong114;
				}
				if (this.aLong110 + (long) arg0 > this.aLong111 && (long) arg0 + this.aLong110 <= this.aLong111 + (long) this.anInt3432) {
					local141 = (long) arg0 + this.aLong110;
				} else if ((long) this.anInt3432 + this.aLong111 > this.aLong110 && this.aLong111 + (long) this.anInt3432 <= this.aLong110 - -((long) arg0)) {
					local141 = (long) this.anInt3432 + this.aLong111;
				}
				if (this.aLong110 >= this.aLong111 && this.aLong110 < this.aLong111 + (long) this.anInt3432) {
					local139 = this.aLong110;
				} else if (this.aLong110 <= this.aLong111 && (long) arg0 + this.aLong110 > this.aLong111) {
					local139 = this.aLong111;
				}
				if (local139 > -1L && local139 < local141) {
					@Pc(324) int local324 = (int) (local141 - local139);
					Static217.method2361(arg2, (int) ((long) arg1 + local139 - this.aLong110), this.aByteArray40, (int) (local139 - this.aLong111), local324);
				}
				this.aLong110 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong112 == -1L) {
					this.aLong112 = this.aLong110;
				}
				Static217.method2361(arg2, arg1, this.aByteArray39, (int) (this.aLong110 - this.aLong112), arg0);
				this.aLong110 += arg0;
				if (this.aLong110 - this.aLong112 > (long) this.anInt3443) {
					this.anInt3443 = (int) (this.aLong110 - this.aLong112);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong114 = -1L;
			throw local405;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)J")
	public long method2626() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)V")
	public void method2627(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2630(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	private void method2628() throws IOException {
		this.anInt3432 = 0;
		if (this.aLong110 != this.aLong114) {
			this.aClass83_4.method2932(this.aLong110);
			this.aLong114 = this.aLong110;
		}
		this.aLong111 = this.aLong110;
		while (this.aByteArray40.length > this.anInt3432) {
			@Pc(41) int local41 = this.aByteArray40.length - this.anInt3432;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(56) int local56 = this.aClass83_4.method2933(local41, this.anInt3432, this.aByteArray40);
			if (local56 == -1) {
				break;
			}
			this.anInt3432 += local56;
			this.aLong114 += local56;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method2629() {
		return this.aClass83_4.method2936();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BZI)V")
	public void method2630(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong112 != -1L && this.aLong110 >= this.aLong112 && this.aLong110 + (long) arg2 <= (long) this.anInt3443 + this.aLong112) {
				Static217.method2361(this.aByteArray39, (int) (this.aLong110 - this.aLong112), arg1, 0, arg2);
				this.aLong110 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong110;
			@Pc(82) int local82 = arg2;
			@Pc(116) int local116;
			if (this.aLong111 <= this.aLong110 && this.aLong110 < this.aLong111 + (long) this.anInt3432) {
				local116 = (int) ((long) this.anInt3432 + this.aLong111 - this.aLong110);
				if (arg2 < local116) {
					local116 = arg2;
				}
				Static217.method2361(this.aByteArray40, (int) (this.aLong110 - this.aLong111), arg1, 0, local116);
				this.aLong110 += local116;
				arg0 = local116;
				arg2 -= local116;
			}
			if (arg2 > this.aByteArray40.length) {
				this.aClass83_4.method2932(this.aLong110);
				this.aLong114 = this.aLong110;
				while (arg2 > 0) {
					local116 = this.aClass83_4.method2933(arg2, arg0, arg1);
					if (local116 == -1) {
						break;
					}
					this.aLong114 += local116;
					this.aLong110 += local116;
					arg2 -= local116;
					arg0 += local116;
				}
			} else if (arg2 > 0) {
				this.method2628();
				local116 = arg2;
				if (this.anInt3432 < arg2) {
					local116 = this.anInt3432;
				}
				arg2 -= local116;
				Static217.method2361(this.aByteArray40, 0, arg1, arg0, local116);
				this.aLong110 += local116;
				arg0 += local116;
			}
			if (this.aLong112 != -1L) {
				if (this.aLong112 > this.aLong110 && arg2 > 0) {
					local116 = arg0 + (int) (this.aLong112 - this.aLong110);
					if (local116 > arg2 + arg0) {
						local116 = arg0 + arg2;
					}
					while (local116 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong110++;
					}
				}
				@Pc(310) long local310 = -1L;
				@Pc(312) long local312 = -1L;
				if ((long) this.anInt3443 + this.aLong112 > local80 && this.aLong112 + (long) this.anInt3443 <= local80 - -((long) local82)) {
					local312 = (long) this.anInt3443 + this.aLong112;
				} else if (this.aLong112 < (long) local82 + local80 && local80 + (long) local82 <= this.aLong112 + (long) this.anInt3443) {
					local312 = (long) local82 + local80;
				}
				if (this.aLong112 >= local80 && (long) local82 + local80 > this.aLong112) {
					local310 = this.aLong112;
				} else if (this.aLong112 <= local80 && this.aLong112 + (long) this.anInt3443 > local80) {
					local310 = local80;
				}
				if (local310 > -1L && local310 < local312) {
					@Pc(440) int local440 = (int) (local312 - local310);
					Static217.method2361(this.aByteArray39, (int) (local310 - this.aLong112), arg1, (int) (local310 - local80), local440);
					if (local312 > this.aLong110) {
						arg2 = (int) ((long) arg2 + this.aLong110 - local312);
						this.aLong110 = local312;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong114 = -1L;
			throw local480;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BJ)V")
	public void method2633(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2629());
		}
		this.aLong110 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public void method2634() throws IOException {
		this.method2623();
		this.aClass83_4.method2934();
	}
}
