import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static int anInt4774;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_155 = new Class92(65, 3);

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_156 = new Class92(69, 3);

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_161 = new Class175("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method3881(@OriginalArg(1) Class3_Sub2 arg0) {
		if (arg0.aByteArray95.length - arg0.anInt7620 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method6053();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray95.length - arg0.anInt7620 < 2) {
			return;
		}
		@Pc(53) int local53 = arg0.method6004();
		if (arg0.aByteArray95.length - arg0.anInt7620 != local53 * 6) {
			return;
		}
		while (true) {
			@Pc(69) int local69;
			@Pc(73) int local73;
			do {
				do {
					do {
						if (arg0.anInt7620 >= arg0.aByteArray95.length) {
							return;
						}
						local69 = arg0.method6004();
						local73 = arg0.method6014();
					} while (Static436.anIntArray560.length <= local69);
				} while (!Static372.aBooleanArray9[local69]);
			} while (Static345.aClass84_1.method2270(local69).aChar4 == '1' && (local73 < -1 || local73 > 1));
			Static436.anIntArray560[local69] = local73;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)V")
	public static void method3883(@OriginalArg(1) int arg0) {
		for (@Pc(13) Class3 local13 = Static101.aClass127_10.method3248(); local13 != null; local13 = Static101.aClass127_10.method3252()) {
			if ((local13.aLong227 >> 48 & 0xFFFFL) == (long) arg0) {
				local13.method5987();
			}
		}
	}
}
