import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class8_Sub5_Sub14 extends Class8_Sub5 {

	@OriginalMember(owner = "client!og", name = "E", descriptor = "[I")
	private final int[] anIntArray414;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "[I")
	private final int[] anIntArray413;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "Lclient!qt;")
	private final Class8_Sub2 aClass8_Sub2_2;

	@OriginalMember(owner = "client!og", name = "L", descriptor = "Lclient!qt;")
	private final Class8_Sub2 aClass8_Sub2_3;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "Lclient!qt;")
	private final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "[Lclient!qt;")
	private final Class8_Sub2[] aClass8_Sub2Array30;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	private Class8_Sub5_Sub14() {
		this.anIntArray414 = new int[0];
		this.anIntArray413 = new int[0];
		this.aClass8_Sub2_2 = new Class8_Sub2_Sub6(0);
		this.aClass8_Sub2_2.anInt10548 = 1;
		this.aClass8_Sub2_3 = new Class8_Sub2_Sub6();
		this.aClass8_Sub2_3.anInt10548 = 1;
		this.aClass8_Sub2_1 = new Class8_Sub2_Sub6();
		this.aClass8_Sub2_1.anInt10548 = 1;
		this.aClass8_Sub2Array30 = new Class8_Sub2[] { this.aClass8_Sub2_3, this.aClass8_Sub2_1, this.aClass8_Sub2_2 };
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class8_Sub5_Sub14(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method8525();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass8_Sub2Array30 = new Class8_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class8_Sub2 local26 = Static256.method3023(arg0);
			if (local26.method8511() >= 0) {
				local9++;
			}
			if (local26.method8503() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass8_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method8525();
			}
			this.aClass8_Sub2Array30[local20] = local26;
		}
		this.anIntArray413 = new int[local9];
		this.anIntArray414 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class8_Sub2 local98 = this.aClass8_Sub2Array30[local91];
			local50 = local98.aClass8_Sub2Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass8_Sub2Array42[local104] = this.aClass8_Sub2Array30[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method8511();
			@Pc(130) int local130 = local98.method8503();
			if (local126 > 0) {
				this.anIntArray413[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray414[local11++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass8_Sub2_3 = this.aClass8_Sub2Array30[arg0.method8525()];
		this.aClass8_Sub2_1 = this.aClass8_Sub2Array30[arg0.method8525()];
		this.aClass8_Sub2_2 = this.aClass8_Sub2Array30[arg0.method8525()];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!d;ZLclient!oh;III)[F")
	public float[] method6273(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static206.aClass237_130 = arg2;
		Static596.anInterface2_13 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass8_Sub2Array30.length; local11++) {
			this.aClass8_Sub2Array30[local11].method8509(arg4, arg3);
		}
		Static364.method5678(arg3, arg4);
		@Pc(38) float[] local38 = new float[arg3 * arg4 * 4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg4; local42++) {
			@Pc(58) int[] local58;
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			if (this.aClass8_Sub2_3.aBoolean753) {
				@Pc(54) int[] local54 = this.aClass8_Sub2_3.method8507(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass8_Sub2_3.method8500(local42);
				local58 = local68[0];
				local56 = local68[1];
				local60 = local68[2];
			}
			@Pc(92) int[] local92;
			if (this.aClass8_Sub2_1.aBoolean753) {
				local92 = this.aClass8_Sub2_1.method8507(local42);
			} else {
				local92 = this.aClass8_Sub2_1.method8500(local42)[0];
			}
			if (arg1) {
				local40 = local42 << 2;
			}
			@Pc(116) int[] local116;
			if (this.aClass8_Sub2_2.aBoolean753) {
				local116 = this.aClass8_Sub2_2.method8507(local42);
			} else {
				local116 = this.aClass8_Sub2_2.method8500(local42)[0];
			}
			for (@Pc(130) int local130 = arg3 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local92[local130] / 4096.0F;
				@Pc(152) float local152 = ((float) local116[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				local38[local40++] = (float) local58[local130] * local152;
				local38[local40++] = (float) local56[local130] * local152;
				local38[local40++] = local152 * (float) local60[local130];
				local38[local40++] = local139;
				if (arg1) {
					local40 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass8_Sub2Array30.length; local227++) {
			this.aClass8_Sub2Array30[local227].method8506();
		}
		return local38;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!d;Lclient!oh;B)Z")
	public boolean method6275(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class237 arg1) {
		@Pc(9) int local9;
		if (Static504.anInt8867 < 0) {
			for (local9 = 0; local9 < this.anIntArray413.length; local9++) {
				if (!arg1.method6296(this.anIntArray413[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray413.length; local9++) {
				if (!arg1.method6326(Static504.anInt8867, this.anIntArray413[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray414.length; local9++) {
			if (!arg0.method4025(this.anIntArray414[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIDLclient!oh;BLclient!d;Z)[I")
	public int[] method6276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) boolean arg5) {
		Static206.aClass237_130 = arg3;
		Static596.anInterface2_13 = arg4;
		for (@Pc(16) int local16 = 0; local16 < this.aClass8_Sub2Array30.length; local16++) {
			this.aClass8_Sub2Array30[local16].method8509(arg1, arg0);
		}
		Static471.method7030(arg2);
		Static364.method5678(arg0, arg1);
		@Pc(48) int[] local48 = new int[arg0 * arg1];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			@Pc(68) int[] local68;
			@Pc(76) int[] local76;
			@Pc(72) int[] local72;
			@Pc(84) int[] local84;
			if (this.aClass8_Sub2_3.aBoolean753) {
				local84 = this.aClass8_Sub2_3.method8507(local52);
				local76 = local84;
				local72 = local84;
				local68 = local84;
			} else {
				@Pc(64) int[][] local64 = this.aClass8_Sub2_3.method8500(local52);
				local68 = local64[0];
				local72 = local64[2];
				local76 = local64[1];
			}
			if (arg5) {
				local50 = local52;
			}
			if (this.aClass8_Sub2_1.aBoolean753) {
				local84 = this.aClass8_Sub2_1.method8507(local52);
			} else {
				local84 = this.aClass8_Sub2_1.method8500(local52)[0];
			}
			for (@Pc(118) int local118 = arg0 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local68[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(143) int local143 = local76[local118] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(161) int local161 = local72[local118] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local143 = Static85.anIntArray454[local143];
				if (local161 < 0) {
					local161 = 0;
				}
				local126 = Static85.anIntArray454[local126];
				local161 = Static85.anIntArray454[local161];
				@Pc(197) int local197;
				if (local126 == 0 && local143 == 0 && local161 == 0) {
					local197 = 0;
				} else {
					local197 = local84[local118] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local48[local50++] = (local197 << 24) + (local126 << 16) + (local143 << 8) + local161;
				if (arg5) {
					local50 += arg0 - 1;
				}
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.aClass8_Sub2Array30.length; local248++) {
			this.aClass8_Sub2Array30[local248].method8506();
		}
		return local48;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(DIBZILclient!d;ZLclient!oh;)[I")
	public int[] method6281(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class237 arg6) {
		Static596.anInterface2_13 = arg4;
		Static206.aClass237_130 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass8_Sub2Array30.length; local11++) {
			this.aClass8_Sub2Array30[local11].method8509(arg1, arg3);
		}
		Static471.method7030(arg0);
		Static364.method5678(arg3, arg1);
		@Pc(44) int[] local44 = new int[arg1 * arg3];
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(54) byte local54;
		if (arg2) {
			local48 = -1;
			local52 = arg3 - 1;
			local54 = -1;
		} else {
			local52 = 0;
			local48 = arg3;
			local54 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
			if (arg5) {
				local64 = local66;
			}
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			if (this.aClass8_Sub2_3.aBoolean753) {
				@Pc(102) int[] local102 = this.aClass8_Sub2_3.method8507(local66);
				local86 = local102;
				local94 = local102;
				local90 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass8_Sub2_3.method8500(local66);
				local86 = local82[2];
				local90 = local82[1];
				local94 = local82[0];
			}
			for (@Pc(110) int local110 = local52; local110 != local48; local110 += local54) {
				@Pc(118) int local118 = local94[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(133) int local133 = local90[local110] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(153) int local153 = local86[local110] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local118 = Static85.anIntArray454[local118];
				if (local153 < 0) {
					local153 = 0;
				}
				local133 = Static85.anIntArray454[local133];
				local153 = Static85.anIntArray454[local153];
				@Pc(189) int local189 = local153 + (local133 << 8) + (local118 << 16);
				if (local189 != 0) {
					local189 |= 0xFF000000;
				}
				local44[local64++] = local189;
				if (arg5) {
					local64 += arg3 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass8_Sub2Array30.length; local229++) {
			this.aClass8_Sub2Array30[local229].method8506();
		}
		return local44;
	}
}
