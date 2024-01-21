import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class46 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
	private int anInt2066;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "J")
	private long aLong57 = -1L;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	private int anInt2061 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "J")
	private long aLong54 = -1L;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!tc;")
	private final Class60 aClass60_1;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!tc;II)V")
	public Class46(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass60_1 = arg0;
		this.aLong58 = this.aLong59 = arg0.method1656();
		this.aByteArray14 = new byte[arg1];
		this.aLong56 = 0L;
		this.aByteArray13 = new byte[arg2];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	private void method1315() throws IOException {
		this.anInt2066 = 0;
		if (this.aLong55 != this.aLong56) {
			this.aClass60_1.method1655(this.aLong56);
			this.aLong55 = this.aLong56;
		}
		this.aLong54 = this.aLong56;
		while (this.aByteArray14.length > this.anInt2066) {
			@Pc(46) int local46 = this.aClass60_1.method1654(this.aByteArray14, this.aByteArray14.length - this.anInt2066, this.anInt2066);
			if (local46 == -1) {
				break;
			}
			this.anInt2066 += local46;
			this.aLong55 += local46;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)J")
	public long method1317() {
		return this.aLong58;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public void method1320() throws IOException {
		this.method1322();
		this.aClass60_1.method1658();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)V")
	public void method1321(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong56 = arg0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	private void method1322() throws IOException {
		if (this.aLong57 == -1L) {
			return;
		}
		@Pc(15) long local15 = -1L;
		if (this.aLong57 != this.aLong55) {
			this.aClass60_1.method1655(this.aLong57);
			this.aLong55 = this.aLong57;
		}
		this.aClass60_1.method1653(0, this.aByteArray13, this.anInt2061);
		if (this.aLong57 >= this.aLong54 && this.aLong57 < this.aLong54 + (long) this.anInt2066) {
			local15 = this.aLong57;
		} else if (this.aLong57 <= this.aLong54 && this.aLong57 + (long) this.anInt2061 > this.aLong54) {
			local15 = this.aLong54;
		}
		@Pc(95) long local95 = -1L;
		if ((long) this.anInt2061 + this.aLong57 > this.aLong54 && (long) this.anInt2066 + this.aLong54 >= (long) this.anInt2061 + this.aLong57) {
			local95 = (long) this.anInt2061 + this.aLong57;
		} else if (this.aLong54 + (long) this.anInt2066 > this.aLong57 && (long) this.anInt2061 + this.aLong57 >= this.aLong54 + (long) this.anInt2066) {
			local95 = this.aLong54 + (long) this.anInt2066;
		}
		this.aLong55 += this.anInt2061;
		if (this.aLong59 < this.aLong55) {
			this.aLong59 = this.aLong55;
		}
		if (local15 > -1L && local95 > local15) {
			@Pc(197) int local197 = (int) (local95 - local15);
			Static123.method1270(this.aByteArray13, (int) (local15 - this.aLong57), this.aByteArray14, (int) (local15 - this.aLong54), local197);
		}
		this.aLong57 = -1L;
		this.anInt2061 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIII)V")
	public void method1324(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong57 != -1L && this.aLong57 <= this.aLong56 && this.aLong57 + (long) this.anInt2061 >= this.aLong56 + (long) arg1) {
				Static123.method1270(this.aByteArray13, (int) (this.aLong56 - this.aLong57), arg0, 0, arg1);
				this.aLong56 += arg1;
				return;
			}
			@Pc(77) long local77 = this.aLong56;
			@Pc(79) int local79 = arg1;
			@Pc(108) int local108;
			if (this.aLong56 >= this.aLong54 && this.aLong56 < (long) this.anInt2066 + this.aLong54) {
				local108 = (int) (this.aLong54 + (long) this.anInt2066 - this.aLong56);
				if (local108 > arg1) {
					local108 = arg1;
				}
				Static123.method1270(this.aByteArray14, (int) (this.aLong56 - this.aLong54), arg0, 0, local108);
				this.aLong56 += local108;
				arg2 = local108;
				arg1 -= local108;
			}
			if (this.aByteArray14.length < arg1) {
				this.aClass60_1.method1655(this.aLong56);
				this.aLong55 = this.aLong56;
				while (arg1 > 0) {
					local108 = this.aClass60_1.method1654(arg0, arg1, arg2);
					if (local108 == -1) {
						break;
					}
					this.aLong55 += local108;
					arg1 -= local108;
					this.aLong56 += local108;
					arg2 += local108;
				}
			} else if (arg1 > 0) {
				this.method1315();
				local108 = arg1;
				if (arg1 > this.anInt2066) {
					local108 = this.anInt2066;
				}
				arg1 -= local108;
				Static123.method1270(this.aByteArray14, 0, arg0, arg2, local108);
				this.aLong56 += local108;
				arg2 += local108;
			}
			if (this.aLong57 != -1L) {
				if (this.aLong56 < this.aLong57 && arg1 > 0) {
					local108 = (int) (this.aLong57 - this.aLong56) + arg2;
					if (arg1 + arg2 < local108) {
						local108 = arg1 + arg2;
					}
					while (arg2 < local108) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong56++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (local77 <= this.aLong57 && (long) local79 + local77 > this.aLong57) {
					local311 = this.aLong57;
				} else if (this.aLong57 <= local77 && (long) this.anInt2061 + this.aLong57 > local77) {
					local311 = local77;
				}
				@Pc(358) long local358 = -1L;
				if ((long) this.anInt2061 + this.aLong57 > local77 && (long) local79 + local77 >= (long) this.anInt2061 + this.aLong57) {
					local358 = (long) this.anInt2061 + this.aLong57;
				} else if (this.aLong57 < local77 + (long) local79 && (long) local79 + local77 <= this.aLong57 - -((long) this.anInt2061)) {
					local358 = local77 + (long) local79;
				}
				if (local311 > -1L && local358 > local311) {
					@Pc(437) int local437 = (int) (local358 - local311);
					Static123.method1270(this.aByteArray13, (int) (local311 - this.aLong57), arg0, (int) (local311 - local77), local437);
					if (local358 > this.aLong56) {
						arg1 = (int) ((long) arg1 + this.aLong56 - local358);
						this.aLong56 = local358;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong55 = -1L;
			throw local474;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[B)V")
	public void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong56 + (long) arg1 > this.aLong58) {
				this.aLong58 = this.aLong56 + (long) arg1;
			}
			if (this.aLong57 != -1L && (this.aLong56 < this.aLong57 || this.aLong56 > this.aLong57 + (long) this.anInt2061)) {
				this.method1322();
			}
			if (this.aLong57 != -1L && (long) this.aByteArray13.length + this.aLong57 < (long) arg1 + this.aLong56) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray13.length + this.aLong57 - this.aLong56);
				Static123.method1270(arg2, arg0, this.aByteArray13, (int) (this.aLong56 - this.aLong57), local93);
				arg1 -= local93;
				this.aLong56 += local93;
				arg0 += local93;
				this.anInt2061 = this.aByteArray13.length;
				this.method1322();
			}
			if (this.aByteArray13.length < arg1) {
				if (this.aLong56 != this.aLong55) {
					this.aClass60_1.method1655(this.aLong56);
					this.aLong55 = this.aLong56;
				}
				this.aClass60_1.method1653(arg0, arg2, arg1);
				this.aLong55 += arg1;
				@Pc(165) long local165 = -1L;
				if (this.aLong55 > this.aLong59) {
					this.aLong59 = this.aLong55;
				}
				@Pc(181) long local181 = -1L;
				if (this.aLong54 <= this.aLong56 && this.aLong56 < (long) this.anInt2066 + this.aLong54) {
					local181 = this.aLong56;
				} else if (this.aLong56 <= this.aLong54 && (long) arg1 + this.aLong56 > this.aLong54) {
					local181 = this.aLong54;
				}
				if (this.aLong54 < this.aLong56 + (long) arg1 && (long) this.anInt2066 + this.aLong54 >= this.aLong56 - -((long) arg1)) {
					local165 = (long) arg1 + this.aLong56;
				} else if ((long) this.anInt2066 + this.aLong54 > this.aLong56 && (long) this.anInt2066 + this.aLong54 <= this.aLong56 - -((long) arg1)) {
					local165 = (long) this.anInt2066 + this.aLong54;
				}
				if (local181 > -1L && local165 > local181) {
					@Pc(325) int local325 = (int) (local165 - local181);
					Static123.method1270(arg2, (int) (local181 + (long) arg0 - this.aLong56), this.aByteArray14, (int) (local181 - this.aLong54), local325);
				}
				this.aLong56 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong57 == -1L) {
					this.aLong57 = this.aLong56;
				}
				Static123.method1270(arg2, arg0, this.aByteArray13, (int) (this.aLong56 - this.aLong57), arg1);
				this.aLong56 += arg1;
				if ((long) this.anInt2061 < this.aLong56 - this.aLong57) {
					this.anInt2061 = (int) (this.aLong56 - this.aLong57);
				}
			}
		} catch (@Pc(407) IOException local407) {
			this.aLong55 = -1L;
			throw local407;
		}
	}
}
