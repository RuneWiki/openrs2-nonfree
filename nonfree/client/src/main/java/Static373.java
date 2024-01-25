import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
	public static final int[] anIntArray490 = new int[3];

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!pba;)Z")
	public static boolean method5569(@OriginalArg(1) Interface18 arg0) {
		@Pc(15) Class252 local15 = Static412.aClass307_4.method6636(arg0.method6265());
		if (local15.anInt6886 == -1) {
			return true;
		} else {
			@Pc(28) Class179 local28 = Static418.aClass3_4.method60(local15.anInt6886);
			return local28.anInt5139 == -1 ? true : local28.method4419();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIB)V")
	public static void method5570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class348 local17 = Static587.aClass348ArrayArray1[arg1][arg2];
		Static486.method6668(arg0, local17 == null ? Static162.aClass348_2 : local17);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5571(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static574.anInt9426; local16++) {
			if (arg0.equalsIgnoreCase(Static398.aStringArray29[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63);
	}
}
