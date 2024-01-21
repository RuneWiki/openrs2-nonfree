import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt371 = 0;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	public static int[] anIntArray25 = new int[2048];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_97 = Static65.method1172("logo");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public static int anInt376 = 0;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_98 = Static65.method1172("jlv");

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_99 = Static65.method1172(" <col=00ff80>");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jg;ZLclient!jg;ILclient!ef;)V")
	public static void method296(@OriginalArg(0) Class44 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) Class3_Sub2_Sub3_Sub1_Sub1 arg3) {
		Static38.aBoolean34 = arg1;
		Static37.aClass44_5 = arg0;
		Static78.aClass44_17 = arg2;
		Static139.anInt3222 = Static37.aClass44_5.method1619(10);
		Static9.aClass3_Sub2_Sub3_Sub1_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method298() {
		Static145.aClass59_8 = new Class59();
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public static void method302() {
		anIntArray25 = null;
		aClass46_99 = null;
		aClass46_97 = null;
		aClass46_98 = null;
	}
}
