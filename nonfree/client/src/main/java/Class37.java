import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class37 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "J")
	private long aLong45 = -1L;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt1458 = 0;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "J")
	private long aLong49 = -1L;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!tb;")
	private final Class59 aClass59_3;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[B")
	private final byte[] aByteArray12;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class37(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass59_3 = arg0;
		this.aLong50 = this.aLong48 = arg0.method1760();
		this.aByteArray11 = new byte[arg2];
		this.aLong46 = 0L;
		this.aByteArray12 = new byte[arg1];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	private void method1068() throws IOException {
		this.anInt1465 = 0;
		if (this.aLong46 != this.aLong47) {
			this.aClass59_3.method1755(this.aLong46);
			this.aLong47 = this.aLong46;
		}
		this.aLong49 = this.aLong46;
		while (this.aByteArray12.length > this.anInt1465) {
			@Pc(46) int local46 = this.aClass59_3.method1759(this.aByteArray12, this.aByteArray12.length - this.anInt1465, this.anInt1465);
			if (local46 == -1) {
				break;
			}
			this.anInt1465 += local46;
			this.aLong47 += local46;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BIII)V")
	public void method1069(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong45 != -1L && this.aLong46 >= this.aLong45 && this.aLong46 + (long) arg2 <= (long) this.anInt1458 + this.aLong45) {
				Static117.method1761(this.aByteArray11, (int) (this.aLong46 - this.aLong45), arg0, 0, arg2);
				this.aLong46 += arg2;
				return;
			}
			@Pc(70) long local70 = this.aLong46;
			@Pc(72) int local72 = arg2;
			@Pc(109) int local109;
			if (this.aLong49 <= this.aLong46 && this.aLong46 < this.aLong49 + (long) this.anInt1465) {
				local109 = (int) (this.aLong49 + (long) this.anInt1465 - this.aLong46);
				if (local109 > arg2) {
					local109 = arg2;
				}
				Static117.method1761(this.aByteArray12, (int) (this.aLong46 - this.aLong49), arg0, 0, local109);
				arg1 = local109;
				this.aLong46 += local109;
				arg2 -= local109;
			}
			if (arg2 > this.aByteArray12.length) {
				this.aClass59_3.method1755(this.aLong46);
				this.aLong47 = this.aLong46;
				while (arg2 > 0) {
					local109 = this.aClass59_3.method1759(arg0, arg2, arg1);
					if (local109 == -1) {
						break;
					}
					this.aLong46 += local109;
					arg1 += local109;
					this.aLong47 += local109;
					arg2 -= local109;
				}
			} else if (arg2 > 0) {
				local109 = arg2;
				this.method1068();
				if (arg2 > this.anInt1465) {
					local109 = this.anInt1465;
				}
				arg2 -= local109;
				Static117.method1761(this.aByteArray12, 0, arg0, arg1, local109);
				arg1 += local109;
				this.aLong46 += local109;
			}
			if (this.aLong45 != -1L) {
				if (this.aLong46 < this.aLong45 && arg2 > 0) {
					local109 = arg1 + (int) (this.aLong45 - this.aLong46);
					if (arg2 + arg1 < local109) {
						local109 = arg2 + arg1;
					}
					while (local109 > arg1) {
						arg0[arg1++] = 0;
						this.aLong46++;
						arg2--;
					}
				}
				@Pc(309) long local309 = -1L;
				if (this.aLong45 >= local70 && (long) local72 + local70 > this.aLong45) {
					local309 = this.aLong45;
				} else if (local70 >= this.aLong45 && local70 < (long) this.anInt1458 + this.aLong45) {
					local309 = local70;
				}
				@Pc(353) long local353 = -1L;
				if ((long) this.anInt1458 + this.aLong45 > local70 && (long) local72 + local70 >= (long) this.anInt1458 + this.aLong45) {
					local353 = this.aLong45 + (long) this.anInt1458;
				} else if (this.aLong45 < local70 + (long) local72 && (long) this.anInt1458 + this.aLong45 >= (long) local72 + local70) {
					local353 = local70 + (long) local72;
				}
				if (local309 > -1L && local309 < local353) {
					@Pc(436) int local436 = (int) (local353 - local309);
					Static117.method1761(this.aByteArray11, (int) (local309 - this.aLong45), arg0, (int) (local309 - local70), local436);
					if (local353 > this.aLong46) {
						arg2 = (int) ((long) arg2 + this.aLong46 - local353);
						this.aLong46 = local353;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong47 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public void method1070() throws IOException {
		this.method1076();
		this.aClass59_3.method1757();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V")
	public void method1072(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong46 = arg0;
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)J")
	public long method1075() {
		return this.aLong50;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	private void method1076() throws IOException {
		if (this.aLong45 == -1L) {
			return;
		}
		if (this.aLong47 != this.aLong45) {
			this.aClass59_3.method1755(this.aLong45);
			this.aLong47 = this.aLong45;
		}
		this.aClass59_3.method1758(0, this.aByteArray11, this.anInt1458);
		this.aLong47 += this.anInt1458;
		if (this.aLong47 > this.aLong48) {
			this.aLong48 = this.aLong47;
		}
		@Pc(58) long local58 = -1L;
		if (this.aLong49 < this.aLong45 + (long) this.anInt1458 && this.aLong45 + (long) this.anInt1458 <= (long) this.anInt1465 + this.aLong49) {
			local58 = (long) this.anInt1458 + this.aLong45;
		} else if ((long) this.anInt1465 + this.aLong49 > this.aLong45 && (long) this.anInt1458 + this.aLong45 >= (long) this.anInt1465 + this.aLong49) {
			local58 = (long) this.anInt1465 + this.aLong49;
		}
		@Pc(129) long local129 = -1L;
		if (this.aLong49 <= this.aLong45 && this.aLong49 + (long) this.anInt1465 > this.aLong45) {
			local129 = this.aLong45;
		} else if (this.aLong45 <= this.aLong49 && this.aLong49 < this.aLong45 + (long) this.anInt1458) {
			local129 = this.aLong49;
		}
		if (local129 > -1L && local58 > local129) {
			@Pc(196) int local196 = (int) (local58 - local129);
			Static117.method1761(this.aByteArray11, (int) (local129 - this.aLong45), this.aByteArray12, (int) (local129 - this.aLong49), local196);
		}
		this.anInt1458 = 0;
		this.aLong45 = -1L;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[BI)V")
	public void method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong50 < this.aLong46 + (long) arg1) {
				this.aLong50 = this.aLong46 + (long) arg1;
			}
			if (this.aLong45 != -1L && (this.aLong45 > this.aLong46 || this.aLong46 > this.aLong45 + (long) this.anInt1458)) {
				this.method1076();
			}
			if (this.aLong45 != -1L && this.aLong46 + (long) arg1 > this.aLong45 - -((long) this.aByteArray11.length)) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray11.length + this.aLong45 - this.aLong46);
				Static117.method1761(arg2, arg0, this.aByteArray11, (int) (this.aLong46 - this.aLong45), local92);
				this.aLong46 += local92;
				arg0 += local92;
				arg1 -= local92;
				this.anInt1458 = this.aByteArray11.length;
				this.method1076();
			}
			if (arg1 > this.aByteArray11.length) {
				if (this.aLong46 != this.aLong47) {
					this.aClass59_3.method1755(this.aLong46);
					this.aLong47 = this.aLong46;
				}
				this.aClass59_3.method1758(arg0, arg2, arg1);
				this.aLong47 += arg1;
				@Pc(180) long local180 = -1L;
				@Pc(182) long local182 = -1L;
				if (this.aLong49 <= this.aLong46 && this.aLong49 + (long) this.anInt1465 > this.aLong46) {
					local182 = this.aLong46;
				} else if (this.aLong46 <= this.aLong49 && this.aLong49 < this.aLong46 + (long) arg1) {
					local182 = this.aLong49;
				}
				if (this.aLong47 > this.aLong48) {
					this.aLong48 = this.aLong47;
				}
				if ((long) arg1 + this.aLong46 > this.aLong49 && this.aLong49 + (long) this.anInt1465 >= (long) arg1 + this.aLong46) {
					local180 = (long) arg1 + this.aLong46;
				} else if (this.aLong46 < this.aLong49 + (long) this.anInt1465 && (long) arg1 + this.aLong46 >= (long) this.anInt1465 + this.aLong49) {
					local180 = (long) this.anInt1465 + this.aLong49;
				}
				if (local182 > -1L && local182 < local180) {
					@Pc(329) int local329 = (int) (local180 - local182);
					Static117.method1761(arg2, (int) ((long) arg0 + local182 - this.aLong46), this.aByteArray12, (int) (local182 - this.aLong49), local329);
				}
				this.aLong46 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong45 == -1L) {
					this.aLong45 = this.aLong46;
				}
				Static117.method1761(arg2, arg0, this.aByteArray11, (int) (this.aLong46 - this.aLong45), arg1);
				this.aLong46 += arg1;
				if (this.aLong46 - this.aLong45 > (long) this.anInt1458) {
					this.anInt1458 = (int) (this.aLong46 - this.aLong45);
				}
			}
		} catch (@Pc(415) IOException local415) {
			this.aLong47 = -1L;
			throw local415;
		}
	}
}
