import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class26 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[Lclient!ou;")
	public Class261[] aClass261Array1;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "[Lclient!oga;")
	public Class257[] aClass257Array1;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[Lclient!sn;")
	public Class320[] aClass320Array1;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!b", name = "db", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "B")
	public byte aByte6 = 0;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	public int anInt386 = 0;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "I")
	public int anInt390 = 0;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public int anInt377 = 0;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
	public int anInt393 = 12;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public int anInt382 = 0;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	private Class26() {
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class26(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method341(arg0);
		} else {
			this.method344(arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(III)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray4 = new byte[arg1];
		this.anIntArray23 = new int[arg1];
		this.anIntArray22 = new int[arg0];
		this.anIntArray26 = new int[arg0];
		this.aByteArray9 = new byte[arg1];
		this.aShortArray16 = new short[arg1];
		this.aShortArray9 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray24 = new int[arg2];
			this.anIntArray18 = new int[arg2];
			this.aByteArray8 = new byte[arg2];
			this.aByteArray6 = new byte[arg2];
			this.anIntArray25 = new int[arg2];
			this.anIntArray21 = new int[arg2];
			this.anIntArray15 = new int[arg2];
			this.aShortArray12 = new short[arg2];
			this.aShortArray10 = new short[arg2];
			this.aByteArray5 = new byte[arg2];
			this.aShortArray13 = new short[arg2];
			this.anIntArray19 = new int[arg2];
		}
		this.aShortArray15 = new short[arg1];
		this.anIntArray16 = new int[arg0];
		this.aByteArray7 = new byte[arg1];
		this.aByteArray10 = new byte[arg1];
		this.aShortArray17 = new short[arg1];
		this.aShortArray18 = new short[arg1];
		this.anIntArray17 = new int[arg0];
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([Lclient!b;I)V")
	public Class26(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) int arg1) {
		this.anInt390 = 0;
		this.anInt382 = 0;
		this.anInt386 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte6 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class26 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt390 += local59.anInt390;
				this.anInt382 += local59.anInt382;
				this.anInt386 += local59.anInt386;
				local38 |= local59.aByteArray7 != null;
				if (local59.aClass320Array1 != null) {
					local34 += local59.aClass320Array1.length;
				}
				if (local59.aClass257Array1 != null) {
					local36 += local59.aClass257Array1.length;
				}
				if (local59.aClass261Array1 != null) {
					local32 += local59.aClass261Array1.length;
				}
				local42 |= local59.aByteArray10 != null;
				local46 |= local59.aShortArray16 != null;
				local44 |= local59.aByteArray9 != null;
				if (local59.aByteArray4 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local59.aByte6;
					}
					if (this.aByte6 != local59.aByte6) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local48 |= local59.anIntArray23 != null;
			}
		}
		this.aShortArray14 = new short[this.anInt386];
		if (this.anInt382 > 0) {
			this.aShortArray12 = new short[this.anInt382];
			this.aShortArray13 = new short[this.anInt382];
			this.aByteArray6 = new byte[this.anInt382];
			this.anIntArray18 = new int[this.anInt382];
			this.anIntArray21 = new int[this.anInt382];
			this.anIntArray24 = new int[this.anInt382];
			this.aByteArray5 = new byte[this.anInt382];
			this.aShortArray10 = new short[this.anInt382];
			this.anIntArray19 = new int[this.anInt382];
			this.anIntArray25 = new int[this.anInt382];
			this.anIntArray15 = new int[this.anInt382];
			this.aByteArray8 = new byte[this.anInt382];
		}
		this.aShortArray15 = new short[this.anInt390];
		this.aShortArray17 = new short[this.anInt390];
		if (local36 > 0) {
			this.aClass257Array1 = new Class257[local36];
		}
		if (local38) {
			this.aByteArray7 = new byte[this.anInt390];
		}
		this.anIntArray16 = new int[this.anInt386];
		if (local42) {
			this.aByteArray10 = new byte[this.anInt390];
		}
		if (local48) {
			this.anIntArray23 = new int[this.anInt390];
		}
		this.aShortArray9 = new short[this.anInt390];
		if (local44) {
			this.aByteArray9 = new byte[this.anInt390];
		}
		this.anIntArray22 = new int[this.anInt386];
		if (local32 > 0) {
			this.aClass261Array1 = new Class261[local32];
		}
		if (local46) {
			this.aShortArray16 = new short[this.anInt390];
		}
		if (local34 > 0) {
			this.aClass320Array1 = new Class320[local34];
		}
		this.aShortArray18 = new short[this.anInt390];
		this.anIntArray17 = new int[this.anInt386];
		this.anIntArray26 = new int[this.anInt386];
		if (local40) {
			this.aByteArray4 = new byte[this.anInt390];
		}
		this.aShortArray11 = new short[this.anInt390];
		this.anInt386 = 0;
		this.anInt390 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt382 = 0;
		local34 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class26 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass257Array1 != null) {
					for (local398 = 0; local398 < local391.aClass257Array1.length; local398++) {
						@Pc(405) Class257 local405 = local391.aClass257Array1[local398];
						this.aClass257Array1[local36++] = local405.method5973(local405.anInt6698 + this.anInt390);
					}
				}
				for (local398 = 0; local398 < local391.anInt390; local398++) {
					if (local38 && local391.aByteArray7 != null) {
						this.aByteArray7[this.anInt390] = local391.aByteArray7[local398];
					}
					if (local40) {
						if (local391.aByteArray4 == null) {
							this.aByteArray4[this.anInt390] = local391.aByte6;
						} else {
							this.aByteArray4[this.anInt390] = local391.aByteArray4[local398];
						}
					}
					if (local42 && local391.aByteArray10 != null) {
						this.aByteArray10[this.anInt390] = local391.aByteArray10[local398];
					}
					if (local46) {
						if (local391.aShortArray16 == null) {
							this.aShortArray16[this.anInt390] = -1;
						} else {
							this.aShortArray16[this.anInt390] = local391.aShortArray16[local398];
						}
					}
					if (local48) {
						if (local391.anIntArray23 == null) {
							this.anIntArray23[this.anInt390] = -1;
						} else {
							this.anIntArray23[this.anInt390] = local391.anIntArray23[local398];
						}
					}
					this.aShortArray9[this.anInt390] = (short) this.method332(local387, local391.aShortArray9[local398], local391);
					this.aShortArray17[this.anInt390] = (short) this.method332(local387, local391.aShortArray17[local398], local391);
					this.aShortArray18[this.anInt390] = (short) this.method332(local387, local391.aShortArray18[local398], local391);
					this.aShortArray11[this.anInt390] = local387;
					this.aShortArray15[this.anInt390] = local391.aShortArray15[local398];
					this.anInt390++;
				}
				@Pc(603) int local603;
				if (local391.aClass261Array1 != null) {
					for (local603 = 0; local603 < local391.aClass261Array1.length; local603++) {
						local616 = this.method332(local387, local391.aClass261Array1[local603].anInt7181, local391);
						local627 = this.method332(local387, local391.aClass261Array1[local603].anInt7170, local391);
						@Pc(638) int local638 = this.method332(local387, local391.aClass261Array1[local603].anInt7167, local391);
						this.aClass261Array1[local32] = local391.aClass261Array1[local603].method6337(local616, local638, local627);
						local32++;
					}
				}
				if (local391.aClass320Array1 != null) {
					for (local603 = 0; local603 < local391.aClass320Array1.length; local603++) {
						local616 = this.method332(local387, local391.aClass320Array1[local603].anInt8924, local391);
						this.aClass320Array1[local34] = local391.aClass320Array1[local603].method7682(local616);
						local34++;
					}
				}
			}
		}
		this.anInt377 = this.anInt386;
		@Pc(716) int local716 = 0;
		for (@Pc(718) int local718 = 0; local718 < arg1; local718++) {
			@Pc(725) short local725 = (short) (0x1 << local718);
			@Pc(729) Class26 local729 = arg0[local718];
			if (local729 != null) {
				for (local616 = 0; local616 < local729.anInt390; local616++) {
					if (local44) {
						this.aByteArray9[local716++] = (byte) (local729.aByteArray9 == null || local729.aByteArray9[local616] == -1 ? -1 : local729.aByteArray9[local616] + this.anInt382);
					}
				}
				for (local627 = 0; local627 < local729.anInt382; local627++) {
					@Pc(786) byte local786 = this.aByteArray5[this.anInt382] = local729.aByteArray5[local627];
					if (local786 == 0) {
						this.aShortArray13[this.anInt382] = (short) this.method332(local725, local729.aShortArray13[local627], local729);
						this.aShortArray12[this.anInt382] = (short) this.method332(local725, local729.aShortArray12[local627], local729);
						this.aShortArray10[this.anInt382] = (short) this.method332(local725, local729.aShortArray10[local627], local729);
					}
					if (local786 >= 1 && local786 <= 3) {
						this.aShortArray13[this.anInt382] = local729.aShortArray13[local627];
						this.aShortArray12[this.anInt382] = local729.aShortArray12[local627];
						this.aShortArray10[this.anInt382] = local729.aShortArray10[local627];
						this.anIntArray24[this.anInt382] = local729.anIntArray24[local627];
						this.anIntArray25[this.anInt382] = local729.anIntArray25[local627];
						this.anIntArray19[this.anInt382] = local729.anIntArray19[local627];
						this.aByteArray6[this.anInt382] = local729.aByteArray6[local627];
						this.aByteArray8[this.anInt382] = local729.aByteArray8[local627];
						this.anIntArray21[this.anInt382] = local729.anIntArray21[local627];
					}
					if (local786 == 2) {
						this.anIntArray15[this.anInt382] = local729.anIntArray15[local627];
						this.anIntArray18[this.anInt382] = local729.anIntArray18[local627];
					}
					this.anInt382++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(SBBSSSSBBS)B")
	public byte method330() {
		if (this.anInt382 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray5[this.anInt382] = 3;
		this.aShortArray13[this.anInt382] = 0;
		this.aShortArray12[this.anInt382] = 32767;
		this.aShortArray10[this.anInt382] = 0;
		this.anIntArray24[this.anInt382] = 1024;
		this.anIntArray25[this.anInt382] = 1024;
		this.anIntArray19[this.anInt382] = 1024;
		this.aByteArray6[this.anInt382] = 0;
		this.aByteArray8[this.anInt382] = 0;
		this.anIntArray21[this.anInt382] = 0;
		return (byte) this.anInt382++;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BSS)V")
	public void method331(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt390; local9++) {
			if (arg0 == this.aShortArray15[local9]) {
				this.aShortArray15[local9] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(SILclient!b;B)I")
	private int method332(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2) {
		@Pc(10) int local10 = arg2.anIntArray16[arg1];
		@Pc(15) int local15 = arg2.anIntArray22[arg1];
		@Pc(29) int local29 = arg2.anIntArray17[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt386; local31++) {
			if (local10 == this.anIntArray16[local31] && local15 == this.anIntArray22[local31] && this.anIntArray17[local31] == local29) {
				this.aShortArray14[local31] |= arg0;
				return local31;
			}
		}
		this.anIntArray16[this.anInt386] = local10;
		this.anIntArray22[this.anInt386] = local15;
		this.anIntArray17[this.anInt386] = local29;
		this.aShortArray14[this.anInt386] = arg0;
		this.anIntArray26[this.anInt386] = arg2.anIntArray26 == null ? -1 : arg2.anIntArray26[arg1];
		return this.anInt386++;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
	public void method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(36) int local36;
		if (arg0 != 0) {
			local11 = Class377.anIntArray600[arg0];
			local15 = Class377.anIntArray601[arg0];
			for (local17 = 0; local17 < this.anInt386; local17++) {
				local36 = this.anIntArray22[local17] * local11 + local15 * this.anIntArray16[local17] >> 14;
				this.anIntArray22[local17] = local15 * this.anIntArray22[local17] - local11 * this.anIntArray16[local17] >> 14;
				this.anIntArray16[local17] = local36;
			}
		}
		if (arg2 != 0) {
			local11 = Class377.anIntArray600[arg2];
			local15 = Class377.anIntArray601[arg2];
			for (local17 = 0; local17 < this.anInt386; local17++) {
				local36 = local15 * this.anIntArray22[local17] - local11 * this.anIntArray17[local17] >> 14;
				this.anIntArray17[local17] = this.anIntArray22[local17] * local11 + this.anIntArray17[local17] * local15 >> 14;
				this.anIntArray22[local17] = local36;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class377.anIntArray600[arg1];
		local15 = Class377.anIntArray601[arg1];
		for (local17 = 0; local17 < this.anInt386; local17++) {
			local36 = this.anIntArray16[local17] * local15 + local11 * this.anIntArray17[local17] >> 14;
			this.anIntArray17[local17] = this.anIntArray17[local17] * local15 - local11 * this.anIntArray16[local17] >> 14;
			this.anIntArray16[local17] = local36;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public void method335() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt386; local7++) {
			this.anIntArray16[local7] <<= 0x2;
			this.anIntArray22[local7] <<= 0x2;
			this.anIntArray17[local7] <<= 0x2;
		}
		if (this.anInt382 <= 0 || this.anIntArray24 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray24.length; local52++) {
			this.anIntArray24[local52] <<= 0x2;
			this.anIntArray25[local52] <<= 0x2;
			if (this.aByteArray5[local52] != 1) {
				this.anIntArray19[local52] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBI)V")
	public void method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt386; local7++) {
			this.anIntArray16[local7] += arg0;
			this.anIntArray22[local7] += arg1;
			this.anIntArray17[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)[[I")
	public int[][] method337() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt390; local12++) {
			@Pc(25) int local25 = this.anIntArray23[local12];
			if (local25 >= 0) {
				@Pc(34) int local34 = local8[local25]++;
				if (local10 < local25) {
					local10 = local25;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt390; local81++) {
			@Pc(88) int local88 = this.anIntArray23[local81];
			if (local88 >= 0) {
				local60[local88][local8[local88]++] = local81;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIII)I")
	public int method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt386; local7++) {
			if (this.anIntArray16[local7] == arg1 && arg2 == this.anIntArray22[local7] && arg0 == this.anIntArray17[local7]) {
				return local7;
			}
		}
		this.anIntArray16[this.anInt386] = arg1;
		this.anIntArray22[this.anInt386] = arg2;
		this.anIntArray17[this.anInt386] = arg0;
		this.anInt377 = this.anInt386 + 1;
		return this.anInt386++;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(BZ)[[I")
	public int[][] method340(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg0 ? this.anInt386 : this.anInt377;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(32) int local32 = this.anIntArray26[local25];
			if (local32 >= 0) {
				if (local32 > local15) {
					local15 = local32;
				}
				@Pc(47) int local47 = local8[local32]++;
			}
		}
		@Pc(63) int[][] local63 = new int[local15 + 1][];
		for (@Pc(65) int local65 = 0; local65 <= local15; local65++) {
			local63[local65] = new int[local8[local65]];
			local8[local65] = 0;
		}
		for (@Pc(88) int local88 = 0; local88 < local23; local88++) {
			@Pc(95) int local95 = this.anIntArray26[local88];
			if (local95 >= 0) {
				local63[local95][local8[local95]++] = local88;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)V")
	private void method341(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class5_Sub22 local10 = new Class5_Sub22(arg0);
		@Pc(15) Class5_Sub22 local15 = new Class5_Sub22(arg0);
		@Pc(20) Class5_Sub22 local20 = new Class5_Sub22(arg0);
		@Pc(25) Class5_Sub22 local25 = new Class5_Sub22(arg0);
		@Pc(30) Class5_Sub22 local30 = new Class5_Sub22(arg0);
		@Pc(35) Class5_Sub22 local35 = new Class5_Sub22(arg0);
		@Pc(40) Class5_Sub22 local40 = new Class5_Sub22(arg0);
		local10.anInt6629 = arg0.length - 23;
		this.anInt386 = local10.method5968();
		this.anInt390 = local10.method5968();
		this.anInt382 = local10.method5966();
		@Pc(65) int local65 = local10.method5966();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt6629 -= 7;
			this.anInt393 = local10.method5966();
			local10.anInt6629 += 6;
		}
		@Pc(128) int local128 = local10.method5966();
		@Pc(132) int local132 = local10.method5966();
		@Pc(136) int local136 = local10.method5966();
		@Pc(140) int local140 = local10.method5966();
		@Pc(144) int local144 = local10.method5966();
		@Pc(148) int local148 = local10.method5968();
		@Pc(152) int local152 = local10.method5968();
		@Pc(156) int local156 = local10.method5968();
		@Pc(160) int local160 = local10.method5968();
		@Pc(173) int local173 = local10.method5968();
		@Pc(175) int local175 = 0;
		@Pc(177) int local177 = 0;
		@Pc(179) int local179 = 0;
		@Pc(192) int local192;
		if (this.anInt382 > 0) {
			this.aByteArray5 = new byte[this.anInt382];
			local10.anInt6629 = 0;
			for (local192 = 0; local192 < this.anInt382; local192++) {
				@Pc(203) byte local203 = this.aByteArray5[local192] = local10.method5963();
				if (local203 == 2) {
					local179++;
				}
				if (local203 >= 1 && local203 <= 3) {
					local177++;
				}
				if (local203 == 0) {
					local175++;
				}
			}
		}
		local192 = this.anInt382;
		@Pc(236) int local236 = local192;
		local192 += this.anInt386;
		@Pc(243) int local243 = local192;
		if (local76) {
			local192 += this.anInt390;
		}
		@Pc(252) int local252 = local192;
		local192 += this.anInt390;
		@Pc(259) int local259 = local192;
		if (local128 == 255) {
			local192 += this.anInt390;
		}
		@Pc(271) int local271 = local192;
		if (local136 == 1) {
			local192 += this.anInt390;
		}
		@Pc(283) int local283 = local192;
		if (local144 == 1) {
			local192 += this.anInt386;
		}
		@Pc(295) int local295 = local192;
		if (local132 == 1) {
			local192 += this.anInt390;
		}
		@Pc(307) int local307 = local192;
		local192 += local160;
		@Pc(313) int local313 = local192;
		if (local140 == 1) {
			local192 += this.anInt390 * 2;
		}
		@Pc(327) int local327 = local192;
		local192 += local173;
		@Pc(333) int local333 = local192;
		local192 += this.anInt390 * 2;
		@Pc(342) int local342 = local192;
		local192 += local148;
		@Pc(348) int local348 = local192;
		local192 += local152;
		@Pc(354) int local354 = local192;
		local192 += local156;
		@Pc(360) int local360 = local192;
		local192 += local175 * 6;
		@Pc(368) int local368 = local192;
		local192 += local177 * 6;
		@Pc(376) byte local376 = 6;
		if (this.anInt393 == 14) {
			local376 = 7;
		} else if (this.anInt393 >= 15) {
			local376 = 9;
		}
		@Pc(394) int local394 = local192;
		local192 += local376 * local177;
		@Pc(402) int local402 = local192;
		local192 += local177;
		@Pc(408) int local408 = local192;
		local192 += local177;
		@Pc(414) int local414 = local192;
		local192 += local179 * 2 + local177;
		if (local144 == 1) {
			this.anIntArray26 = new int[this.anInt386];
		}
		if (local76) {
			this.aByteArray7 = new byte[this.anInt390];
		}
		this.aShortArray18 = new short[this.anInt390];
		if (local132 == 1) {
			this.aByteArray10 = new byte[this.anInt390];
		}
		this.anIntArray17 = new int[this.anInt386];
		this.aShortArray9 = new short[this.anInt390];
		this.anIntArray16 = new int[this.anInt386];
		if (local140 == 1) {
			this.aShortArray16 = new short[this.anInt390];
		}
		local10.anInt6629 = local236;
		this.aShortArray17 = new short[this.anInt390];
		if (local140 == 1 && this.anInt382 > 0) {
			this.aByteArray9 = new byte[this.anInt390];
		}
		if (local128 == 255) {
			this.aByteArray4 = new byte[this.anInt390];
		} else {
			this.aByte6 = (byte) local128;
		}
		this.aShortArray15 = new short[this.anInt390];
		if (local136 == 1) {
			this.anIntArray23 = new int[this.anInt390];
		}
		if (this.anInt382 > 0) {
			this.aShortArray10 = new short[this.anInt382];
			this.aShortArray13 = new short[this.anInt382];
			this.aShortArray12 = new short[this.anInt382];
			if (local179 > 0) {
				this.anIntArray18 = new int[local179];
				this.anIntArray15 = new int[local179];
			}
			if (local177 > 0) {
				this.aByteArray6 = new byte[local177];
				this.anIntArray25 = new int[local177];
				this.aByteArray8 = new byte[local177];
				this.anIntArray19 = new int[local177];
				this.anIntArray24 = new int[local177];
				this.anIntArray21 = new int[local177];
			}
		}
		this.anIntArray22 = new int[this.anInt386];
		local15.anInt6629 = local342;
		local20.anInt6629 = local348;
		local25.anInt6629 = local354;
		local30.anInt6629 = local283;
		@Pc(603) int local603 = 0;
		@Pc(605) int local605 = 0;
		@Pc(607) int local607 = 0;
		@Pc(617) int local617;
		for (@Pc(609) int local609 = 0; local609 < this.anInt386; local609++) {
			local617 = local10.method5966();
			@Pc(619) int local619 = 0;
			if ((local617 & 0x1) != 0) {
				local619 = local15.method5964();
			}
			@Pc(632) int local632 = 0;
			if ((local617 & 0x2) != 0) {
				local632 = local20.method5964();
			}
			@Pc(642) int local642 = 0;
			if ((local617 & 0x4) != 0) {
				local642 = local25.method5964();
			}
			this.anIntArray16[local609] = local603 + local619;
			this.anIntArray22[local609] = local632 + local605;
			this.anIntArray17[local609] = local642 + local607;
			local603 = this.anIntArray16[local609];
			local607 = this.anIntArray17[local609];
			local605 = this.anIntArray22[local609];
			if (local144 == 1) {
				this.anIntArray26[local609] = local30.method5966();
			}
		}
		local10.anInt6629 = local333;
		local15.anInt6629 = local243;
		local20.anInt6629 = local259;
		local25.anInt6629 = local295;
		local30.anInt6629 = local271;
		local35.anInt6629 = local313;
		local40.anInt6629 = local327;
		for (local617 = 0; local617 < this.anInt390; local617++) {
			this.aShortArray15[local617] = (short) local10.method5968();
			if (local76) {
				this.aByteArray7[local617] = local15.method5963();
			}
			if (local128 == 255) {
				this.aByteArray4[local617] = local20.method5963();
			}
			if (local132 == 1) {
				this.aByteArray10[local617] = local25.method5963();
			}
			if (local136 == 1) {
				this.anIntArray23[local617] = local30.method5966();
			}
			if (local140 == 1) {
				this.aShortArray16[local617] = (short) (local35.method5968() - 1);
			}
			if (this.aByteArray9 != null) {
				if (this.aShortArray16[local617] == -1) {
					this.aByteArray9[local617] = -1;
				} else {
					this.aByteArray9[local617] = (byte) (local40.method5966() - 1);
				}
			}
		}
		this.anInt377 = -1;
		local10.anInt6629 = local307;
		local15.anInt6629 = local252;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(852) int local852;
		for (@Pc(846) int local846 = 0; local846 < this.anInt390; local846++) {
			local852 = local15.method5966();
			if (local852 == 1) {
				local838 = (short) (local844 + local10.method5964());
				local840 = (short) (local10.method5964() + local838);
				local842 = (short) (local10.method5964() + local840);
				local844 = local842;
				this.aShortArray9[local846] = local838;
				this.aShortArray17[local846] = local840;
				this.aShortArray18[local846] = local842;
				if (this.anInt377 < local838) {
					this.anInt377 = local838;
				}
				if (this.anInt377 < local840) {
					this.anInt377 = local840;
				}
				if (this.anInt377 < local842) {
					this.anInt377 = local842;
				}
			}
			if (local852 == 2) {
				local840 = local842;
				local842 = (short) (local844 + local10.method5964());
				this.aShortArray9[local846] = local838;
				local844 = local842;
				this.aShortArray17[local846] = local840;
				this.aShortArray18[local846] = local842;
				if (local842 > this.anInt377) {
					this.anInt377 = local842;
				}
			}
			if (local852 == 3) {
				local838 = local842;
				local842 = (short) (local10.method5964() + local844);
				local844 = local842;
				this.aShortArray9[local846] = local838;
				this.aShortArray17[local846] = local840;
				this.aShortArray18[local846] = local842;
				if (this.anInt377 < local842) {
					this.anInt377 = local842;
				}
			}
			if (local852 == 4) {
				@Pc(1009) short local1009 = local838;
				local838 = local840;
				local840 = local1009;
				local842 = (short) (local10.method5964() + local844);
				local844 = local842;
				this.aShortArray9[local846] = local838;
				this.aShortArray17[local846] = local1009;
				this.aShortArray18[local846] = local842;
				if (local842 > this.anInt377) {
					this.anInt377 = local842;
				}
			}
		}
		local10.anInt6629 = local360;
		this.anInt377++;
		local15.anInt6629 = local368;
		local20.anInt6629 = local394;
		local25.anInt6629 = local402;
		local30.anInt6629 = local408;
		local35.anInt6629 = local414;
		@Pc(1086) int local1086;
		for (local852 = 0; local852 < this.anInt382; local852++) {
			local1086 = this.aByteArray5[local852] & 0xFF;
			if (local1086 == 0) {
				this.aShortArray13[local852] = (short) local10.method5968();
				this.aShortArray12[local852] = (short) local10.method5968();
				this.aShortArray10[local852] = (short) local10.method5968();
			}
			if (local1086 == 1) {
				this.aShortArray13[local852] = (short) local15.method5968();
				this.aShortArray12[local852] = (short) local15.method5968();
				this.aShortArray10[local852] = (short) local15.method5968();
				if (this.anInt393 < 15) {
					this.anIntArray24[local852] = local20.method5968();
					if (this.anInt393 >= 14) {
						this.anIntArray25[local852] = local20.method5931();
					} else {
						this.anIntArray25[local852] = local20.method5968();
					}
					this.anIntArray19[local852] = local20.method5968();
				} else {
					this.anIntArray24[local852] = local20.method5931();
					this.anIntArray25[local852] = local20.method5931();
					this.anIntArray19[local852] = local20.method5931();
				}
				this.aByteArray6[local852] = local25.method5963();
				this.aByteArray8[local852] = local30.method5963();
				this.anIntArray21[local852] = local35.method5963();
			}
			if (local1086 == 2) {
				this.aShortArray13[local852] = (short) local15.method5968();
				this.aShortArray12[local852] = (short) local15.method5968();
				this.aShortArray10[local852] = (short) local15.method5968();
				if (this.anInt393 >= 15) {
					this.anIntArray24[local852] = local20.method5931();
					this.anIntArray25[local852] = local20.method5931();
					this.anIntArray19[local852] = local20.method5931();
				} else {
					this.anIntArray24[local852] = local20.method5968();
					if (this.anInt393 < 14) {
						this.anIntArray25[local852] = local20.method5968();
					} else {
						this.anIntArray25[local852] = local20.method5931();
					}
					this.anIntArray19[local852] = local20.method5968();
				}
				this.aByteArray6[local852] = local25.method5963();
				this.aByteArray8[local852] = local30.method5963();
				this.anIntArray21[local852] = local35.method5963();
				this.anIntArray15[local852] = local35.method5963();
				this.anIntArray18[local852] = local35.method5963();
			}
			if (local1086 == 3) {
				this.aShortArray13[local852] = (short) local15.method5968();
				this.aShortArray12[local852] = (short) local15.method5968();
				this.aShortArray10[local852] = (short) local15.method5968();
				if (this.anInt393 >= 15) {
					this.anIntArray24[local852] = local20.method5931();
					this.anIntArray25[local852] = local20.method5931();
					this.anIntArray19[local852] = local20.method5931();
				} else {
					this.anIntArray24[local852] = local20.method5968();
					if (this.anInt393 >= 14) {
						this.anIntArray25[local852] = local20.method5931();
					} else {
						this.anIntArray25[local852] = local20.method5968();
					}
					this.anIntArray19[local852] = local20.method5968();
				}
				this.aByteArray6[local852] = local25.method5963();
				this.aByteArray8[local852] = local30.method5963();
				this.anIntArray21[local852] = local35.method5963();
			}
		}
		local10.anInt6629 = local192;
		@Pc(1496) int local1496;
		@Pc(1502) int local1502;
		@Pc(1506) int local1506;
		@Pc(1571) int local1571;
		if (local85) {
			local1086 = local10.method5966();
			if (local1086 > 0) {
				this.aClass261Array1 = new Class261[local1086];
				for (local1496 = 0; local1496 < local1086; local1496++) {
					local1502 = local10.method5968();
					local1506 = local10.method5968();
					@Pc(1514) byte local1514;
					if (local128 == 255) {
						local1514 = this.aByteArray4[local1506];
					} else {
						local1514 = (byte) local128;
					}
					this.aClass261Array1[local1496] = new Class261(local1502, this.aShortArray9[local1506], this.aShortArray17[local1506], this.aShortArray18[local1506], local1514);
				}
			}
			local1496 = local10.method5966();
			if (local1496 > 0) {
				this.aClass320Array1 = new Class320[local1496];
				for (local1502 = 0; local1502 < local1496; local1502++) {
					local1506 = local10.method5968();
					local1571 = local10.method5968();
					this.aClass320Array1[local1502] = new Class320(local1506, local1571);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1086 = local10.method5966();
		if (local1086 <= 0) {
			return;
		}
		this.aClass257Array1 = new Class257[local1086];
		for (local1496 = 0; local1496 < local1086; local1496++) {
			local1502 = local10.method5968();
			local1506 = local10.method5968();
			local1571 = local10.method5966();
			@Pc(1616) byte local1616 = local10.method5963();
			this.aClass257Array1[local1496] = new Class257(local1502, local1506, local1571, local1616);
		}
		return;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(SSB)V")
	public void method342(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray16 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt390; local11++) {
			if (arg1 == this.aShortArray16[local11]) {
				this.aShortArray16[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(SIZIIBBBS)I")
	public int method343(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray9[this.anInt390] = (short) arg2;
		this.aShortArray17[this.anInt390] = (short) arg3;
		this.aShortArray18[this.anInt390] = (short) arg1;
		this.aByteArray7[this.anInt390] = arg4;
		this.aByteArray9[this.anInt390] = arg6;
		this.aShortArray15[this.anInt390] = arg0;
		this.aByteArray10[this.anInt390] = arg5;
		this.aShortArray16[this.anInt390] = arg7;
		return this.anInt390++;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B[B)V")
	private void method344(@OriginalArg(1) byte[] arg0) {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(20) Class5_Sub22 local20 = new Class5_Sub22(arg0);
		@Pc(25) Class5_Sub22 local25 = new Class5_Sub22(arg0);
		@Pc(30) Class5_Sub22 local30 = new Class5_Sub22(arg0);
		@Pc(35) Class5_Sub22 local35 = new Class5_Sub22(arg0);
		@Pc(40) Class5_Sub22 local40 = new Class5_Sub22(arg0);
		local20.anInt6629 = arg0.length - 18;
		this.anInt386 = local20.method5968();
		this.anInt390 = local20.method5968();
		this.anInt382 = local20.method5966();
		@Pc(65) int local65 = local20.method5966();
		@Pc(69) int local69 = local20.method5966();
		@Pc(73) int local73 = local20.method5966();
		@Pc(77) int local77 = local20.method5966();
		@Pc(81) int local81 = local20.method5966();
		@Pc(85) int local85 = local20.method5968();
		@Pc(89) int local89 = local20.method5968();
		@Pc(93) int local93 = local20.method5968();
		@Pc(97) int local97 = local20.method5968();
		@Pc(106) int local106 = this.anInt386;
		@Pc(108) int local108 = local106;
		local106 += this.anInt390;
		@Pc(115) int local115 = local106;
		if (local69 == 255) {
			local106 += this.anInt390;
		}
		@Pc(125) int local125 = local106;
		if (local77 == 1) {
			local106 += this.anInt390;
		}
		@Pc(135) int local135 = local106;
		if (local65 == 1) {
			local106 += this.anInt390;
		}
		@Pc(147) int local147 = local106;
		if (local81 == 1) {
			local106 += this.anInt386;
		}
		@Pc(159) int local159 = local106;
		if (local73 == 1) {
			local106 += this.anInt390;
		}
		@Pc(171) int local171 = local106;
		local106 += local97;
		@Pc(177) int local177 = local106;
		local106 += this.anInt390 * 2;
		@Pc(186) int local186 = local106;
		local106 += this.anInt382 * 6;
		@Pc(195) int local195 = local106;
		local106 += local85;
		@Pc(201) int local201 = local106;
		local106 += local89;
		if (local69 == 255) {
			this.aByteArray4 = new byte[this.anInt390];
		} else {
			this.aByte6 = (byte) local69;
		}
		this.anIntArray22 = new int[this.anInt386];
		local20.anInt6629 = 0;
		this.aShortArray18 = new short[this.anInt390];
		this.aShortArray17 = new short[this.anInt390];
		if (this.anInt382 > 0) {
			this.aShortArray10 = new short[this.anInt382];
			this.aByteArray5 = new byte[this.anInt382];
			this.aShortArray12 = new short[this.anInt382];
			this.aShortArray13 = new short[this.anInt382];
		}
		this.aShortArray15 = new short[this.anInt390];
		this.aShortArray9 = new short[this.anInt390];
		this.anIntArray17 = new int[this.anInt386];
		if (local77 == 1) {
			this.anIntArray23 = new int[this.anInt390];
		}
		if (local81 == 1) {
			this.anIntArray26 = new int[this.anInt386];
		}
		if (local65 == 1) {
			this.aShortArray16 = new short[this.anInt390];
			this.aByteArray9 = new byte[this.anInt390];
			this.aByteArray7 = new byte[this.anInt390];
		}
		this.anIntArray16 = new int[this.anInt386];
		if (local73 == 1) {
			this.aByteArray10 = new byte[this.anInt390];
		}
		local25.anInt6629 = local195;
		local30.anInt6629 = local201;
		local35.anInt6629 = local106;
		local40.anInt6629 = local147;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(354) int local354 = 0; local354 < this.anInt386; local354++) {
			local360 = local20.method5966();
			local362 = 0;
			if ((local360 & 0x1) != 0) {
				local362 = local25.method5964();
			}
			@Pc(372) int local372 = 0;
			if ((local360 & 0x2) != 0) {
				local372 = local30.method5964();
			}
			@Pc(382) int local382 = 0;
			if ((local360 & 0x4) != 0) {
				local382 = local35.method5964();
			}
			this.anIntArray16[local354] = local348 + local362;
			this.anIntArray22[local354] = local350 + local372;
			this.anIntArray17[local354] = local382 + local352;
			local348 = this.anIntArray16[local354];
			local352 = this.anIntArray17[local354];
			local350 = this.anIntArray22[local354];
			if (local81 == 1) {
				this.anIntArray26[local354] = local40.method5966();
			}
		}
		local20.anInt6629 = local177;
		local25.anInt6629 = local135;
		local30.anInt6629 = local115;
		local35.anInt6629 = local159;
		local40.anInt6629 = local125;
		for (local360 = 0; local360 < this.anInt390; local360++) {
			this.aShortArray15[local360] = (short) local20.method5968();
			if (local65 == 1) {
				local362 = local25.method5966();
				if ((local362 & 0x1) == 1) {
					this.aByteArray7[local360] = 1;
					local13 = true;
				} else {
					this.aByteArray7[local360] = 0;
				}
				if ((local362 & 0x2) == 2) {
					this.aByteArray9[local360] = (byte) (local362 >> 2);
					this.aShortArray16[local360] = this.aShortArray15[local360];
					this.aShortArray15[local360] = 127;
					if (this.aShortArray16[local360] != -1) {
						local15 = true;
					}
				} else {
					this.aByteArray9[local360] = -1;
					this.aShortArray16[local360] = -1;
				}
			}
			if (local69 == 255) {
				this.aByteArray4[local360] = local30.method5963();
			}
			if (local73 == 1) {
				this.aByteArray10[local360] = local35.method5963();
			}
			if (local77 == 1) {
				this.anIntArray23[local360] = local40.method5966();
			}
		}
		local20.anInt6629 = local171;
		this.anInt377 = -1;
		local25.anInt6629 = local108;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt390; local612++) {
			local618 = local25.method5966();
			if (local618 == 1) {
				local604 = (short) (local610 + local20.method5964());
				local606 = (short) (local604 + local20.method5964());
				local608 = (short) (local20.method5964() + local606);
				this.aShortArray9[local612] = local604;
				local610 = local608;
				this.aShortArray17[local612] = local606;
				this.aShortArray18[local612] = local608;
				if (local604 > this.anInt377) {
					this.anInt377 = local604;
				}
				if (local606 > this.anInt377) {
					this.anInt377 = local606;
				}
				if (local608 > this.anInt377) {
					this.anInt377 = local608;
				}
			}
			if (local618 == 2) {
				local606 = local608;
				local608 = (short) (local20.method5964() + local610);
				local610 = local608;
				this.aShortArray9[local612] = local604;
				this.aShortArray17[local612] = local606;
				this.aShortArray18[local612] = local608;
				if (local608 > this.anInt377) {
					this.anInt377 = local608;
				}
			}
			if (local618 == 3) {
				local604 = local608;
				local608 = (short) (local20.method5964() + local610);
				local610 = local608;
				this.aShortArray9[local612] = local604;
				this.aShortArray17[local612] = local606;
				this.aShortArray18[local612] = local608;
				if (local608 > this.anInt377) {
					this.anInt377 = local608;
				}
			}
			if (local618 == 4) {
				@Pc(771) short local771 = local604;
				local604 = local606;
				local606 = local771;
				local608 = (short) (local610 + local20.method5964());
				this.aShortArray9[local612] = local604;
				local610 = local608;
				this.aShortArray17[local612] = local771;
				this.aShortArray18[local612] = local608;
				if (this.anInt377 < local608) {
					this.anInt377 = local608;
				}
			}
		}
		local20.anInt6629 = local186;
		this.anInt377++;
		for (local618 = 0; local618 < this.anInt382; local618++) {
			this.aByteArray5[local618] = 0;
			this.aShortArray13[local618] = (short) local20.method5968();
			this.aShortArray12[local618] = (short) local20.method5968();
			this.aShortArray10[local618] = (short) local20.method5968();
		}
		if (this.aByteArray9 != null) {
			@Pc(867) boolean local867 = false;
			for (@Pc(869) int local869 = 0; local869 < this.anInt390; local869++) {
				@Pc(878) int local878 = this.aByteArray9[local869] & 0xFF;
				if (local878 != 255) {
					if (this.aShortArray9[local869] == (this.aShortArray13[local878] & 0xFFFF) && this.aShortArray17[local869] == (this.aShortArray12[local878] & 0xFFFF) && this.aShortArray18[local869] == (this.aShortArray10[local878] & 0xFFFF)) {
						this.aByteArray9[local869] = -1;
					} else {
						local867 = true;
					}
				}
			}
			if (!local867) {
				this.aByteArray9 = null;
			}
		}
		if (!local15) {
			this.aShortArray16 = null;
		}
		if (!local13) {
			this.aByteArray7 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)[[I")
	public int[][] method345() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass257Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass257Array1[local20].anInt6693;
			if (local28 >= 0) {
				if (local18 < local28) {
					local18 = local28;
				}
				@Pc(39) int local39 = local8[local28]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local18 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local18; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass257Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass257Array1[local78].anInt6693;
			if (local86 >= 0) {
				local57[local86][local8[local86]++] = local78;
			}
		}
		return local57;
	}
}
