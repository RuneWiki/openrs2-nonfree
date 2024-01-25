import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!en", name = "H", descriptor = "[I")
	private final int[] anIntArray77;

	@OriginalMember(owner = "client!en", name = "N", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!en", name = "P", descriptor = "Lclient!qb;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!en", name = "I", descriptor = "Lclient!qb;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!en", name = "S", descriptor = "Lclient!qb;")
	private final Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "[Lclient!qb;")
	private final Class1_Sub1[] aClass1_Sub1Array11;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	private Class1_Sub3_Sub6() {
		this.anIntArray77 = new int[0];
		this.anIntArray79 = new int[0];
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub21(0);
		this.aClass1_Sub1_2.anInt7441 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub21();
		this.aClass1_Sub1_1.anInt7441 = 1;
		this.aClass1_Sub1_3 = new Class1_Sub1_Sub21();
		this.aClass1_Sub1_3.anInt7441 = 1;
		this.aClass1_Sub1Array11 = new Class1_Sub1[] { this.aClass1_Sub1_1, this.aClass1_Sub1_3, this.aClass1_Sub1_2 };
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class1_Sub3_Sub6(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method4463();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass1_Sub1Array11 = new Class1_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static383.method4896(arg0);
			if (local26.method5623() >= 0) {
				local9++;
			}
			if (local26.method5628() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method4463();
			}
			this.aClass1_Sub1Array11[local20] = local26;
		}
		this.anIntArray79 = new int[local9];
		local9 = 0;
		this.anIntArray77 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class1_Sub1 local102 = this.aClass1_Sub1Array11[local95];
			local50 = local102.aClass1_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass1_Sub1Array42[local108] = this.aClass1_Sub1Array11[local18[local95][local108]];
			}
			@Pc(134) int local134 = local102.method5623();
			@Pc(138) int local138 = local102.method5628();
			if (local134 > 0) {
				this.anIntArray79[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray77[local11++] = local138;
			}
			local18[local95] = null;
		}
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array11[arg0.method4463()];
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array11[arg0.method4463()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array11[arg0.method4463()];
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZILclient!m;Lclient!ic;IB)[F")
	public float[] method1389(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) int arg4) {
		Static199.aClass113_64 = arg3;
		Static400.anInterface8_11 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array11.length; local11++) {
			this.aClass1_Sub1Array11[local11].method5625(arg4, arg1);
		}
		Static343.method4361(arg4, arg1);
		@Pc(38) float[] local38 = new float[arg1 * arg4 * 4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			@Pc(58) int[] local58;
			if (this.aClass1_Sub1_1.aBoolean612) {
				@Pc(54) int[] local54 = this.aClass1_Sub1_1.method5622(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub1_1.method5626(local42);
				local60 = local68[1];
				local56 = local68[0];
				local58 = local68[2];
			}
			@Pc(92) int[] local92;
			if (this.aClass1_Sub1_3.aBoolean612) {
				local92 = this.aClass1_Sub1_3.method5622(local42);
			} else {
				local92 = this.aClass1_Sub1_3.method5626(local42)[0];
			}
			if (arg0) {
				local40 = local42 << 2;
			}
			@Pc(118) int[] local118;
			if (this.aClass1_Sub1_2.aBoolean612) {
				local118 = this.aClass1_Sub1_2.method5622(local42);
			} else {
				local118 = this.aClass1_Sub1_2.method5626(local42)[0];
			}
			for (@Pc(130) int local130 = arg4 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local92[local130] / 4096.0F;
				@Pc(152) float local152 = ((float) local118[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				local38[local40++] = local152 * (float) local56[local130];
				local38[local40++] = (float) local60[local130] * local152;
				local38[local40++] = local152 * (float) local58[local130];
				local38[local40++] = local139;
				if (arg0) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(220) int local220 = 0; local220 < this.aClass1_Sub1Array11.length; local220++) {
			this.aClass1_Sub1Array11[local220].method5630();
		}
		return local38;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!m;ILclient!ic;)Z")
	public boolean method1394(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Class113 arg1) {
		@Pc(14) int local14;
		if (Static395.anInt7176 >= 0) {
			for (local14 = 0; local14 < this.anIntArray79.length; local14++) {
				if (!arg1.method2251(this.anIntArray79[local14], Static395.anInt7176)) {
					return false;
				}
			}
		} else {
			for (local14 = 0; local14 < this.anIntArray79.length; local14++) {
				if (!arg1.method2253(this.anIntArray79[local14])) {
					return false;
				}
			}
		}
		for (local14 = 0; local14 < this.anIntArray77.length; local14++) {
			if (!arg0.method1376(this.anIntArray77[local14])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!ic;DZLclient!m;III)[I")
	public int[] method1396(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface8 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		Static199.aClass113_64 = arg1;
		Static400.anInterface8_11 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array11.length; local11++) {
			this.aClass1_Sub1Array11[local11].method5625(arg6, arg5);
		}
		Static37.method637(arg2);
		Static343.method4361(arg6, arg5);
		@Pc(43) int[] local43 = new int[arg5 * arg6];
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg3) {
			local49 = -1;
			local51 = arg6 - 1;
			local47 = -1;
		} else {
			local47 = 1;
			local49 = arg6;
			local51 = 0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg5; local65++) {
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub1_1.aBoolean612) {
				@Pc(97) int[] local97 = this.aClass1_Sub1_1.method5622(local65);
				local89 = local97;
				local81 = local97;
				local85 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub1_1.method5626(local65);
				local81 = local77[2];
				local85 = local77[1];
				local89 = local77[0];
			}
			if (arg0) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local51; local109 != local49; local109 += local47) {
				@Pc(117) int local117 = local89[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local85[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(150) int local150 = local81[local109] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				if (local150 < 0) {
					local150 = 0;
				}
				local117 = Static341.anIntArray336[local117];
				local135 = Static341.anIntArray336[local135];
				local150 = Static341.anIntArray336[local150];
				@Pc(184) int local184 = local150 + (local117 << 16) + (local135 << 8);
				if (local184 != 0) {
					local184 |= 0xFF000000;
				}
				local43[local63++] = local184;
				if (arg0) {
					local63 += arg6 - 1;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass1_Sub1Array11.length; local235++) {
			this.aClass1_Sub1Array11[local235].method5630();
		}
		return local43;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIDIILclient!m;Lclient!ic;)[I")
	public int[] method1399(@OriginalArg(0) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface8 arg4, @OriginalArg(6) Class113 arg5) {
		Static199.aClass113_64 = arg5;
		Static400.anInterface8_11 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array11.length; local11++) {
			this.aClass1_Sub1Array11[local11].method5625(arg3, arg2);
		}
		Static37.method637(arg1);
		Static343.method4361(arg3, arg2);
		@Pc(45) int[] local45 = new int[arg2 * 4 * arg3];
		@Pc(47) int local47 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
			@Pc(72) int[] local72;
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(68) int[] local68;
			if (this.aClass1_Sub1_1.aBoolean612) {
				local68 = this.aClass1_Sub1_1.method5622(local54);
				local70 = local68;
				local72 = local68;
				local74 = local68;
			} else {
				@Pc(82) int[][] local82 = this.aClass1_Sub1_1.method5626(local54);
				local74 = local82[2];
				local70 = local82[1];
				local72 = local82[0];
			}
			if (arg0) {
				local47 = local54;
			}
			if (this.aClass1_Sub1_3.aBoolean612) {
				local68 = this.aClass1_Sub1_3.method5622(local54);
			} else {
				local68 = this.aClass1_Sub1_3.method5626(local54)[0];
			}
			for (@Pc(124) int local124 = arg3 - 1; local124 >= 0; local124--) {
				@Pc(132) int local132 = local72[local124] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(152) int local152 = local70[local124] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				@Pc(170) int local170 = local74[local124] >> 4;
				if (local170 > 255) {
					local170 = 255;
				}
				local152 = Static341.anIntArray336[local152];
				local132 = Static341.anIntArray336[local132];
				if (local170 < 0) {
					local170 = 0;
				}
				local170 = Static341.anIntArray336[local170];
				@Pc(213) int local213;
				if (local132 == 0 && local152 == 0 && local170 == 0) {
					local213 = 0;
				} else {
					local213 = local68[local124] >> 4;
					if (local213 > 255) {
						local213 = 255;
					}
					if (local213 < 0) {
						local213 = 0;
					}
				}
				local45[local47++] = local170 + (local152 << 8) + (local132 << 16) + (local213 << 24);
				if (arg0) {
					local47 += arg3 - 1;
				}
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.aClass1_Sub1Array11.length; local274++) {
			this.aClass1_Sub1Array11[local274].method5630();
		}
		return local45;
	}
}
