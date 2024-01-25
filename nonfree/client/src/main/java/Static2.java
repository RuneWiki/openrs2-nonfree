import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt58;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] anIntArray7 = new int[64];

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!dn;I)V")
	public static void method61(@OriginalArg(0) Class56 arg0) {
		Static118.anInt2604 = 0;
		Static124.anInt2682 = 0;
		Static182.aClass40_3 = new Class40();
		Static263.aClass13_Sub3_Sub1_Sub1Array1 = new Class13_Sub3_Sub1_Sub1[1024];
		Static374.method5176(arg0);
		Static132.method2288(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!gf;B)I")
	public static int method64(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		if (arg0.anInt6100 == 0) {
			return 0;
		}
		@Pc(50) int local50;
		@Pc(57) int local57;
		if (arg0.anInt6102 != -1) {
			@Pc(20) Class1_Sub3_Sub3 local20 = null;
			if (arg0.anInt6102 < 32768) {
				local20 = Static451.aClass1_Sub3_Sub3_Sub2Array1[arg0.anInt6102];
			} else if (arg0.anInt6102 >= 32768) {
				local20 = Static308.aClass1_Sub3_Sub3_Sub1Array1[arg0.anInt6102 - 32768];
			}
			if (local20 != null) {
				local50 = arg0.anInt6053 - local20.anInt6053;
				local57 = arg0.anInt6055 - local20.anInt6055;
				if (local50 != 0 || local57 != 0) {
					arg0.method4830((int) (Math.atan2((double) local50, (double) local57) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub3_Sub3_Sub1) {
			@Pc(143) Class1_Sub3_Sub3_Sub1 local143 = (Class1_Sub3_Sub3_Sub1) arg0;
			if (local143.anInt4909 != -1 && (local143.anInt6133 == 0 || local143.anInt6134 > 0)) {
				local143.method4830(local143.anInt4909);
				local143.anInt4909 = -1;
			}
		} else if (arg0 instanceof Class1_Sub3_Sub3_Sub2) {
			@Pc(83) Class1_Sub3_Sub3_Sub2 local83 = (Class1_Sub3_Sub3_Sub2) arg0;
			if (local83.anInt6147 != -1 && (local83.anInt6133 == 0 || local83.anInt6134 > 0)) {
				local50 = local83.anInt6053 - (local83.anInt6147 - Static108.anInt3458 - Static108.anInt3458) * 64;
				local57 = local83.anInt6055 - (local83.anInt6152 - Static339.anInt6223 - Static339.anInt6223) * 64;
				if (local50 != 0 || local57 != 0) {
					local83.method4830((int) (Math.atan2((double) local50, (double) local57) * 2607.5945876176133D) & 0x3FFF);
				}
				local83.anInt6147 = -1;
			}
		}
		return arg0.method4848();
	}
}
