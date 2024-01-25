import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "Lclient!hr;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "[[Lclient!ts;")
	public static Class239[][] aClass239ArrayArray1;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "Lclient!he;")
	public static Class100 aClass100_7;

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "[I")
	public static final int[] anIntArray64 = new int[13];

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B[Lclient!qg;)V")
	public static void method859(@OriginalArg(1) Class87[] arg0) {
		Static20.anInt656 = arg0.length;
		Static58.aClass87Array8 = new Class87[Static20.anInt656 + 10];
		Static108.anIntArray138 = new int[Static20.anInt656 + 10];
		Static459.method6342(arg0, 0, Static58.aClass87Array8, 0, Static20.anInt656);
		for (@Pc(26) int local26 = 0; local26 < Static20.anInt656; local26++) {
			Static108.anIntArray138[local26] = Static58.aClass87Array8[local26].method6561();
		}
		for (@Pc(41) int local41 = Static20.anInt656; local41 < Static58.aClass87Array8.length; local41++) {
			Static108.anIntArray138[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)V")
	public static void method860(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static409.aClass101ArrayArrayArray3 = Static147.aClass101ArrayArrayArray1;
			Static55.aClass86Array1 = Static288.aClass86Array3;
		} else {
			Static409.aClass101ArrayArrayArray3 = Static223.aClass101ArrayArrayArray2;
			Static55.aClass86Array1 = Static87.aClass86Array2;
		}
		Static295.anInt5507 = Static409.aClass101ArrayArrayArray3.length;
	}
}
