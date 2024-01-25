import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lia", name = "y", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!lia", name = "A", descriptor = "Z")
	public static boolean aBoolean474;

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_172 = new Class87(10);

	@OriginalMember(owner = "client!lia", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_123 = new Class337(86, 1);

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Z")
	public static boolean method6058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static586.method8462(arg1, arg0) || Static62.method1043(arg0, arg1);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6060(@OriginalArg(1) Class133 arg0) {
		Static156.aClass214Array1 = new Class214[Static438.anIntArray599.length];
		for (@Pc(15) int local15 = 0; local15 < Static438.anIntArray599.length; local15++) {
			@Pc(21) int local21 = Static438.anIntArray599[local15];
			@Pc(26) Class272 local26 = Static531.method7862(Static227.aClass207_47, local21);
			@Pc(34) Class55 local34 = arg0.method7255(local26, Static649.method2902(Static33.aClass207_8, local21));
			Static156.aClass214Array1[local15] = new Class214(local34, local26);
		}
	}
}
