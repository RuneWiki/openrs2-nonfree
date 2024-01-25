import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public int anInt8188 = 0;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	public Class2_Sub34(@OriginalArg(0) int arg0) {
		this.aByteArray77 = Static409.method6290(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([B)V")
	public Class2_Sub34(@OriginalArg(0) byte[] arg0) {
		this.aByteArray77 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public final void method6854(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[II)V")
	public final void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt8188;
		this.anInt8188 = 5;
		@Pc(16) int local16 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(28) int local28 = this.method6865();
			@Pc(32) int local32 = this.method6865();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg1[local34 >>> 11 & 0x3] + local34;
				local34 -= -1640531527;
				local28 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ arg1[local34 & 0x3] + local34;
			}
			this.anInt8188 -= 8;
			this.method6864(local28);
			this.method6864(local32);
		}
		this.anInt8188 = local6;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
	public final int method6856() {
		this.anInt8188 += 2;
		@Pc(39) int local39 = ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
	public final void method6857(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
	public final void method6858(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
	public final int method6859() {
		this.anInt8188 += 2;
		return (this.aByteArray77[this.anInt8188 - 2] - 128 & 0xFF) + ((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public final void method6860(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	public final void method6861(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IB)V")
	public final void method6862(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)I")
	public final int method6863() {
		@Pc(19) int local19 = this.aByteArray77[this.anInt8188] & 0xFF;
		return local19 >= 128 ? this.method6884() - 32768 : this.method6904();
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
	public final void method6864(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)I")
	public final int method6865() {
		this.anInt8188 += 4;
		return ((this.aByteArray77[this.anInt8188 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt8188 - 4] & 0xFF) << 24) + ((this.aByteArray77[this.anInt8188 + -2] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	public final int method6866() {
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = this.method6863();
		while (local14 == 32767) {
			local14 = this.method6863();
			local10 += 32767;
		}
		return local10 + local14;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
	public final int method6867() {
		return -this.aByteArray77[this.anInt8188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
	public final void method6868(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)V")
	public final void method6869(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	public final int method6870() {
		this.anInt8188 += 3;
		return ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8) + ((this.aByteArray77[this.anInt8188 - 3] & 0xFF) << 16) + (this.aByteArray77[this.anInt8188 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZJ)V")
	public final void method6871(@OriginalArg(1) long arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 56);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 48);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 40);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 32);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Z")
	public final boolean method6872() {
		this.anInt8188 -= 4;
		@Pc(22) int local22 = Static579.method8021(this.aByteArray77, 0, this.anInt8188);
		@Pc(26) int local26 = this.method6865();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)B")
	public final byte method6873() {
		return (byte) -this.aByteArray77[this.anInt8188++];
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(II)V")
	public final void method6874(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6894(arg0 >>> 28 | 0x80);
					}
					this.method6894(arg0 >>> 21 | 0x80);
				}
				this.method6894(arg0 >>> 14 | 0x80);
			}
			this.method6894(arg0 >>> 7 | 0x80);
		}
		this.method6894(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)I")
	public final int method6875() {
		this.anInt8188 += 3;
		@Pc(49) int local49 = (this.aByteArray77[this.anInt8188 - 1] & 0xFF) + ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8) + ((this.aByteArray77[this.anInt8188 + -3] & 0xFF) << 16);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(II)V")
	public final void method6876(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)J")
	public final long method6877() {
		@Pc(10) long local10 = (long) this.method6865() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6865() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	public final int method6878() {
		this.anInt8188 += 4;
		return ((this.aByteArray77[this.anInt8188 - 3] & 0xFF) << 8) + (((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 24) + ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 16)) + (this.aByteArray77[this.anInt8188 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(B)I")
	public final int method6879() {
		this.anInt8188 += 2;
		return (this.aByteArray77[this.anInt8188 - 2] & 0xFF) + ((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)I")
	public final int method6880() {
		this.anInt8188 += 2;
		@Pc(37) int local37 = ((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(II)V")
	public final void method6882(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method6883(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr2");
		}
		this.aByteArray77[this.anInt8188++] = 0;
		this.anInt8188 += Static163.method3044(arg0.length(), this.aByteArray77, arg0, this.anInt8188);
		this.aByteArray77[this.anInt8188++] = 0;
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)I")
	public final int method6884() {
		this.anInt8188 += 2;
		return (this.aByteArray77[this.anInt8188 - 1] & 0xFF) + ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(II)I")
	public final int method6885(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static579.method8021(this.aByteArray77, arg0, this.anInt8188);
		this.method6864(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(BI)V")
	public final void method6887(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(II)V")
	public final void method6888(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6894(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6854(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method6889() {
		if (this.aByteArray77[this.anInt8188] == 0) {
			this.anInt8188++;
			return null;
		} else {
			return this.method6903();
		}
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(I)J")
	public final long method6890() {
		@Pc(10) long local10 = (long) this.method6878() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6878() & 0xFFFFFFFFL;
		return (local22 << 32) + local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIII)V")
	public final void method6891(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = arg2; local9 < arg1 + arg2; local9++) {
			arg0[local9] = this.aByteArray77[this.anInt8188++];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB[II)V")
	public final void method6892(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt8188;
		this.anInt8188 = arg2;
		@Pc(16) int local16 = (arg0 - arg2) / 8;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(23) int local23 = this.method6865();
			@Pc(27) int local27 = this.method6865();
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = 32;
			while (local33-- > 0) {
				local23 += local29 + arg1[local29 & 0x3] ^ local27 + (local27 >>> 5 ^ local27 << 4);
				local29 += -1640531527;
				local27 += (local23 << 4 ^ local23 >>> 5) + local23 ^ arg1[local29 >>> 11 & 0xA2600003] + local29;
			}
			this.anInt8188 -= 8;
			this.method6864(local23);
			this.method6864(local27);
		}
		this.anInt8188 = local6;
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(B)I")
	public final int method6893() {
		this.anInt8188 += 4;
		return (this.aByteArray77[this.anInt8188 - 3] & 0xFF) + (((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 24) - (-((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 16) - ((this.aByteArray77[this.anInt8188 - 4] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(BI)V")
	public final void method6894(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method6895(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt8188;
		this.anInt8188 = 0;
		@Pc(16) byte[] local16 = new byte[local6];
		this.method6891(local16, local6, 0);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt8188 = 0;
		this.method6854(local35.length);
		this.method6914(0, local35, local35.length);
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "(I)I")
	public final int method6896() {
		this.anInt8188 += 4;
		return ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 16) + ((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 24) + ((this.aByteArray77[this.anInt8188 - 3] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(II)V")
	public final void method6897(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "(I)I")
	public final int method6898() {
		this.anInt8188 += 4;
		return ((this.aByteArray77[this.anInt8188 - 1] & 0xFF) << 8) + ((this.aByteArray77[this.anInt8188 - 4] & 0xFF) << 16) + ((this.aByteArray77[this.anInt8188 - 3] & 0xFF) << 24) + (this.aByteArray77[this.anInt8188 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JII)V")
	public final void method6899(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local0 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> local22);
		}
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(II)V")
	public final void method6900(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)I")
	public final int method6901() {
		@Pc(18) int local18 = this.aByteArray77[this.anInt8188] & 0xFF;
		return local18 < 128 ? this.method6904() - 64 : this.method6884() + -49152;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BI)V")
	public final void method6902(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = arg0 - 1; local5 >= 0; local5--) {
			arg1[local5] = (byte) (this.aByteArray77[this.anInt8188++] - 128);
		}
	}

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method6903() {
		@Pc(6) int local6 = this.anInt8188;
		while (this.aByteArray77[this.anInt8188++] != 0) {
		}
		@Pc(35) int local35 = this.anInt8188 - local6 - 1;
		return local35 == 0 ? "" : Static307.method4720(this.aByteArray77, local35, local6);
	}

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "(I)I")
	public final int method6904() {
		return this.aByteArray77[this.anInt8188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "(I)B")
	public final byte method6905() {
		return (byte) (this.aByteArray77[this.anInt8188++] - 128);
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(II)V")
	public final void method6906(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt8188 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt8188 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt8188 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt8188 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(II)J")
	public final long method6907(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(29) long local29 = 0L;
		while (local22 >= 0) {
			local29 |= ((long) this.aByteArray77[this.anInt8188++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(B)B")
	public final byte method6908() {
		return this.aByteArray77[this.anInt8188++];
	}

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "(I)I")
	public final int method6909() {
		return this.aByteArray77[this.anInt8188++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method6910() {
		@Pc(14) byte local14 = this.aByteArray77[this.anInt8188++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(35) int local35 = this.anInt8188;
		while (this.aByteArray77[this.anInt8188++] != 0) {
		}
		@Pc(55) int local55 = this.anInt8188 - local35 - 1;
		return local55 == 0 ? "" : Static307.method4720(this.aByteArray77, local55, local35);
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(B)I")
	public final int method6911() {
		this.anInt8188 += 2;
		return ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "(II)V")
	public final void method6912(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "(I)I")
	public final int method6913() {
		@Pc(19) byte local19 = this.aByteArray77[this.anInt8188++];
		@Pc(21) int local21 = 0;
		while (local19 < 0) {
			local21 = (local19 & 0x7F | local21) << 7;
			local19 = this.aByteArray77[this.anInt8188++];
		}
		return local21 | local19;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB[BI)V")
	public final void method6914(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = arg0; local1 < arg2 + arg0; local1++) {
			this.aByteArray77[this.anInt8188++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(B)V")
	public final void method6915() {
		if (this.aByteArray77 != null) {
			Static409.method6285(this.aByteArray77);
		}
		this.aByteArray77 = null;
	}

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "(II)V")
	public final void method6916(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 + 128);
		this.aByteArray77[this.anInt8188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "(I)B")
	public final byte method6917() {
		return (byte) (128 - this.aByteArray77[this.anInt8188++]);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method6918(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt8188 += Static163.method3044(arg0.length(), this.aByteArray77, arg0, this.anInt8188);
		this.aByteArray77[this.anInt8188++] = 0;
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(B)I")
	public final int method6919() {
		return 128 - this.aByteArray77[this.anInt8188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(Z)I")
	public final int method6920() {
		this.anInt8188 += 2;
		@Pc(41) int local41 = ((this.aByteArray77[this.anInt8188 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt8188 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}
}
