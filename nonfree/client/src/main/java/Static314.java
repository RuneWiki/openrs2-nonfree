import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray130;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray138;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public static int anInt6133 = 0;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
	public static int[] anIntArray630 = new int[14];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I")
	public static int method5010(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(29) int local29 = (local19 & 0x33333333) + (local19 >>> 2 & 0xB3333333);
		@Pc(38) int local38 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
	public static int method5011(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILclient!f;I)V")
	public static void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class49 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub20 local10 = (Class3_Sub20) Static150.aClass56_9.method1281(); local10 != null; local10 = (Class3_Sub20) Static150.aClass56_9.method1278()) {
			if (local10.anInt2985 == arg0 && arg1 * 128 == local10.anInt2993 && arg3 * 128 == local10.anInt2998 && local10.aClass49_1.anInt1376 == arg2.anInt1376) {
				if (local10.aClass3_Sub15_Sub1_3 != null) {
					Static86.aClass3_Sub15_Sub2_1.method2432(local10.aClass3_Sub15_Sub1_3);
					local10.aClass3_Sub15_Sub1_3 = null;
				}
				if (local10.aClass3_Sub15_Sub1_2 != null) {
					Static86.aClass3_Sub15_Sub2_1.method2432(local10.aClass3_Sub15_Sub1_2);
					local10.aClass3_Sub15_Sub1_2 = null;
				}
				local10.method5013();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
	public static void method5015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * Static220.anInt5204 >> 8;
		if (arg0 == -1 && !Static73.aBoolean123) {
			Static15.method3530();
		} else if (arg0 != -1 && (Static201.anInt3962 != arg0 || !Static270.method4462()) && local5 != 0 && !Static73.aBoolean123) {
			Static102.method1626(Static257.aClass155_106, arg0, local5);
		}
		Static201.anInt3962 = arg0;
	}
}
