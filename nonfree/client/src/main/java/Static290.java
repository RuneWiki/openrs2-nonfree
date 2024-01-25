import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_112 = new Class265(107, 12);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!co;)V")
	public static void method4176(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		arg0.aBoolean427 = false;
		@Pc(18) Class250 local18;
		if (arg0.anInt6177 != -1) {
			local18 = Static338.aClass12_2.method255(arg0.anInt6177);
			if (local18 == null || local18.anIntArray592 == null) {
				arg0.aBoolean429 = false;
				arg0.anInt6177 = -1;
			} else {
				label394: {
					arg0.anInt6180++;
					if (local18.anIntArray592.length > arg0.anInt6190 && arg0.anInt6180 > local18.anIntArray594[arg0.anInt6190]) {
						arg0.anInt6192++;
						arg0.anInt6180 = 1;
						arg0.anInt6190++;
						Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local18, arg0.anInt6190);
					}
					if (local18.anIntArray592.length <= arg0.anInt6190) {
						arg0.anInt6190 = 0;
						arg0.anInt6180 = 0;
						if (arg0.aBoolean429) {
							arg0.anInt6177 = arg0.method4925().method3603();
							if (arg0.anInt6177 == -1) {
								arg0.aBoolean429 = false;
								break label394;
							}
							local18 = Static338.aClass12_2.method255(arg0.anInt6177);
						}
						Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local18, arg0.anInt6190);
					}
					arg0.anInt6192 = arg0.anInt6190 + 1;
					if (local18.anIntArray592.length <= arg0.anInt6192) {
						arg0.anInt6192 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(191) Class250 local191;
		@Pc(175) Class203 local175;
		if (arg0.anInt6150 != -1 && Static131.anInt2821 >= arg0.anInt6186) {
			local175 = Static395.aClass247_2.method5407(arg0.anInt6150);
			local178 = local175.anInt5615;
			if (local178 == -1) {
				arg0.anInt6150 = -1;
			} else {
				label396: {
					local191 = Static338.aClass12_2.method255(local178);
					if (local175.aBoolean398) {
						if (local191.anInt7013 == 3) {
							if (arg0.anInt6204 > 0 && Static131.anInt2821 >= arg0.anInt6181 && arg0.anInt6183 < Static131.anInt2821) {
								arg0.anInt6150 = -1;
								break label396;
							}
						} else if (local191.anInt7013 == 1 && arg0.anInt6204 > 0 && Static131.anInt2821 >= arg0.anInt6181 && arg0.anInt6183 < Static131.anInt2821) {
							arg0.anInt6186 = Static131.anInt2821 + 1;
							break label396;
						}
					}
					if (local191 == null || local191.anIntArray592 == null) {
						arg0.anInt6150 = -1;
					} else {
						if (arg0.anInt6164 < 0) {
							arg0.anInt6164 = 0;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local191, 0);
						}
						arg0.anInt6176++;
						if (arg0.anInt6164 < local191.anIntArray592.length && arg0.anInt6176 > local191.anIntArray594[arg0.anInt6164]) {
							arg0.anInt6176 = 1;
							arg0.anInt6164++;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local191, arg0.anInt6164);
						}
						if (local191.anIntArray592.length <= arg0.anInt6164) {
							if (local175.aBoolean398) {
								arg0.anInt6164 -= local191.anInt7016;
								arg0.anInt6154++;
								if (arg0.anInt6154 >= local191.anInt7017) {
									arg0.anInt6150 = -1;
								} else if (arg0.anInt6164 >= 0 && arg0.anInt6164 < local191.anIntArray592.length) {
									Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local191, arg0.anInt6164);
								} else {
									arg0.anInt6150 = -1;
								}
							} else {
								arg0.anInt6150 = -1;
							}
						}
						arg0.anInt6171 = arg0.anInt6164 + 1;
						if (arg0.anInt6171 >= local191.anIntArray592.length) {
							if (local175.aBoolean398) {
								arg0.anInt6171 -= local191.anInt7016;
								if (local191.anInt7017 <= arg0.anInt6154 + 1) {
									arg0.anInt6171 = -1;
								} else if (arg0.anInt6171 < 0 || local191.anIntArray592.length <= arg0.anInt6171) {
									arg0.anInt6171 = -1;
								}
							} else {
								arg0.anInt6171 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6126 != -1 && Static131.anInt2821 >= arg0.anInt6146) {
			local175 = Static395.aClass247_2.method5407(arg0.anInt6126);
			local178 = local175.anInt5615;
			if (local178 == -1) {
				arg0.anInt6126 = -1;
			} else {
				label400: {
					local191 = Static338.aClass12_2.method255(local178);
					if (local175.aBoolean398) {
						if (local191.anInt7013 == 3) {
							if (arg0.anInt6204 > 0 && arg0.anInt6181 <= Static131.anInt2821 && arg0.anInt6183 < Static131.anInt2821) {
								arg0.anInt6126 = -1;
								break label400;
							}
						} else if (local191.anInt7013 == 1 && arg0.anInt6204 > 0 && arg0.anInt6181 <= Static131.anInt2821 && Static131.anInt2821 > arg0.anInt6183) {
							arg0.anInt6146 = Static131.anInt2821 + 1;
							break label400;
						}
					}
					if (local191 == null || local191.anIntArray592 == null) {
						arg0.anInt6126 = -1;
					} else {
						if (arg0.anInt6185 < 0) {
							arg0.anInt6185 = 0;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local191, 0);
						}
						arg0.anInt6136++;
						if (local191.anIntArray592.length > arg0.anInt6185 && local191.anIntArray594[arg0.anInt6185] < arg0.anInt6136) {
							arg0.anInt6136 = 1;
							arg0.anInt6185++;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local191, arg0.anInt6185);
						}
						if (arg0.anInt6185 >= local191.anIntArray592.length) {
							if (local175.aBoolean398) {
								arg0.anInt6162++;
								arg0.anInt6185 -= local191.anInt7016;
								if (arg0.anInt6162 >= local191.anInt7017) {
									arg0.anInt6126 = -1;
								} else if (arg0.anInt6185 >= 0 && arg0.anInt6185 < local191.anIntArray592.length) {
									Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local191, arg0.anInt6185);
								} else {
									arg0.anInt6126 = -1;
								}
							} else {
								arg0.anInt6126 = -1;
							}
						}
						arg0.anInt6166 = arg0.anInt6185 + 1;
						if (local191.anIntArray592.length <= arg0.anInt6166) {
							if (local175.aBoolean398) {
								arg0.anInt6166 -= local191.anInt7016;
								if (local191.anInt7017 <= arg0.anInt6162 + 1) {
									arg0.anInt6166 = -1;
								} else if (arg0.anInt6166 < 0 || arg0.anInt6166 >= local191.anIntArray592.length) {
									arg0.anInt6166 = -1;
								}
							} else {
								arg0.anInt6166 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6163 != -1 && arg0.anInt6139 <= 1) {
			local18 = Static338.aClass12_2.method255(arg0.anInt6163);
			if (local18.anInt7013 == 3) {
				if (arg0.anInt6204 > 0 && arg0.anInt6181 <= Static131.anInt2821 && Static131.anInt2821 > arg0.anInt6183) {
					arg0.anInt6163 = -1;
				}
			} else if (local18.anInt7013 == 1 && arg0.anInt6204 > 0 && Static131.anInt2821 >= arg0.anInt6181 && Static131.anInt2821 > arg0.anInt6183) {
				arg0.anInt6139 = 2;
			}
		}
		if (arg0.anInt6163 != -1 && arg0.anInt6139 == 0) {
			local18 = Static338.aClass12_2.method255(arg0.anInt6163);
			if (local18 == null || local18.anIntArray592 == null) {
				arg0.anInt6163 = -1;
			} else {
				arg0.anInt6178++;
				if (local18.anIntArray592.length > arg0.anInt6149 && arg0.anInt6178 > local18.anIntArray594[arg0.anInt6149]) {
					arg0.anInt6149++;
					arg0.anInt6178 = 1;
					Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local18, arg0.anInt6149);
				}
				if (arg0.anInt6149 >= local18.anIntArray592.length) {
					arg0.anInt6182++;
					arg0.anInt6149 -= local18.anInt7016;
					if (local18.anInt7017 <= arg0.anInt6182) {
						arg0.anInt6163 = -1;
					} else if (arg0.anInt6149 >= 0 && local18.anIntArray592.length > arg0.anInt6149) {
						Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, arg0 == Static375.aClass3_Sub2_Sub1_Sub2_7, local18, arg0.anInt6149);
					} else {
						arg0.anInt6163 = -1;
					}
				}
				arg0.anInt6169 = arg0.anInt6149 + 1;
				if (arg0.anInt6169 >= local18.anIntArray592.length) {
					arg0.anInt6169 -= local18.anInt7016;
					if (local18.anInt7017 <= arg0.anInt6182 + 1) {
						arg0.anInt6169 = -1;
					} else if (arg0.anInt6169 < 0 || arg0.anInt6169 >= local18.anIntArray592.length) {
						arg0.anInt6169 = -1;
					}
				}
				arg0.aBoolean427 = local18.aBoolean465;
			}
		}
		if (arg0.anInt6139 > 0) {
			arg0.anInt6139--;
		}
		for (@Pc(1050) int local1050 = 0; local1050 < arg0.aClass190Array3.length; local1050++) {
			@Pc(1057) Class190 local1057 = arg0.aClass190Array3[local1050];
			if (local1057 != null) {
				if (local1057.anInt5350 > 0) {
					local1057.anInt5350--;
				} else {
					local191 = Static338.aClass12_2.method255(local1057.anInt5355);
					if (local191 == null || local191.anIntArray592 == null) {
						arg0.aClass190Array3[local1050] = null;
					} else {
						local1057.anInt5351++;
						if (local191.anIntArray592.length > local1057.anInt5352 && local1057.anInt5351 > local191.anIntArray594[local1057.anInt5352]) {
							local1057.anInt5351 = 1;
							local1057.anInt5352++;
							Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local191, local1057.anInt5352);
						}
						if (local1057.anInt5352 >= local191.anIntArray592.length) {
							local1057.anInt5352 -= local191.anInt7016;
							local1057.anInt5354++;
							if (local191.anInt7017 <= local1057.anInt5354) {
								arg0.aClass190Array3[local1050] = null;
							} else if (local1057.anInt5352 >= 0 && local1057.anInt5352 < local191.anIntArray592.length) {
								Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local191, local1057.anInt5352);
							} else {
								arg0.aClass190Array3[local1050] = null;
							}
						}
						local1057.anInt5357 = local1057.anInt5352 + 1;
						if (local191.anIntArray592.length <= local1057.anInt5357) {
							local1057.anInt5357 -= local191.anInt7016;
							if (local191.anInt7017 <= local1057.anInt5354 + 1) {
								local1057.anInt5357 = -1;
							} else if (local1057.anInt5357 < 0 || local1057.anInt5357 >= local191.anIntArray592.length) {
								local1057.anInt5357 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method4177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg0) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) Class219_Sub1 local21 = Static397.aClass219_Sub1Array3[local15];
		Static397.aClass219_Sub1Array3[local15] = Static397.aClass219_Sub1Array3[arg0];
		Static397.aClass219_Sub1Array3[arg0] = local21;
		for (@Pc(33) int local33 = arg2; local33 < arg0; local33++) {
			if (Static14.method310(Static397.aClass219_Sub1Array3[local33], local21, arg5, arg3, arg4, arg1) <= 0) {
				@Pc(50) Class219_Sub1 local50 = Static397.aClass219_Sub1Array3[local33];
				Static397.aClass219_Sub1Array3[local33] = Static397.aClass219_Sub1Array3[local17];
				Static397.aClass219_Sub1Array3[local17++] = local50;
			}
		}
		Static397.aClass219_Sub1Array3[arg0] = Static397.aClass219_Sub1Array3[local17];
		Static397.aClass219_Sub1Array3[local17] = local21;
		method4177(local17 - 1, arg1, arg2, arg3, arg4, arg5);
		method4177(arg0, arg1, local17 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4178(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static159.method2586(Static244.aClass54_101);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg0));
			Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)I")
	public static int method4180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static270.anIntArray408[arg1 & 0x3] : Static306.anIntArray441[arg1 & 0x3];
	}
}
