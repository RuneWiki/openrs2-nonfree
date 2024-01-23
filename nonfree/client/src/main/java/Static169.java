import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "Lclient!tb;")
	public static Class2_Sub27 aClass2_Sub27_2;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "Z")
	public static boolean aBoolean248;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "I")
	public static int anInt3730 = 0;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public static int anInt3735 = 0;

	@OriginalMember(owner = "client!m", name = "kb", descriptor = "[C")
	public static char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
	public static void method3079() {
		if (Static250.aFloat31 > Static250.aFloat32) {
			Static250.aFloat32 = (float) ((double) Static250.aFloat32 + (double) Static250.aFloat32 / 30.0D);
			if (Static250.aFloat32 > Static250.aFloat31) {
				Static250.aFloat32 = Static250.aFloat31;
			}
			Static202.method2140();
		} else if (Static250.aFloat32 > Static250.aFloat31) {
			Static250.aFloat32 = (float) ((double) Static250.aFloat32 - (double) Static250.aFloat32 / 30.0D);
			if (Static250.aFloat31 > Static250.aFloat32) {
				Static250.aFloat32 = Static250.aFloat31;
			}
			Static202.method2140();
		}
		if (Static18.anInt388 != -1 && Static54.anInt1326 != -1) {
			@Pc(65) int local65 = Static54.anInt1326 - Static67.anInt1659;
			@Pc(70) int local70 = Static18.anInt388 - Static237.anInt4776;
			if (local65 < 2 || local65 > 2) {
				local65 >>= 0x4;
			}
			if (local70 < 2 || local70 > 2) {
				local70 >>= 0x4;
			}
			Static237.anInt4776 -= -local70;
			if (local70 == 0 && local65 == 0) {
				Static18.anInt388 = -1;
				Static54.anInt1326 = -1;
			}
			Static67.anInt1659 += local65;
			Static202.method2140();
		}
		if (Static10.anInt171 > 0) {
			Static225.anInt5333--;
			if (Static225.anInt5333 == 0) {
				Static10.anInt171--;
				Static225.anInt5333 = 100;
			}
		} else {
			Static122.anInt2705 = -1;
			Static166.anInt3676 = -1;
		}
		if (!Static113.aBoolean168 || Static94.aClass44_9 == null) {
			return;
		}
		for (@Pc(157) Class2_Sub24 local157 = (Class2_Sub24) Static94.aClass44_9.method1352(); local157 != null; local157 = (Class2_Sub24) Static94.aClass44_9.method1360()) {
			@Pc(165) Class10 local165 = Static48.method890(local157.aClass2_Sub8_Sub21_1.anInt4970);
			if (Static28.anInt626 == 0 && local157.method3770(Static131.anInt3016, Static281.anInt5551)) {
				if (!local157.aClass2_Sub8_Sub21_1.aBoolean326) {
					local157.aClass2_Sub8_Sub21_1.aBoolean326 = true;
					Static301.method4575(local157.aClass2_Sub8_Sub21_1.anInt4970, local165.anInt155, 15);
				}
				if (local157.aClass2_Sub8_Sub21_1.aBoolean326) {
					Static301.method4575(local157.aClass2_Sub8_Sub21_1.anInt4970, local165.anInt155, 17);
				}
			} else if (local157.aClass2_Sub8_Sub21_1.aBoolean326) {
				local157.aClass2_Sub8_Sub21_1.aBoolean326 = false;
				Static301.method4575(local157.aClass2_Sub8_Sub21_1.anInt4970, local165.anInt155, 16);
			}
		}
	}
}
