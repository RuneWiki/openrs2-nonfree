import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!sl", name = "xb", descriptor = "I")
	public int anInt4736;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3(@OriginalArg(0) int arg0) {
		this.anInt4736 = 0;
		this.aByteArray54 = Static337.method5474(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray54 = arg0;
		this.anInt4736 = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[III)V")
	public final void method4200(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.anInt4736;
		this.anInt4736 = arg2;
		@Pc(24) int local24 = (arg1 - arg2) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method4207();
			@Pc(36) int local36 = this.method4207();
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local32 += (local36 << 4 ^ local36 >>> 5) + local36 ^ arg0[local38 & 0x3] + local38;
				local38 += -1640531527;
				local36 += local32 + (local32 << 4 ^ local32 >>> 5) ^ local38 + arg0[local38 >>> 11 & 0xC0000003];
			}
			this.anInt4736 -= 8;
			this.method4265(local32);
			this.method4265(local36);
		}
		this.anInt4736 = local15;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
	public final void method4201(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
	public final void method4202(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IB)V")
	public final void method4203(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public final int method4204() {
		this.anInt4736 += 3;
		return (this.aByteArray54[this.anInt4736 - 1] & 0xFF) + (((this.aByteArray54[this.anInt4736 - 3] & 0xFF) << 16) + ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BII)V")
	public final void method4205(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray54[this.anInt4736++] - 128);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I[BII)V")
	public final void method4206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg1; local3++) {
			arg0[local3] = this.aByteArray54[this.anInt4736++];
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I")
	public final int method4207() {
		this.anInt4736 += 4;
		return ((this.aByteArray54[this.anInt4736 - 3] & 0xFF) << 16) + ((this.aByteArray54[this.anInt4736 - 4] & 0xFF) << 24) + ((this.aByteArray54[this.anInt4736 + -2] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V")
	public final void method4208(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	public final int method4209() {
		this.anInt4736 += 2;
		@Pc(37) int local37 = ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I")
	public final int method4210() {
		this.anInt4736 += 4;
		return ((this.aByteArray54[this.anInt4736 - 4] & 0xFF) << 16) + (this.aByteArray54[this.anInt4736 - 3] << 24 & 0xFF000000) + ((this.aByteArray54[this.anInt4736 + -1] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)J")
	public final long method4212() {
		@Pc(15) long local15 = (long) this.method4262() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4262() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V")
	public final void method4213(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4220(arg0 >>> 28 | 0x80);
					}
					this.method4220(arg0 >>> 21 | 0x80);
				}
				this.method4220(arg0 >>> 14 | 0x80);
			}
			this.method4220(arg0 >>> 7 | 0x80);
		}
		this.method4220(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V")
	public final void method4214(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4220(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4201(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method4215() {
		@Pc(14) byte local14 = this.aByteArray54[this.anInt4736++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt4736;
		while (this.aByteArray54[this.anInt4736++] != 0) {
		}
		@Pc(50) int local50 = this.anInt4736 - local27 - 1;
		return local50 == 0 ? "" : Static89.method2004(this.aByteArray54, local50, local27);
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(II)V")
	public final void method4216(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)I")
	public final int method4217() {
		this.anInt4736 += 3;
		return (this.aByteArray54[this.anInt4736 - 2] & 0xFF) + ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 8) + ((this.aByteArray54[this.anInt4736 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(II)V")
	public final void method4218(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)I")
	public final int method4219() {
		@Pc(22) byte local22 = this.aByteArray54[this.anInt4736++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local22 & 0x7F | local24) << 7;
			local22 = this.aByteArray54[this.anInt4736++];
		}
		return local22 | local24;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(IB)V")
	public final void method4220(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)I")
	public final int method4221() {
		this.anInt4736 += 2;
		return ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)I")
	public final int method4222() {
		this.anInt4736 += 2;
		return ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)I")
	public final int method4223() {
		this.anInt4736 += 4;
		return ((this.aByteArray54[this.anInt4736 - 3] & 0xFF) << 8) + ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 24) + ((this.aByteArray54[this.anInt4736 + -2] & 0xFF) << 16) + (this.aByteArray54[this.anInt4736 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)I")
	public final int method4224() {
		this.anInt4736 += 4;
		return ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 16) + ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 24) + ((this.aByteArray54[this.anInt4736 + -4] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)I")
	public final int method4225() {
		return this.aByteArray54[this.anInt4736++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(IB)V")
	public final void method4226(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(II)V")
	public final void method4227(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "(I)I")
	public final int method4228() {
		@Pc(16) int local16 = this.aByteArray54[this.anInt4736] & 0xFF;
		return local16 < 128 ? this.method4225() : this.method4221() - 32768;
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(I)V")
	public final void method4229() {
		if (this.aByteArray54 != null) {
			Static337.method5476(this.aByteArray54);
		}
		this.aByteArray54 = null;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)I")
	public final int method4231() {
		this.anInt4736 += 2;
		return (this.aByteArray54[this.anInt4736 - 1] - 128 & 0xFF) + ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
	public final void method4232(@OriginalArg(1) int arg0) {
		this.aByteArray54[this.anInt4736 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray54[this.anInt4736 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method4233() {
		@Pc(13) int local13 = this.anInt4736;
		while (this.aByteArray54[this.anInt4736++] != 0) {
		}
		@Pc(33) int local33 = this.anInt4736 - local13 - 1;
		return local33 == 0 ? "" : Static89.method2004(this.aByteArray54, local33, local13);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4234(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4736;
		this.anInt4736 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4206(local12, local6, 0);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt4736 = 0;
		this.method4201(local35.length);
		this.method4237(0, local35, local35.length);
	}

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "(I)I")
	public final int method4235() {
		this.anInt4736 += 2;
		@Pc(33) int local33 = (this.aByteArray54[this.anInt4736 - 2] - 128 & 0xFF) + ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "(I)I")
	public final int method4236() {
		this.anInt4736 += 2;
		return ((this.aByteArray54[this.anInt4736 - 1] & 0xFF) << 8) + (this.aByteArray54[this.anInt4736 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BBI)V")
	public final void method4237(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg0; local7 < arg2 + arg0; local7++) {
			this.aByteArray54[this.anInt4736++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(B)I")
	public final int method4238() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method4228(); local11 == 32767; local11 = this.method4228()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "(I)B")
	public final byte method4239() {
		return (byte) -this.aByteArray54[this.anInt4736++];
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(II)V")
	public final void method4240(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method4241(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4736 += Static42.method1354(this.aByteArray54, arg0.length(), this.anInt4736, arg0);
		this.aByteArray54[this.anInt4736++] = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(JII)V")
	public final void method4242(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> local29);
		}
	}

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "(I)I")
	public final int method4243() {
		return this.aByteArray54[this.anInt4736++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(II)V")
	public final void method4244(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "(I)B")
	public final byte method4245() {
		return (byte) (128 - this.aByteArray54[this.anInt4736++]);
	}

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "(I)J")
	public final long method4246() {
		@Pc(18) long local18 = (long) this.method4207() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method4207() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "(I)I")
	public final int method4247() {
		this.anInt4736 += 3;
		@Pc(44) int local44 = ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 8) + ((this.aByteArray54[this.anInt4736 - 3] & 0xFF) << 16) + (this.aByteArray54[this.anInt4736 + -1] & 0xFF);
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(II)V")
	public final void method4248(@OriginalArg(1) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4249(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray54[this.anInt4736++] = 0;
		this.anInt4736 += Static42.method1354(this.aByteArray54, arg0.length(), this.anInt4736, arg0);
		this.aByteArray54[this.anInt4736++] = 0;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(B)B")
	public final byte method4250() {
		return (byte) (this.aByteArray54[this.anInt4736++] - 128);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BJ)V")
	public final void method4251(@OriginalArg(1) long arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 56);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 48);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 40);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 32);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI[I)V")
	public final void method4252(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt4736;
		this.anInt4736 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method4207();
			@Pc(30) int local30 = this.method4207();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg1[local32 >>> 11 & 0x8AC00003] + local32 ^ (local26 >>> 5 ^ local26 << 4) + local26;
				local32 -= -1640531527;
				local26 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ local32 + arg1[local32 & 0x3];
			}
			this.anInt4736 -= 8;
			this.method4265(local26);
			this.method4265(local30);
		}
		this.anInt4736 = local8;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(IB)V")
	public final void method4253(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 + 128);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "(I)B")
	public final byte method4254() {
		return this.aByteArray54[this.anInt4736++];
	}

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "(II)J")
	public final long method4255(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray54[this.anInt4736++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "(I)Ljava/lang/String;")
	public final String method4256() {
		if (this.aByteArray54[this.anInt4736] == 0) {
			this.anInt4736++;
			return null;
		} else {
			return this.method4233();
		}
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(IB)V")
	public final void method4257(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(II)I")
	public final int method4258(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static365.method5964(this.aByteArray54, arg0, this.anInt4736);
		this.method4265(local16);
		return local16;
	}

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "(I)I")
	public final int method4259() {
		return -this.aByteArray54[this.anInt4736++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "(I)Z")
	public final boolean method4260() {
		this.anInt4736 -= 4;
		@Pc(17) int local17 = Static365.method5964(this.aByteArray54, 0, this.anInt4736);
		@Pc(21) int local21 = this.method4207();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IZ)V")
	public final void method4261(@OriginalArg(0) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(B)I")
	public final int method4262() {
		this.anInt4736 += 4;
		return ((this.aByteArray54[this.anInt4736 - 3] & 0xFF) << 8) + ((this.aByteArray54[this.anInt4736 - 2] & 0xFF) << 16) + ((this.aByteArray54[this.anInt4736 + -1] & 0xFF) << 24) + (this.aByteArray54[this.anInt4736 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(B)I")
	public final int method4263() {
		return 128 - this.aByteArray54[this.anInt4736++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "(I)I")
	public final int method4264() {
		@Pc(16) int local16 = this.aByteArray54[this.anInt4736] & 0xFF;
		return local16 >= 128 ? this.method4221() - 49152 : this.method4225() + -64;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(BI)V")
	public final void method4265(@OriginalArg(1) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(BI)V")
	public final void method4266(@OriginalArg(1) int arg0) {
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 16);
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 24);
		this.aByteArray54[this.anInt4736++] = (byte) arg0;
		this.aByteArray54[this.anInt4736++] = (byte) (arg0 >> 8);
	}
}
