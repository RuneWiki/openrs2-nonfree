import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "[Lclient!sm;")
	public static Class226[] aClass226Array1;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!la;")
	public static final Class136 aClass136_97 = new Class136(85, -1);

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_30 = new Class193();

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
	public static final int[] anIntArray223 = new int[5];

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!sm;)V")
	public static void method3055(@OriginalArg(0) Class226 arg0) {
		if (Static329.anInt5518 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub7 local6 = arg0.aClass3_Sub7_2;
		aClass226Array1[Static329.anInt5518] = arg0;
		Static66.aBooleanArray6[Static329.anInt5518] = false;
		Static329.anInt5518++;
		@Pc(21) int local21 = arg0.anInt6363;
		if (arg0.aBoolean432) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6363;
		if (arg0.aBoolean431) {
			local29 = Static174.anInt3263 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method2481() + Static22.anInt382 - local6.method2478() >> Static437.anInt7308;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method2481() + local6.method2478() - Static22.anInt382 >> Static437.anInt7308;
			if (local73 >= Static342.anInt5746) {
				local73 = Static342.anInt5746 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray111[local41++];
				@Pc(105) int local105 = (local6.method2483() + Static22.anInt382 - local6.method2478() >> Static437.anInt7308) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static459.anInt5916) {
					local113 = Static459.anInt5916 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static60.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static60.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static329.anInt5518;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static60.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static329.anInt5518 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static60.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static329.anInt5518 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static60.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static329.anInt5518 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public static void method3057() {
		Static209.method3171();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIII)V")
	public static void method3058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = arg1; local5 <= arg2; local5++) {
			Static201.method3084(Static296.anIntArrayArray42[local5], arg4, arg0, arg3);
		}
	}
}
