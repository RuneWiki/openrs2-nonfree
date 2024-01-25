import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public static int anInt5235;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZIII)I")
	public static int method4429(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub21 local8 = Static238.method4329(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray247.length > arg1) {
			return local8.anIntArray247[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	public static void method4430(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub9_Sub4 local11 = Static98.method1971(3, arg0);
		local11.method1799();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!je;)I")
	public static int method4431(@OriginalArg(1) Class1_Sub2_Sub3_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt3383;
		@Pc(20) Class142 local20 = arg0.method5778();
		if (arg0.aBoolean613) {
			local16 = arg0.anInt3418;
		} else if (local20.anInt4869 == arg0.anInt6901 || arg0.anInt6901 == local20.anInt4870 || arg0.anInt6901 == local20.anInt4881 || local20.anInt4873 == arg0.anInt6901) {
			local16 = arg0.anInt3410;
		} else if (local20.anInt4879 == arg0.anInt6901 || local20.anInt4895 == arg0.anInt6901 || local20.anInt4893 == arg0.anInt6901 || arg0.anInt6901 == local20.anInt4866) {
			local16 = arg0.anInt3384;
		}
		return local16;
	}
}
