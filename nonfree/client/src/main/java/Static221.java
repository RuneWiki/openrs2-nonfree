import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "[I")
	public static final int[] anIntArray238 = new int[64];

	@OriginalMember(owner = "client!ku", name = "I", descriptor = "Lclient!aw;")
	public static final Class17 aClass17_2 = new Class17(16);

	@OriginalMember(owner = "client!ku", name = "T", descriptor = "[I")
	public static final int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!jk;)Ljava/lang/String;")
	public static String method3234(@OriginalArg(1) int arg0, @OriginalArg(2) Class124 arg1) {
		if (!Static55.method970(arg1).method2817(arg0) && arg1.anObjectArray28 == null) {
			return null;
		} else if (arg1.aStringArray17 == null || arg1.aStringArray17.length <= arg0 || arg1.aStringArray17[arg0] == null || arg1.aStringArray17[arg0].trim().length() == 0) {
			return Static239.aBoolean665 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray17[arg0];
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V")
	public static void method3237(@OriginalArg(0) byte arg0) {
		if (Static41.aByteArrayArrayArray4 == null) {
			Static41.aByteArrayArrayArray4 = new byte[4][Static296.anInt5187][Static206.anInt3607];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static296.anInt5187; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static206.anInt3607; local27++) {
					Static41.aByteArrayArrayArray4[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I[SI)[S")
	public static short[] method3238(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static468.method5035(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
