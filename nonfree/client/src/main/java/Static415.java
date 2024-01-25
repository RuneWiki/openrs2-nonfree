import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!paa", name = "T", descriptor = "Lclient!uga;")
	public static Class340 aClass340_1;

	@OriginalMember(owner = "client!paa", name = "tb", descriptor = "I")
	public static int anInt7825;

	@OriginalMember(owner = "client!paa", name = "Sb", descriptor = "Z")
	public static boolean aBoolean563;

	@OriginalMember(owner = "client!paa", name = "Jb", descriptor = "Ljava/lang/String;")
	public static String aString88 = "";

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)V")
	public static void method6709(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub6_Sub6 local16 = Static139.method3119(arg0, 5);
		local16.method3093();
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(BI)V")
	public static void method6711(@OriginalArg(1) int arg0) {
		Static248.anInt5350 = -1;
		Static535.anInt9666 = -1;
		Static491.anInt9082 = arg0;
		Static245.method4529();
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(BI)V")
	public static void method6712(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static224.aClass99_38.method3056((long) arg0);
		if (local10 != null) {
			local10.aClass165_Sub1_1.method7051();
			Static637.method9202(local10.aBoolean389, local10.anInt5281);
			local10.method9253();
		}
	}
}
