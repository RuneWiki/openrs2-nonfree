import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!ss", name = "R", descriptor = "[I")
	public static int[] anIntArray436;

	@OriginalMember(owner = "client!ss", name = "N", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_182 = new Class119(50);

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!ss", name = "S", descriptor = "I")
	public static int anInt6002 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	public static int method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static126.anIntArrayArray82 == null ? 0 : Static126.anIntArrayArray82[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!on;)V")
	public static void method5236(@OriginalArg(1) Class146 arg0) {
		if (!Static262.aBoolean479) {
			return;
		}
		Static74.aClass2_Sub10_Sub1_2.method2049(168);
		Static74.aClass2_Sub10_Sub1_2.method4450(arg0.anInt4450);
		Static74.aClass2_Sub10_Sub1_2.method4410(arg0.anInt4493);
		Static74.aClass2_Sub10_Sub1_2.method4459(Static139.anInt2893);
		Static74.aClass2_Sub10_Sub1_2.method4459(arg0.anInt4478);
		Static74.aClass2_Sub10_Sub1_2.method4459(Static48.anInt1094);
		Static74.aClass2_Sub10_Sub1_2.method4411(Static7.anInt157);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Lclient!e;")
	public static Class47 method5237(@OriginalArg(1) int arg0) {
		@Pc(10) Class47 local10 = (Class47) Static256.aClass119_157.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static159.aClass191_100.method5459(0, arg0);
		local10 = new Class47();
		if (local25 != null) {
			local10.method1487(new Class2_Sub10(local25));
		}
		local10.method1494();
		Static256.aClass119_157.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZIIIZ)Lclient!tq;")
	public static Class191 method5239(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class71 local10 = null;
		if (Static167.aClass174_4 != null) {
			local10 = new Class71(arg1, Static167.aClass174_4, Static104.aClass174Array3[arg1], 1000000);
		}
		Static213.aClass121_Sub1Array1[arg1] = Static322.aClass153_1.method4137(Static154.aClass71_5, arg1, local10);
		if (arg2) {
			Static213.aClass121_Sub1Array1[arg1].method4871();
		}
		return new Class191(Static213.aClass121_Sub1Array1[arg1], arg0, 1);
	}
}
