import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public static int anInt3405;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Lclient!eb;")
	public static Class17 aClass17_54 = new Class17(64);

	@OriginalMember(owner = "client!db", name = "H", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1413 = Static59.method1195("Enter message to send to ");

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1414 = aClass60_1413;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1415 = Static59.method1195("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1416 = Static59.method1195("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)Lclient!qf;")
	public static Class60 method2271(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class60 local9 = new Class60();
		local9.aByteArray73 = new byte[arg2];
		local9.anInt2817 = 0;
		for (@Pc(27) int local27 = arg0; local27 < arg0 + arg2; local27++) {
			if (arg1[local27] != 0) {
				local9.aByteArray73[local9.anInt2817++] = arg1[local27];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method2272() {
		Static77.aClass17_39.method646();
		Static87.aClass17_27.method646();
		Static98.aClass17_47.method646();
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method2273() {
		aClass60_1413 = null;
		aClass60_1414 = null;
		aClass17_54 = null;
		aClass60_1415 = null;
		aClass60_1416 = null;
	}
}
