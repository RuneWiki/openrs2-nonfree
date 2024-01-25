import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_85 = new Class179(32, 4);

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_86 = new Class179(82, 12);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static28.anInt644 <= arg7 && arg7 <= Static125.anInt2545 && Static28.anInt644 <= arg2 && Static125.anInt2545 >= arg2 && arg4 >= Static28.anInt644 && Static125.anInt2545 >= arg4 && arg8 >= Static28.anInt644 && arg8 <= Static125.anInt2545 && Static108.anInt2276 <= arg0 && Static173.anInt3208 >= arg0 && Static108.anInt2276 <= arg6 && arg6 <= Static173.anInt3208 && arg5 >= Static108.anInt2276 && Static173.anInt3208 >= arg5 && arg1 >= Static108.anInt2276 && arg1 <= Static173.anInt3208) {
			Static20.method4151(arg3, arg6, arg2, arg0, arg7, arg1, arg4, arg8, arg5);
		} else {
			Static172.method2760(arg7, arg0, arg2, arg1, arg4, arg3, arg5, arg8, arg6);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)V")
	public static void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static371.method5808(6, arg0);
		local16.method1778();
		local16.anInt2056 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method5426(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static56.anInt1292 > 0) {
			local18 = Static15.aByteArrayArray1[--Static56.anInt1292];
			Static15.aByteArrayArray1[Static56.anInt1292] = null;
			return local18;
		} else if (arg0 == 5000 && Static292.anInt5122 > 0) {
			local18 = Static90.aByteArrayArray4[--Static292.anInt5122];
			Static90.aByteArrayArray4[Static292.anInt5122] = null;
			return local18;
		} else if (arg0 == 30000 && Static316.anInt5435 > 0) {
			local18 = Static255.aByteArrayArray14[--Static316.anInt5435];
			Static255.aByteArrayArray14[Static316.anInt5435] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
