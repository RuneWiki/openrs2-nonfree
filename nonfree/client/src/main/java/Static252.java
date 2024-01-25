import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!an;")
	public static Class16 aClass16_68;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_76 = new Class45(112, 0);

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	public static int anInt5200 = -1;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg3 < 1 || Static37.anInt7512 - 2 < arg2 || arg3 > Static329.anInt6247 - 2) {
			return;
		}
		@Pc(27) int local27 = arg1;
		if (arg1 < 3 && Static112.method2322(arg3, arg2)) {
			local27 = arg1 + 1;
		}
		if (!Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867) && !Static87.method1914(arg2, Static415.anInt3783, arg3, local27)) {
			return;
		}
		if (Static120.aClass37ArrayArrayArray1 == null) {
			return;
		}
		Static113.aClass119_Sub1_1.method3344(arg3, Static243.aClass42_4, arg4, Static510.aClass184Array1[arg1], arg1, arg2);
		if (arg6 >= 0) {
			@Pc(70) boolean local70 = Static208.aClass12_Sub10_Sub1_1.aBoolean183;
			Static208.aClass12_Sub10_Sub1_1.aBoolean183 = true;
			Static113.aClass119_Sub1_1.method3342(Static243.aClass42_4, arg1, arg5, Static510.aClass184Array1[arg1], arg7, local27, arg2, arg6, arg3, arg0);
			Static208.aClass12_Sub10_Sub1_1.aBoolean183 = local70;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)I")
	public static int method4356(@OriginalArg(0) int arg0) {
		@Pc(14) Class12_Sub23 local14 = Static292.method4742(arg0, false);
		if (local14 == null) {
			return Static541.aClass223_1.method5415(arg0).anInt3221;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray333.length; local26++) {
			if (local14.anIntArray333[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static541.aClass223_1.method5415(arg0).anInt3221 - local14.anIntArray333.length;
	}
}
