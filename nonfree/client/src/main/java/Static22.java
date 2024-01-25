import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!ji;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "[I")
	public static int[] anIntArray217 = new int[1];

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method2353(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BI)Lclient!tg;")
	public static Class3_Sub11_Sub16 method2354(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class3_Sub11_Sub16 local9 = new Class3_Sub11_Sub16();
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		local14.anInt9765 = local14.aByteArray106.length - 2;
		@Pc(25) int local25 = local14.method8593();
		@Pc(36) int local36 = local14.aByteArray106.length - local25 - 16 - 2;
		local14.anInt9765 = local36;
		@Pc(43) int local43 = local14.method8618();
		local9.anInt9265 = local14.method8593();
		local9.anInt9266 = local14.method8593();
		local9.anInt9262 = local14.method8593();
		local9.anInt9260 = local14.method8593();
		local9.anInt9263 = local14.method8593();
		local9.anInt9264 = local14.method8593();
		@Pc(77) int local77 = local14.method8632();
		@Pc(88) int local88;
		@Pc(94) int local94;
		if (local77 > 0) {
			local9.aClass83Array1 = new Class83[local77];
			for (local88 = 0; local88 < local77; local88++) {
				local94 = local14.method8593();
				@Pc(101) Class83 local101 = new Class83(Static282.method4521(local94));
				local9.aClass83Array1[local88] = local101;
				while (local94-- > 0) {
					@Pc(112) int local112 = local14.method8618();
					@Pc(116) int local116 = local14.method8618();
					local101.method2377((long) local112, new Class3_Sub33(local116));
				}
			}
		}
		local14.anInt9765 = 0;
		local9.aString110 = local14.method8617();
		local9.anIntArray801 = new int[local43];
		local88 = 0;
		while (local36 > local14.anInt9765) {
			local94 = local14.method8593();
			if (local94 == 3) {
				if (local9.aStringArray27 == null) {
					local9.aStringArray27 = new String[local43];
				}
				local9.aStringArray27[local88] = local14.method8613().intern();
			} else if (local94 == 54) {
				if (local9.aLongArray25 == null) {
					local9.aLongArray25 = new long[local43];
				}
				local9.aLongArray25[local88] = local14.method8600();
			} else {
				if (local9.anIntArray802 == null) {
					local9.anIntArray802 = new int[local43];
				}
				if (local94 >= 150 || local94 == 21 || local94 == 38 || local94 == 39) {
					local9.anIntArray802[local88] = local14.method8632();
				} else {
					local9.anIntArray802[local88] = local14.method8618();
				}
			}
			local9.anIntArray801[local88++] = local94;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIILclient!cf;Lclient!ur;Z)V")
	public static void method2356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class56 arg9, @OriginalArg(10) Class356 arg10) {
		Static366.anInt5928 = arg5;
		Static479.anInt7949 = arg7;
		Static353.anInt5743 = arg0;
		Static648.anInt10269 = arg1;
		Static254.anInt4541 = arg4;
		Static411.aClass97_2 = null;
		Static579.anInt9323 = arg8;
		Static365.anInt5854 = arg6;
		Static87.anInt1693 = arg2;
		Static493.aClass356_13 = arg10;
		Static677.aClass97_3 = null;
		Static512.anInt8243 = arg3;
		Static21.aClass97_1 = null;
		Static136.aClass56_2 = arg9;
		Static79.method1516();
		Static154.aBoolean234 = true;
	}
}
