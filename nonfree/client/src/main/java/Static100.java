import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_25 = new Class349(7, 3);

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!nw;")
	public static final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "[I")
	public static int[] anIntArray153 = new int[2];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!oda;)V")
	public static void method1508(@OriginalArg(1) Class2_Sub34 arg0) {
		Static442.aClass70_45.method1269(arg0);
		arg0.anInt6307 = arg0.aClass2_Sub7_Sub2_2.anInt5186;
		Static94.anInt1654 += arg0.anInt6307;
		arg0.aClass2_Sub7_Sub2_2.anInt5186 = 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1511(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			@Pc(38) long local38 = arg0;
			while (local38 != 0L) {
				local38 /= 37L;
				local36++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static564.aCharArray7[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}
}
