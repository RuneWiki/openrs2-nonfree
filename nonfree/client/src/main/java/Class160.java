import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class160 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[Lclient!kk;")
	public Class131[] aClass131Array1;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[Lclient!hd;")
	public Class95[] aClass95Array3;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "[Lclient!lq;")
	public Class141[] aClass141Array3;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public int anInt4540 = 12;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public int anInt4541 = 0;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
	public int anInt4544 = 0;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
	public int anInt4545 = 0;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
	public int anInt4555 = 0;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "B")
	public byte aByte62 = 0;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
	public Class160(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3782(arg0);
		} else {
			this.method3785(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray302 = new int[arg1];
		this.anIntArray300 = new int[arg0];
		this.aByteArray81 = new byte[arg1];
		this.aShortArray64 = new short[arg1];
		this.aShortArray61 = new short[arg1];
		this.aShortArray58 = new short[arg1];
		this.aByteArray82 = new byte[arg1];
		this.aShortArray60 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray79 = new byte[arg2];
			this.anIntArray307 = new int[arg2];
			this.aShortArray62 = new short[arg2];
			this.anIntArray305 = new int[arg2];
			this.anIntArray304 = new int[arg2];
			this.aByteArray85 = new byte[arg2];
			this.aByteArray83 = new byte[arg2];
			this.anIntArray299 = new int[arg2];
			this.aShortArray59 = new short[arg2];
			this.aShortArray65 = new short[arg2];
			this.anIntArray298 = new int[arg2];
			this.anIntArray306 = new int[arg2];
		}
		this.anIntArray297 = new int[arg0];
		this.aByteArray80 = new byte[arg1];
		this.anIntArray301 = new int[arg0];
		this.anIntArray303 = new int[arg0];
		this.aByteArray84 = new byte[arg1];
		this.aShortArray67 = new short[arg1];
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([Lclient!nd;I)V")
	public Class160(@OriginalArg(0) Class160[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4541 = 0;
		this.anInt4555 = 0;
		this.anInt4544 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte62 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class160 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4541 += local59.anInt4541;
				this.anInt4555 += local59.anInt4555;
				this.anInt4544 += local59.anInt4544;
				if (local59.aClass141Array3 != null) {
					local32 += local59.aClass141Array3.length;
				}
				if (local59.aClass131Array1 != null) {
					local36 += local59.aClass131Array1.length;
				}
				if (local59.aClass95Array3 != null) {
					local34 += local59.aClass95Array3.length;
				}
				local38 |= local59.aByteArray81 != null;
				local46 |= local59.aShortArray67 != null;
				local42 |= local59.aByteArray84 != null;
				local44 |= local59.aByteArray80 != null;
				if (local59.aByteArray82 == null) {
					if (this.aByte62 == -1) {
						this.aByte62 = local59.aByte62;
					}
					if (this.aByte62 != local59.aByte62) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local48 |= local59.anIntArray302 != null;
			}
		}
		this.aShortArray58 = new short[this.anInt4544];
		this.aShortArray61 = new short[this.anInt4544];
		if (local44) {
			this.aByteArray80 = new byte[this.anInt4544];
		}
		if (local32 > 0) {
			this.aClass141Array3 = new Class141[local32];
		}
		if (this.anInt4555 > 0) {
			this.aShortArray62 = new short[this.anInt4555];
			this.anIntArray304 = new int[this.anInt4555];
			this.anIntArray299 = new int[this.anInt4555];
			this.aByteArray83 = new byte[this.anInt4555];
			this.aByteArray85 = new byte[this.anInt4555];
			this.aShortArray65 = new short[this.anInt4555];
			this.anIntArray305 = new int[this.anInt4555];
			this.aByteArray79 = new byte[this.anInt4555];
			this.aShortArray59 = new short[this.anInt4555];
			this.anIntArray306 = new int[this.anInt4555];
			this.anIntArray307 = new int[this.anInt4555];
			this.anIntArray298 = new int[this.anInt4555];
		}
		this.anIntArray301 = new int[this.anInt4541];
		this.anIntArray303 = new int[this.anInt4541];
		if (local46) {
			this.aShortArray67 = new short[this.anInt4544];
		}
		if (local48) {
			this.anIntArray302 = new int[this.anInt4544];
		}
		this.aShortArray60 = new short[this.anInt4544];
		this.anIntArray297 = new int[this.anInt4541];
		this.aShortArray66 = new short[this.anInt4541];
		this.aShortArray64 = new short[this.anInt4544];
		if (local36 > 0) {
			this.aClass131Array1 = new Class131[local36];
		}
		this.anIntArray300 = new int[this.anInt4541];
		if (local40) {
			this.aByteArray82 = new byte[this.anInt4544];
		}
		if (local34 > 0) {
			this.aClass95Array3 = new Class95[local34];
		}
		this.aShortArray63 = new short[this.anInt4544];
		if (local42) {
			this.aByteArray84 = new byte[this.anInt4544];
		}
		if (local38) {
			this.aByteArray81 = new byte[this.anInt4544];
		}
		this.anInt4541 = 0;
		local34 = 0;
		this.anInt4544 = 0;
		local32 = 0;
		this.anInt4555 = 0;
		local36 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class160 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass131Array1 != null) {
					for (local398 = 0; local398 < local391.aClass131Array1.length; local398++) {
						@Pc(405) Class131 local405 = local391.aClass131Array1[local398];
						this.aClass131Array1[local36++] = local405.method3199(local405.anInt3721 + this.anInt4544);
					}
				}
				for (local398 = 0; local398 < local391.anInt4544; local398++) {
					if (local38 && local391.aByteArray81 != null) {
						this.aByteArray81[this.anInt4544] = local391.aByteArray81[local398];
					}
					if (local40) {
						if (local391.aByteArray82 == null) {
							this.aByteArray82[this.anInt4544] = local391.aByte62;
						} else {
							this.aByteArray82[this.anInt4544] = local391.aByteArray82[local398];
						}
					}
					if (local42 && local391.aByteArray84 != null) {
						this.aByteArray84[this.anInt4544] = local391.aByteArray84[local398];
					}
					if (local46) {
						if (local391.aShortArray67 == null) {
							this.aShortArray67[this.anInt4544] = -1;
						} else {
							this.aShortArray67[this.anInt4544] = local391.aShortArray67[local398];
						}
					}
					if (local48) {
						if (local391.anIntArray302 == null) {
							this.anIntArray302[this.anInt4544] = -1;
						} else {
							this.anIntArray302[this.anInt4544] = local391.anIntArray302[local398];
						}
					}
					this.aShortArray58[this.anInt4544] = (short) this.method3780(local391.aShortArray58[local398], local387, local391);
					this.aShortArray64[this.anInt4544] = (short) this.method3780(local391.aShortArray64[local398], local387, local391);
					this.aShortArray61[this.anInt4544] = (short) this.method3780(local391.aShortArray61[local398], local387, local391);
					this.aShortArray63[this.anInt4544] = local387;
					this.aShortArray60[this.anInt4544] = local391.aShortArray60[local398];
					this.anInt4544++;
				}
				@Pc(600) int local600;
				if (local391.aClass141Array3 != null) {
					for (local600 = 0; local600 < local391.aClass141Array3.length; local600++) {
						local613 = this.method3780(local391.aClass141Array3[local600].anInt4131, local387, local391);
						local624 = this.method3780(local391.aClass141Array3[local600].anInt4126, local387, local391);
						@Pc(635) int local635 = this.method3780(local391.aClass141Array3[local600].anInt4134, local387, local391);
						this.aClass141Array3[local32] = local391.aClass141Array3[local600].method3497(local624, local613, local635);
						local32++;
					}
				}
				if (local391.aClass95Array3 != null) {
					for (local600 = 0; local600 < local391.aClass95Array3.length; local600++) {
						local613 = this.method3780(local391.aClass95Array3[local600].anInt2684, local387, local391);
						this.aClass95Array3[local34] = local391.aClass95Array3[local600].method2296(local613);
						local34++;
					}
				}
			}
		}
		this.anInt4545 = this.anInt4541;
		@Pc(709) int local709 = 0;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class160 local722 = arg0[local711];
			if (local722 != null) {
				for (local613 = 0; local613 < local722.anInt4544; local613++) {
					if (local44) {
						this.aByteArray80[local709++] = (byte) (local722.aByteArray80 == null || local722.aByteArray80[local613] == -1 ? -1 : local722.aByteArray80[local613] + this.anInt4555);
					}
				}
				for (local624 = 0; local624 < local722.anInt4555; local624++) {
					@Pc(774) byte local774 = this.aByteArray83[this.anInt4555] = local722.aByteArray83[local624];
					if (local774 == 0) {
						this.aShortArray65[this.anInt4555] = (short) this.method3780(local722.aShortArray65[local624], local718, local722);
						this.aShortArray59[this.anInt4555] = (short) this.method3780(local722.aShortArray59[local624], local718, local722);
						this.aShortArray62[this.anInt4555] = (short) this.method3780(local722.aShortArray62[local624], local718, local722);
					}
					if (local774 >= 1 && local774 <= 3) {
						this.aShortArray65[this.anInt4555] = local722.aShortArray65[local624];
						this.aShortArray59[this.anInt4555] = local722.aShortArray59[local624];
						this.aShortArray62[this.anInt4555] = local722.aShortArray62[local624];
						this.anIntArray304[this.anInt4555] = local722.anIntArray304[local624];
						this.anIntArray306[this.anInt4555] = local722.anIntArray306[local624];
						this.anIntArray299[this.anInt4555] = local722.anIntArray299[local624];
						this.aByteArray79[this.anInt4555] = local722.aByteArray79[local624];
						this.aByteArray85[this.anInt4555] = local722.aByteArray85[local624];
						this.anIntArray307[this.anInt4555] = local722.anIntArray307[local624];
					}
					if (local774 == 2) {
						this.anIntArray298[this.anInt4555] = local722.anIntArray298[local624];
						this.anIntArray305[this.anInt4555] = local722.anIntArray305[local624];
					}
					this.anInt4555++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)[[I")
	public int[][] method3769() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4544; local12++) {
			@Pc(19) int local19 = this.anIntArray302[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt4544; local80++) {
			@Pc(87) int local87 = this.anIntArray302[local80];
			if (local87 >= 0) {
				local50[local87][local8[local87]++] = local80;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
	public void method3772() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt4541; local14++) {
			this.anIntArray297[local14] <<= 0x0;
			this.anIntArray303[local14] <<= 0x0;
			this.anIntArray300[local14] <<= 0x0;
		}
		if (this.anInt4555 <= 0 || this.anIntArray304 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray304.length; local56++) {
			this.anIntArray304[local56] <<= 0x0;
			this.anIntArray306[local56] <<= 0x0;
			if (this.aByteArray83[local56] != 1) {
				this.anIntArray299[local56] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ISSBBSBSSS)B")
	public byte method3773() {
		if (this.anInt4555 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray83[this.anInt4555] = 3;
		this.aShortArray65[this.anInt4555] = 0;
		this.aShortArray59[this.anInt4555] = 32767;
		this.aShortArray62[this.anInt4555] = 0;
		this.anIntArray304[this.anInt4555] = 1024;
		this.anIntArray306[this.anInt4555] = 1024;
		this.anIntArray299[this.anInt4555] = 1024;
		this.aByteArray79[this.anInt4555] = 0;
		this.aByteArray85[this.anInt4555] = 0;
		this.anIntArray307[this.anInt4555] = 0;
		return (byte) this.anInt4555++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)[[I")
	public int[][] method3774() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt4545; local18++) {
			@Pc(25) int local25 = this.anIntArray301[local18];
			if (local25 >= 0) {
				@Pc(34) int local34 = local8[local25]++;
				if (local10 < local25) {
					local10 = local25;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt4545; local73++) {
			@Pc(80) int local80 = this.anIntArray301[local73];
			if (local80 >= 0) {
				local52[local80][local8[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)[[I")
	public int[][] method3775() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass131Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass131Array1[local12].anInt3722;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(31) int local31 = local8[local20]++;
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass131Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass131Array1[local70].anInt3722;
			if (local78 >= 0) {
				local45[local78][local8[local78]++] = local70;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIII)V")
	public void method3776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4541; local7++) {
			this.anIntArray297[local7] += arg2;
			this.anIntArray303[local7] += arg0;
			this.anIntArray300[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(SSZ)V")
	public void method3778(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4544; local7++) {
			if (this.aShortArray60[local7] == arg1) {
				this.aShortArray60[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIBSSIBI)I")
	public int method3779(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) short arg4, @OriginalArg(5) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray58[this.anInt4544] = (short) arg2;
		this.aShortArray64[this.anInt4544] = (short) arg7;
		this.aShortArray61[this.anInt4544] = (short) arg1;
		this.aByteArray81[this.anInt4544] = arg6;
		this.aByteArray80[this.anInt4544] = arg0;
		this.aShortArray60[this.anInt4544] = arg4;
		this.aByteArray84[this.anInt4544] = arg3;
		this.aShortArray67[this.anInt4544] = arg5;
		return this.anInt4544++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ISBLclient!nd;)I")
	private int method3780(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class160 arg2) {
		@Pc(10) int local10 = arg2.anIntArray297[arg0];
		@Pc(15) int local15 = arg2.anIntArray303[arg0];
		@Pc(20) int local20 = arg2.anIntArray300[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4541; local22++) {
			if (local10 == this.anIntArray297[local22] && this.anIntArray303[local22] == local15 && local20 == this.anIntArray300[local22]) {
				this.aShortArray66[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray297[this.anInt4541] = local10;
		this.anIntArray303[this.anInt4541] = local15;
		this.anIntArray300[this.anInt4541] = local20;
		this.aShortArray66[this.anInt4541] = arg1;
		this.anIntArray301[this.anInt4541] = arg2.anIntArray301 == null ? -1 : arg2.anIntArray301[arg0];
		return this.anInt4541++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I")
	public int method3781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt4541; local13++) {
			if (this.anIntArray297[local13] == arg0 && arg2 == this.anIntArray303[local13] && this.anIntArray300[local13] == arg1) {
				return local13;
			}
		}
		this.anIntArray297[this.anInt4541] = arg0;
		this.anIntArray303[this.anInt4541] = arg2;
		this.anIntArray300[this.anInt4541] = arg1;
		this.anInt4545 = this.anInt4541 + 1;
		return this.anInt4541++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B)V")
	private void method3782(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg0);
		@Pc(15) Class3_Sub25 local15 = new Class3_Sub25(arg0);
		@Pc(20) Class3_Sub25 local20 = new Class3_Sub25(arg0);
		@Pc(25) Class3_Sub25 local25 = new Class3_Sub25(arg0);
		@Pc(30) Class3_Sub25 local30 = new Class3_Sub25(arg0);
		@Pc(35) Class3_Sub25 local35 = new Class3_Sub25(arg0);
		@Pc(40) Class3_Sub25 local40 = new Class3_Sub25(arg0);
		local10.anInt4974 = arg0.length - 23;
		this.anInt4541 = local10.method4083();
		this.anInt4544 = local10.method4083();
		this.anInt4555 = local10.method4096();
		@Pc(67) int local67 = local10.method4096();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(98) boolean local98 = (local67 & 0x4) == 4;
		@Pc(109) boolean local109 = (local67 & 0x8) == 8;
		if (local109) {
			local10.anInt4974 -= 7;
			this.anInt4540 = local10.method4096();
			local10.anInt4974 += 6;
		}
		@Pc(132) int local132 = local10.method4096();
		@Pc(136) int local136 = local10.method4096();
		@Pc(140) int local140 = local10.method4096();
		@Pc(144) int local144 = local10.method4096();
		@Pc(148) int local148 = local10.method4096();
		@Pc(154) int local154 = local10.method4083();
		@Pc(158) int local158 = local10.method4083();
		@Pc(164) int local164 = local10.method4083();
		@Pc(170) int local170 = local10.method4083();
		@Pc(174) int local174 = local10.method4083();
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(193) int local193;
		if (this.anInt4555 > 0) {
			this.aByteArray83 = new byte[this.anInt4555];
			local10.anInt4974 = 0;
			for (local193 = 0; local193 < this.anInt4555; local193++) {
				@Pc(204) byte local204 = this.aByteArray83[local193] = local10.method4097();
				if (local204 >= 1 && local204 <= 3) {
					local178++;
				}
				if (local204 == 2) {
					local180++;
				}
				if (local204 == 0) {
					local176++;
				}
			}
		}
		local193 = this.anInt4555;
		@Pc(237) int local237 = local193;
		local193 += this.anInt4541;
		@Pc(244) int local244 = local193;
		if (local78) {
			local193 += this.anInt4544;
		}
		@Pc(253) int local253 = local193;
		local193 += this.anInt4544;
		@Pc(260) int local260 = local193;
		if (local132 == 255) {
			local193 += this.anInt4544;
		}
		@Pc(270) int local270 = local193;
		if (local140 == 1) {
			local193 += this.anInt4544;
		}
		@Pc(282) int local282 = local193;
		if (local148 == 1) {
			local193 += this.anInt4541;
		}
		@Pc(292) int local292 = local193;
		if (local136 == 1) {
			local193 += this.anInt4544;
		}
		@Pc(302) int local302 = local193;
		local193 += local170;
		@Pc(308) int local308 = local193;
		if (local144 == 1) {
			local193 += this.anInt4544 * 2;
		}
		@Pc(322) int local322 = local193;
		local193 += local174;
		@Pc(328) int local328 = local193;
		local193 += this.anInt4544 * 2;
		@Pc(337) int local337 = local193;
		local193 += local154;
		@Pc(343) int local343 = local193;
		local193 += local158;
		@Pc(349) int local349 = local193;
		local193 += local164;
		@Pc(355) int local355 = local193;
		local193 += local176 * 6;
		@Pc(363) int local363 = local193;
		local193 += local178 * 6;
		@Pc(379) int local379 = this.anInt4540 < 14 ? 6 : 7;
		@Pc(381) int local381 = local193;
		local193 += local178 * local379;
		@Pc(389) int local389 = local193;
		local193 += local178;
		@Pc(395) int local395 = local193;
		local193 += local178;
		@Pc(401) int local401 = local193;
		local193 += local178 + local180 * 2;
		this.anIntArray300 = new int[this.anInt4541];
		if (local148 == 1) {
			this.anIntArray301 = new int[this.anInt4541];
		}
		if (local78) {
			this.aByteArray81 = new byte[this.anInt4544];
		}
		this.anIntArray297 = new int[this.anInt4541];
		if (this.anInt4555 > 0) {
			if (local180 > 0) {
				this.anIntArray298 = new int[local180];
				this.anIntArray305 = new int[local180];
			}
			if (local178 > 0) {
				this.aByteArray85 = new byte[local178];
				this.anIntArray307 = new int[local178];
				this.anIntArray304 = new int[local178];
				this.anIntArray299 = new int[local178];
				this.aByteArray79 = new byte[local178];
				this.anIntArray306 = new int[local178];
			}
			this.aShortArray65 = new short[this.anInt4555];
			this.aShortArray59 = new short[this.anInt4555];
			this.aShortArray62 = new short[this.anInt4555];
		}
		this.anIntArray303 = new int[this.anInt4541];
		local10.anInt4974 = local237;
		if (local136 == 1) {
			this.aByteArray84 = new byte[this.anInt4544];
		}
		if (local144 == 1 && this.anInt4555 > 0) {
			this.aByteArray80 = new byte[this.anInt4544];
		}
		if (local144 == 1) {
			this.aShortArray67 = new short[this.anInt4544];
		}
		this.aShortArray61 = new short[this.anInt4544];
		this.aShortArray60 = new short[this.anInt4544];
		if (local132 == 255) {
			this.aByteArray82 = new byte[this.anInt4544];
		} else {
			this.aByte62 = (byte) local132;
		}
		if (local140 == 1) {
			this.anIntArray302 = new int[this.anInt4544];
		}
		this.aShortArray64 = new short[this.anInt4544];
		this.aShortArray58 = new short[this.anInt4544];
		local15.anInt4974 = local337;
		local20.anInt4974 = local343;
		local25.anInt4974 = local349;
		local30.anInt4974 = local282;
		@Pc(594) int local594 = 0;
		@Pc(596) int local596 = 0;
		@Pc(598) int local598 = 0;
		@Pc(606) int local606;
		for (@Pc(600) int local600 = 0; local600 < this.anInt4541; local600++) {
			local606 = local10.method4096();
			@Pc(608) int local608 = 0;
			if ((local606 & 0x1) != 0) {
				local608 = local15.method4092();
			}
			@Pc(621) int local621 = 0;
			if ((local606 & 0x2) != 0) {
				local621 = local20.method4092();
			}
			@Pc(631) int local631 = 0;
			if ((local606 & 0x4) != 0) {
				local631 = local25.method4092();
			}
			this.anIntArray297[local600] = local594 + local608;
			this.anIntArray303[local600] = local596 + local621;
			this.anIntArray300[local600] = local631 + local598;
			local596 = this.anIntArray303[local600];
			local594 = this.anIntArray297[local600];
			local598 = this.anIntArray300[local600];
			if (local148 == 1) {
				this.anIntArray301[local600] = local30.method4096();
			}
		}
		local10.anInt4974 = local328;
		local15.anInt4974 = local244;
		local20.anInt4974 = local260;
		local25.anInt4974 = local292;
		local30.anInt4974 = local270;
		local35.anInt4974 = local308;
		local40.anInt4974 = local322;
		for (local606 = 0; local606 < this.anInt4544; local606++) {
			this.aShortArray60[local606] = (short) local10.method4083();
			if (local78) {
				this.aByteArray81[local606] = local15.method4097();
			}
			if (local132 == 255) {
				this.aByteArray82[local606] = local20.method4097();
			}
			if (local136 == 1) {
				this.aByteArray84[local606] = local25.method4097();
			}
			if (local140 == 1) {
				this.anIntArray302[local606] = local30.method4096();
			}
			if (local144 == 1) {
				this.aShortArray67[local606] = (short) (local35.method4083() - 1);
			}
			if (this.aByteArray80 != null) {
				if (this.aShortArray67[local606] == -1) {
					this.aByteArray80[local606] = -1;
				} else {
					this.aByteArray80[local606] = (byte) (local40.method4096() - 1);
				}
			}
		}
		local10.anInt4974 = local302;
		this.anInt4545 = -1;
		local15.anInt4974 = local253;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(846) int local846;
		for (@Pc(840) int local840 = 0; local840 < this.anInt4544; local840++) {
			local846 = local15.method4096();
			if (local846 == 1) {
				local832 = (short) (local838 + local10.method4092());
				local834 = (short) (local10.method4092() + local832);
				local836 = (short) (local10.method4092() + local834);
				this.aShortArray58[local840] = local832;
				local838 = local836;
				this.aShortArray64[local840] = local834;
				this.aShortArray61[local840] = local836;
				if (local832 > this.anInt4545) {
					this.anInt4545 = local832;
				}
				if (this.anInt4545 < local834) {
					this.anInt4545 = local834;
				}
				if (this.anInt4545 < local836) {
					this.anInt4545 = local836;
				}
			}
			if (local846 == 2) {
				local834 = local836;
				local836 = (short) (local838 + local10.method4092());
				this.aShortArray58[local840] = local832;
				local838 = local836;
				this.aShortArray64[local840] = local834;
				this.aShortArray61[local840] = local836;
				if (local836 > this.anInt4545) {
					this.anInt4545 = local836;
				}
			}
			if (local846 == 3) {
				local832 = local836;
				local836 = (short) (local10.method4092() + local838);
				this.aShortArray58[local840] = local832;
				local838 = local836;
				this.aShortArray64[local840] = local834;
				this.aShortArray61[local840] = local836;
				if (local836 > this.anInt4545) {
					this.anInt4545 = local836;
				}
			}
			if (local846 == 4) {
				@Pc(1005) short local1005 = local832;
				local832 = local834;
				local834 = local1005;
				local836 = (short) (local838 + local10.method4092());
				local838 = local836;
				this.aShortArray58[local840] = local832;
				this.aShortArray64[local840] = local1005;
				this.aShortArray61[local840] = local836;
				if (this.anInt4545 < local836) {
					this.anInt4545 = local836;
				}
			}
		}
		local10.anInt4974 = local355;
		this.anInt4545++;
		local15.anInt4974 = local363;
		local20.anInt4974 = local381;
		local25.anInt4974 = local389;
		local30.anInt4974 = local395;
		local35.anInt4974 = local401;
		@Pc(1080) int local1080;
		for (local846 = 0; local846 < this.anInt4555; local846++) {
			local1080 = this.aByteArray83[local846] & 0xFF;
			if (local1080 == 0) {
				this.aShortArray65[local846] = (short) local10.method4083();
				this.aShortArray59[local846] = (short) local10.method4083();
				this.aShortArray62[local846] = (short) local10.method4083();
			}
			if (local1080 == 1) {
				this.aShortArray65[local846] = (short) local15.method4083();
				this.aShortArray59[local846] = (short) local15.method4083();
				this.aShortArray62[local846] = (short) local15.method4083();
				this.anIntArray304[local846] = local20.method4083();
				if (this.anInt4540 < 14) {
					this.anIntArray306[local846] = local20.method4083();
				} else {
					this.anIntArray306[local846] = local20.method4099();
				}
				this.anIntArray299[local846] = local20.method4083();
				this.aByteArray79[local846] = local25.method4097();
				this.aByteArray85[local846] = local30.method4097();
				this.anIntArray307[local846] = local35.method4097();
			}
			if (local1080 == 2) {
				this.aShortArray65[local846] = (short) local15.method4083();
				this.aShortArray59[local846] = (short) local15.method4083();
				this.aShortArray62[local846] = (short) local15.method4083();
				this.anIntArray304[local846] = local20.method4083();
				if (this.anInt4540 < 14) {
					this.anIntArray306[local846] = local20.method4083();
				} else {
					this.anIntArray306[local846] = local20.method4099();
				}
				this.anIntArray299[local846] = local20.method4083();
				this.aByteArray79[local846] = local25.method4097();
				this.aByteArray85[local846] = local30.method4097();
				this.anIntArray307[local846] = local35.method4097();
				this.anIntArray298[local846] = local35.method4097();
				this.anIntArray305[local846] = local35.method4097();
			}
			if (local1080 == 3) {
				this.aShortArray65[local846] = (short) local15.method4083();
				this.aShortArray59[local846] = (short) local15.method4083();
				this.aShortArray62[local846] = (short) local15.method4083();
				this.anIntArray304[local846] = local20.method4083();
				if (this.anInt4540 < 14) {
					this.anIntArray306[local846] = local20.method4083();
				} else {
					this.anIntArray306[local846] = local20.method4099();
				}
				this.anIntArray299[local846] = local20.method4083();
				this.aByteArray79[local846] = local25.method4097();
				this.aByteArray85[local846] = local30.method4097();
				this.anIntArray307[local846] = local35.method4097();
			}
		}
		local10.anInt4974 = local193;
		@Pc(1419) int local1419;
		@Pc(1425) int local1425;
		@Pc(1429) int local1429;
		@Pc(1489) int local1489;
		if (local87) {
			local1080 = local10.method4096();
			if (local1080 > 0) {
				this.aClass141Array3 = new Class141[local1080];
				for (local1419 = 0; local1419 < local1080; local1419++) {
					local1425 = local10.method4083();
					local1429 = local10.method4083();
					@Pc(1437) byte local1437;
					if (local132 == 255) {
						local1437 = this.aByteArray82[local1429];
					} else {
						local1437 = (byte) local132;
					}
					this.aClass141Array3[local1419] = new Class141(local1425, this.aShortArray58[local1429], this.aShortArray64[local1429], this.aShortArray61[local1429], local1437);
				}
			}
			local1419 = local10.method4096();
			if (local1419 > 0) {
				this.aClass95Array3 = new Class95[local1419];
				for (local1425 = 0; local1425 < local1419; local1425++) {
					local1429 = local10.method4083();
					local1489 = local10.method4083();
					this.aClass95Array3[local1425] = new Class95(local1429, local1489);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1080 = local10.method4096();
		if (local1080 <= 0) {
			return;
		}
		this.aClass131Array1 = new Class131[local1080];
		for (local1419 = 0; local1419 < local1080; local1419++) {
			local1425 = local10.method4083();
			local1429 = local10.method4083();
			local1489 = local10.method4096();
			@Pc(1537) byte local1537 = local10.method4097();
			this.aClass131Array1[local1419] = new Class131(local1425, local1429, local1489, local1537);
		}
		return;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)V")
	public void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local10 = Class65.anIntArray88[arg0];
			local14 = Class65.anIntArray87[arg0];
			for (local16 = 0; local16 < this.anInt4541; local16++) {
				local35 = local10 * this.anIntArray303[local16] + this.anIntArray297[local16] * local14 >> 15;
				this.anIntArray303[local16] = local14 * this.anIntArray303[local16] - this.anIntArray297[local16] * local10 >> 15;
				this.anIntArray297[local16] = local35;
			}
		}
		if (arg1 != 0) {
			local10 = Class65.anIntArray88[arg1];
			local14 = Class65.anIntArray87[arg1];
			for (local16 = 0; local16 < this.anInt4541; local16++) {
				local35 = local14 * this.anIntArray303[local16] - local10 * this.anIntArray300[local16] >> 15;
				this.anIntArray300[local16] = this.anIntArray300[local16] * local14 + this.anIntArray303[local16] * local10 >> 15;
				this.anIntArray303[local16] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local10 = Class65.anIntArray88[arg2];
		local14 = Class65.anIntArray87[arg2];
		for (local16 = 0; local16 < this.anInt4541; local16++) {
			local35 = this.anIntArray300[local16] * local10 + this.anIntArray297[local16] * local14 >> 15;
			this.anIntArray300[local16] = local14 * this.anIntArray300[local16] - this.anIntArray297[local16] * local10 >> 15;
			this.anIntArray297[local16] = local35;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(SBS)V")
	public void method3784(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray67 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt4544; local11++) {
			if (arg0 == this.aShortArray67[local11]) {
				this.aShortArray67[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[B)V")
	private void method3785(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		@Pc(19) Class3_Sub25 local19 = new Class3_Sub25(arg0);
		@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0);
		@Pc(29) Class3_Sub25 local29 = new Class3_Sub25(arg0);
		@Pc(34) Class3_Sub25 local34 = new Class3_Sub25(arg0);
		local14.anInt4974 = arg0.length - 18;
		this.anInt4541 = local14.method4083();
		this.anInt4544 = local14.method4083();
		this.anInt4555 = local14.method4096();
		@Pc(63) int local63 = local14.method4096();
		@Pc(67) int local67 = local14.method4096();
		@Pc(71) int local71 = local14.method4096();
		@Pc(75) int local75 = local14.method4096();
		@Pc(79) int local79 = local14.method4096();
		@Pc(83) int local83 = local14.method4083();
		@Pc(89) int local89 = local14.method4083();
		@Pc(93) int local93 = local14.method4083();
		@Pc(97) int local97 = local14.method4083();
		@Pc(106) int local106 = this.anInt4541;
		@Pc(108) int local108 = local106;
		local106 += this.anInt4544;
		@Pc(115) int local115 = local106;
		if (local67 == 255) {
			local106 += this.anInt4544;
		}
		@Pc(127) int local127 = local106;
		if (local75 == 1) {
			local106 += this.anInt4544;
		}
		@Pc(139) int local139 = local106;
		if (local63 == 1) {
			local106 += this.anInt4544;
		}
		@Pc(149) int local149 = local106;
		if (local79 == 1) {
			local106 += this.anInt4541;
		}
		@Pc(159) int local159 = local106;
		if (local71 == 1) {
			local106 += this.anInt4544;
		}
		@Pc(169) int local169 = local106;
		local106 += local97;
		@Pc(175) int local175 = local106;
		local106 += this.anInt4544 * 2;
		@Pc(184) int local184 = local106;
		local106 += this.anInt4555 * 6;
		@Pc(193) int local193 = local106;
		local106 += local83;
		@Pc(199) int local199 = local106;
		local106 += local89;
		this.anIntArray300 = new int[this.anInt4541];
		this.aShortArray58 = new short[this.anInt4544];
		if (this.anInt4555 > 0) {
			this.aShortArray59 = new short[this.anInt4555];
			this.aShortArray65 = new short[this.anInt4555];
			this.aByteArray83 = new byte[this.anInt4555];
			this.aShortArray62 = new short[this.anInt4555];
		}
		this.aShortArray61 = new short[this.anInt4544];
		this.anIntArray303 = new int[this.anInt4541];
		if (local71 == 1) {
			this.aByteArray84 = new byte[this.anInt4544];
		}
		this.anIntArray297 = new int[this.anInt4541];
		local14.anInt4974 = 0;
		this.aShortArray60 = new short[this.anInt4544];
		this.aShortArray64 = new short[this.anInt4544];
		if (local75 == 1) {
			this.anIntArray302 = new int[this.anInt4544];
		}
		if (local67 == 255) {
			this.aByteArray82 = new byte[this.anInt4544];
		} else {
			this.aByte62 = (byte) local67;
		}
		if (local79 == 1) {
			this.anIntArray301 = new int[this.anInt4541];
		}
		if (local63 == 1) {
			this.aByteArray81 = new byte[this.anInt4544];
			this.aShortArray67 = new short[this.anInt4544];
			this.aByteArray80 = new byte[this.anInt4544];
		}
		local19.anInt4974 = local193;
		local24.anInt4974 = local199;
		local29.anInt4974 = local106;
		local34.anInt4974 = local149;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(361) int local361;
		@Pc(363) int local363;
		for (@Pc(355) int local355 = 0; local355 < this.anInt4541; local355++) {
			local361 = local14.method4096();
			local363 = 0;
			if ((local361 & 0x1) != 0) {
				local363 = local19.method4092();
			}
			@Pc(373) int local373 = 0;
			if ((local361 & 0x2) != 0) {
				local373 = local24.method4092();
			}
			@Pc(383) int local383 = 0;
			if ((local361 & 0x4) != 0) {
				local383 = local29.method4092();
			}
			this.anIntArray297[local355] = local349 + local363;
			this.anIntArray303[local355] = local373 + local351;
			this.anIntArray300[local355] = local353 + local383;
			local353 = this.anIntArray300[local355];
			local349 = this.anIntArray297[local355];
			local351 = this.anIntArray303[local355];
			if (local79 == 1) {
				this.anIntArray301[local355] = local34.method4096();
			}
		}
		local14.anInt4974 = local175;
		local19.anInt4974 = local139;
		local24.anInt4974 = local115;
		local29.anInt4974 = local159;
		local34.anInt4974 = local127;
		for (local361 = 0; local361 < this.anInt4544; local361++) {
			this.aShortArray60[local361] = (short) local14.method4083();
			if (local63 == 1) {
				local363 = local19.method4096();
				if ((local363 & 0x1) == 1) {
					this.aByteArray81[local361] = 1;
					local7 = true;
				} else {
					this.aByteArray81[local361] = 0;
				}
				if ((local363 & 0x2) == 2) {
					this.aByteArray80[local361] = (byte) (local363 >> 2);
					this.aShortArray67[local361] = this.aShortArray60[local361];
					this.aShortArray60[local361] = 127;
					if (this.aShortArray67[local361] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray80[local361] = -1;
					this.aShortArray67[local361] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray82[local361] = local24.method4097();
			}
			if (local71 == 1) {
				this.aByteArray84[local361] = local29.method4097();
			}
			if (local75 == 1) {
				this.anIntArray302[local361] = local34.method4096();
			}
		}
		local14.anInt4974 = local169;
		this.anInt4545 = -1;
		local19.anInt4974 = local108;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(620) int local620;
		for (@Pc(614) int local614 = 0; local614 < this.anInt4544; local614++) {
			local620 = local19.method4096();
			if (local620 == 1) {
				local606 = (short) (local612 + local14.method4092());
				local608 = (short) (local606 + local14.method4092());
				local610 = (short) (local14.method4092() + local608);
				this.aShortArray58[local614] = local606;
				local612 = local610;
				this.aShortArray64[local614] = local608;
				this.aShortArray61[local614] = local610;
				if (local606 > this.anInt4545) {
					this.anInt4545 = local606;
				}
				if (this.anInt4545 < local608) {
					this.anInt4545 = local608;
				}
				if (local610 > this.anInt4545) {
					this.anInt4545 = local610;
				}
			}
			if (local620 == 2) {
				local608 = local610;
				local610 = (short) (local612 + local14.method4092());
				this.aShortArray58[local614] = local606;
				local612 = local610;
				this.aShortArray64[local614] = local608;
				this.aShortArray61[local614] = local610;
				if (local610 > this.anInt4545) {
					this.anInt4545 = local610;
				}
			}
			if (local620 == 3) {
				local606 = local610;
				local610 = (short) (local612 + local14.method4092());
				local612 = local610;
				this.aShortArray58[local614] = local606;
				this.aShortArray64[local614] = local608;
				this.aShortArray61[local614] = local610;
				if (local610 > this.anInt4545) {
					this.anInt4545 = local610;
				}
			}
			if (local620 == 4) {
				@Pc(779) short local779 = local606;
				local606 = local608;
				local608 = local779;
				local610 = (short) (local14.method4092() + local612);
				this.aShortArray58[local614] = local606;
				local612 = local610;
				this.aShortArray64[local614] = local779;
				this.aShortArray61[local614] = local610;
				if (local610 > this.anInt4545) {
					this.anInt4545 = local610;
				}
			}
		}
		local14.anInt4974 = local184;
		this.anInt4545++;
		for (local620 = 0; local620 < this.anInt4555; local620++) {
			this.aByteArray83[local620] = 0;
			this.aShortArray65[local620] = (short) local14.method4083();
			this.aShortArray59[local620] = (short) local14.method4083();
			this.aShortArray62[local620] = (short) local14.method4083();
		}
		if (this.aByteArray80 != null) {
			@Pc(885) boolean local885 = false;
			for (@Pc(887) int local887 = 0; local887 < this.anInt4544; local887++) {
				@Pc(896) int local896 = this.aByteArray80[local887] & 0xFF;
				if (local896 != 255) {
					if ((this.aShortArray65[local896] & 0xFFFF) == this.aShortArray58[local887] && this.aShortArray64[local887] == (this.aShortArray59[local896] & 0xFFFF) && this.aShortArray61[local887] == (this.aShortArray62[local896] & 0xFFFF)) {
						this.aByteArray80[local887] = -1;
					} else {
						local885 = true;
					}
				}
			}
			if (!local885) {
				this.aByteArray80 = null;
			}
		}
		if (!local9) {
			this.aShortArray67 = null;
		}
		if (!local7) {
			this.aByteArray81 = null;
		}
	}
}
