import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public static int anInt7296;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public static int anInt7297;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!il;")
	public static final Class162 aClass162_31 = new Class162(16);

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_213 = new Class363(4, 2);

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
	public static final int[] anIntArray497 = new int[3];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!kp;)V")
	public static void method6116(@OriginalArg(1) Class196 arg0) {
		@Pc(12) Class196 local12 = Static29.method541(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local12 == null) {
			local17 = Static140.anInt2937;
			local20 = Static120.anInt2371;
		} else {
			local17 = local12.anInt5130;
			local20 = local12.anInt5078;
		}
		Static215.method3470(local20, arg0, false, local17);
		Static333.method5102(local20, local17, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!kp;I)V")
	public static void method6118(@OriginalArg(0) Class196 arg0) {
		if (!Static25.aBoolean32) {
			return;
		}
		if (arg0.anObjectArray15 != null) {
			@Pc(14) Class196 local14 = Static217.method3485(Static514.anInt406, Static428.anInt7337);
			if (local14 != null) {
				@Pc(20) Class2_Sub31 local20 = new Class2_Sub31();
				local20.anObjectArray32 = arg0.anObjectArray15;
				local20.aClass196_5 = local14;
				local20.aClass196_4 = arg0;
				Static552.method7490(local20);
			}
		}
		@Pc(46) Class2_Sub42 local46 = Static249.method3910(Static72.aClass286_27, Static400.aClass145_2);
		local46.aClass2_Sub15_Sub2_2.method4288(arg0.anInt5112);
		local46.aClass2_Sub15_Sub2_2.method4330(arg0.anInt5154);
		local46.aClass2_Sub15_Sub2_2.method4350(Static428.anInt7337);
		local46.aClass2_Sub15_Sub2_2.method4330(Static510.anInt8520);
		local46.aClass2_Sub15_Sub2_2.method4296(Static514.anInt406);
		local46.aClass2_Sub15_Sub2_2.method4329(arg0.anInt5152);
		Static531.method7296(local46);
	}
}
