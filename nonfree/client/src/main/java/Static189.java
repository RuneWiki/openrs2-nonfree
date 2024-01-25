import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!lt;I)V")
	public static void method2393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class216 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class2_Sub40 local18 = (Class2_Sub40) Static249.aClass70_26.method1264(); local18 != null; local18 = (Class2_Sub40) Static249.aClass70_26.method1261()) {
			if (arg1 == local18.anInt7186 && arg0 << 9 == local18.anInt7178 && arg3 << 9 == local18.anInt7184 && local18.aClass216_1.anInt5259 == arg2.anInt5259) {
				if (local18.aClass2_Sub3_Sub3_2 != null) {
					Static246.aClass2_Sub3_Sub4_2.method6705(local18.aClass2_Sub3_Sub3_2);
					local18.aClass2_Sub3_Sub3_2 = null;
				}
				if (local18.aClass2_Sub3_Sub3_3 != null) {
					Static246.aClass2_Sub3_Sub4_2.method6705(local18.aClass2_Sub3_Sub3_3);
					local18.aClass2_Sub3_Sub3_3 = null;
				}
				local18.method7657();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ps;Lclient!ps;Z)V")
	public static void method2394(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class273 arg1) {
		@Pc(19) Class2_Sub34 local19 = Static555.method7264(Static89.aClass154_17, Static551.aClass64_2);
		local19.aClass2_Sub7_Sub2_2.method4495(arg0.anInt6810);
		local19.aClass2_Sub7_Sub2_2.method4475(arg1.anInt6810);
		local19.aClass2_Sub7_Sub2_2.method4512(arg1.anInt6800);
		local19.aClass2_Sub7_Sub2_2.method4513(arg0.anInt6800);
		local19.aClass2_Sub7_Sub2_2.method4512(arg0.anInt6805);
		local19.aClass2_Sub7_Sub2_2.method4512(arg1.anInt6805);
		Static100.method1508(local19);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
	public static boolean method2395(@OriginalArg(1) int arg0) {
		return arg0 == 0;
	}
}
