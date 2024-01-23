import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!kb;")
	public static Class83 aClass83_177;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	public static int anInt5566;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public static int anInt5569;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public static int anInt5575 = -1;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	public static int anInt5576 = 3;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Loading wordpack - ";

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!kb;ZLclient!rg;ZLclient!kb;)V")
	public static void method4342(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class1_Sub2_Sub16_Sub2 arg1, @OriginalArg(4) Class83 arg2) {
		Static255.aClass83_175 = arg0;
		Static220.aBoolean270 = true;
		Static164.aClass83_116 = arg2;
		@Pc(22) int local22 = Static255.aClass83_175.method2327() - 1;
		Static78.anInt1887 = Static255.aClass83_175.method2317(local22) + local22 * 256;
		Static84.aStringArray7 = new String[] { null, null, null, null, Static245.aString168 };
		Static251.aClass1_Sub2_Sub16_Sub2_2 = arg1;
		Static181.aStringArray19 = new String[] { null, null, Static175.aString115, null, null };
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ok;I)Lclient!ok;")
	public static Class116 method4347(@OriginalArg(0) Class116 arg0) {
		@Pc(6) Class116 local6 = Static37.method852(arg0);
		if (local6 == null) {
			local6 = arg0.aClass116_10;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method4351(@OriginalArg(1) Class83 arg0) {
		Static262.aClass83_186 = arg0;
	}
}
