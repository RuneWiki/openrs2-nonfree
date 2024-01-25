import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!f;")
	public static Class5 aClass5_38;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public static int anInt9583;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
	public static final int[] anIntArray603 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public static int anInt9584 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public static void method7791(@OriginalArg(0) int arg0) {
		Static69.anInt1339 = -1;
		Static24.anInt582 = 100;
		Static514.anInt8865 = arg0;
		Static413.anInt7319 = 3;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lclient!cu;")
	public static Class11_Sub1_Sub3 method7792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_Sub3_2;
	}
}
