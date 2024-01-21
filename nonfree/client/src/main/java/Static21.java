import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_20;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_297 = Static33.method650("sl_flags");

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!ja;")
	public static Class37 aClass37_4 = new Class37();

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_298 = Static33.method650("backleft2");

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!oa;")
	private static Class56 aClass56_304 = Static33.method650("Cancel");

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_299 = aClass56_304;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_300 = Static33.method650("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_301 = Static33.method650("backleft1");

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_302 = Static33.method650("(X100(U(Y");

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public static int anInt652 = -1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_303 = Static33.method650("Von:");

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_305 = Static33.method650("_");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)Lclient!oa;")
	public static Class56 method464(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(15) int local15 = arg0 / 10;
		@Pc(26) int local26 = 1;
		while (local15 != 0) {
			local15 /= 10;
			local26++;
		}
		@Pc(37) int local37 = local26;
		if (arg0 < 0 || arg1) {
			local37 = local26 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(64) int local64 = 0; local64 < local26; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			arg0 /= 10;
			if (local70 > 9) {
				local70 += 39;
			}
			local48[local37 - local64 - 1] = (byte) (local70 + 48);
		}
		@Pc(106) Class56 local106 = new Class56();
		local106.aByteArray29 = local48;
		local106.anInt2171 = local37;
		return local106;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!tb;)V")
	public static void method465(@OriginalArg(1) Class44 arg0) {
		Static17.aClass44_9 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method466() {
		@Pc(8) Class48 local8 = Static45.aClass48_1;
		synchronized (Static45.aClass48_1) {
			Static31.anInt928 = Static80.anInt2144;
			Static36.anInt1021 = Static81.anInt2191;
			Static102.anInt3222 = Static126.anInt3098;
			Static36.anInt1014 = Static30.anInt915;
			Static127.anInt3209 = Static60.anInt1763;
			Static71.anInt1970 = Static102.anInt3221;
			Static44.aLong32 = Static104.aLong82;
			Static30.anInt915 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public static boolean method467(@OriginalArg(0) int arg0) {
		if (!Static19.method398(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class3_Sub1_Sub16[] local17 = Static31.aClass3_Sub1_Sub16ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local17.length; local24++) {
			@Pc(30) Class3_Sub1_Sub16 local30 = local17[local24];
			if (local30 != null && local30.anInt2857 == 6) {
				@Pc(58) int local58;
				if (local30.anInt2835 != -1 || local30.anInt2834 != -1) {
					@Pc(53) boolean local53 = Static46.method1514(local30);
					if (local53) {
						local58 = local30.anInt2834;
					} else {
						local58 = local30.anInt2835;
					}
					if (local58 != -1) {
						@Pc(70) Class3_Sub1_Sub4 local70 = Static41.method770(local58);
						local30.anInt2803 += Static44.anInt1163;
						label52: while (true) {
							do {
								do {
									if (local70.anIntArray54[local30.anInt2815] >= local30.anInt2803) {
										break label52;
									}
									local13 = true;
									local30.anInt2803 -= local70.anIntArray54[local30.anInt2815];
									local30.anInt2815++;
								} while (local30.anInt2815 < local70.anIntArray58.length);
								local30.anInt2815 -= local70.anInt871;
							} while (local30.anInt2815 >= 0 && local70.anIntArray58.length > local30.anInt2815);
							local30.anInt2815 = 0;
						}
					}
				}
				if (local30.anInt2860 != 0 && !local30.aBoolean149) {
					local13 = true;
					@Pc(150) int local150 = local30.anInt2860 >> 16;
					@Pc(154) int local154 = local150 * Static44.anInt1163;
					local30.anInt2856 = local154 + local30.anInt2856 & 0x7FF;
					local58 = local30.anInt2860 << 16 >> 16;
					local58 *= Static44.anInt1163;
					local30.anInt2858 = local58 + local30.anInt2858 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
	public static boolean method468() {
		try {
			if (Static57.anInt1621 == 2) {
				if (Static106.aClass3_Sub8_1 == null) {
					Static106.aClass3_Sub8_1 = Static129.method796(Static47.aClass44_30, Static19.anInt593, Static117.anInt2967);
					if (Static106.aClass3_Sub8_1 == null) {
						return false;
					}
				}
				if (Static27.aClass76_1 == null) {
					Static27.aClass76_1 = new Class76(Static44.aClass44_24, Static77.aClass44_71);
				}
				if (Static48.aClass3_Sub3_Sub2_2.method1264(Static106.aClass3_Sub8_1, Static69.aClass44_42, Static27.aClass76_1)) {
					Static48.aClass3_Sub3_Sub2_2.method1245();
					Static48.aClass3_Sub3_Sub2_2.method1233(Static57.anInt1619);
					Static48.aClass3_Sub3_Sub2_2.method1265(Static106.aClass3_Sub8_1, Static2.aBoolean1);
					Static47.aClass44_30 = null;
					Static57.anInt1621 = 0;
					Static106.aClass3_Sub8_1 = null;
					Static27.aClass76_1 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static48.aClass3_Sub3_Sub2_2.method1235();
			Static27.aClass76_1 = null;
			Static47.aClass44_30 = null;
			Static106.aClass3_Sub8_1 = null;
			Static57.anInt1621 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!wb;B)V")
	public static void method469(@OriginalArg(0) Class3_Sub1_Sub2_Sub4 arg0) {
		arg0.aBoolean170 = false;
		@Pc(21) Class3_Sub1_Sub4 local21;
		if (arg0.anInt3186 != -1) {
			local21 = Static41.method770(arg0.anInt3186);
			if (local21 == null || local21.anIntArray58 == null) {
				arg0.anInt3186 = -1;
			} else {
				arg0.anInt3152++;
				if (local21.anIntArray58.length > arg0.anInt3166 && arg0.anInt3152 > local21.anIntArray54[arg0.anInt3166]) {
					arg0.anInt3152 = 1;
					arg0.anInt3166++;
					Static62.method1204(arg0.anInt3187, arg0.anInt3166, local21, arg0.anInt3196);
				}
				if (arg0.anInt3166 >= local21.anIntArray58.length) {
					arg0.anInt3152 = 0;
					arg0.anInt3166 = 0;
					Static62.method1204(arg0.anInt3187, arg0.anInt3166, local21, arg0.anInt3196);
				}
			}
		}
		if (arg0.anInt3198 != -1 && Static98.anInt2566 >= arg0.anInt3151) {
			if (arg0.anInt3163 < 0) {
				arg0.anInt3163 = 0;
			}
			@Pc(114) int local114 = Static43.method800(arg0.anInt3198).anInt470;
			if (local114 == -1) {
				arg0.anInt3198 = -1;
			} else {
				@Pc(121) Class3_Sub1_Sub4 local121 = Static41.method770(local114);
				if (local121 == null || local121.anIntArray58 == null) {
					arg0.anInt3198 = -1;
				} else {
					arg0.anInt3189++;
					if (arg0.anInt3163 < local121.anIntArray58.length && arg0.anInt3189 > local121.anIntArray54[arg0.anInt3163]) {
						arg0.anInt3163++;
						arg0.anInt3189 = 1;
						Static62.method1204(arg0.anInt3187, arg0.anInt3163, local121, arg0.anInt3196);
					}
					if (local121.anIntArray58.length <= arg0.anInt3163 && (arg0.anInt3163 < 0 || local121.anIntArray58.length <= arg0.anInt3163)) {
						arg0.anInt3198 = -1;
					}
				}
			}
		}
		if (arg0.anInt3149 != -1 && arg0.anInt3144 <= 1) {
			local21 = Static41.method770(arg0.anInt3149);
			if (local21.anInt860 == 1 && arg0.anInt3191 > 0 && Static98.anInt2566 >= arg0.anInt3142 && arg0.anInt3195 < Static98.anInt2566) {
				arg0.anInt3144 = 1;
				return;
			}
		}
		if (arg0.anInt3149 != -1 && arg0.anInt3144 == 0) {
			local21 = Static41.method770(arg0.anInt3149);
			if (local21 == null || local21.anIntArray58 == null) {
				arg0.anInt3149 = -1;
			} else {
				arg0.anInt3143++;
				if (local21.anIntArray58.length > arg0.anInt3175 && local21.anIntArray54[arg0.anInt3175] < arg0.anInt3143) {
					arg0.anInt3143 = 1;
					arg0.anInt3175++;
					Static62.method1204(arg0.anInt3187, arg0.anInt3175, local21, arg0.anInt3196);
				}
				if (local21.anIntArray58.length <= arg0.anInt3175) {
					arg0.anInt3175 -= local21.anInt871;
					arg0.anInt3168++;
					if (arg0.anInt3168 >= local21.anInt870) {
						arg0.anInt3149 = -1;
					} else if (arg0.anInt3175 >= 0 && arg0.anInt3175 < local21.anIntArray58.length) {
						Static62.method1204(arg0.anInt3187, arg0.anInt3175, local21, arg0.anInt3196);
					} else {
						arg0.anInt3149 = -1;
					}
				}
				arg0.aBoolean170 = local21.aBoolean47;
			}
		}
		if (arg0.anInt3144 > 0) {
			arg0.anInt3144--;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method470() {
		aClass56_297 = null;
		aClass44_Sub1_20 = null;
		aClass56_301 = null;
		aClass56_303 = null;
		aClass56_299 = null;
		aClass56_304 = null;
		aClass37_4 = null;
		aClass56_298 = null;
		aClass56_305 = null;
		aClass56_302 = null;
		aClass56_300 = null;
	}
}
