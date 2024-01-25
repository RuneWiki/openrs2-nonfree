import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class38 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "J")
	private long aLong19 = -1L;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
	private long aLong21 = -1L;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	private int anInt854 = 0;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!vr;")
	private final Class308 aClass308_1;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vr;II)V")
	public Class38(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass308_1 = arg0;
		this.aLong20 = this.aLong22 = arg0.method7735();
		this.aByteArray20 = new byte[arg1];
		this.aLong18 = 0L;
		this.aByteArray19 = new byte[arg2];
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)J")
	public long method852() {
		return this.aLong20;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	private void method853() throws IOException {
		this.anInt848 = 0;
		if (this.aLong18 != this.aLong23) {
			this.aClass308_1.method7740(this.aLong18);
			this.aLong23 = this.aLong18;
		}
		this.aLong21 = this.aLong18;
		while (this.anInt848 < this.aByteArray20.length) {
			@Pc(46) int local46 = this.aByteArray20.length - this.anInt848;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass308_1.method7737(this.aByteArray20, local46, this.anInt848);
			if (local63 == -1) {
				break;
			}
			this.anInt848 += local63;
			this.aLong23 += local63;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method854() {
		return this.aClass308_1.method7738();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "([BIIZ)V")
	public void method855(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong19 != -1L && this.aLong18 >= this.aLong19 && (long) arg1 + this.aLong18 <= (long) this.anInt854 + this.aLong19) {
				Static554.method3498(this.aByteArray19, (int) (this.aLong18 - this.aLong19), arg0, 0, arg1);
				this.aLong18 += arg1;
				return;
			}
			@Pc(75) long local75 = this.aLong18;
			@Pc(85) int local85 = arg1;
			@Pc(114) int local114;
			if (this.aLong18 >= this.aLong21 && this.aLong18 < (long) this.anInt848 + this.aLong21) {
				local114 = (int) (this.aLong21 + (long) this.anInt848 - this.aLong18);
				if (local114 > arg1) {
					local114 = arg1;
				}
				Static554.method3498(this.aByteArray20, (int) (this.aLong18 - this.aLong21), arg0, 0, local114);
				arg1 -= local114;
				arg2 = local114;
				this.aLong18 += local114;
			}
			if (arg1 > this.aByteArray20.length) {
				this.aClass308_1.method7740(this.aLong18);
				this.aLong23 = this.aLong18;
				while (arg1 > 0) {
					local114 = this.aClass308_1.method7737(arg0, arg1, arg2);
					if (local114 == -1) {
						break;
					}
					this.aLong23 += local114;
					arg1 -= local114;
					this.aLong18 += local114;
					arg2 += local114;
				}
			} else if (arg1 > 0) {
				this.method853();
				local114 = arg1;
				if (arg1 > this.anInt848) {
					local114 = this.anInt848;
				}
				Static554.method3498(this.aByteArray20, 0, arg0, arg2, local114);
				arg2 += local114;
				arg1 -= local114;
				this.aLong18 += local114;
			}
			if (this.aLong19 != -1L) {
				if (this.aLong19 > this.aLong18 && arg1 > 0) {
					local114 = arg2 + (int) (this.aLong19 - this.aLong18);
					if (local114 > arg1 + arg2) {
						local114 = arg2 + arg1;
					}
					while (local114 > arg2) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong18++;
					}
				}
				@Pc(313) long local313 = -1L;
				@Pc(315) long local315 = -1L;
				if (this.aLong19 >= local75 && this.aLong19 < local75 + (long) local85) {
					local313 = this.aLong19;
				} else if (this.aLong19 <= local75 && local75 < this.aLong19 + (long) this.anInt854) {
					local313 = local75;
				}
				if (local75 < this.aLong19 + (long) this.anInt854 && (long) local85 + local75 >= this.aLong19 - -((long) this.anInt854)) {
					local315 = (long) this.anInt854 + this.aLong19;
				} else if (this.aLong19 < (long) local85 + local75 && (long) this.anInt854 + this.aLong19 >= (long) local85 + local75) {
					local315 = (long) local85 + local75;
				}
				if (local313 > -1L && local315 > local313) {
					@Pc(449) int local449 = (int) (local315 - local313);
					Static554.method3498(this.aByteArray19, (int) (local313 - this.aLong19), arg0, (int) (local313 - local75), local449);
					if (local315 > this.aLong18) {
						arg1 = (int) ((long) arg1 + this.aLong18 - local315);
						this.aLong18 = local315;
					}
				}
			}
		} catch (@Pc(487) IOException local487) {
			this.aLong23 = -1L;
			throw local487;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
	private void method856() throws IOException {
		if (this.aLong19 == -1L) {
			return;
		}
		if (this.aLong23 != this.aLong19) {
			this.aClass308_1.method7740(this.aLong19);
			this.aLong23 = this.aLong19;
		}
		this.aClass308_1.method7736(this.anInt854, this.aByteArray19, 0);
		this.aLong23 += this.anInt854;
		if (this.aLong22 < this.aLong23) {
			this.aLong22 = this.aLong23;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong21 <= this.aLong19 && (long) this.anInt848 + this.aLong21 > this.aLong19) {
			local65 = this.aLong19;
		} else if (this.aLong19 <= this.aLong21 && this.aLong21 < this.aLong19 + (long) this.anInt854) {
			local65 = this.aLong21;
		}
		if ((long) this.anInt854 + this.aLong19 > this.aLong21 && (long) this.anInt848 + this.aLong21 >= (long) this.anInt854 + this.aLong19) {
			local67 = this.aLong19 + (long) this.anInt854;
		} else if (this.aLong19 < this.aLong21 + (long) this.anInt848 && (long) this.anInt854 + this.aLong19 >= this.aLong21 - -((long) this.anInt848)) {
			local67 = (long) this.anInt848 + this.aLong21;
		}
		if (local65 > -1L && local65 < local67) {
			@Pc(221) int local221 = (int) (local67 - local65);
			Static554.method3498(this.aByteArray19, (int) (local65 - this.aLong19), this.aByteArray20, (int) (local65 - this.aLong21), local221);
		}
		this.anInt854 = 0;
		this.aLong19 = -1L;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[B)V")
	public void method857(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method855(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IJ)V")
	public void method858(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method854());
		}
		this.aLong18 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z[BII)V")
	public void method860(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong20 < (long) arg1 + this.aLong18) {
				this.aLong20 = (long) arg1 + this.aLong18;
			}
			if (this.aLong19 != -1L && (this.aLong18 < this.aLong19 || this.aLong18 > this.aLong19 + (long) this.anInt854)) {
				this.method856();
			}
			if (this.aLong19 != -1L && (long) this.aByteArray19.length + this.aLong19 < this.aLong18 - -((long) arg1)) {
				@Pc(91) int local91 = (int) (this.aLong19 + (long) this.aByteArray19.length - this.aLong18);
				Static554.method3498(arg0, arg2, this.aByteArray19, (int) (this.aLong18 - this.aLong19), local91);
				arg2 += local91;
				arg1 -= local91;
				this.aLong18 += local91;
				this.anInt854 = this.aByteArray19.length;
				this.method856();
			}
			if (this.aByteArray19.length < arg1) {
				if (this.aLong23 != this.aLong18) {
					this.aClass308_1.method7740(this.aLong18);
					this.aLong23 = this.aLong18;
				}
				this.aClass308_1.method7736(arg1, arg0, arg2);
				this.aLong23 += arg1;
				if (this.aLong22 < this.aLong23) {
					this.aLong22 = this.aLong23;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong21 <= this.aLong18 && this.aLong21 + (long) this.anInt848 > this.aLong18) {
					local186 = this.aLong18;
				} else if (this.aLong18 <= this.aLong21 && (long) arg1 + this.aLong18 > this.aLong21) {
					local186 = this.aLong21;
				}
				@Pc(236) long local236 = -1L;
				if (this.aLong21 < (long) arg1 + this.aLong18 && (long) this.anInt848 + this.aLong21 >= this.aLong18 + (long) arg1) {
					local236 = (long) arg1 + this.aLong18;
				} else if (this.aLong18 < this.aLong21 + (long) this.anInt848 && (long) arg1 + this.aLong18 >= this.aLong21 + (long) this.anInt848) {
					local236 = this.aLong21 + (long) this.anInt848;
				}
				if (local186 > -1L && local236 > local186) {
					@Pc(318) int local318 = (int) (local236 - local186);
					Static554.method3498(arg0, (int) (local186 + (long) arg2 - this.aLong18), this.aByteArray20, (int) (local186 - this.aLong21), local318);
				}
				this.aLong18 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong19 == -1L) {
					this.aLong19 = this.aLong18;
				}
				Static554.method3498(arg0, arg2, this.aByteArray19, (int) (this.aLong18 - this.aLong19), arg1);
				this.aLong18 += arg1;
				if (this.aLong18 - this.aLong19 > (long) this.anInt854) {
					this.anInt854 = (int) (this.aLong18 - this.aLong19);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong23 = -1L;
			throw local403;
		}
	}
}
