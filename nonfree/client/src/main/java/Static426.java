import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	public static int anInt7338 = 0;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method6085(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static383.method5682(Static551.method7610(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLclient!gba;)V")
	public static void method6086(@OriginalArg(1) Class115 arg0) {
		if (arg0.anInt3509 != Static396.anInt6920) {
			return;
		}
		if (Static129.aClass10_Sub1_Sub2_Sub2_1.aString93 == null) {
			arg0.anInt3508 = 0;
			arg0.anInt3454 = 0;
			return;
		}
		arg0.anInt3444 = 150;
		arg0.anInt3492 = (int) (Math.sin((double) Static237.anInt7561 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3508 = Static416.anInt7186;
		arg0.anInt3445 = 5;
		arg0.anInt3454 = Static593.method7991(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93);
		arg0.anInt3460 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8518;
		arg0.anInt3524 = 0;
		arg0.anInt3491 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8484;
		arg0.anInt3494 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8491;
		@Pc(72) Class77 local72 = arg0.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(arg0.anInt3494);
		if (local72 != null) {
			Static443.method6270(arg0.anInt3460, local72);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public static void method6087() {
		@Pc(5) Class223 local5 = Static476.aClass223_57;
		synchronized (Static476.aClass223_57) {
			Static476.aClass223_57.method4932();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
	public static void method6089() {
		Static458.aClass115ArrayArray2 = new Class115[Static552.aClass31_118.method675()][];
		Static355.aClass115ArrayArray1 = new Class115[Static552.aClass31_118.method675()][];
		Static448.aBooleanArray32 = new boolean[Static552.aClass31_118.method675()];
	}
}
