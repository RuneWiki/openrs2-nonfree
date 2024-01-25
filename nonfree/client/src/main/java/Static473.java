import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "Lclient!ni;")
	public static Class223 aClass223_111;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	public static int anInt8397;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[8];

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	public static int anInt8390 = -1;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	public static void method7025() {
		Static588.aClass94_65.method2958(50);
		Static92.aClass94_12.method2958(50);
		Static635.aClass94_68.method2958(50);
		Static528.aClass94_57.method2958(50);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	public static void method7028(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static30.anInt830 != -1) {
				Static434.method8407(Static30.anInt830);
			}
			for (@Pc(14) Class6_Sub25 local14 = (Class6_Sub25) Static214.aClass380_15.method8755(); local14 != null; local14 = (Class6_Sub25) Static214.aClass380_15.method8752()) {
				if (!local14.method8791()) {
					local14 = (Class6_Sub25) Static214.aClass380_15.method8755();
					if (local14 == null) {
						break;
					}
				}
				Static360.method5823(false, local14, true);
			}
			Static30.anInt830 = -1;
			Static214.aClass380_15 = new Class380(8);
			Static450.method6848();
			Static30.anInt830 = Static518.anInt9088;
			Static80.method2189(false);
			Static486.method8547();
			Static435.method6680(Static30.anInt830);
		}
		Static613.aString108 = "";
		Static60.aString69 = "";
		Static366.aBoolean559 = false;
		Static302.method5135();
		Static329.anInt6606 = -1;
		Static86.method8588(Static538.anInt9322);
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 = new Class9_Sub4_Sub2_Sub1_Sub2();
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 = Static306.anInt6176 * 512 / 2;
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] = Static306.anInt6176 / 2;
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 = Static108.anInt2930 * 512 / 2;
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] = Static108.anInt2930 / 2;
		Static259.anInt6990 = 0;
		Static184.anInt4048 = 0;
		if (Static554.anInt9497 == 2) {
			Static259.anInt6990 = Static340.anInt6769 << 9;
			Static184.anInt4048 = Static617.anInt10422 << 9;
		} else {
			Static345.method5703();
		}
		Static638.method8737();
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	public static int method7029() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = kda.class.getDeclaredFields();
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			@Pc(27) Field local27 = local17[local21];
			if (eea.class.isAssignableFrom(local27.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V")
	public static void method7032() {
		@Pc(14) Class6_Sub36 local14;
		for (local14 = (Class6_Sub36) Static354.aClass163_40.method4966(); local14 != null; local14 = (Class6_Sub36) Static354.aClass163_40.method4965()) {
			Static286.method4976(local14, false);
		}
		for (local14 = (Class6_Sub36) Static122.aClass163_15.method4966(); local14 != null; local14 = (Class6_Sub36) Static122.aClass163_15.method4965()) {
			Static286.method4976(local14, true);
		}
	}
}
