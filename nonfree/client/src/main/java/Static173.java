import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
	public static int anInt3695;

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "Lclient!me;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_9;

	@OriginalMember(owner = "client!si", name = "W", descriptor = "I")
	public static final int anInt3688 = 50;

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_19 = new Class20();

	@OriginalMember(owner = "client!si", name = "jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1758 = Static187.method3089("Type");

	@OriginalMember(owner = "client!si", name = "qb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1761 = Static187.method3089("flash3:");

	@OriginalMember(owner = "client!si", name = "lb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1759 = aClass92_1761;

	@OriginalMember(owner = "client!si", name = "nb", descriptor = "Z")
	public static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!si", name = "ob", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1760 = Static187.method3089("Walk here");

	@OriginalMember(owner = "client!si", name = "pb", descriptor = "I")
	public static int anInt3701 = 0;

	@OriginalMember(owner = "client!si", name = "rb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1762 = aClass92_1758;

	@OriginalMember(owner = "client!si", name = "sb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1763 = aClass92_1761;

	@OriginalMember(owner = "client!si", name = "tb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1764 = Static187.method3089("<col=ffffff>");

	@OriginalMember(owner = "client!si", name = "ub", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1765 = aClass92_1760;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	public static void method2739() {
		@Pc(1) Object local1 = Static45.anObject1;
		synchronized (Static45.anObject1) {
			if (Static147.anInt2989 == 0) {
				Static169.aClass24_4.method560(new Class23(), 5);
			}
			Static147.anInt2989 = 600;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBI)V")
	public static void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static123.anInt2601 == 0 || arg1 == 0 || Static45.anInt1163 >= 50 || arg2 == -1) {
			return;
		}
		Static110.anIntArray177[Static45.anInt1163] = arg2;
		Static105.anIntArray172[Static45.anInt1163] = arg1;
		Static87.anIntArray158[Static45.anInt1163] = arg0;
		Static82.aClass4Array1[Static45.anInt1163] = null;
		Static63.anIntArray307[Static45.anInt1163] = 0;
		Static45.anInt1163++;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V")
	public static void method2741() {
		Static101.aClass47_15.method1276();
		Static16.aClass47_5.method1276();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIB)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static46.method3170(arg0, arg2, arg0 + arg1, arg2 - -arg3);
		Static174.method2841();
		Static46.method3173(arg0, arg2, arg1, arg3, 0);
		if (Static131.anInt2743 < 100) {
			return;
		}
		Static4.method94(arg2, arg0, 0, arg3 + arg2, 0, Static90.anInt1950, arg1 + arg0, Static35.anInt988);
		@Pc(50) int local50 = arg0 + arg1 * Static82.anInt1824 / Static90.anInt1950;
		@Pc(58) int local58 = Static193.anInt3063 * arg3 / Static35.anInt988 + arg2;
		@Pc(64) int local64 = Static40.anInt3558 * arg3 / Static35.anInt988;
		@Pc(70) int local70 = arg1 * Static133.anInt2751 / Static90.anInt1950;
		Static46.method3163(local50, local58, local70, local64, 16711680, 128);
		Static46.method3175(local50, local58, local70, local64, 16711680);
		if (Static27.anInt616 <= 0 || Static27.anInt616 % 10 >= 5) {
			return;
		}
		for (@Pc(106) Class1_Sub15 local106 = (Class1_Sub15) Static64.aClass20_4.method467(); local106 != null; local106 = (Class1_Sub15) Static64.aClass20_4.method468()) {
			if (local106.anInt2226 == Static171.anInt3625) {
				@Pc(125) int local125 = arg0 + local106.anInt2225 * arg1 / Static90.anInt1950;
				@Pc(134) int local134 = arg3 * local106.anInt2224 / Static35.anInt988 + arg2;
				Static46.method3173(local125 - 2, local134 - 2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method2743(@OriginalArg(0) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Lclient!ba;")
	public static Class11 method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class11 local15 = Static9.method2342(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass11Array1 == null || local15.aClass11Array1.length <= arg1) {
			return null;
		} else {
			return local15.aClass11Array1[arg1];
		}
	}
}
