import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class52_Sub1_Sub2 extends Class52_Sub1 {

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!fk;IIII[[I[[II)V")
	public Class52_Sub1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class99_Sub2 local9 = (Class99_Sub2) super.aClass5_Sub2_18.method7497(Thread.currentThread());
		local9.aClass255_2.anInt7795 = 0;
		if (super.aClass156ArrayArray3 != null) {
			this.method7350(super.aClass5_Sub2_18.aBoolean669, arg1, arg0, local9.aClass255_2, local9.anIntArray485, local9.anIntArray506, local9.anIntArray489);
		} else if (super.aClass104ArrayArray3 != null) {
			this.method7348(local9.aClass255_2, arg1, arg0, local9.anIntArray485, local9.anIntArray489, local9.anIntArray506);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII[[Z[IIILclient!rda;[I)V")
	private void method7346(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) boolean[][] arg2, @OriginalArg(7) int[] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) Class255 arg6, @OriginalArg(11) int[] arg7) {
		@Pc(14) int local14 = (arg0 - arg5) * 1024 / 256;
		arg6.aBoolean551 = false;
		arg6.aBoolean552 = false;
		@Pc(34) int local34 = 0;
		@Pc(38) int local38 = local14;
		for (@Pc(40) int local40 = arg4; local40 < arg1; local40++) {
			for (@Pc(44) int local44 = arg5; local44 < arg0; local44++) {
				if (arg2[local40 - arg4][local44 - arg5]) {
					@Pc(80) int local80;
					if (super.aClass156ArrayArray3[local40][local44] != null) {
						@Pc(303) Class156 local303 = super.aClass156ArrayArray3[local40][local44];
						if (local303.aShort76 != -1 && (local303.aByte44 & 0x2) == 0 && local303.anInt4968 == 0) {
							local80 = super.aClass5_Sub2_18.method7491(local303.aShort76);
							arg6.method6453(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, Static40.method947(local303.anInt4969, local80), Static40.method947(local303.anInt4971, local80), Static40.method947(local303.anInt4967, local80));
							arg6.method6453(local38, local38, local38 - 4, local34, local34 + 4, local34, Static40.method947(local303.anInt4970, local80), Static40.method947(local303.anInt4967, local80), Static40.method947(local303.anInt4971, local80));
						} else if (local303.anInt4968 == 0) {
							arg6.method6455(local38 - 4, local38 - 4, local38, local34 + 4, local34, local34 + 4, local303.anInt4969, local303.anInt4971, local303.anInt4967);
							arg6.method6455(local38, local38, local38 - 4, local34, local34 + 4, local34, local303.anInt4970, local303.anInt4967, local303.anInt4971);
						} else {
							local80 = local303.anInt4968;
							arg6.method6455(local38 - 4, local38 - 4, local38, local34 + 4, local34, local34 + 4, Static499.method3120(local80, local303.anInt4969 & 0xFF000000), Static499.method3120(local80, local303.anInt4971 & 0xFF000000), Static499.method3120(local80, local303.anInt4967 & 0xFF000000));
							arg6.method6455(local38, local38, local38 - 4, local34, local34 + 4, local34, Static499.method3120(local80, local303.anInt4970 & 0xFF000000), Static499.method3120(local80, local303.anInt4967 & 0xFF000000), Static499.method3120(local80, local303.anInt4971 & 0xFF000000));
						}
					} else if (super.aClass210ArrayArray3[local40][local44] != null) {
						@Pc(78) Class210 local78 = super.aClass210ArrayArray3[local40][local44];
						for (local80 = 0; local80 < local78.aShort90; local80++) {
							arg3[local80] = local34 + local78.aShortArray128[local80] * 4 / super.anInt9493;
							arg7[local80] = local38 - local78.aShortArray127[local80] * 4 / super.anInt9493;
						}
						for (@Pc(122) int local122 = 0; local122 < local78.aShort91; local122++) {
							@Pc(128) int local128 = local122 * 3;
							@Pc(132) int local132 = local128 + 1;
							@Pc(136) int local136 = local132 + 1;
							@Pc(140) int local140 = arg3[local128];
							@Pc(144) int local144 = arg3[local132];
							@Pc(148) int local148 = arg3[local136];
							@Pc(152) int local152 = arg7[local128];
							@Pc(156) int local156 = arg7[local132];
							@Pc(160) int local160 = arg7[local136];
							@Pc(223) int local223;
							if (local78.anIntArray551 != null && local78.anIntArray551[local122] != 0 && (local78.aShortArray131 == null || local78.aShortArray131 != null && local78.aShortArray131[local122] == -1)) {
								local223 = local78.anIntArray551[local122];
								arg6.method6455(local152, local156, local160, local140, local144, local148, Static499.method3120(local223, -(local78.anIntArray550[local128] & 0xFF000000) - 16777216), Static499.method3120(local223, -(local78.anIntArray550[local132] & 0xFF000000) - 16777216), Static499.method3120(local223, -(local78.anIntArray550[local136] & 0xFF000000) - 16777216));
							} else if (local78.aShortArray131 == null || local78.aShortArray131[local122] == -1) {
								arg6.method6455(local152, local156, local160, local140, local144, local148, local78.anIntArray550[local128], local78.anIntArray550[local132], local78.anIntArray550[local136]);
							} else {
								local223 = super.aClass5_Sub2_18.method7491(local78.aShortArray131[local122]);
								arg6.method6453(local152, local156, local160, local140, local144, local148, local223, local223, local223);
							}
						}
					}
				}
				local38 -= 4;
			}
			local34 += 4;
			local38 = local14;
		}
		arg6.aBoolean552 = true;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!rda;II[I[I[II)V")
	private void method7348(@OriginalArg(0) Class255 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(17) Class104 local17 = super.aClass104ArrayArray3[arg2][arg1];
		@Pc(35) int local35;
		@Pc(46) int local46;
		@Pc(281) int local281;
		@Pc(324) int local324;
		@Pc(408) int local408;
		@Pc(473) int local473;
		@Pc(292) int local292;
		@Pc(377) int local377;
		@Pc(441) int local441;
		@Pc(484) int local484;
		@Pc(249) int local249;
		@Pc(313) int local313;
		@Pc(365) int local365;
		@Pc(430) int local430;
		@Pc(269) int local269;
		@Pc(344) int local344;
		@Pc(397) int local397;
		@Pc(462) int local462;
		@Pc(100) int local100;
		@Pc(99) int local99;
		@Pc(97) int local97;
		@Pc(95) int local95;
		@Pc(87) int local87;
		if (local17 == null) {
			@Pc(1138) Class74 local1138 = super.aClass74ArrayArray3[arg2][arg1];
			if (local1138 != null) {
				@Pc(1165) short local1165;
				if (super.anInt8944 == -1) {
					for (local473 = 0; local473 < local1138.aShort37; local473++) {
						local35 = local1138.aShortArray61[local473] + (arg2 << super.anInt9494);
						local1165 = local1138.aShortArray55[local473];
						local46 = local1138.aShortArray59[local473] + (arg1 << super.anInt9494);
						local408 = super.anInt8948 + (super.anInt8951 * local46 + super.anInt8946 * local1165 + local35 * super.anInt8947 >> 14);
						if (local408 <= super.aClass5_Sub2_18.anInt9075) {
							return;
						}
						local281 = (super.anInt8942 * local46 + local35 * super.anInt8950 + local1165 * super.anInt8939 >> 14) + super.anInt8945;
						local324 = (local35 * super.anInt8941 + local1165 * super.anInt8952 + local46 * super.anInt8949 >> 14) + super.anInt8940;
						arg4[local473] = arg0.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local281 / local408;
						arg3[local473] = local324 * super.aClass5_Sub2_18.anInt9053 / local408 + arg0.anInt7794;
					}
				} else {
					for (local473 = 0; local473 < local1138.aShort37; local473++) {
						local35 = local1138.aShortArray61[local473] + (arg2 << super.anInt9494);
						local1165 = local1138.aShortArray55[local473];
						local46 = local1138.aShortArray59[local473] + (arg1 << super.anInt9494);
						local324 = super.anInt8940 + (super.anInt8952 * local1165 + super.anInt8941 * local35 + super.anInt8949 * local46 >> 14);
						local281 = super.anInt8945 + (super.anInt8942 * local46 + super.anInt8950 * local35 + local1165 * super.anInt8939 >> 14);
						arg4[local473] = arg0.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local281 / super.anInt8944;
						arg3[local473] = super.aClass5_Sub2_18.anInt9053 * local324 / super.anInt8944 + arg0.anInt7794;
					}
				}
				if (local1138.aShortArray56 == null) {
					for (local473 = 0; local473 < local1138.aShort38; local473++) {
						@Pc(1397) short local1397 = local1138.aShortArray57[local473];
						@Pc(1402) short local1402 = local1138.aShortArray62[local473];
						@Pc(1407) short local1407 = local1138.aShortArray60[local473];
						local484 = arg4[local1397];
						local249 = arg4[local1402];
						local313 = arg4[local1407];
						local365 = arg3[local1397];
						local430 = arg3[local1402];
						local269 = arg3[local1407];
						if (-((local313 - local249) * (-local430 + local365)) + (local484 - local249) * (-local430 + local269) > 0) {
							local344 = local1138.anIntArray252[local473];
							if (local344 != -1) {
								arg0.aBoolean554 = local484 < 0 || local249 < 0 || local313 < 0 || arg0.anInt7790 < local484 || local249 > arg0.anInt7790 || arg0.anInt7790 < local313;
								arg0.method6453(local365, local430, local269, local484, local249, local313, Static40.method947(local1138.aShortArray54[local1397], local344), Static40.method947(local1138.aShortArray54[local1402], local344), Static40.method947(local1138.aShortArray54[local1407], local344));
							}
						}
					}
				} else {
					local473 = super.anIntArrayArray84[arg2][arg1];
					local292 = super.anIntArrayArray84[arg2 + 1][arg1];
					local377 = super.anIntArrayArray84[arg2][arg1 + 1];
					local441 = super.anInt9493 * arg2;
					local484 = super.anInt9493 + local441;
					local249 = arg1 * super.anInt9493;
					local313 = local249 + super.anInt9493;
					local365 = super.anInt8945 + (super.anInt8942 * local249 + local473 * super.anInt8939 + super.anInt8950 * local441 >> 14);
					local430 = super.anInt8940 + (local249 * super.anInt8949 + local441 * super.anInt8941 + local473 * super.anInt8952 >> 14);
					local269 = (super.anInt8951 * local249 + super.anInt8947 * local441 + super.anInt8946 * local473 >> 14) + super.anInt8948;
					local344 = super.anInt8945 + (super.anInt8942 * local249 + super.anInt8950 * local484 + local292 * super.anInt8939 >> 14);
					local397 = super.anInt8940 + (local484 * super.anInt8941 + super.anInt8952 * local292 + super.anInt8949 * local249 >> 14);
					local462 = super.anInt8948 + (super.anInt8947 * local484 + local292 * super.anInt8946 + local249 * super.anInt8951 >> 14);
					local100 = super.anInt8945 + (local313 * super.anInt8942 + super.anInt8939 * local377 + local441 * super.anInt8950 >> 14);
					local99 = super.anInt8940 + (super.anInt8949 * local313 + local441 * super.anInt8941 + local377 * super.anInt8952 >> 14);
					local97 = (local377 * super.anInt8946 + super.anInt8947 * local441 + local313 * super.anInt8951 >> 14) + super.anInt8948;
					for (local95 = 0; local95 < local1138.aShort38; local95++) {
						@Pc(1780) short local1780 = local1138.aShortArray57[local95];
						@Pc(1785) short local1785 = local1138.aShortArray62[local95];
						@Pc(1790) short local1790 = local1138.aShortArray60[local95];
						local87 = arg4[local1780];
						@Pc(1798) int local1798 = arg4[local1785];
						@Pc(1802) int local1802 = arg4[local1790];
						@Pc(1806) int local1806 = arg3[local1780];
						@Pc(1810) int local1810 = arg3[local1785];
						@Pc(1814) int local1814 = arg3[local1790];
						if (-((local1802 - local1798) * (local1806 + -local1810)) + (local87 - local1798) * (-local1810 + local1814) > 0) {
							arg0.aBoolean554 = local87 < 0 || local1798 < 0 || local1802 < 0 || arg0.anInt7790 < local87 || arg0.anInt7790 < local1798 || arg0.anInt7790 < local1802;
							@Pc(1877) short local1877 = local1138.aShortArray56[local95];
							if (local1877 == -1) {
								@Pc(1933) int local1933 = local1138.anIntArray252[local95];
								if (local1933 != -1) {
									arg0.method6453(local1806, local1810, local1814, local87, local1798, local1802, Static40.method947(local1138.aShortArray54[local1780], local1933), Static40.method947(local1138.aShortArray54[local1785], local1933), Static40.method947(local1138.aShortArray54[local1790], local1933));
								}
							} else {
								if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local1877).aByte70)) {
									arg0.anInt7795 = 100;
								}
								arg0.method6449(local1806, local1810, local1814, local87, local1798, local1802, local1138.aShortArray54[local1780], local1138.aShortArray54[local1785], local1138.aShortArray54[local1790], local365, local344, local100, local430, local397, local99, local269, local462, local97, local1877);
								arg0.anInt7795 = 0;
							}
						}
					}
				}
			}
		} else if ((local17.aByte34 & 0x2) == 0) {
			@Pc(30) int local30 = super.anInt9493 * arg2;
			local35 = local30 + super.anInt9493;
			@Pc(40) int local40 = arg1 * super.anInt9493;
			local46 = local40 + super.anInt9493;
			@Pc(58) int local58;
			@Pc(67) int local67;
			@Pc(78) int local78;
			if ((local17.aByte34 & 0x1) == 0) {
				local58 = super.anIntArrayArray84[arg2][arg1];
				local67 = super.anIntArrayArray84[arg2 + 1][arg1];
				local78 = super.anIntArrayArray84[arg2 + 1][arg1 + 1];
				local87 = super.anIntArrayArray84[arg2][arg1 + 1];
				if (super.anInt8944 == -1) {
					local100 = super.anInt8948 + (local30 * super.anInt8947 + super.anInt8946 * local58 + local40 * super.anInt8951 >> 14);
					if (local100 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local99 = super.anInt8948 + (local35 * super.anInt8947 + local67 * super.anInt8946 + super.anInt8951 * local40 >> 14);
					if (local99 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local97 = super.anInt8948 + (super.anInt8947 * local35 + local78 * super.anInt8946 + local46 * super.anInt8951 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local97) {
						return;
					}
					local95 = super.anInt8948 + (super.anInt8947 * local30 + local87 * super.anInt8946 + super.anInt8951 * local46 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local95) {
						return;
					}
				} else {
					local95 = super.anInt8944;
					local97 = super.anInt8944;
					local99 = super.anInt8944;
					local100 = super.anInt8944;
				}
				local249 = (super.anInt8942 * local40 + super.anInt8950 * local30 + local58 * super.anInt8939 >> 14) + super.anInt8945;
				local269 = (local58 * super.anInt8952 + super.anInt8941 * local30 + super.anInt8949 * local40 >> 14) + super.anInt8940;
				local281 = arg0.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local249 / local100;
				local292 = super.aClass5_Sub2_18.anInt9053 * local269 / local100 + arg0.anInt7794;
				local313 = (super.anInt8939 * local67 + local35 * super.anInt8950 + super.anInt8942 * local40 >> 14) + super.anInt8945;
				local324 = local313 * super.aClass5_Sub2_18.anInt9056 / local99 + arg0.anInt7793;
				local344 = super.anInt8940 + (local40 * super.anInt8949 + local67 * super.anInt8952 + super.anInt8941 * local35 >> 14);
				local365 = super.anInt8945 + (super.anInt8942 * local46 + super.anInt8950 * local35 + super.anInt8939 * local78 >> 14);
				local377 = arg0.anInt7794 + local344 * super.aClass5_Sub2_18.anInt9053 / local99;
				local397 = (super.anInt8949 * local46 + local78 * super.anInt8952 + local35 * super.anInt8941 >> 14) + super.anInt8940;
				local408 = super.aClass5_Sub2_18.anInt9056 * local365 / local97 + arg0.anInt7793;
				local430 = (super.anInt8950 * local30 + local87 * super.anInt8939 + super.anInt8942 * local46 >> 14) + super.anInt8945;
				local441 = arg0.anInt7794 + local397 * super.aClass5_Sub2_18.anInt9053 / local97;
				local462 = super.anInt8940 + (local46 * super.anInt8949 + super.anInt8941 * local30 + local87 * super.anInt8952 >> 14);
				local473 = local430 * super.aClass5_Sub2_18.anInt9056 / local95 + arg0.anInt7793;
				local484 = arg0.anInt7794 + super.aClass5_Sub2_18.anInt9053 * local462 / local95;
			} else {
				local58 = super.anIntArrayArray84[arg2][arg1];
				if (super.anInt8944 == -1) {
					local67 = local58 * super.anInt8946;
					local100 = super.anInt8948 + (local67 + super.anInt8947 * local30 + local40 * super.anInt8951 >> 14);
					if (local100 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local99 = (super.anInt8951 * local40 + local67 + local35 * super.anInt8947 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local99) {
						return;
					}
					local97 = super.anInt8948 + (local46 * super.anInt8951 + super.anInt8947 * local35 + local67 >> 14);
					if (local97 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local95 = super.anInt8948 + (super.anInt8951 * local46 + super.anInt8947 * local30 + local67 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local95) {
						return;
					}
				} else {
					local95 = super.anInt8944;
					local97 = super.anInt8944;
					local99 = super.anInt8944;
					local100 = super.anInt8944;
				}
				local67 = super.anInt8939 * local58;
				local249 = super.anInt8945 + (super.anInt8950 * local30 + local67 + local40 * super.anInt8942 >> 14);
				local78 = local58 * super.anInt8952;
				local281 = super.aClass5_Sub2_18.anInt9056 * local249 / local100 + arg0.anInt7793;
				local269 = super.anInt8940 + (local78 + local30 * super.anInt8941 + super.anInt8949 * local40 >> 14);
				local313 = (local67 + super.anInt8950 * local35 + super.anInt8942 * local40 >> 14) + super.anInt8945;
				local292 = super.aClass5_Sub2_18.anInt9053 * local269 / local100 + arg0.anInt7794;
				local324 = arg0.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local313 / local99;
				local344 = super.anInt8940 + (super.anInt8949 * local40 + local35 * super.anInt8941 + local78 >> 14);
				local365 = (super.anInt8950 * local35 + local67 + super.anInt8942 * local46 >> 14) + super.anInt8945;
				local377 = super.aClass5_Sub2_18.anInt9053 * local344 / local99 + arg0.anInt7794;
				local397 = (local78 + super.anInt8941 * local35 + super.anInt8949 * local46 >> 14) + super.anInt8940;
				local408 = super.aClass5_Sub2_18.anInt9056 * local365 / local97 + arg0.anInt7793;
				local430 = (local67 + super.anInt8950 * local30 + local46 * super.anInt8942 >> 14) + super.anInt8945;
				local441 = super.aClass5_Sub2_18.anInt9053 * local397 / local97 + arg0.anInt7794;
				local473 = arg0.anInt7793 + local430 * super.aClass5_Sub2_18.anInt9056 / local95;
				local462 = (super.anInt8949 * local46 + local78 + local30 * super.anInt8941 >> 14) + super.anInt8940;
				local484 = arg0.anInt7794 + local462 * super.aClass5_Sub2_18.anInt9053 / local95;
			}
			if (-((local324 - local473) * (local441 + -local484)) + (local408 - local473) * (local377 - local484) > 0) {
				arg0.aBoolean554 = local408 < 0 || local473 < 0 || local324 < 0 || arg0.anInt7790 < local408 || arg0.anInt7790 < local473 || local324 > arg0.anInt7790;
				if (local17.aShort61 < 0) {
					arg0.method6453(local441, local484, local377, local408, local473, local324, local17.aShort59 & 0xFFFF, local17.aShort60 & 0xFFFF, local17.aShort62 & 0xFFFF);
				} else {
					if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local17.aShort61).aByte70)) {
						arg0.anInt7795 = 100;
					}
					arg0.method6449(local441, local484, local377, local408, local473, local324, local17.aShort59 & 0xFFFF, local17.aShort60 & 0xFFFF, local17.aShort62 & 0xFFFF, local249, local313, local430, local269, local344, local462, local100, local99, local95, local17.aShort61);
					arg0.anInt7795 = 0;
				}
			}
			if (-((local473 - local324) * (-local377 + local292)) + (local484 - local377) * (local281 + -local324) > 0) {
				arg0.aBoolean554 = local281 < 0 || local324 < 0 || local473 < 0 || arg0.anInt7790 < local281 || arg0.anInt7790 < local324 || arg0.anInt7790 < local473;
				if (local17.aShort61 >= 0) {
					if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local17.aShort61).aByte70)) {
						arg0.anInt7795 = 100;
					}
					arg0.method6449(local292, local377, local484, local281, local324, local473, local17.aShort63 & 0xFFFF, local17.aShort62 & 0xFFFF, local17.aShort60 & 0xFFFF, local249, local313, local430, local269, local344, local462, local100, local99, local95, local17.aShort61);
					arg0.anInt7795 = 0;
					return;
				}
				arg0.method6453(local292, local377, local484, local281, local324, local473, local17.aShort63 & 0xFFFF, local17.aShort62 & 0xFFFF, local17.aShort60 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!rda;[IIIIIII[[Z[III)V")
	private void method7349(@OriginalArg(0) Class255 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) boolean[][] arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int arg7) {
		@Pc(14) int local14 = (arg2 - arg3) * 1024 / 256;
		arg0.aBoolean552 = false;
		arg0.aBoolean551 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg7; local32 < arg4; local32++) {
			for (@Pc(38) int local38 = arg3; local38 < arg2; local38++) {
				if (arg5[local32 - arg7][local38 - arg3]) {
					@Pc(75) int local75;
					if (super.aClass104ArrayArray3[local32][local38] != null) {
						@Pc(301) Class104 local301 = super.aClass104ArrayArray3[local32][local38];
						if (local301.aShort61 != -1 && (local301.aByte34 & 0x2) == 0 && local301.anInt3150 == -1) {
							local75 = super.aClass5_Sub2_18.method7491(local301.aShort61);
							arg0.method6453(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static40.method947(local301.aShort59 & 0xFFFF, local75), Static40.method947(local301.aShort60 & 0xFFFF, local75), Static40.method947(local301.aShort62 & 0xFFFF, local75));
							arg0.method6453(local30, local30, local30 - 4, local26, local26 + 4, local26, Static40.method947(local301.aShort63 & 0xFFFF, local75), Static40.method947(local301.aShort62 & 0xFFFF, local75), Static40.method947(local301.aShort60 & 0xFFFF, local75));
						} else if (local301.anInt3150 == -1) {
							arg0.method6453(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local301.aShort59 & 0xFFFF, local301.aShort60 & 0xFFFF, local301.aShort62 & 0xFFFF);
							arg0.method6453(local30, local30, local30 - 4, local26, local26 + 4, local26, local301.aShort63 & 0xFFFF, local301.aShort62 & 0xFFFF, local301.aShort60 & 0xFFFF);
						} else {
							local75 = local301.anInt3150;
							arg0.method6453(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local75, local75, local75);
							arg0.method6453(local30, local30, local30 - 4, local26, local26 + 4, local26, local75, local75, local75);
						}
					} else if (super.aClass74ArrayArray3[local32][local38] != null) {
						@Pc(73) Class74 local73 = super.aClass74ArrayArray3[local32][local38];
						for (local75 = 0; local75 < local73.aShort37; local75++) {
							arg1[local75] = local26 + local73.aShortArray61[local75] * 4 / super.anInt9493;
							arg6[local75] = local30 - local73.aShortArray59[local75] * 4 / super.anInt9493;
						}
						for (@Pc(113) int local113 = 0; local113 < local73.aShort38; local113++) {
							@Pc(120) short local120 = local73.aShortArray57[local113];
							@Pc(125) short local125 = local73.aShortArray62[local113];
							@Pc(130) short local130 = local73.aShortArray60[local113];
							@Pc(134) int local134 = arg1[local120];
							@Pc(138) int local138 = arg1[local125];
							@Pc(142) int local142 = arg1[local130];
							@Pc(146) int local146 = arg6[local120];
							@Pc(150) int local150 = arg6[local125];
							@Pc(154) int local154 = arg6[local130];
							@Pc(179) int local179;
							if (local73.anIntArray253 != null && local73.anIntArray253[local113] != -1) {
								local179 = local73.anIntArray253[local113];
								arg0.method6453(local146, local150, local154, local134, local138, local142, Static40.method947(local73.aShortArray54[local120], local179), Static40.method947(local73.aShortArray54[local125], local179), Static40.method947(local73.aShortArray54[local130], local179));
							} else if (local73.aShortArray56 == null || local73.aShortArray56[local113] == -1) {
								local179 = local73.anIntArray252[local113];
								arg0.method6453(local146, local150, local154, local134, local138, local142, Static40.method947(local73.aShortArray54[local120], local179), Static40.method947(local73.aShortArray54[local125], local179), Static40.method947(local73.aShortArray54[local130], local179));
							} else {
								local179 = super.aClass5_Sub2_18.method7491(local73.aShortArray56[local113]);
								arg0.method6453(local146, local150, local154, local134, local138, local142, Static40.method947(local73.aShortArray54[local120], local179), Static40.method947(local73.aShortArray54[local125], local179), Static40.method947(local73.aShortArray54[local130], local179));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg0.aBoolean552 = true;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7826(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class99_Sub2 local9 = (Class99_Sub2) super.aClass5_Sub2_18.method7497(Thread.currentThread());
		@Pc(12) Class255 local12 = local9.aClass255_2;
		local12.anInt7795 = 0;
		local12.aBoolean554 = false;
		if (super.aClass156ArrayArray3 != null) {
			this.method7346(arg3, arg2, arg4, local9.anIntArray489, arg0, arg1, local12, local9.anIntArray485);
		} else if (super.aClass104ArrayArray3 != null) {
			this.method7349(local12, local9.anIntArray489, arg3, arg1, arg2, arg4, local9.anIntArray485, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIIILclient!rda;[I[I[I)V")
	private void method7350(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class255 arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class156 local12 = super.aClass156ArrayArray3[arg2][arg1];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(310) int local310;
		@Pc(387) int local387;
		@Pc(445) int local445;
		@Pc(502) int local502;
		@Pc(340) int local340;
		@Pc(417) int local417;
		@Pc(474) int local474;
		@Pc(513) int local513;
		@Pc(294) int local294;
		@Pc(357) int local357;
		@Pc(406) int local406;
		@Pc(463) int local463;
		@Pc(329) int local329;
		@Pc(376) int local376;
		@Pc(434) int local434;
		@Pc(491) int local491;
		@Pc(79) int local79;
		@Pc(78) int local78;
		@Pc(76) int local76;
		@Pc(74) int local74;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(203) int local203;
		@Pc(66) int local66;
		@Pc(86) int local86;
		@Pc(299) int local299;
		@Pc(551) int local551;
		@Pc(707) int local707;
		if (local12 == null) {
			@Pc(1616) Class210 local1616 = super.aClass210ArrayArray3[arg2][arg1];
			if (local1616 != null) {
				if (super.anInt8944 == -1) {
					for (local502 = 0; local502 < local1616.aShort90; local502++) {
						local31 = local1616.aShortArray128[local502] + (arg2 << super.anInt9494);
						local36 = local1616.aShortArray130[local502];
						local41 = local1616.aShortArray127[local502] + (arg1 << super.anInt9494);
						local445 = super.anInt8948 + (local41 * super.anInt8951 + local36 * super.anInt8946 + super.anInt8947 * local31 >> 14);
						if (super.aClass5_Sub2_18.anInt9075 >= local445) {
							return;
						}
						arg5[local502] = 0;
						if (arg0) {
							local340 = local445 - super.aClass5_Sub2_18.anInt9062;
							if (local340 > 255) {
								local340 = 255;
							}
							if (local340 > 0) {
								arg5[local502] = local340;
								local417 = local340 * local1616.aShortArray129[local502] / 255;
								if (local417 > 0) {
									local36 -= local417;
								}
							}
						} else if (super.aClass5_Sub2_18.aBoolean670) {
							local340 = local445 - super.aClass5_Sub2_18.anInt9062;
							if (local340 > 0) {
								arg5[local502] = local340;
								if (arg5[local502] > 255) {
									arg5[local502] = 255;
								}
							}
						}
						local387 = (super.anInt8949 * local41 + local36 * super.anInt8952 + super.anInt8941 * local31 >> 14) + super.anInt8940;
						local310 = (local31 * super.anInt8950 + super.anInt8939 * local36 + local41 * super.anInt8942 >> 14) + super.anInt8945;
						arg6[local502] = local310 * super.aClass5_Sub2_18.anInt9056 / local445 + arg3.anInt7793;
						arg4[local502] = local387 * super.aClass5_Sub2_18.anInt9053 / local445 + arg3.anInt7794;
					}
				} else {
					for (local502 = 0; local502 < local1616.aShort90; local502++) {
						local31 = local1616.aShortArray128[local502] + (arg2 << super.anInt9494);
						local36 = local1616.aShortArray130[local502];
						local41 = local1616.aShortArray127[local502] + (arg1 << super.anInt9494);
						arg5[local502] = 0;
						if (arg0) {
							local340 = super.anInt8944 - super.aClass5_Sub2_18.anInt9062;
							if (local340 > 255) {
								local340 = 255;
							}
							if (local340 > 0) {
								arg5[local502] = local340;
								local417 = local340 * local1616.aShortArray129[local502] / 255;
								if (local417 > 0) {
									local36 -= local417;
								}
							}
						} else if (super.aClass5_Sub2_18.aBoolean670) {
							local340 = -super.aClass5_Sub2_18.anInt9062 + super.anInt8944;
							if (local340 > 0) {
								arg5[local502] = local340;
								if (arg5[local502] > 255) {
									arg5[local502] = 255;
								}
							}
						}
						local387 = (local31 * super.anInt8941 + super.anInt8952 * local36 + local41 * super.anInt8949 >> 14) + super.anInt8940;
						local310 = (super.anInt8942 * local41 + local31 * super.anInt8950 + local36 * super.anInt8939 >> 14) + super.anInt8945;
						arg6[local502] = local310 * super.aClass5_Sub2_18.anInt9056 / super.anInt8944 + arg3.anInt7793;
						arg4[local502] = arg3.anInt7794 + local387 * super.aClass5_Sub2_18.anInt9053 / super.anInt8944;
					}
				}
				if (local1616.aShortArray131 == null) {
					for (local502 = 0; local502 < local1616.aShort91; local502++) {
						local340 = local502 * 3;
						local417 = local340 + 1;
						local474 = local417 + 1;
						local513 = arg6[local340];
						local294 = arg6[local417];
						local357 = arg6[local474];
						local406 = arg4[local340];
						local463 = arg4[local417];
						local329 = arg4[local474];
						local376 = arg5[local340] + arg5[local417] + arg5[local474];
						if ((local513 - local294) * (-local463 + local329) - (local357 - local294) * (local406 + -local463) > 0) {
							arg3.aBoolean554 = local513 < 0 || local294 < 0 || local357 < 0 || arg3.anInt7790 < local513 || local294 > arg3.anInt7790 || local357 > arg3.anInt7790;
							if (local376 >= 765) {
								arg3.method6446(local406, local463, local329, local513, local294, local357, super.aClass5_Sub2_18.anInt9059);
							} else if (local376 <= 0) {
								if ((local1616.anIntArray550[local340] & 0xFFFFFF) != 0) {
									arg3.method6455(local406, local463, local329, local513, local294, local357, local1616.anIntArray550[local340], local1616.anIntArray550[local417], local1616.anIntArray550[local474]);
								}
							} else if ((local1616.anIntArray550[local340] & 0xFFFFFF) != 0) {
								arg3.method6455(local406, local463, local329, local513, local294, local357, Static132.method2302(local1616.anIntArray550[local340], arg5[local340], super.aClass5_Sub2_18.anInt9059), Static132.method2302(local1616.anIntArray550[local417], arg5[local417], super.aClass5_Sub2_18.anInt9059), Static132.method2302(local1616.anIntArray550[local474], arg5[local474], super.aClass5_Sub2_18.anInt9059));
							}
						}
					}
				} else {
					local502 = super.anIntArrayArray84[arg2][arg1];
					local340 = super.anIntArrayArray84[arg2 + 1][arg1];
					local417 = super.anIntArrayArray84[arg2][arg1 + 1];
					local474 = arg2 * super.anInt9493;
					local513 = local474 + super.anInt9493;
					local294 = super.anInt9493 * arg1;
					local357 = local294 + super.anInt9493;
					local406 = (super.anInt8950 * local474 + local502 * super.anInt8939 + local294 * super.anInt8942 >> 14) + super.anInt8945;
					local463 = (super.anInt8949 * local294 + super.anInt8952 * local502 + super.anInt8941 * local474 >> 14) + super.anInt8940;
					local329 = super.anInt8948 + (local502 * super.anInt8946 + local474 * super.anInt8947 + local294 * super.anInt8951 >> 14);
					local376 = (local340 * super.anInt8939 + super.anInt8950 * local513 + super.anInt8942 * local294 >> 14) + super.anInt8945;
					local434 = (super.anInt8941 * local513 + local340 * super.anInt8952 + super.anInt8949 * local294 >> 14) + super.anInt8940;
					local491 = (local294 * super.anInt8951 + local513 * super.anInt8947 + local340 * super.anInt8946 >> 14) + super.anInt8948;
					local79 = (local357 * super.anInt8942 + local417 * super.anInt8939 + super.anInt8950 * local474 >> 14) + super.anInt8945;
					local78 = (super.anInt8949 * local357 + super.anInt8952 * local417 + local474 * super.anInt8941 >> 14) + super.anInt8940;
					local76 = (super.anInt8946 * local417 + local474 * super.anInt8947 + local357 * super.anInt8951 >> 14) + super.anInt8948;
					for (local74 = 0; local74 < local1616.aShort91; local74++) {
						local43 = local74 * 3;
						local45 = local43 + 1;
						local47 = local45 + 1;
						local49 = arg6[local43];
						local203 = arg6[local45];
						local66 = arg6[local47];
						local86 = arg4[local43];
						local299 = arg4[local45];
						local551 = arg4[local47];
						local707 = arg5[local45] + arg5[local43] + arg5[local47];
						if (-((local66 - local203) * (local86 - local299)) + (local49 - local203) * (-local299 + local551) > 0) {
							arg3.aBoolean554 = local49 < 0 || local203 < 0 || local66 < 0 || local49 > arg3.anInt7790 || arg3.anInt7790 < local203 || arg3.anInt7790 < local66;
							@Pc(2571) short local2571 = local1616.aShortArray131[local74];
							if (local707 < 765) {
								if (local2571 != -1 && this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local2571).aByte70)) {
									arg3.anInt7795 = 100;
								}
								if (local707 > 0) {
									if (local2571 != -1) {
										arg3.method6443(local86, local299, local551, local49, local203, local66, super.aClass5_Sub2_18.anInt9059, arg5[local43], arg5[local45], arg5[local47], local1616.anIntArray550[local43], local1616.anIntArray550[local45], local1616.anIntArray550[local47], local406, local376, local79, local463, local434, local78, local329, local491, local76, local2571);
									} else if ((local1616.anIntArray550[local43] & 0xFFFFFF) != 0) {
										arg3.method6455(local86, local299, local551, local49, local203, local66, Static499.method3120(local1616.anIntArray550[local43], arg5[local43] << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local1616.anIntArray550[local45], super.aClass5_Sub2_18.anInt9059 | arg5[local45] << 24), Static499.method3120(local1616.anIntArray550[local47], arg5[local47] << 24 | super.aClass5_Sub2_18.anInt9059));
									}
								} else if (local2571 != -1) {
									arg3.method6449(local86, local299, local551, local49, local203, local66, local1616.anIntArray550[local43], local1616.anIntArray550[local45], local1616.anIntArray550[local47], local406, local376, local79, local463, local434, local78, local329, local491, local76, local2571);
								} else if ((local1616.anIntArray550[local43] & 0xFFFFFF) != 0) {
									arg3.method6455(local86, local299, local551, local49, local203, local66, local1616.anIntArray550[local43], local1616.anIntArray550[local45], local1616.anIntArray550[local47]);
								}
								arg3.anInt7795 = 0;
							} else {
								arg3.method6446(local86, local299, local551, local49, local203, local66, super.aClass5_Sub2_18.anInt9059);
							}
						}
					}
				}
			}
		} else if ((local12.aByte44 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt9493 * arg2;
			local31 = local25 + super.anInt9493;
			local36 = arg1 * super.anInt9493;
			local41 = local36 + super.anInt9493;
			local43 = 0;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			if ((local12.aByte44 & 0x1) == 0 || arg0) {
				local66 = super.anIntArrayArray84[arg2][arg1];
				local86 = super.anIntArrayArray84[arg2 + 1][arg1];
				local299 = super.anIntArrayArray84[arg2 + 1][arg1 + 1];
				local551 = super.anIntArrayArray84[arg2][arg1 + 1];
				if (super.anInt8944 == -1) {
					local79 = (local25 * super.anInt8947 + local66 * super.anInt8946 + local36 * super.anInt8951 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local79) {
						return;
					}
					local78 = super.anInt8948 + (local36 * super.anInt8951 + super.anInt8946 * local86 + super.anInt8947 * local31 >> 14);
					if (local78 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local76 = super.anInt8948 + (local41 * super.anInt8951 + super.anInt8946 * local299 + local31 * super.anInt8947 >> 14);
					if (local76 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local74 = (local551 * super.anInt8946 + local25 * super.anInt8947 + local41 * super.anInt8951 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local74) {
						return;
					}
				} else {
					local74 = super.anInt8944;
					local76 = super.anInt8944;
					local78 = super.anInt8944;
					local79 = super.anInt8944;
				}
				if (arg0) {
					local203 = local79 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 > 0) {
						local43 = local203;
						local707 = local203 * local12.aShort78 / 255;
						if (local707 > 0) {
							local66 -= local707;
						}
					}
					local203 = local78 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 > 0) {
						local45 = local203;
						local707 = local203 * local12.aShort75 / 255;
						if (local707 > 0) {
							local86 -= local707;
						}
					}
					local203 = local76 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 > 0) {
						local47 = local203;
						local707 = local12.aShort79 * local203 / 255;
						if (local707 > 0) {
							local299 -= local707;
						}
					}
					local203 = local74 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 > 0) {
						local49 = local203;
						local707 = local203 * local12.aShort77 / 255;
						if (local707 > 0) {
							local551 -= local707;
						}
					}
				} else if (super.aClass5_Sub2_18.aBoolean670) {
					local203 = local79 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local43 = local203;
						if (local203 > 255) {
							local43 = 255;
						}
					}
					local203 = local78 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local45 = local203;
						if (local203 > 255) {
							local45 = 255;
						}
					}
					local203 = local76 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local47 = local203;
						if (local203 > 255) {
							local47 = 255;
						}
					}
					local203 = local74 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local49 = local203;
						if (local203 > 255) {
							local49 = 255;
						}
					}
				}
				local294 = super.anInt8945 + (super.anInt8942 * local36 + super.anInt8939 * local66 + super.anInt8950 * local25 >> 14);
				local310 = arg3.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local294 / local79;
				local329 = (local36 * super.anInt8949 + local25 * super.anInt8941 + local66 * super.anInt8952 >> 14) + super.anInt8940;
				local340 = arg3.anInt7794 + local329 * super.aClass5_Sub2_18.anInt9053 / local79;
				local357 = (super.anInt8950 * local31 + local86 * super.anInt8939 + local36 * super.anInt8942 >> 14) + super.anInt8945;
				local387 = super.aClass5_Sub2_18.anInt9056 * local357 / local78 + arg3.anInt7793;
				local376 = (super.anInt8941 * local31 + local86 * super.anInt8952 + super.anInt8949 * local36 >> 14) + super.anInt8940;
				local406 = (super.anInt8939 * local299 + local31 * super.anInt8950 + super.anInt8942 * local41 >> 14) + super.anInt8945;
				local417 = arg3.anInt7794 + super.aClass5_Sub2_18.anInt9053 * local376 / local78;
				local434 = super.anInt8940 + (local41 * super.anInt8949 + local299 * super.anInt8952 + super.anInt8941 * local31 >> 14);
				local445 = super.aClass5_Sub2_18.anInt9056 * local406 / local76 + arg3.anInt7793;
				local474 = local434 * super.aClass5_Sub2_18.anInt9053 / local76 + arg3.anInt7794;
				local463 = super.anInt8945 + (super.anInt8939 * local551 + local25 * super.anInt8950 + super.anInt8942 * local41 >> 14);
				local491 = (super.anInt8949 * local41 + local25 * super.anInt8941 + super.anInt8952 * local551 >> 14) + super.anInt8940;
				local502 = local463 * super.aClass5_Sub2_18.anInt9056 / local74 + arg3.anInt7793;
				local513 = arg3.anInt7794 + super.aClass5_Sub2_18.anInt9053 * local491 / local74;
			} else {
				local66 = super.anIntArrayArray84[arg2][arg1];
				if (super.anInt8944 == -1) {
					local86 = super.anInt8946 * local66;
					local79 = (super.anInt8951 * local36 + local25 * super.anInt8947 + local86 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local79) {
						return;
					}
					local78 = super.anInt8948 + (local86 + super.anInt8947 * local31 + super.anInt8951 * local36 >> 14);
					if (local78 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local76 = super.anInt8948 + (local41 * super.anInt8951 + local31 * super.anInt8947 + local86 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local76) {
						return;
					}
					local74 = super.anInt8948 + (local86 + local25 * super.anInt8947 + super.anInt8951 * local41 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local74) {
						return;
					}
				} else {
					local74 = super.anInt8944;
					local76 = super.anInt8944;
					local78 = super.anInt8944;
					local79 = super.anInt8944;
				}
				if (super.aClass5_Sub2_18.aBoolean670) {
					local203 = local79 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local43 = local203;
						if (local203 > 255) {
							local43 = 255;
						}
					}
					local203 = local78 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local45 = local203;
						if (local203 > 255) {
							local45 = 255;
						}
					}
					local203 = local76 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local47 = local203;
						if (local203 > 255) {
							local47 = 255;
						}
					}
					local203 = local74 - super.aClass5_Sub2_18.anInt9062;
					if (local203 > 0) {
						local49 = local203;
						if (local203 > 255) {
							local49 = 255;
						}
					}
				}
				local86 = super.anInt8939 * local66;
				local294 = super.anInt8945 + (super.anInt8950 * local25 + local86 + local36 * super.anInt8942 >> 14);
				local299 = local66 * super.anInt8952;
				local310 = super.aClass5_Sub2_18.anInt9056 * local294 / local79 + arg3.anInt7793;
				local329 = super.anInt8940 + (local299 + local25 * super.anInt8941 + local36 * super.anInt8949 >> 14);
				local340 = local329 * super.aClass5_Sub2_18.anInt9053 / local79 + arg3.anInt7794;
				local357 = (local86 + local31 * super.anInt8950 + super.anInt8942 * local36 >> 14) + super.anInt8945;
				local376 = super.anInt8940 + (local31 * super.anInt8941 + local299 + local36 * super.anInt8949 >> 14);
				local387 = arg3.anInt7793 + super.aClass5_Sub2_18.anInt9056 * local357 / local78;
				local406 = super.anInt8945 + (super.anInt8942 * local41 + super.anInt8950 * local31 + local86 >> 14);
				local417 = local376 * super.aClass5_Sub2_18.anInt9053 / local78 + arg3.anInt7794;
				local434 = super.anInt8940 + (local41 * super.anInt8949 + local31 * super.anInt8941 + local299 >> 14);
				local445 = arg3.anInt7793 + local406 * super.aClass5_Sub2_18.anInt9056 / local76;
				local463 = super.anInt8945 + (local41 * super.anInt8942 + local25 * super.anInt8950 + local86 >> 14);
				local474 = arg3.anInt7794 + super.aClass5_Sub2_18.anInt9053 * local434 / local76;
				local491 = super.anInt8940 + (super.anInt8949 * local41 + local25 * super.anInt8941 + local299 >> 14);
				local502 = arg3.anInt7793 + local463 * super.aClass5_Sub2_18.anInt9056 / local74;
				local513 = super.aClass5_Sub2_18.anInt9053 * local491 / local74 + arg3.anInt7794;
			}
			@Pc(1155) boolean local1155 = local12.aShort76 != -1 && this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local12.aShort76).aByte70);
			local86 = local47 + local45 + local49;
			if ((local445 - local502) * (-local513 + local417) - (local474 - local513) * (-local502 + local387) > 0) {
				arg3.aBoolean554 = local445 < 0 || local502 < 0 || local387 < 0 || local445 > arg3.anInt7790 || local502 > arg3.anInt7790 || local387 > arg3.anInt7790;
				if (local86 >= 765) {
					arg3.method6446(local474, local513, local417, local445, local502, local387, super.aClass5_Sub2_18.anInt9059);
				} else {
					if (local1155) {
						arg3.anInt7795 = 100;
					}
					if (local86 > 0) {
						if (local12.aShort76 < 0) {
							arg3.method6455(local474, local513, local417, local445, local502, local387, Static499.method3120(local12.anInt4969, super.aClass5_Sub2_18.anInt9059 | local47 << 24), Static499.method3120(local12.anInt4971, local49 << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local12.anInt4967, local45 << 24 | super.aClass5_Sub2_18.anInt9059));
						} else {
							arg3.method6443(local474, local513, local417, local445, local502, local387, super.aClass5_Sub2_18.anInt9059, local47, local49, local45, local12.anInt4969, local12.anInt4971, local12.anInt4967, local406, local463, local357, local434, local491, local376, local76, local74, local78, local12.aShort76);
						}
					} else if (local12.aShort76 >= 0) {
						arg3.method6449(local474, local513, local417, local445, local502, local387, local12.anInt4969, local12.anInt4971, local12.anInt4967, local406, local463, local357, local434, local491, local376, local76, local74, local78, local12.aShort76);
					} else {
						arg3.method6455(local474, local513, local417, local445, local502, local387, local12.anInt4969, local12.anInt4971, local12.anInt4967);
					}
					arg3.anInt7795 = 0;
				}
			}
			local86 = local49 + local43 + local45;
			if ((local310 - local387) * (-local417 + local513) - (local340 - local417) * (local502 - local387) > 0) {
				arg3.aBoolean554 = local310 < 0 || local387 < 0 || local502 < 0 || local310 > arg3.anInt7790 || arg3.anInt7790 < local387 || local502 > arg3.anInt7790;
				if (local86 >= 765) {
					arg3.method6446(local340, local417, local513, local310, local387, local502, super.aClass5_Sub2_18.anInt9059);
					return;
				}
				if (local1155) {
					arg3.anInt7795 = 100;
				}
				if (local86 <= 0) {
					if (local12.aShort76 >= 0) {
						arg3.method6449(local340, local417, local513, local310, local387, local502, local12.anInt4970, local12.anInt4967, local12.anInt4971, local294, local357, local463, local329, local376, local491, local79, local78, local74, local12.aShort76);
					} else {
						arg3.method6455(local340, local417, local513, local310, local387, local502, local12.anInt4970, local12.anInt4967, local12.anInt4971);
					}
				} else if (local12.aShort76 >= 0) {
					arg3.method6443(local340, local417, local513, local310, local387, local502, super.aClass5_Sub2_18.anInt9059, local43, local45, local49, local12.anInt4970, local12.anInt4967, local12.anInt4971, local294, local357, local463, local329, local376, local491, local79, local78, local74, local12.aShort76);
				} else {
					arg3.method6455(local340, local417, local513, local310, local387, local502, Static499.method3120(local12.anInt4970, super.aClass5_Sub2_18.anInt9059 | local43 << 24), Static499.method3120(local12.anInt4967, local45 << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local12.anInt4971, local49 << 24 | super.aClass5_Sub2_18.anInt9059));
				}
				arg3.anInt7795 = 0;
			}
		}
	}
}
