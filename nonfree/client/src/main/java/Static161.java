import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public static int anInt3399 = 0;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
	public static int[] anIntArray256 = new int[2048];

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public static int anInt3401 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method2799(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = local19 + (arg1 ? Static199.anInt4145 : Static165.anInt3459);
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(40) Class2_Sub3_Sub22 local40 = Static190.method3493(local29);
			if (local40.aBoolean466 && local40.method4615().toLowerCase().indexOf(local4) != -1) {
				if (local10 >= 50) {
					Static51.aShortArray25 = null;
					Static5.anInt153 = -1;
					return;
				}
				if (local10 >= local13.length) {
					@Pc(77) short[] local77 = new short[local13.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local10; local79++) {
						local77[local79] = local13[local79];
					}
					local13 = local77;
				}
				local13[local10++] = (short) local29;
			}
		}
		Static5.anInt153 = local10;
		Static51.aShortArray25 = local13;
		Static58.anInt1315 = 0;
		@Pc(123) String[] local123 = new String[Static5.anInt153];
		for (@Pc(125) int local125 = 0; local125 < Static5.anInt153; local125++) {
			local123[local125] = Static190.method3493(local13[local125]).method4615();
		}
		Static82.method4612(Static51.aShortArray25, local123);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIILclient!th;)V")
	public static void method2801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36_Sub3_Sub2 arg3) {
		if (Static111.aClass36_Sub3_Sub2_1 == arg3 || Static216.anInt4481 >= 400) {
			return;
		}
		@Pc(42) String local42;
		if (arg3.anInt5174 == 0) {
			@Pc(46) boolean local46 = true;
			if (Static111.aClass36_Sub3_Sub2_1.anInt5156 != -1 && arg3.anInt5156 != -1) {
				@Pc(71) int local71 = arg3.anInt5159 < Static111.aClass36_Sub3_Sub2_1.anInt5159 ? Static111.aClass36_Sub3_Sub2_1.anInt5159 : arg3.anInt5159;
				@Pc(86) int local86 = Static111.aClass36_Sub3_Sub2_1.anInt5156 >= arg3.anInt5156 ? arg3.anInt5156 : Static111.aClass36_Sub3_Sub2_1.anInt5156;
				@Pc(97) int local97 = local71 * 10 / 100 + local86 + 5;
				@Pc(104) int local104 = Static111.aClass36_Sub3_Sub2_1.anInt5159 - arg3.anInt5159;
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > local97) {
					local46 = false;
				}
			}
			@Pc(128) String local128 = Static84.anInt825 == 1 ? Static110.aString123 : Static293.aString295;
			if (arg3.anInt5160 > arg3.anInt5159) {
				local42 = arg3.method4114() + (local46 ? Static219.method3702(Static111.aClass36_Sub3_Sub2_1.anInt5159, arg3.anInt5159) : "<col=ffffff>") + " (" + local128 + arg3.anInt5159 + "+" + (arg3.anInt5160 - arg3.anInt5159) + ")";
			} else {
				local42 = arg3.method4114() + (local46 ? Static219.method3702(Static111.aClass36_Sub3_Sub2_1.anInt5159, arg3.anInt5159) : "<col=ffffff>") + " (" + local128 + arg3.anInt5159 + ")";
			}
		} else {
			local42 = arg3.method4114() + " (" + Static87.aString95 + arg3.anInt5174 + ")";
		}
		@Pc(240) int local240;
		if (Static106.anInt2305 == 1) {
			Static32.method642((short) 38, arg0, (long) arg1, Static124.anInt2629, arg2, Static8.aString13 + " -> <col=ffffff>" + local42, Static212.aString224);
		} else if (!Static133.aBoolean219) {
			for (local240 = 7; local240 >= 0; local240--) {
				if (Static27.aStringArray2[local240] != null) {
					@Pc(258) short local258 = 0;
					if (Static84.anInt825 == 0 && Static27.aStringArray2[local240].equalsIgnoreCase(Static203.aString210)) {
						if (Static111.aClass36_Sub3_Sub2_1.anInt5159 < arg3.anInt5159) {
							local258 = 2000;
						}
						if (Static111.aClass36_Sub3_Sub2_1.anInt5152 != 0 && arg3.anInt5152 != 0) {
							if (Static111.aClass36_Sub3_Sub2_1.anInt5152 == arg3.anInt5152) {
								local258 = 2000;
							} else {
								local258 = 0;
							}
						}
					} else if (Static241.aBooleanArray25[local240]) {
						local258 = 2000;
					}
					@Pc(312) short local312 = Static268.aShortArray86[local240];
					@Pc(317) short local317 = (short) (local312 + local258);
					Static32.method642(local317, arg0, (long) arg1, Static288.anIntArray514[local240], arg2, "<col=ffffff>" + local42, Static27.aStringArray2[local240]);
				}
			}
		} else if ((Static212.anInt4455 & 0x8) != 0) {
			Static32.method642((short) 32, arg0, (long) arg1, Static112.anInt2421, arg2, Static150.aString153 + " -> <col=ffffff>" + local42, Static296.aString299);
		}
		for (local240 = 0; local240 < Static216.anInt4481; local240++) {
			if (Static289.aShortArray93[local240] == 6) {
				Static214.aStringArray22[local240] = "<col=ffffff>" + local42;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Lclient!hd;")
	public static Class65 method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class65 local14 = local7.aClass65_1;
			local7.aClass65_1 = null;
			return local14;
		}
	}
}
