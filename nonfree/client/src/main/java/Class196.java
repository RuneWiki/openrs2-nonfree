import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class196 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "J")
	private long aLong170 = -1L;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	private int anInt6062 = 0;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "J")
	private long aLong173 = -1L;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "Lclient!wr;")
	private final Class323 aClass323_1;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "[B")
	private final byte[] aByteArray60;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!wr;II)V")
	public Class196(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass323_1 = arg0;
		this.aLong174 = this.aLong172 = arg0.method7799();
		this.aByteArray59 = new byte[arg2];
		this.aByteArray60 = new byte[arg1];
		this.aLong171 = 0L;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	private void method5073() throws IOException {
		this.anInt6065 = 0;
		if (this.aLong171 != this.aLong169) {
			this.aClass323_1.method7798(this.aLong171);
			this.aLong169 = this.aLong171;
		}
		this.aLong173 = this.aLong171;
		while (this.aByteArray60.length > this.anInt6065) {
			@Pc(48) int local48 = this.aByteArray60.length - this.anInt6065;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass323_1.method7797(this.anInt6065, this.aByteArray60, local48);
			if (local65 == -1) {
				break;
			}
			this.anInt6065 += local65;
			this.aLong169 += local65;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BII)V")
	public void method5074(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong174 < (long) arg2 + this.aLong171) {
				this.aLong174 = this.aLong171 + (long) arg2;
			}
			if (this.aLong170 != -1L && (this.aLong171 < this.aLong170 || this.aLong170 + (long) this.anInt6062 < this.aLong171)) {
				this.method5077();
			}
			if (this.aLong170 != -1L && this.aLong170 + (long) this.aByteArray59.length < this.aLong171 - -((long) arg2)) {
				@Pc(89) int local89 = (int) (this.aLong170 + (long) this.aByteArray59.length - this.aLong171);
				Static559.method5957(arg0, arg1, this.aByteArray59, (int) (this.aLong171 - this.aLong170), local89);
				arg1 += local89;
				arg2 -= local89;
				this.aLong171 += local89;
				this.anInt6062 = this.aByteArray59.length;
				this.method5077();
			}
			if (arg2 > this.aByteArray59.length) {
				if (this.aLong171 != this.aLong169) {
					this.aClass323_1.method7798(this.aLong171);
					this.aLong169 = this.aLong171;
				}
				this.aClass323_1.method7795(arg2, arg0, arg1);
				this.aLong169 += arg2;
				if (this.aLong172 < this.aLong169) {
					this.aLong172 = this.aLong169;
				}
				@Pc(176) long local176 = -1L;
				@Pc(178) long local178 = -1L;
				if (this.aLong171 >= this.aLong173 && this.aLong171 < (long) this.anInt6065 + this.aLong173) {
					local176 = this.aLong171;
				} else if (this.aLong171 <= this.aLong173 && this.aLong173 < (long) arg2 + this.aLong171) {
					local176 = this.aLong173;
				}
				if (this.aLong173 < this.aLong171 + (long) arg2 && this.aLong171 + (long) arg2 <= (long) this.anInt6065 + this.aLong173) {
					local178 = this.aLong171 + (long) arg2;
				} else if (this.aLong171 < this.aLong173 + (long) this.anInt6065 && this.aLong173 + (long) this.anInt6065 <= (long) arg2 + this.aLong171) {
					local178 = this.aLong173 + (long) this.anInt6065;
				}
				if (local176 > -1L && local176 < local178) {
					@Pc(308) int local308 = (int) (local178 - local176);
					Static559.method5957(arg0, (int) ((long) arg1 + local176 - this.aLong171), this.aByteArray60, (int) (local176 - this.aLong173), local308);
				}
				this.aLong171 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong170 == -1L) {
					this.aLong170 = this.aLong171;
				}
				Static559.method5957(arg0, arg1, this.aByteArray59, (int) (this.aLong171 - this.aLong170), arg2);
				this.aLong171 += arg2;
				if ((long) this.anInt6062 < this.aLong171 - this.aLong170) {
					this.anInt6062 = (int) (this.aLong171 - this.aLong170);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong169 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5075() {
		return this.aClass323_1.method7796();
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	private void method5077() throws IOException {
		if (this.aLong170 == -1L) {
			return;
		}
		if (this.aLong169 != this.aLong170) {
			this.aClass323_1.method7798(this.aLong170);
			this.aLong169 = this.aLong170;
		}
		this.aClass323_1.method7795(this.anInt6062, this.aByteArray59, 0);
		this.aLong169 += this.anInt6062;
		if (this.aLong169 > this.aLong172) {
			this.aLong172 = this.aLong169;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong173 <= this.aLong170 && (long) this.anInt6065 + this.aLong173 > this.aLong170) {
			local68 = this.aLong170;
		} else if (this.aLong170 <= this.aLong173 && (long) this.anInt6062 + this.aLong170 > this.aLong173) {
			local68 = this.aLong173;
		}
		if ((long) this.anInt6062 + this.aLong170 > this.aLong173 && (long) this.anInt6062 + this.aLong170 <= this.aLong173 - -((long) this.anInt6065)) {
			local70 = this.aLong170 + (long) this.anInt6062;
		} else if (this.aLong170 < this.aLong173 + (long) this.anInt6065 && (long) this.anInt6065 + this.aLong173 <= this.aLong170 - -((long) this.anInt6062)) {
			local70 = this.aLong173 + (long) this.anInt6065;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(210) int local210 = (int) (local70 - local68);
			Static559.method5957(this.aByteArray59, (int) (local68 - this.aLong170), this.aByteArray60, (int) (local68 - this.aLong173), local210);
		}
		this.anInt6062 = 0;
		this.aLong170 = -1L;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[B)V")
	public void method5078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong170 != -1L && this.aLong170 <= this.aLong171 && this.aLong170 + (long) this.anInt6062 >= (long) arg0 + this.aLong171) {
				Static559.method5957(this.aByteArray59, (int) (this.aLong171 - this.aLong170), arg2, 0, arg0);
				this.aLong171 += arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong171;
			@Pc(81) int local81 = arg0;
			@Pc(114) int local114;
			if (this.aLong171 >= this.aLong173 && this.aLong173 + (long) this.anInt6065 > this.aLong171) {
				local114 = (int) ((long) this.anInt6065 + this.aLong173 - this.aLong171);
				if (arg0 < local114) {
					local114 = arg0;
				}
				Static559.method5957(this.aByteArray60, (int) (this.aLong171 - this.aLong173), arg2, 0, local114);
				this.aLong171 += local114;
				arg0 -= local114;
				arg1 = local114;
			}
			if (this.aByteArray60.length < arg0) {
				this.aClass323_1.method7798(this.aLong171);
				this.aLong169 = this.aLong171;
				while (arg0 > 0) {
					local114 = this.aClass323_1.method7797(arg1, arg2, arg0);
					if (local114 == -1) {
						break;
					}
					this.aLong169 += local114;
					arg0 -= local114;
					arg1 += local114;
					this.aLong171 += local114;
				}
			} else if (arg0 > 0) {
				this.method5073();
				local114 = arg0;
				if (arg0 > this.anInt6065) {
					local114 = this.anInt6065;
				}
				Static559.method5957(this.aByteArray60, 0, arg2, arg1, local114);
				this.aLong171 += local114;
				arg0 -= local114;
				arg1 += local114;
			}
			if (this.aLong170 != -1L) {
				if (this.aLong171 < this.aLong170 && arg0 > 0) {
					local114 = (int) (this.aLong170 - this.aLong171) + arg1;
					if (arg0 + arg1 < local114) {
						local114 = arg1 + arg0;
					}
					while (arg1 < local114) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong171++;
					}
				}
				@Pc(324) long local324 = -1L;
				@Pc(326) long local326 = -1L;
				if (this.aLong170 >= local77 && (long) local81 + local77 > this.aLong170) {
					local324 = this.aLong170;
				} else if (local77 >= this.aLong170 && (long) this.anInt6062 + this.aLong170 > local77) {
					local324 = local77;
				}
				if (local77 < this.aLong170 + (long) this.anInt6062 && (long) this.anInt6062 + this.aLong170 <= (long) local81 + local77) {
					local326 = this.aLong170 + (long) this.anInt6062;
				} else if (this.aLong170 < (long) local81 + local77 && local77 + (long) local81 <= (long) this.anInt6062 + this.aLong170) {
					local326 = local77 + (long) local81;
				}
				if (local324 > -1L && local324 < local326) {
					@Pc(464) int local464 = (int) (local326 - local324);
					Static559.method5957(this.aByteArray59, (int) (local324 - this.aLong170), arg2, (int) (local324 - local77), local464);
					if (this.aLong171 < local326) {
						arg0 = (int) ((long) arg0 + this.aLong171 - local326);
						this.aLong171 = local326;
					}
				}
			}
		} catch (@Pc(506) IOException local506) {
			this.aLong169 = -1L;
			throw local506;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)J")
	public long method5079() {
		return this.aLong174;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[B)V")
	public void method5080(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method5078(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IJ)V")
	public void method5081(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5075());
		}
		this.aLong171 = arg0;
	}
}
