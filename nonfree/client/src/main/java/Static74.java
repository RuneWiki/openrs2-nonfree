import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!en", name = "F", descriptor = "Lclient!pg;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!en", name = "K", descriptor = "Lclient!mo;")
	public static Class143 aClass143_99;

	@OriginalMember(owner = "client!en", name = "N", descriptor = "I")
	public static int anInt5349;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "[I")
	public static final int[] anIntArray483 = new int[1000];

	@OriginalMember(owner = "client!en", name = "J", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!en", name = "O", descriptor = "I")
	public static int anInt5350 = 10;

	@OriginalMember(owner = "client!en", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString200 = "shake:";

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IJ)V")
	public static void method4761(@OriginalArg(1) long arg0) {
		if (Static98.aClass213ArrayArrayArray2 != null) {
			if (Static205.anInt4115 == 1 || Static205.anInt4115 == 5) {
				Static165.method4552(arg0);
			} else if (Static205.anInt4115 == 4) {
				Static156.method5350(arg0);
			}
		}
		Static153.method3021(Static218.aClass46_5, (long) Static153.anInt3257);
		if (Static324.anInt6226 != -1) {
			Static164.method3269(Static324.anInt6226);
		}
		for (@Pc(46) int local46 = 0; local46 < Static304.anInt5859; local46++) {
			if (Static338.aBooleanArray29[local46]) {
				Static194.aBooleanArray17[local46] = true;
			}
			Static127.aBooleanArray14[local46] = Static338.aBooleanArray29[local46];
			Static338.aBooleanArray29[local46] = false;
		}
		Static331.anInt6394 = Static153.anInt3257;
		if (Static218.aClass46_5.method5160()) {
			Static1.aBoolean433 = true;
		}
		Static294.aClass146_54 = null;
		if (Static324.anInt6226 != -1) {
			Static304.anInt5859 = 0;
			Static343.method5860();
		}
		Static218.aClass46_5.method5139();
		Static254.method4388(Static218.aClass46_5);
		@Pc(95) int local95 = Static106.method2296();
		if (local95 == -1) {
			local95 = Static29.anInt4694;
		}
		Static160.method3100(local95);
		Static108.method2349(Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910, Static219.anInt4400, Static71.anInt5636, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908);
		Static71.anInt5636 = 0;
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	public static void method4762() {
		if (Static345.anIntArray635 != null && Static153.anIntArray287 != null) {
			return;
		}
		Static345.anIntArray635 = new int[256];
		Static153.anIntArray287 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static345.anIntArray635[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static153.anIntArray287[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI)I")
	public static int method4764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static309.anIntArray532[arg1 & 0x3] : 256;
	}
}
