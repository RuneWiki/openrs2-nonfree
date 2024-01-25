import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!eja", name = "k", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!eja", name = "f", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(III)Z")
	public static boolean method2457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(I)Lclient!pv;")
	public static Class3_Sub7_Sub18 method2459() {
		return Static327.aClass3_Sub7_Sub18_2;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!nt;Z)V")
	public static void method2463(@OriginalArg(1) Class270 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = arg0.anInt7037 == 0 ? arg0.anInt7015 : arg0.anInt7037;
		@Pc(26) int local26 = arg0.anInt7013 == 0 ? arg0.anInt7045 : arg0.anInt7013;
		Static62.method1416(Static172.aClass270ArrayArray2[arg0.anInt6973 >> 16], arg1, local13, arg0.anInt6973, local26);
		if (arg0.aClass270Array2 != null) {
			Static62.method1416(arg0.aClass270Array2, arg1, local13, arg0.anInt6973, local26);
		}
		@Pc(61) Class3_Sub20 local61 = (Class3_Sub20) Static432.aClass313_34.method7104((long) arg0.anInt6973);
		if (local61 != null) {
			Static392.method5315(local61.anInt2493, local26, arg1, local13);
		}
	}
}
