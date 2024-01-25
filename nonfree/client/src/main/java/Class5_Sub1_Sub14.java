import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "[I")
	private final int[] anIntArray391;

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "[I")
	private final int[] anIntArray392;

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "Lclient!sp;")
	private final Class5_Sub3 aClass5_Sub3_2;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "Lclient!sp;")
	private final Class5_Sub3 aClass5_Sub3_3;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "Lclient!sp;")
	private final Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[Lclient!sp;")
	private final Class5_Sub3[] aClass5_Sub3Array25;

	static {
		new Class85("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class85("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	private Class5_Sub1_Sub14() {
		this.anIntArray391 = new int[0];
		this.anIntArray392 = new int[0];
		this.aClass5_Sub3_2 = new Class5_Sub3_Sub30(0);
		this.aClass5_Sub3_2.anInt6801 = 1;
		this.aClass5_Sub3_3 = new Class5_Sub3_Sub30();
		this.aClass5_Sub3_3.anInt6801 = 1;
		this.aClass5_Sub3_1 = new Class5_Sub3_Sub30();
		this.aClass5_Sub3_1.anInt6801 = 1;
		this.aClass5_Sub3Array25 = new Class5_Sub3[] { this.aClass5_Sub3_3, this.aClass5_Sub3_1, this.aClass5_Sub3_2 };
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class5_Sub1_Sub14(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method5115();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass5_Sub3Array25 = new Class5_Sub3[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub3 local26 = Static202.method3712(arg0);
			if (local26.method6021() >= 0) {
				local9++;
			}
			if (local26.method6012() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub3Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5115();
			}
			this.aClass5_Sub3Array25[local20] = local26;
		}
		this.anIntArray391 = new int[local9];
		local9 = 0;
		this.anIntArray392 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class5_Sub3 local102 = this.aClass5_Sub3Array25[local95];
			local50 = local102.aClass5_Sub3Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass5_Sub3Array42[local108] = this.aClass5_Sub3Array25[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method6021();
			@Pc(134) int local134 = local102.method6012();
			if (local130 > 0) {
				this.anIntArray391[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray392[local11++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass5_Sub3_3 = this.aClass5_Sub3Array25[arg0.method5115()];
		this.aClass5_Sub3_1 = this.aClass5_Sub3Array25[arg0.method5115()];
		this.aClass5_Sub3_2 = this.aClass5_Sub3Array25[arg0.method5115()];
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZIILclient!gf;DLclient!ij;Z)[I")
	public int[] method3770(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) double arg4, @OriginalArg(5) Class93 arg5) {
		Static213.aClass93_81 = arg5;
		Static216.anInterface3_5 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub3Array25.length; local11++) {
			this.aClass5_Sub3Array25[local11].method6013(arg2, arg1);
		}
		Static204.method3756(arg4);
		Static230.method4145(arg1, arg2);
		@Pc(45) int[] local45 = new int[arg2 * arg1 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg1; local49++) {
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			@Pc(67) int[] local67;
			@Pc(61) int[] local61;
			if (this.aClass5_Sub3_3.aBoolean592) {
				local61 = this.aClass5_Sub3_3.method6011(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass5_Sub3_3.method6016(local49);
				local65 = local75[1];
				local63 = local75[0];
				local67 = local75[2];
			}
			if (this.aClass5_Sub3_1.aBoolean592) {
				local61 = this.aClass5_Sub3_1.method6011(local49);
			} else {
				local61 = this.aClass5_Sub3_1.method6016(local49)[0];
			}
			if (arg0) {
				local47 = local49;
			}
			for (@Pc(115) int local115 = arg2 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local63[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(141) int local141 = local65[local115] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(156) int local156 = local67[local115] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local141 = Static43.anIntArray643[local141];
				local123 = Static43.anIntArray643[local123];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = Static43.anIntArray643[local156];
				@Pc(198) int local198;
				if (local123 == 0 && local141 == 0 && local156 == 0) {
					local198 = 0;
				} else {
					local198 = local61[local115] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local45[local47++] = local156 + (local141 << 8) + (local123 << 16) + (local198 << 24);
				if (arg0) {
					local47 += arg2 - 1;
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < this.aClass5_Sub3Array25.length; local252++) {
			this.aClass5_Sub3Array25[local252].method6014();
		}
		return local45;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ij;DLclient!gf;ZIIZI)[I")
	public int[] method3772(@OriginalArg(0) Class93 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		Static216.anInterface3_5 = arg2;
		Static213.aClass93_81 = arg0;
		for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub3Array25.length; local16++) {
			this.aClass5_Sub3Array25[local16].method6013(arg5, arg4);
		}
		Static204.method3756(arg1);
		Static230.method4145(arg4, arg5);
		@Pc(48) int[] local48 = new int[arg5 * arg4];
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(52) byte local52;
		if (arg3) {
			local52 = -1;
			local56 = arg5 - 1;
			local58 = -1;
		} else {
			local56 = 0;
			local52 = 1;
			local58 = arg5;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg4; local70++) {
			if (arg6) {
				local68 = local70;
			}
			@Pc(90) int[] local90;
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			if (this.aClass5_Sub3_3.aBoolean592) {
				@Pc(86) int[] local86 = this.aClass5_Sub3_3.method6011(local70);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass5_Sub3_3.method6016(local70);
				local92 = local100[1];
				local88 = local100[2];
				local90 = local100[0];
			}
			for (@Pc(114) int local114 = local56; local114 != local58; local114 += local52) {
				@Pc(122) int local122 = local90[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local92[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(160) int local160 = local88[local114] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local122 = Static43.anIntArray643[local122];
				local142 = Static43.anIntArray643[local142];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static43.anIntArray643[local160];
				@Pc(194) int local194 = local160 + (local122 << 16) + (local142 << 8);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local48[local68++] = local194;
				if (arg6) {
					local68 += arg5 - 1;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass5_Sub3Array25.length; local233++) {
			this.aClass5_Sub3Array25[local233].method6014();
		}
		return local48;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ij;IIBZLclient!gf;)[F")
	public float[] method3774(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface3 arg4) {
		Static213.aClass93_81 = arg0;
		Static216.anInterface3_5 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub3Array25.length; local11++) {
			this.aClass5_Sub3Array25[local11].method6013(arg1, arg2);
		}
		Static230.method4145(arg2, arg1);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg1];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
			@Pc(62) int[] local62;
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			if (this.aClass5_Sub3_3.aBoolean592) {
				@Pc(58) int[] local58 = this.aClass5_Sub3_3.method6011(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass5_Sub3_3.method6016(local46);
				local64 = local72[1];
				local62 = local72[0];
				local60 = local72[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass5_Sub3_1.aBoolean592) {
				local94 = this.aClass5_Sub3_1.method6011(local46);
			} else {
				local94 = this.aClass5_Sub3_1.method6016(local46)[0];
			}
			@Pc(114) int[] local114;
			if (this.aClass5_Sub3_2.aBoolean592) {
				local114 = this.aClass5_Sub3_2.method6011(local46);
			} else {
				local114 = this.aClass5_Sub3_2.method6016(local46)[0];
			}
			if (arg3) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local114[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local170 * (float) local62[local134];
				local42[local44++] = (float) local64[local134] * local170;
				local42[local44++] = local170 * (float) local60[local134];
				local42[local44++] = local143;
				if (arg3) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass5_Sub3Array25.length; local237++) {
			this.aClass5_Sub3Array25[local237].method6014();
		}
		return local42;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ij;Lclient!gf;I)Z")
	public boolean method3775(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Interface3 arg1) {
		@Pc(12) int local12;
		if (Static150.anInt2939 <= 0) {
			for (local12 = 0; local12 < this.anIntArray391.length; local12++) {
				if (!arg0.method2414(this.anIntArray391[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray391.length; local12++) {
				if (!arg0.method2390(this.anIntArray391[local12], Static150.anInt2939)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray392.length; local12++) {
			if (!arg1.method1509(this.anIntArray392[local12])) {
				return false;
			}
		}
		return true;
	}
}
