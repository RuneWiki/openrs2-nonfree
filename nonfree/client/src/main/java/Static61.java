import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ld", name = "kb", descriptor = "I")
	public static int anInt1514;

	@OriginalMember(owner = "client!ld", name = "Sb", descriptor = "I")
	public static int anInt1536;

	@OriginalMember(owner = "client!ld", name = "pc", descriptor = "Lclient!je;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_778 = Static75.method1216("You have only just left another world)3");

	@OriginalMember(owner = "client!ld", name = "lb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_20 = new Class8(64);

	@OriginalMember(owner = "client!ld", name = "Qb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_779 = aClass4_778;

	@OriginalMember(owner = "client!ld", name = "bc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_780 = Static75.method1216("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!ld", name = "fc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_781 = Static75.method1216("Hidden");

	@OriginalMember(owner = "client!ld", name = "hc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_782 = Static75.method1216(" seconds)3");

	@OriginalMember(owner = "client!ld", name = "jc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_783 = aClass4_781;

	@OriginalMember(owner = "client!ld", name = "mc", descriptor = "I")
	public static int anInt1549 = 0;

	@OriginalMember(owner = "client!ld", name = "nc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_784 = Static75.method1216("Benutzername: ");

	@OriginalMember(owner = "client!ld", name = "qc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_785 = aClass4_782;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
	public static void method1032() {
		aClass4_780 = null;
		aClass4_783 = null;
		aClass4_779 = null;
		aClass7_1 = null;
		aClass8_20 = null;
		aClass4_785 = null;
		aClass4_778 = null;
		aClass4_782 = null;
		aClass4_784 = null;
		aClass4_781 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Color;Lclient!ad;I)V")
	public static void method1033(@OriginalArg(1) Color arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static9.aCanvas1.getGraphics();
			if (Static11.aFont47 == null) {
				Static11.aFont47 = new Font("Helvetica", 1, 13);
				Static77.aFontMetrics1 = Static9.aCanvas1.getFontMetrics(Static11.aFont47);
			}
			if (Static103.aBoolean216) {
				Static103.aBoolean216 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static7.anInt280, Static42.anInt1136);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static111.anImage4 == null) {
					Static111.anImage4 = Static9.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static111.anImage4.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static11.aFont47);
				local47.setColor(Color.white);
				arg1.method158((304 - arg1.method129(Static77.aFontMetrics1)) / 2, local47, 22);
				local2.drawImage(Static111.anImage4, Static7.anInt280 / 2 - 152, Static42.anInt1136 / 2 - 18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static7.anInt280 / 2 - 152;
				@Pc(145) int local145 = Static42.anInt1136 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local139, local145, 303, 33);
				local2.fillRect(local139 + 2, local145 - -2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local139 + 1, local145 + 1, 301, 31);
				local2.fillRect(local139 + arg2 * 3 + 2, local145 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static11.aFont47);
				local2.setColor(Color.white);
				arg1.method158((304 - arg1.method129(Static77.aFontMetrics1)) / 2 + local139, local2, local145 + 22);
			}
		} catch (@Pc(224) Exception local224) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lclient!od;")
	public static Class3_Sub1_Sub9 method1034(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub9 local12 = (Class3_Sub1_Sub9) Static1.aClass8_1.method195((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static89.aClass64_57.method1625(3, arg0);
		local12 = new Class3_Sub1_Sub9();
		if (local24 != null) {
			local12.method1220(new Class3_Sub4(local24));
		}
		Static1.aClass8_1.method199((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(BIII)I")
	public static int method1036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg2;
		return (arg2 * (arg1 & 0xFF00) + (arg0 & 0xFF00) * local13 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg2 + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) >> 8;
	}
}
