import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!tg;")
	public static Class170 aClass170_8 = new Class170();

	@OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
	public static int anInt3930 = 0;

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString219 = "wave2:";

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
	public static int anInt3932 = 50;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "[I")
	public static int[] anIntArray315 = new int[1000];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIII)V")
	public static void method3290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) Class134[] local12 = Static290.aClass134Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) Class134 local26 = local12[local14];
			if (local26 != null && local26.anInt4007 == 2) {
				Static312.method4784(arg0, arg2 >> 1, arg5, local26.anInt4019 * 2, local26.anInt4008 + (local26.anInt4006 - Static192.anInt3637 << 7), arg1 >> 1, local26.anInt4005 + (local26.anInt4012 - Static199.anInt3817 << 7));
				if (Static214.anInt4004 > -1 && Static313.anInt2966 % 20 < 10) {
					Static311.aClass1_Sub2_Sub1Array10[local26.anInt4018].method3839(arg4 + Static214.anInt4004 - 12, arg3 + -28 + Static23.anInt402);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	public static void method3291() {
		Static224.anInt4118 = 0;
		Static256.anInt4632 = 0;
		Static308.method4671();
		Static220.method3443();
		Static11.method160();
		Static174.method2940();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static256.anInt4632; local19++) {
			@Pc(30) int local30 = anIntArray315[local19];
			if (Static17.aClass15_Sub5_Sub2Array1[local30].anInt5563 != Static313.anInt2966) {
				if (Static17.aClass15_Sub5_Sub2Array1[local30].anInt5607 > 0) {
					Static297.method4532(Static17.aClass15_Sub5_Sub2Array1[local30]);
				}
				Static17.aClass15_Sub5_Sub2Array1[local30] = null;
			}
		}
		if (Static13.aClass1_Sub14_Sub1_1.anInt1480 != Static88.anInt1723) {
			throw new RuntimeException("gpp1 pos:" + Static13.aClass1_Sub14_Sub1_1.anInt1480 + " psize:" + Static88.anInt1723);
		}
		for (local19 = 0; local19 < Static304.anInt5394; local19++) {
			if (Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static304.anInt5394);
			}
		}
	}
}
