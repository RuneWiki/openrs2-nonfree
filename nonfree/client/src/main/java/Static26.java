import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!ui;")
	public static Class175 aClass175_5 = new Class175(50);

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "Lclient!si;")
	public static Class157 aClass157_2 = null;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "[I")
	public static int[] anIntArray59 = new int[2];

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Loading...";

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lclient!si;II)V")
	public static void method495(@OriginalArg(0) Class157[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class157 local15 = arg0[local7];
			if (local15 != null) {
				if (local15.anInt4748 == 0) {
					if (local15.aClass157Array2 != null) {
						method495(local15.aClass157Array2, arg1);
					}
					@Pc(42) Class1_Sub20 local42 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local15.anInt4672);
					if (local42 != null) {
						Static262.method4043(arg1, local42.anInt3422);
					}
				}
				@Pc(59) Class1_Sub29 local59;
				if (arg1 == 0 && local15.anObjectArray22 != null) {
					local59 = new Class1_Sub29();
					local59.anObjectArray2 = local15.anObjectArray22;
					local59.aClass157_13 = local15;
					Static5.method104(local59);
				}
				if (arg1 == 1 && local15.anObjectArray28 != null) {
					if (local15.anInt4692 >= 0) {
						@Pc(90) Class157 local90 = Static206.method3444(local15.anInt4672);
						if (local90 == null || local90.aClass157Array2 == null || local90.aClass157Array2.length <= local15.anInt4692 || local90.aClass157Array2[local15.anInt4692] != local15) {
							continue;
						}
					}
					local59 = new Class1_Sub29();
					local59.anObjectArray2 = local15.anObjectArray28;
					local59.aClass157_13 = local15;
					Static5.method104(local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!nm;Lclient!nm;I)V")
	public static void method497(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1) {
		Static8.aClass119_1 = arg0;
		Static17.aClass119_4 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZII)V")
	public static void method500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static272.anInt5001 = Static249.anInt5571 + Static249.anInt5574 - arg1 - 1;
		Static55.anInt1176 = arg0 - Static249.anInt5573;
	}
}
