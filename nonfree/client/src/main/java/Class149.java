import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class149 {

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	private int anInt4816;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	private int anInt4810 = 0;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "J")
	private long aLong181 = -1L;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "J")
	private long aLong176 = -1L;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "Lclient!vk;")
	private final Class212 aClass212_4;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!vk;II)V")
	public Class149(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass212_4 = arg0;
		this.aLong179 = this.aLong180 = arg0.method5531();
		this.aByteArray56 = new byte[arg2];
		this.aByteArray57 = new byte[arg1];
		this.aLong178 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
	private void method3949() throws IOException {
		this.anInt4816 = 0;
		if (this.aLong177 != this.aLong178) {
			this.aClass212_4.method5534(this.aLong178);
			this.aLong177 = this.aLong178;
		}
		this.aLong181 = this.aLong178;
		while (this.anInt4816 < this.aByteArray57.length) {
			@Pc(42) int local42 = this.aByteArray57.length - this.anInt4816;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass212_4.method5532(this.aByteArray57, this.anInt4816, local42);
			if (local57 == -1) {
				break;
			}
			this.anInt4816 += local57;
			this.aLong177 += local57;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z[B)V")
	public void method3952(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method3955(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)Ljava/io/File;")
	private File method3953() {
		return this.aClass212_4.method5535();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZI[B)V")
	public void method3955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong176 != -1L && this.aLong176 <= this.aLong178 && this.aLong176 + (long) this.anInt4810 >= this.aLong178 + (long) arg0) {
				Static363.method4761(this.aByteArray56, (int) (this.aLong178 - this.aLong176), arg2, 0, arg0);
				this.aLong178 += arg0;
				return;
			}
			@Pc(73) long local73 = this.aLong178;
			@Pc(77) int local77 = arg0;
			@Pc(118) int local118;
			if (this.aLong178 >= this.aLong181 && this.aLong181 + (long) this.anInt4816 > this.aLong178) {
				local118 = (int) ((long) this.anInt4816 + this.aLong181 - this.aLong178);
				if (local118 > arg0) {
					local118 = arg0;
				}
				Static363.method4761(this.aByteArray57, (int) (this.aLong178 - this.aLong181), arg2, 0, local118);
				this.aLong178 += local118;
				arg0 -= local118;
				arg1 = local118;
			}
			if (this.aByteArray57.length < arg0) {
				this.aClass212_4.method5534(this.aLong178);
				this.aLong177 = this.aLong178;
				while (arg0 > 0) {
					local118 = this.aClass212_4.method5532(arg2, arg1, arg0);
					if (local118 == -1) {
						break;
					}
					this.aLong178 += local118;
					arg1 += local118;
					arg0 -= local118;
					this.aLong177 += local118;
				}
			} else if (arg0 > 0) {
				this.method3949();
				local118 = arg0;
				if (this.anInt4816 < arg0) {
					local118 = this.anInt4816;
				}
				Static363.method4761(this.aByteArray57, 0, arg2, arg1, local118);
				arg1 += local118;
				arg0 -= local118;
				this.aLong178 += local118;
			}
			if (this.aLong176 != -1L) {
				if (this.aLong178 < this.aLong176 && arg0 > 0) {
					local118 = (int) (this.aLong176 - this.aLong178) + arg1;
					if (arg0 + arg1 < local118) {
						local118 = arg0 + arg1;
					}
					while (arg1 < local118) {
						arg2[arg1++] = 0;
						arg0--;
						this.aLong178++;
					}
				}
				@Pc(305) long local305 = -1L;
				@Pc(307) long local307 = -1L;
				if (this.aLong176 >= local73 && this.aLong176 < (long) local77 + local73) {
					local305 = this.aLong176;
				} else if (this.aLong176 <= local73 && local73 < this.aLong176 + (long) this.anInt4810) {
					local305 = local73;
				}
				if ((long) this.anInt4810 + this.aLong176 > local73 && this.aLong176 + (long) this.anInt4810 <= (long) local77 + local73) {
					local307 = this.aLong176 + (long) this.anInt4810;
				} else if (local73 + (long) local77 > this.aLong176 && this.aLong176 + (long) this.anInt4810 >= (long) local77 + local73) {
					local307 = (long) local77 + local73;
				}
				if (local305 > -1L && local307 > local305) {
					@Pc(426) int local426 = (int) (local307 - local305);
					Static363.method4761(this.aByteArray56, (int) (local305 - this.aLong176), arg2, (int) (local305 - local73), local426);
					if (this.aLong178 < local307) {
						arg0 = (int) ((long) arg0 + this.aLong178 - local307);
						this.aLong178 = local307;
					}
				}
			}
		} catch (@Pc(463) IOException local463) {
			this.aLong177 = -1L;
			throw local463;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[BIB)V")
	public void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong178 > this.aLong179) {
				this.aLong179 = (long) arg0 + this.aLong178;
			}
			if (this.aLong176 != -1L && (this.aLong176 > this.aLong178 || this.aLong176 + (long) this.anInt4810 < this.aLong178)) {
				this.method3961();
			}
			if (this.aLong176 != -1L && (long) this.aByteArray56.length + this.aLong176 < (long) arg0 + this.aLong178) {
				@Pc(90) int local90 = (int) ((long) this.aByteArray56.length + this.aLong176 - this.aLong178);
				Static363.method4761(arg1, arg2, this.aByteArray56, (int) (this.aLong178 - this.aLong176), local90);
				arg0 -= local90;
				this.aLong178 += local90;
				arg2 += local90;
				this.anInt4810 = this.aByteArray56.length;
				this.method3961();
			}
			if (arg0 > this.aByteArray56.length) {
				if (this.aLong177 != this.aLong178) {
					this.aClass212_4.method5534(this.aLong178);
					this.aLong177 = this.aLong178;
				}
				this.aClass212_4.method5530(arg2, arg0, arg1);
				this.aLong177 += arg0;
				if (this.aLong177 > this.aLong180) {
					this.aLong180 = this.aLong177;
				}
				@Pc(173) long local173 = -1L;
				if (this.aLong181 <= this.aLong178 && this.aLong178 < (long) this.anInt4816 + this.aLong181) {
					local173 = this.aLong178;
				} else if (this.aLong178 <= this.aLong181 && this.aLong181 < this.aLong178 + (long) arg0) {
					local173 = this.aLong181;
				}
				@Pc(223) long local223 = -1L;
				if ((long) arg0 + this.aLong178 > this.aLong181 && this.aLong181 + (long) this.anInt4816 >= (long) arg0 + this.aLong178) {
					local223 = (long) arg0 + this.aLong178;
				} else if (this.aLong178 < (long) this.anInt4816 + this.aLong181 && this.aLong181 + (long) this.anInt4816 <= this.aLong178 + (long) arg0) {
					local223 = this.aLong181 + (long) this.anInt4816;
				}
				if (local173 > -1L && local173 < local223) {
					@Pc(307) int local307 = (int) (local223 - local173);
					Static363.method4761(arg1, (int) (local173 + (long) arg2 - this.aLong178), this.aByteArray57, (int) (local173 - this.aLong181), local307);
				}
				this.aLong178 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong176 == -1L) {
					this.aLong176 = this.aLong178;
				}
				Static363.method4761(arg1, arg2, this.aByteArray56, (int) (this.aLong178 - this.aLong176), arg0);
				this.aLong178 += arg0;
				if (this.aLong178 - this.aLong176 > (long) this.anInt4810) {
					this.anInt4810 = (int) (this.aLong178 - this.aLong176);
				}
			}
		} catch (@Pc(390) IOException local390) {
			this.aLong177 = -1L;
			throw local390;
		}
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)J")
	public long method3957() {
		return this.aLong179;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IJ)V")
	public void method3960(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3953());
		}
		this.aLong178 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	private void method3961() throws IOException {
		if (this.aLong176 == -1L) {
			return;
		}
		if (this.aLong177 != this.aLong176) {
			this.aClass212_4.method5534(this.aLong176);
			this.aLong177 = this.aLong176;
		}
		this.aClass212_4.method5530(0, this.anInt4810, this.aByteArray56);
		this.aLong177 += this.anInt4810;
		if (this.aLong177 > this.aLong180) {
			this.aLong180 = this.aLong177;
		}
		@Pc(55) long local55 = -1L;
		if (this.aLong176 >= this.aLong181 && this.aLong181 + (long) this.anInt4816 > this.aLong176) {
			local55 = this.aLong176;
		} else if (this.aLong176 <= this.aLong181 && this.aLong181 < this.aLong176 + (long) this.anInt4810) {
			local55 = this.aLong181;
		}
		@Pc(97) long local97 = -1L;
		if (this.aLong181 < (long) this.anInt4810 + this.aLong176 && (long) this.anInt4810 + this.aLong176 <= (long) this.anInt4816 + this.aLong181) {
			local97 = this.aLong176 + (long) this.anInt4810;
		} else if (this.aLong176 < this.aLong181 + (long) this.anInt4816 && this.aLong181 + (long) this.anInt4816 <= this.aLong176 - -((long) this.anInt4810)) {
			local97 = this.aLong181 + (long) this.anInt4816;
		}
		if (local55 > -1L && local97 > local55) {
			@Pc(190) int local190 = (int) (local97 - local55);
			Static363.method4761(this.aByteArray56, (int) (local55 - this.aLong176), this.aByteArray57, (int) (local55 - this.aLong181), local190);
		}
		this.anInt4810 = 0;
		this.aLong176 = -1L;
	}
}
