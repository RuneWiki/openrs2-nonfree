import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!tn;")
	public static final Class240 aClass240_2 = new Class240();

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public static int anInt3841 = -50;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt3842 = 0;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_17 = new Class168(11, 4);

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILclient!lv;)V")
	public static void method3040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24_Sub4 arg3) {
		@Pc(4) Class11 local4 = Static21.method286(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass24_Sub4_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public static void method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass24_Sub4_1 != null) {
			local7.aClass24_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method3044() {
		Static197.anInt3947 = 0;
		@Pc(13) int local13 = (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7) + Static168.anInt3353;
		@Pc(27) int local27 = Static72.anInt1488 + (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static197.anInt3947 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static197.anInt3947 = 1;
		}
		if (Static197.anInt3947 == 1 && local13 >= 3139 && local13 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static197.anInt3947 = 0;
		}
	}
}
