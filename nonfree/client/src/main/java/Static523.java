import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
	public static int anInt9350;

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
	public static int anInt9351;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_204 = new Class362(18, -1);

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[100];

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public static void method7617() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static261.aBooleanArray18[local7] = true;
		}
	}
}
