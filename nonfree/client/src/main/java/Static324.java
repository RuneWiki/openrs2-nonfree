import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!fs;")
	public static Class76 aClass76_69;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_261 = new Class22(7, 0);

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!id;")
	public static final Class104 aClass104_3 = new Class104(2);

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method4384() {
		if (Static98.anInt1987 == 2) {
			Static70.anInt1503 = 96;
			return;
		}
		try {
			@Pc(26) Method local26 = Runtime.class.getMethod("maxMemory");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Long local36 = (Long) local26.invoke(local30, (Object[]) null);
					Static70.anInt1503 = (int) (local36 / 1048576L) + 1;
					return;
				} catch (@Pc(46) Throwable local46) {
					return;
				}
			}
		} catch (@Pc(48) Exception local48) {
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!pe;Z)Z")
	public static boolean method4385(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static417.aClass65Array4 == Static285.aClass65Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5346();
		if (arg0.aShort94 < 0 || arg0.aShort96 < 0 || arg0.aShort97 >= Static422.anInt6945 || arg0.aShort95 >= Static171.anInt3361) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort94; local34 <= arg0.aShort97; local34++) {
			for (local38 = arg0.aShort96; local38 <= arg0.aShort95; local38++) {
				@Pc(45) Class164 local45 = Static341.method5175(arg0.aByte82, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort94) {
						local49++;
					}
					if (local34 < arg0.aShort97) {
						local49 += 4;
					}
					if (local38 > arg0.aShort96) {
						local49 += 8;
					}
					if (local38 < arg0.aShort95) {
						local49 += 2;
					}
					@Pc(74) Class7 local74 = Static83.method1513(local49, arg0);
					@Pc(77) Class7 local77 = local45.aClass7_3;
					if (local77 == null) {
						local45.aClass7_3 = local74;
					} else {
						while (local77.aClass7_1 != null) {
							local77 = local77.aClass7_1;
						}
						local77.aClass7_1 = local74;
					}
					local45.aByte50 = (byte) (local45.aByte50 | local49);
					if (local6 && (Static447.anIntArrayArray64[local34][local38] & 0xFF000000) != 0) {
						local8 = Static447.anIntArrayArray64[local34][local38];
						local10 = Static346.aByteArrayArray26[local34][local38];
						local12 = Static341.aByteArrayArray29[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort94; local38 <= arg0.aShort97; local38++) {
				for (@Pc(150) int local150 = arg0.aShort96; local150 <= arg0.aShort95; local150++) {
					if ((Static447.anIntArrayArray64[local38][local150] & 0xFF000000) == 0) {
						Static447.anIntArrayArray64[local38][local150] = local8;
						Static346.aByteArrayArray26[local38][local150] = local10;
						Static341.aByteArrayArray29[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static427.aClass16_Sub1Array3[Static1.anInt6++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!l;I)V")
	public static void method4387(@OriginalArg(0) Class57[] arg0) {
		Static277.anInt5150 = arg0.length;
		Static278.anIntArray338 = new int[Static277.anInt5150 + 10];
		Static385.aClass57Array16 = new Class57[Static277.anInt5150 + 10];
		Static459.method3332(arg0, 0, Static385.aClass57Array16, 0, Static277.anInt5150);
		for (@Pc(26) int local26 = 0; local26 < Static277.anInt5150; local26++) {
			Static278.anIntArray338[local26] = Static385.aClass57Array16[local26].T();
		}
		for (@Pc(41) int local41 = Static277.anInt5150; local41 < Static385.aClass57Array16.length; local41++) {
			Static278.anIntArray338[local41] = 12;
		}
	}
}
