import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!sl", name = "ib", descriptor = "I")
	public int anInt3378;

	@OriginalMember(owner = "client!sl", name = "V", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17(@OriginalArg(0) int arg0) {
		this.anInt3378 = 0;
		this.aByteArray26 = Static202.method3467(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([B)V")
	public Class2_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
		this.anInt3378 = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I")
	public final int method2823() {
		@Pc(18) int local18 = this.aByteArray26[this.anInt3378] & 0xFF;
		return local18 < 128 ? this.method2859() - 64 : this.method2825() + -49152;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
	public final void method2824(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public final int method2825() {
		this.anInt3378 += 2;
		return ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt3378 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I")
	public final int method2826() {
		this.anInt3378 += 2;
		@Pc(38) int local38 = ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt3378 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public final void method2827(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(JII)V")
	public final void method2828(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local0 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)J")
	public final long method2829(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local0 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray26[this.anInt3378++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	public final int method2830() {
		this.anInt3378 += 4;
		return (this.aByteArray26[this.anInt3378 - 3] & 0xFF) + (((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 24) + ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
	public final void method2831(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([BBII)V")
	public final void method2832(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = arg2; local5 < arg2 + arg1; local5++) {
			arg0[local5] = this.aByteArray26[this.anInt3378++];
		}
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method2833() {
		@Pc(6) int local6 = this.anInt3378;
		while (this.aByteArray26[this.anInt3378++] != 0) {
		}
		@Pc(29) int local29 = this.anInt3378 - local6 - 1;
		return local29 == 0 ? "" : Static422.method6164(local6, local29, this.aByteArray26);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)I")
	public final int method2834() {
		this.anInt3378 += 4;
		return (this.aByteArray26[this.anInt3378 - 4] & 0xFF) + (((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 24) + ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I")
	public final int method2835() {
		this.anInt3378 += 3;
		return ((this.aByteArray26[this.anInt3378 - 3] & 0xFF) << 16) - (-((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8) - (this.aByteArray26[this.anInt3378 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)I")
	public final int method2836() {
		this.anInt3378 += 2;
		@Pc(31) int local31 = ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt3378 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
	public final void method2837(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)B")
	public final byte method2838() {
		return (byte) -this.aByteArray26[this.anInt3378++];
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)I")
	public final int method2839() {
		this.anInt3378 += 3;
		return (this.aByteArray26[this.anInt3378 - 3] & 0xFF) + ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V")
	public final void method2840(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)I")
	public final int method2841() {
		this.anInt3378 += 3;
		@Pc(44) int local44 = (this.aByteArray26[this.anInt3378 - 1] & 0xFF) + (((this.aByteArray26[this.anInt3378 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)I")
	public final int method2842() {
		return -this.aByteArray26[this.anInt3378++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)I")
	public final int method2843() {
		this.anInt3378 += 4;
		return (this.aByteArray26[this.anInt3378 - 2] & 0xFF) + ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 8) + ((this.aByteArray26[this.anInt3378 + -4] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method2844() {
		if (this.aByteArray26[this.anInt3378] == 0) {
			this.anInt3378++;
			return null;
		} else {
			return this.method2833();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)V")
	public final void method2845(@OriginalArg(1) long arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 56);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 48);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 40);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 32);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 24);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (int) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)Z")
	public final boolean method2846() {
		this.anInt3378 -= 4;
		@Pc(17) int local17 = Static172.method2993(this.aByteArray26, 0, this.anInt3378);
		@Pc(26) int local26 = this.method2881();
		return local17 == local26;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BII)V")
	public final void method2847(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = (byte) (this.aByteArray26[this.anInt3378++] - 128);
		}
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V")
	public final void method2848(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IB)V")
	public final void method2849(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB[I)V")
	public final void method2850(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(6) int local6 = this.anInt3378;
		this.anInt3378 = 5;
		@Pc(16) int local16 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(28) int local28 = this.method2881();
			@Pc(32) int local32 = this.method2881();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local28 + (local28 >>> 5 ^ local28 << 4) ^ arg1[local34 >>> 11 & 0x6A600003] + local34;
				local34 -= -1640531527;
				local28 -= local34 + arg1[local34 & 0x3] ^ local32 + (local32 >>> 5 ^ local32 << 4);
			}
			this.anInt3378 -= 8;
			this.method2827(local28);
			this.method2827(local32);
		}
		this.anInt3378 = local6;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(B)V")
	public final void method2851() {
		if (this.aByteArray26 != null) {
			Static202.method3469(this.aByteArray26);
		}
		this.aByteArray26 = null;
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(B)B")
	public final byte method2852() {
		return (byte) (128 - this.aByteArray26[this.anInt3378++]);
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)I")
	public final int method2853() {
		@Pc(11) int local11 = this.aByteArray26[this.anInt3378] & 0xFF;
		return local11 < 128 ? this.method2859() : this.method2825() - 32768;
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(B)I")
	public final int method2854() {
		this.anInt3378 += 2;
		return (this.aByteArray26[this.anInt3378 - 1] - 128 & 0xFF) + ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2856(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt3378 += Static419.method6397(this.anInt3378, arg0.length(), arg0, this.aByteArray26);
		this.aByteArray26[this.anInt3378++] = 0;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(IB)V")
	public final void method2857(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2858(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3378;
		this.anInt3378 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2832(local12, local6, 0);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3378 = 0;
		this.method2879(local31.length);
		this.method2873(0, local31, local31.length);
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(B)I")
	public final int method2859() {
		return this.aByteArray26[this.anInt3378++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(I)B")
	public final byte method2860() {
		return this.aByteArray26[this.anInt3378++];
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(IB)V")
	public final void method2861(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(II)V")
	public final void method2862(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2837(arg0 >>> 28 | 0x80);
					}
					this.method2837(arg0 >>> 21 | 0x80);
				}
				this.method2837(arg0 >>> 14 | 0x80);
			}
			this.method2837(arg0 >>> 7 | 0x80);
		}
		this.method2837(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "(B)I")
	public final int method2863() {
		this.anInt3378 += 2;
		return ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt3378 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IZ)I")
	public final int method2864(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static172.method2993(this.aByteArray26, arg0, this.anInt3378);
		this.method2827(local11);
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(B)I")
	public final int method2865() {
		return 128 - this.aByteArray26[this.anInt3378++] & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
	public final void method2866(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(IB)V")
	public final void method2867(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "(I)I")
	public final int method2868() {
		@Pc(19) byte local19 = this.aByteArray26[this.anInt3378++];
		@Pc(21) int local21 = 0;
		while (local19 < 0) {
			local21 = (local21 | local19 & 0x7F) << 7;
			local19 = this.aByteArray26[this.anInt3378++];
		}
		return local21 | local19;
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "(I)J")
	public final long method2869() {
		@Pc(18) long local18 = (long) this.method2834() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method2834() & 0xFFFFFFFFL;
		return local18 + (local25 << 32);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(IB)V")
	public final void method2870(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(II)V")
	public final void method2871(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt3378 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "(B)J")
	public final long method2872() {
		@Pc(17) long local17 = (long) this.method2881() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method2881() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[BI)V")
	public final void method2873(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = arg0; local1 < arg2 + arg0; local1++) {
			this.aByteArray26[this.anInt3378++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIII)V")
	public final void method2874(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anInt3378;
		this.anInt3378 = arg1;
		@Pc(24) int local24 = (arg2 - arg1) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) int local31 = this.method2881();
			@Pc(37) int local37 = this.method2881();
			@Pc(39) int local39 = 0;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local31 += (local37 << 4 ^ local37 >>> 5) + local37 ^ arg0[local39 & 0x3] + local39;
				local39 += -1640531527;
				local37 += local39 + arg0[local39 >>> 11 & 0x9E600003] ^ (local31 << 4 ^ local31 >>> 5) + local31;
			}
			this.anInt3378 -= 8;
			this.method2827(local31);
			this.method2827(local37);
		}
		this.anInt3378 = local6;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(II)V")
	public final void method2875(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "(B)I")
	public final int method2876() {
		this.anInt3378 += 2;
		return ((this.aByteArray26[this.anInt3378 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt3378 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(IB)V")
	public final void method2877(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2837(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2879(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "(II)V")
	public final void method2878(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(IZ)V")
	public final void method2879(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "(I)I")
	public final int method2880() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method2853(); local11 == 32767; local11 = this.method2853()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "(I)I")
	public final int method2881() {
		this.anInt3378 += 4;
		return (this.aByteArray26[this.anInt3378 - 1] & 0xFF) + ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 8) + ((this.aByteArray26[this.anInt3378 + -3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(II)V")
	public final void method2883(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 + 128);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method2884() {
		@Pc(14) byte local14 = this.aByteArray26[this.anInt3378++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt3378;
		while (this.aByteArray26[this.anInt3378++] != 0) {
		}
		@Pc(50) int local50 = this.anInt3378 - local27 - 1;
		return local50 == 0 ? "" : Static422.method6164(local27, local50, this.aByteArray26);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method2885(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray26[this.anInt3378++] = 0;
		this.anInt3378 += Static419.method6397(this.anInt3378, arg0.length(), arg0, this.aByteArray26);
		this.aByteArray26[this.anInt3378++] = 0;
	}

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "(I)B")
	public final byte method2886() {
		return (byte) (this.aByteArray26[this.anInt3378++] - 128);
	}

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "(I)I")
	public final int method2887() {
		this.anInt3378 += 4;
		return ((this.aByteArray26[this.anInt3378 - 3] & 0xFF) << 8) + ((this.aByteArray26[this.anInt3378 - 2] & 0xFF) << 16) + ((this.aByteArray26[this.anInt3378 + -1] & 0xFF) << 24) + (this.aByteArray26[this.anInt3378 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "(I)I")
	public final int method2888() {
		return this.aByteArray26[this.anInt3378++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(II)V")
	public final void method2889(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt3378++] = (byte) (arg0 + 128);
	}
}
