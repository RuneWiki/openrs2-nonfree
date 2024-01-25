import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!m;")
	public static Class193_Sub1 aClass193_Sub1_2;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
	public static final int[] anIntArray580 = new int[14];

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)V")
	public static void method6100(@OriginalArg(1) int arg0) {
		Static466.anInt7907 = 2;
		Static177.anInt3167 = arg0;
		if (Static89.aString25 == null) {
			Static348.method7153(35);
		} else {
			@Pc(25) Class6_Sub14 local25 = new Class6_Sub14(Static377.method5522(Static273.method3935(Static89.aString25)));
			@Pc(29) long local29 = local25.method6033();
			Static473.aLong205 = local25.method6033();
			Static217.method3195(Static88.method1427(local29), "", true);
		}
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
	public static void method6101() {
		for (@Pc(14) Class6_Sub1_Sub11 local14 = (Class6_Sub1_Sub11) Static463.aClass275_203.method6366(); local14 != null; local14 = (Class6_Sub1_Sub11) Static463.aClass275_203.method6364()) {
			@Pc(19) Class29_Sub2_Sub2 local19 = local14.aClass29_Sub2_Sub2_1;
			if (local19.aBoolean366) {
				local14.method7849();
				local19.method4932();
			} else if (Static358.anInt6263 >= local19.anInt5734) {
				local19.method4928(Static267.anInt4424);
				if (local19.aBoolean366) {
					local14.method7849();
				} else {
					Static280.method3996(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)Lclient!sh;")
	public static Class292 method6105(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static242.aClass292Array1[arg0] : null;
	}
}
