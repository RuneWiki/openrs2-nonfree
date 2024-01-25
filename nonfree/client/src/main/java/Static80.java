import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt1922;

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "Lclient!mo;")
	public static Class143 aClass143_48;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!la;")
	public static final Class124 aClass124_1 = new Class124();

	@OriginalMember(owner = "client!fa", name = "vb", descriptor = "[I")
	public static final int[] anIntArray177 = new int[13];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBIZ)Lclient!rb;")
	public static Class14_Sub27 method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class14_Sub27 local7 = new Class14_Sub27();
		local7.anInt5186 = arg1;
		local7.anInt5192 = arg0;
		Static198.aClass25_20.method687((long) arg2, local7);
		Static224.method4012(arg1);
		@Pc(31) Class146 local31 = Static273.method4632(arg2);
		if (local31 != null) {
			Static166.method3295(local31);
		}
		if (Static278.aClass146_51 != null) {
			Static166.method3295(Static278.aClass146_51);
			Static278.aClass146_51 = null;
		}
		Static355.method6007();
		if (local31 != null) {
			Static191.method3632(local31, !arg3);
		}
		if (!arg3) {
			Static10.method224(arg1);
		}
		if (!arg3 && Static324.anInt6226 != -1) {
			Static266.method4536(1, Static324.anInt6226);
		}
		return local7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)V")
	public static void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class14_Sub2_Sub13 local12 = Static1.method5711(15, 0);
		local12.method3540();
		local12.anInt3808 = arg0;
		local12.anInt3805 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method1966() {
		if (Static274.aClass97_1 == null) {
			return;
		}
		while (true) {
			while (Static182.anInt3784 < Static337.aClass6_Sub1Array1.length) {
				@Pc(25) Class6_Sub1 local25 = Static337.aClass6_Sub1Array1[Static182.anInt3784];
				if (local25 != null && local25.anInt4517 == -1) {
					if (Static174.aClass14_Sub30_1 == null) {
						Static174.aClass14_Sub30_1 = Static274.aClass97_1.method2760(local25.aString168);
					}
					@Pc(48) int local48 = Static174.aClass14_Sub30_1.anInt5459;
					if (local48 == -1) {
						return;
					}
					Static174.aClass14_Sub30_1 = null;
					local25.anInt4517 = local48;
					Static182.anInt3784++;
				} else {
					Static182.anInt3784++;
				}
			}
			return;
		}
	}
}
