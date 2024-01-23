import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	public static volatile int anInt4964 = 0;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString191 = "glow2:";

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
	public static int method4146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static210.method3476(4, arg1 + 45365, arg0 + 91923) + (Static210.method3476(2, arg1 + 10294, arg0 + 37821) + -128 >> 1) + (Static210.method3476(1, arg1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
	public static int method4147() {
		if (Static196.aFrame1 != null) {
			return 3;
		} else if (Static71.aBoolean165 && Static202.aBoolean350) {
			return 2;
		} else if (Static71.aBoolean165 && !Static202.aBoolean350) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)Lclient!bn;")
	public static Class18 method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass18_1;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	public static void method4149() {
		if (Static213.anInt5512 > 0) {
			Static218.method3536();
		} else {
			Static302.aClass49_4 = Static97.aClass49_2;
			Static97.aClass49_2 = null;
			Static197.method3406(40);
		}
	}
}
