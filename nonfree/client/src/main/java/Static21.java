import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt569 = 0;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!eh;")
	private static Class28 aClass28_232 = Static170.method3101("Free world");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_230 = aClass28_232;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[S")
	public static short[] aShortArray8 = new short[500];

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_231 = Static170.method3101("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_233 = Static170.method3101("<col=ffff00>");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BI[Lclient!dg;IIIIII)V")
	public static void method592(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) Class3_Sub8 local4 = new Class3_Sub8(arg0);
		@Pc(10) int local10 = -1;
		while (true) {
			@Pc(14) int local14 = local4.method1544();
			if (local14 == 0) {
				return;
			}
			local10 += local14;
			@Pc(22) int local22 = 0;
			while (true) {
				@Pc(26) int local26 = local4.method1544();
				if (local26 == 0) {
					break;
				}
				local22 += local26 - 1;
				@Pc(41) int local41 = local22 & 0x3F;
				@Pc(47) int local47 = local22 >> 6 & 0x3F;
				@Pc(51) int local51 = local22 >> 12;
				@Pc(55) int local55 = local4.method1545();
				@Pc(59) int local59 = local55 >> 2;
				@Pc(63) int local63 = local55 & 0x3;
				if (local51 == arg4 && arg5 <= local47 && arg5 + 8 > local47 && arg3 <= local41 && arg3 + 8 > local41) {
					@Pc(102) Class3_Sub2_Sub18 local102 = Static86.method1991(local10);
					@Pc(119) int local119 = Static91.method3117(local41 & 0x7, arg1, local102.anInt4242, local102.anInt4226, local47 & 0x7, local63) + arg7;
					@Pc(137) int local137 = arg6 + Static72.method1656(local102.anInt4242, arg1, local63, local102.anInt4226, local47 & 0x7, local41 & 0x7);
					if (local119 > 0 && local137 > 0 && local119 < 103 && local137 < 103) {
						@Pc(154) int local154 = arg8;
						if ((Static157.aByteArrayArrayArray41[1][local119][local137] & 0x2) == 2) {
							local154 = arg8 - 1;
						}
						@Pc(168) Class21 local168 = null;
						if (local154 >= 0) {
							local168 = arg2[local154];
						}
						Static11.method403(local137, local119, local63 + arg1 & 0x3, local10, local168, local59, arg8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIB)I")
	public static int method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static157.aByteArrayArrayArray41[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static157.aByteArrayArrayArray41[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)Lclient!ca;")
	public static Class3_Sub2_Sub4 method594(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub4 local10 = (Class3_Sub2_Sub4) Static63.aClass63_9.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static95.aClass7_46.method1021(12, arg0);
		local10 = new Class3_Sub2_Sub4();
		if (local34 != null) {
			local10.method572(new Class3_Sub8(local34));
		}
		local10.method575();
		Static63.aClass63_9.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method595() {
		aClass28_232 = null;
		aLongArray3 = null;
		aClass28_233 = null;
		aClass7_Sub1_3 = null;
		aClass28_231 = null;
		aShortArray8 = null;
		aClass28_230 = null;
	}
}
