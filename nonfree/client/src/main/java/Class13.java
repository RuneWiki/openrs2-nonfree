import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class13 {

	@OriginalMember(owner = "client!d", name = "r", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	private int anInt576;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	private int anInt564 = 0;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "J")
	private long aLong18 = -1L;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "J")
	private long aLong15 = -1L;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!be;")
	private final Class8 aClass8_1;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!be;II)V")
	public Class13(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass8_1 = arg0;
		this.aLong14 = this.aLong20 = arg0.method264();
		this.aLong16 = 0L;
		this.aByteArray5 = new byte[arg2];
		this.aByteArray6 = new byte[arg1];
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	private void method371() throws IOException {
		if (this.aLong18 == -1L) {
			return;
		}
		if (this.aLong17 != this.aLong18) {
			this.aClass8_1.method265(this.aLong18);
			this.aLong17 = this.aLong18;
		}
		@Pc(35) long local35 = -1L;
		this.aClass8_1.method267(0, this.anInt564, this.aByteArray5);
		this.aLong17 += this.anInt564;
		if (this.aLong18 >= this.aLong15 && this.aLong18 < (long) this.anInt576 + this.aLong15) {
			local35 = this.aLong18;
		} else if (this.aLong18 <= this.aLong15 && this.aLong18 + (long) this.anInt564 > this.aLong15) {
			local35 = this.aLong15;
		}
		@Pc(99) long local99 = -1L;
		if ((long) this.anInt564 + this.aLong18 > this.aLong15 && (long) this.anInt576 + this.aLong15 >= this.aLong18 - -((long) this.anInt564)) {
			local99 = (long) this.anInt564 + this.aLong18;
		} else if ((long) this.anInt576 + this.aLong15 > this.aLong18 && this.aLong18 + (long) this.anInt564 >= (long) this.anInt576 + this.aLong15) {
			local99 = (long) this.anInt576 + this.aLong15;
		}
		if (this.aLong17 > this.aLong20) {
			this.aLong20 = this.aLong17;
		}
		if (local35 > -1L && local35 < local99) {
			@Pc(199) int local199 = (int) (local99 - local35);
			Static112.method491(this.aByteArray5, (int) (local35 - this.aLong18), this.aByteArray6, (int) (local35 - this.aLong15), local199);
		}
		this.aLong18 = -1L;
		this.anInt564 = 0;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method373() throws IOException {
		this.method371();
		this.aClass8_1.method266();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B[BII)V")
	public void method374(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong16 + (long) arg1 > this.aLong14) {
				this.aLong14 = (long) arg1 + this.aLong16;
			}
			if (this.aLong18 != -1L && (this.aLong16 < this.aLong18 || this.aLong16 > (long) this.anInt564 + this.aLong18)) {
				this.method371();
			}
			if (this.aLong18 != -1L && (long) arg1 + this.aLong16 > this.aLong18 + (long) this.aByteArray5.length) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray5.length + this.aLong18 - this.aLong16);
				arg1 -= local87;
				Static112.method491(arg0, arg2, this.aByteArray5, (int) (this.aLong16 - this.aLong18), local87);
				arg2 += local87;
				this.aLong16 += local87;
				this.anInt564 = this.aByteArray5.length;
				this.method371();
			}
			if (this.aByteArray5.length < arg1) {
				if (this.aLong16 != this.aLong17) {
					this.aClass8_1.method265(this.aLong16);
					this.aLong17 = this.aLong16;
				}
				@Pc(150) long local150 = -1L;
				this.aClass8_1.method267(arg2, arg1, arg0);
				if (this.aLong15 <= this.aLong16 && this.aLong15 + (long) this.anInt576 > this.aLong16) {
					local150 = this.aLong16;
				} else if (this.aLong16 <= this.aLong15 && this.aLong15 < (long) arg1 + this.aLong16) {
					local150 = this.aLong15;
				}
				this.aLong17 += arg1;
				if (this.aLong20 < this.aLong17) {
					this.aLong20 = this.aLong17;
				}
				@Pc(232) long local232 = -1L;
				if (this.aLong15 < (long) arg1 + this.aLong16 && (long) this.anInt576 + this.aLong15 >= this.aLong16 + (long) arg1) {
					local232 = (long) arg1 + this.aLong16;
				} else if ((long) this.anInt576 + this.aLong15 > this.aLong16 && (long) arg1 + this.aLong16 >= this.aLong15 - -((long) this.anInt576)) {
					local232 = this.aLong15 + (long) this.anInt576;
				}
				if (local150 > -1L && local150 < local232) {
					@Pc(321) int local321 = (int) (local232 - local150);
					Static112.method491(arg0, (int) ((long) arg2 + local150 - this.aLong16), this.aByteArray6, (int) (local150 - this.aLong15), local321);
				}
				this.aLong16 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong18 == -1L) {
					this.aLong18 = this.aLong16;
				}
				Static112.method491(arg0, arg2, this.aByteArray5, (int) (this.aLong16 - this.aLong18), arg1);
				this.aLong16 += arg1;
				if (this.aLong16 - this.aLong18 > (long) this.anInt564) {
					this.anInt564 = (int) (this.aLong16 - this.aLong18);
				}
			}
		} catch (@Pc(409) IOException local409) {
			this.aLong17 = -1L;
			throw local409;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)J")
	public long method375() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	private void method377() throws IOException {
		this.anInt576 = 0;
		if (this.aLong17 != this.aLong16) {
			this.aClass8_1.method265(this.aLong16);
			this.aLong17 = this.aLong16;
		}
		this.aLong15 = this.aLong16;
		while (this.aByteArray6.length > this.anInt576) {
			@Pc(58) int local58 = this.aClass8_1.method262(this.aByteArray6.length - this.anInt576, this.anInt576, this.aByteArray6);
			if (local58 == -1) {
				break;
			}
			this.anInt576 += local58;
			this.aLong17 += local58;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZII[B)V")
	public void method379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong18 != -1L && this.aLong18 <= this.aLong16 && (long) this.anInt564 + this.aLong18 >= this.aLong16 - -((long) arg0)) {
				Static112.method491(this.aByteArray5, (int) (this.aLong16 - this.aLong18), arg2, 0, arg0);
				this.aLong16 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong16;
			@Pc(86) int local86 = arg0;
			@Pc(119) int local119;
			if (this.aLong16 >= this.aLong15 && this.aLong15 + (long) this.anInt576 > this.aLong16) {
				local119 = (int) (this.aLong15 + (long) this.anInt576 - this.aLong16);
				if (arg0 < local119) {
					local119 = arg0;
				}
				Static112.method491(this.aByteArray6, (int) (this.aLong16 - this.aLong15), arg2, 0, local119);
				this.aLong16 += local119;
				arg1 = local119;
				arg0 -= local119;
			}
			if (arg0 > this.aByteArray6.length) {
				this.aClass8_1.method265(this.aLong16);
				this.aLong17 = this.aLong16;
				while (arg0 > 0) {
					local119 = this.aClass8_1.method262(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					arg0 -= local119;
					this.aLong17 += local119;
					arg1 += local119;
					this.aLong16 += local119;
				}
			} else if (arg0 > 0) {
				this.method377();
				local119 = arg0;
				if (this.anInt576 < arg0) {
					local119 = this.anInt576;
				}
				Static112.method491(this.aByteArray6, 0, arg2, arg1, local119);
				this.aLong16 += local119;
				arg0 -= local119;
				arg1 += local119;
			}
			if (this.aLong18 != -1L) {
				if (this.aLong16 < this.aLong18 && arg0 > 0) {
					local119 = (int) (this.aLong18 - this.aLong16) + arg1;
					if (arg0 + arg1 < local119) {
						local119 = arg1 + arg0;
					}
					while (arg1 < local119) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong16++;
					}
				}
				@Pc(313) long local313 = -1L;
				if (this.aLong18 >= local82 && this.aLong18 < local82 + (long) local86) {
					local313 = this.aLong18;
				} else if (local82 >= this.aLong18 && (long) this.anInt564 + this.aLong18 > local82) {
					local313 = local82;
				}
				@Pc(358) long local358 = -1L;
				if (this.aLong18 + (long) this.anInt564 > local82 && (long) local86 + local82 >= (long) this.anInt564 + this.aLong18) {
					local358 = this.aLong18 + (long) this.anInt564;
				} else if ((long) local86 + local82 > this.aLong18 && (long) local86 + local82 <= this.aLong18 + (long) this.anInt564) {
					local358 = local82 + (long) local86;
				}
				if (local313 > -1L && local313 < local358) {
					@Pc(447) int local447 = (int) (local358 - local313);
					Static112.method491(this.aByteArray5, (int) (local313 - this.aLong18), arg2, (int) (local313 - local82), local447);
					if (local358 > this.aLong16) {
						arg0 = (int) ((long) arg0 + this.aLong16 - local358);
						this.aLong16 = local358;
					}
				}
			}
		} catch (@Pc(489) IOException local489) {
			this.aLong17 = -1L;
			throw local489;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZJ)V")
	public void method381(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong16 = arg0;
		}
	}
}
