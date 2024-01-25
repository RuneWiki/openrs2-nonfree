import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "I")
	public static int anInt4652;

	@OriginalMember(owner = "client!hca", name = "G", descriptor = "Lclient!ga;")
	public static final Class107 aClass107_4 = new Class107("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BFIFF)F")
	public static float method3943(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static18.aFloatArrayArray1[arg1];
		return local7[0] * arg3 + local7[1] * arg2 + local7[2] * arg0;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!gaa;I)Lclient!gaa;")
	public static Class108 method3945(@OriginalArg(0) Class108 arg0) {
		if (arg0.anInt4046 != -1) {
			return Static113.method8285(arg0.anInt4046);
		}
		@Pc(25) int local25 = arg0.anInt4043 >>> 16;
		@Pc(30) Class162 local30 = new Class162(Static40.aClass307_5);
		for (@Pc(35) Class3_Sub50 local35 = (Class3_Sub50) local30.method4899(); local35 != null; local35 = (Class3_Sub50) local30.method4898()) {
			if (local25 == local35.anInt9575) {
				return Static113.method8285((int) local35.aLong277);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V")
	public static void method3947(@OriginalArg(1) boolean arg0) {
		if (Static197.aString45.length() == 0) {
			return;
		}
		Static117.method2792("--> " + Static197.aString45);
		Static240.method4614(arg0, Static197.aString45, false);
		Static197.aString45 = "";
		Static230.anInt5186 = 0;
		Static186.anInt4413 = 0;
	}
}
