import java.awt.Canvas;
import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "Lclient!of;")
	public static final Class174 aClass174_213 = new Class174("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!bp;")
	public static Class3_Sub8 method6225(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub8_Sub1");
			@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) local6.getDeclaredConstructor().newInstance();
			local10.method2876(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class3_Sub8_Sub2 local26 = new Class3_Sub8_Sub2();
			local26.method2876(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IC)B")
	public static byte method6227(@OriginalArg(1) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z")
	public static boolean method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static28.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static460.anInt7719) {
			return false;
		} else if (local7 == Static460.anInt7719) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static437.anInt7308;
			@Pc(26) int local26 = arg2 << Static437.anInt7308;
			if (Static303.method4310(local22 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg2), local26 + 1) && Static303.method4310(local22 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg2), local26 + 1) && Static303.method4310(local22 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg2 + 1), local26 + Static99.anInt1803 - 1) && Static303.method4310(local22 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg2 + 1), local26 + Static99.anInt1803 - 1) && Static303.method4310(local22 + Static22.anInt382, Static178.aClass55Array1[arg0].oa(arg1, arg2), local26 + 1) && Static303.method4310(local22 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg2), local26 + Static22.anInt382) && Static303.method4310(local22 + Static22.anInt382, Static178.aClass55Array1[arg0].oa(arg1, arg2 + 1), local26 + Static99.anInt1803 - 1) && Static303.method4310(local22 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1, arg2), local26 + Static22.anInt382) && Static303.method4310(local22 + Static22.anInt382, Static178.aClass55Array1[arg0].oa(arg1, arg2), local26 + Static22.anInt382)) {
				Static28.anIntArrayArrayArray1[arg0][arg1][arg2] = Static460.anInt7719;
				return true;
			} else {
				Static28.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static460.anInt7719;
				return false;
			}
		}
	}
}
