import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array80;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!pk;")
	public static Class132 aClass132_64;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	public static int anInt3652;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	public static int anInt3648 = 0;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray56 = new String[8];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIILclient!hn;I)V")
	public static void method2846(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class76 arg3, @OriginalArg(5) int arg4) {
		if (Static156.anInt3156 >= 50 || (arg3 == null || arg3.anIntArrayArray12 == null || arg1 >= arg3.anIntArrayArray12.length || arg3.anIntArrayArray12[arg1] == null)) {
			return;
		}
		@Pc(35) int local35 = arg3.anIntArrayArray12[arg1][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(49) int local49 = local35 & 0x1F;
		@Pc(67) int local67;
		if (arg3.anIntArrayArray12[arg1].length > 1) {
			local67 = (int) (Math.random() * (double) arg3.anIntArrayArray12[arg1].length);
			if (local67 > 0) {
				local39 = arg3.anIntArrayArray12[arg1][local67];
			}
		}
		if (local49 == 0) {
			if (arg0) {
				Static140.method2221(local45, 0, 255, local39);
			}
		} else if (Static106.anInt2205 != 0) {
			local67 = (arg2 - 64) / 128;
			@Pc(109) int local109 = (arg4 - 64) / 128;
			Static113.anIntArray188[Static156.anInt3156] = local39;
			Static42.anIntArray64[Static156.anInt3156] = local45;
			Static157.anIntArray497[Static156.anInt3156] = 0;
			Static55.aClass104Array1[Static156.anInt3156] = null;
			Static52.anIntArray81[Static156.anInt3156] = 255;
			Static102.anIntArray151[Static156.anInt3156] = (local109 << 8) + (local67 << 16) + local49;
			Static156.anInt3156++;
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	public static void method2847() {
		@Pc(19) Container local19;
		if (Static58.aFrame2 != null) {
			local19 = Static58.aFrame2;
		} else if (Static209.aFrame3 == null) {
			local19 = Static199.aClass17_3.anApplet1;
		} else {
			local19 = Static209.aFrame3;
		}
		Static11.anInt2953 = local19.getSize().width;
		Static151.anInt4076 = local19.getSize().height;
		@Pc(41) Insets local41;
		if (Static209.aFrame3 == local19) {
			local41 = Static209.aFrame3.getInsets();
			Static151.anInt4076 -= local41.bottom + local41.top;
			Static11.anInt2953 -= local41.right + local41.left;
		}
		if (Static99.method1585() < 2) {
			Static41.anInt884 = 0;
			Static250.anInt4959 = 765;
			Static167.anInt3366 = (Static11.anInt2953 - 765) / 2;
			Static13.anInt356 = 503;
		} else {
			Static167.anInt3366 = 0;
			Static13.anInt356 = Static151.anInt4076;
			Static250.anInt4959 = Static11.anInt2953;
			Static41.anInt884 = 0;
		}
		if (Static116.aBoolean188) {
			Static116.method1898(Static250.anInt4959, Static13.anInt356);
		}
		Static39.aCanvas1.setSize(Static250.anInt4959, Static13.anInt356);
		if (local19 == Static209.aFrame3) {
			local41 = Static209.aFrame3.getInsets();
			Static39.aCanvas1.setLocation(Static167.anInt3366 + local41.left, local41.top + Static41.anInt884);
		} else {
			Static39.aCanvas1.setLocation(Static167.anInt3366, Static41.anInt884);
		}
		if (Static248.anInt4917 != -1) {
			Static269.method3756(true);
		}
		Static253.method3796();
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
	public static void method2848() {
		if (!Static215.aBoolean357) {
			return;
		}
		@Pc(13) Class159 local13 = Static260.method3916(Static132.anInt2621, Static106.anInt2200);
		if (local13 != null && local13.anObjectArray20 != null) {
			@Pc(24) Class8_Sub14 local24 = new Class8_Sub14();
			local24.anObjectArray1 = local13.anObjectArray20;
			local24.aClass159_10 = local13;
			Static173.method2688(local24);
		}
		Static9.anInt85 = -1;
		Static215.aBoolean357 = false;
		Static128.method2075(local13);
	}
}
