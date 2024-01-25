import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray10;

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "F")
	public static float aFloat245;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!mq;III)V")
	public static void method7669(@OriginalArg(0) Class12_Sub2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static598.method4260(local6, 0, local6.length, arg1);
		Static195.method3585(arg0, arg2, local6);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!gk;)Lclient!iaa;")
	public static Class153_Sub1 method7670(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(12) Class153 local12 = Static415.method1370(arg0);
		@Pc(16) int local16 = arg0.method4509();
		@Pc(20) int local20 = arg0.method4509();
		return new Class153_Sub1(local12.aClass322_13, local12.aClass347_13, local12.anInt9314, local12.anInt9315, local12.anInt9316, local12.anInt9312, local12.anInt9317, local12.anInt9313, local12.anInt9310, local16, local20);
	}
}
