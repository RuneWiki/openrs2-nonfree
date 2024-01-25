import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	public static int anInt5076 = -1;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public static int anInt5078 = -1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII)V")
	public static void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 < arg1) {
			for (local15 = arg0; local15 < arg1; local15++) {
				Static267.anIntArrayArray50[local15][arg3] = arg2;
			}
		} else {
			for (local15 = arg1; local15 < arg0; local15++) {
				Static267.anIntArrayArray50[local15][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4063(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static112.method1664(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static66.anInt1316; local29++) {
			@Pc(35) String local35 = Static93.aStringArray14[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static112.method1664(local35);
			if (local35 != null && local35.equals(local20)) {
				Static66.anInt1316--;
				for (@Pc(59) int local59 = local29; local59 < Static66.anInt1316; local59++) {
					Static93.aStringArray14[local59] = Static93.aStringArray14[local59 + 1];
					Static406.aStringArray42[local59] = Static406.aStringArray42[local59 + 1];
					Static441.aStringArray46[local59] = Static441.aStringArray46[local59 + 1];
					Static178.aStringArray28[local59] = Static178.aStringArray28[local59 + 1];
					Static29.aBooleanArray3[local59] = Static29.aBooleanArray3[local59 + 1];
				}
				Static357.anInt5911 = Static79.anInt1568;
				Static448.method5935(Static375.aClass146_87);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0));
				Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
				return;
			}
		}
	}
}
