import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!jb;")
	public static Class25 aClass25_25;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public static int anInt2584;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1118 = Static59.method1195("Schlie-8en");

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1119 = Static59.method1195("Login limit exceeded)3");

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1120 = Static59.method1195("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1121 = Static59.method1195("");

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1122 = Static59.method1195("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1123 = Static59.method1195("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1124 = Static59.method1195("au");

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1125 = Static59.method1195("Lade Sprites )2 ");

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1126 = Static59.method1195(")3");

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1127 = aClass60_1119;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1665() {
		aClass60_1127 = null;
		aClass60_1124 = null;
		aClass60_1118 = null;
		aClass60_1122 = null;
		aClass60_1121 = null;
		aClass25_25 = null;
		aClass60_1123 = null;
		aClass60_1125 = null;
		aClass60_1120 = null;
		aClass60_1126 = null;
		aClass60_1119 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lclient!o;")
	public static Class3_Sub1_Sub15 method1666(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub15 local12 = (Class3_Sub1_Sub15) Static104.aClass17_49.method643((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static83.aClass25_24.method931(arg0, 8);
		local12 = new Class3_Sub1_Sub15();
		if (local27 != null) {
			local12.method1621(new Class3_Sub12(local27));
		}
		Static104.aClass17_49.method644((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
	public static int method1667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}
}
