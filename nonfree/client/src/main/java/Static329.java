import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "Lclient!wp;")
	public static Class363 aClass363_162;

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "J")
	public static long aLong153;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_4 = new Class190();

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!pl;B)V")
	public static void method5052(@OriginalArg(0) Class259 arg0) {
		Static377.anInt6694 = arg0.method5961("p11_full");
		Static230.anInt4311 = arg0.method5961("p12_full");
		Static295.anInt8551 = arg0.method5961("b12_full");
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public static void method5053() {
		Static529.aClass177_10.method4004();
		Static326.aClass149_1.method5880();
		Static413.aClient1.method1073();
		Static471.aCanvas12.setBackground(Color.black);
		Static252.anInt4688 = -1;
		Static529.aClass177_10 = Static551.method7465(Static471.aCanvas12);
		Static326.aClass149_1 = Static426.method6106(Static471.aCanvas12);
	}
}
