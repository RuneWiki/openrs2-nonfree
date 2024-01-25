import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	public static int anInt5062 = 0;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	public static int anInt5063 = 0;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method4450(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		@Pc(36) int local36 = arg0 / 10;
		while (local36 != 0) {
			local36 /= 10;
			local32++;
		}
		@Pc(51) char[] local51 = new char[local32];
		local51[0] = '+';
		for (@Pc(59) int local59 = local32 - 1; local59 > 0; local59--) {
			@Pc(63) int local63 = arg0;
			arg0 /= 10;
			@Pc(74) int local74 = local63 - arg0 * 10;
			if (local74 >= 10) {
				local51[local59] = (char) (local74 + 87);
			} else {
				local51[local59] = (char) (local74 + 48);
			}
		}
		return new String(local51);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ[Lclient!tq;III)V")
	public static void method4453(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class239[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class239 local9 = arg1[local3];
			if (local9 != null && local9.anInt6479 == arg2) {
				Static79.method1460(arg3, arg4, arg0, local9);
				Static214.method3327(local9, arg4, arg3);
				if (local9.anInt6495 > local9.anInt6429 - local9.anInt6435) {
					local9.anInt6495 = local9.anInt6429 - local9.anInt6435;
				}
				if (local9.anInt6438 > local9.anInt6440 - local9.anInt6408) {
					local9.anInt6438 = local9.anInt6440 - local9.anInt6408;
				}
				if (local9.anInt6495 < 0) {
					local9.anInt6495 = 0;
				}
				if (local9.anInt6438 < 0) {
					local9.anInt6438 = 0;
				}
				if (local9.anInt6447 == 0) {
					Static199.method3150(local9, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLclient!tq;)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class239 arg2) {
		Static64.aClass239_2 = arg2;
		Static375.anInt6236 = arg0;
		Static324.anInt5293 = arg1;
	}
}
