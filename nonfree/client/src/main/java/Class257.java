import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class257 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	private int anInt7196;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	private int anInt7197 = 0;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "J")
	private long aLong198 = -1L;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "J")
	private long aLong200 = -1L;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_1;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!bi;II)V")
	public Class257(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass31_1 = arg0;
		this.aLong196 = this.aLong199 = arg0.method1003();
		this.aByteArray92 = new byte[arg1];
		this.aByteArray91 = new byte[arg2];
		this.aLong197 = 0L;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public void method5932() throws IOException {
		this.method5940();
		this.aClass31_1.method1007();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5933() {
		return this.aClass31_1.method1008();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIII)V")
	public void method5934(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong200 != -1L && this.aLong197 >= this.aLong200 && (long) arg2 + this.aLong197 <= this.aLong200 + (long) this.anInt7197) {
				Static601.method2938(this.aByteArray91, (int) (this.aLong197 - this.aLong200), arg0, 0, arg2);
				this.aLong197 += arg2;
				return;
			}
			@Pc(86) long local86 = this.aLong197;
			@Pc(90) int local90 = arg2;
			@Pc(122) int local122;
			if (this.aLong197 >= this.aLong198 && (long) this.anInt7196 + this.aLong198 > this.aLong197) {
				local122 = (int) ((long) this.anInt7196 + this.aLong198 - this.aLong197);
				if (local122 > arg2) {
					local122 = arg2;
				}
				Static601.method2938(this.aByteArray92, (int) (this.aLong197 - this.aLong198), arg0, 0, local122);
				arg1 = local122;
				this.aLong197 += local122;
				arg2 -= local122;
			}
			if (arg2 > this.aByteArray92.length) {
				this.aClass31_1.method1001(this.aLong197);
				this.aLong195 = this.aLong197;
				while (arg2 > 0) {
					local122 = this.aClass31_1.method1004(arg1, arg0, arg2);
					if (local122 == -1) {
						break;
					}
					arg2 -= local122;
					arg1 += local122;
					this.aLong197 += local122;
					this.aLong195 += local122;
				}
			} else if (arg2 > 0) {
				this.method5936();
				local122 = arg2;
				if (this.anInt7196 < arg2) {
					local122 = this.anInt7196;
				}
				Static601.method2938(this.aByteArray92, 0, arg0, arg1, local122);
				this.aLong197 += local122;
				arg1 += local122;
				arg2 -= local122;
			}
			if (this.aLong200 != -1L) {
				if (this.aLong197 < this.aLong200 && arg2 > 0) {
					local122 = (int) (this.aLong200 - this.aLong197) + arg1;
					if (local122 > arg2 + arg1) {
						local122 = arg1 + arg2;
					}
					while (arg1 < local122) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong197++;
					}
				}
				@Pc(307) long local307 = -1L;
				@Pc(309) long local309 = -1L;
				if (this.aLong200 >= local86 && (long) local90 + local86 > this.aLong200) {
					local307 = this.aLong200;
				} else if (this.aLong200 <= local86 && this.aLong200 + (long) this.anInt7197 > local86) {
					local307 = local86;
				}
				if (local86 < (long) this.anInt7197 + this.aLong200 && local86 + (long) local90 >= (long) this.anInt7197 + this.aLong200) {
					local309 = (long) this.anInt7197 + this.aLong200;
				} else if (this.aLong200 < (long) local90 + local86 && (long) local90 + local86 <= this.aLong200 + (long) this.anInt7197) {
					local309 = (long) local90 + local86;
				}
				if (local307 > -1L && local307 < local309) {
					@Pc(433) int local433 = (int) (local309 - local307);
					Static601.method2938(this.aByteArray91, (int) (local307 - this.aLong200), arg0, (int) (local307 - local86), local433);
					if (local309 > this.aLong197) {
						arg2 = (int) ((long) arg2 + this.aLong197 - local309);
						this.aLong197 = local309;
					}
				}
			}
		} catch (@Pc(470) IOException local470) {
			this.aLong195 = -1L;
			throw local470;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BI)V")
	public void method5935(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5934(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	private void method5936() throws IOException {
		this.anInt7196 = 0;
		if (this.aLong195 != this.aLong197) {
			this.aClass31_1.method1001(this.aLong197);
			this.aLong195 = this.aLong197;
		}
		this.aLong198 = this.aLong197;
		while (this.anInt7196 < this.aByteArray92.length) {
			@Pc(44) int local44 = this.aByteArray92.length - this.anInt7196;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(59) int local59 = this.aClass31_1.method1004(this.anInt7196, this.aByteArray92, local44);
			if (local59 == -1) {
				break;
			}
			this.aLong195 += local59;
			this.anInt7196 += local59;
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)J")
	public long method5937() {
		return this.aLong196;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIBI)V")
	public void method5939(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong197 > this.aLong196) {
				this.aLong196 = (long) arg1 + this.aLong197;
			}
			if (this.aLong200 != -1L && (this.aLong200 > this.aLong197 || this.aLong197 > (long) this.anInt7197 + this.aLong200)) {
				this.method5940();
			}
			if (this.aLong200 != -1L && this.aLong197 + (long) arg1 > (long) this.aByteArray91.length + this.aLong200) {
				@Pc(90) int local90 = (int) (this.aLong200 + (long) this.aByteArray91.length - this.aLong197);
				Static601.method2938(arg0, arg2, this.aByteArray91, (int) (this.aLong197 - this.aLong200), local90);
				arg2 += local90;
				arg1 -= local90;
				this.aLong197 += local90;
				this.anInt7197 = this.aByteArray91.length;
				this.method5940();
			}
			if (arg1 > this.aByteArray91.length) {
				if (this.aLong197 != this.aLong195) {
					this.aClass31_1.method1001(this.aLong197);
					this.aLong195 = this.aLong197;
				}
				this.aClass31_1.method1005(arg0, arg1, arg2);
				this.aLong195 += arg1;
				if (this.aLong195 > this.aLong199) {
					this.aLong199 = this.aLong195;
				}
				@Pc(180) long local180 = -1L;
				if (this.aLong197 >= this.aLong198 && (long) this.anInt7196 + this.aLong198 > this.aLong197) {
					local180 = this.aLong197;
				} else if (this.aLong198 >= this.aLong197 && this.aLong198 < (long) arg1 + this.aLong197) {
					local180 = this.aLong198;
				}
				@Pc(233) long local233 = -1L;
				if (this.aLong198 < (long) arg1 + this.aLong197 && this.aLong198 + (long) this.anInt7196 >= this.aLong197 + (long) arg1) {
					local233 = this.aLong197 + (long) arg1;
				} else if (this.aLong198 + (long) this.anInt7196 > this.aLong197 && this.aLong198 + (long) this.anInt7196 <= (long) arg1 + this.aLong197) {
					local233 = (long) this.anInt7196 + this.aLong198;
				}
				if (local180 > -1L && local233 > local180) {
					@Pc(316) int local316 = (int) (local233 - local180);
					Static601.method2938(arg0, (int) (local180 + (long) arg2 - this.aLong197), this.aByteArray92, (int) (local180 - this.aLong198), local316);
				}
				this.aLong197 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong200 == -1L) {
					this.aLong200 = this.aLong197;
				}
				Static601.method2938(arg0, arg2, this.aByteArray91, (int) (this.aLong197 - this.aLong200), arg1);
				this.aLong197 += arg1;
				if (this.aLong197 - this.aLong200 > (long) this.anInt7197) {
					this.anInt7197 = (int) (this.aLong197 - this.aLong200);
				}
			}
		} catch (@Pc(399) IOException local399) {
			this.aLong195 = -1L;
			throw local399;
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
	private void method5940() throws IOException {
		if (this.aLong200 == (long) -1) {
			return;
		}
		if (this.aLong200 != this.aLong195) {
			this.aClass31_1.method1001(this.aLong200);
			this.aLong195 = this.aLong200;
		}
		this.aClass31_1.method1005(this.aByteArray91, this.anInt7197, 0);
		this.aLong195 += this.anInt7197;
		if (this.aLong199 < this.aLong195) {
			this.aLong199 = this.aLong195;
		}
		@Pc(60) long local60 = -1L;
		if (this.aLong198 <= this.aLong200 && this.aLong198 + (long) this.anInt7196 > this.aLong200) {
			local60 = this.aLong200;
		} else if (this.aLong200 <= this.aLong198 && (long) this.anInt7197 + this.aLong200 > this.aLong198) {
			local60 = this.aLong198;
		}
		@Pc(119) long local119 = -1L;
		if ((long) this.anInt7197 + this.aLong200 > this.aLong198 && (long) this.anInt7196 + this.aLong198 >= this.aLong200 - -((long) this.anInt7197)) {
			local119 = (long) this.anInt7197 + this.aLong200;
		} else if ((long) this.anInt7196 + this.aLong198 > this.aLong200 && (long) this.anInt7196 + this.aLong198 <= this.aLong200 - -((long) this.anInt7197)) {
			local119 = this.aLong198 + (long) this.anInt7196;
		}
		if (local60 > -1L && local119 > local60) {
			@Pc(207) int local207 = (int) (local119 - local60);
			Static601.method2938(this.aByteArray91, (int) (local60 - this.aLong200), this.aByteArray92, (int) (local60 - this.aLong198), local207);
		}
		this.aLong200 = -1L;
		this.anInt7197 = 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IJ)V")
	public void method5941(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5933());
		}
		this.aLong197 = arg0;
	}
}
