import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt4673;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3456(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static159.anInt3526 >= 100) {
			Static116.method1877(Static29.aString48);
			return;
		}
		@Pc(20) String local20 = Static238.method3756(arg0);
		if (local20 == null) {
			return;
		}
		@Pc(26) int local26;
		@Pc(39) String local39;
		@Pc(69) String local69;
		for (local26 = 0; local26 < Static159.anInt3526; local26++) {
			local39 = Static238.method3756(Static64.aStringArray14[local26]);
			if (local39 != null && local39.equals(local20)) {
				Static116.method1877(arg0 + Static219.aString327);
				return;
			}
			if (Static60.aStringArray13[local26] != null) {
				local69 = Static238.method3756(Static60.aStringArray13[local26]);
				if (local69 != null && local69.equals(local20)) {
					Static116.method1877(arg0 + Static219.aString327);
					return;
				}
			}
		}
		for (local26 = 0; local26 < Static223.anInt4775; local26++) {
			local39 = Static238.method3756(Static280.aStringArray43[local26]);
			if (local39 != null && local39.equals(local20)) {
				Static116.method1877(Static259.aString373 + arg0 + Static72.aString97);
				return;
			}
			if (Static234.aStringArray39[local26] != null) {
				local69 = Static238.method3756(Static234.aStringArray39[local26]);
				if (local69 != null && local69.equals(local20)) {
					Static116.method1877(Static259.aString373 + arg0 + Static72.aString97);
					return;
				}
			}
		}
		if (Static238.method3756(Static56.aClass2_Sub4_Sub2_1.aString182).equals(local20)) {
			Static116.method1877(Static169.aString239);
		} else {
			Static2.aClass1_Sub14_Sub1_1.method2252(206);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0) + 1);
			Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
			Static2.aClass1_Sub14_Sub1_1.method2191(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLclient!th;Lclient!th;)V")
	public static void method3457(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static71.aClass168_55 = arg0;
		Static149.aClass168_113 = arg1;
		Static149.aClass168_113.method4068(36);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
	public static int method3458() {
		if (Static229.aFrame1 != null) {
			return 3;
		} else if (Static294.aBoolean367 && Static147.aBoolean214) {
			return 2;
		} else if (Static294.aBoolean367 && !Static147.aBoolean214) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public static void method3459() {
		Static290.method4444();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static82.aClass75Array1[local8].method1817();
		}
		System.gc();
	}
}
