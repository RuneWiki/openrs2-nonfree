import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt9401;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!km;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public static int anInt9407 = 1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZ)V")
	public static void method7654(@OriginalArg(1) boolean arg0) {
		Static92.method2160();
		if (!Static564.method7850(Static435.anInt8191)) {
			return;
		}
		Static271.anInt5723++;
		if (Static271.anInt5723 < 50 && !arg0) {
			return;
		}
		Static271.anInt5723 = 0;
		if (!Static306.aBoolean441 && Static319.aClass240_2 != null) {
			@Pc(42) Class8_Sub31 local42 = Static51.method1418(Static8.aClass257_4, Static608.aClass336_1);
			Static262.method4604(local42);
			try {
				Static441.method6809();
			} catch (@Pc(49) IOException local49) {
				Static306.aBoolean441 = true;
			}
		}
		Static92.method2160();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method7657() {
		if (!Static78.aBoolean179) {
			Static462.aFloat183 += (-24.0F - Static462.aFloat183) / 2.0F;
			Static78.aBoolean179 = true;
			Static69.aBoolean558 = true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Z")
	public static boolean method7658(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
