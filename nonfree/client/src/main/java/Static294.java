import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	public static int[] anIntArray467 = new int[100];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt5275 = 127;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!gi;I)V")
	public static void method4480(@OriginalArg(0) Class15_Sub5 arg0) {
		@Pc(15) int local15 = arg0.anInt5564 - Static313.anInt2966;
		@Pc(26) int local26 = arg0.anInt5555 * 128 + arg0.method4702() * 64;
		@Pc(38) int local38 = arg0.anInt5533 * 128 + arg0.method4702() * 64;
		arg0.anInt5519 = 0;
		arg0.anInt5559 += (local26 - arg0.anInt5559) / local15;
		arg0.anInt5557 += (local38 - arg0.anInt5557) / local15;
		if (arg0.anInt5561 == 0) {
			arg0.anInt5593 = 1024;
		}
		if (arg0.anInt5561 == 1) {
			arg0.anInt5593 = 1536;
		}
		if (arg0.anInt5561 == 2) {
			arg0.anInt5593 = 0;
		}
		if (arg0.anInt5561 == 3) {
			arg0.anInt5593 = 512;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lclient!hi;BZI)V")
	public static void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(19) Class66 local19 = arg2[local7];
			if (local19 != null && local19.anInt2221 == arg4) {
				Static264.method4162(arg0, arg1, arg3, local19);
				Static96.method1761(local19, arg1, arg0);
				if (local19.anInt2215 - local19.anInt2207 < local19.anInt2216) {
					local19.anInt2216 = local19.anInt2215 - local19.anInt2207;
				}
				if (local19.anInt2191 > local19.anInt2214 - local19.anInt2204) {
					local19.anInt2191 = local19.anInt2214 - local19.anInt2204;
				}
				if (local19.anInt2191 < 0) {
					local19.anInt2191 = 0;
				}
				if (local19.anInt2216 < 0) {
					local19.anInt2216 = 0;
				}
				if (local19.anInt2176 == 0) {
					Static6.method38(arg3, local19);
				}
			}
		}
	}
}
