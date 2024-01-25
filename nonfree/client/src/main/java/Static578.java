import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "[Lclient!ae;")
	public static final Class6_Sub2_Sub1[] aClass6_Sub2_Sub1Array7 = new Class6_Sub2_Sub1[14];

	@OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
	public static int anInt6641 = 0;

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(III)V")
	public static void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static469.method7115(arg1, arg0);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Z")
	public static boolean method5704(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)Z")
	public static boolean method5705(@OriginalArg(1) int arg0) {
		if (Static627.aBooleanArray59[arg0]) {
			return true;
		} else if (Static603.aClass353_129.method8412(arg0)) {
			@Pc(28) int local28 = Static603.aClass353_129.method8422(arg0);
			if (local28 == 0) {
				Static627.aBooleanArray59[arg0] = true;
				return true;
			}
			if (Static605.aClass302ArrayArray4[arg0] == null) {
				Static605.aClass302ArrayArray4[arg0] = new Class302[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static605.aClass302ArrayArray4[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static603.aClass353_129.method8404(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class302 local73 = Static605.aClass302ArrayArray4[arg0][local47] = new Class302();
						local73.anInt8838 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7550(new Class6_Sub40(local61));
					}
				}
			}
			Static627.aBooleanArray59[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(II)Z")
	public static boolean method5706(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(III)Lclient!ica;")
	public static Class20_Sub2_Sub3 method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub3_2;
	}

	@OriginalMember(owner = "client!uha", name = "f", descriptor = "(III)I")
	public static int method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static103.anIntArray143[arg1 & 0x3] : Static235.anIntArray268[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "([[II)V")
	public static void method5711(@OriginalArg(0) int[][] arg0) {
		Static484.anIntArrayArray41 = arg0;
	}
}
