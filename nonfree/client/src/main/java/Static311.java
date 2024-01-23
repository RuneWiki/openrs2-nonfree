import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
	public static int anInt5590;

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
	public static int anInt5591;

	@OriginalMember(owner = "client!wi", name = "P", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
	public static int anInt5588 = 0;

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "Lclient!jo;")
	public static Class96 aClass96_28 = new Class96();

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
	public static int anInt5589 = -1;

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[5];

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "[I")
	public static int[] anIntArray610 = new int[14];

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)Lclient!bl;")
	public static Class16 method4642(@OriginalArg(1) int arg0) {
		@Pc(15) Class16 local15 = (Class16) Static120.aClass175_20.method4295((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static259.aClass119_81.method3235(Static302.method4525(arg0), Static13.method188(arg0));
		local15 = new Class16();
		if (local29 != null) {
			local15.method504(new Class1_Sub13(local29));
		}
		Static120.aClass175_20.method4285(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIII)V")
	public static void method4643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg4; local7++) {
			Static103.method1978(arg3, arg1, arg2, Static40.anIntArrayArray6[local7]);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4644() {
		@Pc(29) String local29;
		if (Static101.anInt2152 == 1 && Static241.anInt4470 < 2) {
			local29 = Static253.aString167 + Static265.aString187 + Static199.aString133 + " ->";
		} else if (Static187.aBoolean318 && Static241.anInt4470 < 2) {
			local29 = Static132.aString88 + Static265.aString187 + Static176.aString113 + " ->";
		} else if (Static17.aBoolean36 && Static1.aBooleanArray1[81] && Static241.anInt4470 > 2) {
			local29 = Static42.method774(Static241.anInt4470 - 2);
		} else {
			local29 = Static42.method774(Static241.anInt4470 - 1);
		}
		if (Static241.anInt4470 > 2) {
			local29 = local29 + "<col=ffffff> / " + (Static241.anInt4470 - 2) + Static279.aString196;
		}
		return local29;
	}
}
