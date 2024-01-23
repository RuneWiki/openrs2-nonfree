import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Lclient!ak;")
	public static Class7 aClass7_138;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!kh;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_3;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt3103 = -1;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString106 = "Loading title screen - ";

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	public static void method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 * arg4;
		@Pc(15) int local15 = arg3 * arg3;
		@Pc(19) int local19 = local15 << 1;
		@Pc(21) int local21 = arg3;
		@Pc(25) int local25 = local11 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(37) int local37 = local15 - (local29 - 1) * local25;
		@Pc(45) int local45 = local11 * (1 - local29) + local19;
		@Pc(49) int local49 = local11 << 2;
		@Pc(53) int local53 = local15 << 2;
		@Pc(61) int local61 = local25 * ((arg3 << 1) - 3);
		@Pc(69) int local69 = local19 * 3;
		@Pc(92) int local92;
		@Pc(103) int local103;
		if (arg2 >= Static24.anInt556 && Static284.anInt5643 >= arg2) {
			local92 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1 + arg4);
			local103 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1 - arg4);
			Static288.method4405(arg0, local92, local103, Static151.anIntArrayArray26[arg2]);
		}
		@Pc(117) int local117 = local53;
		@Pc(123) int local123 = local49 * (arg3 - 1);
		while (local21 > 0) {
			local21--;
			if (local45 < 0) {
				while (local45 < 0) {
					local7++;
					local37 += local117;
					local117 += local53;
					local45 += local69;
					local69 += local53;
				}
			}
			local92 = arg2 - local21;
			if (local37 < 0) {
				local7++;
				local45 += local69;
				local37 += local117;
				local69 += local53;
				local117 += local53;
			}
			local103 = local21 + arg2;
			local45 += -local123;
			local37 += -local61;
			if (Static24.anInt556 <= local103 && Static284.anInt5643 >= local92) {
				@Pc(213) int local213 = Static45.method818(Static28.anInt606, Static245.anInt1237, local7 + arg1);
				@Pc(222) int local222 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1 - local7);
				if (Static24.anInt556 <= local92) {
					Static288.method4405(arg0, local213, local222, Static151.anIntArrayArray26[local92]);
				}
				if (Static284.anInt5643 >= local103) {
					Static288.method4405(arg0, local213, local222, Static151.anIntArrayArray26[local103]);
				}
			}
			local61 -= local49;
			local123 -= local49;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public static void method2559() {
		Static42.method757();
		Static267.anInterface1Array1 = new Interface1[9];
		Static267.anInterface1Array1[1] = new Class172();
		Static267.anInterface1Array1[2] = new Class94();
		Static267.anInterface1Array1[3] = new Class111();
		Static267.anInterface1Array1[4] = new Class49();
		Static267.anInterface1Array1[5] = new Class43();
		Static267.anInterface1Array1[6] = new Class46();
		Static267.anInterface1Array1[7] = new Class9();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public static int method2560(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
