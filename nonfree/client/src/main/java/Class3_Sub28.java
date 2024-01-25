import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!rba", name = "R", descriptor = "I")
	public int anInt6241 = 0;

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub28(@OriginalArg(0) int arg0) {
		this.aByteArray50 = Static314.method4748(arg0);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "([B)V")
	public Class3_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method5269() {
		@Pc(16) byte local16 = this.aByteArray50[this.anInt6241++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt6241;
		while (this.aByteArray50[this.anInt6241++] != 0) {
		}
		@Pc(55) int local55 = this.anInt6241 - local32 - 1;
		return local55 == 0 ? "" : Static358.method5137(this.aByteArray50, local55, local32);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BI)V")
	public final void method5270(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 + 128);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([BIII)V")
	public final void method5271(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = arg2; local12 < arg2 + arg1; local12++) {
			arg0[local12] = this.aByteArray50[this.anInt6241++];
		}
	}

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "(B)I")
	public final int method5272() {
		this.anInt6241 += 2;
		return ((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8) + (this.aByteArray50[this.anInt6241 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "(II)V")
	public final void method5273(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 24);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI[BI)V")
	public final void method5274(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg0; local3++) {
			this.aByteArray50[this.anInt6241++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "(B)I")
	public final int method5275() {
		if (this.aByteArray50[this.anInt6241] < 0) {
			return Integer.MAX_VALUE & this.method5312();
		} else {
			@Pc(31) int local31 = this.method5272();
			return local31 == 32767 ? -1 : local31;
		}
	}

	@OriginalMember(owner = "client!rba", name = "q", descriptor = "(I)I")
	public final int method5276() {
		@Pc(16) byte local16 = this.aByteArray50[this.anInt6241++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray50[this.anInt6241++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "(I)I")
	public final int method5277() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method5331();
		while (local11 == 32767) {
			local11 = this.method5331();
			local7 += 32767;
		}
		local7 += local11;
		if (32767 != 32767) {
			Static541.aClass371_5 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method5278(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr2");
		}
		this.aByteArray50[this.anInt6241++] = 0;
		this.anInt6241 += Static483.method7052(arg0.length(), this.anInt6241, this.aByteArray50, arg0);
		this.aByteArray50[this.anInt6241++] = 0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I[IBI)V")
	public final void method5279(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt6241;
		this.anInt6241 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(28) int local28 = this.method5312();
			@Pc(32) int local32 = this.method5312();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 - -arg1[local34 >>> 11 & 0x4E800003];
				local34 -= -1640531527;
				local28 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ arg1[local34 & 0x3] + local34;
			}
			this.anInt6241 -= 8;
			this.method5311(local28);
			this.method5311(local32);
		}
		this.anInt6241 = local8;
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(II)V")
	public final void method5280(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "(B)I")
	public final int method5281() {
		this.anInt6241 += 2;
		@Pc(31) int local31 = (this.aByteArray50[this.anInt6241 - 1] & 0xFF) + ((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(BI)V")
	public final void method5282(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5283(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6241 += Static483.method7052(arg0.length(), this.anInt6241, this.aByteArray50, arg0);
		this.aByteArray50[this.anInt6241++] = 0;
	}

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "(II)V")
	public final void method5284(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)I")
	public final int method5285() {
		@Pc(22) int local22 = this.aByteArray50[this.anInt6241] & 0xFF;
		return local22 < 128 ? this.method5322(-121) - 64 : this.method5272() + -49152;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(II)V")
	public final void method5286(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5329(arg0 >>> 28 | 0x80);
					}
					this.method5329(arg0 >>> 21 | 0x80);
				}
				this.method5329(arg0 >>> 14 | 0x80);
			}
			this.method5329(arg0 >>> 7 | 0x80);
		}
		this.method5329(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(I)J")
	public final long method5287() {
		@Pc(10) long local10 = (long) this.method5312() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5312() & 0xFFFFFFFFL;
		return (local10 << 32) + local25;
	}

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "(I)B")
	public final byte method5288() {
		return this.aByteArray50[this.anInt6241++];
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(IB)V")
	public final void method5289(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([IB)V")
	public final void method5290(@OriginalArg(0) int[] arg0) {
		@Pc(15) int local15 = this.anInt6241 / 8;
		this.anInt6241 = 0;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(28) int local28 = this.method5312();
			@Pc(32) int local32 = this.method5312();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= arg0[local34 >>> 11 & 0xF7C00003] + local34 ^ local28 + (local28 >>> 5 ^ local28 << 4);
				local34 -= -1640531527;
				local28 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ arg0[local34 & 0x3] + local34;
			}
			this.anInt6241 -= 8;
			this.method5311(local28);
			this.method5311(local32);
		}
	}

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "(II)V")
	public final void method5291(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(II)V")
	public final void method5292(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "(B)I")
	public final int method5293() {
		return this.aByteArray50[this.anInt6241++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I")
	public final int method5294() {
		this.anInt6241 += 3;
		@Pc(43) int local43 = (this.aByteArray50[this.anInt6241 - 1] & 0xFF) + ((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8) + ((this.aByteArray50[this.anInt6241 + -3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method5295() {
		@Pc(16) int local16 = this.anInt6241;
		while (this.aByteArray50[this.anInt6241++] != 0) {
		}
		@Pc(39) int local39 = this.anInt6241 - local16 - 1;
		return local39 == 0 ? "" : Static358.method5137(this.aByteArray50, local39, local16);
	}

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "(I)Z")
	public final boolean method5296() {
		this.anInt6241 -= 4;
		@Pc(25) int local25 = Static7.method108(0, this.anInt6241, this.aByteArray50);
		@Pc(29) int local29 = this.method5312();
		return local25 == local29;
	}

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "(B)J")
	public final long method5298() {
		@Pc(19) long local19 = (long) this.method5316() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method5316() & 0xFFFFFFFFL;
		return (local26 << 32) + local19;
	}

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "(B)B")
	public final byte method5299() {
		return (byte) (this.aByteArray50[this.anInt6241++] - 128);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(JII)V")
	public final void method5300(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local2 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "(I)I")
	public final int method5301() {
		this.anInt6241 += 2;
		return (this.aByteArray50[this.anInt6241 - 2] & 0xFF) + ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "(II)J")
	public final long method5302(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local6 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray50[this.anInt6241++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "(B)I")
	public final int method5303() {
		this.anInt6241 += 2;
		return (this.aByteArray50[this.anInt6241 - 2] - 128 & 0xFF) + ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(Z)V")
	public final void method5304() {
		if (this.aByteArray50 != null) {
			Static314.method4747(this.aByteArray50);
		}
		this.aByteArray50 = null;
	}

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "(I)I")
	public final int method5305() {
		this.anInt6241 += 2;
		return ((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8) + (this.aByteArray50[this.anInt6241 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method5306() {
		if (this.aByteArray50[this.anInt6241] == 0) {
			this.anInt6241++;
			return null;
		} else {
			return this.method5295();
		}
	}

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "(I)I")
	public final int method5307() {
		this.anInt6241 += 3;
		return ((this.aByteArray50[this.anInt6241 - 3] & 0xFF) << 16) - (-((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8) - (this.aByteArray50[this.anInt6241 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(B)I")
	public final int method5308() {
		return -this.aByteArray50[this.anInt6241++] & 0xFF;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IB)V")
	public final void method5309(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 24);
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method5310(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6241;
		this.anInt6241 = 0;
		@Pc(21) byte[] local21 = new byte[local6];
		this.method5271(local21, local6, 0);
		@Pc(32) BigInteger local32 = new BigInteger(local21);
		@Pc(37) BigInteger local37 = local32.modPow(arg1, arg0);
		@Pc(40) byte[] local40 = local37.toByteArray();
		this.anInt6241 = 0;
		this.method5282(local40.length);
		this.method5274(local40.length, local40, 0);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public final void method5311(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 24);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I")
	public final int method5312() {
		this.anInt6241 += 4;
		return ((this.aByteArray50[this.anInt6241 - 2] & 0xFF) << 8) + (this.aByteArray50[this.anInt6241 - 3] << 16 & 0xFF0000) + ((this.aByteArray50[this.anInt6241 + -4] & 0xFF) << 24) + (this.aByteArray50[this.anInt6241 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "(BI)V")
	public final void method5313(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "(B)I")
	public final int method5314() {
		this.anInt6241 += 4;
		return ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 8) + (this.aByteArray50[this.anInt6241 - 3] << 24 & 0xFF000000) + ((this.aByteArray50[this.anInt6241 - 4] & 0xFF) << 16) + (this.aByteArray50[this.anInt6241 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(BI)V")
	public final void method5315(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "(B)I")
	public final int method5316() {
		this.anInt6241 += 4;
		return ((this.aByteArray50[this.anInt6241 - 3] & 0xFF) << 8) + (this.aByteArray50[this.anInt6241 - 2] << 16 & 0xFF0000) + ((this.aByteArray50[this.anInt6241 + -1] & 0xFF) << 24) + (this.aByteArray50[this.anInt6241 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(BI)V")
	public final void method5317(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(Z)B")
	public final byte method5318() {
		return (byte) (128 - this.aByteArray50[this.anInt6241++]);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IJ)V")
	public final void method5319(@OriginalArg(1) long arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 56);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 48);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 40);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 32);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 24);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (int) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II[II)V")
	public final void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(8) int local8 = this.anInt6241;
		this.anInt6241 = arg1;
		@Pc(17) int local17 = (arg0 - arg1) / 8;
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			@Pc(35) int local35 = this.method5312();
			@Pc(39) int local39 = this.method5312();
			@Pc(41) int local41 = 0;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local35 += local39 + (local39 << 4 ^ local39 >>> 5) ^ local41 - -arg2[local41 & 0x3];
				local41 += -1640531527;
				local39 += arg2[local41 >>> 11 & 0x9C000003] + local41 ^ (local35 >>> 5 ^ local35 << 4) + local35;
			}
			this.anInt6241 -= 8;
			this.method5311(local35);
			this.method5311(local39);
		}
		this.anInt6241 = local8;
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(B)I")
	public final int method5321() {
		this.anInt6241 += 4;
		return (this.aByteArray50[this.anInt6241 - 3] & 0xFF) + ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 16) + ((this.aByteArray50[this.anInt6241 + -2] & 0xFF) << 24) + ((this.aByteArray50[this.anInt6241 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "(I)I")
	public final int method5322(@OriginalArg(0) int arg0) {
		return arg0 >= -6 ? 10 : this.aByteArray50[this.anInt6241++] & 0xFF;
	}

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "(B)I")
	public final int method5323() {
		this.anInt6241 += 4;
		return ((this.aByteArray50[this.anInt6241 - 3] & 0xFF) << 8) + ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 24) + ((this.aByteArray50[this.anInt6241 + -2] & 0xFF) << 16) + (this.aByteArray50[this.anInt6241 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(B)I")
	public final int method5324() {
		this.anInt6241 += 2;
		@Pc(39) int local39 = (this.aByteArray50[this.anInt6241 - 2] & 0xFF) + ((this.aByteArray50[this.anInt6241 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
	public final void method5325(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(IB)V")
	public final void method5326(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray50[this.anInt6241 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray50[this.anInt6241 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(BI)I")
	public final int method5327(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static7.method108(arg0, this.anInt6241, this.aByteArray50);
		this.method5311(local11);
		return local11;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(BI)V")
	public final void method5328(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5329(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5282(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(II)V")
	public final void method5329(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)B")
	public final byte method5330() {
		return (byte) -this.aByteArray50[this.anInt6241++];
	}

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "(I)I")
	public final int method5331() {
		@Pc(11) int local11 = this.aByteArray50[this.anInt6241] & 0xFF;
		return local11 < 128 ? this.method5322(-102) : this.method5272() - 32768;
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(IB)V")
	public final void method5332(@OriginalArg(0) int arg0) {
		this.aByteArray50[this.anInt6241++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "(I)I")
	public final int method5333() {
		return this.aByteArray50[this.anInt6241] >= 0 ? this.method5272() : Integer.MAX_VALUE & this.method5312();
	}

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "(I)I")
	public final int method5334() {
		return 128 - this.aByteArray50[this.anInt6241++] & 0xFF;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)V")
	public final void method5335(@OriginalArg(1) int arg0) {
		this.aByteArray50[this.anInt6241 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray50[this.anInt6241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "(I)J")
	public final long method5336() {
		@Pc(18) long local18 = (long) this.method5322(-107) & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5312() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}
}
