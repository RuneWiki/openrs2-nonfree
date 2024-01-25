import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!mca;")
	public static Class230 aClass230_5;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray69;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8318(@OriginalArg(1) Class57 arg0) {
		if (Static519.aBoolean664) {
			Static71.method1141(arg0);
		} else {
			Static457.method6724(arg0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method8319() {
		if (Static123.aClass366_1 == null) {
			return;
		}
		if (Static123.aClass366_1.anInt10206 == 1) {
			Static123.aClass366_1 = null;
			return;
		}
		if (Static123.aClass366_1.anInt10206 == 2) {
			Static76.method1197(Static677.aClass230_6, 2, Static208.aString118);
			Static123.aClass366_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)V")
	public static void method8320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == Static417.anInt7207 && arg1 == Static314.anInt5581 && arg0 == Static522.anInt8830) {
			return;
		}
		Static417.anInt7207 = arg2;
		Static554.aBoolean714 = true;
		Static522.anInt8830 = arg0;
		Static314.anInt5581 = arg1;
		@Pc(40) double local40 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(50) double local50 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = Math.cos(local50);
		@Pc(56) double local56 = Math.sin(local50);
		@Pc(59) double local59 = Math.cos(local40);
		@Pc(62) double local62 = Math.sin(local40);
		Static620.aDouble23 = local62 * local56;
		Static269.aDouble10 = local62;
		Static551.aDouble18 = local56;
		Static396.aDouble14 = local59;
		Static612.aDouble21 = local59 * local53;
		Static543.aDouble17 = 0.0D;
		Static618.aDouble22 = local59 * -local56;
		Static674.aDouble24 = local62 * -local53;
		Static519.aDouble16 = local53;
	}
}
