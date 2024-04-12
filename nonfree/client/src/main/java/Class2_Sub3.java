import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!qc;")
	public static Class47 aClass47_23 = new Class47(64);

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!o;")
	public static Class40 aClass40_734 = Static12.method257("backbase1");

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "Lclient!o;")
	public static Class40 aClass40_735 = Static12.method257("Side panel redrawn");

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
	public static int anInt2590 = -1;

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt2585 = -1;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_738 = Static12.method257("Jun");

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lclient!o;")
	public static Class40 aClass40_736 = Static12.method257("Import ready");

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Lclient!o;")
	public static Class40 aClass40_737 = Static12.method257("Loaded input handler");

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public int anInt2546;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)V", line = 5)
	public final void method1680(@OriginalArg(1) long arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 56);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 48);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 40);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 32);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)I", line = 23)
	public final int method1681() {
		this.anInt2546 += 2;
		return ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2546 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIBI)V", line = 34)
	public final void method1682(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aByteArray24[this.anInt2546++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!o;B)V", line = 52)
	public final void method1683(@OriginalArg(0) Class40 arg0) {
		this.anInt2546 += arg0.method1191(this.aByteArray24, arg0.method1169(), this.anInt2546);
		this.aByteArray24[this.anInt2546++] = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[II)V", line = 69)
	public final void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt2546;
		this.anInt2546 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method1728();
			@Pc(29) int local29 = this.method1728();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local25 + (local25 << 4 ^ local25 >>> 5) ^ arg1[local31 >>> 11 & 0x3] + local31;
				local31 -= -1640531527;
				local25 -= local31 + arg1[local31 & 0x3] ^ (local29 << 4 ^ local29 >>> 5) + local29;
			}
			this.anInt2546 -= 8;
			this.method1725(local25);
			this.method1725(local29);
		}
		this.anInt2546 = local8;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V", line = 116)
	public final void method1685(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2546;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt2546 = 0;
		this.method1709(local6, local9);
		@Pc(27) BigInteger local27 = new BigInteger(local9);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt2546 = 0;
		this.method1703(local35.length);
		this.method1682(local35, local35.length);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 143)
	public final void method1686(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I", line = 158)
	public final int method1687(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static18.method371(arg0, this.aByteArray24, this.anInt2546);
		this.method1725(local16);
		return local16;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 172)
	public final void method1688(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)B", line = 212)
	public final byte method1690() {
		return (byte) (128 - this.aByteArray24[this.anInt2546++]);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)B", line = 226)
	public final byte method1691() {
		return (byte) -this.aByteArray24[this.anInt2546++];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII)V", line = 242)
	public final void method1692(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = arg1 - 1; local14 >= 0; local14--) {
			arg0[local14] = this.aByteArray24[this.anInt2546++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)I", line = 259)
	public final int method1693() {
		this.anInt2546 += 2;
		@Pc(33) int local33 = (this.aByteArray24[this.anInt2546 - 1] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)V", line = 282)
	public final void method1694(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 769666216);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 292)
	public final void method1695(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1703(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1694(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)B", line = 329)
	public final byte method1696() {
		return this.aByteArray24[this.anInt2546++];
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)V", line = 344)
	public final void method1697(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)I", line = 358)
	public final int method1698() {
		@Pc(12) int local12 = this.aByteArray24[this.anInt2546] & 0xFF;
		return local12 < 128 ? this.method1708() : this.method1704() - 32768;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I", line = 377)
	public final int method1699() {
		@Pc(16) int local16 = this.aByteArray24[this.anInt2546] & 0xFF;
		return local16 >= 128 ? this.method1704() - 49152 : this.method1708() + -64;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I", line = 532)
	public final int method1701() {
		this.anInt2546 += 2;
		@Pc(36) int local36 = (this.aByteArray24[this.anInt2546 - 1] & 0xFF) + ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)V", line = 550)
	public final void method1702(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(II)V", line = 562)
	public final void method1703(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I", line = 580)
	public final int method1704() {
		this.anInt2546 += 2;
		return (this.aByteArray24[this.anInt2546 - 1] & 0xFF) + ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)I", line = 593)
	public final int method1705() {
		this.anInt2546 += 2;
		return ((this.aByteArray24[this.anInt2546 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2546 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(Z)I", line = 605)
	public final int method1706() {
		return this.aByteArray24[this.anInt2546++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(II)V", line = 621)
	public final void method1707(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 + 128);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)I", line = 633)
	public final int method1708() {
		return this.aByteArray24[this.anInt2546++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V", line = 650)
	public final void method1709(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray24[this.anInt2546++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)I", line = 668)
	public final int method1710() {
		this.anInt2546 += 4;
		return (this.aByteArray24[this.anInt2546 - 2] & 0xFF) + ((this.aByteArray24[this.anInt2546 - 3] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2546 - 4] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2546 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(II)V", line = 682)
	public final void method1711(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V", line = 695)
	public final void method1712(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 831)
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray24 = Static42.method803(arg0);
		this.anInt2546 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(I)I", line = 842)
	public final int method1714() {
		this.anInt2546 += 2;
		return (this.aByteArray24[this.anInt2546 - 2] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2546 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(I)I", line = 854)
	public final int method1715() {
		return 128 - this.aByteArray24[this.anInt2546++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZI)V", line = 864)
	public final void method1716(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(I)J", line = 875)
	public final long method1717() {
		@Pc(18) long local18 = (long) this.method1728() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method1728() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(I)I", line = 891)
	public final int method1718() {
		this.anInt2546 += 3;
		return ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2546 - 3] << 16 & 0xFF0000) + (this.aByteArray24[this.anInt2546 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Z)I", line = 904)
	public final int method1719() {
		this.anInt2546 += 2;
		@Pc(37) int local37 = ((this.aByteArray24[this.anInt2546 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2546 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(II)V", line = 923)
	public final void method1720(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)Lclient!o;", line = 935)
	public final Class40 method1721() {
		@Pc(13) int local13 = this.anInt2546;
		while (this.aByteArray24[this.anInt2546++] != 0) {
		}
		return Static64.method1114(this.anInt2546 - local13 - 1, this.aByteArray24, local13);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V", line = 954)
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anInt2546 = 0;
		this.aByteArray24 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(II)V", line = 965)
	public final void method1722(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Z)I", line = 983)
	public final int method1723() {
		this.anInt2546 += 2;
		@Pc(38) int local38 = ((this.aByteArray24[this.anInt2546 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2546 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(I)I", line = 1005)
	public final int method1724() {
		@Pc(12) byte local12 = this.aByteArray24[this.anInt2546++];
		@Pc(18) int local18 = 0;
		while (local12 < 0) {
			local18 = (local18 | local12 & 0x7F) << 7;
			local12 = this.aByteArray24[this.anInt2546++];
		}
		return local18 | local12;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V", line = 1028)
	public final void method1725(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> -2147393384);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2546++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2546++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)I", line = 1109)
	public final int method1728() {
		this.anInt2546 += 4;
		return (this.aByteArray24[this.anInt2546 - 1] & 0xFF) + (((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2546 - 4] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2546 - 3] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(I)I", line = 1122)
	public final int method1729() {
		this.anInt2546 += 4;
		return (this.aByteArray24[this.anInt2546 - 4] & 0xFF) + ((this.aByteArray24[this.anInt2546 - 3] & 0xFF) << 8) + ((this.aByteArray24[-1 + this.anInt2546] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2546 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)I", line = 1140)
	public final int method1730() {
		return -this.aByteArray24[this.anInt2546++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)V", line = 1159)
	public final void method1731(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2546 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(I)I", line = 1181)
	public final int method1732() {
		this.anInt2546 += 4;
		return (this.aByteArray24[this.anInt2546 - 3] & 0xFF) + ((this.aByteArray24[this.anInt2546 - 2] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2546 + -1] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2546 + -4] & 0xFF) << 8);
	}
}
