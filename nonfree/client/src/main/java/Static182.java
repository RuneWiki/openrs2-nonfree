import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!lp;")
	public static Class155 aClass155_5;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	public static final int[] anIntArray292 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "[I")
	public static final int[] anIntArray293 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
	public static final byte[] aByteArray42 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([SB)[S")
	public static short[] method2834(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static459.method5351(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
	public static void method2838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static298.method4373(Static424.aClass25_7);
		}
		if (arg2 == 1) {
			Static298.method4373(Static241.aClass25_59);
		}
		Static449.aClass6_Sub15_Sub1_2.method3117(arg1 + Static99.anInt1814);
		Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
		Static449.aClass6_Sub15_Sub1_2.method3100(Static206.anInt3592 + arg0);
		Static278.anInt4731 = arg0;
		Static58.anInt1221 = arg1;
		Static305.aBoolean353 = false;
		Static190.method2937();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)Z")
	public static boolean method2839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static192.method3032(arg0, arg1) | (arg1 & 0x70000) != 0 || Static371.method5157(arg1, arg0);
	}
}
