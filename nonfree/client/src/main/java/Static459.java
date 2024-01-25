import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "[I")
	public static final int[] anIntArray734 = new int[8];

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
	public static int anInt7799 = 104;

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_333 = new Class296(17, 8);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZII)Z")
	public static boolean method6490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static131.method2186(arg0, arg1) || Static290.method6966(arg1, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
	public static void method6491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass49_Sub1_3 != null) {
			local7.aClass49_Sub1_3 = null;
		}
		if (local7.aClass49_Sub1_2 != null) {
			local7.aClass49_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!sm;)I")
	public static int method6492(@OriginalArg(1) Class271 arg0) {
		if (Static486.aClass271_5 == arg0) {
			return 7681;
		} else if (Static449.aClass271_4 == arg0) {
			return 8448;
		} else if (Static343.aClass271_2 == arg0) {
			return 34165;
		} else if (Static39.aClass271_1 == arg0) {
			return 260;
		} else if (Static433.aClass271_3 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
