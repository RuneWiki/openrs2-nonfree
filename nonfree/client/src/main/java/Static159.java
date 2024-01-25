import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	public static int anInt3212;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIBIFII)[I")
	public static int[] method2631(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub2_Sub35 local10 = new Class2_Sub2_Sub35();
		local10.anInt9150 = 35;
		local10.aBoolean707 = true;
		local10.anInt9148 = 8;
		local10.anInt9151 = 4;
		local10.anInt9149 = (int) (arg0 * 4096.0F);
		local10.anInt9154 = 8;
		local10.method7948();
		Static226.method4128(1, 2048);
		local10.method7612(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method2632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub7 local7 = new Class6_Sub7();
		local7.anInt7981 = arg2 + Static412.anInt575;
		local7.anInt7982 = arg0;
		local7.anInt7985 = arg1;
		local7.anInt7986 = arg3;
		local7.aString84 = arg5;
		local7.anInt7984 = arg4;
		local7.anInt7987 = arg6;
		Static181.aClass109_5.method2313(local7);
	}
}
