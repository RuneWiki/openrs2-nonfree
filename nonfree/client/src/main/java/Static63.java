import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "Lclient!gda;")
	public static Class126 aClass126_44;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
	public static int anInt1063 = 0;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method1074(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6835 == Static565.anInt8921 || arg0.anInt6872 == -1 || arg0.anInt6886 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class264 local30 = Static315.aClass14_1.method227(arg0.anInt6872);
			if (local30.aBoolean467 || local30.anIntArray425[arg0.anInt6839] < arg0.anInt6869 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(65) int local65 = arg0.anInt6835 - arg0.anInt6893;
			@Pc(71) int local71 = Static565.anInt8921 - arg0.anInt6893;
			@Pc(82) int local82 = arg0.anInt6887 * 512 + arg0.method5932() * 256;
			@Pc(93) int local93 = arg0.anInt6828 * 512 + arg0.method5932() * 256;
			@Pc(104) int local104 = arg0.anInt6861 * 512 + arg0.method5932() * 256;
			@Pc(115) int local115 = arg0.anInt6848 * 512 + arg0.method5932() * 256;
			arg0.anInt9803 = ((local65 - local71) * local93 + local115 * local71) / local65;
			arg0.anInt9805 = (local104 * local71 + local82 * (local65 - local71)) / local65;
		}
		arg0.anInt6896 = 0;
		if (arg0.anInt6875 == 0) {
			arg0.method5936(false, 8192);
		}
		if (arg0.anInt6875 == 1) {
			arg0.method5936(false, 12288);
		}
		if (arg0.anInt6875 == 2) {
			arg0.method5936(false, 0);
		}
		if (arg0.anInt6875 == 3) {
			arg0.method5936(false, 4096);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(II)I")
	public static int method1075(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
