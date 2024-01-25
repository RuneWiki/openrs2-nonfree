import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static637 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public static int anInt10333;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt10328 = 0;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public static int anInt10329 = -1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vfa;I)V")
	public static void method8778(@OriginalArg(0) Class357 arg0) {
		if (arg0.anInt9874 == Static250.anInt4221) {
			Static609.aBooleanArray58[arg0.anInt9857] = true;
		}
	}
}
