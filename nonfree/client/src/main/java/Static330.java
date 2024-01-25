import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_203 = new Class56(14, 6);

	@OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
	public static int anInt5369 = 0;

	@OriginalMember(owner = "client!qm", name = "Z", descriptor = "I")
	public static int anInt5370 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	public static int method4345(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local27 * arg0 >> 12) + 40960;
		return local21 * local35 >> 12;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public static void method4350() {
		Static425.aClient1.method738();
		Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
		Static149.aClass56_102 = null;
		Static414.aClass56_249 = null;
		Static385.anInt6297 = 0;
		Static7.aClass56_7 = null;
		Static77.anInt1536 = 0;
		Static284.anInt4667 = 0;
		Static451.aClass56_267 = null;
		Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static394.aStringArray24[local30] = null;
		}
		Static343.anInt5686 = 0;
		Static423.anInt7106 = 0;
		Static272.aString37 = null;
		Static284.anInt4659 = 0;
		Static87.anInt1666 = 0;
		Static404.aClass130Array1 = null;
	}
}
