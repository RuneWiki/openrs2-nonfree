import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_143 = new Class359(42, 3);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
	public static void method5805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 * Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118() >> 8;
		if (local8 == 0 || arg1 == -1) {
			return;
		}
		if (!Static569.aBoolean788 && Static33.anInt545 != -1 && Static101.method1980() && !Static459.method6574()) {
			Static34.aClass5_Sub17_Sub1_1 = Static521.method7386();
			@Pc(51) Class5_Sub17_Sub1 local51 = Static326.method5068(Static34.aClass5_Sub17_Sub1_1);
			Static261.method4087(local51);
		}
		Static127.method2322(Static233.aClass390_54, local8, arg1);
		Static239.method3757(-1, 255);
		Static569.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method5806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static276.method8471(arg1, arg3, arg2)) {
			return false;
		}
		@Pc(17) int local17 = Static653.anIntArray599[2];
		@Pc(21) int local21 = Static653.anIntArray599[0];
		@Pc(25) int local25 = Static653.anIntArray599[1];
		if (!Static276.method8471(arg8, arg7, arg0)) {
			return false;
		}
		@Pc(37) int local37 = Static653.anIntArray599[2];
		@Pc(49) int local49 = Static653.anIntArray599[1];
		@Pc(53) int local53 = Static653.anIntArray599[0];
		if (Static276.method8471(arg6, arg4, arg5)) {
			@Pc(65) int local65 = Static653.anIntArray599[1];
			@Pc(69) int local69 = Static653.anIntArray599[0];
			@Pc(73) int local73 = Static653.anIntArray599[2];
			return Static619.method8410(local49, local37, local53, local25, local69, local73, local21, local65, local17);
		} else {
			return false;
		}
	}
}
