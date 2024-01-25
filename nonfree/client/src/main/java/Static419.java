import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
	public static int anInt6404;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIZFIZ)[I")
	public static int[] method5189(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub4_Sub10 local10 = new Class4_Sub4_Sub10();
		local10.anInt2073 = 8;
		local10.anInt2077 = 8;
		local10.aBoolean144 = true;
		local10.anInt2083 = (int) (arg0 * 4096.0F);
		local10.anInt2084 = 4;
		local10.anInt2076 = 35;
		local10.method6038();
		Static409.method5559(1, 2048);
		local10.method1656(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)Lclient!mv;")
	public static Class176_Sub1 method5190() {
		Static412.anInt6968 = 0;
		return Static255.method3374();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZIZZ)V")
	public static void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static386.method5117(arg0, arg3, arg1, arg2, Static360.aClass176_Sub1Array2.length - 1, 0);
		Static147.aClass4_Sub16_1 = null;
		Static267.anInt4400 = 0;
	}
}
