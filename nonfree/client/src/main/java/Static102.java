import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "Lclient!k;")
	public static Class114 aClass114_3;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZ)V")
	public static void method1554(@OriginalArg(0) boolean arg0) {
		Static168.method2723();
		if (Static245.anInt6561 != 30 && Static245.anInt6561 != 25) {
			return;
		}
		Static172.anInt3418++;
		if (Static172.anInt3418 < 50 && !arg0) {
			return;
		}
		Static172.anInt3418 = 0;
		if (!Static314.aBoolean140 && Static291.aClass156_103 != null) {
			Static313.aClass11_Sub25_Sub1_5.method2454(61);
			try {
				Static291.aClass156_103.method4183(Static313.aClass11_Sub25_Sub1_5.aByteArray93, Static313.aClass11_Sub25_Sub1_5.anInt6076);
				Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
			} catch (@Pc(53) IOException local53) {
				Static314.aBoolean140 = true;
			}
		}
		Static168.method2723();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
	public static int method1555(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gr;III)V")
	public static void method1556(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static117.anIntArrayArrayArray9[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt4161 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass11_Sub5_Sub1Array3[arg0.anInt4161++] = Static171.aClass11_Sub5_Sub1Array2[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt4161; local19 < 4; local19++) {
			arg0.aClass11_Sub5_Sub1Array3[local19] = null;
		}
	}
}
