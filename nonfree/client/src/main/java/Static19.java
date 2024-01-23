import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	public static int anInt361;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "[Lclient!pc;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!l;")
	public static Class98 aClass98_2 = new Class98(64);

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZBILjava/lang/String;)Z")
	public static boolean method315(@OriginalArg(3) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(34) int local34 = arg0.length();
		@Pc(36) int local36 = 0;
		for (@Pc(46) int local46 = 0; local46 < local34; local46++) {
			@Pc(57) char local57 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local57 == '-') {
					local31 = true;
					continue;
				}
				if (local57 == '+') {
					continue;
				}
			}
			@Pc(103) int local103;
			if (local57 >= '0' && local57 <= '9') {
				local103 = local57 - '0';
			} else if (local57 >= 'A' && local57 <= 'Z') {
				local103 = local57 - '7';
			} else if (local57 >= 'a' && local57 <= 'z') {
				local103 = local57 - 'W';
			} else {
				return false;
			}
			if (local103 >= 10) {
				return false;
			}
			if (local31) {
				local103 = -local103;
			}
			@Pc(127) int local127 = local36 * 10 + local103;
			if (local36 != local127 / 10) {
				return false;
			}
			local36 = local127;
			local29 = true;
		}
		return local29;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method316() {
		Static269.aClass81Array5 = null;
		Static60.aClass3_Sub4_Sub12Array2 = null;
		Static209.aClass3_Sub4_Sub12Array12 = null;
		Static248.aClass3_Sub4_Sub2_11 = null;
		Static206.aClass3_Sub4_Sub12Array7 = null;
		Static25.aClass3_Sub4_Sub2_4 = null;
		Static161.aClass3_Sub4_Sub12Array4 = null;
		Static270.aClass3_Sub4_Sub12Array10 = null;
		Static175.aClass3_Sub4_Sub2_Sub2_1 = null;
		Static300.aClass3_Sub4_Sub12Array11 = null;
		Static200.aClass3_Sub4_Sub12Array6 = null;
		Static96.aClass81Array2 = null;
		Static260.aClass3_Sub4_Sub12_7 = null;
		Static86.aClass3_Sub4_Sub12Array3 = null;
		Static224.aClass3_Sub4_Sub2_14 = null;
		Static186.aClass3_Sub4_Sub12Array5 = null;
		Static237.aClass3_Sub4_Sub12Array9 = null;
	}
}
