import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_141 = Static199.method3560("");

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "Lclient!qe;")
	public static Class78 aClass78_142 = Static199.method3560("0(U");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!rd;ILclient!t;)V")
	public static void method582(@OriginalArg(1) Class72_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class88 arg2) {
		@Pc(7) Class2_Sub16 local7 = new Class2_Sub16();
		local7.aLong188 = arg1;
		local7.aClass88_1 = arg2;
		local7.aClass72_Sub1_13 = arg0;
		local7.anInt1364 = 1;
		@Pc(22) Class44 local22 = Static202.aClass44_57;
		synchronized (Static202.aClass44_57) {
			Static202.aClass44_57.method1355(local7);
		}
		Static183.method3365();
	}
}
