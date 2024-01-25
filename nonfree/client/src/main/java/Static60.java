import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!pq;")
	public static Class251 aClass251_22;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!he;")
	public static Class6_Sub1_Sub9 aClass6_Sub1_Sub9_1;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public static int anInt971 = 100;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public static void method771() {
		Static491.anIntArray637 = Static302.method4231(0.4F);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lclient!xa;)V")
	public static void method775(@OriginalArg(1) Class4[] arg0) {
		Static165.anInt3019 = arg0.length;
		Static156.aClass4Array5 = new Class4[Static165.anInt3019 + 10];
		Static379.anIntArray553 = new int[Static165.anInt3019 + 10];
		Static585.method3081(arg0, 0, Static156.aClass4Array5, 0, Static165.anInt3019);
		for (@Pc(26) int local26 = 0; local26 < Static165.anInt3019; local26++) {
			Static379.anIntArray553[local26] = Static156.aClass4Array5[local26].a();
		}
		for (@Pc(50) int local50 = Static165.anInt3019; local50 < Static156.aClass4Array5.length; local50++) {
			Static379.anIntArray553[local50] = 12;
		}
	}
}
