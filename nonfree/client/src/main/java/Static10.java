import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_4 = new Class242("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt350 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method281() {
		if (Static411.aClass75_2 != null) {
			Static411.aClass75_2.method5354();
		}
		if (Static91.aClass75_1 != null) {
			Static91.aClass75_1.method5354();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method282() {
		for (@Pc(7) int local7 = 0; local7 < Static425.anInt7124; local7++) {
			@Pc(13) Class200 local13 = Static246.aClass200Array1[local7];
			if (local13.aByte83 == 2) {
				if (local13.aClass4_Sub18_Sub2_1 == null) {
					local13.anInt5830 = Integer.MIN_VALUE;
				} else {
					Static393.aClass4_Sub18_Sub1_1.method2789(local13.aClass4_Sub18_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
	public static boolean method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZC)C")
	public static char method290(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
