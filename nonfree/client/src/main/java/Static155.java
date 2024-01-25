import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_28 = new Class154(7, 3);

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!vs;")
	public static final Class354 aClass354_3 = new Class354();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([ILclient!um;I[IIB)Lclient!gi;")
	public static Class84_Sub2 method2110(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class162_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg1.method3847(Static398.aClass366_10, Static42.aClass35_4)) {
			@Pc(74) int[] local74 = new int[arg4 * arg2];
			for (local23 = 0; local23 < arg4; local23++) {
				local34 = arg0[local23] + local23 * arg2;
				for (local36 = 0; local36 < arg3[local23]; local36++) {
					local74[local34++] = -16777216;
				}
			}
			return new Class84_Sub2(arg1, arg2, arg4, local74);
		}
		@Pc(21) byte[] local21 = new byte[arg2 * arg4];
		for (local23 = 0; local23 < arg4; local23++) {
			local34 = local23 * arg2 + arg0[local23];
			for (local36 = 0; local36 < arg3[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class84_Sub2(arg1, arg2, arg4, local21);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method2111(@OriginalArg(0) Class273 arg0) {
		if (Static79.anInt7837 == arg0.anInt6870) {
			Static255.aBooleanArray17[arg0.anInt6816] = true;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!r;ILclient!jo;)I")
	public static int method2113(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class179 arg1) {
		if (arg1.anInt4279 != -1) {
			return arg1.anInt4279;
		}
		if (arg1.anInt4278 != -1) {
			@Pc(23) Class291 local23 = arg0.anInterface9_10.method1074(arg1.anInt4278);
			if (!local23.aBoolean603) {
				return local23.aShort88;
			}
		}
		return arg1.anInt4274;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!mv;IIIIIZJ)V")
	public static void method2114(@OriginalArg(0) Class229 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) long arg3) {
		Static90.anInt1607 = 0;
		Static431.aBoolean568 = false;
		Static338.anInt5808 = 10000;
		Static518.anInt8283 = arg1;
		Static268.anInt4384 = arg2;
		Static488.aClass2_Sub3_Sub2_5 = null;
		Static467.aClass229_108 = arg0;
		Static148.aLong56 = arg3;
		Static25.anInt442 = 1;
		Static410.anInt6683 = 0;
	}
}
