import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "Lclient!rd;")
	public static Class311 aClass311_1;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
	public static int anInt3703 = 0;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIZ)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg2, 10);
		local16.method7441();
		local16.anInt8638 = arg0;
		local16.anInt8635 = arg3;
		local16.anInt8632 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)Lclient!nq;")
	public static Class5_Sub41 method3400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class5_Sub41 local5 = null;
		if (arg2 == 0) {
			local5 = Static647.method8905(Static84.aClass381_41, Static4.aClass389_17.aClass393_2);
		}
		if (arg2 == 1) {
			local5 = Static647.method8905(Static91.aClass381_171, Static4.aClass389_17.aClass393_2);
		}
		local5.aClass5_Sub36_Sub2_1.method7288(Static53.aClass297_1.method6737(82) ? 1 : 0);
		local5.aClass5_Sub36_Sub2_1.method7285(arg0 + Static290.anInt5128);
		local5.aClass5_Sub36_Sub2_1.method7286(Static315.anInt5380 + arg1);
		Static405.anInt10904 = arg0;
		Static286.aBoolean749 = false;
		Static19.anInt250 = arg1;
		Static102.method1577();
		return local5;
	}
}
