import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public static int anInt6878;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public static int anInt6887;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "S")
	public static short aShort92 = 32767;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_13 = new Class61(11, 0, 1, 2);

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	public static int[] anIntArray501 = new int[1];

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BD)V")
	public static void method5373(@OriginalArg(1) double arg0) {
		if (arg0 == Static171.aDouble1) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static171.anIntArray222[local15] = local27 > 255 ? 255 : local27;
		}
		Static171.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method5374() {
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static346.anInt5873 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method5377() {
		if (Static408.aClass172_10 != null) {
			Static408.aClass172_10.method5538();
			Static408.aClass172_10 = null;
			Static152.aClass59_1 = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!mq;)V")
	public static void method5380(@OriginalArg(1) Class156 arg0) {
		if (arg0.anInt4792 == 5 && arg0.anInt4826 != -1) {
			Static35.method721(arg0, Static121.aClass172_3);
		}
	}
}
