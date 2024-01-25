import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!ui;")
	public static Class230 aClass230_79;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "[S")
	public static short[] aShortArray99;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt5742 = 0;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt5744 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public static final int anInt5745 = 12;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static final int anInt5746 = 205;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)I")
	public static int method4936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(25) int local25 = arg1 / arg2;
		@Pc(31) int local31 = arg2 - 1 & arg1;
		@Pc(36) int local36 = Static77.method2282(local7, local25);
		@Pc(43) int local43 = Static77.method2282(local7 + 1, local25);
		@Pc(50) int local50 = Static77.method2282(local7, local25 + 1);
		@Pc(59) int local59 = Static77.method2282(local7 + 1, local25 + 1);
		@Pc(66) int local66 = Static88.method1342(local13, local43, arg2, local36);
		@Pc(73) int local73 = Static88.method1342(local13, local59, arg2, local50);
		return Static88.method1342(local31, local73, arg2, local66);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method4939() {
		if (Static221.aBoolean370) {
			return;
		}
		Static187.aBoolean292 = true;
		if (Static188.aClass135_Sub1_1.aBoolean329) {
			Static19.aFloat1 = (int) Static19.aFloat1 + 47 & 0xFFFFFFF0;
		} else {
			Static37.aFloat2 += (12.0F - Static37.aFloat2) / 2.0F;
		}
		Static221.aBoolean370 = true;
	}
}
