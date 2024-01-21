import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public class Class10_Sub10 extends Class10 {

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
	public int anInt1957;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V")
	public Class10_Sub10(@OriginalArg(0) int arg0) {
		this.aByteArray9 = Static96.method1513(arg0);
		this.anInt1957 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class10_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
		this.anInt1957 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
	public final int method1109() {
		return 128 - this.aByteArray9[this.anInt1957++] & 0xFF;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)I")
	public final int method1110() {
		this.anInt1957 += 2;
		@Pc(38) int local38 = ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)I")
	public final int method1111() {
		return this.aByteArray9[this.anInt1957++] & 0xFF;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
	public final int method1112() {
		this.anInt1957 += 4;
		return (this.aByteArray9[this.anInt1957 - 1] & 0xFF) + ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 8) + ((this.aByteArray9[this.anInt1957 + -4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1957 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	public final void method1113(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	public final void method1114(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)I")
	public final int method1115() {
		this.anInt1957 += 4;
		return (this.aByteArray9[this.anInt1957 - 2] & 0xFF) + ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 8) + ((this.aByteArray9[this.anInt1957 + -3] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1957 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!va;B)V")
	public final void method1116(@OriginalArg(0) Class61 arg0) {
		this.anInt1957 += arg0.method1607(this.aByteArray9, arg0.method1596(), this.anInt1957);
		this.aByteArray9[this.anInt1957++] = 0;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)I")
	public final int method1117() {
		this.anInt1957 += 2;
		@Pc(28) int local28 = ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 - 1] & 0xFF);
		if (local28 > 32767) {
			local28 -= 65536;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[B)V")
	public final void method1118(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray9[this.anInt1957++];
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
	public final int method1119() {
		this.anInt1957 += 2;
		return (this.aByteArray9[this.anInt1957 - 2] & 0xFF) + ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)I")
	public final int method1120() {
		this.anInt1957 += 4;
		return ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1957 - 4] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I")
	public final int method1121() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt1957] & 0xFF;
		return local7 < 128 ? this.method1111() - 64 : this.method1160() + -49152;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)I")
	public final int method1122() {
		@Pc(7) int local7 = 0;
		@Pc(18) byte local18;
		for (local18 = this.aByteArray9[this.anInt1957++]; local18 < 0; local18 = this.aByteArray9[this.anInt1957++]) {
			local7 = (local18 & 0x7F | local7) << 7;
		}
		return local18 | local7;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)I")
	public final int method1124() {
		this.anInt1957 += 2;
		@Pc(38) int local38 = (this.aByteArray9[this.anInt1957 - 2] - 128 & 0xFF) + ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZJ)V")
	public final void method1125(@OriginalArg(1) long arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 56);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 48);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 40);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 32);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
	public final void method1126(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)I")
	public final int method1127() {
		this.anInt1957 += 4;
		return (this.aByteArray9[this.anInt1957 - 4] & 0xFF) + ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1957 + -1] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1957 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI[II)V")
	public final void method1128(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt1957;
		this.anInt1957 = 5;
		@Pc(16) int local16 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(28) int local28 = this.method1112();
			@Pc(30) int local30 = -957401312;
			@Pc(36) int local36 = this.method1112();
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local36 -= local30 + arg1[local30 >>> 11 & 0x3] ^ local28 + (local28 << 4 ^ local28 >>> 5);
				local30 -= -1640531527;
				local28 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ local30 - -arg1[local30 & 0x3];
			}
			this.anInt1957 -= 8;
			this.method1157(local28);
			this.method1157(local36);
		}
		this.anInt1957 = local6;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	public final void method1129(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
	public final void method1130(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(Z)B")
	public final byte method1131() {
		return this.aByteArray9[this.anInt1957++];
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(B)I")
	public final int method1132() {
		this.anInt1957 += 2;
		return (this.aByteArray9[this.anInt1957 - 2] - 128 & 0xFF) + ((this.aByteArray9[this.anInt1957 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(Z)B")
	public final byte method1133() {
		return (byte) (this.aByteArray9[this.anInt1957++] - 128);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(Z)I")
	public final int method1135() {
		return this.aByteArray9[this.anInt1957++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(Z)I")
	public final int method1136() {
		@Pc(12) int local12 = this.aByteArray9[this.anInt1957] & 0xFF;
		return local12 >= 128 ? this.method1160() - 32768 : this.method1111();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
	public final void method1137(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)I")
	public final int method1138() {
		this.anInt1957 += 3;
		return ((this.aByteArray9[this.anInt1957 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BIZI)V")
	public final void method1139(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray9[this.anInt1957++] - 128);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
	public final void method1140(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)I")
	public final int method1141() {
		this.anInt1957 += 2;
		return ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)B")
	public final byte method1142() {
		return (byte) (128 - this.aByteArray9[this.anInt1957++]);
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "(Z)I")
	public final int method1143() {
		return -this.aByteArray9[this.anInt1957++] & 0xFF;
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)J")
	public final long method1144() {
		@Pc(18) long local18 = (long) this.method1112() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method1112() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(B)I")
	public final int method1145() {
		this.anInt1957 += 3;
		return ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1957 - 3] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(II)V")
	public final void method1146(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 + 128);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(II)V")
	public final void method1147(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method1148(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt1957;
		this.anInt1957 = 0;
		@Pc(8) byte[] local8 = new byte[local2];
		this.method1118(local2, local8);
		@Pc(23) BigInteger local23 = new BigInteger(local8);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local28.toByteArray();
		this.anInt1957 = 0;
		this.method1126(local36.length);
		this.method1158(local36, local36.length);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
	public final void method1150(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)Lclient!va;")
	public final Class61 method1151() {
		@Pc(2) int local2 = this.anInt1957;
		while (this.aByteArray9[this.anInt1957++] != 0) {
		}
		return Static81.method1276(this.aByteArray9, this.anInt1957 - local2 - 1, local2);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V")
	public final void method1152(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(II)V")
	public final void method1154(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IZ)V")
	public final void method1155(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1126(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1152(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(BI)V")
	public final void method1157(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BII)V")
	public final void method1158(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray9[this.anInt1957++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
	public final void method1159(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1957++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1957++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "(I)I")
	public final int method1160() {
		this.anInt1957 += 2;
		return ((this.aByteArray9[this.anInt1957 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt1957 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(BI)I")
	public final int method1161(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static78.method1233(arg0, this.anInt1957, this.aByteArray9);
		this.method1157(local16);
		return local16;
	}
}
