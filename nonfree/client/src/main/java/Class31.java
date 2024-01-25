import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class31 {

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "J")
	private long aLong31 = -1L;

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "J")
	private long aLong35 = -1L;

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
	private int anInt853 = 0;

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "Lclient!bt;")
	private final Class44 aClass44_1;

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!bt;II)V")
	public Class31(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass44_1 = arg0;
		this.aLong33 = this.aLong34 = arg0.method957();
		this.aByteArray9 = new byte[arg2];
		this.aByteArray10 = new byte[arg1];
		this.aLong30 = 0L;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)J")
	public long method751() {
		return this.aLong33;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method752() {
		return this.aClass44_1.method959();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
	public void method753() throws IOException {
		this.method761();
		this.aClass44_1.method960();
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	private void method754() throws IOException {
		this.anInt865 = 0;
		if (this.aLong30 != this.aLong32) {
			this.aClass44_1.method955(this.aLong30);
			this.aLong32 = this.aLong30;
		}
		this.aLong31 = this.aLong30;
		while (this.anInt865 < this.aByteArray10.length) {
			@Pc(45) int local45 = this.aByteArray10.length - this.anInt865;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(62) int local62 = this.aClass44_1.method954(local45, this.anInt865, this.aByteArray10);
			if (local62 == -1) {
				break;
			}
			this.anInt865 += local62;
			this.aLong32 += local62;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(JI)V")
	public void method755(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method752());
		}
		this.aLong30 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([BB)V")
	public void method757(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method760(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[B)V")
	public void method759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong30 > this.aLong33) {
				this.aLong33 = this.aLong30 + (long) arg1;
			}
			if (this.aLong35 != -1L && (this.aLong30 < this.aLong35 || this.aLong30 > (long) this.anInt853 + this.aLong35)) {
				this.method761();
			}
			if (this.aLong35 != -1L && this.aLong30 + (long) arg1 > (long) this.aByteArray9.length + this.aLong35) {
				@Pc(100) int local100 = (int) (this.aLong35 + (long) this.aByteArray9.length - this.aLong30);
				Static649.method4863(arg2, arg0, this.aByteArray9, (int) (this.aLong30 - this.aLong35), local100);
				arg1 -= local100;
				arg0 += local100;
				this.aLong30 += local100;
				this.anInt853 = this.aByteArray9.length;
				this.method761();
			}
			if (arg1 > this.aByteArray9.length) {
				if (this.aLong30 != this.aLong32) {
					this.aClass44_1.method955(this.aLong30);
					this.aLong32 = this.aLong30;
				}
				this.aClass44_1.method956(arg0, arg2, arg1);
				this.aLong32 += arg1;
				if (this.aLong34 < this.aLong32) {
					this.aLong34 = this.aLong32;
				}
				@Pc(186) long local186 = -1L;
				if (this.aLong31 <= this.aLong30 && (long) this.anInt865 + this.aLong31 > this.aLong30) {
					local186 = this.aLong30;
				} else if (this.aLong31 >= this.aLong30 && this.aLong31 < (long) arg1 + this.aLong30) {
					local186 = this.aLong31;
				}
				@Pc(235) long local235 = -1L;
				if ((long) arg1 + this.aLong30 > this.aLong31 && (long) this.anInt865 + this.aLong31 >= this.aLong30 - -((long) arg1)) {
					local235 = this.aLong30 + (long) arg1;
				} else if (this.aLong31 + (long) this.anInt865 > this.aLong30 && this.aLong31 + (long) this.anInt865 <= this.aLong30 + (long) arg1) {
					local235 = this.aLong31 + (long) this.anInt865;
				}
				if (local186 > -1L && local186 < local235) {
					@Pc(319) int local319 = (int) (local235 - local186);
					Static649.method4863(arg2, (int) (local186 + (long) arg0 - this.aLong30), this.aByteArray10, (int) (local186 - this.aLong31), local319);
				}
				this.aLong30 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong35 == -1L) {
					this.aLong35 = this.aLong30;
				}
				Static649.method4863(arg2, arg0, this.aByteArray9, (int) (this.aLong30 - this.aLong35), arg1);
				this.aLong30 += arg1;
				if ((long) this.anInt853 < this.aLong30 - this.aLong35) {
					this.anInt853 = (int) (this.aLong30 - this.aLong35);
				}
			}
		} catch (@Pc(399) IOException local399) {
			this.aLong32 = -1L;
			throw local399;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BB)V")
	public void method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong35 != -1L && this.aLong35 <= this.aLong30 && (long) this.anInt853 + this.aLong35 >= this.aLong30 + (long) arg0) {
				Static649.method4863(this.aByteArray9, (int) (this.aLong30 - this.aLong35), arg2, 0, arg0);
				this.aLong30 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong30;
			@Pc(86) int local86 = arg0;
			@Pc(118) int local118;
			if (this.aLong31 <= this.aLong30 && this.aLong31 + (long) this.anInt865 > this.aLong30) {
				local118 = (int) (this.aLong31 + (long) this.anInt865 - this.aLong30);
				if (local118 > arg0) {
					local118 = arg0;
				}
				Static649.method4863(this.aByteArray10, (int) (this.aLong30 - this.aLong31), arg2, 0, local118);
				arg0 -= local118;
				arg1 = local118;
				this.aLong30 += local118;
			}
			if (arg0 > this.aByteArray10.length) {
				this.aClass44_1.method955(this.aLong30);
				this.aLong32 = this.aLong30;
				while (arg0 > 0) {
					local118 = this.aClass44_1.method954(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					this.aLong30 += local118;
					arg1 += local118;
					arg0 -= local118;
					this.aLong32 += local118;
				}
			} else if (arg0 > 0) {
				this.method754();
				local118 = arg0;
				if (arg0 > this.anInt865) {
					local118 = this.anInt865;
				}
				Static649.method4863(this.aByteArray10, 0, arg2, arg1, local118);
				this.aLong30 += local118;
				arg1 += local118;
				arg0 -= local118;
			}
			if (this.aLong35 != -1L) {
				if (this.aLong30 < this.aLong35 && arg0 > 0) {
					local118 = (int) (this.aLong35 - this.aLong30) + arg1;
					if (local118 > arg0 + arg1) {
						local118 = arg1 + arg0;
					}
					while (local118 > arg1) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong30++;
					}
				}
				@Pc(310) long local310 = -1L;
				@Pc(312) long local312 = -1L;
				if (this.aLong35 >= local82 && (long) local86 + local82 > this.aLong35) {
					local310 = this.aLong35;
				} else if (this.aLong35 <= local82 && local82 < (long) this.anInt853 + this.aLong35) {
					local310 = local82;
				}
				if ((long) this.anInt853 + this.aLong35 > local82 && local82 + (long) local86 >= this.aLong35 - -((long) this.anInt853)) {
					local312 = (long) this.anInt853 + this.aLong35;
				} else if (this.aLong35 < (long) local86 + local82 && (long) this.anInt853 + this.aLong35 >= (long) local86 + local82) {
					local312 = (long) local86 + local82;
				}
				if (local310 > -1L && local312 > local310) {
					@Pc(426) int local426 = (int) (local312 - local310);
					Static649.method4863(this.aByteArray9, (int) (local310 - this.aLong35), arg2, (int) (local310 - local82), local426);
					if (local312 > this.aLong30) {
						arg0 = (int) ((long) arg0 + this.aLong30 - local312);
						this.aLong30 = local312;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong32 = -1L;
			throw local464;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	private void method761() throws IOException {
		if (this.aLong35 == -1L) {
			return;
		}
		if (this.aLong32 != this.aLong35) {
			this.aClass44_1.method955(this.aLong35);
			this.aLong32 = this.aLong35;
		}
		this.aClass44_1.method956(0, this.aByteArray9, this.anInt853);
		this.aLong32 += this.anInt853;
		if (this.aLong32 > this.aLong34) {
			this.aLong34 = this.aLong32;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong31 <= this.aLong35 && this.aLong31 + (long) this.anInt865 > this.aLong35) {
			local61 = this.aLong35;
		} else if (this.aLong31 >= this.aLong35 && this.aLong31 < (long) this.anInt853 + this.aLong35) {
			local61 = this.aLong31;
		}
		@Pc(116) long local116 = -1L;
		if (this.aLong31 < this.aLong35 + (long) this.anInt853 && (long) this.anInt853 + this.aLong35 <= this.aLong31 + (long) this.anInt865) {
			local116 = this.aLong35 + (long) this.anInt853;
		} else if (this.aLong35 < this.aLong31 + (long) this.anInt865 && this.aLong35 + (long) this.anInt853 >= (long) this.anInt865 + this.aLong31) {
			local116 = (long) this.anInt865 + this.aLong31;
		}
		if (local61 > -1L && local61 < local116) {
			@Pc(209) int local209 = (int) (local116 - local61);
			Static649.method4863(this.aByteArray9, (int) (local61 - this.aLong35), this.aByteArray10, (int) (local61 - this.aLong31), local209);
		}
		this.aLong35 = -1L;
		this.anInt853 = 0;
	}
}
