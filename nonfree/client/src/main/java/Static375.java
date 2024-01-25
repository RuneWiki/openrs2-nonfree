import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!om", name = "G", descriptor = "Lclient!op;")
	public static Class238_Sub1 aClass238_Sub1_5;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[4];

	@OriginalMember(owner = "client!om", name = "D", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_148 = new Class98(59, 12);

	@OriginalMember(owner = "client!om", name = "H", descriptor = "I")
	public static int anInt9162 = 0;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	public static void method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static479.aClass202_13.method4970(Static146.aClass103_71.method2355(Static188.anInt28));
		@Pc(24) int local24;
		for (@Pc(18) Class6_Sub26 local18 = (Class6_Sub26) Static408.aClass298_154.method6809(); local18 != null; local18 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			local24 = Static574.method4156(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static384.anInt7048 * 16 + 21;
		@Pc(50) int local50 = arg0 - local13 / 2;
		if (local50 + local13 > Static367.anInt6719) {
			local50 = Static367.anInt6719 - local13;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(69) int local69 = arg1;
		if (local24 + arg1 > Static154.anInt2867) {
			local69 = Static154.anInt2867 - local24;
		}
		if (local69 < 0) {
			local69 = 0;
		}
		Static420.anInt8173 = local50;
		Static266.aBoolean351 = true;
		Static415.anInt7406 = Static384.anInt7048 * 16 + (Static544.aBoolean506 ? 26 : 22);
		Static237.anInt4304 = local13;
		Static308.anInt5670 = local69;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7252(@OriginalArg(1) String arg0) {
		Static170.method2697("", "", "", 0, arg0, 0);
	}
}
