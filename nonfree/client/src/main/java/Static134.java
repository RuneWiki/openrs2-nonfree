import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII)V")
	public static void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class12_Sub4_Sub1 local10 = Static389.method6156(10, arg3);
		local10.method820();
		local10.anInt808 = arg1;
		local10.anInt806 = arg0;
		local10.anInt803 = arg2;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII)V")
	public static void method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static334.anInt6399 = arg3;
		Static516.anInt9255 = arg1;
		Static290.anInt5629 = arg5;
		Static350.anInt6551 = arg4;
		Static188.anInt4277 = arg2;
		Static516.anInt9258 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
	public static void method2773() {
		Static347.method5472(Static208.aClass12_Sub10_Sub1_1.aBoolean181);
		Static259.aClass12_Sub13_Sub2_1 = new Class12_Sub13_Sub2();
		Static259.aClass12_Sub13_Sub2_1.method4276();
		Static152.aClass69_1 = Static410.method6418(Static375.aClass71_3, 0, 22050, Static301.aCanvas11);
		Static152.aClass69_1.method6848(Static259.aClass12_Sub13_Sub2_1);
		Static282.method4651(Static25.aClass16_5, Static482.aClass16_112, Static259.aClass12_Sub13_Sub2_1, Static85.aClass16_17);
		Static349.aClass69_2 = Static410.method6418(Static375.aClass71_3, 1, 2048, Static301.aCanvas11);
		Static328.aClass12_Sub13_Sub1_1 = new Class12_Sub13_Sub1();
		Static349.aClass69_2.method6848(Static328.aClass12_Sub13_Sub1_1);
		Static130.aClass144_1 = new Class144(22050, Static426.anInt6103);
		Static140.anInt3127 = Static250.aClass16_67.method420("scape main");
	}
}
