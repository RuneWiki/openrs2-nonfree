import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt8751;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt8756;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!lc;")
	public static Class207 aClass207_5;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[I")
	public static int[] anIntArray623;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
	public static boolean aBoolean692 = false;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString106 = null;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FIFFI)F")
	public static float method7509(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(12) float[] local12 = Static271.aFloatArrayArray9[arg3];
		return arg1 * local12[1] + local12[0] * arg2 + arg0 * local12[2];
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method7512(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt9945 - Static177.anInt3088;
		@Pc(22) int local22 = arg0.anInt9952 * 512 + arg0.method8514() * 256;
		@Pc(33) int local33 = arg0.anInt9969 * 512 + arg0.method8514() * 256;
		arg0.anInt10002 = 0;
		arg0.anInt9925 += (local22 - arg0.anInt9925) / local8;
		arg0.anInt9917 += (local33 - arg0.anInt9917) / local8;
		if (arg0.anInt9979 == 0) {
			arg0.method8524(8192);
		}
		if (arg0.anInt9979 == 1) {
			arg0.method8524(12288);
		}
		if (arg0.anInt9979 == 2) {
			arg0.method8524(0);
		}
		if (arg0.anInt9979 == 3) {
			arg0.method8524(4096);
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public static void method7513() {
		if (Static3.aClass33_5 != null) {
			Static3.aClass33_5.method8070();
			Static3.aClass33_5 = null;
			Static298.aClass56_16 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!bo;")
	public static Class4_Sub5_Sub4 method7516(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub5_Sub4 local10 = (Class4_Sub5_Sub4) Static330.aClass300_2.method6604((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static338.aClass34_73.method1239(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local10 = Static468.method6480(local25);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static330.aClass300_2.method6600((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z")
	public static boolean method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static310.method4315(arg0, arg1) | Static562.method7444(arg1, arg0) | Static260.method7099(arg1, arg0)) & Static598.method7849(arg0, arg1);
	}
}
