import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_79 = new Class21("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[Lclient!kg;")
	public static final Class130[] aClass130Array1 = new Class130[14];

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt5205 = 0;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lclient!bl;")
	public static Class11_Sub2 method4397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub2_2;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)Z")
	public static boolean method4399() {
		try {
			return Static365.method5222();
		} catch (@Pc(14) IOException local14) {
			Static124.method2333();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static432.aClass214_220 == null ? -1 : Static432.aClass214_220.method4988()) + "," + (Static20.aClass214_216 == null ? -1 : Static20.aClass214_216.method4988()) + "," + (Static72.aClass214_68 == null ? -1 : Static72.aClass214_68.method4988()) + " - " + Static136.anInt2819 + "," + (Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] + Static426.anInt7325) + "," + (Static72.anInt1776 + Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0]) + " - ";
			for (@Pc(80) int local80 = 0; Static136.anInt2819 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static196.aClass4_Sub20_Sub1_4.aByteArray77[local80] + ",";
			}
			Static417.method5814(local19, local78);
			Static91.method1815(false);
			return true;
		}
	}
}
