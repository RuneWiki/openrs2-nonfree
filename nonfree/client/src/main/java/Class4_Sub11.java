import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
	public int anInt3768;

	static {
		new Class159("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class159("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray55 = Static122.method2529(arg0);
		this.anInt3768 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub11(@OriginalArg(0) byte[] arg0) {
		this.anInt3768 = 0;
		this.aByteArray55 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public final void method3399(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3434(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3402(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)I")
	public final int method3401() {
		this.anInt3768 += 2;
		return ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8) + (this.aByteArray55[this.anInt3768 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public final void method3402(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
	public final int method3403() {
		this.anInt3768 += 2;
		@Pc(38) int local38 = (this.aByteArray55[this.anInt3768 - 1] - 128 & 0xFF) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method3404() {
		@Pc(14) byte local14 = this.aByteArray55[this.anInt3768++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt3768;
		while (this.aByteArray55[this.anInt3768++] != 0) {
		}
		@Pc(50) int local50 = this.anInt3768 - local27 - 1;
		return local50 == 0 ? "" : Static57.method1206(local27, local50, this.aByteArray55);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)B")
	public final byte method3405() {
		return (byte) (128 - this.aByteArray55[this.anInt3768++]);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
	public final int method3406() {
		@Pc(18) int local18 = this.aByteArray55[this.anInt3768] & 0xFF;
		return local18 >= 128 ? this.method3401() - 49152 : this.method3440() + -64;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)J")
	public final long method3407() {
		@Pc(18) long local18 = (long) this.method3418() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method3418() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)B")
	public final byte method3409() {
		return (byte) (this.aByteArray55[this.anInt3768++] - 128);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method3410(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3768 += Static258.method4491(arg0.length(), arg0, this.aByteArray55, this.anInt3768);
		this.aByteArray55[this.anInt3768++] = 0;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
	public final void method3411(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)I")
	public final int method3412() {
		this.anInt3768 += 2;
		return ((this.aByteArray55[this.anInt3768 - 1] & 0xFF) << 8) + (this.aByteArray55[this.anInt3768 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)I")
	public final int method3413() {
		return -this.aByteArray55[this.anInt3768++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[BI)V")
	public final void method3414(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray55[this.anInt3768++] - 128);
		}
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)I")
	public final int method3415() {
		this.anInt3768 += 2;
		return (this.aByteArray55[this.anInt3768 - 1] - 128 & 0xFF) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)I")
	public final int method3416() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16;
		for (local16 = this.method3457(); local16 == 32767; local16 = this.method3457()) {
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)I")
	public final int method3417() {
		this.anInt3768 += 4;
		return ((this.aByteArray55[this.anInt3768 - 1] & 0xFF) << 8) + ((this.aByteArray55[this.anInt3768 - 4] & 0xFF) << 16) + ((this.aByteArray55[-3 + this.anInt3768] & 0xFF) << 24) + (this.aByteArray55[this.anInt3768 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(Z)I")
	public final int method3418() {
		this.anInt3768 += 4;
		return (this.aByteArray55[this.anInt3768 - 1] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8) + ((this.aByteArray55[this.anInt3768 + -4] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3768 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)V")
	public final void method3419(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)I")
	public final int method3420() {
		this.anInt3768 += 4;
		return ((this.aByteArray55[this.anInt3768 - 4] & 0xFF) << 8) + (((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3768 - 1] & 0xFF) << 16)) + (this.aByteArray55[this.anInt3768 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JII)V")
	public final void method3421(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local2 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> local25);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V")
	public final void method3422(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)V")
	public final void method3423(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3434(arg0 >>> 28 | 0x80);
					}
					this.method3434(arg0 >>> 21 | 0x80);
				}
				this.method3434(arg0 >>> 14 | 0x80);
			}
			this.method3434(arg0 >>> 7 | 0x80);
		}
		this.method3434(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[B)V")
	public final void method3424(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			this.aByteArray55[this.anInt3768++] = arg1[local15];
		}
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)I")
	public final int method3425() {
		this.anInt3768 += 4;
		return (this.aByteArray55[this.anInt3768 - 4] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3768 + -1] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3768 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(B)B")
	public final byte method3426() {
		return this.aByteArray55[this.anInt3768++];
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(Z)I")
	public final int method3427() {
		this.anInt3768 += 2;
		@Pc(31) int local31 = (this.aByteArray55[this.anInt3768 - 2] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)B")
	public final byte method3428() {
		return (byte) -this.aByteArray55[this.anInt3768++];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	public final void method3429(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)V")
	public final void method3430(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[I)V")
	public final void method3431(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(14) int local14 = this.anInt3768;
		this.anInt3768 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method3418();
			@Pc(36) int local36 = this.method3418();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ arg1[local38 >>> 11 & 0x3] + local38;
				local38 -= -1640531527;
				local32 -= local38 + arg1[local38 & 0x3] ^ (local36 >>> 5 ^ local36 << 4) - -local36;
			}
			this.anInt3768 -= 8;
			this.method3452(local32);
			this.method3452(local36);
		}
		this.anInt3768 = local14;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)J")
	public final long method3432(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray55[this.anInt3768++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method3433() {
		if (this.aByteArray55[this.anInt3768] == 0) {
			this.anInt3768++;
			return null;
		} else {
			return this.method3446();
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(IB)V")
	public final void method3434(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)V")
	public final void method3435(@OriginalArg(1) long arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 56);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 48);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 40);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 32);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method3436(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3768;
		this.anInt3768 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3456(local6, local12);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt3768 = 0;
		this.method3434(local35.length);
		this.method3424(local35.length, local35);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)I")
	public final int method3437(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static98.method2232(arg0, this.aByteArray55, this.anInt3768);
		this.method3452(local16);
		return local16;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)V")
	public final void method3438(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(Z)I")
	public final int method3440() {
		return this.aByteArray55[this.anInt3768++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(IB)V")
	public final void method3441(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(B)I")
	public final int method3442() {
		this.anInt3768 += 3;
		return (this.aByteArray55[this.anInt3768 - 1] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 3] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(II)V")
	public final void method3443(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(II)V")
	public final void method3445(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method3446() {
		@Pc(6) int local6 = this.anInt3768;
		while (this.aByteArray55[this.anInt3768++] != 0) {
		}
		@Pc(36) int local36 = this.anInt3768 - local6 - 1;
		return local36 == 0 ? "" : Static57.method1206(local6, local36, this.aByteArray55);
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)I")
	public final int method3447() {
		this.anInt3768 += 2;
		@Pc(31) int local31 = (this.aByteArray55[this.anInt3768 - 1] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "(I)I")
	public final int method3448() {
		@Pc(16) byte local16 = this.aByteArray55[this.anInt3768++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local16 & 0x7F | local25) << 7;
			local16 = this.aByteArray55[this.anInt3768++];
		}
		return local25 | local16;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)V")
	public final void method3449(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)V")
	public final void method3450(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3768 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "(I)I")
	public final int method3451() {
		return this.aByteArray55[this.anInt3768++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(IB)V")
	public final void method3452(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(Z)I")
	public final int method3453() {
		return 128 - this.aByteArray55[this.anInt3768++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([IZ)V")
	public final void method3454(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt3768 / 8;
		this.anInt3768 = 0;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(28) int local28 = this.method3418();
			@Pc(36) int local36 = this.method3418();
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local28 += local38 + arg0[local38 & 0x3] ^ local36 + (local36 >>> 5 ^ local36 << 4);
				local38 += -1640531527;
				local36 += (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local38 >>> 11 & 0x3] + local38;
			}
			this.anInt3768 -= 8;
			this.method3452(local28);
			this.method3452(local36);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public final void method3455(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) arg0;
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[BZ)V")
	public final void method3456(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray55[this.anInt3768++];
		}
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "(I)I")
	public final int method3457() {
		@Pc(16) int local16 = this.aByteArray55[this.anInt3768] & 0xFF;
		return local16 >= 128 ? this.method3401() - 32768 : this.method3440();
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(II)V")
	public final void method3458(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(II)V")
	public final void method3459(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 + 128);
		this.aByteArray55[this.anInt3768++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "(I)I")
	public final int method3460() {
		this.anInt3768 += 2;
		return (this.aByteArray55[this.anInt3768 - 2] & 0xFF) + ((this.aByteArray55[this.anInt3768 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(B)Z")
	public final boolean method3461() {
		this.anInt3768 -= 4;
		@Pc(17) int local17 = Static98.method2232(0, this.aByteArray55, this.anInt3768);
		@Pc(28) int local28 = this.method3418();
		return local17 == local28;
	}
}
