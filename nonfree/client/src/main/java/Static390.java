import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	public static int anInt6994;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public static int anInt6995;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method6095(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class3_Sub27 local12 = Static59.method1040(Static325.aClass20_2, Static318.aClass314_91);
		local12.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg1) + 1);
		local12.aClass3_Sub9_Sub2_2.method5638(arg1);
		local12.aClass3_Sub9_Sub2_2.method5635(arg0);
		Static148.method2572(local12);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!uv;I)V")
	public static void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class344 arg2) {
		if (Static429.aClass344_9 != null || Static253.aBoolean362 || (arg2 == null || Static494.method7226(arg2) == null)) {
			return;
		}
		Static429.aClass344_9 = arg2;
		Static495.aClass344_11 = Static494.method7226(arg2);
		Static206.anInt3779 = 0;
		Static73.anInt1444 = arg1;
		Static597.aBoolean736 = false;
		Static114.anInt2516 = arg0;
	}
}
