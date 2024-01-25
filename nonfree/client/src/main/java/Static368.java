import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_165 = new Class81(25, 6);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(JI)V")
	public static void method5150(@OriginalArg(0) long arg0) {
		Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
		Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_7.anInt7355);
		Static98.aClass2_Sub20_Sub1_1.method3692(arg0);
		Static124.anInt2433 = 0;
		Static60.anInt1700 = -3;
		Static154.anInt2943 = 0;
		Static375.anInt6694 = 1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!hq;)I")
	public static int method5152(@OriginalArg(1) Class2_Sub20_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method2505(2);
		@Pc(30) int local30;
		if (local15 == 0) {
			local30 = 0;
		} else if (local15 == 1) {
			local30 = arg0.method2505(5);
		} else if (local15 == 2) {
			local30 = arg0.method2505(8);
		} else {
			local30 = arg0.method2505(11);
		}
		return local30;
	}
}
