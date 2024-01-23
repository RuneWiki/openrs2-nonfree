import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray31;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!kb;")
	public static Class83 aClass83_116;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[Lclient!tf;")
	public static Class152[] aClass152Array2;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "Lclient!ao;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!im;)Lclient!ic;")
	public static Class68_Sub2 method3043(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class68_Sub2(arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2634(), arg0.method2634(), arg0.method2655());
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method3044(@OriginalArg(1) int arg0) {
		Static88.anInt2053 = arg0;
		Static206.anInt4587 = -1;
		Static206.anInt4587 = -1;
		Static104.method850();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)I")
	public static int method3045(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V")
	public static void method3046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static156.method2885(arg1, arg2, arg4, arg0);
			}
		} else if (local9 == 0) {
			Static79.method1426(arg1, arg0, arg4, arg3);
		} else {
			@Pc(48) int local48 = (local9 << 12) / local14;
			@Pc(57) int local57 = arg0 - (arg1 * local48 >> 12);
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (arg3 < Static102.anInt2239) {
				local66 = Static102.anInt2239;
				local74 = local57 + (local48 * Static102.anInt2239 >> 12);
			} else if (arg3 > Static88.anInt2052) {
				local66 = Static88.anInt2052;
				local74 = (Static88.anInt2052 * local48 >> 12) + local57;
			} else {
				local74 = arg2;
				local66 = arg3;
			}
			if (local74 < Static152.anInt3532) {
				local66 = (Static152.anInt3532 - local57 << 12) / local48;
				local74 = Static152.anInt3532;
			} else if (Static223.anInt1245 < local74) {
				local66 = (Static223.anInt1245 - local57 << 12) / local48;
				local74 = Static223.anInt1245;
			}
			@Pc(144) int local144;
			@Pc(152) int local152;
			if (Static102.anInt2239 > arg1) {
				local144 = Static102.anInt2239;
				local152 = local57 + (Static102.anInt2239 * local48 >> 12);
			} else if (Static88.anInt2052 < arg1) {
				local144 = Static88.anInt2052;
				local152 = (local48 * Static88.anInt2052 >> 12) + local57;
			} else {
				local152 = arg0;
				local144 = arg1;
			}
			if (local152 < Static152.anInt3532) {
				local152 = Static152.anInt3532;
				local144 = (Static152.anInt3532 - local57 << 12) / local48;
			} else if (local152 > Static223.anInt1245) {
				local144 = (Static223.anInt1245 - local57 << 12) / local48;
				local152 = Static223.anInt1245;
			}
			Static132.method2271(local144, local74, local66, local152, arg4);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lclient!vh;")
	public static Class168 method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class168 local14 = local7.aClass168_1;
			local7.aClass168_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
	public static void method3049() {
		Static57.anInt1509 = -1;
		Static50.anInt1382 = 2;
		Static293.aClass83_203 = null;
		Static66.anInt3701 = 0;
		Static115.anInt2536 = 1;
		Static167.anInt3813 = -1;
		Static282.aBoolean321 = false;
	}
}
