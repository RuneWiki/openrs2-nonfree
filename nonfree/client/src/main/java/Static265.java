import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array13;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_135 = new Class140(200);

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
	public static final int[] anIntArray643 = new int[3];

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
	public static final int[] anIntArray644 = new int[128];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method4611(@OriginalArg(0) int arg0) {
		Static215.anInt4248 = -1;
		if (arg0 == 37) {
			Static342.aFloat38 = 3.0F;
		} else if (arg0 == 50) {
			Static342.aFloat38 = 4.0F;
		} else if (arg0 == 75) {
			Static342.aFloat38 = 6.0F;
		} else if (arg0 == 100) {
			Static342.aFloat38 = 8.0F;
		} else if (arg0 == 200) {
			Static342.aFloat38 = 16.0F;
		}
		Static215.anInt4248 = -1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIB)V")
	public static void method4612(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static277.anIntArray774 = new int[Static337.anInt6402];
		Static35.anIntArray106 = new int[Static337.anInt6402];
		if (!arg0) {
			Static207.aByteArrayArrayArray10 = null;
		}
		Static126.anIntArray296 = new int[Static337.anInt6402];
		Static181.anIntArray443 = new int[5];
		Static159.aByteArrayArrayArray5 = new byte[arg1][Static48.anInt1107][Static337.anInt6402];
		Static341.anInt2257 = 99;
		Static3.aByteArrayArrayArray1 = new byte[arg1][Static48.anInt1107][Static337.anInt6402];
		Static233.aByteArrayArrayArray11 = new byte[arg1][Static48.anInt1107][Static337.anInt6402];
		Static337.aByteArrayArrayArray12 = new byte[arg1][Static48.anInt1107 + 1][Static337.anInt6402 + 1];
		Static213.anIntArrayArrayArray10 = new int[arg1][Static48.anInt1107 + 1][Static337.anInt6402 + 1];
		Static178.aByteArrayArrayArray6 = new byte[arg1][Static48.anInt1107][Static337.anInt6402];
		Static352.anIntArray810 = new int[Static337.anInt6402];
		Static235.anIntArray590 = new int[Static337.anInt6402];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!aa;B)V")
	public static void method4617(@OriginalArg(0) Class2 arg0) {
		if (Static38.aClass195_37.method5026() == 0) {
			return;
		}
		@Pc(51) Class1_Sub8 local51;
		if (Static258.anInt5029 == 0 || Static258.anInt5029 == 2) {
			for (local51 = (Class1_Sub8) Static38.aClass195_37.method5029(); local51 != null; local51 = (Class1_Sub8) Static38.aClass195_37.method5021()) {
				Static116.method2097(false, local51.anInt932, local51.aBoolean82 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null, local51.anInt931, local51.anInt933, false, local51.anInt926, arg0, local51.anInt930, Static105.aClass13_4, arg0);
				local51.method5710();
			}
			Static228.method4134();
			return;
		}
		if (Static20.aClass2_5 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static20.aClass2_5 = Static2.method3301(0, 0, local21, Static180.aClass110_6, Static62.anInterface7_1);
			Static229.aClass13_3 = Static20.aClass2_5.method3306(Static179.method3492(Static236.aClass165_72, Static195.anInt3974), Static363.method3773(Static297.aClass165_88, Static195.anInt3974));
		}
		for (local51 = (Class1_Sub8) Static38.aClass195_37.method5029(); local51 != null; local51 = (Class1_Sub8) Static38.aClass195_37.method5021()) {
			Static116.method2097(false, local51.anInt932, local51.aBoolean82 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null, local51.anInt931, local51.anInt933, false, local51.anInt926, arg0, local51.anInt930, Static229.aClass13_3, Static20.aClass2_5);
			local51.method5710();
		}
	}
}
