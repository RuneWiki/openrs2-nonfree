import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!np", name = "qb", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	public int anInt6128;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray62 = Static300.method4432(arg0);
		this.anInt6128 = 0;
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62 = arg0;
		this.anInt6128 = 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)B")
	public final byte method5166() {
		return (byte) (128 - this.aByteArray62[this.anInt6128++]);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
	public final void method5167(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 + 128);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)Ljava/lang/String;")
	public final String method5168() {
		if (this.aByteArray62[this.anInt6128] == 0) {
			this.anInt6128++;
			return null;
		} else {
			return this.method5181();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V")
	public final void method5170(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZ)V")
	public final void method5171(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	public final int method5172() {
		@Pc(18) int local18 = this.aByteArray62[this.anInt6128] & 0xFF;
		return local18 < 128 ? this.method5175() - 64 : this.method5198() + -49152;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)B")
	public final byte method5173() {
		return (byte) -this.aByteArray62[this.anInt6128++];
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(B)I")
	public final int method5174() {
		this.anInt6128 += 2;
		return (this.aByteArray62[this.anInt6128 - 1] - 128 & 0xFF) + ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(B)I")
	public final int method5175() {
		return this.aByteArray62[this.anInt6128++] & 0xFF;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(ZI)V")
	public final void method5176(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)V")
	public final void method5177(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)I")
	public final int method5178() {
		this.anInt6128 += 2;
		return ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 8) + (this.aByteArray62[this.anInt6128 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IB)V")
	public final void method5179(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(B)V")
	public final void method5180() {
		if (this.aByteArray62 != null) {
			Static300.method4434(this.aByteArray62);
		}
		this.aByteArray62 = null;
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method5181() {
		@Pc(6) int local6 = this.anInt6128;
		while (this.aByteArray62[this.anInt6128++] != 0) {
		}
		@Pc(29) int local29 = this.anInt6128 - local6 - 1;
		return local29 == 0 ? "" : Static296.method4398(local6, local29, this.aByteArray62);
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(I)I")
	public final int method5182() {
		this.anInt6128 += 2;
		@Pc(38) int local38 = (this.aByteArray62[this.anInt6128 - 2] - 128 & 0xFF) + ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[BB)V")
	public final void method5183(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray62[this.anInt6128++];
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[BII)V")
	public final void method5184(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray62[this.anInt6128++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!np", name = "i", descriptor = "(I)I")
	public final int method5185() {
		return -this.aByteArray62[this.anInt6128++] & 0xFF;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
	public final int method5186() {
		this.anInt6128 += 4;
		return ((this.aByteArray62[this.anInt6128 - 4] & 0xFF) << 24) + ((this.aByteArray62[this.anInt6128 - 3] << 16 & 0xFF0000) + (this.aByteArray62[this.anInt6128 - 2] << 8 & 0xFF00) + (this.aByteArray62[this.anInt6128 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)B")
	public final byte method5187() {
		return (byte) (this.aByteArray62[this.anInt6128++] - 128);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public final void method5188(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method5189(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6128;
		this.anInt6128 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5183(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6128 = 0;
		this.method5200(local31.length);
		this.method5184(local31, local31.length);
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(B)Z")
	public final boolean method5190() {
		this.anInt6128 -= 4;
		@Pc(17) int local17 = Static260.method3992(this.anInt6128, this.aByteArray62, 0);
		@Pc(21) int local21 = this.method5186();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(II)V")
	public final void method5191(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!np", name = "j", descriptor = "(I)I")
	public final int method5192() {
		this.anInt6128 += 3;
		@Pc(44) int local44 = ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8) + (((this.aByteArray62[this.anInt6128 - 3] & 0xFF) << 16) + (this.aByteArray62[this.anInt6128 - 1] & 0xFF));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method5193() {
		@Pc(19) byte local19 = this.aByteArray62[this.anInt6128++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method5207();
		if (this.anInt6128 + local30 > this.aByteArray62.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static468.method6473(this.anInt6128, this.aByteArray62, local30);
		this.anInt6128 += local30;
		return local55;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(IB)V")
	public final void method5194(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5213(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5200(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(Z)I")
	public final int method5195() {
		this.anInt6128 += 3;
		return (this.aByteArray62[this.anInt6128 - 2] & 0xFF) + ((this.aByteArray62[this.anInt6128 - 3] & 0xFF) << 16) + ((this.aByteArray62[this.anInt6128 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(JIZ)V")
	public final void method5196(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local0 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IZ)V")
	public final void method5197(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(B)I")
	public final int method5198() {
		this.anInt6128 += 2;
		return (this.aByteArray62[this.anInt6128 - 1] & 0xFF) + ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)V")
	public final void method5199(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5213(arg0 >>> 28 | 0x80);
					}
					this.method5213(arg0 >>> 21 | 0x80);
				}
				this.method5213(arg0 >>> 14 | 0x80);
			}
			this.method5213(arg0 >>> 7 | 0x80);
		}
		this.method5213(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(II)V")
	public final void method5200(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(ZI)V")
	public final void method5201(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(II)I")
	public final int method5202(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static260.method3992(this.anInt6128, this.aByteArray62, arg0);
		this.method5215(local16);
		return local16;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III[I)V")
	public final void method5203(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt6128;
		this.anInt6128 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method5186();
			@Pc(38) int local38 = this.method5186();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= (local34 >>> 5 ^ local34 << 4) + local34 ^ local40 - -arg1[local40 >>> 11 & 0x3];
				local40 -= -1640531527;
				local34 -= arg1[local40 & 0x3] + local40 ^ (local38 >>> 5 ^ local38 << 4) - -local38;
			}
			this.anInt6128 -= 8;
			this.method5215(local34);
			this.method5215(local38);
		}
		this.anInt6128 = local8;
	}

	@OriginalMember(owner = "client!np", name = "k", descriptor = "(I)I")
	public final int method5204() {
		return this.aByteArray62[this.anInt6128++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!np", name = "i", descriptor = "(B)I")
	public final int method5205() {
		this.anInt6128 += 2;
		return (this.aByteArray62[this.anInt6128 - 2] & 0xFF) + ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!np", name = "j", descriptor = "(B)I")
	public final int method5206() {
		return 128 - this.aByteArray62[this.anInt6128++] & 0xFF;
	}

	@OriginalMember(owner = "client!np", name = "k", descriptor = "(B)I")
	public final int method5207() {
		@Pc(22) byte local22 = this.aByteArray62[this.anInt6128++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local22 & 0x7F | local24) << 7;
			local22 = this.aByteArray62[this.anInt6128++];
		}
		return local24 | local22;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method5208(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static131.method2614(arg0);
		this.aByteArray62[this.anInt6128++] = 0;
		this.method5199(local7);
		this.anInt6128 += Static440.method6173(this.aByteArray62, arg0, this.anInt6128);
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "(I)I")
	public final int method5209() {
		@Pc(17) int local17 = Static260.method3992(this.anInt6128, this.aByteArray62, 0);
		this.method5215(local17);
		return local17;
	}

	@OriginalMember(owner = "client!np", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method5210() {
		@Pc(14) byte local14 = this.aByteArray62[this.anInt6128++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt6128;
		while (this.aByteArray62[this.anInt6128++] != 0) {
		}
		@Pc(53) int local53 = this.anInt6128 - local24 - 1;
		return local53 == 0 ? "" : Static296.method4398(local24, local53, this.aByteArray62);
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(II)V")
	public final void method5211(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt6128 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(Z)B")
	public final byte method5212() {
		return this.aByteArray62[this.anInt6128++];
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(IB)V")
	public final void method5213(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(BI)V")
	public final void method5214(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(BI)V")
	public final void method5215(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(II)J")
	public final long method5216(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(30) int local30 = local2 * 8;
		@Pc(32) long local32 = 0L;
		while (local30 >= 0) {
			local32 |= ((long) this.aByteArray62[this.anInt6128++] & 0xFFL) << local30;
			local30 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(Z)I")
	public final int method5217() {
		@Pc(18) int local18 = this.aByteArray62[this.anInt6128] & 0xFF;
		return local18 >= 128 ? this.method5198() - 32768 : this.method5175();
	}

	@OriginalMember(owner = "client!np", name = "n", descriptor = "(I)I")
	public final int method5218() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method5217();
		while (local11 == 32767) {
			local11 = this.method5217();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!np", name = "o", descriptor = "(I)I")
	public final int method5219() {
		this.anInt6128 += 4;
		return ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 24) + ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 16) + ((this.aByteArray62[this.anInt6128 + -3] & 0xFF) << 8) + (this.aByteArray62[this.anInt6128 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "(B)I")
	public final int method5220() {
		this.anInt6128 += 2;
		@Pc(41) int local41 = ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8) + (this.aByteArray62[this.anInt6128 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!np", name = "p", descriptor = "(I)I")
	public final int method5221() {
		this.anInt6128 += 4;
		return ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 16) + (((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 24) + (this.aByteArray62[this.anInt6128 - 3] << 8 & 0xFF00)) + (this.aByteArray62[this.anInt6128 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(II)V")
	public final void method5222(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(IB)V")
	public final void method5223(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(ZI)V")
	public final void method5224(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BJ)V")
	public final void method5225(@OriginalArg(1) long arg0) {
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 56);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 48);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 40);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 32);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt6128++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt6128++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!np", name = "q", descriptor = "(I)J")
	public final long method5226() {
		@Pc(15) long local15 = (long) this.method5186() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5186() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(BLjava/lang/String;)V")
	public final void method5227(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt6128 += Static239.method3676(this.aByteArray62, arg0.length(), this.anInt6128, arg0);
		this.aByteArray62[this.anInt6128++] = 0;
	}

	@OriginalMember(owner = "client!np", name = "m", descriptor = "(B)I")
	public final int method5228() {
		this.anInt6128 += 4;
		return ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 8) + ((this.aByteArray62[this.anInt6128 - 3] & 0xFF) << 24) + ((this.aByteArray62[this.anInt6128 + -4] & 0xFF) << 16) + (this.aByteArray62[this.anInt6128 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!np", name = "r", descriptor = "(I)I")
	public final int method5229() {
		this.anInt6128 += 4;
		return ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 24) + ((this.aByteArray62[this.anInt6128 - 1] & 0xFF) << 16) + ((this.aByteArray62[this.anInt6128 + -4] & 0xFF) << 8) + (this.aByteArray62[this.anInt6128 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!np", name = "s", descriptor = "(I)I")
	public final int method5230() {
		this.anInt6128 += 3;
		return (this.aByteArray62[this.anInt6128 - 1] & 0xFF) + (((this.aByteArray62[this.anInt6128 - 3] & 0xFF) << 16) + ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!np", name = "t", descriptor = "(I)I")
	public final int method5231() {
		this.anInt6128 += 2;
		@Pc(31) int local31 = (this.aByteArray62[this.anInt6128 - 1] & 0xFF) + ((this.aByteArray62[this.anInt6128 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}
}
