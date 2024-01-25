import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt6315;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[Lclient!b;")
	public static final Class2_Sub5[] aClass2_Sub5Array1 = new Class2_Sub5[1024];

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt6320 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!caa;Z)V")
	public static void method5275(@OriginalArg(0) Class12_Sub2 arg0) {
		if (Static492.aBoolean660) {
			Static228.aClass318Array1[Static228.aClass318Array1.length - 1].method6445(arg0);
		} else {
			Static390.method5390(arg0, Static555.aClass2_Sub11Array6);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILclient!kga;)V")
	public static void method5276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub2 arg3) {
		@Pc(4) Class228 local4 = Static199.method2502(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub2_1 = arg3;
		@Pc(16) int local16 = Static114.aClass151Array1 == Static320.aClass151Array3 ? 1 : 0;
		if (arg3.method7513()) {
			if (arg3.method7503()) {
				Static310.aClass12_Sub2ArrayArray2[local16][Static503.anIntArray540[local16]++] = arg3;
				return;
			}
			Static146.aClass12_Sub2ArrayArray1[local16][Static313.anIntArray359[local16]++] = arg3;
			return;
		}
		Static585.aClass12_Sub2ArrayArray3[local16][Static535.anIntArray577[local16]++] = arg3;
	}
}
