import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!gw", name = "ab", descriptor = "I")
	public int anInt3400;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt3400 = 0;
		this.aByteArray45 = Static396.method5972(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "([B)V")
	public Class1_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
		this.anInt3400 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)J")
	public final long method3015() {
		@Pc(15) long local15 = (long) this.method3037() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method3037() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	public final int method3016() {
		return 128 - this.aByteArray45[this.anInt3400++] & 0xFF;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)I")
	public final int method3017() {
		this.anInt3400 += 2;
		@Pc(33) int local33 = (this.aByteArray45[this.anInt3400 - 1] - 128 & 0xFF) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BIII)V")
	public final void method3018(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = (byte) (this.aByteArray45[this.anInt3400++] - 128);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
	public final void method3019(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 + 128);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)V")
	public final void method3020(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)V")
	public final void method3021(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
	public final int method3022() {
		this.anInt3400 += 2;
		@Pc(33) int local33 = (this.aByteArray45[this.anInt3400 - 2] - 128 & 0xFF) + ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(II)V")
	public final void method3023(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Z")
	public final boolean method3025() {
		this.anInt3400 -= 4;
		@Pc(17) int local17 = Static309.method5132(this.aByteArray45, 0, this.anInt3400);
		@Pc(28) int local28 = this.method3037();
		return local17 == local28;
	}

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "(I)I")
	public final int method3026() {
		this.anInt3400 += 4;
		return ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 24) + ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 16) + ((this.aByteArray45[this.anInt3400 + -4] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "(I)I")
	public final int method3027() {
		this.anInt3400 += 2;
		return ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(II)V")
	public final void method3028(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
	public final int method3029() {
		this.anInt3400 += 4;
		return (this.aByteArray45[this.anInt3400 - 2] & 0xFF) + ((this.aByteArray45[this.anInt3400 - 3] & 0xFF) << 24) + ((this.aByteArray45[this.anInt3400 + -4] & 0xFF) << 16) + ((this.aByteArray45[this.anInt3400 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method3030(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = Static520.method7422(arg0);
		this.aByteArray45[this.anInt3400++] = 0;
		this.method3045(local15);
		this.anInt3400 += Static349.method5561(arg0, this.aByteArray45, this.anInt3400);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method3031(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3400;
		this.anInt3400 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3071(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local28.toByteArray();
		this.anInt3400 = 0;
		this.method3038(local37.length);
		this.method3041(local37, local37.length);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)I")
	public final int method3032() {
		@Pc(14) byte local14 = this.aByteArray45[this.anInt3400++];
		@Pc(24) int local24 = 0;
		while (local14 < 0) {
			local24 = (local24 | local14 & 0x7F) << 7;
			local14 = this.aByteArray45[this.anInt3400++];
		}
		return local24 | local14;
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "(II)J")
	public final long method3033(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local4 * 8;
		@Pc(32) long local32 = 0L;
		while (local22 >= 0) {
			local32 |= ((long) this.aByteArray45[this.anInt3400++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method3034() {
		@Pc(6) int local6 = this.anInt3400;
		while (this.aByteArray45[this.anInt3400++] != 0) {
		}
		@Pc(33) int local33 = this.anInt3400 - local6 - 1;
		return local33 == 0 ? "" : Static475.method6888(local6, this.aByteArray45, local33);
	}

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "(I)I")
	public final int method3035() {
		this.anInt3400 += 2;
		return ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IJ)V")
	public final void method3036(@OriginalArg(1) long arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 56);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 48);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 40);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 32);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "(I)I")
	public final int method3037() {
		this.anInt3400 += 4;
		return ((this.aByteArray45[this.anInt3400 - 3] & 0xFF) << 16) + (this.aByteArray45[this.anInt3400 - 4] << 24 & 0xFF000000) + ((this.aByteArray45[this.anInt3400 + -2] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "(II)V")
	public final void method3038(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)I")
	public final int method3039() {
		this.anInt3400 += 3;
		return (this.aByteArray45[this.anInt3400 - 1] & 0xFF) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8) + ((this.aByteArray45[this.anInt3400 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "(I)I")
	public final int method3040() {
		this.anInt3400 += 3;
		@Pc(48) int local48 = ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8) + ((this.aByteArray45[this.anInt3400 - 3] & 0xFF) << 16) + (this.aByteArray45[this.anInt3400 + -1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BIBI)V")
	public final void method3041(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray45[this.anInt3400++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method3042() {
		@Pc(19) byte local19 = this.aByteArray45[this.anInt3400++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method3032();
		if (this.aByteArray45.length < this.anInt3400 + local30) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(51) String local51 = Static521.method7435(this.anInt3400, this.aByteArray45, local30);
		this.anInt3400 += local30;
		return local51;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)I")
	public final int method3043() {
		return this.aByteArray45[this.anInt3400++] & 0xFF;
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "(B)B")
	public final byte method3044() {
		return (byte) -this.aByteArray45[this.anInt3400++];
	}

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "(II)V")
	public final void method3045(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3060(arg0 >>> 28 | 0x80);
					}
					this.method3060(arg0 >>> 21 | 0x80);
				}
				this.method3060(arg0 >>> 14 | 0x80);
			}
			this.method3060(arg0 >>> 7 | 0x80);
		}
		this.method3060(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V")
	public final void method3046(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3060(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3038(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(BI)V")
	public final void method3047(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "(I)I")
	public final int method3049() {
		this.anInt3400 += 4;
		return ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 24) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 16) + ((this.aByteArray45[this.anInt3400 - 3] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method3050() {
		@Pc(14) byte local14 = this.aByteArray45[this.anInt3400++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt3400;
		while (this.aByteArray45[this.anInt3400++] != 0) {
		}
		@Pc(55) int local55 = this.anInt3400 - local27 - 1;
		return local55 == 0 ? "" : Static475.method6888(local27, this.aByteArray45, local55);
	}

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method3051() {
		if (this.aByteArray45[this.anInt3400] == 0) {
			this.anInt3400++;
			return null;
		} else {
			return this.method3034();
		}
	}

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "(II)V")
	public final void method3052(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt3400 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "(B)I")
	public final int method3053() {
		this.anInt3400 += 2;
		return (this.aByteArray45[this.anInt3400 - 1] - 128 & 0xFF) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I[IBI)V")
	public final void method3054(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt3400;
		this.anInt3400 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(26) int local26 = this.method3037();
			@Pc(30) int local30 = this.method3037();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ local32 + arg0[local32 >>> 11 & 0x3];
				local32 -= -1640531527;
				local26 -= arg0[local32 & 0x3] + local32 ^ (local30 << 4 ^ local30 >>> 5) + local30;
			}
			this.anInt3400 -= 8;
			this.method3069(local26);
			this.method3069(local30);
		}
		this.anInt3400 = local6;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(JII)V")
	public final void method3055(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local4 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(Z)I")
	public final int method3056() {
		this.anInt3400 += 2;
		return (this.aByteArray45[this.anInt3400 - 1] & 0xFF) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "(B)I")
	public final int method3057() {
		return -this.aByteArray45[this.anInt3400++] & 0xFF;
	}

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "(I)I")
	public final int method3058() {
		this.anInt3400 += 2;
		@Pc(35) int local35 = (this.aByteArray45[this.anInt3400 - 1] & 0xFF) + ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 8);
		if (local35 > 32767) {
			local35 -= 65536;
		}
		return local35;
	}

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "(I)I")
	public final int method3059() {
		this.anInt3400 += 2;
		@Pc(31) int local31 = ((this.aByteArray45[this.anInt3400 - 1] & 0xFF) << 8) + (this.aByteArray45[this.anInt3400 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "(II)V")
	public final void method3060(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method3061(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3400 += Static4.method208(arg0, arg0.length(), this.anInt3400, this.aByteArray45);
		this.aByteArray45[this.anInt3400++] = 0;
	}

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "(I)I")
	public final int method3062() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.method3066(); local9 == 32767; local9 = this.method3066()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "(B)B")
	public final byte method3063() {
		return (byte) (128 - this.aByteArray45[this.anInt3400++]);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(IB)V")
	public final void method3064(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	public final void method3065(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "(I)I")
	public final int method3066() {
		@Pc(16) int local16 = this.aByteArray45[this.anInt3400] & 0xFF;
		return local16 >= 128 ? this.method3056() - 32768 : this.method3043();
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(IZ)V")
	public final void method3067(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(IB)V")
	public final void method3068(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "(II)V")
	public final void method3069(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(IB)V")
	public final void method3070(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B[BII)V")
	public final void method3071(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = this.aByteArray45[this.anInt3400++];
		}
	}

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "(I)I")
	public final int method3072() {
		return this.aByteArray45[this.anInt3400++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "(I)B")
	public final byte method3073() {
		return this.aByteArray45[this.anInt3400++];
	}

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "(II)I")
	public final int method3074(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static309.method5132(this.aByteArray45, arg0, this.anInt3400);
		this.method3069(local11);
		return local11;
	}

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "(II)V")
	public final void method3075(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "(I)I")
	public final int method3076() {
		this.anInt3400 += 3;
		return ((this.aByteArray45[this.anInt3400 - 2] & 0xFF) << 16) - (-((this.aByteArray45[this.anInt3400 - 3] & 0xFF) << 8) - (this.aByteArray45[this.anInt3400 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "(II)V")
	public final void method3077(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "(B)I")
	public final int method3078() {
		@Pc(17) int local17 = this.aByteArray45[this.anInt3400] & 0xFF;
		return local17 < 128 ? this.method3043() - 64 : this.method3056() + -49152;
	}

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "(B)B")
	public final byte method3079() {
		return (byte) (this.aByteArray45[this.anInt3400++] - 128);
	}

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "(II)V")
	public final void method3080(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt3400++] = (byte) arg0;
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt3400++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "(B)I")
	public final int method3081() {
		@Pc(11) int local11 = Static309.method5132(this.aByteArray45, 0, this.anInt3400);
		this.method3069(local11);
		return local11;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BBII)V")
	public final void method3082(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(18) int local18 = arg1 - 1; local18 >= 0; local18--) {
			arg0[local18] = this.aByteArray45[this.anInt3400++];
		}
	}
}
