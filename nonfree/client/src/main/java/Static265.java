import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lclient!lk;")
	public static Class203 aClass203_82 = null;

	@OriginalMember(owner = "client!kaa", name = "O", descriptor = "I")
	public static int anInt4979 = 0;

	@OriginalMember(owner = "client!kaa", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[200];

	@OriginalMember(owner = "client!kaa", name = "Q", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!kaa", name = "S", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_153 = new Class272(44, 2);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V")
	public static void method4348() {
		Static311.anInt5615 = Static511.anInt8116;
		Static227.anInt4402 = 0;
		Static333.anInt5940 = 0;
		Static123.anInt2786 = 0;
		Static436.aClass241Array30 = new Class241[2000];
		Static477.aClass241Array33 = new Class241[1000];
		Static164.aBoolean268 = false;
		Static351.anInt6124 = Static511.anInt8116;
		Static429.anIntArrayArrayArray14 = new int[Static499.anInt7950][Static411.anInt6927 + 1][Static157.anInt3168 + 1];
		Static476.aClass241Array35 = new Class241[500];
		Static236.anInt4467 = 0;
		Static466.aClass241Array37 = new Class241[500];
		if (Static482.aClass43_12 instanceof l) {
			Static32.aBoolean54 = false;
		} else {
			Static32.aBoolean54 = true;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "(I)V")
	public static void method4350() {
		if (Static409.aClass221_6.aBoolean483) {
			Static597.anInt9433 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static597.anInt9433 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}
}
