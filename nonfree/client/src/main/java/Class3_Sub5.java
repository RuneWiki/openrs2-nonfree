import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
	public int anInt3121;

	@OriginalMember(owner = "client!rp", name = "yb", descriptor = "[B")
	public byte[] aByteArray42;

	static {
		new Class57("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3121 = 0;
		this.aByteArray42 = Static145.method2286(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([B)V")
	public Class3_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
		this.anInt3121 = 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I")
	public final int method2726() {
		this.anInt3121 += 4;
		return (this.aByteArray42[this.anInt3121 - 1] & 0xFF) + ((this.aByteArray42[this.anInt3121 - 3] & 0xFF) << 16) + ((this.aByteArray42[this.anInt3121 + -4] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3121 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)V")
	public final void method2727(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public final void method2728(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IB)V")
	public final void method2729(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	public final int method2730() {
		@Pc(21) byte local21 = this.aByteArray42[this.anInt3121++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray42[this.anInt3121++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)I")
	public final int method2731() {
		this.anInt3121 += 3;
		return (this.aByteArray42[this.anInt3121 - 3] & 0xFF) + ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 16) + ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)V")
	public final void method2732(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 + 128);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZ)V")
	public final void method2733(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)B")
	public final byte method2734() {
		return (byte) (this.aByteArray42[this.anInt3121++] - 128);
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(B)I")
	public final int method2735() {
		return -this.aByteArray42[this.anInt3121++] & 0xFF;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[III)V")
	public final void method2736(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt3121;
		this.anInt3121 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method2726();
			@Pc(38) int local38 = this.method2726();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= local34 + (local34 >>> 5 ^ local34 << 4) ^ local40 + arg0[local40 >>> 11 & 0x3];
				local40 -= -1640531527;
				local34 -= (local38 << 4 ^ local38 >>> 5) + local38 ^ local40 - -arg0[local40 & 0x3];
			}
			this.anInt3121 -= 8;
			this.method2782(local34);
			this.method2782(local38);
		}
		this.anInt3121 = local8;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)B")
	public final byte method2738() {
		return (byte) -this.aByteArray42[this.anInt3121++];
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)I")
	public final int method2739() {
		return this.aByteArray42[this.anInt3121++] & 0xFF;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)I")
	public final int method2740() {
		this.anInt3121 += 2;
		@Pc(39) int local39 = ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)J")
	public final long method2741() {
		@Pc(18) long local18 = (long) this.method2726() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method2726() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[BII)V")
	public final void method2742(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray42[this.anInt3121++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)Z")
	public final boolean method2743() {
		this.anInt3121 -= 4;
		@Pc(22) int local22 = Static319.method4846(this.anInt3121, this.aByteArray42, 0);
		@Pc(26) int local26 = this.method2726();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([BIII)V")
	public final void method2744(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray42[this.anInt3121++];
		}
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)V")
	public final void method2745(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2791(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2749(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "(I)I")
	public final int method2747() {
		this.anInt3121 += 2;
		return ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "(I)I")
	public final int method2748() {
		this.anInt3121 += 4;
		return (this.aByteArray42[this.anInt3121 - 2] & 0xFF) + ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 8) + ((this.aByteArray42[this.anInt3121 + -3] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3121 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)V")
	public final void method2749(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "(I)I")
	public final int method2750() {
		@Pc(19) int local19 = this.aByteArray42[this.anInt3121] & 0xFF;
		return local19 >= 128 ? this.method2767() - 32768 : this.method2739();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JBI)V")
	public final void method2751(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local6 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(II)J")
	public final long method2752(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(32) int local32 = local2 * 8;
		@Pc(34) long local34 = 0L;
		while (local32 >= 0) {
			local34 |= ((long) this.aByteArray42[this.anInt3121++] & 0xFFL) << local32;
			local32 -= 8;
		}
		return local34;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(B)B")
	public final byte method2753() {
		return this.aByteArray42[this.anInt3121++];
	}

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "(I)I")
	public final int method2755() {
		this.anInt3121 += 4;
		return (this.aByteArray42[this.anInt3121 - 3] & 0xFF) + ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 16) + ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3121 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(II)V")
	public final void method2756(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(II)V")
	public final void method2757(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2791(arg0 >>> 28 | 0x80);
					}
					this.method2791(arg0 >>> 21 | 0x80);
				}
				this.method2791(arg0 >>> 14 | 0x80);
			}
			this.method2791(arg0 >>> 7 | 0x80);
		}
		this.method2791(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(IB)V")
	public final void method2758(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IZ)V")
	public final void method2759(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3121 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JZ)V")
	public final void method2760(@OriginalArg(0) long arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 56);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 48);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 40);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 32);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "(I)I")
	public final int method2761() {
		this.anInt3121 += 4;
		return ((this.aByteArray42[this.anInt3121 - 3] & 0xFF) << 8) + (((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 16)) + (this.aByteArray42[this.anInt3121 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)V")
	public final void method2762(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "(I)I")
	public final int method2764() {
		@Pc(11) int local11 = this.aByteArray42[this.anInt3121] & 0xFF;
		return local11 < 128 ? this.method2739() - 64 : this.method2767() + -49152;
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(II)V")
	public final void method2765(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "(I)I")
	public final int method2766() {
		this.anInt3121 += 2;
		@Pc(36) int local36 = (this.aByteArray42[this.anInt3121 - 2] & 0xFF) + ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "(I)I")
	public final int method2767() {
		this.anInt3121 += 2;
		return ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method2768(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt3121 += Static346.method5246(arg0.length(), this.aByteArray42, this.anInt3121, arg0);
		this.aByteArray42[this.anInt3121++] = 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2769(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3121;
		this.anInt3121 = 0;
		@Pc(19) byte[] local19 = new byte[local6];
		this.method2744(local19, local6);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt3121 = 0;
		this.method2791(local38.length);
		this.method2742(local38, local38.length);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[I)V")
	public final void method2770(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt3121 / 8;
		this.anInt3121 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method2726();
			@Pc(25) int local25 = this.method2726();
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local21 += local25 + (local25 << 4 ^ local25 >>> 5) ^ arg0[local27 & 0x3] + local27;
				local27 += -1640531527;
				local25 += local21 + (local21 >>> 5 ^ local21 << 4) ^ local27 + arg0[local27 >>> 11 & 0x6AE00003];
			}
			this.anInt3121 -= 8;
			this.method2782(local21);
			this.method2782(local25);
		}
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "(II)V")
	public final void method2771(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3121 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "(II)V")
	public final void method2772(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "(I)I")
	public final int method2773() {
		return 128 - this.aByteArray42[this.anInt3121++] & 0xFF;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(ZI)I")
	public final int method2775(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static319.method4846(this.anInt3121, this.aByteArray42, arg0);
		this.method2782(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)B")
	public final byte method2776() {
		return (byte) (128 - this.aByteArray42[this.anInt3121++]);
	}

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "(I)I")
	public final int method2777() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method2750();
		while (local11 == 32767) {
			local11 = this.method2750();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(B)I")
	public final int method2778() {
		this.anInt3121 += 2;
		return ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(B)I")
	public final int method2779() {
		this.anInt3121 += 2;
		@Pc(41) int local41 = ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 2] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method2780() {
		if (this.aByteArray42[this.anInt3121] == 0) {
			this.anInt3121++;
			return null;
		} else {
			return this.method2788();
		}
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "(II)V")
	public final void method2781(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(IZ)V")
	public final void method2782(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "(II)V")
	public final void method2783(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3121 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "(I)I")
	public final int method2784() {
		return this.aByteArray42[this.anInt3121++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(B)I")
	public final int method2785() {
		this.anInt3121 += 2;
		@Pc(33) int local33 = (this.aByteArray42[this.anInt3121 - 1] - 128 & 0xFF) + ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Z)I")
	public final int method2786() {
		this.anInt3121 += 3;
		return ((this.aByteArray42[this.anInt3121 - 2] & 0xFF) << 8) + ((this.aByteArray42[this.anInt3121 - 3] & 0xFF) << 16) + (this.aByteArray42[this.anInt3121 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "(B)I")
	public final int method2787() {
		this.anInt3121 += 2;
		return ((this.aByteArray42[this.anInt3121 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt3121 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "(I)Ljava/lang/String;")
	public final String method2788() {
		@Pc(6) int local6 = this.anInt3121;
		while (this.aByteArray42[this.anInt3121++] != 0) {
		}
		@Pc(29) int local29 = this.anInt3121 - local6 - 1;
		return local29 == 0 ? "" : Static325.method5005(local29, this.aByteArray42, local6);
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "(II)V")
	public final void method2790(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3121++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(ZI)V")
	public final void method2791(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3121++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method2792() {
		@Pc(19) byte local19 = this.aByteArray42[this.anInt3121++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt3121;
		while (this.aByteArray42[this.anInt3121++] != 0) {
		}
		@Pc(48) int local48 = this.anInt3121 - local29 - 1;
		return local48 == 0 ? "" : Static325.method5005(local48, this.aByteArray42, local29);
	}
}
