import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!va;")
	private static Class61 aClass61_726 = Static88.method1421("Enter name of friend to add to list");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_724 = aClass61_726;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static final int anInt1755 = 50;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static volatile int anInt1756 = -1;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!i;")
	public static Class29 aClass29_47 = new Class29(64);

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_725 = Static88.method1421(" seconds)3");

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_727 = aClass61_725;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!va;")
	private static Class61 aClass61_728 = Static88.method1421("Accept trade");

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!va;")
	private static Class61 aClass61_731 = Static88.method1421("Loading game screen )2 ");

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!va;")
	public static Class61 aClass61_729 = aClass61_731;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static volatile int anInt1759 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_730 = aClass61_728;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method954(@OriginalArg(0) int arg0) {
		Static11.anInt321 += arg0;
		while (Static11.anInt321 >= Static29.anInt894) {
			Static11.anInt321 -= Static29.anInt894;
			Static104.anInt2624 -= Static104.anInt2624 >> 2;
		}
		Static104.anInt2624 -= arg0 * 1000;
		if (Static104.anInt2624 < 0) {
			Static104.anInt2624 = 0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method955() {
		try {
			@Pc(10) Graphics local10 = Static38.aCanvas1.getGraphics();
			Static71.aClass15_28.method594(4, 550, local10);
		} catch (@Pc(20) Exception local20) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method956() {
		aClass61_725 = null;
		aClass61_729 = null;
		aClass61_724 = null;
		aClass61_726 = null;
		aClass61_730 = null;
		aClass61_728 = null;
		aClass61_727 = null;
		aClass29_47 = null;
		aClass61_731 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII[Lclient!cb;IIIII[B)V")
	public static void method957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg6 + local3 > 0 && arg6 + local3 < 103 && local7 + arg7 > 0 && arg7 + local7 < 103) {
					arg2[arg0].anIntArrayArray6[local3 + arg6][local7 + arg7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class10_Sub10 local77 = new Class10_Sub10(arg8);
		for (@Pc(79) int local79 = 0; local79 < 4; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
					if (arg5 == local79 && arg1 <= local83 && arg1 + 8 > local83 && local87 >= arg4 && local87 < arg4 + 8) {
						Static82.method1282(0, arg7 + Static29.method528(local83 & 0x7, local87 & 0x7, arg3), arg3, arg0, 0, arg6 + Static8.method169(local83 & 0x7, local87 & 0x7, arg3), local77);
					} else {
						Static82.method1282(0, -1, 0, 0, 0, -1, local77);
					}
				}
			}
		}
	}
}
