import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_164 = new Class211(72, 2);

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	public static int anInt6410 = 0;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray89 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILclient!je;I)V")
	public static void method5571(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		Static329.aClass117_10 = arg1;
		Static266.anInt4620 = arg2;
		Static284.anInt4915 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)I")
	public static int method5572(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
