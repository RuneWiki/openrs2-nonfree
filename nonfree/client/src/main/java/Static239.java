import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray10 = new Rectangle[100];

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	public static int anInt5772 = 0;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "[C")
	public static final char[] aCharArray15 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!dt;II)V")
	public static void method5185(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static188.aClass62_12 = arg0;
		Static172.anInt3651 = arg2;
		Static156.anInt2803 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	public static void method5186() {
		if (Static13.aBoolean407) {
			Static364.aClass110_20 = null;
			Static13.aBoolean407 = false;
			Static69.aClass110_2 = null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
	public static void method5187() {
		Static346.aClass110_17 = null;
		Static91.anInt2989 = -1;
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)V")
	public static void method5189() {
		Static390.aClass44_37.method952();
	}
}
