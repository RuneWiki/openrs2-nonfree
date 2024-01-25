import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!sv", name = "T", descriptor = "I")
	public int anInt4347 = 0;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "[B")
	public byte[] aByteArray52;

	static {
		new Class134("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray52 = Static421.method5326(arg0);
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)I")
	public final int method3539() {
		this.anInt4347 += 2;
		@Pc(42) int local42 = ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public final void method3540(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)I")
	public final int method3541() {
		this.anInt4347 += 3;
		@Pc(50) int local50 = (this.aByteArray52[this.anInt4347 - 1] & 0xFF) + ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt4347 + -3] & 0xFF) << 16);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
	public final void method3542(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 + 128);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
	public final void method3543(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)B")
	public final byte method3545() {
		return (byte) (this.aByteArray52[this.anInt4347++] - 128);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)V")
	public final void method3546(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I")
	public final int method3547() {
		this.anInt4347 += 4;
		return ((this.aByteArray52[this.anInt4347 - 4] & 0xFF) << 16) + (((this.aByteArray52[this.anInt4347 - 3] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 8)) + (this.aByteArray52[this.anInt4347 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)I")
	public final int method3548() {
		this.anInt4347 += 2;
		return ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3549(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = Static291.method3891(arg0);
		this.aByteArray52[this.anInt4347++] = 0;
		this.method3551(local14);
		this.anInt4347 += Static253.method3213(arg0, this.aByteArray52, this.anInt4347);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(JBI)V")
	public final void method3550(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(II)V")
	public final void method3551(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3602(arg0 >>> 28 | 0x80);
					}
					this.method3602(arg0 >>> 21 | 0x80);
				}
				this.method3602(arg0 >>> 14 | 0x80);
			}
			this.method3602(arg0 >>> 7 | 0x80);
		}
		this.method3602(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)Z")
	public final boolean method3552() {
		this.anInt4347 -= 4;
		@Pc(22) int local22 = Static312.method4254(this.aByteArray52, 0, this.anInt4347);
		@Pc(26) int local26 = this.method3574();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)I")
	public final int method3553() {
		this.anInt4347 += 2;
		@Pc(39) int local39 = ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)I")
	public final int method3554() {
		this.anInt4347 += 2;
		@Pc(34) int local34 = ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)I")
	public final int method3555() {
		this.anInt4347 += 2;
		return ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)I")
	public final int method3556() {
		return this.aByteArray52[this.anInt4347++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)I")
	public final int method3557() {
		this.anInt4347 += 4;
		return (this.aByteArray52[this.anInt4347 - 4] & 0xFF) + ((this.aByteArray52[this.anInt4347 - 3] & 0xFF) << 8) + ((this.aByteArray52[this.anInt4347 + -1] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4347 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)I")
	public final int method3558() {
		this.anInt4347 += 2;
		@Pc(36) int local36 = (this.aByteArray52[this.anInt4347 - 1] & 0xFF) + ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)I")
	public final int method3559() {
		this.anInt4347 += 4;
		return (this.aByteArray52[this.anInt4347 - 3] & 0xFF) + ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4347 + -1] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4347 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)I")
	public final int method3560() {
		@Pc(19) int local19 = Static312.method4254(this.aByteArray52, 0, this.anInt4347);
		this.method3569(local19);
		return local19;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(II)V")
	public final void method3561(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(II)V")
	public final void method3562(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(I)I")
	public final int method3563() {
		this.anInt4347 += 3;
		return ((this.aByteArray52[this.anInt4347 - 3] & 0xFF) << 16) + (this.aByteArray52[this.anInt4347 - 2] << 8 & 0xFF00) + (this.aByteArray52[this.anInt4347 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BII)V")
	public final void method3564(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray52[this.anInt4347++] - 128);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)V")
	public final void method3565(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(BI)V")
	public final void method3566(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(I)I")
	public final int method3567() {
		this.anInt4347 += 3;
		return ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 16) + (this.aByteArray52[this.anInt4347 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(II)V")
	public final void method3568(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
	public final void method3569(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BJ)V")
	public final void method3570(@OriginalArg(1) long arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 56);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 48);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 40);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 32);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(I)I")
	public final int method3571() {
		@Pc(23) byte local23 = this.aByteArray52[this.anInt4347++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray52[this.anInt4347++];
		}
		return local25 | local23;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(II)V")
	public final void method3572(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4347 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "(I)B")
	public final byte method3573() {
		return (byte) -this.aByteArray52[this.anInt4347++];
	}

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "(I)I")
	public final int method3574() {
		this.anInt4347 += 4;
		return ((this.aByteArray52[this.anInt4347 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt4347 - 4] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4347 + -3] & 0xFF) << 16) + (this.aByteArray52[this.anInt4347 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3575(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4347;
		this.anInt4347 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3598(local12, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt4347 = 0;
		this.method3568(local35.length);
		this.method3596(local35.length, local35);
	}

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(I)I")
	public final int method3576() {
		this.anInt4347 += 2;
		return ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt4347 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
	public final void method3577(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[III)V")
	public final void method3578(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt4347;
		this.anInt4347 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(28) int local28 = this.method3574();
			@Pc(32) int local32 = this.method3574();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local28 + (local28 >>> 5 ^ local28 << 4) ^ local34 - -arg0[local34 >>> 11 & 0xBB600003];
				local34 -= -1640531527;
				local28 -= (local32 << 4 ^ local32 >>> 5) + local32 ^ local34 + arg0[local34 & 0x3];
			}
			this.anInt4347 -= 8;
			this.method3569(local28);
			this.method3569(local32);
		}
		this.anInt4347 = local8;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(IB)I")
	public final int method3579(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static312.method4254(this.aByteArray52, arg0, this.anInt4347);
		this.method3569(local19);
		return local19;
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(I)I")
	public final int method3580() {
		return this.aByteArray52[this.anInt4347++] & 0xFF;
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(I)I")
	public final int method3581() {
		@Pc(17) int local17 = this.aByteArray52[this.anInt4347] & 0xFF;
		return local17 < 128 ? this.method3580() - 64 : this.method3555() - 49152;
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "(I)Ljava/lang/String;")
	public final String method3582() {
		@Pc(12) int local12 = this.anInt4347;
		while (this.aByteArray52[this.anInt4347++] != 0) {
		}
		@Pc(35) int local35 = this.anInt4347 - local12 - 1;
		return local35 == 0 ? "" : Static230.method3015(local35, local12, this.aByteArray52);
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(II)V")
	public final void method3583(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(II)V")
	public final void method3584(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(II)V")
	public final void method3585(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	public final void method3586(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3602(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3568(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(B)I")
	public final int method3587() {
		return 128 - this.aByteArray52[this.anInt4347++] & 0xFF;
	}

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "(I)I")
	public final int method3588() {
		@Pc(19) int local19 = this.aByteArray52[this.anInt4347] & 0xFF;
		return local19 >= 128 ? this.method3555() - 32768 : this.method3580();
	}

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method3589() {
		@Pc(14) byte local14 = this.aByteArray52[this.anInt4347++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt4347;
		while (this.aByteArray52[this.anInt4347++] != 0) {
		}
		@Pc(47) int local47 = this.anInt4347 - local27 - 1;
		return local47 == 0 ? "" : Static230.method3015(local47, local27, this.aByteArray52);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method3590(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4347 += Static189.method2548(arg0, this.anInt4347, this.aByteArray52, arg0.length());
		this.aByteArray52[this.anInt4347++] = 0;
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(II)J")
	public final long method3591(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local6 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray52[this.anInt4347++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "(II)V")
	public final void method3592(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "(I)I")
	public final int method3593() {
		this.anInt4347 += 2;
		return (this.aByteArray52[this.anInt4347 - 2] - 128 & 0xFF) + ((this.aByteArray52[this.anInt4347 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "(I)I")
	public final int method3594() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18;
		for (local18 = this.method3588(); local18 == 32767; local18 = this.method3588()) {
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(IB)V")
	public final void method3595(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4347++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZ[B)V")
	public final void method3596(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			this.aByteArray52[this.anInt4347++] = arg1[local13];
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Z)J")
	public final long method3597() {
		@Pc(10) long local10 = (long) this.method3574() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3574() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BIZ)V")
	public final void method3598(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray52[this.anInt4347++];
		}
	}

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "(I)Ljava/lang/String;")
	public final String method3599() {
		@Pc(14) byte local14 = this.aByteArray52[this.anInt4347++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method3571();
		if (this.anInt4347 + local28 > this.aByteArray52.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(53) String local53 = Static327.method4405(this.aByteArray52, this.anInt4347, local28);
		this.anInt4347 += local28;
		return local53;
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "(I)I")
	public final int method3600() {
		return -this.aByteArray52[this.anInt4347++] & 0xFF;
	}

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "(I)B")
	public final byte method3601() {
		return (byte) (128 - this.aByteArray52[this.anInt4347++]);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZI)V")
	public final void method3602(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4347++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method3603() {
		if (this.aByteArray52[this.anInt4347] == 0) {
			this.anInt4347++;
			return null;
		} else {
			return this.method3582();
		}
	}

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "(I)B")
	public final byte method3605() {
		return this.aByteArray52[this.anInt4347++];
	}
}
