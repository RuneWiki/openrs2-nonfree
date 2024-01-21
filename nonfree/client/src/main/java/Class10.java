import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class10 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt309 = 0;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "J")
	private long aLong14 = -1L;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Lclient!kd;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class10(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass56_1 = arg0;
		this.aLong13 = this.aLong16 = arg0.method1744();
		this.aByteArray6 = new byte[arg2];
		this.aByteArray7 = new byte[arg1];
		this.aLong15 = 0L;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	private void method310() throws IOException {
		this.anInt317 = 0;
		if (this.aLong17 != this.aLong15) {
			this.aClass56_1.method1747(this.aLong15);
			this.aLong17 = this.aLong15;
		}
		this.aLong12 = this.aLong15;
		while (this.anInt317 < this.aByteArray7.length) {
			@Pc(51) int local51 = this.aByteArray7.length - this.anInt317;
			if (local51 > 200000000) {
				local51 = 200000000;
			}
			@Pc(68) int local68 = this.aClass56_1.method1742(local51, this.aByteArray7, this.anInt317);
			if (local68 == -1) {
				break;
			}
			this.aLong17 += local68;
			this.anInt317 += local68;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)V")
	public void method312(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method317());
		}
		this.aLong15 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	private void method313() throws IOException {
		if (this.aLong14 == -1L) {
			return;
		}
		@Pc(8) long local8 = -1L;
		@Pc(10) long local10 = -1L;
		if (this.aLong17 != this.aLong14) {
			this.aClass56_1.method1747(this.aLong14);
			this.aLong17 = this.aLong14;
		}
		this.aClass56_1.method1743(this.aByteArray6, 0, this.anInt309);
		if (this.aLong12 < this.aLong14 + (long) this.anInt309 && this.aLong14 + (long) this.anInt309 <= this.aLong12 + (long) this.anInt317) {
			local8 = (long) this.anInt309 + this.aLong14;
		} else if (this.aLong14 < (long) this.anInt317 + this.aLong12 && this.aLong12 + (long) this.anInt317 <= this.aLong14 - -((long) this.anInt309)) {
			local8 = this.aLong12 + (long) this.anInt317;
		}
		this.aLong17 += this.anInt309;
		if (this.aLong14 >= this.aLong12 && this.aLong14 < (long) this.anInt317 + this.aLong12) {
			local10 = this.aLong14;
		} else if (this.aLong12 >= this.aLong14 && (long) this.anInt309 + this.aLong14 > this.aLong12) {
			local10 = this.aLong12;
		}
		if (this.aLong17 > this.aLong16) {
			this.aLong16 = this.aLong17;
		}
		if (local10 > -1L && local10 < local8) {
			@Pc(205) int local205 = (int) (local8 - local10);
			Static214.method348(this.aByteArray6, (int) (local10 - this.aLong14), this.aByteArray7, (int) (local10 - this.aLong12), local205);
		}
		this.aLong14 = -1L;
		this.anInt309 = 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public void method315() throws IOException {
		this.method313();
		this.aClass56_1.method1746();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[B)V")
	public void method316(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method320(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method317() {
		return this.aClass56_1.method1745();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[BB)V")
	public void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong13 < (long) arg0 + this.aLong15) {
				this.aLong13 = (long) arg0 + this.aLong15;
			}
			if (this.aLong14 != -1L && (this.aLong14 > this.aLong15 || this.aLong14 + (long) this.anInt309 < this.aLong15)) {
				this.method313();
			}
			if (this.aLong14 != -1L && (long) arg0 + this.aLong15 > (long) this.aByteArray6.length + this.aLong14) {
				@Pc(92) int local92 = (int) (this.aLong14 + (long) this.aByteArray6.length - this.aLong15);
				Static214.method348(arg2, arg1, this.aByteArray6, (int) (this.aLong15 - this.aLong14), local92);
				arg1 += local92;
				this.aLong15 += local92;
				this.anInt309 = this.aByteArray6.length;
				this.method313();
				arg0 -= local92;
			}
			if (this.aByteArray6.length < arg0) {
				if (this.aLong15 != this.aLong17) {
					this.aClass56_1.method1747(this.aLong15);
					this.aLong17 = this.aLong15;
				}
				this.aClass56_1.method1743(arg2, arg1, arg0);
				this.aLong17 += arg0;
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong12 <= this.aLong15 && this.aLong12 + (long) this.anInt317 > this.aLong15) {
					local173 = this.aLong15;
				} else if (this.aLong12 >= this.aLong15 && this.aLong12 < this.aLong15 + (long) arg0) {
					local173 = this.aLong12;
				}
				if (this.aLong17 > this.aLong16) {
					this.aLong16 = this.aLong17;
				}
				if ((long) arg0 + this.aLong15 > this.aLong12 && this.aLong15 + (long) arg0 <= this.aLong12 + (long) this.anInt317) {
					local175 = (long) arg0 + this.aLong15;
				} else if (this.aLong15 < this.aLong12 + (long) this.anInt317 && (long) this.anInt317 + this.aLong12 <= this.aLong15 - -((long) arg0)) {
					local175 = this.aLong12 + (long) this.anInt317;
				}
				if (local173 > -1L && local173 < local175) {
					@Pc(319) int local319 = (int) (local175 - local173);
					Static214.method348(arg2, (int) (local173 + (long) arg1 - this.aLong15), this.aByteArray7, (int) (local173 - this.aLong12), local319);
				}
				this.aLong15 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong14 == -1L) {
					this.aLong14 = this.aLong15;
				}
				Static214.method348(arg2, arg1, this.aByteArray6, (int) (this.aLong15 - this.aLong14), arg0);
				this.aLong15 += arg0;
				if (this.aLong15 - this.aLong14 > (long) this.anInt309) {
					this.anInt309 = (int) (this.aLong15 - this.aLong14);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong17 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)J")
	public long method319() {
		return this.aLong13;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[BI)V")
	public void method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong14 != -1L && this.aLong15 >= this.aLong14 && this.aLong15 + (long) arg1 <= (long) this.anInt309 + this.aLong14) {
				Static214.method348(this.aByteArray6, (int) (this.aLong15 - this.aLong14), arg2, 0, arg1);
				this.aLong15 += arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong15;
			@Pc(84) int local84 = arg1;
			@Pc(111) int local111;
			if (this.aLong15 >= this.aLong12 && this.aLong12 + (long) this.anInt317 > this.aLong15) {
				local111 = (int) ((long) this.anInt317 + this.aLong12 - this.aLong15);
				if (local111 > arg1) {
					local111 = arg1;
				}
				Static214.method348(this.aByteArray7, (int) (this.aLong15 - this.aLong12), arg2, 0, local111);
				this.aLong15 += local111;
				arg0 = local111;
				arg1 -= local111;
			}
			if (this.aByteArray7.length < arg1) {
				this.aClass56_1.method1747(this.aLong15);
				this.aLong17 = this.aLong15;
				while (arg1 > 0) {
					local111 = this.aClass56_1.method1742(arg1, arg2, arg0);
					if (local111 == -1) {
						break;
					}
					this.aLong17 += local111;
					arg1 -= local111;
					arg0 += local111;
					this.aLong15 += local111;
				}
			} else if (arg1 > 0) {
				this.method310();
				local111 = arg1;
				if (this.anInt317 < arg1) {
					local111 = this.anInt317;
				}
				arg1 -= local111;
				Static214.method348(this.aByteArray7, 0, arg2, arg0, local111);
				arg0 += local111;
				this.aLong15 += local111;
			}
			if (this.aLong14 != -1L) {
				if (this.aLong14 > this.aLong15 && arg1 > 0) {
					local111 = arg0 + (int) (this.aLong14 - this.aLong15);
					if (arg1 + arg0 < local111) {
						local111 = arg0 + arg1;
					}
					while (local111 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong15++;
					}
				}
				@Pc(313) long local313 = -1L;
				@Pc(315) long local315 = -1L;
				if (local80 <= this.aLong14 && local80 + (long) local84 > this.aLong14) {
					local313 = this.aLong14;
				} else if (local80 >= this.aLong14 && this.aLong14 + (long) this.anInt309 > local80) {
					local313 = local80;
				}
				if (this.aLong14 + (long) this.anInt309 > local80 && local80 + (long) local84 >= this.aLong14 - -((long) this.anInt309)) {
					local315 = (long) this.anInt309 + this.aLong14;
				} else if ((long) local84 + local80 > this.aLong14 && (long) local84 + local80 <= this.aLong14 + (long) this.anInt309) {
					local315 = (long) local84 + local80;
				}
				if (local313 > -1L && local315 > local313) {
					@Pc(437) int local437 = (int) (local315 - local313);
					Static214.method348(this.aByteArray6, (int) (local313 - this.aLong14), arg2, (int) (local313 - local80), local437);
					if (this.aLong15 < local315) {
						arg1 = (int) ((long) arg1 + this.aLong15 - local315);
						this.aLong15 = local315;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong17 = -1L;
			throw local475;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
