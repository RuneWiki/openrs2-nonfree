import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1331 = Static169.method2903("Cancel");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1332 = aClass23_1331;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1333 = Static169.method2903("Loaded textures");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1336 = Static169.method2903("Type");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1334 = aClass23_1336;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1338 = Static169.method2903("This computers address has been blocked");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1335 = aClass23_1338;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1337 = Static169.method2903("as it was used to break our rules)3");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt3552 = 0;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1339 = Static169.method2903("Angreifen");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
	public static int[] anIntArray471 = new int[5];

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1340 = aClass23_1333;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public static volatile int anInt3553 = 0;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1341 = aClass23_1337;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "[I")
	public static int[] anIntArray472 = new int[256];

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
	public static int[] anIntArray473 = new int[50];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZILjava/awt/Color;Lclient!ed;)V")
	public static void method2442(@OriginalArg(1) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Class23 arg2) {
		try {
			@Pc(6) Graphics local6 = Static91.aCanvas1.getGraphics();
			if (Static99.aFont1 == null) {
				Static99.aFont1 = new Font("Helvetica", 1, 13);
				Static55.aFontMetrics1 = Static91.aCanvas1.getFontMetrics(Static99.aFont1);
			}
			if (Static181.aBoolean217) {
				Static181.aBoolean217 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static23.anInt699, Static114.anInt2943);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static19.anImage1 == null) {
					Static19.anImage1 = Static91.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static19.anImage1.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static99.aFont1);
				local51.setColor(Color.white);
				arg2.method633(local51, 22, (304 - arg2.method646(Static55.aFontMetrics1)) / 2);
				local6.drawImage(Static19.anImage1, Static23.anInt699 / 2 - 152, Static114.anInt2943 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static23.anInt699 / 2 - 152;
				@Pc(145) int local145 = Static114.anInt2943 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local139, local145, 303, 33);
				local6.fillRect(local139 + 2, local145 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local139 + 1, local145 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local139 + 2, local145 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static99.aFont1);
				local6.setColor(Color.white);
				arg2.method633(local6, local145 + 22, (304 - arg2.method646(Static55.aFontMetrics1)) / 2 + local139);
			}
		} catch (@Pc(222) Exception local222) {
			Static91.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2444(@OriginalArg(0) Component arg0) {
		@Pc(12) Method local12 = Static143.aMethod2;
		if (local12 != null) {
			try {
				local12.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		arg0.addKeyListener(Static129.aClass35_1);
		arg0.addFocusListener(Static129.aClass35_1);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZLclient!ga;II)V")
	public static void method2445(@OriginalArg(2) int arg0, @OriginalArg(4) Class30 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static1.anInt221 = arg3;
		Static141.anInt3602 = 1;
		Static95.anInt2455 = 2;
		Static137.anInt3502 = arg0;
		Static84.aBoolean219 = false;
		Static7.anInt331 = arg2;
		Static5.aClass30_67 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method2446() {
		aClass23_1335 = null;
		aClass23_1336 = null;
		aClass23_1334 = null;
		anIntArray471 = null;
		anIntArray473 = null;
		aClass23_1333 = null;
		aClass23_1341 = null;
		aClass23_1338 = null;
		aClass23_1339 = null;
		aClass23_1332 = null;
		anIntArray472 = null;
		aClass23_1331 = null;
		aClass23_1337 = null;
		aClass23_1340 = null;
	}
}
