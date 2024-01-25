import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	public static int anInt10872;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "[I")
	public static int[] anIntArray780;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
	public static int anInt10879;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ika;I)V")
	public static void method9232(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static274.anInt4207; local7++) {
			@Pc(17) int local17 = arg0.method2054();
			@Pc(23) int local23 = arg0.method2028(-14795);
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static612.aClass238_Sub1Array2[local17] != null) {
				Static612.aClass238_Sub1Array2[local17].anInt6065 = local23;
			}
		}
		if (16257 != 16257) {
			method9234(-84, 112, -17);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
	public static boolean method9234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 21635) {
			return Static524.method7014(arg2, arg1) || Static148.method2490(arg1, arg2);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!hla;I)Ljava/lang/String;")
	public static String method9236(@OriginalArg(0) Class3_Sub7_Sub10 arg0) {
		if (arg0.aString57 == null || arg0.aString57.length() == 0) {
			return arg0.aString58 == null || arg0.aString58.length() <= 0 ? arg0.aString56 : arg0.aString56 + Static430.aClass257_31.method5699(Static456.anInt7118) + arg0.aString58;
		} else if (arg0.aString58 == null || arg0.aString58.length() <= 0) {
			return arg0.aString56 + Static430.aClass257_31.method5699(Static456.anInt7118) + arg0.aString57;
		} else {
			return arg0.aString56 + Static430.aClass257_31.method5699(Static456.anInt7118) + arg0.aString58 + Static430.aClass257_31.method5699(Static456.anInt7118) + arg0.aString57;
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(II)I")
	public static int method9237(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
