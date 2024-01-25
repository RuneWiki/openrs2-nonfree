import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt8647;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public static int anInt8649;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!de;")
	public static final Class60 aClass60_10 = new Class60("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!gda;)V")
	public static void method7463(@OriginalArg(0) Class3_Sub1 arg0) {
		Static246.aClass33_6.H(arg0.anInt9925, arg0.anInt9915 + (arg0.method8499() >> 1), arg0.anInt9917, Static370.anIntArray429);
		arg0.anInt9921 = Static370.anIntArray429[0];
		arg0.anInt9914 = Static370.anIntArray429[1];
		arg0.anInt9920 = Static370.anIntArray429[2];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method7464(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static335.aBooleanArray11[arg0]) {
			Static358.aClass34_79.method1250(arg0);
			Static392.aClass199ArrayArray2[arg0] = null;
			Static269.aClass199ArrayArray1[arg0] = null;
			Static335.aBooleanArray11[arg0] = false;
		}
	}
}
