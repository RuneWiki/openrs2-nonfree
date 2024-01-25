import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!fca", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17(@OriginalArg(0) int arg0) {
		this.aByteArray59 = Static605.method8021(arg0);
		this.lb = 0;
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "([B)V")
	public Class3_Sub17(@OriginalArg(0) byte[] arg0) {
		this.lb = 0;
		this.aByteArray59 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[BII)V")
	public final void method4832(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg2; local3++) {
			arg0[local3] = this.aByteArray59[this.lb++];
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB)V")
	public final void method4833(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IJI)V")
	public final void method4834(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local6 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray59[this.lb++] = (byte) (int) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(IB)V")
	public final void method4835(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I")
	public final int method4837() {
		@Pc(19) int local19 = this.aByteArray59[this.lb] & 0xFF;
		return local19 < 128 ? this.method4888() - 64 : this.method4858() - 49152;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II[BZ)V")
	public final void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg1; local7++) {
			this.aByteArray59[this.lb++] = arg2[local7];
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)B")
	public final byte method4839() {
		return (byte) (this.aByteArray59[this.lb++] - 128);
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)V")
	public final void method4840(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 + 128);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)I")
	public final int method4841() {
		@Pc(11) int local11 = this.aByteArray59[this.lb] & 0xFF;
		return local11 >= 128 ? this.method4858() - 32768 : this.method4888();
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(Z)J")
	public final long method4842() {
		@Pc(10) long local10 = (long) this.method4852() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4852() & 0xFFFFFFFFL;
		return local10 + (local22 << 32);
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(II)V")
	public final void method4843(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)I")
	public final int method4844() {
		return this.aByteArray59[this.lb++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	public final void method4845() {
		if (this.aByteArray59 != null) {
			Static605.method8022(this.aByteArray59);
		}
		this.aByteArray59 = null;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(II)J")
	public final long method4846(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = local6 * 8;
		@Pc(23) long local23 = 0L;
		while (local21 >= 0) {
			local23 |= ((long) this.aByteArray59[this.lb++] & 0xFFL) << local21;
			local21 -= 8;
		}
		return local23;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method4847() {
		@Pc(6) int local6 = this.lb;
		while (this.aByteArray59[this.lb++] != 0) {
		}
		@Pc(32) int local32 = this.lb - local6 - 1;
		return local32 == 0 ? "" : Static351.method5274(this.aByteArray59, local32, local6);
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(IB)V")
	public final void method4848(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(II)V")
	public final void method4849(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(Z)I")
	public final int method4850() {
		return -this.aByteArray59[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(B)I")
	public final int method4851() {
		this.lb += 4;
		return ((this.aByteArray59[this.lb - 4] & 0xFF) << 8) + (this.aByteArray59[this.lb - 2] << 24 & 0xFF000000) + ((this.aByteArray59[this.lb + -1] & 0xFF) << 16) + (this.aByteArray59[this.lb + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)I")
	public final int method4852() {
		this.lb += 4;
		return ((this.aByteArray59[this.lb - 1] & 0xFF) << 24) + ((this.aByteArray59[this.lb - 2] & 0xFF) << 16) + ((this.aByteArray59[this.lb - 3] & 0xFF) << 8) + (this.aByteArray59[this.lb + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)I")
	public final int method4853() {
		this.lb += 3;
		return ((this.aByteArray59[this.lb - 3] & 0xFF) << 8) + ((this.aByteArray59[this.lb - 2] & 0xFF) << 16) + (this.aByteArray59[this.lb - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(II)V")
	public final void method4854(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(II)V")
	public final void method4855(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(B)I")
	public final int method4856() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17;
		for (local17 = this.method4841(); local17 == 32767; local17 = this.method4841()) {
			local13 += 32767;
		}
		return local13 + local17;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(IB)V")
	public final void method4857(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4849(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4876(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(I)I")
	public final int method4858() {
		this.lb += 2;
		return ((this.aByteArray59[this.lb - 2] & 0xFF) << 8) + (this.aByteArray59[this.lb - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "(I)I")
	public final int method4859() {
		@Pc(16) byte local16 = this.aByteArray59[this.lb++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray59[this.lb++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "(I)Z")
	public final boolean method4860() {
		this.lb -= 4;
		@Pc(17) int local17 = Static462.method6642(this.aByteArray59, this.lb, 0);
		@Pc(23) int local23 = this.method4868();
		return local23 == local17;
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(B)B")
	public final byte method4861() {
		return this.aByteArray59[this.lb++];
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(B)I")
	public final int method4862() {
		this.lb += 3;
		return ((this.aByteArray59[this.lb - 3] & 0xFF) << 16) - (-(this.aByteArray59[this.lb - 2] << 8 & 0xFF00) - (this.aByteArray59[this.lb - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II[IZ)V")
	public final void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = this.lb;
		this.lb = arg0;
		@Pc(24) int local24 = (arg1 - arg0) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method4868();
			@Pc(36) int local36 = this.method4868();
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local32 += arg2[local38 & 0x3] + local38 ^ local36 + (local36 << 4 ^ local36 >>> 5);
				local38 += -1640531527;
				local36 += local38 + arg2[local38 >>> 11 & 0x99200003] ^ (local32 >>> 5 ^ local32 << 4) + local32;
			}
			this.lb -= 8;
			this.method4854(local32);
			this.method4854(local36);
		}
		this.lb = local15;
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(B)I")
	public final int method4864() {
		this.lb += 3;
		@Pc(49) int local49 = (this.aByteArray59[this.lb - 1] & 0xFF) + ((this.aByteArray59[this.lb - 3] & 0xFF) << 16) + ((this.aByteArray59[this.lb + -2] & 0xFF) << 8);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "(B)J")
	public final long method4865() {
		@Pc(10) long local10 = (long) this.method4868() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method4868() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "(I)B")
	public final byte method4866() {
		return (byte) (128 - this.aByteArray59[this.lb++]);
	}

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "(I)I")
	public final int method4867() {
		this.lb += 4;
		return ((this.aByteArray59[this.lb - 1] & 0xFF) << 8) + (((this.aByteArray59[this.lb - 3] & 0xFF) << 24) + ((this.aByteArray59[this.lb - 4] & 0xFF) << 16)) + (this.aByteArray59[this.lb + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "(I)I")
	public final int method4868() {
		this.lb += 4;
		return (this.aByteArray59[this.lb - 1] & 0xFF) + ((this.aByteArray59[this.lb - 2] & 0xFF) << 8) + ((this.aByteArray59[this.lb - 3] & 0xFF) << 16) + ((this.aByteArray59[this.lb + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "(I)I")
	public final int method4869() {
		this.lb += 2;
		@Pc(32) int local32 = ((this.aByteArray59[this.lb - 2] & 0xFF) << 8) + (this.aByteArray59[this.lb - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(II)V")
	public final void method4870(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray59[this.lb - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "(II)V")
	public final void method4871(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "(B)I")
	public final int method4872() {
		this.lb += 2;
		return ((this.aByteArray59[this.lb - 1] & 0xFF) << 8) + (this.aByteArray59[this.lb - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "(II)V")
	public final void method4873(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "(B)I")
	public final int method4874() {
		return 128 - this.aByteArray59[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)V")
	public final void method4875(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "(II)V")
	public final void method4876(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "(I)I")
	public final int method4877() {
		this.lb += 2;
		@Pc(31) int local31 = ((this.aByteArray59[this.lb - 1] & 0xFF) << 8) + (this.aByteArray59[this.lb - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4878(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.lb += Static624.method8249(arg0, this.aByteArray59, arg0.length(), this.lb);
		this.aByteArray59[this.lb++] = 0;
	}

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "(B)I")
	public final int method4879() {
		this.lb += 2;
		return (this.aByteArray59[this.lb - 2] - 128 & 0xFF) + ((this.aByteArray59[this.lb - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "(B)B")
	public final byte method4880() {
		return (byte) -this.aByteArray59[this.lb++];
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method4882(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.lb;
		this.lb = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4832(local12, 0, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.lb = 0;
		this.method4876(local35.length);
		this.method4838(0, local35.length, local35);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4883(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray59[this.lb++] = 0;
		this.lb += Static624.method8249(arg0, this.aByteArray59, arg0.length(), this.lb);
		this.aByteArray59[this.lb++] = 0;
	}

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "(I)I")
	public final int method4884() {
		this.lb += 2;
		return ((this.aByteArray59[this.lb - 2] & 0xFF) << 8) + (this.aByteArray59[this.lb - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "(II)V")
	public final void method4885(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "(II)V")
	public final void method4886(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)V")
	public final void method4887(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "(B)I")
	public final int method4888() {
		return this.aByteArray59[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IJ)V")
	public final void method4889(@OriginalArg(1) long arg0) {
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 56);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 48);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 40);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 32);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 24);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (int) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!fca", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method4890() {
		@Pc(21) byte local21 = this.aByteArray59[this.lb++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.lb;
		while (this.aByteArray59[this.lb++] != 0) {
		}
		@Pc(54) int local54 = this.lb - local31 - 1;
		return local54 == 0 ? "" : Static351.method5274(this.aByteArray59, local54, local31);
	}

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "(I)I")
	public final int method4891() {
		this.lb += 4;
		return ((this.aByteArray59[this.lb - 3] & 0xFF) << 8) + ((this.aByteArray59[this.lb - 2] & 0xFF) << 16) + ((this.aByteArray59[this.lb - 1] & 0xFF) << 24) + (this.aByteArray59[this.lb + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(IB)V")
	public final void method4892(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4849(arg0 >>> 28 | 0x80);
					}
					this.method4849(arg0 >>> 21 | 0x80);
				}
				this.method4849(arg0 >>> 14 | 0x80);
			}
			this.method4849(arg0 >>> 7 | 0x80);
		}
		this.method4849(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "(II)V")
	public final void method4893(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.lb++] = (byte) arg0;
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.lb++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(IZ)I")
	public final int method4894(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static462.method6642(this.aByteArray59, this.lb, arg0);
		this.method4854(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "(II)V")
	public final void method4895(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.lb++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "([IIII)V")
	public final void method4896(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.lb;
		this.lb = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method4868();
			@Pc(34) int local34 = this.method4868();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ local36 + arg0[local36 >>> 11 & 0x3];
				local36 -= -1640531527;
				local30 -= local36 + arg0[local36 & 0x3] ^ local34 + (local34 >>> 5 ^ local34 << 4);
			}
			this.lb -= 8;
			this.method4854(local30);
			this.method4854(local34);
		}
		this.lb = local12;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method4897() {
		if (this.aByteArray59[this.lb] == 0) {
			this.lb++;
			return null;
		} else {
			return this.method4847();
		}
	}
}
