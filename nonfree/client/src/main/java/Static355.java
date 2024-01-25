import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!pm;")
	public static Class259 aClass259_5;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[Lclient!nt;")
	public static final Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array5 = new Class1_Sub3_Sub13[14];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!io;I)Lclient!wl;")
	public static Class175_Sub1_Sub1 method5195(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(12) Class175_Sub1 local12 = Static126.method5474(arg0);
		@Pc(16) int local16 = arg0.method4391();
		return new Class175_Sub1_Sub1(local12.aClass314_13, local12.aClass103_20, local12.anInt9466, local12.anInt9470, local12.anInt9468, local12.anInt9476, local12.anInt9477, local12.anInt9463, local12.anInt9474, local12.anInt9482, local12.anInt9485, local12.anInt9484, local12.anInt9478, local12.anInt9486, local12.anInt9481, local16);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZILclient!ga;III)V")
	public static void method5196(@OriginalArg(0) int arg0, @OriginalArg(3) Class111 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg2 <= 0) {
			Static151.method2397(arg1, arg3, arg0);
			return;
		}
		Static456.anInt7778 = arg0;
		Static69.anInt1589 = arg3;
		Static250.aClass111_52 = arg1;
		Static352.anInt6186 = 1;
		Static21.anInt620 = 0;
		Static564.aBoolean671 = false;
		Static289.anInt5335 = Static504.aClass1_Sub8_Sub3_33.method4637() / arg2;
		if (Static289.anInt5335 < 1) {
			Static289.anInt5335 = 1;
			return;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ci;Z)Z")
	public static boolean method5198(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		Static301.aClass209_5.method6358(arg1.anIntArray85[arg0], arg1.anIntArray86[arg0], arg1.anIntArray87[arg0], Static299.anIntArray350);
		@Pc(22) int local22 = Static299.anIntArray350[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray19[arg0] = (short) (Static446.anInt7726 + Static465.anInt7899 * Static299.anIntArray350[0] / local22);
			arg1.aShortArray18[arg0] = (short) (Static544.anInt8951 + Static425.anInt7203 * Static299.anIntArray350[1] / local22);
			arg1.aShortArray17[arg0] = (short) local22;
			return true;
		}
	}
}
