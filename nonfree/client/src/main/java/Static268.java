import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIZLclient!pu;I)V")
	public static void method4384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class277 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) Static134.aClass338_72.method8177(); local10 != null; local10 = (Class3_Sub8) Static134.aClass338_72.method8168()) {
			if (arg0 == local10.anInt960 && arg1 << 9 == local10.anInt964 && arg3 << 9 == local10.anInt955 && local10.aClass277_1.anInt7714 == arg2.anInt7714) {
				if (local10.aClass3_Sub1_Sub1_1 != null) {
					Static313.aClass3_Sub1_Sub2_1.method931(local10.aClass3_Sub1_Sub1_1);
					local10.aClass3_Sub1_Sub1_1 = null;
				}
				if (local10.aClass3_Sub1_Sub1_2 != null) {
					Static313.aClass3_Sub1_Sub2_1.method931(local10.aClass3_Sub1_Sub1_2);
					local10.aClass3_Sub1_Sub1_2 = null;
				}
				local10.method9380();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
