import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	public static int anInt3542 = -1;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!wg;")
	public static Class189 aClass189_5 = new Class189();

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public static volatile int anInt3546 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3132(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		@Pc(12) int local12 = local4.method1853();
		@Pc(23) int local23 = local4.method1860();
		if (local23 < 0 || Static103.anInt2204 != 0 && Static103.anInt2204 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(49) byte[] local49 = new byte[local23];
			local4.method1866(local49, local23);
			return local49;
		} else {
			@Pc(61) int local61 = local4.method1860();
			if (local61 < 0 || Static103.anInt2204 != 0 && Static103.anInt2204 < local61) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local61];
			if (local12 == 1) {
				Static36.method616(local76, local61, arg0, local23);
			} else {
				Static206.aClass74_1.method1952(local4, local76);
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V")
	public static void method3133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) Class157 local12 = Static209.method3469(arg5, arg3);
		if (local12 != null && local12.anObjectArray12 != null) {
			@Pc(22) Class1_Sub29 local22 = new Class1_Sub29();
			local22.aClass157_13 = local12;
			local22.anObjectArray2 = local12.anObjectArray12;
			Static5.method104(local22);
		}
		Static96.anInt2071 = arg0;
		Static293.anInt5296 = arg1;
		Static315.anInt5631 = arg5;
		Static75.anInt1991 = arg3;
		Static187.aBoolean318 = true;
		Static273.anInt5036 = arg2;
		Static144.anInt2797 = arg4;
		Static224.method3621(local12);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "([BI)Lclient!uj;")
	public static Class1_Sub5_Sub9 method3134(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(24) Class1_Sub5_Sub9 local24;
		if (Static71.aBoolean165) {
			local24 = new Class1_Sub5_Sub9_Sub1(arg0, Static192.anIntArray398, Static173.anIntArray353, Static69.anIntArray119, Static206.anIntArray419, Static25.aByteArrayArray19);
		} else {
			local24 = new Class1_Sub5_Sub9_Sub2(arg0, Static192.anIntArray398, Static173.anIntArray353, Static69.anIntArray119, Static206.anIntArray419, Static25.aByteArrayArray19);
		}
		Static176.method3009();
		return local24;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	public static void method3135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static188.anInt3598 && Static289.anInt5245 >= arg3 + arg2 && arg1 - arg3 >= Static231.anInt4333 && Static218.anInt4086 >= arg1 + arg3) {
			Static272.method4179(arg0, arg2, arg1, arg3);
		} else {
			Static281.method102(arg0, arg2, arg3, arg1);
		}
	}
}
