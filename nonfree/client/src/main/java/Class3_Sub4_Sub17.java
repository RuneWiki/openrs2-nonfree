import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!n", name = "I", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!ck;")
	private Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!n", name = "M", descriptor = "Lclient!ck;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!ck;")
	private Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!n", name = "V", descriptor = "[Lclient!ck;")
	private Class3_Sub2[] aClass3_Sub2Array27;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class3_Sub4_Sub17(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method3915();
		this.aClass3_Sub2Array27 = new Class3_Sub2[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(20) int local20;
		@Pc(31) Class3_Sub2 local31;
		@Pc(49) int local49;
		@Pc(56) int local56;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = Static292.method4792(arg0);
			if (local31.method4960() >= 0) {
				local5++;
			}
			if (local31.method4957() >= 0) {
				local15++;
			}
			local49 = local31.aClass3_Sub2Array42.length;
			local18[local20] = new int[local49];
			for (local56 = 0; local56 < local49; local56++) {
				local18[local20][local56] = arg0.method3915();
			}
			this.aClass3_Sub2Array27[local20] = local31;
		}
		this.anIntArray403 = new int[local5];
		this.anIntArray404 = new int[local15];
		local15 = 0;
		local5 = 0;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = this.aClass3_Sub2Array27[local20];
			local49 = local31.aClass3_Sub2Array42.length;
			for (local56 = 0; local56 < local49; local56++) {
				local31.aClass3_Sub2Array42[local56] = this.aClass3_Sub2Array27[local18[local20][local56]];
			}
			local56 = local31.method4960();
			@Pc(136) int local136 = local31.method4957();
			if (local56 > 0) {
				this.anIntArray403[local5++] = local56;
			}
			if (local136 > 0) {
				this.anIntArray404[local15++] = local136;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array27[arg0.method3915()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array27[arg0.method3915()];
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array27[arg0.method3915()];
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZILclient!be;ILclient!rn;BD)Lclient!um;")
	public Class3_Sub4_Sub12_Sub2_Sub1 method2935(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class155 arg3, @OriginalArg(6) double arg4) {
		Static14.method224(arg4);
		Static135.anInterface2_1 = arg1;
		Static129.aClass155_55 = arg3;
		Static10.method156(arg0, arg2);
		@Pc(18) Class3_Sub4_Sub12_Sub2_Sub1 local18 = new Class3_Sub4_Sub12_Sub2_Sub1(arg2, arg0);
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.aClass3_Sub2Array27.length; local20++) {
			this.aClass3_Sub2Array27[local20].method4964(arg0, arg2);
		}
		local20 = 0;
		@Pc(48) int local48;
		for (local48 = 0; local48 < arg0; local48++) {
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(72) int[] local72;
			@Pc(68) int[] local68;
			if (this.aClass3_Sub2_3.aBoolean430) {
				local68 = this.aClass3_Sub2_3.method4961(local48);
				local70 = local68;
				local72 = local68;
				local74 = local68;
			} else {
				@Pc(82) int[][] local82 = this.aClass3_Sub2_3.method4955(local48);
				local70 = local82[0];
				local72 = local82[2];
				local74 = local82[1];
			}
			if (this.aClass3_Sub2_2.aBoolean430) {
				local68 = this.aClass3_Sub2_2.method4961(local48);
			} else {
				local68 = this.aClass3_Sub2_2.method4955(local48)[0];
			}
			for (@Pc(118) int local118 = arg2 - 1; local118 >= 0; local118--) {
				@Pc(129) int local129 = local70[local118] >> 4;
				@Pc(135) int local135 = local72[local118] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				@Pc(149) int local149 = local74[local118] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local129 > 255) {
					local129 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local149 = Static163.anIntArray352[local149];
				local135 = Static163.anIntArray352[local135];
				if (local129 < 0) {
					local129 = 0;
				}
				local129 = Static163.anIntArray352[local129];
				@Pc(213) int local213;
				if (local129 == 0 && local149 == 0 && local135 == 0) {
					local213 = 0;
				} else {
					local213 = local68[local118] >> 4;
					if (local213 > 255) {
						local213 = 255;
					}
					if (local213 < 0) {
						local213 = 0;
					}
				}
				local18.anIntArray596[local20++] = local135 + (local213 << 24) + (local129 << 16) + (local149 << 8);
			}
		}
		for (local48 = 0; local48 < this.aClass3_Sub2Array27.length; local48++) {
			this.aClass3_Sub2Array27[local48].method4962();
		}
		return local18;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!be;IIZILclient!rn;)[F")
	public float[] method2944(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class155 arg4) {
		Static135.anInterface2_1 = arg0;
		Static129.aClass155_55 = arg4;
		Static10.method156(arg1, arg3);
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.aClass3_Sub2Array27.length; local20++) {
			this.aClass3_Sub2Array27[local20].method4964(arg1, arg3);
		}
		local20 = 0;
		@Pc(45) float[] local45 = new float[arg1 * 4 * arg3];
		@Pc(47) int local47;
		for (local47 = 0; local47 < arg1; local47++) {
			if (arg2) {
				local20 = local47 << 2;
			}
			@Pc(82) int[] local82;
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			if (this.aClass3_Sub2_3.aBoolean430) {
				@Pc(90) int[] local90 = this.aClass3_Sub2_3.method4961(local47);
				local74 = local90;
				local78 = local90;
				local82 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass3_Sub2_3.method4955(local47);
				local74 = local70[1];
				local78 = local70[2];
				local82 = local70[0];
			}
			@Pc(108) int[] local108;
			if (this.aClass3_Sub2_2.aBoolean430) {
				local108 = this.aClass3_Sub2_2.method4961(local47);
			} else {
				local108 = this.aClass3_Sub2_2.method4955(local47)[0];
			}
			@Pc(128) int[] local128;
			if (this.aClass3_Sub2_1.aBoolean430) {
				local128 = this.aClass3_Sub2_1.method4961(local47);
			} else {
				local128 = this.aClass3_Sub2_1.method4955(local47)[0];
			}
			for (@Pc(140) int local140 = arg3 - 1; local140 >= 0; local140--) {
				@Pc(152) float local152 = (float) local108[local140] / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				@Pc(180) float local180 = ((float) local128[local140] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local45[local20++] = (float) local82[local140] * local180;
				local45[local20++] = local180 * (float) local74[local140];
				local45[local20++] = (float) local78[local140] * local180;
				local45[local20++] = local152;
				if (arg2) {
					local20 += (arg3 << 2) - 4;
				}
			}
		}
		for (local47 = 0; local47 < this.aClass3_Sub2Array27.length; local47++) {
			this.aClass3_Sub2Array27[local47].method4962();
		}
		return local45;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IDLclient!be;ILclient!rn;IZ)Lclient!qn;")
	public Class3_Sub4_Sub12_Sub2 method2945(@OriginalArg(1) double arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class155 arg3, @OriginalArg(5) int arg4) {
		Static14.method224(arg0);
		Static135.anInterface2_1 = arg1;
		Static129.aClass155_55 = arg3;
		Static10.method156(arg4, arg2);
		@Pc(22) Class3_Sub4_Sub12_Sub2 local22 = new Class3_Sub4_Sub12_Sub2(arg2, arg4);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass3_Sub2Array27.length; local24++) {
			this.aClass3_Sub2Array27[local24].method4964(arg4, arg2);
		}
		local24 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg4; local51++) {
			@Pc(72) int[] local72;
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			if (this.aClass3_Sub2_3.aBoolean430) {
				@Pc(88) int[] local88 = this.aClass3_Sub2_3.method4961(local51);
				local80 = local88;
				local72 = local88;
				local76 = local88;
			} else {
				@Pc(68) int[][] local68 = this.aClass3_Sub2_3.method4955(local51);
				local72 = local68[0];
				local76 = local68[2];
				local80 = local68[1];
			}
			for (@Pc(98) int local98 = arg2 - 1; local98 >= 0; local98--) {
				@Pc(106) int local106 = local72[local98] >> 4;
				@Pc(112) int local112 = local80[local98] >> 4;
				if (local112 > 255) {
					local112 = 255;
				}
				@Pc(123) int local123 = local76[local98] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				if (local112 < 0) {
					local112 = 0;
				}
				if (local106 < 0) {
					local106 = 0;
				}
				local106 = Static163.anIntArray352[local106];
				if (local123 < 0) {
					local123 = 0;
				}
				local123 = Static163.anIntArray352[local123];
				local112 = Static163.anIntArray352[local112];
				local22.anIntArray596[local24++] = local123 + (local106 << 16) + (local112 << 8);
			}
		}
		for (local51 = 0; local51 < this.aClass3_Sub2Array27.length; local51++) {
			this.aClass3_Sub2Array27[local51].method4962();
		}
		return local22;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!be;Lclient!rn;ZIDZI)[I")
	public int[] method2946(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static14.method224(arg4);
		@Pc(13) int[] local13 = new int[arg3 * arg6];
		Static129.aClass155_55 = arg1;
		Static135.anInterface2_1 = arg0;
		Static10.method156(arg3, arg6);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass3_Sub2Array27.length; local30++) {
			this.aClass3_Sub2Array27[local30].method4964(arg3, arg6);
		}
		@Pc(52) int local52 = 0;
		@Pc(56) int local56;
		@Pc(58) byte local58;
		if (arg2) {
			local56 = -1;
			local58 = -1;
			local30 = arg6 - 1;
		} else {
			local58 = 1;
			local30 = 0;
			local56 = arg6;
		}
		@Pc(72) int local72;
		for (local72 = 0; local72 < arg3; local72++) {
			if (arg5) {
				local52 = local72;
			}
			@Pc(97) int[] local97;
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			if (this.aClass3_Sub2_3.aBoolean430) {
				@Pc(93) int[] local93 = this.aClass3_Sub2_3.method4961(local72);
				local95 = local93;
				local97 = local93;
				local99 = local93;
			} else {
				@Pc(107) int[][] local107 = this.aClass3_Sub2_3.method4955(local72);
				local99 = local107[1];
				local97 = local107[0];
				local95 = local107[2];
			}
			for (@Pc(121) int local121 = local30; local121 != local56; local121 += local58) {
				@Pc(130) int local130 = local97[local121] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				@Pc(142) int local142 = local95[local121] >> 4;
				@Pc(148) int local148 = local99[local121] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				local148 = Static163.anIntArray352[local148];
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static163.anIntArray352[local142];
				if (local130 < 0) {
					local130 = 0;
				}
				local130 = Static163.anIntArray352[local130];
				local13[local52++] = (local130 << 16) + (local148 << 8) + local142;
				if (arg5) {
					local52 += arg6 - 1;
				}
			}
		}
		for (local72 = 0; local72 < this.aClass3_Sub2Array27.length; local72++) {
			this.aClass3_Sub2Array27[local72].method4962();
		}
		return local13;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!rn;DLclient!be;ZBI)[I")
	public int[] method2947(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		Static14.method224(arg2);
		Static135.anInterface2_1 = arg3;
		Static129.aClass155_55 = arg1;
		@Pc(25) int[] local25 = new int[arg5 * 4 * arg0];
		Static10.method156(arg0, arg5);
		@Pc(31) int local31;
		for (local31 = 0; local31 < this.aClass3_Sub2Array27.length; local31++) {
			this.aClass3_Sub2Array27[local31].method4964(arg0, arg5);
		}
		local31 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg0; local51++) {
			if (arg4) {
				local31 = local51;
			}
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			@Pc(84) int[] local84;
			@Pc(92) int[] local92;
			if (this.aClass3_Sub2_3.aBoolean430) {
				local92 = this.aClass3_Sub2_3.method4961(local51);
				local76 = local92;
				local84 = local92;
				local80 = local92;
			} else {
				@Pc(72) int[][] local72 = this.aClass3_Sub2_3.method4955(local51);
				local76 = local72[1];
				local80 = local72[0];
				local84 = local72[2];
			}
			if (this.aClass3_Sub2_2.aBoolean430) {
				local92 = this.aClass3_Sub2_2.method4961(local51);
			} else {
				local92 = this.aClass3_Sub2_2.method4955(local51)[0];
			}
			for (@Pc(122) int local122 = arg5 - 1; local122 >= 0; local122--) {
				@Pc(133) int local133 = local80[local122] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(151) int local151 = local76[local122] >> 4;
				local133 = Static163.anIntArray352[local133];
				@Pc(161) int local161 = local84[local122] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				if (local161 > 255) {
					local161 = 255;
				}
				if (local151 < 0) {
					local151 = 0;
				}
				if (local161 < 0) {
					local161 = 0;
				}
				local151 = Static163.anIntArray352[local151];
				local161 = Static163.anIntArray352[local161];
				@Pc(204) int local204;
				if (local133 == 0 && local151 == 0 && local161 == 0) {
					local204 = 0;
				} else {
					local204 = local92[local122] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local25[local31++] = local161 + (local204 << 24) + (local133 << 16) + (local151 << 8);
				if (arg4) {
					local31 += arg5 - 1;
				}
			}
		}
		for (local51 = 0; local51 < this.aClass3_Sub2Array27.length; local51++) {
			this.aClass3_Sub2Array27[local51].method4962();
		}
		return local25;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!be;ILclient!rn;)Z")
	public boolean method2948(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(12) int local12;
		if (Static129.anInt2461 <= 0) {
			for (local12 = 0; local12 < this.anIntArray403.length; local12++) {
				if (!arg1.method4133(this.anIntArray403[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray403.length; local12++) {
				if (!arg1.method4144(this.anIntArray403[local12], Static129.anInt2461)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray404.length; local12++) {
			if (!arg0.method2890(this.anIntArray404[local12])) {
				return false;
			}
		}
		return true;
	}
}
