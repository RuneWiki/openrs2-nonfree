import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_133 = new Class296(63, -1);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)C")
	public static char method2361(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(37) char local37 = Static252.aCharArray27[local7 - 128];
			if (local37 == '\u0000') {
				local37 = '?';
			}
			local7 = local37;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)V")
	public static void method2362() {
		for (@Pc(10) Class72_Sub3 local10 = (Class72_Sub3) Static272.aClass299_5.method7034(); local10 != null; local10 = (Class72_Sub3) Static272.aClass299_5.method7034()) {
			Static398.method6006(local10);
		}
		@Pc(35) int local35;
		@Pc(34) int local34;
		if (Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861)) {
			local34 = 3;
			local35 = 0;
		} else {
			local34 = Static206.anInt4061;
			local35 = Static206.anInt4061;
		}
		Static67.method1230();
		for (@Pc(44) int local44 = local35; local44 <= local34; local44++) {
			Static67.method1235();
			Static67.method1231(local44);
			Static67.method1234(local44);
		}
		Static67.method1244();
		Static67.method1238();
	}
}
