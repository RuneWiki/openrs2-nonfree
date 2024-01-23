import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cm", name = "ab", descriptor = "[I")
	public static int[] anIntArray56;

	@OriginalMember(owner = "client!cm", name = "sb", descriptor = "Lclient!jd;")
	public static Class84 aClass84_16;

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString45 = "wave2:";

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
	public static int anInt876 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method716(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg6 < 0 || arg1 >= 103 || arg6 >= 103) {
			return;
		}
		@Pc(34) int local34;
		if (arg3 == 0) {
			@Pc(24) Class168 local24 = Static227.method3799(arg5, arg1, arg6);
			if (local24 != null) {
				local34 = (int) (local24.aLong268 >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 2) {
					local24.aClass36_10 = new Class36_Sub4(local34, 2, arg4 + 4, arg5, arg1, arg6, arg0, false, local24.aClass36_10);
					local24.aClass36_9 = new Class36_Sub4(local34, 2, arg4 + 1 & 0x3, arg5, arg1, arg6, arg0, false, local24.aClass36_9);
				} else {
					local24.aClass36_10 = new Class36_Sub4(local34, arg2, arg4, arg5, arg1, arg6, arg0, false, local24.aClass36_10);
				}
			}
		}
		if (arg3 == 1) {
			@Pc(100) Class50 local100 = Static192.method3217(arg5, arg1, arg6);
			if (local100 != null) {
				local34 = Integer.MAX_VALUE & (int) (local100.aLong65 >>> 32);
				if (arg2 == 4 || arg2 == 5) {
					local100.aClass36_3 = new Class36_Sub4(local34, 4, arg4, arg5, arg1, arg6, arg0, false, local100.aClass36_3);
				} else if (arg2 == 6) {
					local100.aClass36_3 = new Class36_Sub4(local34, 4, arg4 + 4, arg5, arg1, arg6, arg0, false, local100.aClass36_3);
				} else if (arg2 == 7) {
					local100.aClass36_3 = new Class36_Sub4(local34, 4, (arg4 + 2 & 0x3) + 4, arg5, arg1, arg6, arg0, false, local100.aClass36_3);
				} else if (arg2 == 8) {
					local100.aClass36_3 = new Class36_Sub4(local34, 4, arg4 + 4, arg5, arg1, arg6, arg0, false, local100.aClass36_3);
					local100.aClass36_2 = new Class36_Sub4(local34, 4, (arg4 + 2 & 0x3) + 4, arg5, arg1, arg6, arg0, false, local100.aClass36_2);
				}
			}
		}
		if (arg3 == 2) {
			if (arg2 == 11) {
				arg2 = 10;
			}
			@Pc(241) Class34 local241 = Static143.method2546(arg5, arg1, arg6);
			if (local241 != null) {
				local241.aClass36_1 = new Class36_Sub4(Integer.MAX_VALUE & (int) (local241.aLong49 >>> 32), arg2, arg4, arg5, arg1, arg6, arg0, false, local241.aClass36_1);
			}
		}
		if (arg3 == 3) {
			@Pc(273) Class65 local273 = Static96.method1832(arg5, arg1, arg6);
			if (local273 != null) {
				local273.aClass36_5 = new Class36_Sub4(Integer.MAX_VALUE & (int) (local273.aLong104 >>> 32), 22, arg4, arg5, arg1, arg6, arg0, false, local273.aClass36_5);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZZBZI)Lclient!jd;")
	public static Class84 method718(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class35 local5 = null;
		if (Static243.aClass135_6 != null) {
			local5 = new Class35(arg3, Static243.aClass135_6, Static248.aClass135Array1[arg3], 1000000);
		}
		Static172.aClass63_Sub1Array2[arg3] = Static157.aClass91_1.method2262(Static73.aClass35_1, arg3, local5);
		if (arg1) {
			Static172.aClass63_Sub1Array2[arg3].method3810();
		}
		return new Class84(Static172.aClass63_Sub1Array2[arg3], arg0, arg2);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method721(@OriginalArg(0) int arg0) {
		Static191.aFloatArray3[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static191.aFloatArray3[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static191.aFloatArray3[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static16.method351(3);
		Static16.method351(4);
	}
}
