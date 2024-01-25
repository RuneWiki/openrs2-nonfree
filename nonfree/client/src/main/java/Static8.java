import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!f;")
	public static Class8 aClass8_23;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!bu;")
	public static Class32 aClass32_77;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "Lclient!bi;")
	public static Class23 aClass23_7;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
	public static void method4682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static452.anInt7626 && Static82.anInt3956 >= arg0 && arg1 >= Static341.anInt5789 && arg4 <= Static309.anInt5495) {
			if (arg5 == 1) {
				Static23.method510(arg1, arg2, arg0, arg4, arg3);
			} else {
				Static280.method3942(arg0, arg2, arg3, arg5, arg1, arg4);
			}
		} else if (arg5 == 1) {
			Static224.method3357(arg1, arg3, arg2, arg0, arg4);
		} else {
			Static191.method3054(arg3, arg2, arg1, arg4, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	public static void method4684(@OriginalArg(1) boolean arg0) {
		Static170.method2751();
		if (Static120.anInt2584 != 30 && Static120.anInt2584 != 25) {
			return;
		}
		Static44.anInt7273++;
		if (Static44.anInt7273 < 50 && !arg0) {
			return;
		}
		Static44.anInt7273 = 0;
		if (!Static109.aBoolean215 && Static88.aClass251_2 != null) {
			Static30.method641(Static53.aClass217_23);
			try {
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
			} catch (@Pc(52) IOException local52) {
				Static109.aBoolean215 = true;
			}
		}
		Static170.method2751();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static93.method1695(arg0, arg1) & Static261.method664(arg1, arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!en;B)V")
	public static void method4686(@OriginalArg(0) Class3_Sub14 arg0) {
		if (!Static438.aBoolean636) {
			arg0.method5977();
			Static158.anInt3162--;
		}
	}
}
