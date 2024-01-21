import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ed", name = "Ob", descriptor = "Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!ed", name = "Yb", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_5;

	@OriginalMember(owner = "client!ed", name = "qb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_362 = Static2.method66("Walk here");

	@OriginalMember(owner = "client!ed", name = "sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_363 = Static2.method66("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ed", name = "wb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_364 = Static2.method66("Loaded sprites");

	@OriginalMember(owner = "client!ed", name = "yb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_365 = aClass39_362;

	@OriginalMember(owner = "client!ed", name = "Sb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_369 = Static2.method66("Login limit exceeded)3");

	@OriginalMember(owner = "client!ed", name = "Lb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_366 = aClass39_369;

	@OriginalMember(owner = "client!ed", name = "Mb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_367 = aClass39_364;

	@OriginalMember(owner = "client!ed", name = "Nb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_368 = Static2.method66("Weiter");

	@OriginalMember(owner = "client!ed", name = "Pb", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array7 = new Class39[500];

	@OriginalMember(owner = "client!ed", name = "Wb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_370 = Static2.method66("white:");

	@OriginalMember(owner = "client!ed", name = "bc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_371 = aClass39_370;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method548(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static105.aClass29_1);
		arg0.addMouseMotionListener(Static105.aClass29_1);
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)V")
	public static void method551() {
		try {
			@Pc(2) Graphics local2 = Static7.aCanvas1.getGraphics();
			Static55.aClass51_34.method1967(17, 357, local2);
		} catch (@Pc(18) Exception local18) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method552() {
		aClass39_370 = null;
		aClass39_362 = null;
		aClass2_Sub1_Sub4_Sub3_5 = null;
		aClass39_365 = null;
		aClass39Array7 = null;
		aClass2_Sub1_Sub4_Sub2_2 = null;
		aClass39_369 = null;
		aClass39_368 = null;
		aClass39_366 = null;
		aClass39_363 = null;
		aClass39_367 = null;
		aClass39_364 = null;
		aClass39_371 = null;
	}
}
