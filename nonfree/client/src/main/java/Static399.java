import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6439(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static22.method978(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static222.anInt4237; local32++) {
			@Pc(38) String local38 = Static553.aStringArray35[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static22.method978(local38);
			if (local38 != null && local38.equals(local20)) {
				Static222.anInt4237--;
				for (@Pc(62) int local62 = local32; local62 < Static222.anInt4237; local62++) {
					Static553.aStringArray35[local62] = Static553.aStringArray35[local62 + 1];
					Static236.aStringArray17[local62] = Static236.aStringArray17[local62 + 1];
					Static383.aStringArray26[local62] = Static383.aStringArray26[local62 + 1];
					Static145.aStringArray9[local62] = Static145.aStringArray9[local62 + 1];
					Static258.aBooleanArray14[local62] = Static258.aBooleanArray14[local62 + 1];
				}
				Static258.anInt4764 = Static371.anInt7006;
				@Pc(119) Class3_Sub14 local119 = Static139.method2308(Static177.aClass130_53, Static24.aClass233_1);
				local119.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0));
				local119.aClass3_Sub3_Sub2_2.method4241(arg0);
				Static562.method8096(local119);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!sl;Z)Lclient!qo;")
	public static Class141_Sub3 method6440(@OriginalArg(0) Class3_Sub3 arg0) {
		return new Class141_Sub3(arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4204(), arg0.method4204(), arg0.method4225());
	}
}
