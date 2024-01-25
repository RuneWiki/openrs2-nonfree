import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lclient!hj;")
	public static Class131 aClass131_2;

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "[I")
	public static final int[] anIntArray591 = new int[256];

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIILclient!om;ZI)V")
	public static void method6460(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class246 arg2, @OriginalArg(6) int arg3) {
		if (arg1 <= 0) {
			Static437.method6178(arg2, arg3, arg0);
			return;
		}
		Static478.anInt7778 = arg3;
		Static487.anInt7851 = arg0;
		Static375.anInt6351 = 1;
		Static564.aBoolean704 = false;
		Static262.anInt4939 = 0;
		Static10.aClass246_11 = arg2;
		Static206.anInt4170 = Static142.aClass3_Sub6_Sub3_1.method2147() / arg1;
		if (Static206.anInt4170 < 1) {
			Static206.anInt4170 = 1;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6461(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static575.method7623(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static82.anInt2184; local30++) {
			@Pc(36) String local36 = Static145.aStringArray14[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static575.method7623(local36);
			if (local36 != null && local36.equals(local25)) {
				Static82.anInt2184--;
				for (@Pc(60) int local60 = local30; local60 < Static82.anInt2184; local60++) {
					Static145.aStringArray14[local60] = Static145.aStringArray14[local60 + 1];
					Static552.aStringArray46[local60] = Static552.aStringArray46[local60 + 1];
					Static553.aStringArray47[local60] = Static553.aStringArray47[local60 + 1];
					Static40.aStringArray32[local60] = Static40.aStringArray32[local60 + 1];
					Static143.aBooleanArray32[local60] = Static143.aBooleanArray32[local60 + 1];
				}
				Static417.anInt7008 = Static251.anInt4580;
				@Pc(117) Class3_Sub34 local117 = Static374.method5522(Static232.aClass298_90, Static220.aClass287_2);
				local117.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0));
				local117.aClass3_Sub11_Sub1_2.method3136(arg0);
				Static131.method2572(local117);
				return;
			}
		}
	}
}
