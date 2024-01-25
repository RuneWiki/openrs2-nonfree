import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ap", name = "yb", descriptor = "I")
	public int anInt3005;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray33 = Static315.method5106(arg0);
		this.anInt3005 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([B)V")
	public Class7_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
		this.anInt3005 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
	public final int method2731() {
		this.anInt3005 += 4;
		return ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 24) + ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 16) + ((this.aByteArray33[this.anInt3005 + -3] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I")
	public final int method2732() {
		@Pc(17) int local17 = this.aByteArray33[this.anInt3005] & 0xFF;
		return local17 >= 128 ? this.method2764() - 32768 : this.method2772();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
	public final void method2733(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public final void method2734(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2735(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2788(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)V")
	public final void method2735(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)I")
	public final int method2736() {
		this.anInt3005 += 2;
		return ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)J")
	public final long method2737(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local4 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray33[this.anInt3005++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method2738(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.indexOf(0);
		if (local8 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local8 + " - cannot pjstr");
		}
		this.anInt3005 += Static166.method3175(arg0, arg0.length(), this.anInt3005, this.aByteArray33);
		this.aByteArray33[this.anInt3005++] = 0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)I")
	public final int method2739() {
		this.anInt3005 += 2;
		return ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)I")
	public final int method2740() {
		return -this.aByteArray33[this.anInt3005++] & 0xFF;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)V")
	public final void method2741(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)Z")
	public final boolean method2742() {
		this.anInt3005 -= 4;
		@Pc(22) int local22 = Static204.method3624(this.anInt3005, 0, this.aByteArray33);
		@Pc(26) int local26 = this.method2767();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(I)I")
	public final int method2743() {
		this.anInt3005 += 4;
		return (this.aByteArray33[this.anInt3005 - 2] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 8) + ((this.aByteArray33[this.anInt3005 + -4] & 0xFF) << 16) + ((this.aByteArray33[this.anInt3005 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(I)I")
	public final int method2744() {
		this.anInt3005 += 2;
		@Pc(38) int local38 = (this.aByteArray33[this.anInt3005 - 1] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
	public final void method2745(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 + 128);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
	public final void method2746(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(II)V")
	public final void method2747(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI[BI)V")
	public final void method2750(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = (byte) (this.aByteArray33[this.anInt3005++] - 128);
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(B)I")
	public final int method2751() {
		return 128 - this.aByteArray33[this.anInt3005++] & 0xFF;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)I")
	public final int method2752() {
		@Pc(16) int local16 = this.aByteArray33[this.anInt3005] & 0xFF;
		return local16 >= 128 ? this.method2764() - 49152 : this.method2772() + -64;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(II)V")
	public final void method2753(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([II)V")
	public final void method2754(@OriginalArg(0) int[] arg0) {
		@Pc(8) int local8 = this.anInt3005 / 8;
		this.anInt3005 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(22) int local22 = this.method2767();
			@Pc(26) int local26 = this.method2767();
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local22 += local28 + arg0[local28 & 0x3] ^ (local26 << 4 ^ local26 >>> 5) - -local26;
				local28 += -1640531527;
				local26 += (local22 >>> 5 ^ local22 << 4) + local22 ^ arg0[local28 >>> 11 & 0x3] + local28;
			}
			this.anInt3005 -= 8;
			this.method2765(local22);
			this.method2765(local26);
		}
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "(I)I")
	public final int method2755() {
		this.anInt3005 += 2;
		@Pc(33) int local33 = ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method2756() {
		if (this.aByteArray33[this.anInt3005] == 0) {
			this.anInt3005++;
			return null;
		} else {
			return this.method2782();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)B")
	public final byte method2757() {
		return (byte) (128 - this.aByteArray33[this.anInt3005++]);
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(II)V")
	public final void method2758(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[I)V")
	public final void method2759(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(6) int local6 = this.anInt3005;
		this.anInt3005 = 5;
		@Pc(19) int local19 = (arg0 - 5) / 8;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(26) int local26 = this.method2767();
			@Pc(30) int local30 = this.method2767();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg1[local32 >>> 11 & 0xA6000003] + local32 ^ (local26 >>> 5 ^ local26 << 4) - -local26;
				local32 -= -1640531527;
				local26 -= arg1[local32 & 0x3] + local32 ^ (local30 << 4 ^ local30 >>> 5) + local30;
			}
			this.anInt3005 -= 8;
			this.method2765(local26);
			this.method2765(local30);
		}
		this.anInt3005 = local6;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IB)I")
	public final int method2760(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static204.method3624(this.anInt3005, arg0, this.aByteArray33);
		this.method2765(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "(I)I")
	public final int method2761() {
		@Pc(14) byte local14 = this.aByteArray33[this.anInt3005++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray33[this.anInt3005++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(B)I")
	public final int method2762() {
		this.anInt3005 += 2;
		@Pc(31) int local31 = (this.aByteArray33[this.anInt3005 - 2] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(B)I")
	public final int method2763() {
		return this.aByteArray33[this.anInt3005++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(I)I")
	public final int method2764() {
		this.anInt3005 += 2;
		return (this.aByteArray33[this.anInt3005 - 1] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IZ)V")
	public final void method2765(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(II)V")
	public final void method2766(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt3005 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(B)I")
	public final int method2767() {
		this.anInt3005 += 4;
		return (this.aByteArray33[this.anInt3005 - 1] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8) + ((this.aByteArray33[this.anInt3005 - 3] & 0xFF) << 16) + ((this.aByteArray33[this.anInt3005 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(II)V")
	public final void method2768(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method2770() {
		@Pc(14) byte local14 = this.aByteArray33[this.anInt3005++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt3005;
		while (this.aByteArray33[this.anInt3005++] != 0) {
		}
		@Pc(47) int local47 = this.anInt3005 - local24 - 1;
		return local47 == 0 ? "" : Static74.method1483(this.aByteArray33, local47, local24);
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(B)I")
	public final int method2772() {
		return this.aByteArray33[this.anInt3005++] & 0xFF;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "(II)V")
	public final void method2773(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2735(arg0 >>> 28 | 0x80);
					}
					this.method2735(arg0 >>> 21 | 0x80);
				}
				this.method2735(arg0 >>> 14 | 0x80);
			}
			this.method2735(arg0 >>> 7 | 0x80);
		}
		this.method2735(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "(I)B")
	public final byte method2774() {
		return (byte) (this.aByteArray33[this.anInt3005++] - 128);
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "(II)V")
	public final void method2775(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "(I)I")
	public final int method2776() {
		this.anInt3005 += 2;
		@Pc(40) int local40 = ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IJ)V")
	public final void method2777(@OriginalArg(1) long arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 56);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 48);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 40);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 32);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "(B)B")
	public final byte method2779() {
		return this.aByteArray33[this.anInt3005++];
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(BI)V")
	public final void method2780(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BIB)V")
	public final void method2781(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			this.aByteArray33[this.anInt3005++] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method2782() {
		@Pc(6) int local6 = this.anInt3005;
		while (this.aByteArray33[this.anInt3005++] != 0) {
		}
		@Pc(26) int local26 = this.anInt3005 - local6 - 1;
		return local26 == 0 ? "" : Static74.method1483(this.aByteArray33, local26, local6);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(BI)V")
	public final void method2783(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(I)I")
	public final int method2784() {
		this.anInt3005 += 2;
		return ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 8) + (this.aByteArray33[this.anInt3005 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(II)V")
	public final void method2785(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIJ)V")
	public final void method2786(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(20) int local20 = local4 * 8; local20 >= 0; local20 -= 8) {
			this.aByteArray33[this.anInt3005++] = (byte) (arg1 >> local20);
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZI)V")
	public final void method2787(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(ZI)V")
	public final void method2788(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt3005++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt3005++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method2789(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3005;
		this.anInt3005 = 0;
		@Pc(20) byte[] local20 = new byte[local6];
		this.method2793(local6, local20);
		@Pc(31) BigInteger local31 = new BigInteger(local20);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt3005 = 0;
		this.method2735(local39.length);
		this.method2781(local39, local39.length);
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "(B)J")
	public final long method2790() {
		@Pc(15) long local15 = (long) this.method2767() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2767() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(B)I")
	public final int method2791() {
		this.anInt3005 += 3;
		return (this.aByteArray33[this.anInt3005 - 1] & 0xFF) + ((this.aByteArray33[this.anInt3005 - 2] & 0xFF) << 8) + ((this.aByteArray33[this.anInt3005 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "(I)I")
	public final int method2792() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method2732();
		while (local16 == 32767) {
			local16 = this.method2732();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[B)V")
	public final void method2793(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray33[this.anInt3005++];
		}
	}

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "(I)I")
	public final int method2794() {
		this.anInt3005 += 4;
		return ((this.aByteArray33[this.anInt3005 - 4] & 0xFF) << 8) + ((this.aByteArray33[this.anInt3005 - 2] << 24 & 0xFF000000) + ((this.aByteArray33[this.anInt3005 - 1] & 0xFF) << 16)) + (this.aByteArray33[this.anInt3005 + -3] & 0xFF);
	}
}
