import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!pa;")
	public static Class86 aClass86_79;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	public static int anInt4227;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13 = new byte[4][104][104];

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1342 = Static186.method3527(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1343 = Static186.method3527("slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray26 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)Lclient!bh;")
	public static Class1_Sub1_Sub4 method3316(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static220.aClass4_9.method81((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static112.aClass86_38.method3325(Static55.method811(arg0), Static37.method595(arg0));
		local10 = new Class1_Sub1_Sub4();
		if (local24 != null) {
			local10.method283(new Class1_Sub17(local24));
		}
		Static220.aClass4_9.method83(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)Z")
	public static boolean method3332(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)I")
	public static int method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILclient!ra;I)Lclient!ra;")
	public static Class20_Sub5 method3338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20_Sub5 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg1;
		@Pc(14) Class20_Sub5 local14 = (Class20_Sub5) Static40.aClass84_16.method2579(local8);
		if (local14 == null) {
			@Pc(21) Class20_Sub4 local21 = Static89.method1399(Static92.aClass86_Sub1_20, arg1);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method1402(64, 768, -50, -10, -50);
			Static40.aClass84_16.method2582(local14, local8);
		}
		@Pc(41) int local41 = arg4.method1704();
		@Pc(44) int local44 = arg4.method1703();
		@Pc(47) int local47 = arg4.method1702();
		@Pc(50) int local50 = arg4.method1707();
		local14 = local14.method1708(true, true);
		if (arg3 != 0) {
			local14.method1700(arg3);
		}
		@Pc(71) Class20_Sub5_Sub1 local71 = (Class20_Sub5_Sub1) local14;
		if (arg2 != Static131.method2213(arg5 + local47, local41 + arg0, Static212.anInt4195) || Static131.method2213(arg5 + local50, arg0 + local44, Static212.anInt4195) != arg2) {
			for (@Pc(102) int local102 = 0; local102 < local71.anInt2164; local102++) {
				local71.anIntArray215[local102] += Static131.method2213(arg5 + local71.anIntArray212[local102], arg0 + local71.anIntArray217[local102], Static212.anInt4195) - arg2;
			}
			local71.aBoolean96 = false;
		}
		return local14;
	}
}
