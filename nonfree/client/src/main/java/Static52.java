import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt1347;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!pd;")
	public static Class20 aClass20_31;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	public static int anInt1358;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!s;")
	public static Class4_Sub16 aClass4_Sub16_3;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_763 = Static28.method504("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_764 = null;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!c;")
	public static Class12 aClass12_36 = new Class12(30);

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array11 = new Class39[500];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
	public static void method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class4_Sub7 local6 = (Class4_Sub7) Static112.aClass61_12.method1628(); local6 != null; local6 = (Class4_Sub7) Static112.aClass61_12.method1629()) {
			if (local6.anInt1493 != -1 || local6.anIntArray149 != null) {
				@Pc(23) int local23 = 0;
				if (local6.anInt1503 < arg3) {
					local23 = arg3 - local6.anInt1503;
				} else if (arg3 < local6.anInt1494) {
					local23 = local6.anInt1494 - arg3;
				}
				if (local6.anInt1505 < arg2) {
					local23 += arg2 - local6.anInt1505;
				} else if (local6.anInt1499 > arg2) {
					local23 += local6.anInt1499 - arg2;
				}
				if (local6.anInt1501 < local23 - 64 || Static72.anInt794 == 0 || arg0 != local6.anInt1506) {
					if (local6.aClass4_Sub1_Sub4_2 != null) {
						Static85.aClass4_Sub1_Sub2_2.method363(local6.aClass4_Sub1_Sub4_2);
						local6.aClass4_Sub1_Sub4_2 = null;
					}
					if (local6.aClass4_Sub1_Sub4_1 != null) {
						Static85.aClass4_Sub1_Sub2_2.method363(local6.aClass4_Sub1_Sub4_1);
						local6.aClass4_Sub1_Sub4_1 = null;
					}
				} else {
					local23 -= 64;
					if (local23 < 0) {
						local23 = 0;
					}
					@Pc(134) int local134 = Static72.anInt794 * (local6.anInt1501 - local23) / local6.anInt1501;
					if (local6.aClass4_Sub1_Sub4_2 != null) {
						local6.aClass4_Sub1_Sub4_2.method1564(local134);
					} else if (local6.anInt1493 >= 0) {
						@Pc(149) Class62 local149 = Static136.method1653(Static75.aClass20_Sub1_13, local6.anInt1493, 0);
						if (local149 != null) {
							@Pc(156) Class4_Sub6_Sub1 local156 = local149.method1651().method1145(Static83.aClass52_1);
							@Pc(161) Class4_Sub1_Sub4 local161 = Static135.method1556(local156, local134);
							local161.method1558(-1);
							Static85.aClass4_Sub1_Sub2_2.method360(local161);
							local6.aClass4_Sub1_Sub4_2 = local161;
						}
					}
					if (local6.aClass4_Sub1_Sub4_1 != null) {
						local6.aClass4_Sub1_Sub4_1.method1564(local134);
						if (!local6.aClass4_Sub1_Sub4_1.method2193()) {
							local6.aClass4_Sub1_Sub4_1 = null;
						}
					} else if (local6.anIntArray149 != null && (local6.anInt1498 -= arg1) <= 0) {
						@Pc(198) int local198 = (int) (Math.random() * (double) local6.anIntArray149.length);
						@Pc(206) Class62 local206 = Static136.method1653(Static75.aClass20_Sub1_13, local6.anIntArray149[local198], 0);
						if (local206 != null) {
							@Pc(213) Class4_Sub6_Sub1 local213 = local206.method1651().method1145(Static83.aClass52_1);
							@Pc(218) Class4_Sub1_Sub4 local218 = Static135.method1556(local213, local134);
							local218.method1558(0);
							Static85.aClass4_Sub1_Sub2_2.method360(local218);
							local6.aClass4_Sub1_Sub4_1 = local218;
							local6.anInt1498 = (int) (Math.random() * (double) (local6.anInt1507 - local6.anInt1495)) + local6.anInt1495;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method888() {
		aClass12_36 = null;
		aClass20_31 = null;
		aClass39Array11 = null;
		aClass39_763 = null;
		aClass4_Sub16_3 = null;
		aClass39_764 = null;
	}
}
