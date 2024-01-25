import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!ef", name = "Db", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray30 = Static78.method1597(arg0);
		this.anInt3606 = 0;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.anInt3606 = 0;
		this.aByteArray30 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)I")
	public final int method3099() {
		this.anInt3606 += 2;
		return ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 8) + (this.aByteArray30[this.anInt3606 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IB)V")
	public final void method3100(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt3606 / 8;
		this.anInt3606 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method3135();
			@Pc(29) int local29 = this.method3135();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += local31 + arg0[local31 & 0x3] ^ (local29 >>> 5 ^ local29 << 4) - -local29;
				local31 += -1640531527;
				local29 += local31 + arg0[local31 >>> 11 & 0x3] ^ local25 + (local25 >>> 5 ^ local25 << 4);
			}
			this.anInt3606 -= 8;
			this.method3162(local25);
			this.method3162(local29);
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method3101() {
		if (this.aByteArray30[this.anInt3606] == 0) {
			this.anInt3606++;
			return null;
		} else {
			return this.method3113();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public final void method3102(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 + 128);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	public final int method3103() {
		this.anInt3606 += 2;
		@Pc(33) int local33 = ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 8) + (this.aByteArray30[this.anInt3606 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	public final int method3104() {
		this.anInt3606 += 2;
		return ((this.aByteArray30[this.anInt3606 - 2] & 0xFF) << 8) + (this.aByteArray30[this.anInt3606 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
	public final int method3105() {
		this.anInt3606 += 4;
		return (this.aByteArray30[this.anInt3606 - 3] & 0xFF) + ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 16) + ((this.aByteArray30[this.anInt3606 + -2] & 0xFF) << 24) + ((this.aByteArray30[this.anInt3606 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI[BI)V")
	public final void method3106(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray30[this.anInt3606++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public final void method3107(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3147(arg0 >>> 28 | 0x80);
					}
					this.method3147(arg0 >>> 21 | 0x80);
				}
				this.method3147(arg0 >>> 14 | 0x80);
			}
			this.method3147(arg0 >>> 7 | 0x80);
		}
		this.method3147(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)I")
	public final int method3108() {
		this.anInt3606 += 2;
		@Pc(31) int local31 = ((this.aByteArray30[this.anInt3606 - 2] & 0xFF) << 8) + (this.aByteArray30[this.anInt3606 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)I")
	public final int method3109() {
		this.anInt3606 += 2;
		return (this.aByteArray30[this.anInt3606 - 2] & 0xFF) + ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	public final void method3110(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)Ljava/lang/String;")
	public final String method3111() {
		@Pc(19) byte local19 = this.aByteArray30[this.anInt3606++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt3606;
		while (this.aByteArray30[this.anInt3606++] != 0) {
		}
		@Pc(51) int local51 = this.anInt3606 - local29 - 1;
		return local51 == 0 ? "" : Static272.method4035(this.aByteArray30, local51, local29);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	public final void method3112(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method3113() {
		@Pc(6) int local6 = this.anInt3606;
		while (this.aByteArray30[this.anInt3606++] != 0) {
		}
		@Pc(26) int local26 = this.anInt3606 - local6 - 1;
		return local26 == 0 ? "" : Static272.method4035(this.aByteArray30, local26, local6);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBJ)V")
	public final void method3114(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local11 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray30[this.anInt3606++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)V")
	public final void method3115(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)I")
	public final int method3116() {
		this.anInt3606 += 2;
		return (this.aByteArray30[this.anInt3606 - 1] - 128 & 0xFF) + ((this.aByteArray30[this.anInt3606 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
	public final void method3117(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3147(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3158(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public final void method3118(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BII)V")
	public final void method3119(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = (byte) (this.aByteArray30[this.anInt3606++] - 128);
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I")
	public final int method3120() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method3153();
		while (local11 == 32767) {
			local11 = this.method3153();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	public final void method3121(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)B")
	public final byte method3122() {
		return this.aByteArray30[this.anInt3606++];
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)I")
	public final int method3123() {
		@Pc(17) int local17 = this.aByteArray30[this.anInt3606] & 0xFF;
		return local17 < 128 ? this.method3124() - 64 : this.method3104() + -49152;
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)I")
	public final int method3124() {
		return this.aByteArray30[this.anInt3606++] & 0xFF;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(II)V")
	public final void method3125(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(I)I")
	public final int method3126() {
		this.anInt3606 += 4;
		return (this.aByteArray30[this.anInt3606 - 2] & 0xFF) + ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 8) + ((this.aByteArray30[this.anInt3606 + -3] & 0xFF) << 24) + ((this.aByteArray30[this.anInt3606 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "(I)I")
	public final int method3127() {
		this.anInt3606 += 2;
		@Pc(37) int local37 = ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 8) + (this.aByteArray30[this.anInt3606 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)I")
	public final int method3129(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = Static99.method1988(arg0, this.aByteArray30, this.anInt3606);
		this.method3162(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(JB)V")
	public final void method3130(@OriginalArg(0) long arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 56);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 48);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 40);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 32);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
	public final boolean method3131() {
		this.anInt3606 -= 4;
		@Pc(22) int local22 = Static99.method1988(0, this.aByteArray30, this.anInt3606);
		@Pc(26) int local26 = this.method3135();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)I")
	public final int method3132() {
		return 128 - this.aByteArray30[this.anInt3606++] & 0xFF;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(II)V")
	public final void method3133(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "(I)I")
	public final int method3134() {
		@Pc(16) byte local16 = this.aByteArray30[this.anInt3606++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray30[this.anInt3606++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "(I)I")
	public final int method3135() {
		this.anInt3606 += 4;
		return (this.aByteArray30[this.anInt3606 - 1] & 0xFF) + ((this.aByteArray30[this.anInt3606 - 4] & 0xFF) << 24) + ((this.aByteArray30[this.anInt3606 - 3] & 0xFF) << 16) + ((this.aByteArray30[this.anInt3606 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[BII)V")
	public final void method3137(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = this.aByteArray30[this.anInt3606++];
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(IB)V")
	public final void method3138(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method3139(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3606;
		this.anInt3606 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3137(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local28.toByteArray();
		this.anInt3606 = 0;
		this.method3147(local35.length);
		this.method3106(local35, local35.length);
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)I")
	public final int method3140() {
		return this.aByteArray30[this.anInt3606++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(II)V")
	public final void method3141(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(B)J")
	public final long method3142() {
		@Pc(17) long local17 = (long) this.method3135() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3135() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III[I)V")
	public final void method3144(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt3606;
		this.anInt3606 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method3135();
			@Pc(34) int local34 = this.method3135();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ local36 + arg1[local36 >>> 11 & 0x3];
				local36 -= -1640531527;
				local30 -= local34 + (local34 >>> 5 ^ local34 << 4) ^ arg1[local36 & 0x3] + local36;
			}
			this.anInt3606 -= 8;
			this.method3162(local30);
			this.method3162(local34);
		}
		this.anInt3606 = local8;
	}

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "(I)B")
	public final byte method3145() {
		return (byte) -this.aByteArray30[this.anInt3606++];
	}

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "(I)I")
	public final int method3146() {
		return -this.aByteArray30[this.anInt3606++] & 0xFF;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IZ)V")
	public final void method3147(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "(I)I")
	public final int method3148() {
		this.anInt3606 += 4;
		return ((this.aByteArray30[this.anInt3606 - 1] & 0xFF) << 24) - (-((this.aByteArray30[this.anInt3606 - 2] & 0xFF) << 16) - ((this.aByteArray30[this.anInt3606 - 3] & 0xFF) << 8) - (this.aByteArray30[this.anInt3606 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(B)I")
	public final int method3149() {
		this.anInt3606 += 2;
		@Pc(39) int local39 = (this.aByteArray30[this.anInt3606 - 1] - 128 & 0xFF) + ((this.aByteArray30[this.anInt3606 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(IB)J")
	public final long method3150(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local21 >= 0) {
			local28 |= ((long) this.aByteArray30[this.anInt3606++] & 0xFFL) << local21;
			local21 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "(I)B")
	public final byte method3151() {
		return (byte) (128 - this.aByteArray30[this.anInt3606++]);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)V")
	public final void method3152(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)I")
	public final int method3153() {
		@Pc(11) int local11 = this.aByteArray30[this.anInt3606] & 0xFF;
		return local11 >= 128 ? this.method3104() - 32768 : this.method3124();
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(II)V")
	public final void method3154(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(B)I")
	public final int method3155() {
		this.anInt3606 += 3;
		return (this.aByteArray30[this.anInt3606 - 1] & 0xFF) + ((this.aByteArray30[this.anInt3606 - 3] & 0xFF) << 8) + ((this.aByteArray30[this.anInt3606 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3156(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt3606 += Static165.method3276(arg0, this.anInt3606, arg0.length(), this.aByteArray30);
		this.aByteArray30[this.anInt3606++] = 0;
	}

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "(I)B")
	public final byte method3157() {
		return (byte) (this.aByteArray30[this.anInt3606++] - 128);
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(II)V")
	public final void method3158(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(II)V")
	public final void method3159(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt3606 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([BIII)V")
	public final void method3160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray30[this.anInt3606++];
		}
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(II)V")
	public final void method3161(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(II)V")
	public final void method3162(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt3606++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt3606++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(B)I")
	public final int method3163() {
		this.anInt3606 += 3;
		return ((this.aByteArray30[this.anInt3606 - 3] & 0xFF) << 16) + (this.aByteArray30[this.anInt3606 - 2] << 8 & 0xFF00) + (this.aByteArray30[this.anInt3606 + -1] & 0xFF);
	}
}
