import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Z")
	public static boolean aBoolean278;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int anInt4444;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray15 = new byte[1000][];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public static int anInt4443 = 0;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString297 = "slide:";

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
	public static int[] anIntArray396 = new int[1000];

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean279 = true;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	public static int anInt4447 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3266(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local31++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local54.append(Static309.aCharArray7[(int) (local60 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Lclient!wf;")
	public static Class191 method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class191 local13 = Static171.method2789(arg1);
		if (arg0 == -1) {
			return local13;
		} else if (local13 == null || local13.aClass191Array2 == null || local13.aClass191Array2.length <= arg0) {
			return null;
		} else {
			return local13.aClass191Array2[arg0];
		}
	}
}
