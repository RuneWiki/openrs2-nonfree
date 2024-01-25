import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!oja", name = "s", descriptor = "Lclient!am;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!oja", name = "t", descriptor = "Lclient!jr;")
	public static Class5_Sub33 aClass5_Sub33_2;

	@OriginalMember(owner = "client!oja", name = "v", descriptor = "I")
	public static int anInt7472;

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_64 = new Class305(39, 18);

	@OriginalMember(owner = "client!oja", name = "l", descriptor = "[I")
	public static final int[] anIntArray427 = new int[6];

	@OriginalMember(owner = "client!oja", name = "o", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_65 = new Class305(84, 5);

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)V")
	public static void method6285() {
		if (!Static55.aBoolean60) {
			return;
		}
		@Pc(11) Class345 local11 = Static144.method2595(Static549.anInt9003, Static353.anInt6392);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class5_Sub22 local20 = new Class5_Sub22();
			local20.aClass345_1 = local11;
			local20.anObjectArray1 = local11.anObjectArray16;
			Static652.method8743(local20);
		}
		Static105.anInt2256 = -1;
		Static55.aBoolean60 = false;
		Static529.anInt9069 = -1;
		if (local11 != null) {
			Static211.method3351(local11);
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "()V")
	public static void method6286() {
		Static296.aClass270_3 = Static296.aClass270_2;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIBIIII)V")
	public static void method6287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static172.aClass5_Sub50_14.aClass12_Sub7_4.method2118() != 0 && arg5 != 0 && Static204.anInt3872 < 50 && arg0 != -1) {
			Static569.aClass351Array1[Static204.anInt3872++] = new Class351((byte) 1, arg0, arg5, arg3, arg2, arg4, arg1, (Class28_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBIII)V")
	public static void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(10, (long) arg0);
		local14.method7286();
		local14.anInt8546 = arg2;
		local14.anInt8549 = arg3;
		local14.anInt8545 = arg1;
	}
}
