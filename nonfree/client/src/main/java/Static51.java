import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public static int anInt1057;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	public static int anInt1044 = 0;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public static void method869() {
		Static63.anInt1264 = -1;
		Static348.aClass18_26 = null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method872(@OriginalArg(0) Class4 arg0) {
		if (Static207.anInt4908 == arg0.anInt122) {
			Static331.aBooleanArray30[arg0.anInt90] = true;
		}
	}
}
