import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lq", name = "ib", descriptor = "Lclient!f;")
	public static Class3 aClass3_12;

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "Lclient!er;")
	public static final Class69 aClass69_41 = new Class69(64);

	@OriginalMember(owner = "client!lq", name = "fb", descriptor = "I")
	public static int anInt4317 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!jn;Lclient!jn;I)V")
	public static void method3263(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class4_Sub1 arg1) {
		if (arg0.aClass4_Sub1_58 != null) {
			arg0.method5863();
		}
		arg0.aClass4_Sub1_57 = arg1.aClass4_Sub1_57;
		arg0.aClass4_Sub1_58 = arg1;
		arg0.aClass4_Sub1_58.aClass4_Sub1_57 = arg0;
		arg0.aClass4_Sub1_57.aClass4_Sub1_58 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3266(@OriginalArg(0) String arg0) {
		@Pc(13) String local13 = Static128.method1909(Static13.method317(arg0));
		if (local13 == null) {
			local13 = "";
		}
		return local13;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!vj;Z)Z")
	public static boolean method3268(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static346.aClass146Array2 == Static117.aClass146Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method4749();
		if (arg0.aShort82 < 0 || arg0.aShort85 < 0 || arg0.aShort84 >= Static301.anInt5434 || arg0.aShort83 >= Static241.anInt4414) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort82; local34 <= arg0.aShort84; local34++) {
			for (local38 = arg0.aShort85; local38 <= arg0.aShort83; local38++) {
				@Pc(45) Class53 local45 = Static444.method5715(arg0.aByte86, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort82) {
						local49++;
					}
					if (local34 < arg0.aShort84) {
						local49 += 4;
					}
					if (local38 > arg0.aShort85) {
						local49 += 8;
					}
					if (local38 < arg0.aShort83) {
						local49 += 2;
					}
					@Pc(74) Class165 local74 = Static43.method274(local49, arg0);
					@Pc(77) Class165 local77 = local45.aClass165_1;
					if (local77 == null) {
						local45.aClass165_1 = local74;
					} else {
						while (local77.aClass165_2 != null) {
							local77 = local77.aClass165_2;
						}
						local77.aClass165_2 = local74;
					}
					local45.aByte34 = (byte) (local45.aByte34 | local49);
					if (local6 && (Static74.anIntArrayArray14[local34][local38] & 0xFF000000) != 0) {
						local8 = Static74.anIntArrayArray14[local34][local38];
						local10 = Static442.aByteArrayArray21[local34][local38];
						local12 = Static146.aByteArrayArray3[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort82; local38 <= arg0.aShort84; local38++) {
				for (@Pc(150) int local150 = arg0.aShort85; local150 <= arg0.aShort83; local150++) {
					if ((Static74.anIntArrayArray14[local38][local150] & 0xFF000000) == 0) {
						Static74.anIntArrayArray14[local38][local150] = local8;
						Static442.aByteArrayArray21[local38][local150] = local10;
						Static146.aByteArrayArray3[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static69.aClass6_Sub2Array2[Static332.anInt5825++] = arg0;
		}
		return true;
	}
}
