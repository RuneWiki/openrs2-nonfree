import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class52_Sub1_Sub1 extends Class52_Sub1 {

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!fk;IIII[[I[[II)V")
	public Class52_Sub1_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ[I[I[ILclient!caa;[III)V")
	private void method1369(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) Class156 local12 = super.aClass156ArrayArray3[arg6][arg7];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(464) int local464;
		@Pc(547) int local547;
		@Pc(591) int local591;
		@Pc(656) int local656;
		@Pc(516) int local516;
		@Pc(579) int local579;
		@Pc(623) int local623;
		@Pc(688) int local688;
		@Pc(453) int local453;
		@Pc(505) int local505;
		@Pc(568) int local568;
		@Pc(644) int local644;
		@Pc(485) int local485;
		@Pc(536) int local536;
		@Pc(612) int local612;
		@Pc(677) int local677;
		@Pc(122) int local122;
		@Pc(148) int local148;
		@Pc(175) int local175;
		@Pc(206) int local206;
		@Pc(44) int local44;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(238) int local238;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(329) int local329;
		if (local12 == null) {
			@Pc(1641) Class210 local1641 = super.aClass210ArrayArray3[arg6][arg7];
			if (local1641 != null) {
				if (super.anInt8944 == -1) {
					for (local656 = 0; local656 < local1641.aShort90; local656++) {
						local31 = local1641.aShortArray128[local656] + (arg6 << super.anInt9494);
						local36 = local1641.aShortArray130[local656];
						local42 = local1641.aShortArray127[local656] + (arg7 << super.anInt9494);
						local591 = super.anInt8948 + (local31 * super.anInt8947 + super.anInt8946 * local36 + super.anInt8951 * local42 >> 14);
						if (super.aClass5_Sub2_18.anInt9075 >= local591) {
							return;
						}
						arg1[local656] = 0;
						if (arg0) {
							local516 = local591 - super.aClass5_Sub2_18.anInt9062;
							if (local516 > 255) {
								local516 = 255;
							}
							if (local516 > 0) {
								arg1[local656] = local516;
								local579 = local516 * local1641.aShortArray129[local656] / 255;
								if (local579 > 0) {
									local36 -= local579;
								}
							}
						} else if (super.aClass5_Sub2_18.aBoolean670) {
							local516 = local591 - super.aClass5_Sub2_18.anInt9062;
							if (local516 > 0) {
								arg1[local656] = local516;
								if (arg1[local656] > 255) {
									arg1[local656] = 255;
								}
							}
						}
						local547 = (super.anInt8949 * local42 + super.anInt8941 * local31 + local36 * super.anInt8952 >> 14) + super.anInt8940;
						local464 = super.anInt8945 + (local42 * super.anInt8942 + local36 * super.anInt8939 + super.anInt8950 * local31 >> 14);
						arg5[local656] = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local464 / local591;
						arg2[local656] = super.aClass5_Sub2_18.anInt9053 * local547 / local591 + arg4.anInt1113;
						arg3[local656] = local591;
					}
				} else {
					for (local656 = 0; local656 < local1641.aShort90; local656++) {
						local31 = local1641.aShortArray128[local656] + (arg6 << super.anInt9494);
						local36 = local1641.aShortArray130[local656];
						local42 = local1641.aShortArray127[local656] + (arg7 << super.anInt9494);
						arg1[local656] = 0;
						if (arg0) {
							local516 = super.anInt8944 - super.aClass5_Sub2_18.anInt9062;
							if (local516 > 255) {
								local516 = 255;
							}
							if (local516 > 0) {
								arg1[local656] = local516;
								local579 = local516 * local1641.aShortArray129[local656] / 255;
								if (local579 > 0) {
									local36 -= local579;
								}
							}
						} else if (super.aClass5_Sub2_18.aBoolean670) {
							local516 = super.anInt8944 - super.aClass5_Sub2_18.anInt9062;
							if (local516 > 0) {
								arg1[local656] = local516;
								if (arg1[local656] > 255) {
									arg1[local656] = 255;
								}
							}
						}
						local547 = (local31 * super.anInt8941 + super.anInt8952 * local36 + local42 * super.anInt8949 >> 14) + super.anInt8940;
						local464 = super.anInt8945 + (local31 * super.anInt8950 + super.anInt8939 * local36 + super.anInt8942 * local42 >> 14);
						arg5[local656] = local464 * super.aClass5_Sub2_18.anInt9056 / super.anInt8944 + arg4.anInt1111;
						arg2[local656] = local547 * super.aClass5_Sub2_18.anInt9053 / super.anInt8944 + arg4.anInt1113;
						arg3[local656] = super.anInt8944;
					}
				}
				if (local1641.aShortArray131 == null) {
					for (local656 = 0; local656 < local1641.aShort91; local656++) {
						local516 = local656 * 3;
						local579 = local516 + 1;
						local623 = local579 + 1;
						local688 = arg5[local516];
						local453 = arg5[local579];
						local505 = arg5[local623];
						local568 = arg2[local516];
						local644 = arg2[local579];
						local485 = arg2[local623];
						local536 = arg1[local623] + arg1[local579] + arg1[local516];
						if (-((local505 - local453) * (local568 + -local644)) + (local485 - local644) * (local688 + -local453) > 0) {
							arg4.aBoolean84 = local688 < 0 || local453 < 0 || local505 < 0 || arg4.anInt1114 < local688 || arg4.anInt1114 < local453 || local505 > arg4.anInt1114;
							if (local536 >= 765) {
								arg4.method1047(local568, local644, local485, local688, local453, local505, arg3[local516], arg3[local579], arg3[local623], super.aClass5_Sub2_18.anInt9059);
							} else if (local536 <= 0) {
								if ((local1641.anIntArray550[local516] & 0xFFFFFF) != 0) {
									arg4.method1050(local568, local644, local485, local688, local453, local505, arg3[local516], arg3[local579], arg3[local623], local1641.anIntArray550[local516], local1641.anIntArray550[local579], local1641.anIntArray550[local623]);
								}
							} else if ((local1641.anIntArray550[local516] & 0xFFFFFF) != 0) {
								arg4.method1050(local568, local644, local485, local688, local453, local505, arg3[local516], arg3[local579], arg3[local623], Static132.method2302(local1641.anIntArray550[local516], arg1[local516], super.aClass5_Sub2_18.anInt9059), Static132.method2302(local1641.anIntArray550[local579], arg1[local579], super.aClass5_Sub2_18.anInt9059), Static132.method2302(local1641.anIntArray550[local623], arg1[local623], super.aClass5_Sub2_18.anInt9059));
							}
						}
					}
				} else {
					local656 = super.anIntArrayArray84[arg6][arg7];
					local516 = super.anIntArrayArray84[arg6 + 1][arg7];
					local579 = super.anIntArrayArray84[arg6][arg7 + 1];
					local623 = arg6 * super.anInt9493;
					local688 = super.anInt9493 + local623;
					local453 = arg7 * super.anInt9493;
					local505 = local453 + super.anInt9493;
					local568 = super.anInt8945 + (super.anInt8942 * local453 + local623 * super.anInt8950 + super.anInt8939 * local656 >> 14);
					local644 = super.anInt8940 + (super.anInt8941 * local623 + super.anInt8952 * local656 + local453 * super.anInt8949 >> 14);
					local485 = super.anInt8948 + (local453 * super.anInt8951 + super.anInt8946 * local656 + super.anInt8947 * local623 >> 14);
					local536 = (super.anInt8942 * local453 + local516 * super.anInt8939 + super.anInt8950 * local688 >> 14) + super.anInt8945;
					local612 = super.anInt8940 + (super.anInt8952 * local516 + local688 * super.anInt8941 + super.anInt8949 * local453 >> 14);
					local677 = (super.anInt8951 * local453 + super.anInt8946 * local516 + local688 * super.anInt8947 >> 14) + super.anInt8948;
					local122 = super.anInt8945 + (super.anInt8939 * local579 + super.anInt8950 * local623 + super.anInt8942 * local505 >> 14);
					local148 = super.anInt8940 + (super.anInt8949 * local505 + local579 * super.anInt8952 + local623 * super.anInt8941 >> 14);
					local175 = super.anInt8948 + (super.anInt8951 * local505 + local623 * super.anInt8947 + local579 * super.anInt8946 >> 14);
					for (local206 = 0; local206 < local1641.aShort91; local206++) {
						local44 = local206 * 3;
						local46 = local44 + 1;
						local48 = local46 + 1;
						local50 = arg5[local44];
						local238 = arg5[local46];
						local67 = arg5[local48];
						local76 = arg2[local44];
						local87 = arg2[local46];
						local96 = arg2[local48];
						local329 = arg1[local48] + arg1[local44] + arg1[local46];
						if ((local96 - local87) * (local50 - local238) - (local76 - local87) * (-local238 + local67) > 0) {
							arg4.aBoolean84 = local50 < 0 || local238 < 0 || local67 < 0 || local50 > arg4.anInt1114 || arg4.anInt1114 < local238 || arg4.anInt1114 < local67;
							@Pc(2655) short local2655 = local1641.aShortArray131[local206];
							if (local329 < 765) {
								if (local2655 != -1 && this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local2655).aByte70)) {
									arg4.anInt1115 = 100;
								}
								if (local329 > 0) {
									if (local2655 != -1) {
										arg4.method1043(local76, local87, local96, local50, local238, local67, arg3[local44], arg3[local46], arg3[local48], super.aClass5_Sub2_18.anInt9059, arg1[local44], arg1[local46], arg1[local48], local1641.anIntArray550[local44], local1641.anIntArray550[local46], local1641.anIntArray550[local48], local568, local536, local122, local644, local612, local148, local485, local677, local175, local2655);
									} else if ((local1641.anIntArray550[local44] & 0xFFFFFF) != 0) {
										arg4.method1050(local76, local87, local96, local50, local238, local67, arg3[local44], arg3[local46], arg3[local48], Static499.method3120(local1641.anIntArray550[local44], super.aClass5_Sub2_18.anInt9059 | arg1[local44] << 24), Static499.method3120(local1641.anIntArray550[local46], super.aClass5_Sub2_18.anInt9059 | arg1[local46] << 24), Static499.method3120(local1641.anIntArray550[local48], super.aClass5_Sub2_18.anInt9059 | arg1[local48] << 24));
									}
								} else if (local2655 != -1) {
									arg4.method1051(local76, local87, local96, local50, local238, local67, local1641.anIntArray550[local44], local1641.anIntArray550[local46], local1641.anIntArray550[local48], local568, local536, local122, local644, local612, local148, local485, local677, local175, local2655);
								} else if ((local1641.anIntArray550[local44] & 0xFFFFFF) != 0) {
									arg4.method1050(local76, local87, local96, local50, local238, local67, arg3[local44], arg3[local46], arg3[local48], local1641.anIntArray550[local44], local1641.anIntArray550[local46], local1641.anIntArray550[local48]);
								}
								arg4.anInt1115 = 0;
							} else {
								arg4.method1047(local76, local87, local96, local50, local238, local67, arg3[local44], arg3[local46], arg3[local48], super.aClass5_Sub2_18.anInt9059);
							}
						}
					}
				}
			}
		} else if ((local12.aByte44 & 0x2) == 0) {
			@Pc(25) int local25 = arg6 * super.anInt9493;
			local31 = local25 + super.anInt9493;
			local36 = super.anInt9493 * arg7;
			local42 = local36 + super.anInt9493;
			local44 = 0;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			if ((local12.aByte44 & 0x1) == 0 || arg0) {
				local67 = super.anIntArrayArray84[arg6][arg7];
				local76 = super.anIntArrayArray84[arg6 + 1][arg7];
				local87 = super.anIntArrayArray84[arg6 + 1][arg7 + 1];
				local96 = super.anIntArrayArray84[arg6][arg7 + 1];
				if (super.anInt8944 == -1) {
					local122 = (local25 * super.anInt8947 + super.anInt8946 * local67 + local36 * super.anInt8951 >> 14) + super.anInt8948;
					if (local122 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local148 = (super.anInt8951 * local36 + super.anInt8946 * local76 + super.anInt8947 * local31 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local148) {
						return;
					}
					local175 = super.anInt8948 + (super.anInt8946 * local87 + local31 * super.anInt8947 + super.anInt8951 * local42 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local175) {
						return;
					}
					local206 = super.anInt8948 + (super.anInt8951 * local42 + local96 * super.anInt8946 + local25 * super.anInt8947 >> 14);
					if (local206 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
				} else {
					local206 = super.anInt8944;
					local175 = super.anInt8944;
					local148 = super.anInt8944;
					local122 = super.anInt8944;
				}
				if (arg0) {
					local238 = local122 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 255) {
						local238 = 255;
					}
					if (local238 > 0) {
						local44 = local238;
						local329 = local238 * local12.aShort78 / 255;
						if (local329 > 0) {
							local67 -= local329;
						}
					}
					local238 = local148 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 255) {
						local238 = 255;
					}
					if (local238 > 0) {
						local46 = local238;
						local329 = local238 * local12.aShort75 / 255;
						if (local329 > 0) {
							local76 -= local329;
						}
					}
					local238 = local175 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 255) {
						local238 = 255;
					}
					if (local238 > 0) {
						local48 = local238;
						local329 = local238 * local12.aShort79 / 255;
						if (local329 > 0) {
							local87 -= local329;
						}
					}
					local238 = local206 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 255) {
						local238 = 255;
					}
					if (local238 > 0) {
						local50 = local238;
						local329 = local238 * local12.aShort77 / 255;
						if (local329 > 0) {
							local96 -= local329;
						}
					}
				} else if (super.aClass5_Sub2_18.aBoolean670) {
					local238 = local122 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local44 = local238;
						if (local238 > 255) {
							local44 = 255;
						}
					}
					local238 = local148 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local46 = local238;
						if (local238 > 255) {
							local46 = 255;
						}
					}
					local238 = local175 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local48 = local238;
						if (local238 > 255) {
							local48 = 255;
						}
					}
					local238 = local206 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local50 = local238;
						if (local238 > 255) {
							local50 = 255;
						}
					}
				}
				local453 = super.anInt8945 + (local67 * super.anInt8939 + super.anInt8950 * local25 + super.anInt8942 * local36 >> 14);
				local464 = super.aClass5_Sub2_18.anInt9056 * local453 / local122 + arg4.anInt1111;
				local485 = (super.anInt8949 * local36 + local25 * super.anInt8941 + super.anInt8952 * local67 >> 14) + super.anInt8940;
				local505 = super.anInt8945 + (super.anInt8939 * local76 + local31 * super.anInt8950 + local36 * super.anInt8942 >> 14);
				local516 = local485 * super.aClass5_Sub2_18.anInt9053 / local122 + arg4.anInt1113;
				local536 = super.anInt8940 + (local36 * super.anInt8949 + super.anInt8952 * local76 + super.anInt8941 * local31 >> 14);
				local547 = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local505 / local148;
				local568 = (local31 * super.anInt8950 + local87 * super.anInt8939 + super.anInt8942 * local42 >> 14) + super.anInt8945;
				local579 = arg4.anInt1113 + local536 * super.aClass5_Sub2_18.anInt9053 / local148;
				local591 = arg4.anInt1111 + local568 * super.aClass5_Sub2_18.anInt9056 / local175;
				local612 = super.anInt8940 + (local31 * super.anInt8941 + super.anInt8952 * local87 + local42 * super.anInt8949 >> 14);
				local623 = arg4.anInt1113 + super.aClass5_Sub2_18.anInt9053 * local612 / local175;
				local644 = super.anInt8945 + (local96 * super.anInt8939 + local25 * super.anInt8950 + local42 * super.anInt8942 >> 14);
				local656 = arg4.anInt1111 + local644 * super.aClass5_Sub2_18.anInt9056 / local206;
				local677 = (super.anInt8949 * local42 + local25 * super.anInt8941 + super.anInt8952 * local96 >> 14) + super.anInt8940;
				local688 = local677 * super.aClass5_Sub2_18.anInt9053 / local206 + arg4.anInt1113;
			} else {
				local67 = super.anIntArrayArray84[arg6][arg7];
				if (super.anInt8944 == -1) {
					local76 = local67 * super.anInt8946;
					local122 = super.anInt8948 + (local76 + local25 * super.anInt8947 + local36 * super.anInt8951 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local122) {
						return;
					}
					local148 = (local76 + local31 * super.anInt8947 + local36 * super.anInt8951 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local148) {
						return;
					}
					local175 = super.anInt8948 + (super.anInt8951 * local42 + super.anInt8947 * local31 + local76 >> 14);
					if (local175 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local206 = super.anInt8948 + (local42 * super.anInt8951 + local76 + local25 * super.anInt8947 >> 14);
					if (local206 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
				} else {
					local206 = super.anInt8944;
					local175 = super.anInt8944;
					local148 = super.anInt8944;
					local122 = super.anInt8944;
				}
				if (super.aClass5_Sub2_18.aBoolean670) {
					local238 = local122 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local44 = local238;
						if (local238 > 255) {
							local44 = 255;
						}
					}
					local238 = local148 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local46 = local238;
						if (local238 > 255) {
							local46 = 255;
						}
					}
					local238 = local175 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local48 = local238;
						if (local238 > 255) {
							local48 = 255;
						}
					}
					local238 = local206 - super.aClass5_Sub2_18.anInt9062;
					if (local238 > 0) {
						local50 = local238;
						if (local238 > 255) {
							local50 = 255;
						}
					}
				}
				local76 = local67 * super.anInt8939;
				local453 = (local76 + super.anInt8950 * local25 + super.anInt8942 * local36 >> 14) + super.anInt8945;
				local87 = super.anInt8952 * local67;
				local464 = super.aClass5_Sub2_18.anInt9056 * local453 / local122 + arg4.anInt1111;
				local485 = super.anInt8940 + (local87 + super.anInt8941 * local25 + super.anInt8949 * local36 >> 14);
				local516 = local485 * super.aClass5_Sub2_18.anInt9053 / local122 + arg4.anInt1113;
				local505 = super.anInt8945 + (local31 * super.anInt8950 + local76 + super.anInt8942 * local36 >> 14);
				local547 = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local505 / local148;
				local536 = super.anInt8940 + (local31 * super.anInt8941 + local87 + super.anInt8949 * local36 >> 14);
				local568 = (super.anInt8942 * local42 + super.anInt8950 * local31 + local76 >> 14) + super.anInt8945;
				local579 = arg4.anInt1113 + local536 * super.aClass5_Sub2_18.anInt9053 / local148;
				local591 = arg4.anInt1111 + local568 * super.aClass5_Sub2_18.anInt9056 / local175;
				local612 = (super.anInt8941 * local31 + local87 + super.anInt8949 * local42 >> 14) + super.anInt8940;
				local644 = (local76 + local25 * super.anInt8950 + super.anInt8942 * local42 >> 14) + super.anInt8945;
				local623 = arg4.anInt1113 + local612 * super.aClass5_Sub2_18.anInt9053 / local175;
				local656 = local644 * super.aClass5_Sub2_18.anInt9056 / local206 + arg4.anInt1111;
				local677 = super.anInt8940 + (local25 * super.anInt8941 + local87 + super.anInt8949 * local42 >> 14);
				local688 = arg4.anInt1113 + local677 * super.aClass5_Sub2_18.anInt9053 / local206;
			}
			@Pc(1156) boolean local1156 = local12.aShort76 != -1 && this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local12.aShort76).aByte70);
			local76 = local50 + local46 + local48;
			if ((local591 - local656) * (-local688 + local579) - (local547 - local656) * (-local688 + local623) > 0) {
				arg4.aBoolean84 = local591 < 0 || local656 < 0 || local547 < 0 || local591 > arg4.anInt1114 || arg4.anInt1114 < local656 || arg4.anInt1114 < local547;
				if (local76 >= 765) {
					arg4.method1047(local623, local688, local579, local591, local656, local547, local175, local206, local148, super.aClass5_Sub2_18.anInt9059);
				} else {
					if (local1156) {
						arg4.anInt1115 = 100;
					}
					if (local76 <= 0) {
						if (local12.aShort76 >= 0) {
							arg4.method1051(local623, local688, local579, local591, local656, local547, local12.anInt4969, local12.anInt4971, local12.anInt4967, local568, local644, local505, local612, local677, local536, local175, local206, local148, local12.aShort76);
						} else {
							arg4.method1050(local623, local688, local579, local591, local656, local547, local175, local206, local148, local12.anInt4969, local12.anInt4971, local12.anInt4967);
						}
					} else if (local12.aShort76 >= 0) {
						arg4.method1043(local623, local688, local579, local591, local656, local547, local175, local206, local148, super.aClass5_Sub2_18.anInt9059, local48, local50, local46, local12.anInt4969, local12.anInt4971, local12.anInt4967, local568, local644, local505, local612, local677, local536, local175, local206, local148, local12.aShort76);
					} else {
						arg4.method1050(local623, local688, local579, local591, local656, local547, local175, local206, local148, Static499.method3120(local12.anInt4969, local48 << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local12.anInt4971, local50 << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local12.anInt4967, super.aClass5_Sub2_18.anInt9059 | local46 << 24));
					}
					arg4.anInt1115 = 0;
				}
			}
			local76 = local50 + local46 + local44;
			if (-((local656 - local547) * (local516 - local579)) + (local688 - local579) * (-local547 + local464) > 0) {
				arg4.aBoolean84 = local464 < 0 || local547 < 0 || local656 < 0 || arg4.anInt1114 < local464 || local547 > arg4.anInt1114 || arg4.anInt1114 < local656;
				if (local76 < 765) {
					if (local1156) {
						arg4.anInt1115 = 100;
					}
					if (local76 <= 0) {
						if (local12.aShort76 < 0) {
							arg4.method1050(local516, local579, local688, local464, local547, local656, local122, local148, local206, local12.anInt4970, local12.anInt4967, local12.anInt4971);
						} else {
							arg4.method1051(local516, local579, local688, local464, local547, local656, local12.anInt4970, local12.anInt4967, local12.anInt4971, local453, local505, local644, local485, local536, local677, local122, local148, local206, local12.aShort76);
						}
					} else if (local12.aShort76 < 0) {
						arg4.method1050(local516, local579, local688, local464, local547, local656, local122, local148, local206, Static499.method3120(local12.anInt4970, super.aClass5_Sub2_18.anInt9059 | local44 << 24), Static499.method3120(local12.anInt4967, local46 << 24 | super.aClass5_Sub2_18.anInt9059), Static499.method3120(local12.anInt4971, super.aClass5_Sub2_18.anInt9059 | local50 << 24));
					} else {
						arg4.method1043(local516, local579, local688, local464, local547, local656, local122, local148, local206, super.aClass5_Sub2_18.anInt9059, local44, local46, local50, local12.anInt4970, local12.anInt4967, local12.anInt4971, local453, local505, local644, local485, local536, local677, local122, local148, local206, local12.aShort76);
					}
					arg4.anInt1115 = 0;
					return;
				}
				arg4.method1047(local516, local579, local688, local464, local547, local656, local122, local148, local206, super.aClass5_Sub2_18.anInt9059);
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7826(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class99_Sub1 local9 = (Class99_Sub1) super.aClass5_Sub2_18.method7497(Thread.currentThread());
		@Pc(12) Class40 local12 = local9.lb;
		local12.anInt1115 = 0;
		local12.aBoolean84 = false;
		if (super.aClass156ArrayArray3 != null) {
			this.method1372(local12, local9.anIntArray485, arg0, arg2, arg3, arg1, arg4, local9.anIntArray489);
		} else if (super.aClass104ArrayArray3 != null) {
			this.method1375(arg2, local9.anIntArray485, arg1, arg0, local9.anIntArray489, arg4, local12, arg3);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZLclient!caa;[IIIII[[ZI[I)V")
	private void method1372(@OriginalArg(3) Class40 arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) boolean[][] arg6, @OriginalArg(11) int[] arg7) {
		@Pc(13) int local13 = (arg4 - arg5) * 1024 / 256;
		arg0.aBoolean82 = false;
		arg0.aBoolean86 = false;
		@Pc(25) int local25 = 0;
		@Pc(30) int local30 = local13;
		for (@Pc(32) int local32 = arg2; local32 < arg3; local32++) {
			for (@Pc(36) int local36 = arg5; local36 < arg4; local36++) {
				if (arg6[local32 - arg2][local36 - arg5]) {
					@Pc(72) int local72;
					if (super.aClass156ArrayArray3[local32][local36] != null) {
						@Pc(304) Class156 local304 = super.aClass156ArrayArray3[local32][local36];
						if (local304.aShort76 != -1 && (local304.aByte44 & 0x2) == 0 && local304.anInt4968 == 0) {
							local72 = super.aClass5_Sub2_18.method7491(local304.aShort76);
							arg0.method1041(local30 - 4, local30 + -4, local30, local25 + 4, local25, local25 + 4, 0, 0, 0, Static40.method947(local304.anInt4969, local72), Static40.method947(local304.anInt4971, local72), Static40.method947(local304.anInt4967, local72));
							arg0.method1041(local30, local30, local30 - 4, local25, local25 + 4, local25, 0, 0, 0, Static40.method947(local304.anInt4970, local72), Static40.method947(local304.anInt4967, local72), Static40.method947(local304.anInt4971, local72));
						} else if (local304.anInt4968 == 0) {
							arg0.method1050(local30 - 4, local30 + -4, local30, local25 + 4, local25, local25 + 4, 0, 0, 0, local304.anInt4969, local304.anInt4971, local304.anInt4967);
							arg0.method1050(local30, local30, local30 - 4, local25, local25 + 4, local25, 0, 0, 0, local304.anInt4970, local304.anInt4967, local304.anInt4971);
						} else {
							local72 = local304.anInt4968;
							arg0.method1050(local30 - 4, local30 + -4, local30, local25 + 4, local25, local25 + 4, 0, 0, 0, Static499.method3120(local72, local304.anInt4969 & 0xFF000000), Static499.method3120(local72, local304.anInt4971 & 0xFF000000), Static499.method3120(local72, local304.anInt4967 & 0xFF000000));
							arg0.method1050(local30, local30, local30 - 4, local25, local25 + 4, local25, 0, 0, 0, Static499.method3120(local72, local304.anInt4970 & 0xFF000000), Static499.method3120(local72, local304.anInt4967 & 0xFF000000), Static499.method3120(local72, local304.anInt4971 & 0xFF000000));
						}
					} else if (super.aClass210ArrayArray3[local32][local36] != null) {
						@Pc(70) Class210 local70 = super.aClass210ArrayArray3[local32][local36];
						for (local72 = 0; local72 < local70.aShort90; local72++) {
							arg7[local72] = local25 + local70.aShortArray128[local72] * 4 / super.anInt9493;
							arg1[local72] = local30 - local70.aShortArray127[local72] * 4 / super.anInt9493;
						}
						for (@Pc(115) int local115 = 0; local115 < local70.aShort91; local115++) {
							@Pc(121) int local121 = local115 * 3;
							@Pc(125) int local125 = local121 + 1;
							@Pc(129) int local129 = local125 + 1;
							@Pc(133) int local133 = arg7[local121];
							@Pc(137) int local137 = arg7[local125];
							@Pc(141) int local141 = arg7[local129];
							@Pc(145) int local145 = arg1[local121];
							@Pc(149) int local149 = arg1[local125];
							@Pc(153) int local153 = arg1[local129];
							@Pc(219) int local219;
							if (local70.anIntArray551 != null && local70.anIntArray551[local115] != 0 && (local70.aShortArray131 == null || local70.aShortArray131 != null && local70.aShortArray131[local115] == -1)) {
								local219 = local70.anIntArray551[local115];
								arg0.method1050(local145, local149, local153, local133, local137, local141, 0, 0, 0, Static499.method3120(local219, -(local70.anIntArray550[local121] & 0xFF000000) - 16777216), Static499.method3120(local219, -(local70.anIntArray550[local125] & -16777216) - 16777216), Static499.method3120(local219, -(local70.anIntArray550[local129] & -16777216) - 16777216));
							} else if (local70.aShortArray131 == null || local70.aShortArray131[local115] == -1) {
								arg0.method1050(local145, local149, local153, local133, local137, local141, 0, 0, 0, local70.anIntArray550[local121], local70.anIntArray550[local125], local70.anIntArray550[local129]);
							} else {
								local219 = super.aClass5_Sub2_18.method7491(local70.aShortArray131[local115]);
								arg0.method1041(local145, local149, local153, local133, local137, local141, 0, 0, 0, local219, local219, local219);
							}
						}
					}
				}
				local30 -= 4;
			}
			local25 += 4;
			local30 = local13;
		}
		arg0.aBoolean82 = true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II[I[I[ILclient!caa;[II)V")
	private void method1374(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class104 local12 = super.aClass104ArrayArray3[arg0][arg6];
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(271) int local271;
		@Pc(314) int local314;
		@Pc(379) int local379;
		@Pc(463) int local463;
		@Pc(303) int local303;
		@Pc(347) int local347;
		@Pc(431) int local431;
		@Pc(474) int local474;
		@Pc(237) int local237;
		@Pc(292) int local292;
		@Pc(368) int local368;
		@Pc(420) int local420;
		@Pc(259) int local259;
		@Pc(336) int local336;
		@Pc(400) int local400;
		@Pc(452) int local452;
		@Pc(105) int local105;
		@Pc(135) int local135;
		@Pc(166) int local166;
		@Pc(197) int local197;
		@Pc(81) int local81;
		if (local12 == null) {
			@Pc(1122) Class74 local1122 = super.aClass74ArrayArray3[arg0][arg6];
			if (local1122 != null) {
				@Pc(1148) short local1148;
				if (super.anInt8944 == -1) {
					for (local463 = 0; local463 < local1122.aShort37; local463++) {
						local30 = local1122.aShortArray61[local463] + (arg0 << super.anInt9494);
						local1148 = local1122.aShortArray55[local463];
						local40 = local1122.aShortArray59[local463] + (arg6 << super.anInt9494);
						local379 = (local1148 * super.anInt8946 + super.anInt8947 * local30 + local40 * super.anInt8951 >> 14) + super.anInt8948;
						if (local379 <= super.aClass5_Sub2_18.anInt9075) {
							return;
						}
						local314 = (super.anInt8949 * local40 + super.anInt8952 * local1148 + super.anInt8941 * local30 >> 14) + super.anInt8940;
						local271 = (super.anInt8939 * local1148 + super.anInt8950 * local30 + super.anInt8942 * local40 >> 14) + super.anInt8945;
						arg2[local463] = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local271 / local379;
						arg3[local463] = arg4.anInt1113 + local314 * super.aClass5_Sub2_18.anInt9053 / local379;
						arg1[local463] = local379;
					}
				} else {
					for (local463 = 0; local463 < local1122.aShort37; local463++) {
						local30 = local1122.aShortArray61[local463] + (arg0 << super.anInt9494);
						local1148 = local1122.aShortArray55[local463];
						local40 = local1122.aShortArray59[local463] + (arg6 << super.anInt9494);
						local314 = (local1148 * super.anInt8952 + local30 * super.anInt8941 + super.anInt8949 * local40 >> 14) + super.anInt8940;
						local271 = super.anInt8945 + (super.anInt8950 * local30 + local1148 * super.anInt8939 + super.anInt8942 * local40 >> 14);
						arg2[local463] = local271 * super.aClass5_Sub2_18.anInt9056 / super.anInt8944 + arg4.anInt1111;
						arg3[local463] = super.aClass5_Sub2_18.anInt9053 * local314 / super.anInt8944 + arg4.anInt1113;
						arg1[local463] = super.anInt8944;
					}
				}
				if (local1122.aShortArray56 == null) {
					for (local463 = 0; local463 < local1122.aShort38; local463++) {
						@Pc(1392) short local1392 = local1122.aShortArray57[local463];
						@Pc(1397) short local1397 = local1122.aShortArray62[local463];
						@Pc(1402) short local1402 = local1122.aShortArray60[local463];
						local474 = arg2[local1392];
						local237 = arg2[local1397];
						local292 = arg2[local1402];
						local368 = arg3[local1392];
						local420 = arg3[local1397];
						local259 = arg3[local1402];
						if ((local474 - local237) * (-local420 + local259) - (local292 - local237) * (-local420 + local368) > 0) {
							local336 = local1122.anIntArray252[local463];
							if (local336 != -1) {
								arg4.aBoolean84 = local474 < 0 || local237 < 0 || local292 < 0 || local474 > arg4.anInt1114 || arg4.anInt1114 < local237 || arg4.anInt1114 < local292;
								arg4.method1041(local368, local420, local259, local474, local237, local292, arg1[1], arg1[2], arg1[3], Static40.method947(local1122.aShortArray54[local1392], local336), Static40.method947(local1122.aShortArray54[local1397], local336), Static40.method947(local1122.aShortArray54[local1402], local336));
							}
						}
					}
				} else {
					local463 = super.anIntArrayArray84[arg0][arg6];
					local303 = super.anIntArrayArray84[arg0 + 1][arg6];
					local347 = super.anIntArrayArray84[arg0][arg6 + 1];
					local431 = super.anInt9493 * arg0;
					local474 = super.anInt9493 + local431;
					local237 = arg6 * super.anInt9493;
					local292 = super.anInt9493 + local237;
					local368 = super.anInt8945 + (super.anInt8950 * local431 + local463 * super.anInt8939 + local237 * super.anInt8942 >> 14);
					local420 = super.anInt8940 + (super.anInt8952 * local463 + local431 * super.anInt8941 + super.anInt8949 * local237 >> 14);
					local259 = super.anInt8948 + (super.anInt8951 * local237 + super.anInt8946 * local463 + super.anInt8947 * local431 >> 14);
					local336 = (local303 * super.anInt8939 + local474 * super.anInt8950 + local237 * super.anInt8942 >> 14) + super.anInt8945;
					local400 = super.anInt8940 + (local303 * super.anInt8952 + local474 * super.anInt8941 + super.anInt8949 * local237 >> 14);
					local452 = (super.anInt8947 * local474 + super.anInt8946 * local303 + super.anInt8951 * local237 >> 14) + super.anInt8948;
					local105 = (super.anInt8942 * local292 + super.anInt8939 * local347 + local431 * super.anInt8950 >> 14) + super.anInt8945;
					local135 = super.anInt8940 + (super.anInt8949 * local292 + local431 * super.anInt8941 + local347 * super.anInt8952 >> 14);
					local166 = (super.anInt8951 * local292 + super.anInt8947 * local431 + super.anInt8946 * local347 >> 14) + super.anInt8948;
					for (local197 = 0; local197 < local1122.aShort38; local197++) {
						@Pc(1769) short local1769 = local1122.aShortArray57[local197];
						@Pc(1774) short local1774 = local1122.aShortArray62[local197];
						@Pc(1779) short local1779 = local1122.aShortArray60[local197];
						local81 = arg2[local1769];
						@Pc(1787) int local1787 = arg2[local1774];
						@Pc(1791) int local1791 = arg2[local1779];
						@Pc(1795) int local1795 = arg3[local1769];
						@Pc(1799) int local1799 = arg3[local1774];
						@Pc(1803) int local1803 = arg3[local1779];
						if (-((local1795 - local1799) * (-local1787 + local1791)) + (local81 - local1787) * (local1803 - local1799) > 0) {
							arg4.aBoolean84 = local81 < 0 || local1787 < 0 || local1791 < 0 || arg4.anInt1114 < local81 || arg4.anInt1114 < local1787 || arg4.anInt1114 < local1791;
							@Pc(1866) short local1866 = local1122.aShortArray56[local197];
							if (local1866 == -1) {
								@Pc(1874) int local1874 = local1122.anIntArray252[local197];
								if (local1874 != -1) {
									arg4.method1041(local1795, local1799, local1803, local81, local1787, local1791, arg1[1], arg1[2], arg1[3], Static40.method947(local1122.aShortArray54[local1769], local1874), Static40.method947(local1122.aShortArray54[local1774], local1874), Static40.method947(local1122.aShortArray54[local1779], local1874));
								}
							} else {
								if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local1866).aByte70)) {
									arg4.anInt1115 = 100;
								}
								arg4.method1051(local1795, local1799, local1803, local81, local1787, local1791, local1122.aShortArray54[local1769], local1122.aShortArray54[local1774], local1122.aShortArray54[local1779], local368, local336, local105, local420, local400, local135, local259, local452, local166, local1866);
								arg4.anInt1115 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte34 & 0x2) == 0) {
			@Pc(25) int local25 = arg0 * super.anInt9493;
			local30 = local25 + super.anInt9493;
			@Pc(35) int local35 = super.anInt9493 * arg6;
			local40 = super.anInt9493 + local35;
			@Pc(52) int local52;
			@Pc(61) int local61;
			@Pc(72) int local72;
			if ((local12.aByte34 & 0x1) == 0) {
				local52 = super.anIntArrayArray84[arg0][arg6];
				local61 = super.anIntArrayArray84[arg0 + 1][arg6];
				local72 = super.anIntArrayArray84[arg0 + 1][arg6 + 1];
				local81 = super.anIntArrayArray84[arg0][arg6 + 1];
				if (super.anInt8944 == -1) {
					local105 = (local35 * super.anInt8951 + local52 * super.anInt8946 + super.anInt8947 * local25 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local105) {
						return;
					}
					local135 = (local61 * super.anInt8946 + local30 * super.anInt8947 + local35 * super.anInt8951 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local135) {
						return;
					}
					local166 = super.anInt8948 + (local72 * super.anInt8946 + local30 * super.anInt8947 + local40 * super.anInt8951 >> 14);
					if (local166 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local197 = (local81 * super.anInt8946 + local25 * super.anInt8947 + super.anInt8951 * local40 >> 14) + super.anInt8948;
					if (local197 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
				} else {
					local197 = super.anInt8944;
					local166 = super.anInt8944;
					local135 = super.anInt8944;
					local105 = super.anInt8944;
				}
				local237 = (super.anInt8950 * local25 + local52 * super.anInt8939 + local35 * super.anInt8942 >> 14) + super.anInt8945;
				local259 = (local25 * super.anInt8941 + super.anInt8952 * local52 + super.anInt8949 * local35 >> 14) + super.anInt8940;
				local271 = arg4.anInt1111 + local237 * super.aClass5_Sub2_18.anInt9056 / local105;
				local292 = (super.anInt8939 * local61 + super.anInt8950 * local30 + super.anInt8942 * local35 >> 14) + super.anInt8945;
				local303 = super.aClass5_Sub2_18.anInt9053 * local259 / local105 + arg4.anInt1113;
				local314 = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local292 / local135;
				local336 = super.anInt8940 + (local30 * super.anInt8941 + super.anInt8952 * local61 + super.anInt8949 * local35 >> 14);
				local347 = arg4.anInt1113 + super.aClass5_Sub2_18.anInt9053 * local336 / local135;
				local368 = super.anInt8945 + (super.anInt8942 * local40 + super.anInt8939 * local72 + super.anInt8950 * local30 >> 14);
				local379 = local368 * super.aClass5_Sub2_18.anInt9056 / local166 + arg4.anInt1111;
				local400 = super.anInt8940 + (local40 * super.anInt8949 + super.anInt8952 * local72 + super.anInt8941 * local30 >> 14);
				local420 = (local25 * super.anInt8950 + super.anInt8939 * local81 + local40 * super.anInt8942 >> 14) + super.anInt8945;
				local431 = super.aClass5_Sub2_18.anInt9053 * local400 / local166 + arg4.anInt1113;
				local452 = (local81 * super.anInt8952 + super.anInt8941 * local25 + local40 * super.anInt8949 >> 14) + super.anInt8940;
				local463 = local420 * super.aClass5_Sub2_18.anInt9056 / local197 + arg4.anInt1111;
				local474 = super.aClass5_Sub2_18.anInt9053 * local452 / local197 + arg4.anInt1113;
			} else {
				local52 = super.anIntArrayArray84[arg0][arg6];
				if (super.anInt8944 == -1) {
					local61 = local52 * super.anInt8946;
					local105 = (super.anInt8947 * local25 + local61 + super.anInt8951 * local35 >> 14) + super.anInt8948;
					if (super.aClass5_Sub2_18.anInt9075 >= local105) {
						return;
					}
					local135 = super.anInt8948 + (local61 + super.anInt8947 * local30 + local35 * super.anInt8951 >> 14);
					if (local135 <= super.aClass5_Sub2_18.anInt9075) {
						return;
					}
					local166 = super.anInt8948 + (super.anInt8951 * local40 + local61 + super.anInt8947 * local30 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local166) {
						return;
					}
					local197 = super.anInt8948 + (super.anInt8947 * local25 + local61 + super.anInt8951 * local40 >> 14);
					if (super.aClass5_Sub2_18.anInt9075 >= local197) {
						return;
					}
				} else {
					local197 = super.anInt8944;
					local166 = super.anInt8944;
					local135 = super.anInt8944;
					local105 = super.anInt8944;
				}
				local61 = local52 * super.anInt8939;
				local237 = super.anInt8945 + (local35 * super.anInt8942 + local25 * super.anInt8950 + local61 >> 14);
				local72 = local52 * super.anInt8952;
				local271 = local237 * super.aClass5_Sub2_18.anInt9056 / local105 + arg4.anInt1111;
				local259 = super.anInt8940 + (local72 + local25 * super.anInt8941 + super.anInt8949 * local35 >> 14);
				local292 = super.anInt8945 + (super.anInt8942 * local35 + local30 * super.anInt8950 + local61 >> 14);
				local303 = arg4.anInt1113 + local259 * super.aClass5_Sub2_18.anInt9053 / local105;
				local336 = super.anInt8940 + (local30 * super.anInt8941 + local72 + local35 * super.anInt8949 >> 14);
				local314 = arg4.anInt1111 + super.aClass5_Sub2_18.anInt9056 * local292 / local135;
				local347 = arg4.anInt1113 + local336 * super.aClass5_Sub2_18.anInt9053 / local135;
				local368 = (local40 * super.anInt8942 + local61 + local30 * super.anInt8950 >> 14) + super.anInt8945;
				local400 = (local72 + local30 * super.anInt8941 + local40 * super.anInt8949 >> 14) + super.anInt8940;
				local379 = local368 * super.aClass5_Sub2_18.anInt9056 / local166 + arg4.anInt1111;
				local420 = (local40 * super.anInt8942 + local61 + super.anInt8950 * local25 >> 14) + super.anInt8945;
				local431 = arg4.anInt1113 + super.aClass5_Sub2_18.anInt9053 * local400 / local166;
				local452 = super.anInt8940 + (local25 * super.anInt8941 + local72 + local40 * super.anInt8949 >> 14);
				local463 = local420 * super.aClass5_Sub2_18.anInt9056 / local197 + arg4.anInt1111;
				local474 = arg4.anInt1113 + local452 * super.aClass5_Sub2_18.anInt9053 / local197;
			}
			if (-((local314 - local463) * (local431 - local474)) + (local379 - local463) * (local347 - local474) > 0) {
				arg4.aBoolean84 = local379 < 0 || local463 < 0 || local314 < 0 || local379 > arg4.anInt1114 || arg4.anInt1114 < local463 || local314 > arg4.anInt1114;
				if (local12.aShort61 >= 0) {
					if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local12.aShort61).aByte70)) {
						arg4.anInt1115 = 100;
					}
					arg4.method1051(local431, local474, local347, local379, local463, local314, local12.aShort59 & 0xFFFF, local12.aShort60 & 0xFFFF, local12.aShort62 & 0xFFFF, local237, local292, local420, local259, local336, local452, local105, local135, local197, local12.aShort61);
					arg4.anInt1115 = 0;
				} else {
					arg4.method1041(local431, local474, local347, local379, local463, local314, local166, local197, local135, local12.aShort59 & 0xFFFF, local12.aShort60 & 0xFFFF, local12.aShort62 & 0xFFFF);
				}
			}
			if ((local474 - local347) * (-local314 + local271) - (local303 - local347) * (-local314 + local463) > 0) {
				arg4.aBoolean84 = local271 < 0 || local314 < 0 || local463 < 0 || local271 > arg4.anInt1114 || local314 > arg4.anInt1114 || local463 > arg4.anInt1114;
				if (local12.aShort61 >= 0) {
					if (this.method7344(super.aClass5_Sub2_18.anInterface4_14.method6712(local12.aShort61).aByte70)) {
						arg4.anInt1115 = 100;
					}
					arg4.method1051(local303, local347, local474, local271, local314, local463, local12.aShort63 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort60 & 0xFFFF, local237, local292, local420, local259, local336, local452, local105, local135, local197, local12.aShort61);
					arg4.anInt1115 = 0;
					return;
				}
				arg4.method1041(local303, local347, local474, local271, local314, local463, local105, local135, local197, local12.aShort63 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort60 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[IIII[II[[ZLclient!caa;III)V")
	private void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) boolean[][] arg5, @OriginalArg(8) Class40 arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg7 - arg2) * 1024 / 256;
		arg6.aBoolean82 = false;
		arg6.aBoolean86 = false;
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = local14;
		for (@Pc(37) int local37 = arg3; local37 < arg0; local37++) {
			for (@Pc(41) int local41 = arg2; local41 < arg7; local41++) {
				if (arg5[local37 - arg3][local41 - arg2]) {
					@Pc(91) int local91;
					if (super.aClass104ArrayArray3[local37][local41] != null) {
						@Pc(69) Class104 local69 = super.aClass104ArrayArray3[local37][local41];
						if (local69.aShort61 != -1 && (local69.aByte34 & 0x2) == 0 && local69.anInt3150 == -1) {
							local91 = super.aClass5_Sub2_18.method7491(local69.aShort61);
							arg6.method1041(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, 0, 0, 0, Static40.method947(local69.aShort59 & 0xFFFF, local91), Static40.method947(local69.aShort60 & 0xFFFF, local91), Static40.method947(local69.aShort62 & 0xFFFF, local91));
							arg6.method1041(local31, local31, local31 - 4, local26, local26 + 4, local26, 0, 0, 0, Static40.method947(local69.aShort63 & 0xFFFF, local91), Static40.method947(local69.aShort62 & 0xFFFF, local91), Static40.method947(local69.aShort60 & 0xFFFF, local91));
						} else if (local69.anInt3150 == -1) {
							arg6.method1041(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, 0, 0, 0, local69.aShort59 & 0xFFFF, local69.aShort60 & 0xFFFF, local69.aShort62 & 0xFFFF);
							arg6.method1041(local31, local31, local31 - 4, local26, local26 + 4, local26, 0, 0, 0, local69.aShort63 & 0xFFFF, local69.aShort62 & 0xFFFF, local69.aShort60 & 0xFFFF);
						} else {
							local91 = local69.anInt3150;
							arg6.method1041(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, 0, 0, 0, local91, local91, local91);
							arg6.method1041(local31, local31, local31 - 4, local26, local26 + 4, local26, 0, 0, 0, local91, local91, local91);
						}
					} else if (super.aClass74ArrayArray3[local37][local41] != null) {
						@Pc(302) Class74 local302 = super.aClass74ArrayArray3[local37][local41];
						for (local91 = 0; local91 < local302.aShort37; local91++) {
							arg4[local91] = local26 + local302.aShortArray61[local91] * 4 / super.anInt9493;
							arg1[local91] = local31 - local302.aShortArray59[local91] * 4 / super.anInt9493;
						}
						for (@Pc(343) int local343 = 0; local343 < local302.aShort38; local343++) {
							@Pc(350) short local350 = local302.aShortArray57[local343];
							@Pc(355) short local355 = local302.aShortArray62[local343];
							@Pc(360) short local360 = local302.aShortArray60[local343];
							@Pc(364) int local364 = arg4[local350];
							@Pc(368) int local368 = arg4[local355];
							@Pc(372) int local372 = arg4[local360];
							@Pc(376) int local376 = arg1[local350];
							@Pc(380) int local380 = arg1[local355];
							@Pc(384) int local384 = arg1[local360];
							@Pc(411) int local411;
							if (local302.anIntArray253 != null && local302.anIntArray253[local343] != -1) {
								local411 = local302.anIntArray253[local343];
								arg6.method1041(local376, local380, local384, local364, local368, local372, 0, 0, 0, Static40.method947(local302.aShortArray54[local350], local411), Static40.method947(local302.aShortArray54[local355], local411), Static40.method947(local302.aShortArray54[local360], local411));
							} else if (local302.aShortArray56 == null || local302.aShortArray56[local343] == -1) {
								local411 = local302.anIntArray252[local343];
								arg6.method1041(local376, local380, local384, local364, local368, local372, 0, 0, 0, Static40.method947(local302.aShortArray54[local350], local411), Static40.method947(local302.aShortArray54[local355], local411), Static40.method947(local302.aShortArray54[local360], local411));
							} else {
								local411 = super.aClass5_Sub2_18.method7491(local302.aShortArray56[local343]);
								arg6.method1041(local376, local380, local384, local364, local368, local372, 0, 0, 0, Static40.method947(local302.aShortArray54[local350], local411), Static40.method947(local302.aShortArray54[local355], local411), Static40.method947(local302.aShortArray54[local360], local411));
							}
						}
					}
				}
				local31 -= 4;
			}
			local31 = local14;
			local26 += 4;
		}
		arg6.aBoolean82 = true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class99_Sub1 local9 = (Class99_Sub1) super.aClass5_Sub2_18.method7497(Thread.currentThread());
		local9.lb.anInt1115 = 0;
		if (super.aClass156ArrayArray3 != null) {
			this.method1369(super.aClass5_Sub2_18.aBoolean669, local9.anIntArray506, local9.anIntArray485, local9.anIntArray503, local9.lb, local9.anIntArray489, arg0, arg1);
		} else if (super.aClass104ArrayArray3 != null) {
			this.method1374(arg0, local9.anIntArray503, local9.anIntArray489, local9.anIntArray485, local9.lb, local9.anIntArray506, arg1);
		}
	}
}
