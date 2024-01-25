import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!an", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_5 = new Class187(64, 6);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public static void method334(@OriginalArg(1) int arg0) {
		Static158.anInt2662 = -1;
		Static361.anInt6318 = arg0;
		Static158.anInt2662 = -1;
		Static383.method5626();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([IIILclient!ts;)V")
	public static void method335(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class41_Sub1_Sub1_Sub3_Sub2 arg2) {
		@Pc(13) boolean local13;
		@Pc(15) int local15;
		if (arg2.anIntArray521 != null) {
			local13 = true;
			for (local15 = 0; local15 < arg2.anIntArray521.length; local15++) {
				if (arg2.anIntArray521[local15] != arg0[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13 && arg2.anInt9503 != -1) {
				@Pc(46) Class65 local46 = Static459.aClass128_2.method2686(arg2.anInt9503);
				@Pc(49) int local49 = local46.anInt1425;
				if (local49 == 1) {
					arg2.anInt9461 = 1;
					arg2.anInt9459 = 0;
					arg2.anInt9463 = arg1;
					arg2.anInt9507 = 0;
					arg2.anInt9475 = 0;
					if (!arg2.aBoolean692) {
						Static119.method1899(arg2.anInt9507, arg2, local46);
					}
				}
				if (local49 == 2) {
					arg2.anInt9475 = 0;
				}
			}
		}
		local13 = true;
		for (local15 = 0; local15 < arg0.length; local15++) {
			if (arg0[local15] != -1) {
				local13 = false;
			}
			if (arg2.anIntArray521 == null || arg2.anIntArray521[local15] == -1 || Static459.aClass128_2.method2686(arg0[local15]).anInt1419 >= Static459.aClass128_2.method2686(arg2.anIntArray521[local15]).anInt1419) {
				arg2.anInt9463 = arg1;
				arg2.anIntArray521 = arg0;
				break;
			}
		}
		if (local13) {
			arg2.anIntArray521 = arg0;
			arg2.anInt9463 = arg1;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!wq;B)I")
	public static int method336(@OriginalArg(0) int arg0, @OriginalArg(1) Class394 arg1) {
		if (!Static81.method1268(arg1).method6630(arg0) && arg1.anObjectArray5 == null) {
			return -1;
		} else if (arg1.anIntArray603 == null || arg1.anIntArray603.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray603[arg0];
		}
	}
}
