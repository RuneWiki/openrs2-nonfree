import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	private int anInt212 = 0;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "J")
	private long aLong13 = -1L;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!nb;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!nb;II)V")
	public Class3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass42_1 = arg0;
		this.aLong12 = this.aLong10 = arg0.method1214();
		this.aByteArray8 = new byte[arg1];
		this.aLong11 = 0L;
		this.aByteArray7 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[B)V")
	public void method91(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong13 != -1L && this.aLong13 <= this.aLong11 && (long) arg0 + this.aLong11 <= (long) this.anInt212 + this.aLong13) {
				Static118.method1745(this.aByteArray7, (int) (this.aLong11 - this.aLong13), arg2, 0, arg0);
				this.aLong11 += arg0;
				return;
			}
			@Pc(83) int local83 = arg0;
			@Pc(86) long local86 = this.aLong11;
			@Pc(115) int local115;
			if (this.aLong9 <= this.aLong11 && this.aLong9 + (long) this.anInt219 > this.aLong11) {
				local115 = (int) ((long) this.anInt219 + this.aLong9 - this.aLong11);
				if (local115 > arg0) {
					local115 = arg0;
				}
				Static118.method1745(this.aByteArray8, (int) (this.aLong11 - this.aLong9), arg2, 0, local115);
				arg0 -= local115;
				arg1 = local115;
				this.aLong11 += local115;
			}
			if (arg0 > this.aByteArray8.length) {
				this.aClass42_1.method1217(this.aLong11);
				this.aLong8 = this.aLong11;
				while (arg0 > 0) {
					local115 = this.aClass42_1.method1212(arg1, arg0, arg2);
					if (local115 == -1) {
						break;
					}
					arg1 += local115;
					this.aLong8 += local115;
					arg0 -= local115;
					this.aLong11 += local115;
				}
			} else if (arg0 > 0) {
				local115 = arg0;
				this.method101();
				if (this.anInt219 < arg0) {
					local115 = this.anInt219;
				}
				arg0 -= local115;
				Static118.method1745(this.aByteArray8, 0, arg2, arg1, local115);
				arg1 += local115;
				this.aLong11 += local115;
			}
			if (this.aLong13 != -1L) {
				if (this.aLong13 > this.aLong11 && arg0 > 0) {
					local115 = (int) (this.aLong13 - this.aLong11) + arg1;
					if (local115 > arg1 + arg0) {
						local115 = arg0 + arg1;
					}
					while (arg1 < local115) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong11++;
					}
				}
				@Pc(313) long local313 = -1L;
				if (this.aLong13 >= local86 && this.aLong13 < (long) local83 + local86) {
					local313 = this.aLong13;
				} else if (local86 >= this.aLong13 && local86 < (long) this.anInt212 + this.aLong13) {
					local313 = local86;
				}
				@Pc(349) long local349 = -1L;
				if (local86 < this.aLong13 + (long) this.anInt212 && this.aLong13 + (long) this.anInt212 <= (long) local83 + local86) {
					local349 = this.aLong13 + (long) this.anInt212;
				} else if (this.aLong13 < local86 + (long) local83 && (long) this.anInt212 + this.aLong13 >= local86 - -((long) local83)) {
					local349 = (long) local83 + local86;
				}
				if (local313 > -1L && local313 < local349) {
					@Pc(429) int local429 = (int) (local349 - local313);
					Static118.method1745(this.aByteArray7, (int) (local313 - this.aLong13), arg2, (int) (local313 - local86), local429);
					if (this.aLong11 < local349) {
						arg0 = (int) ((long) arg0 + this.aLong11 - local349);
						this.aLong11 = local349;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong8 = -1L;
			throw local467;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public void method92() throws IOException {
		this.method98();
		this.aClass42_1.method1216();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BII)V")
	public void method93(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong11 + (long) arg0 > this.aLong12) {
				this.aLong12 = (long) arg0 + this.aLong11;
			}
			if ((long) -1 != this.aLong13 && (this.aLong13 > this.aLong11 || this.aLong13 + (long) this.anInt212 < this.aLong11)) {
				this.method98();
			}
			if (this.aLong13 != -1L && (long) arg0 + this.aLong11 > (long) this.aByteArray7.length + this.aLong13) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray7.length + this.aLong13 - this.aLong11);
				Static118.method1745(arg1, arg2, this.aByteArray7, (int) (this.aLong11 - this.aLong13), local89);
				arg0 -= local89;
				this.aLong11 += local89;
				this.anInt212 = this.aByteArray7.length;
				arg2 += local89;
				this.method98();
			}
			if (this.aByteArray7.length < arg0) {
				if (this.aLong11 != this.aLong8) {
					this.aClass42_1.method1217(this.aLong11);
					this.aLong8 = this.aLong11;
				}
				@Pc(156) long local156 = -1L;
				@Pc(158) long local158 = -1L;
				this.aClass42_1.method1215(arg2, arg1, arg0);
				this.aLong8 += arg0;
				if (this.aLong11 >= this.aLong9 && this.aLong11 < (long) this.anInt219 + this.aLong9) {
					local156 = this.aLong11;
				} else if (this.aLong9 >= this.aLong11 && this.aLong9 < this.aLong11 + (long) arg0) {
					local156 = this.aLong9;
				}
				if (this.aLong9 < (long) arg0 + this.aLong11 && (long) arg0 + this.aLong11 <= (long) this.anInt219 + this.aLong9) {
					local158 = (long) arg0 + this.aLong11;
				} else if ((long) this.anInt219 + this.aLong9 > this.aLong11 && this.aLong9 + (long) this.anInt219 <= this.aLong11 - -((long) arg0)) {
					local158 = (long) this.anInt219 + this.aLong9;
				}
				if (this.aLong10 < this.aLong8) {
					this.aLong10 = this.aLong8;
				}
				if (local156 > -1L && local156 < local158) {
					@Pc(317) int local317 = (int) (local158 - local156);
					Static118.method1745(arg1, (int) ((long) arg2 + local156 - this.aLong11), this.aByteArray8, (int) (local156 - this.aLong9), local317);
				}
				this.aLong11 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong13 == -1L) {
					this.aLong13 = this.aLong11;
				}
				Static118.method1745(arg1, arg2, this.aByteArray7, (int) (this.aLong11 - this.aLong13), arg0);
				this.aLong11 += arg0;
				if ((long) this.anInt212 < this.aLong11 - this.aLong13) {
					this.anInt212 = (int) (this.aLong11 - this.aLong13);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong8 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)J")
	public long method96() {
		return this.aLong12;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	private void method98() throws IOException {
		if (this.aLong13 == -1L) {
			return;
		}
		@Pc(17) long local17 = -1L;
		if (this.aLong8 != this.aLong13) {
			this.aClass42_1.method1217(this.aLong13);
			this.aLong8 = this.aLong13;
		}
		this.aClass42_1.method1215(0, this.aByteArray7, this.anInt212);
		this.aLong8 += this.anInt212;
		@Pc(56) long local56 = -1L;
		if (this.aLong9 < (long) this.anInt212 + this.aLong13 && this.aLong13 + (long) this.anInt212 <= (long) this.anInt219 + this.aLong9) {
			local56 = (long) this.anInt212 + this.aLong13;
		} else if (this.aLong13 < (long) this.anInt219 + this.aLong9 && (long) this.anInt219 + this.aLong9 <= this.aLong13 + (long) this.anInt212) {
			local56 = (long) this.anInt219 + this.aLong9;
		}
		if (this.aLong10 < this.aLong8) {
			this.aLong10 = this.aLong8;
		}
		if (this.aLong9 <= this.aLong13 && this.aLong13 < (long) this.anInt219 + this.aLong9) {
			local17 = this.aLong13;
		} else if (this.aLong9 >= this.aLong13 && this.aLong9 < this.aLong13 + (long) this.anInt212) {
			local17 = this.aLong9;
		}
		if (local17 > -1L && local56 > local17) {
			@Pc(205) int local205 = (int) (local56 - local17);
			Static118.method1745(this.aByteArray7, (int) (local17 - this.aLong13), this.aByteArray8, (int) (local17 - this.aLong9), local205);
		}
		this.anInt212 = 0;
		this.aLong13 = -1L;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)V")
	public void method99(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong11 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	private void method101() throws IOException {
		this.anInt219 = 0;
		if (this.aLong8 != this.aLong11) {
			this.aClass42_1.method1217(this.aLong11);
			this.aLong8 = this.aLong11;
		}
		this.aLong9 = this.aLong11;
		while (this.aByteArray8.length > this.anInt219) {
			@Pc(52) int local52 = this.aClass42_1.method1212(this.anInt219, this.aByteArray8.length - this.anInt219, this.aByteArray8);
			if (local52 == -1) {
				break;
			}
			this.anInt219 += local52;
			this.aLong8 += local52;
		}
	}
}
