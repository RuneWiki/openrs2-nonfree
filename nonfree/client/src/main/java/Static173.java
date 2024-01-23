import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Lclient!jl;")
	public static Class89 aClass89_24 = new Class89(64);

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int anInt3886 = 0;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Lclient!jl;")
	public static Class89 aClass89_25 = new Class89(64);

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	public static int anInt3891 = 0;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString247 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[Lclient!ic;IZBII[BIII)[I")
	public static int[] method2815(@OriginalArg(0) int arg0, @OriginalArg(1) Class75[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(29) int local29;
		@Pc(47) int local47;
		if (!arg3) {
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (local29 = 0; local29 < 8; local29++) {
					local47 = arg5 + Static216.method3455(local22 & 0x7, local29 & 0x7, arg9);
					@Pc(60) int local60 = arg8 + Static35.method744(arg9, local29 & 0x7, local22 & 0x7);
					if (local47 > 0 && local47 < 103 && local60 > 0 && local60 < 103) {
						arg1[arg2].anIntArrayArray30[local47][local60] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(105) Class1_Sub14 local105 = new Class1_Sub14(arg6);
		local29 = (arg7 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115;
		if (arg3) {
			local115 = 1;
		} else {
			local115 = 4;
		}
		local47 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (arg9 == 1) {
			local127 = 1;
		} else if (arg9 == 2) {
			local127 = 1;
			local129 = 1;
		} else if (arg9 == 3) {
			local129 = 1;
		}
		@Pc(165) int local165;
		@Pc(242) int local242;
		@Pc(233) int local233;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(389) int local389;
		@Pc(395) int local395;
		for (@Pc(155) int local155 = 0; local155 < local115; local155++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (local165 = 0; local165 < 64; local165++) {
					if (arg0 != local155 || local17 > local160 || local160 > local17 + 8 || local11 > local165 || local165 > local11 + 8) {
						Static295.method4530(0, 0, arg3, -1, -1, 0, 0, local105, false, 0, 0);
					} else if (local160 == local17 + 8 || local165 == local11 + 8) {
						if (arg9 == 0) {
							local242 = arg5 + local160 - local17;
							local233 = local165 + arg8 - local11;
						} else if (arg9 == 1) {
							local233 = arg8 + local17 + 8 - local160;
							local242 = arg5 + local165 - local11;
						} else if (arg9 == 2) {
							local233 = local11 + arg8 + 8 - local165;
							local242 = arg5 + local17 + 8 - local160;
						} else {
							local242 = local11 + arg5 + 8 - local165;
							local233 = local160 + arg8 - local17;
						}
						Static295.method4530(arg2, 0, arg3, local233, local242, local165 + local47, local160 + local29, local105, true, 0, 0);
					} else {
						local242 = Static216.method3455(local160 & 0x7, local165 & 0x7, arg9) + arg5;
						local233 = arg8 + Static35.method744(arg9, local165 & 0x7, local160 & 0x7);
						Static295.method4530(arg2, local127, arg3, local233, local242, local165 + local47, local160 + local29, local105, false, arg9, local129);
						if (local160 == 63 || local165 == 63) {
							local371 = local160 == 63 ? 64 : local160;
							local380 = local165 == 63 ? 64 : local165;
							if (arg9 == 0) {
								local389 = local371 + arg5 - local17;
								local395 = local380 + arg8 - local11;
							} else if (arg9 == 1) {
								local395 = local17 + arg8 + 8 - local371;
								local389 = arg5 + local380 - local11;
							} else if (arg9 == 2) {
								local395 = arg8 + local11 + 8 - local380;
								local389 = local17 + arg5 + 8 - local371;
							} else {
								local395 = arg8 + local371 - local17;
								local389 = arg5 + local11 + 8 - local380;
							}
							if (local389 >= 0 && local389 < 104 && local395 >= 0 && local395 < 104) {
								Static46.anIntArrayArrayArray1[arg2][local389][local395] = Static46.anIntArrayArrayArray1[arg2][local242 + local129][local233 + local127];
							}
						}
					}
				}
			}
		}
		@Pc(511) boolean local511 = false;
		@Pc(689) int local689;
		@Pc(731) int local731;
		while (local105.aByteArray55.length > local105.anInt3000) {
			local165 = local105.method2199();
			if (local165 == 128) {
				Static84.anIntArray201[0] = local105.method2244();
				local511 = true;
				Static84.anIntArray201[1] = local105.method2248();
				Static84.anIntArray201[2] = local105.method2248();
				Static84.anIntArray201[3] = local105.method2248();
				Static84.anIntArray201[4] = local105.method2244();
			} else {
				if (local165 != 129) {
					local105.anInt3000--;
					break;
				}
				for (local242 = 0; local242 < 4; local242++) {
					@Pc(547) byte local547 = local105.method2212();
					if (local547 == 0) {
						if (local242 <= arg0) {
							local389 = arg8;
							local371 = arg5;
							if (arg5 < 0) {
								local371 = 0;
							} else if (arg5 >= 104) {
								local371 = 104;
							}
							local380 = arg5 + 7;
							if (local380 < 0) {
								local380 = 0;
							} else if (local380 >= 104) {
								local380 = 104;
							}
							if (arg8 < 0) {
								local389 = 0;
							} else if (arg8 >= 104) {
								local389 = 104;
							}
							local395 = arg8 + 7;
							if (local395 < 0) {
								local395 = 0;
							} else if (local395 >= 104) {
								local395 = 104;
							}
							while (local380 > local371) {
								while (local389 < local395) {
									Static290.aByteArrayArrayArray17[arg2][local371][local389] = 0;
									local389++;
								}
								local371++;
							}
						}
					} else if (local547 == 1) {
						for (local371 = 0; local371 < 64; local371 += 4) {
							for (local380 = 0; local380 < 64; local380 += 4) {
								@Pc(673) byte local673 = local105.method2212();
								if (local242 <= arg0) {
									for (local395 = local371; local395 < local371 + 4; local395++) {
										for (local689 = local380; local689 < local380 + 4; local689++) {
											if (local395 >= local17 && local395 < local17 + 8 && local689 >= local11 && local11 + 8 > local11) {
												local731 = Static216.method3455(local395 & 0x7, local689 & 0x7, arg9) + arg5;
												@Pc(743) int local743 = Static35.method744(arg9, local689 & 0x7, local395 & 0x7) + arg8;
												if (local731 >= 0 && local731 < 104 && local743 >= 0 && local743 < 104) {
													Static290.aByteArrayArrayArray17[arg2][local731][local743] = local673;
												}
											}
										}
									}
								}
							}
						}
					} else if (local547 == 2) {
					}
				}
			}
		}
		if (Static294.aBoolean367 && !arg3) {
			@Pc(843) Class61 local843 = null;
			label290: while (true) {
				label283: do {
					while (true) {
						while (local105.aByteArray55.length > local105.anInt3000) {
							local242 = local105.method2199();
							if (local242 == 0) {
								local843 = new Class61(local105);
							} else {
								if (local242 == 1) {
									local233 = local105.method2199();
									continue label283;
								}
								if (local242 != 2) {
									throw new IllegalStateException();
								}
								if (local843 == null) {
									local843 = new Class61();
								}
								local843.method1432(local105);
							}
						}
						if (local843 == null) {
							local843 = new Class61();
						}
						Static87.aClass61ArrayArray1[arg5 >> 3][arg8 >> 3] = local843;
						break label290;
					}
				} while (local233 <= 0);
				for (local371 = 0; local371 < local233; local371++) {
					@Pc(887) Class59 local887 = new Class59(local105);
					if (local887.anInt1840 == 31) {
						@Pc(899) Class182 local899 = Static182.method2955(local105.method2244());
						local887.method1356(local899.anInt5892, local899.anInt5896, local899.anInt5897, local899.anInt5891);
					}
					local389 = local887.anInt1852 >> 7;
					local395 = local887.anInt1847 >> 7;
					if (local887.anInt1851 == arg0 && local389 >= local17 && local389 < local17 + 8 && local11 <= local395 && local11 + 8 > local395) {
						local689 = Static244.method3198(local887.anInt1847 & 0x3FF, local887.anInt1852 & 0x3FF, arg9) + (arg5 << 7);
						local731 = Static43.method875(local887.anInt1847 & 0x3FF, arg9, local887.anInt1852 & 0x3FF) + (arg8 << 7);
						local887.anInt1847 = local731;
						local395 = local887.anInt1847 >> 7;
						local887.anInt1852 = local689;
						local389 = local887.anInt1852 >> 7;
						if (local389 >= 0 && local395 >= 0 && local389 < 104 && local395 < 104) {
							local887.aBoolean128 = (Static303.aByteArrayArrayArray19[1][local389][local395] & 0x2) != 0;
							local887.anInt1848 = Static46.anIntArrayArrayArray1[local887.anInt1851][local389][local395] - local887.anInt1848;
							Static191.method3094(local887);
						}
					}
				}
			}
		}
		local165 = arg5 + 7;
		local242 = arg8 + 7;
		for (local233 = arg5; local233 < local165; local233++) {
			for (local371 = arg8; local371 < local242; local371++) {
				Static290.aByteArrayArrayArray17[arg2][local233][local371] = 0;
			}
		}
		return local511 ? Static84.anIntArray201 : null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public static void method2816() {
		aClass89_24.method2265();
		Static135.aClass89_17.method2265();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!th;Lclient!th;ILclient!th;)V")
	public static void method2818(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(3) Class168 arg2) {
		Static166.aClass168_124 = arg2;
		Static128.aClass168_95 = arg0;
		Static260.aClass168_177 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lclient!mf;")
	public static Class107 method2819(@OriginalArg(0) int arg0) {
		@Pc(19) Class107 local19 = (Class107) Static7.aClass89_1.method2268((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static149.aClass168_113.method4058(arg0, 36);
		local19 = new Class107();
		local19.anInt3767 = arg0;
		if (local29 != null) {
			local19.method2749(new Class1_Sub14(local29));
		}
		Static7.aClass89_1.method2272((long) arg0, local19);
		return local19;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
	public static int method2820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			arg0--;
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!na;)V")
	public static void method2821(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class112 arg1) {
		while (true) {
			@Pc(6) Class47 local6 = arg1.method2893(arg0);
			while (local6.anInt1417 == 0) {
				Static312.method4734(10L);
			}
			if (local6.anInt1417 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static312.method4734(100L);
		}
	}
}
