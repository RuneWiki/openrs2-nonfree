import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public static int anInt119;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!fh;")
	public static Class58 aClass58_4;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString10 = "glow2:";

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	public static int[] anIntArray15 = new int[1000];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!vh;ILclient!p;ILclient!f;II)V")
	public static void method109(@OriginalArg(1) Class184 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class53_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11();
		local9.anInt2126 = arg6;
		local9.anInt2113 = arg3 * 128;
		local9.anInt2124 = arg1 * 128;
		if (arg0 != null) {
			local9.anInt2116 = arg0.anInt5531;
			local9.anInt2119 = arg0.anInt5556;
			local9.anIntArray172 = arg0.anIntArray632;
			local9.anInt2127 = arg0.anInt5526;
			@Pc(156) int local156 = arg0.anInt5528;
			local9.anInt2123 = arg0.anInt5520 * 128;
			local9.aClass184_1 = arg0;
			@Pc(168) int local168 = arg0.anInt5517;
			if (arg5 == 1 || arg5 == 3) {
				local156 = arg0.anInt5517;
				local168 = arg0.anInt5528;
			}
			local9.anInt2117 = (local156 + arg1) * 128;
			local9.anInt2115 = arg0.anInt5522;
			local9.anInt2112 = (local168 + arg3) * 128;
			if (arg0.anIntArray631 != null) {
				local9.aBoolean146 = true;
				local9.method1652();
			}
			if (local9.anIntArray172 != null) {
				local9.anInt2125 = (int) ((double) (local9.anInt2116 - local9.anInt2119) * Math.random()) + local9.anInt2119;
			}
			Static11.aClass114_2.method2625(local9);
		} else if (arg2 != null) {
			local9.aClass53_Sub1_Sub2_1 = arg2;
			@Pc(86) Class171 local86 = arg2.aClass171_1;
			if (local86.anIntArray590 != null) {
				local9.aBoolean146 = true;
				local86 = local86.method4302();
			}
			if (local86 != null) {
				local9.anInt2117 = (local86.anInt5263 + arg1) * 128;
				local9.anInt2112 = (local86.anInt5263 + arg3) * 128;
				local9.anInt2115 = Static28.method395(arg2);
				local9.anInt2127 = local86.anInt5236;
				local9.anInt2123 = local86.anInt5250 * 128;
			}
			Static82.aClass114_9.method2625(local9);
		} else if (arg4 != null) {
			local9.aClass53_Sub1_Sub1_1 = arg4;
			local9.anInt2117 = (arg1 + arg4.method3324()) * 128;
			local9.anInt2112 = (arg4.method3324() + arg3) * 128;
			local9.anInt2115 = Static28.method396(arg4);
			local9.anInt2127 = arg4.anInt1587;
			local9.anInt2123 = arg4.anInt1582 * 128;
			Static206.aClass85_18.method1841(local9, Static108.method1747(arg4.aString88));
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public static String method110(@OriginalArg(1) Class4_Sub10 arg0) {
		return Static221.method3574(arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method111(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(12, arg0);
		local8.method1519();
	}
}
