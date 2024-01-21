import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!ff;")
	public static Class26 aClass26_27;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!ff;")
	public static Class26 aClass26_28;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Lclient!ff;")
	public static Class26 aClass26_29;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
	public static int anInt2799;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_840 = Static129.method2060("(U1");

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_841 = Static129.method2060("logo");

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public static int[] anIntArray339 = new int[200];

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_842 = Static129.method2060("Welt");

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "Lclient!r;")
	private static Class61 aClass61_849 = Static129.method2060("skill)2");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_843 = aClass61_849;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_844 = Static129.method2060(" )2> ");

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_845 = Static129.method2060("VOLL");

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!r;")
	private static Class61 aClass61_847 = Static129.method2060("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_846 = aClass61_847;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!r;")
	public static Class61 aClass61_848 = Static129.method2060("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_850 = Static129.method2060("hel");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIII)I")
	public static int method1798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class5_Sub2_Sub1_Sub2.anIntArray197[arg0 * 1024 / arg2] >> 1;
		return (arg3 * (65536 - local20) >> 16) + (local20 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static61.aClass81_1.method2071(Static93.anInt2428, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(48) Class5_Sub2_Sub16 local48 = Static43.method767(local7);
			@Pc(56) int local56;
			@Pc(59) int local59;
			if (local33 == 0 || local33 == 2) {
				local59 = local48.anInt3126;
				local56 = local48.anInt3120;
			} else {
				local56 = local48.anInt3126;
				local59 = local48.anInt3120;
			}
			@Pc(70) int local70 = local48.anInt3123;
			if (local33 != 0) {
				local70 = (local70 << local33 & 0xF) + (local70 >> 4 - local33);
			}
			Static74.method1193(local70, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], arg1, arg0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, true, local56, 0, local59, 0);
		} else {
			Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], arg1, arg0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, true, 0, local33, 0, local27 + 1);
		}
		Static63.anInt1553 = Static26.anInt613;
		Static32.anInt963 = Static12.anInt308;
		Static105.anInt3346 = 2;
		Static8.anInt188 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method1805() {
		aClass61_849 = null;
		anIntArray339 = null;
		aClass61_844 = null;
		aClass61_840 = null;
		aClass61_842 = null;
		aByteArrayArrayArray7 = null;
		aClass26_27 = null;
		aClass61_846 = null;
		aClass26_29 = null;
		aClass61_848 = null;
		aClass61_847 = null;
		aClass61_845 = null;
		aClass26_28 = null;
		aClass61_843 = null;
		aClass61_841 = null;
		aClass61_850 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIZI)V")
	public static void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static123.anInt3071 == 0 && !Static32.aBoolean27) {
			Static92.method1470(Static113.aClass61_894, 0, Static96.aClass61_746, arg3 - arg1, -arg2 + arg0, 41);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static131.anInt3327; local31++) {
			@Pc(39) int local39 = Static131.anIntArray434[local31];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local29 != local39) {
				local29 = local39;
				@Pc(149) int local149;
				if (local55 == 2 && Static61.aClass81_1.method2071(Static93.anInt2428, local43, local49, local39) >= 0) {
					@Pc(83) Class5_Sub2_Sub16 local83 = Static43.method767(local61);
					if (local83.anIntArray377 != null) {
						local83 = local83.method1966();
					}
					if (local83 == null) {
						continue;
					}
					if (Static123.anInt3071 == 1) {
						Static92.method1470(Static30.aClass61_277, local39, Static123.method1929(new Class61[] { Static86.aClass61_673, Static129.aClass61_1068, local83.aClass61_997 }), local49, local43, 1);
					} else if (!Static32.aBoolean27) {
						@Pc(139) Class61[] local139 = local83.aClass61Array24;
						if (Static90.aBoolean83) {
							local139 = Static40.method737(local139);
						}
						if (local139 != null) {
							for (local149 = 4; local149 >= 0; local149--) {
								if (local139[local149] != null) {
									@Pc(161) short local161 = 0;
									if (local149 == 0) {
										local161 = 43;
									}
									if (local149 == 1) {
										local161 = 15;
									}
									if (local149 == 2) {
										local161 = 57;
									}
									if (local149 == 3) {
										local161 = 51;
									}
									if (local149 == 4) {
										local161 = 1003;
									}
									Static92.method1470(local139[local149], local39, Static123.method1929(new Class61[] { Static47.aClass61_366, local83.aClass61_997 }), local49, local43, local161);
								}
							}
						}
						Static92.method1470(Static133.aClass61_1094, local83.anInt3135 << 14, Static123.method1929(new Class61[] { Static47.aClass61_366, local83.aClass61_997 }), local49, local43, 1007);
					} else if ((Static73.anInt1738 & 0x4) == 4) {
						Static92.method1470(Static91.aClass61_717, local39, Static123.method1929(new Class61[] { Static50.aClass61_396, Static129.aClass61_1068, local83.aClass61_997 }), local49, local43, 49);
					}
				}
				@Pc(295) int local295;
				@Pc(303) Class5_Sub2_Sub2_Sub3_Sub1 local303;
				@Pc(356) Class5_Sub2_Sub2_Sub3_Sub2 local356;
				if (local55 == 1) {
					@Pc(274) Class5_Sub2_Sub2_Sub3_Sub1 local274 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local61];
					if (local274.aClass5_Sub2_Sub12_1.anInt2511 == 1 && (local274.anInt2912 & 0x7F) == 64 && (local274.anInt2875 & 0x7F) == 64) {
						for (local295 = 0; local295 < Static100.anInt2607; local295++) {
							local303 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local295]];
							if (local303 != null && local274 != local303 && local303.aClass5_Sub2_Sub12_1.anInt2511 == 1 && local303.anInt2912 == local274.anInt2912 && local303.anInt2875 == local274.anInt2875) {
								Static71.method1180(Static61.anIntArray225[local295], local43, local303.aClass5_Sub2_Sub12_1, local49);
							}
						}
						for (local149 = 0; local149 < Static92.anInt2219; local149++) {
							local356 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local149]];
							if (local356 != null && local274.anInt2912 == local356.anInt2912 && local274.anInt2875 == local356.anInt2875) {
								Static75.method1195(local49, local356, local43, Static66.anIntArray236[local149]);
							}
						}
					}
					Static71.method1180(local61, local43, local274.aClass5_Sub2_Sub12_1, local49);
				}
				if (local55 == 0) {
					@Pc(408) Class5_Sub2_Sub2_Sub3_Sub2 local408 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local61];
					if ((local408.anInt2912 & 0x7F) == 64 && (local408.anInt2875 & 0x7F) == 64) {
						for (local295 = 0; local295 < Static100.anInt2607; local295++) {
							local303 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local295]];
							if (local303 != null && local303.aClass5_Sub2_Sub12_1.anInt2511 == 1 && local408.anInt2912 == local303.anInt2912 && local303.anInt2875 == local408.anInt2875) {
								Static71.method1180(Static61.anIntArray225[local295], local43, local303.aClass5_Sub2_Sub12_1, local49);
							}
						}
						for (local149 = 0; local149 < Static92.anInt2219; local149++) {
							local356 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local149]];
							if (local356 != null && local356 != local408 && local408.anInt2912 == local356.anInt2912 && local408.anInt2875 == local356.anInt2875) {
								Static75.method1195(local49, local356, local43, Static66.anIntArray236[local149]);
							}
						}
					}
					Static75.method1195(local49, local408, local43, local61);
				}
				if (local55 == 3) {
					@Pc(530) Class58 local530 = Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local43][local49];
					if (local530 != null) {
						for (@Pc(537) Class5_Sub2_Sub2_Sub4 local537 = (Class5_Sub2_Sub2_Sub4) local530.method1666(); local537 != null; local537 = (Class5_Sub2_Sub2_Sub4) local530.method1659()) {
							@Pc(544) Class5_Sub2_Sub11 local544 = Static111.method1830(local537.anInt1911);
							if (Static123.anInt3071 == 1) {
								Static92.method1470(Static30.aClass61_277, local537.anInt1911, Static123.method1929(new Class61[] { Static86.aClass61_673, Static77.aClass61_590, local544.aClass61_597 }), local49, local43, 31);
							} else if (!Static32.aBoolean27) {
								@Pc(556) Class61[] local556 = local544.aClass61Array14;
								if (Static90.aBoolean83) {
									local556 = Static40.method737(local556);
								}
								for (@Pc(564) int local564 = 4; local564 >= 0; local564--) {
									if (local556 != null && local556[local564] != null) {
										@Pc(606) byte local606 = 0;
										if (local564 == 0) {
											local606 = 26;
										}
										if (local564 == 1) {
											local606 = 21;
										}
										if (local564 == 2) {
											local606 = 19;
										}
										if (local564 == 3) {
											local606 = 48;
										}
										if (local564 == 4) {
											local606 = 11;
										}
										Static92.method1470(local556[local564], local537.anInt1911, Static123.method1929(new Class61[] { Static82.aClass61_652, local544.aClass61_597 }), local49, local43, local606);
									} else if (local564 == 2) {
										Static92.method1470(Static103.aClass61_804, local537.anInt1911, Static123.method1929(new Class61[] { Static82.aClass61_652, local544.aClass61_597 }), local49, local43, 19);
									}
								}
								Static92.method1470(Static133.aClass61_1094, local537.anInt1911, Static123.method1929(new Class61[] { Static82.aClass61_652, local544.aClass61_597 }), local49, local43, 1006);
							} else if ((Static73.anInt1738 & 0x1) == 1) {
								Static92.method1470(Static91.aClass61_717, local537.anInt1911, Static123.method1929(new Class61[] { Static50.aClass61_396, Static77.aClass61_590, local544.aClass61_597 }), local49, local43, 46);
							}
						}
					}
				}
			}
		}
	}
}
