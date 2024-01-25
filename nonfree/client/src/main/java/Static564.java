import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "[[[Lclient!qj;")
	public static Class311[][][] aClass311ArrayArrayArray1;

	@OriginalMember(owner = "client!rs", name = "V", descriptor = "[I")
	public static final int[] anIntArray640 = new int[4096];

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "Lclient!oh;")
	public static Class273 aClass273_16 = null;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method7846(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static11.method206(-1, arg0, -1, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method7851(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static458.method6647(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!bi;I)I")
	public static int method7853(@OriginalArg(0) Class4_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt839;
		@Pc(14) Class49 local14 = arg0.method2064(-97);
		@Pc(19) int local19 = arg0.aClass53_6.method4088();
		if (local19 == -1 || arg0.aBoolean248) {
			local8 = arg0.anInt812;
		} else if (local14.anInt1071 == local19 || local14.anInt1057 == local19 || local19 == local14.anInt1059 || local19 == local14.anInt1100) {
			local8 = arg0.anInt836;
		} else if (local14.anInt1055 == local19 || local14.anInt1097 == local19 || local14.anInt1062 == local19 || local14.anInt1069 == local19) {
			local8 = arg0.anInt852;
		}
		return local8;
	}
}
