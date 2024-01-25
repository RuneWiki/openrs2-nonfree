import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!f;")
	public static Class38 aClass38_29;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!cc;")
	public static Class2_Sub8 aClass2_Sub8_1 = null;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5028(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static273.method3974(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static225.anInt3293; local30++) {
			@Pc(36) String local36 = Static582.aStringArray44[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static273.method3974(local36);
			if (local36 != null && local36.equals(local20)) {
				Static225.anInt3293--;
				for (@Pc(60) int local60 = local30; local60 < Static225.anInt3293; local60++) {
					Static582.aStringArray44[local60] = Static582.aStringArray44[local60 + 1];
					Static78.aStringArray9[local60] = Static78.aStringArray9[local60 + 1];
					Static117.aStringArray13[local60] = Static117.aStringArray13[local60 + 1];
					Static493.aStringArray36[local60] = Static493.aStringArray36[local60 + 1];
					Static429.aBooleanArray24[local60] = Static429.aBooleanArray24[local60 + 1];
				}
				Static586.anInt9519 = Static390.anInt6454;
				@Pc(117) Class2_Sub34 local117 = Static555.method7264(Static509.aClass154_114, Static551.aClass64_2);
				local117.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0));
				local117.aClass2_Sub7_Sub2_2.method4481(arg0);
				Static100.method1508(local117);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mv;Lclient!mv;Lclient!mv;Lclient!mv;I)V")
	public static void method5030(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		Static222.aClass229_49 = arg3;
		Static439.aClass229_100 = arg1;
		Static526.aClass229_133 = arg0;
		Static509.aClass273ArrayArray2 = new Class273[Static439.aClass229_100.method4952()][];
		Static472.aBooleanArray27 = new boolean[Static439.aClass229_100.method4952()];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method5031() {
		if (Static169.aClass99_2.aBoolean151 && Static112.aClass292_1.anInt7261 != -1) {
			Static80.method1230(Static112.aClass292_1.aString111, Static112.aClass292_1.anInt7261);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!fn;Lclient!cv;Lclient!mv;Lclient!mv;ILclient!mv;)Z")
	public static boolean method5032(@OriginalArg(0) Class2_Sub3_Sub2 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(5) Class229 arg4) {
		Static276.aClass229_67 = arg3;
		Static339.aClass7_2 = arg1;
		Static130.aClass229_26 = arg4;
		Static507.aClass229_120 = arg2;
		Static462.anIntArray496 = new int[16];
		Static84.aClass2_Sub3_Sub2_7 = arg0;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static462.anIntArray496[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)V")
	public static void method5033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 5);
		local8.method6227();
		local8.anInt7701 = arg1;
	}
}
