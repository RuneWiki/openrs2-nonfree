import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lclient!gd;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
	public static int anInt994;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_12 = new Class223(8);

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lclient!fw;")
	public static final Class110 aClass110_1 = new Class110();

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Lclient!lw;")
	public static Class1_Sub4_Sub3 method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub4_Sub3 local14 = local7.aClass1_Sub4_Sub3_1;
			local7.aClass1_Sub4_Sub3_1 = null;
			Static591.method8355(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BJ)V")
	public static void method1019(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static284.method4882(arg0 - 1L);
			Static284.method4882(1L);
		} else {
			Static284.method4882(arg0);
		}
	}
}
