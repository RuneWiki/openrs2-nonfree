import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_28 = new Class288(87, 7);

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method574() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static69.aBooleanArray25[local7] = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public static void method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static54.method261(local7.aClass13_Sub1_Sub4_1);
		Static54.method261(local7.aClass13_Sub1_Sub4_2);
		if (local7.aClass13_Sub1_Sub4_1 != null) {
			local7.aClass13_Sub1_Sub4_1 = null;
		}
		if (local7.aClass13_Sub1_Sub4_2 != null) {
			local7.aClass13_Sub1_Sub4_2 = null;
		}
	}
}
