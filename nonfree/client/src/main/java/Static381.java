import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public static int anInt6946;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!pe;")
	public static Class232 aClass232_6;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method5836(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static404.method6682(arg5, arg3, arg2, arg1, 0, arg0, arg4);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZLclient!na;IIBI)V")
	public static void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static482.anInt7992 >= 50 || (arg2 == null || arg2.anIntArrayArray74 == null || arg3 >= arg2.anIntArrayArray74.length || arg2.anIntArrayArray74[arg3] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray74[arg3][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg2.anIntArrayArray74[arg3].length > 1) {
			local67 = (int) (Math.random() * (double) arg2.anIntArrayArray74[arg3].length);
			if (local67 > 0) {
				local40 = arg2.anIntArrayArray74[arg3][local67];
			}
		}
		if (local50 == 0) {
			if (arg1) {
				Static161.method2496(local46, 255, 0, local40);
			}
		} else if (Static544.aClass1_Sub22_Sub1_1.anInt5431 != 0) {
			local67 = arg5 - 256 >> 9;
			@Pc(106) int local106 = arg0 - 256 >> 9;
			Static527.aClass35Array1[Static482.anInt7992++] = new Class35((byte) 1, local40, local46, 0, 255, local50 + (local106 << 8) + (arg4 << 24) + (local67 << 16));
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dg;B)V")
	public static void method5840(@OriginalArg(0) Class49_Sub2_Sub2_Sub1 arg0) {
		@Pc(11) Class1_Sub10 local11 = (Class1_Sub10) Static403.aClass17_31.method738((long) arg0.anInt4295);
		if (local11 == null) {
			return;
		}
		if (local11.aClass1_Sub16_Sub2_2 != null) {
			Static411.aClass1_Sub16_Sub1_2.method2231(local11.aClass1_Sub16_Sub2_2);
			local11.aClass1_Sub16_Sub2_2 = null;
		}
		local11.method7525();
	}
}
