import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "[Lclient!hh;")
	public static Class138[] aClass138Array1;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
	public static int[] anIntArray651;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_92 = new Class70(75, 3);

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public static void method7080(@OriginalArg(0) int arg0) {
		if (Static504.method4690(arg0)) {
			Static432.method6030(-1, Static578.aClass341ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLclient!mo;)Lclient!naa;")
	public static Class54_Sub2 method7082(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(7) Class54 local7 = Static536.method7335(arg0);
		@Pc(11) int local11 = arg0.method5771();
		@Pc(15) int local15 = arg0.method5771();
		@Pc(19) int local19 = arg0.method5771();
		@Pc(28) int local28 = arg0.method5771();
		@Pc(32) int local32 = arg0.method5771();
		@Pc(36) int local36 = arg0.method5771();
		return new Class54_Sub2(local7.aClass335_10, local7.aClass122_9, local7.anInt4146, local7.anInt4142, local7.anInt4145, local7.anInt4141, local7.anInt4143, local7.anInt4144, local7.anInt4139, local11, local15, local19, local28, local32, local36);
	}
}
