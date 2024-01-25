import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public static int anInt3138;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static final int anInt3132 = Static636.method8709(1600);

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_35 = new Class200(116, 6);

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_48 = new Class130(68, 3);

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2861(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static141.aStringArray7.length; local7++) {
			if (Static141.aStringArray7[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(JI)V")
	public static void method2862(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	public static void method2865(@OriginalArg(1) int arg0) {
		Static435.anInt7845 = 2;
		Static90.anInt2169 = arg0;
		if (Static76.aString8 == null) {
			Static329.method5383(35);
		} else {
			@Pc(28) Class3_Sub3 local28 = new Class3_Sub3(Static423.method6628(Static574.method8146(Static76.aString8)));
			@Pc(32) long local32 = local28.method4246();
			Static368.aLong190 = local28.method4246();
			Static471.method7101(Static171.method3001(local32), true, "");
		}
	}
}
