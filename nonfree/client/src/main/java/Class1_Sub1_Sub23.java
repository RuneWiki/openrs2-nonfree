import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "[I")
	public static int[] anIntArray492 = new int[99];

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "[I")
	private int[] anIntArray493;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
	private int[] anIntArray494;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!qb;")
	private Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "Lclient!qb;")
	private Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!qb;")
	private Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lclient!qb;")
	private Class1_Sub2[] aClass1_Sub2Array38;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 99; local8++) {
			@Pc(17) int local17 = local8 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local6 += local30;
			anIntArray492[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class1_Sub1_Sub23(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method2595();
		@Pc(10) int[][] local10 = new int[local7][];
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		this.aClass1_Sub2Array38 = new Class1_Sub2[local7];
		@Pc(20) int local20;
		@Pc(27) Class1_Sub2 local27;
		@Pc(45) int local45;
		@Pc(52) int local52;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = Static220.method4571(arg0);
			if (local27.method4581() >= 0) {
				local12++;
			}
			if (local27.method4576() >= 0) {
				local14++;
			}
			local45 = local27.aClass1_Sub2Array42.length;
			local10[local20] = new int[local45];
			for (local52 = 0; local52 < local45; local52++) {
				local10[local20][local52] = arg0.method2595();
			}
			this.aClass1_Sub2Array38[local20] = local27;
		}
		this.anIntArray493 = new int[local14];
		local14 = 0;
		this.anIntArray494 = new int[local12];
		local12 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass1_Sub2Array38[local20];
			local45 = local27.aClass1_Sub2Array42.length;
			for (local52 = 0; local52 < local45; local52++) {
				local27.aClass1_Sub2Array42[local52] = this.aClass1_Sub2Array38[local10[local20][local52]];
			}
			local52 = local27.method4581();
			@Pc(140) int local140 = local27.method4576();
			if (local52 > 0) {
				this.anIntArray494[local12++] = local52;
			}
			if (local140 > 0) {
				this.anIntArray493[local14++] = local140;
			}
			local10[local20] = null;
		}
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array38[arg0.method2595()];
		local10 = null;
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array38[arg0.method2595()];
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array38[arg0.method2595()];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ph;ZILclient!pe;IZD)Lclient!ln;")
	public Class1_Sub1_Sub3_Sub2 method4212(@OriginalArg(0) Class138 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) double arg4) {
		Static7.method110(arg4);
		Static61.aClass138_14 = arg0;
		Static283.anInterface5_1 = arg2;
		Static68.method1140(arg1, arg3);
		@Pc(28) Class1_Sub1_Sub3_Sub2 local28 = new Class1_Sub1_Sub3_Sub2(arg1, arg3);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass1_Sub2Array38.length; local30++) {
			this.aClass1_Sub2Array38[local30].method4579(arg1, arg3);
		}
		local30 = 0;
		@Pc(54) int local54;
		for (local54 = 0; local54 < arg3; local54++) {
			@Pc(80) int[] local80;
			@Pc(88) int[] local88;
			@Pc(84) int[] local84;
			if (this.aClass1_Sub2_3.aBoolean424) {
				@Pc(96) int[] local96 = this.aClass1_Sub2_3.method4577(local54);
				local80 = local96;
				local84 = local96;
				local88 = local96;
			} else {
				@Pc(76) int[][] local76 = this.aClass1_Sub2_3.method4572(local54);
				local80 = local76[0];
				local84 = local76[2];
				local88 = local76[1];
			}
			for (@Pc(106) int local106 = arg1 - 1; local106 >= 0; local106--) {
				@Pc(117) int local117 = local88[local106] >> 4;
				@Pc(123) int local123 = local80[local106] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				@Pc(135) int local135 = local84[local106] >> 4;
				if (local123 < 0) {
					local123 = 0;
				}
				local123 = Static267.anIntArray464[local123];
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				local135 = Static267.anIntArray464[local135];
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				local117 = Static267.anIntArray464[local117];
				local28.anIntArray344[local30++] = local135 + (local123 << 16) + (local117 << 8);
			}
		}
		for (local54 = 0; local54 < this.aClass1_Sub2Array38.length; local54++) {
			this.aClass1_Sub2Array38[local54].method4580();
		}
		return local28;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBZLclient!ph;Lclient!pe;)[F")
	public float[] method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class138 arg3, @OriginalArg(5) Interface5 arg4) {
		Static283.anInterface5_1 = arg4;
		Static61.aClass138_14 = arg3;
		Static68.method1140(arg0, arg1);
		@Pc(20) float[] local20 = new float[arg1 * arg0 * 4];
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass1_Sub2Array38.length; local30++) {
			this.aClass1_Sub2Array38[local30].method4579(arg0, arg1);
		}
		local30 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg1; local50++) {
			if (arg2) {
				local30 = local50 << 2;
			}
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub2_3.aBoolean424) {
				@Pc(89) int[] local89 = this.aClass1_Sub2_3.method4577(local50);
				local81 = local89;
				local73 = local89;
				local77 = local89;
			} else {
				@Pc(69) int[][] local69 = this.aClass1_Sub2_3.method4572(local50);
				local73 = local69[0];
				local77 = local69[1];
				local81 = local69[2];
			}
			@Pc(107) int[] local107;
			if (this.aClass1_Sub2_2.aBoolean424) {
				local107 = this.aClass1_Sub2_2.method4577(local50);
			} else {
				local107 = this.aClass1_Sub2_2.method4572(local50)[0];
			}
			@Pc(125) int[] local125;
			if (this.aClass1_Sub2_1.aBoolean424) {
				local125 = this.aClass1_Sub2_1.method4577(local50);
			} else {
				local125 = this.aClass1_Sub2_1.method4572(local50)[0];
			}
			for (@Pc(139) int local139 = arg0 - 1; local139 >= 0; local139--) {
				@Pc(154) float local154 = ((float) local125[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				@Pc(161) float local161 = (float) local107[local139] / 4096.0F;
				local20[local30++] = (float) local73[local139] * local154;
				if (local161 < 0.0F) {
					local161 = 0.0F;
				} else if (local161 > 1.0F) {
					local161 = 1.0F;
				}
				local20[local30++] = local154 * (float) local77[local139];
				local20[local30++] = local154 * (float) local81[local139];
				local20[local30++] = local161;
				if (arg2) {
					local30 += (arg0 << 2) - 4;
				}
			}
		}
		for (local50 = 0; local50 < this.aClass1_Sub2Array38.length; local50++) {
			this.aClass1_Sub2Array38[local50].method4580();
		}
		return local20;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ph;ZIBLclient!pe;IDZ)[I")
	public int[] method4215(@OriginalArg(0) Class138 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) boolean arg6) {
		@Pc(10) int[] local10 = new int[arg2 * arg4];
		Static7.method110(arg5);
		Static61.aClass138_14 = arg0;
		Static283.anInterface5_1 = arg3;
		Static68.method1140(arg4, arg2);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass1_Sub2Array38.length; local23++) {
			this.aClass1_Sub2Array38[local23].method4579(arg4, arg2);
		}
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg1) {
			local23 = arg4 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local47 = arg4;
			local49 = 1;
			local23 = 0;
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65;
		for (local65 = 0; local65 < arg2; local65++) {
			if (arg6) {
				local63 = local65;
			}
			@Pc(92) int[] local92;
			@Pc(96) int[] local96;
			@Pc(100) int[] local100;
			if (this.aClass1_Sub2_3.aBoolean424) {
				@Pc(108) int[] local108 = this.aClass1_Sub2_3.method4577(local65);
				local96 = local108;
				local100 = local108;
				local92 = local108;
			} else {
				@Pc(88) int[][] local88 = this.aClass1_Sub2_3.method4572(local65);
				local92 = local88[0];
				local96 = local88[1];
				local100 = local88[2];
			}
			for (@Pc(116) int local116 = local23; local116 != local47; local116 += local49) {
				@Pc(125) int local125 = local100[local116] >> 4;
				@Pc(131) int local131 = local92[local116] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				@Pc(142) int local142 = local96[local116] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				local125 = Static267.anIntArray464[local125];
				local142 = Static267.anIntArray464[local142];
				local131 = Static267.anIntArray464[local131];
				local10[local63++] = local125 + (local142 << 8) + (local131 << 16);
				if (arg6) {
					local63 += arg4 - 1;
				}
			}
		}
		for (local65 = 0; local65 < this.aClass1_Sub2Array38.length; local65++) {
			this.aClass1_Sub2Array38[local65].method4580();
		}
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ph;BLclient!pe;)Z")
	public boolean method4216(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Interface5 arg1) {
		@Pc(10) int local10;
		if (Static175.anInt3623 > 0) {
			for (local10 = 0; local10 < this.anIntArray494.length; local10++) {
				if (!arg0.method3362(this.anIntArray494[local10], Static175.anInt3623)) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray494.length; local10++) {
				if (!arg0.method3340(this.anIntArray494[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray493.length; local10++) {
			if (!arg1.method1619(this.anIntArray493[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pe;IIZDZLclient!ph;)[I")
	public int[] method4217(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) double arg4, @OriginalArg(6) Class138 arg5) {
		@Pc(12) int[] local12 = new int[arg2 * arg1 * 4];
		Static7.method110(arg4);
		Static61.aClass138_14 = arg5;
		Static283.anInterface5_1 = arg0;
		Static68.method1140(arg2, arg1);
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass1_Sub2Array38.length; local43++) {
			this.aClass1_Sub2Array38[local43].method4579(arg2, arg1);
		}
		local43 = 0;
		@Pc(67) int local67;
		for (local67 = 0; local67 < arg1; local67++) {
			if (arg3) {
				local43 = local67;
			}
			@Pc(101) int[] local101;
			@Pc(93) int[] local93;
			@Pc(97) int[] local97;
			@Pc(109) int[] local109;
			if (this.aClass1_Sub2_3.aBoolean424) {
				local109 = this.aClass1_Sub2_3.method4577(local67);
				local101 = local109;
				local93 = local109;
				local97 = local109;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub2_3.method4572(local67);
				local93 = local89[1];
				local97 = local89[2];
				local101 = local89[0];
			}
			if (this.aClass1_Sub2_2.aBoolean424) {
				local109 = this.aClass1_Sub2_2.method4577(local67);
			} else {
				local109 = this.aClass1_Sub2_2.method4572(local67)[0];
			}
			for (@Pc(139) int local139 = arg2 - 1; local139 >= 0; local139--) {
				@Pc(147) int local147 = local101[local139] >> 4;
				@Pc(153) int local153 = local93[local139] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local153 > 255) {
					local153 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				@Pc(185) int local185 = local97[local139] >> 4;
				local153 = Static267.anIntArray464[local153];
				local147 = Static267.anIntArray464[local147];
				if (local185 > 255) {
					local185 = 255;
				}
				if (local185 < 0) {
					local185 = 0;
				}
				local185 = Static267.anIntArray464[local185];
				@Pc(226) int local226;
				if (local147 == 0 && local153 == 0 && local185 == 0) {
					local226 = 0;
				} else {
					local226 = local109[local139] >> 4;
					if (local226 > 255) {
						local226 = 255;
					}
					if (local226 < 0) {
						local226 = 0;
					}
				}
				local12[local43++] = local185 + (local147 << 16) + (local226 << 24) + (local153 << 8);
				if (arg3) {
					local43 += arg2 - 1;
				}
			}
		}
		for (local67 = 0; local67 < this.aClass1_Sub2Array38.length; local67++) {
			this.aClass1_Sub2Array38[local67].method4580();
		}
		return local12;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(DLclient!pe;IIZLclient!ph;I)Lclient!q;")
	public Class1_Sub1_Sub3_Sub2_Sub1 method4219(@OriginalArg(0) double arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class138 arg3, @OriginalArg(6) int arg4) {
		Static7.method110(arg0);
		Static283.anInterface5_1 = arg1;
		Static61.aClass138_14 = arg3;
		Static68.method1140(arg4, arg2);
		@Pc(29) Class1_Sub1_Sub3_Sub2_Sub1 local29 = new Class1_Sub1_Sub3_Sub2_Sub1(arg4, arg2);
		@Pc(31) int local31;
		for (local31 = 0; local31 < this.aClass1_Sub2Array38.length; local31++) {
			this.aClass1_Sub2Array38[local31].method4579(arg4, arg2);
		}
		local31 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg2; local51++) {
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			@Pc(82) int[] local82;
			@Pc(90) int[] local90;
			if (this.aClass1_Sub2_3.aBoolean424) {
				local90 = this.aClass1_Sub2_3.method4577(local51);
				local82 = local90;
				local74 = local90;
				local78 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass1_Sub2_3.method4572(local51);
				local74 = local70[0];
				local78 = local70[1];
				local82 = local70[2];
			}
			if (this.aClass1_Sub2_2.aBoolean424) {
				local90 = this.aClass1_Sub2_2.method4577(local51);
			} else {
				local90 = this.aClass1_Sub2_2.method4572(local51)[0];
			}
			for (@Pc(120) int local120 = arg4 - 1; local120 >= 0; local120--) {
				@Pc(131) int local131 = local74[local120] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				@Pc(145) int local145 = local78[local120] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				local131 = Static267.anIntArray464[local131];
				local145 = Static267.anIntArray464[local145];
				@Pc(179) int local179 = local82[local120] >> 4;
				if (local179 > 255) {
					local179 = 255;
				}
				if (local179 < 0) {
					local179 = 0;
				}
				local179 = Static267.anIntArray464[local179];
				@Pc(210) int local210;
				if (local131 == 0 && local145 == 0 && local179 == 0) {
					local210 = 0;
				} else {
					local210 = local90[local120] >> 4;
					if (local210 > 255) {
						local210 = 255;
					}
					if (local210 < 0) {
						local210 = 0;
					}
				}
				local29.anIntArray344[local31++] = local179 + (local131 << 16) + (local210 << 24) + (local145 << 8);
			}
		}
		for (local51 = 0; local51 < this.aClass1_Sub2Array38.length; local51++) {
			this.aClass1_Sub2Array38[local51].method4580();
		}
		return local29;
	}
}
