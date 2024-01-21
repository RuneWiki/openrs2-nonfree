import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "I")
	public int anInt931;

	@OriginalMember(owner = "client!ne", name = "Kb", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10(@OriginalArg(0) int arg0) {
		this.anInt931 = 0;
		this.aByteArray17 = Static64.method1097(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class4_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
		this.anInt931 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
	public final int method549() {
		this.anInt931 += 4;
		return (this.aByteArray17[this.anInt931 - 1] & 0xFF) + ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8) + ((this.aByteArray17[-4 + this.anInt931] & 0xFF) << 24) + ((this.aByteArray17[this.anInt931 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
	public final int method550() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray17[this.anInt931++]; local25 < 0; local25 = this.aByteArray17[this.anInt931++]) {
			local14 = (local14 | local25 & 0x7F) << 7;
		}
		return local14 | local25;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)I")
	public final int method552() {
		this.anInt931 += 2;
		@Pc(36) int local36 = (this.aByteArray17[this.anInt931 - 2] & 0xFF) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)B")
	public final byte method553() {
		return (byte) (128 - this.aByteArray17[this.anInt931++]);
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)I")
	public final int method554() {
		this.anInt931 += 4;
		return (this.aByteArray17[this.anInt931 - 4] & 0xFF) + (((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 24) - (-((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 16) - ((this.aByteArray17[this.anInt931 - 3] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JI)V")
	public final void method555(@OriginalArg(0) long arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 56);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 48);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 40);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 32);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I")
	public final int method556() {
		this.anInt931 += 4;
		return (this.aByteArray17[this.anInt931 - 2] & 0xFF) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 8) + ((this.aByteArray17[this.anInt931 + -4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt931 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)I")
	public final int method557() {
		this.anInt931 += 4;
		return ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt931 - 4] & 0xFF) << 8) + (this.aByteArray17[this.anInt931 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V")
	public final void method558(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)V")
	public final void method560(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray17[this.anInt931++];
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	public final int method561(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static48.method841(this.anInt931, this.aByteArray17, arg0);
		this.method597(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)V")
	public final void method562(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)I")
	public final int method563() {
		this.anInt931 += 2;
		return (this.aByteArray17[this.anInt931 - 2] - 128 & 0xFF) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public final void method565(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)V")
	public final void method566(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 + 128);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I")
	public final int method568() {
		@Pc(16) int local16 = this.aByteArray17[this.anInt931] & 0xFF;
		return local16 < 128 ? this.method599() : this.method604() - 32768;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method569(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt931;
		this.anInt931 = 0;
		@Pc(18) byte[] local18 = new byte[local6];
		this.method560(local18, local6);
		@Pc(29) BigInteger local29 = new BigInteger(local18);
		@Pc(34) BigInteger local34 = local29.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt931 = 0;
		this.method600(local37.length);
		this.method601(local37, local37.length);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public final void method570(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!v;B)V")
	public final void method571(@OriginalArg(0) Class76 arg0) {
		this.anInt931 += arg0.method1886(this.anInt931, this.aByteArray17, arg0.method1851());
		this.aByteArray17[this.anInt931++] = 0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)I")
	public final int method572() {
		this.anInt931 += 3;
		return ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8) + (((this.aByteArray17[this.anInt931 - 3] & 0xFF) << 16) + (this.aByteArray17[this.anInt931 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[I)V")
	public final void method573(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt931;
		this.anInt931 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = -957401312;
			@Pc(30) int local30 = this.method549();
			@Pc(34) int local34 = this.method549();
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local34 -= arg1[local26 >>> 11 & 0xDE400003] + local26 ^ (local30 >>> 5 ^ local30 << 4) - -local30;
				local26 -= -1640531527;
				local30 -= arg1[local26 & 0x3] + local26 ^ local34 + (local34 >>> 5 ^ local34 << 4);
			}
			this.anInt931 -= 8;
			this.method597(local30);
			this.method597(local34);
		}
		this.anInt931 = local8;
	}

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "(I)I")
	public final int method574() {
		this.anInt931 += 2;
		@Pc(31) int local31 = ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt931 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IB)V")
	public final void method575(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "(I)B")
	public final byte method576() {
		return (byte) (this.aByteArray17[this.anInt931++] - 128);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(BI)V")
	public final void method577(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IZ)V")
	public final void method578(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method600(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method575(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)B")
	public final byte method579() {
		return this.aByteArray17[this.anInt931++];
	}

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "(I)I")
	public final int method580() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt931] & 0xFF;
		return local7 >= 128 ? this.method604() - 49152 : this.method599() + -64;
	}

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "(I)Lclient!v;")
	public final Class76 method581() {
		@Pc(6) int local6 = this.anInt931;
		while (this.aByteArray17[this.anInt931++] != 0) {
		}
		return Static94.method1510(local6, this.aByteArray17, this.anInt931 - local6 - 1);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
	public final void method582(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)V")
	public final void method583(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt931 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "(I)Lclient!v;")
	public final Class76 method585() {
		if (this.aByteArray17[this.anInt931] == 0) {
			this.anInt931++;
			return null;
		} else {
			return this.method581();
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(BI)V")
	public final void method586(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) arg0;
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB[B)V")
	public final void method587(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(16) int local16 = arg0 - 1; local16 >= 0; local16--) {
			arg1[local16] = (byte) (this.aByteArray17[this.anInt931++] - 128);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)V")
	public final void method588(@OriginalArg(0) long arg0) {
		this.method586((int) (arg0 >> 32));
		this.method586((int) arg0);
	}

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "(I)I")
	public final int method589() {
		this.anInt931 += 2;
		return (this.aByteArray17[this.anInt931 - 1] - 128 & 0xFF) + ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(IZ)V")
	public final void method590(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(B)I")
	public final int method591() {
		this.anInt931 += 2;
		@Pc(38) int local38 = ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt931 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(IZ)V")
	public final void method592(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)I")
	public final int method593() {
		this.anInt931 += 2;
		return (this.aByteArray17[this.anInt931 - 2] & 0xFF) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(B)I")
	public final int method594() {
		return this.aByteArray17[this.anInt931++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(B)I")
	public final int method595() {
		this.anInt931 += 3;
		return (this.aByteArray17[this.anInt931 - 2] & 0xFF) + ((this.aByteArray17[this.anInt931 - 1] & 0xFF) << 8) + ((this.aByteArray17[this.anInt931 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "(B)I")
	public final int method596() {
		return -this.aByteArray17[this.anInt931++] & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(II)V")
	public final void method597(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt931++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "(I)I")
	public final int method598() {
		return 128 - this.aByteArray17[this.anInt931++] & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "(B)I")
	public final int method599() {
		return this.aByteArray17[this.anInt931++] & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)V")
	public final void method600(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIII)V")
	public final void method601(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray17[this.anInt931++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(II)V")
	public final void method602(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method600(arg0 >>> 28 | 0x80);
					}
					this.method600(arg0 >>> 21 | 0x80);
				}
				this.method600(arg0 >>> 14 | 0x80);
			}
			this.method600(arg0 >>> 7 | 0x80);
		}
		this.method600(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(II)V")
	public final void method603(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt931++] = (byte) arg0;
		this.aByteArray17[this.anInt931++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "(I)I")
	public final int method604() {
		this.anInt931 += 2;
		return (this.aByteArray17[this.anInt931 - 1] & 0xFF) + ((this.aByteArray17[this.anInt931 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "(B)J")
	public final long method605() {
		@Pc(15) long local15 = (long) this.method549() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method549() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}
}
