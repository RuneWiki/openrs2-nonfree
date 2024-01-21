import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class3_Sub1_Sub2_Sub6 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!t", name = "sb", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!t", name = "tb", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!t", name = "ub", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!t", name = "vb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!t", name = "xb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!t", name = "yb", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!t", name = "zb", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!t", name = "Ab", descriptor = "I")
	private int anInt2675;

	@OriginalMember(owner = "client!t", name = "Bb", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!t", name = "Db", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!t", name = "Gb", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!t", name = "Hb", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!t", name = "Ib", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!t", name = "Jb", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!t", name = "Kb", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!t", name = "Lb", descriptor = "I")
	private int anInt2678;

	@OriginalMember(owner = "client!t", name = "Mb", descriptor = "I")
	private int anInt2679;

	@OriginalMember(owner = "client!t", name = "Nb", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!t", name = "Ob", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!t", name = "Pb", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!t", name = "Qb", descriptor = "I")
	private int anInt2680;

	@OriginalMember(owner = "client!t", name = "Tb", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!t", name = "Fb", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!t", name = "Eb", descriptor = "I")
	public int anInt2676 = 0;

	@OriginalMember(owner = "client!t", name = "Cb", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!t", name = "Vb", descriptor = "I")
	public int anInt2682 = 0;

	@OriginalMember(owner = "client!t", name = "Sb", descriptor = "I")
	public int anInt2681 = 0;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2_Sub6() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "([Lclient!t;I)V")
	public Class3_Sub1_Sub2_Sub6(@OriginalArg(0) Class3_Sub1_Sub2_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt2676 = 0;
		this.anInt2682 = 0;
		this.anInt2681 = 0;
		this.aByte5 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class3_Sub1_Sub2_Sub6 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt2676 += local41.anInt2676;
				this.anInt2682 += local41.anInt2682;
				this.anInt2681 += local41.anInt2681;
				if (local41.aByteArray37 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local41.aByte5;
					}
					if (this.aByte5 != local41.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray36 != null;
				local22 |= local41.aByteArray38 != null;
			}
		}
		this.anIntArray235 = new int[this.anInt2676];
		this.anIntArray233 = new int[this.anInt2676];
		this.anIntArray230 = new int[this.anInt2676];
		this.anIntArray232 = new int[this.anInt2682];
		this.anIntArray231 = new int[this.anInt2682];
		this.anIntArray229 = new int[this.anInt2682];
		this.anIntArray238 = new int[this.anInt2682];
		this.anIntArray234 = new int[this.anInt2682];
		this.anIntArray228 = new int[this.anInt2682];
		if (this.anInt2681 > 0) {
			this.anIntArray236 = new int[this.anInt2681];
			this.anIntArray239 = new int[this.anInt2681];
			this.anIntArray237 = new int[this.anInt2681];
		}
		if (local18) {
			this.aByteArray37 = new byte[this.anInt2682];
		}
		if (local20) {
			this.aByteArray36 = new byte[this.anInt2682];
		}
		if (local22) {
			this.aByteArray38 = new byte[this.anInt2682];
			this.aShortArray9 = new short[this.anInt2682];
		}
		this.anInt2676 = 0;
		this.anInt2682 = 0;
		this.anInt2681 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class3_Sub1_Sub2_Sub6 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt2676;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt2676; local221++) {
					this.anIntArray235[this.anInt2676] = local214.anIntArray235[local221];
					this.anIntArray233[this.anInt2676] = local214.anIntArray233[local221];
					this.anIntArray230[this.anInt2676] = local214.anIntArray230[local221];
					this.anInt2676++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt2682; local262++) {
					this.anIntArray232[this.anInt2682] = local214.anIntArray232[local262] + local219;
					this.anIntArray231[this.anInt2682] = local214.anIntArray231[local262] + local219;
					this.anIntArray229[this.anInt2682] = local214.anIntArray229[local262] + local219;
					this.anIntArray238[this.anInt2682] = local214.anIntArray238[local262];
					this.anIntArray234[this.anInt2682] = local214.anIntArray234[local262];
					this.anIntArray228[this.anInt2682] = local214.anIntArray228[local262];
					if (local18) {
						if (local214.aByteArray37 == null) {
							this.aByteArray37[this.anInt2682] = local214.aByte5;
						} else {
							this.aByteArray37[this.anInt2682] = local214.aByteArray37[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray36 == null) {
							this.aByteArray36[this.anInt2682] = 0;
						} else {
							this.aByteArray36[this.anInt2682] = local214.aByteArray36[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray38 == null || local214.aByteArray38[local262] == -1) {
							this.aByteArray38[this.anInt2682] = -1;
						} else {
							this.aByteArray38[this.anInt2682] = (byte) (local214.aByteArray38[local262] + local207);
							this.aShortArray9[this.anInt2682] = local214.aShortArray9[local262];
						}
					}
					this.anInt2682++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt2681; local418++) {
					this.anIntArray236[this.anInt2681] = local214.anIntArray236[local418] + local219;
					this.anIntArray239[this.anInt2681] = local214.anIntArray239[local418] + local219;
					this.anIntArray237[this.anInt2681] = local214.anIntArray237[local418] + local219;
					this.anInt2681++;
				}
				local207 += local214.anInt2681;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2676; local1++) {
			this.anIntArray235[local1] += arg0;
			this.anIntArray233[local1] += arg1;
			this.anIntArray230[local1] += arg2;
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
	public void method1784() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2676; local1++) {
			@Pc(7) int local7 = this.anIntArray235[local1];
			this.anIntArray235[local1] = this.anIntArray230[local1];
			this.anIntArray230[local1] = -local7;
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	private void method1785(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static55.anInt1575;
		@Pc(3) int local3 = Static55.anInt1579;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray232[arg0];
		@Pc(15) int local15 = this.anIntArray231[arg0];
		@Pc(20) int local20 = this.anIntArray229[arg0];
		@Pc(24) int local24 = Static107.anIntArray242[local10];
		@Pc(28) int local28 = Static107.anIntArray242[local15];
		@Pc(32) int local32 = Static107.anIntArray242[local20];
		if (this.aByteArray36 == null) {
			Static55.anInt1578 = 0;
		} else {
			Static55.anInt1578 = this.aByteArray36[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static107.anIntArray247[0] = Static107.anIntArray255[local10];
			Static107.anIntArray249[0] = Static107.anIntArray245[local10];
			local5++;
			Static107.anIntArray254[0] = this.anIntArray238[arg0];
		} else {
			local73 = Static107.anIntArray258[local10];
			local77 = Static107.anIntArray243[local10];
			local82 = this.anIntArray238[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static107.anIntArray241[local32 - local24];
				Static107.anIntArray247[0] = local1 + (local73 + ((Static107.anIntArray258[local20] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[0] = local3 + (local77 + ((Static107.anIntArray243[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static107.anIntArray254[0] = local82 + ((this.anIntArray228[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static107.anIntArray241[local28 - local24];
				Static107.anIntArray247[local5] = local1 + (local73 + ((Static107.anIntArray258[local15] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[local5] = local3 + (local77 + ((Static107.anIntArray243[local15] - local77) * local95 >> 16) << 9) / 50;
				Static107.anIntArray254[local5++] = local82 + ((this.anIntArray234[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static107.anIntArray247[local5] = Static107.anIntArray255[local15];
			Static107.anIntArray249[local5] = Static107.anIntArray245[local15];
			Static107.anIntArray254[local5++] = this.anIntArray234[arg0];
		} else {
			local73 = Static107.anIntArray258[local15];
			local77 = Static107.anIntArray243[local15];
			local82 = this.anIntArray234[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static107.anIntArray241[local24 - local28];
				Static107.anIntArray247[local5] = local1 + (local73 + ((Static107.anIntArray258[local10] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[local5] = local3 + (local77 + ((Static107.anIntArray243[local10] - local77) * local95 >> 16) << 9) / 50;
				Static107.anIntArray254[local5++] = local82 + ((this.anIntArray238[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static107.anIntArray241[local32 - local28];
				Static107.anIntArray247[local5] = local1 + (local73 + ((Static107.anIntArray258[local20] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[local5] = local3 + (local77 + ((Static107.anIntArray243[local20] - local77) * local95 >> 16) << 9) / 50;
				Static107.anIntArray254[local5++] = local82 + ((this.anIntArray228[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static107.anIntArray247[local5] = Static107.anIntArray255[local20];
			Static107.anIntArray249[local5] = Static107.anIntArray245[local20];
			Static107.anIntArray254[local5++] = this.anIntArray228[arg0];
		} else {
			local73 = Static107.anIntArray258[local20];
			local77 = Static107.anIntArray243[local20];
			local82 = this.anIntArray228[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static107.anIntArray241[local28 - local32];
				Static107.anIntArray247[local5] = local1 + (local73 + ((Static107.anIntArray258[local15] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[local5] = local3 + (local77 + ((Static107.anIntArray243[local15] - local77) * local95 >> 16) << 9) / 50;
				Static107.anIntArray254[local5++] = local82 + ((this.anIntArray234[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static107.anIntArray241[local24 - local32];
				Static107.anIntArray247[local5] = local1 + (local73 + ((Static107.anIntArray258[local10] - local73) * local95 >> 16) << 9) / 50;
				Static107.anIntArray249[local5] = local3 + (local77 + ((Static107.anIntArray243[local10] - local77) * local95 >> 16) << 9) / 50;
				Static107.anIntArray254[local5++] = local82 + ((this.anIntArray238[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static107.anIntArray247[0];
		local77 = Static107.anIntArray247[1];
		local82 = Static107.anIntArray247[2];
		local95 = Static107.anIntArray249[0];
		@Pc(590) int local590 = Static107.anIntArray249[1];
		@Pc(594) int local594 = Static107.anIntArray249[2];
		Static55.aBoolean69 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static55.anInt1580 || local77 > Static55.anInt1580 || local82 > Static55.anInt1580) {
				Static55.aBoolean69 = true;
			}
			if (this.aByteArray38 != null && this.aByteArray38[arg0] != -1) {
				local669 = this.aByteArray38[arg0] & 0xFF;
				local674 = this.anIntArray236[local669];
				local679 = this.anIntArray239[local669];
				local684 = this.anIntArray237[local669];
				if (this.anIntArray228[arg0] == -1) {
					Static55.method1044(local95, local590, local594, local73, local77, local82, this.anIntArray238[arg0], this.anIntArray238[arg0], this.anIntArray238[arg0], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], this.aShortArray9[arg0]);
				} else {
					Static55.method1044(local95, local590, local594, local73, local77, local82, Static107.anIntArray254[0], Static107.anIntArray254[1], Static107.anIntArray254[2], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], this.aShortArray9[arg0]);
				}
			} else if (this.anIntArray228[arg0] == -1) {
				Static55.method1050(local95, local590, local594, local73, local77, local82, Static107.anIntArray250[this.anIntArray238[arg0]]);
			} else {
				Static55.method1048(local95, local590, local594, local73, local77, local82, Static107.anIntArray254[0], Static107.anIntArray254[1], Static107.anIntArray254[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static55.anInt1580 || local77 > Static55.anInt1580 || local82 > Static55.anInt1580 || Static107.anIntArray247[3] < 0 || Static107.anIntArray247[3] > Static55.anInt1580) {
			Static55.aBoolean69 = true;
		}
		if (this.aByteArray38 == null || this.aByteArray38[arg0] == -1) {
			if (this.anIntArray228[arg0] == -1) {
				local669 = Static107.anIntArray250[this.anIntArray238[arg0]];
				Static55.method1050(local95, local590, local594, local73, local77, local82, local669);
				Static55.method1050(local95, local594, Static107.anIntArray249[3], local73, local82, Static107.anIntArray247[3], local669);
				return;
			}
			Static55.method1048(local95, local590, local594, local73, local77, local82, Static107.anIntArray254[0], Static107.anIntArray254[1], Static107.anIntArray254[2]);
			Static55.method1048(local95, local594, Static107.anIntArray249[3], local73, local82, Static107.anIntArray247[3], Static107.anIntArray254[0], Static107.anIntArray254[2], Static107.anIntArray254[3]);
			return;
		}
		local669 = this.aByteArray38[arg0] & 0xFF;
		local674 = this.anIntArray236[local669];
		local679 = this.anIntArray239[local669];
		local684 = this.anIntArray237[local669];
		@Pc(924) short local924 = this.aShortArray9[arg0];
		if (this.anIntArray228[arg0] == -1) {
			Static55.method1044(local95, local590, local594, local73, local77, local82, this.anIntArray238[arg0], this.anIntArray238[arg0], this.anIntArray238[arg0], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], local924);
			Static55.method1044(local95, local594, Static107.anIntArray249[3], local73, local82, Static107.anIntArray247[3], this.anIntArray238[arg0], this.anIntArray238[arg0], this.anIntArray238[arg0], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], local924);
			return;
		}
		Static55.method1044(local95, local590, local594, local73, local77, local82, Static107.anIntArray254[0], Static107.anIntArray254[1], Static107.anIntArray254[2], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], local924);
		Static55.method1044(local95, local594, Static107.anIntArray249[3], local73, local82, Static107.anIntArray247[3], Static107.anIntArray254[0], Static107.anIntArray254[2], Static107.anIntArray254[3], Static107.anIntArray258[local674], Static107.anIntArray258[local679], Static107.anIntArray258[local684], Static107.anIntArray243[local674], Static107.anIntArray243[local679], Static107.anIntArray243[local684], Static107.anIntArray242[local674], Static107.anIntArray242[local679], Static107.anIntArray242[local684], local924);
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public void method1786(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static107.anIntArray240[arg0];
		@Pc(7) int local7 = Static107.anIntArray244[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2676; local9++) {
			@Pc(26) int local26 = this.anIntArray233[local9] * local7 - this.anIntArray230[local9] * local3 >> 16;
			this.anIntArray230[local9] = this.anIntArray233[local9] * local3 + this.anIntArray230[local9] * local7 >> 16;
			this.anIntArray233[local9] = local26;
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
	public void method1787() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2676; local1++) {
			@Pc(7) int local7 = this.anIntArray230[local1];
			this.anIntArray230[local1] = this.anIntArray235[local1];
			this.anIntArray235[local1] = -local7;
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fe;ILclient!fe;I[I)V")
	public void method1788(@OriginalArg(0) Class3_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1799(arg0, arg1);
			return;
		}
		@Pc(18) Class61 local18 = arg0.aClass61Array1[arg1];
		@Pc(23) Class61 local23 = arg2.aClass61Array1[arg3];
		@Pc(26) Class3_Sub13 local26 = local18.aClass3_Sub13_1;
		Static107.anInt2684 = 0;
		Static107.anInt2683 = 0;
		Static107.anInt2686 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2372; local41++) {
			local47 = local18.anIntArray203[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray185[local47] == 0) {
				this.method1803(local26.anIntArray185[local47], local26.anIntArrayArray20[local47], local18.anIntArray202[local41], local18.anIntArray206[local41], local18.anIntArray207[local41]);
			}
		}
		Static107.anInt2684 = 0;
		Static107.anInt2683 = 0;
		Static107.anInt2686 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2372; local47++) {
			@Pc(112) int local112 = local23.anIntArray203[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray185[local112] == 0) {
				this.method1803(local26.anIntArray185[local112], local26.anIntArrayArray20[local112], local23.anIntArray202[local47], local23.anIntArray206[local47], local23.anIntArray207[local47]);
			}
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	private void method1790(@OriginalArg(0) int arg0) {
		if (Static107.aBooleanArray13[arg0]) {
			this.method1785(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray232[arg0];
		@Pc(17) int local17 = this.anIntArray231[arg0];
		@Pc(22) int local22 = this.anIntArray229[arg0];
		Static55.aBoolean69 = Static107.aBooleanArray12[arg0];
		if (this.aByteArray36 == null) {
			Static55.anInt1578 = 0;
		} else {
			Static55.anInt1578 = this.aByteArray36[arg0] & 0xFF;
		}
		if (this.aByteArray38 != null && this.aByteArray38[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray38[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray236[local119];
			@Pc(129) int local129 = this.anIntArray239[local119];
			@Pc(134) int local134 = this.anIntArray237[local119];
			if (this.anIntArray228[arg0] == -1) {
				Static55.method1044(Static107.anIntArray245[local12], Static107.anIntArray245[local17], Static107.anIntArray245[local22], Static107.anIntArray255[local12], Static107.anIntArray255[local17], Static107.anIntArray255[local22], this.anIntArray238[arg0], this.anIntArray238[arg0], this.anIntArray238[arg0], Static107.anIntArray258[local124], Static107.anIntArray258[local129], Static107.anIntArray258[local134], Static107.anIntArray243[local124], Static107.anIntArray243[local129], Static107.anIntArray243[local134], Static107.anIntArray242[local124], Static107.anIntArray242[local129], Static107.anIntArray242[local134], this.aShortArray9[arg0]);
			} else {
				Static55.method1044(Static107.anIntArray245[local12], Static107.anIntArray245[local17], Static107.anIntArray245[local22], Static107.anIntArray255[local12], Static107.anIntArray255[local17], Static107.anIntArray255[local22], this.anIntArray238[arg0], this.anIntArray234[arg0], this.anIntArray228[arg0], Static107.anIntArray258[local124], Static107.anIntArray258[local129], Static107.anIntArray258[local134], Static107.anIntArray243[local124], Static107.anIntArray243[local129], Static107.anIntArray243[local134], Static107.anIntArray242[local124], Static107.anIntArray242[local129], Static107.anIntArray242[local134], this.aShortArray9[arg0]);
			}
		} else if (this.anIntArray228[arg0] == -1) {
			Static55.method1050(Static107.anIntArray245[local12], Static107.anIntArray245[local17], Static107.anIntArray245[local22], Static107.anIntArray255[local12], Static107.anIntArray255[local17], Static107.anIntArray255[local22], Static107.anIntArray250[this.anIntArray238[arg0]]);
		} else {
			Static55.method1048(Static107.anIntArray245[local12], Static107.anIntArray245[local17], Static107.anIntArray245[local22], Static107.anIntArray255[local12], Static107.anIntArray255[local17], Static107.anIntArray255[local22], this.anIntArray238[arg0], this.anIntArray234[arg0], this.anIntArray228[arg0]);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V")
	public void method1791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static107.anIntArray256[0] = -1;
		if (this.anInt2675 != 2 && this.anInt2675 != 1) {
			this.method1800();
		}
		@Pc(15) int local15 = Static55.anInt1575;
		@Pc(17) int local17 = Static55.anInt1579;
		@Pc(21) int local21 = Static107.anIntArray240[0];
		@Pc(25) int local25 = Static107.anIntArray244[0];
		@Pc(29) int local29 = Static107.anIntArray240[arg0];
		@Pc(33) int local33 = Static107.anIntArray244[arg0];
		@Pc(37) int local37 = Static107.anIntArray240[arg1];
		@Pc(41) int local41 = Static107.anIntArray244[arg1];
		@Pc(45) int local45 = Static107.anIntArray240[arg2];
		@Pc(49) int local49 = Static107.anIntArray244[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2676; local61++) {
			@Pc(67) int local67 = this.anIntArray235[local61];
			@Pc(72) int local72 = this.anIntArray233[local61];
			@Pc(77) int local77 = this.anIntArray230[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static107.anIntArray253[local61] = local77 - local59;
			Static107.anIntArray255[local61] = local15 + (local67 << 9) / local77;
			Static107.anIntArray245[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2681 > 0) {
				Static107.anIntArray258[local61] = local67;
				Static107.anIntArray243[local61] = local89;
				Static107.anIntArray242[local61] = local77;
			}
		}
		try {
			this.method1795(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1792(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static107.aByteArray40.length < this.anInt2682) {
			Static107.aByteArray40 = new byte[this.anInt2682 + 100];
		}
		return this.method1794(arg0, Static107.aClass3_Sub1_Sub2_Sub6_3, Static107.aByteArray40);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2676; local1++) {
			this.anIntArray235[local1] = this.anIntArray235[local1] * arg0 / 128;
			this.anIntArray233[local1] = this.anIntArray233[local1] * arg1 / 128;
			this.anIntArray230[local1] = this.anIntArray230[local1] * arg2 / 128;
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!t;[B)Lclient!t;")
	private Class3_Sub1_Sub2_Sub6 method1794(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2676 = this.anInt2676;
		arg1.anInt2682 = this.anInt2682;
		arg1.anInt2681 = this.anInt2681;
		if (arg1.anIntArray235 == null || arg1.anIntArray235.length < this.anInt2676) {
			arg1.anIntArray235 = new int[this.anInt2676 + 100];
			arg1.anIntArray233 = new int[this.anInt2676 + 100];
			arg1.anIntArray230 = new int[this.anInt2676 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2676; local43++) {
			arg1.anIntArray235[local43] = this.anIntArray235[local43];
			arg1.anIntArray233[local43] = this.anIntArray233[local43];
			arg1.anIntArray230[local43] = this.anIntArray230[local43];
		}
		if (arg0) {
			arg1.aByteArray36 = this.aByteArray36;
		} else {
			arg1.aByteArray36 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray36 == null) {
				for (local88 = 0; local88 < this.anInt2682; local88++) {
					arg1.aByteArray36[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2682; local88++) {
					arg1.aByteArray36[local88] = this.aByteArray36[local88];
				}
			}
		}
		arg1.anIntArray232 = this.anIntArray232;
		arg1.anIntArray231 = this.anIntArray231;
		arg1.anIntArray229 = this.anIntArray229;
		arg1.anIntArray238 = this.anIntArray238;
		arg1.anIntArray234 = this.anIntArray234;
		arg1.anIntArray228 = this.anIntArray228;
		arg1.aByteArray37 = this.aByteArray37;
		arg1.aByteArray38 = this.aByteArray38;
		arg1.aShortArray9 = this.aShortArray9;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray236 = this.anIntArray236;
		arg1.anIntArray239 = this.anIntArray239;
		arg1.anIntArray237 = this.anIntArray237;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.aBoolean125 = this.aBoolean125;
		arg1.anInt2675 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZZI)V")
	private void method1795(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2678 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2678; local6++) {
			Static107.anIntArray256[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2682; local18++) {
			if (this.anIntArray228[local18] != -2) {
				local30 = this.anIntArray232[local18];
				local35 = this.anIntArray231[local18];
				local40 = this.anIntArray229[local18];
				local44 = Static107.anIntArray255[local30];
				local48 = Static107.anIntArray255[local35];
				local52 = Static107.anIntArray255[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static107.anIntArray258[local30];
					local71 = Static107.anIntArray258[local35];
					@Pc(75) int local75 = Static107.anIntArray258[local40];
					@Pc(79) int local79 = Static107.anIntArray243[local30];
					local83 = Static107.anIntArray243[local35];
					local87 = Static107.anIntArray243[local40];
					@Pc(91) int local91 = Static107.anIntArray242[local30];
					local95 = Static107.anIntArray242[local35];
					@Pc(99) int local99 = Static107.anIntArray242[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static107.aBooleanArray13[local18] = true;
						@Pc(180) int local180 = (Static107.anIntArray253[local30] + Static107.anIntArray253[local35] + Static107.anIntArray253[local40]) / 3 + this.anInt2680;
						Static107.anIntArrayArray25[local180][Static107.anIntArray256[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1789(Static107.anInt2688, Static107.anInt2685, Static107.anIntArray245[local30], Static107.anIntArray245[local35], Static107.anIntArray245[local40], local44, local48, local52)) {
						Static107.anIntArray248[Static107.anInt2687++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static107.anIntArray245[local40] - Static107.anIntArray245[local35]) - (Static107.anIntArray245[local30] - Static107.anIntArray245[local35]) * (local52 - local48) > 0) {
						Static107.aBooleanArray13[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static55.anInt1580 && local48 <= Static55.anInt1580 && local52 <= Static55.anInt1580) {
							Static107.aBooleanArray12[local18] = false;
						} else {
							Static107.aBooleanArray12[local18] = true;
						}
						local67 = (Static107.anIntArray253[local30] + Static107.anIntArray253[local35] + Static107.anIntArray253[local40]) / 3 + this.anInt2680;
						Static107.anIntArrayArray25[local67][Static107.anIntArray256[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray37 == null) {
			for (local30 = this.anInt2678 - 1; local30 >= 0; local30--) {
				local35 = Static107.anIntArray256[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static107.anIntArrayArray25[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1790(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static107.anIntArray252[local30] = 0;
			Static107.anIntArray257[local30] = 0;
		}
		for (local35 = this.anInt2678 - 1; local35 >= 0; local35--) {
			local40 = Static107.anIntArray256[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static107.anIntArrayArray25[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray37[local52];
					local71 = Static107.anIntArray252[local388]++;
					Static107.anIntArrayArray24[local388][local71] = local52;
					if (local388 < 10) {
						Static107.anIntArray257[local388] += local35;
					} else if (local388 == 10) {
						Static107.anIntArray246[local71] = local35;
					} else {
						Static107.anIntArray251[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static107.anIntArray252[1] > 0 || Static107.anIntArray252[2] > 0) {
			local40 = (Static107.anIntArray257[1] + Static107.anIntArray257[2]) / (Static107.anIntArray252[1] + Static107.anIntArray252[2]);
		}
		local44 = 0;
		if (Static107.anIntArray252[3] > 0 || Static107.anIntArray252[4] > 0) {
			local44 = (Static107.anIntArray257[3] + Static107.anIntArray257[4]) / (Static107.anIntArray252[3] + Static107.anIntArray252[4]);
		}
		local48 = 0;
		if (Static107.anIntArray252[6] > 0 || Static107.anIntArray252[8] > 0) {
			local48 = (Static107.anIntArray257[6] + Static107.anIntArray257[8]) / (Static107.anIntArray252[6] + Static107.anIntArray252[8]);
		}
		local67 = 0;
		local71 = Static107.anIntArray252[10];
		@Pc(521) int[] local521 = Static107.anIntArrayArray24[10];
		@Pc(523) int[] local523 = Static107.anIntArray246;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static107.anIntArray252[11];
			local521 = Static107.anIntArrayArray24[11];
			local523 = Static107.anIntArray251;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1790(local521[local67++]);
				if (local67 == local71 && local521 != Static107.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static107.anIntArray252[11];
					local521 = Static107.anIntArrayArray24[11];
					local523 = Static107.anIntArray251;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1790(local521[local67++]);
				if (local67 == local71 && local521 != Static107.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static107.anIntArray252[11];
					local521 = Static107.anIntArrayArray24[11];
					local523 = Static107.anIntArray251;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1790(local521[local67++]);
				if (local67 == local71 && local521 != Static107.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static107.anIntArray252[11];
					local521 = Static107.anIntArrayArray24[11];
					local523 = Static107.anIntArray251;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static107.anIntArray252[local83];
			@Pc(686) int[] local686 = Static107.anIntArrayArray24[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1790(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1790(local521[local67++]);
			if (local67 == local71 && local521 != Static107.anIntArrayArray24[11]) {
				local67 = 0;
				local521 = Static107.anIntArrayArray24[11];
				local71 = Static107.anIntArray252[11];
				local523 = Static107.anIntArray251;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1796(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static107.aByteArray39.length < this.anInt2682) {
			Static107.aByteArray39 = new byte[this.anInt2682 + 100];
		}
		return this.method1794(arg0, Static107.aClass3_Sub1_Sub2_Sub6_2, Static107.aByteArray39);
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
	public int method1797() {
		this.method1798();
		return this.anInt2679;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
	public void method1798() {
		if (this.anInt2675 == 1) {
			return;
		}
		this.anInt2675 = 1;
		super.anInt3141 = 0;
		this.anInt2677 = 0;
		this.anInt2679 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2676; local18++) {
			@Pc(24) int local24 = this.anIntArray235[local18];
			@Pc(29) int local29 = this.anIntArray233[local18];
			@Pc(34) int local34 = this.anIntArray230[local18];
			if (-local29 > super.anInt3141) {
				super.anInt3141 = -local29;
			}
			if (local29 > this.anInt2677) {
				this.anInt2677 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2679) {
				this.anInt2679 = local58;
			}
		}
		this.anInt2679 = (int) (Math.sqrt((double) this.anInt2679) + 0.99D);
		this.anInt2680 = (int) (Math.sqrt((double) (this.anInt2679 * this.anInt2679 + super.anInt3141 * super.anInt3141)) + 0.99D);
		this.anInt2678 = this.anInt2680 + (int) (Math.sqrt((double) (this.anInt2679 * this.anInt2679 + this.anInt2677 * this.anInt2677)) + 0.99D);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method1799(@OriginalArg(0) Class3_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class61 local12 = arg0.aClass61Array1[arg1];
		@Pc(15) Class3_Sub13 local15 = local12.aClass3_Sub13_1;
		Static107.anInt2684 = 0;
		Static107.anInt2683 = 0;
		Static107.anInt2686 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2372; local23++) {
			@Pc(29) int local29 = local12.anIntArray203[local23];
			this.method1803(local15.anIntArray185[local29], local15.anIntArrayArray20[local29], local12.anIntArray202[local23], local12.anIntArray206[local23], local12.anIntArray207[local23]);
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()V")
	private void method1800() {
		if (this.anInt2675 == 2) {
			return;
		}
		this.anInt2675 = 2;
		this.anInt2679 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2676; local12++) {
			@Pc(18) int local18 = this.anIntArray235[local12];
			@Pc(23) int local23 = this.anIntArray233[local12];
			@Pc(28) int local28 = this.anIntArray230[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2679) {
				this.anInt2679 = local40;
			}
		}
		this.anInt2679 = (int) (Math.sqrt((double) this.anInt2679) + 0.99D);
		this.anInt2680 = this.anInt2679;
		this.anInt2678 = this.anInt2679 + this.anInt2679;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZ)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub2_Sub6 local16;
		if (arg4) {
			local16 = new Class3_Sub1_Sub2_Sub6();
			local16.anInt2676 = this.anInt2676;
			local16.anInt2682 = this.anInt2682;
			local16.anInt2681 = this.anInt2681;
			local16.anIntArray235 = this.anIntArray235;
			local16.anIntArray230 = this.anIntArray230;
			local16.anIntArray232 = this.anIntArray232;
			local16.anIntArray231 = this.anIntArray231;
			local16.anIntArray229 = this.anIntArray229;
			local16.anIntArray238 = this.anIntArray238;
			local16.anIntArray234 = this.anIntArray234;
			local16.anIntArray228 = this.anIntArray228;
			local16.aByteArray37 = this.aByteArray37;
			local16.aByteArray36 = this.aByteArray36;
			local16.aByteArray38 = this.aByteArray38;
			local16.aShortArray9 = this.aShortArray9;
			local16.aByte5 = this.aByte5;
			local16.anIntArray236 = this.anIntArray236;
			local16.anIntArray239 = this.anIntArray239;
			local16.anIntArray237 = this.anIntArray237;
			local16.anIntArrayArray22 = this.anIntArrayArray22;
			local16.anIntArrayArray23 = this.anIntArrayArray23;
			local16.aBoolean125 = this.aBoolean125;
			local16.anIntArray233 = new int[local16.anInt2676];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt2676; local124++) {
			@Pc(130) int local130 = this.anIntArray235[local124];
			@Pc(135) int local135 = this.anIntArray233[local124];
			@Pc(140) int local140 = this.anIntArray230[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray233[local124] = local135 + local176 - local122;
		}
		local16.anInt2675 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static107.anIntArray256[0] = -1;
		if (this.anInt2675 != 1) {
			this.method1798();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2679 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2679 << 9;
		if (local64 / local40 >= Static55.anInt1574) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2679 << 9;
		if (local77 / local40 <= Static55.anInt1577) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2679 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static55.anInt1582) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3141 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static55.anInt1576) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3141 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2681 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static107.aBoolean126) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static107.anInt2688 - Static55.anInt1575;
			local223 = Static107.anInt2685 - Static55.anInt1579;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean125) {
					Static107.anIntArray248[Static107.anInt2687++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static55.anInt1575;
		local219 = Static55.anInt1579;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static107.anIntArray240[arg0];
			local257 = Static107.anIntArray244[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2676; local269++) {
			@Pc(275) int local275 = this.anIntArray235[local269];
			@Pc(280) int local280 = this.anIntArray233[local269];
			@Pc(285) int local285 = this.anIntArray230[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static107.anIntArray253[local269] = local285 - local29;
			if (local285 >= 50) {
				Static107.anIntArray255[local269] = local172 + (local275 << 9) / local285;
				Static107.anIntArray245[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static107.anIntArray255[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static107.anIntArray258[local269] = local275;
				Static107.anIntArray243[local269] = local297;
				Static107.anIntArray242[local269] = local285;
			}
		}
		try {
			this.method1795(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "()V")
	public void method1802() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2676; local1++) {
			this.anIntArray235[local1] = -this.anIntArray235[local1];
			this.anIntArray230[local1] = -this.anIntArray230[local1];
		}
		this.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIII)V")
	private void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static107.anInt2684 = 0;
			Static107.anInt2683 = 0;
			Static107.anInt2686 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static107.anInt2684 += this.anIntArray235[local36];
						Static107.anInt2683 += this.anIntArray233[local36];
						Static107.anInt2686 += this.anIntArray230[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static107.anInt2684 = Static107.anInt2684 / local6 + arg2;
				Static107.anInt2683 = Static107.anInt2683 / local6 + arg3;
				Static107.anInt2686 = Static107.anInt2686 / local6 + arg4;
			} else {
				Static107.anInt2684 = arg2;
				Static107.anInt2683 = arg3;
				Static107.anInt2686 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] += arg2;
						this.anIntArray233[local31] += arg3;
						this.anIntArray230[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] -= Static107.anInt2684;
						this.anIntArray233[local31] -= Static107.anInt2683;
						this.anIntArray230[local31] -= Static107.anInt2686;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static107.anIntArray240[local225];
							local235 = Static107.anIntArray244[local225];
							local251 = this.anIntArray233[local31] * local231 + this.anIntArray235[local31] * local235 >> 16;
							this.anIntArray233[local31] = this.anIntArray233[local31] * local235 - this.anIntArray235[local31] * local231 >> 16;
							this.anIntArray235[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static107.anIntArray240[local36];
							local235 = Static107.anIntArray244[local36];
							local251 = this.anIntArray233[local31] * local235 - this.anIntArray230[local31] * local231 >> 16;
							this.anIntArray230[local31] = this.anIntArray233[local31] * local231 + this.anIntArray230[local31] * local235 >> 16;
							this.anIntArray233[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static107.anIntArray240[local219];
							local235 = Static107.anIntArray244[local219];
							local251 = this.anIntArray230[local31] * local231 + this.anIntArray235[local31] * local235 >> 16;
							this.anIntArray230[local31] = this.anIntArray230[local31] * local235 - this.anIntArray235[local31] * local231 >> 16;
							this.anIntArray235[local31] = local251;
						}
						this.anIntArray235[local31] += Static107.anInt2684;
						this.anIntArray233[local31] += Static107.anInt2683;
						this.anIntArray230[local31] += Static107.anInt2686;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] -= Static107.anInt2684;
						this.anIntArray233[local31] -= Static107.anInt2683;
						this.anIntArray230[local31] -= Static107.anInt2686;
						this.anIntArray235[local31] = this.anIntArray235[local31] * arg2 / 128;
						this.anIntArray233[local31] = this.anIntArray233[local31] * arg3 / 128;
						this.anIntArray230[local31] = this.anIntArray230[local31] * arg4 / 128;
						this.anIntArray235[local31] += Static107.anInt2684;
						this.anIntArray233[local31] += Static107.anInt2683;
						this.anIntArray230[local31] += Static107.anInt2686;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray23 != null && this.aByteArray36 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray36[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray36[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIIIII)V")
	public void method1804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static107.anIntArray256[0] = -1;
		if (this.anInt2675 != 2 && this.anInt2675 != 1) {
			this.method1800();
		}
		@Pc(15) int local15 = Static55.anInt1575;
		@Pc(17) int local17 = Static55.anInt1579;
		@Pc(21) int local21 = Static107.anIntArray240[0];
		@Pc(25) int local25 = Static107.anIntArray244[0];
		@Pc(29) int local29 = Static107.anIntArray240[arg0];
		@Pc(33) int local33 = Static107.anIntArray244[arg0];
		@Pc(37) int local37 = Static107.anIntArray240[arg1];
		@Pc(41) int local41 = Static107.anIntArray244[arg1];
		@Pc(45) int local45 = Static107.anIntArray240[arg2];
		@Pc(49) int local49 = Static107.anIntArray244[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2676; local61++) {
			@Pc(67) int local67 = this.anIntArray235[local61];
			@Pc(72) int local72 = this.anIntArray233[local61];
			@Pc(77) int local77 = this.anIntArray230[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static107.anIntArray253[local61] = local77 - local59;
			Static107.anIntArray255[local61] = local15 + (local67 << 9) / arg6;
			Static107.anIntArray245[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2681 > 0) {
				Static107.anIntArray258[local61] = local67;
				Static107.anIntArray243[local61] = local89;
				Static107.anIntArray242[local61] = local77;
			}
		}
		try {
			this.method1795(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}
}
