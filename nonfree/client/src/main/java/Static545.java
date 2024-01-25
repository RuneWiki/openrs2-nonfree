import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!se", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!uq;")
	public static Class362 aClass362_122;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!jq;")
	public static final Class3_Sub31 aClass3_Sub31_1 = new Class3_Sub31(0, 0);

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public static final int[] anIntArray466 = new int[1000];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method6990() {
		@Pc(10) Class3_Sub33 local10;
		for (local10 = (Class3_Sub33) Static346.aClass302_39.method6603(); local10 != null; local10 = (Class3_Sub33) Static346.aClass302_39.method6605()) {
			if (local10.aBoolean341) {
				local10.method9034();
			} else {
				local10.aBoolean342 = true;
				if (local10.anInt5169 >= 0 && local10.anInt5170 >= 0 && Static98.anInt361 > local10.anInt5169 && local10.anInt5170 < Static438.anInt7120) {
					Static114.method1730(local10);
				}
			}
		}
		for (local10 = (Class3_Sub33) Static153.aClass302_15.method6603(); local10 != null; local10 = (Class3_Sub33) Static153.aClass302_15.method6605()) {
			if (local10.aBoolean341) {
				local10.method9034();
			} else {
				local10.aBoolean342 = true;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
	public static int method6994() {
		@Pc(7) int local7 = Static197.aClass159_1.method3708();
		if (Static279.aClass159Array1.length - 1 > local7) {
			Static197.aClass159_1 = Static279.aClass159Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
	public static int method6996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(31) double local31 = (local10 - local17) * Math.random() + local17;
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
