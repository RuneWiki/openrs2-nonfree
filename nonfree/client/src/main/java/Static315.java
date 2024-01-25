import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array51;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt5769;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_89 = new Class183(44, 3);

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
	public static final int[] anIntArray506 = new int[500];

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt5768 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5100(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static140.anInt2999 > 0) {
			local18 = Static65.aByteArrayArray5[--Static140.anInt2999];
			Static65.aByteArrayArray5[Static140.anInt2999] = null;
			return local18;
		} else if (arg0 == 5000 && Static158.anInt3258 > 0) {
			local18 = Static89.aByteArrayArray6[--Static158.anInt3258];
			Static89.aByteArrayArray6[Static158.anInt3258] = null;
			return local18;
		} else if (arg0 == 30000 && Static364.anInt6701 > 0) {
			@Pc(74) byte[] local74 = Static13.aByteArrayArray1[--Static364.anInt6701];
			Static13.aByteArrayArray1[Static364.anInt6701] = null;
			return local74;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILclient!ab;)V")
	public static void method5101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3 arg2) {
		Static284.anInt5624 = arg1;
		Static352.anInt6483 = arg0;
		Static16.aClass3_2 = arg2;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static179.anInt3768 <= arg2 && arg2 <= Static121.anInt6758 && arg3 >= Static179.anInt3768 && Static121.anInt6758 >= arg3 && arg0 >= Static179.anInt3768 && arg0 <= Static121.anInt6758 && arg1 >= Static179.anInt3768 && Static121.anInt6758 >= arg1 && arg4 >= Static317.anInt5793 && arg4 <= Static69.anInt1551 && Static317.anInt5793 <= arg7 && Static69.anInt1551 >= arg7 && Static317.anInt5793 <= arg8 && arg8 <= Static69.anInt1551 && Static317.anInt5793 <= arg5 && Static69.anInt1551 >= arg5) {
			Static229.method4163(arg1, arg3, arg4, arg0, arg8, arg2, arg7, arg5, arg6);
		} else {
			Static207.method3779(arg5, arg3, arg2, arg6, arg7, arg1, arg4, arg8, arg0);
		}
	}
}
