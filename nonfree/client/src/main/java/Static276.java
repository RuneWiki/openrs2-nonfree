import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nn", name = "Eb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Lclient!s;")
	public static final Class217 aClass217_63 = new Class217(57, -2);

	@OriginalMember(owner = "client!nn", name = "zb", descriptor = "[Lclient!ti;")
	public static final Class236[] aClass236Array3 = new Class236[16];

	@OriginalMember(owner = "client!nn", name = "Bb", descriptor = "J")
	public static long aLong96 = 0L;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	public static void method2466() {
		for (@Pc(14) Class10_Sub1_Sub15 local14 = (Class10_Sub1_Sub15) Static12.aClass163_2.method3620(); local14 != null; local14 = (Class10_Sub1_Sub15) Static12.aClass163_2.method3621()) {
			@Pc(19) Class24_Sub3_Sub5 local19 = local14.aClass24_Sub3_Sub5_1;
			if (local19.anInt7013 < Static400.anInt6752) {
				local14.method6033();
				local19.method5510();
			} else if (Static400.anInt6752 >= local19.anInt7027) {
				if (local19.anInt7019 > 0) {
					@Pc(56) Class10_Sub26 local56 = (Class10_Sub26) Static424.aClass167_33.method3709((long) (local19.anInt7019 - 1));
					if (local56 != null) {
						@Pc(61) Class24_Sub3_Sub2_Sub1 local61 = local56.aClass24_Sub3_Sub2_Sub1_2;
						if (local61.anInt7092 >= 0 && local61.anInt7092 < Static2.anInt7 * 128 && local61.anInt7094 >= 0 && Static17.anInt315 * 128 > local61.anInt7094) {
							local19.method5509(local61.anInt7092, local61.anInt7094, Static326.method4459(local19.aByte98, local61.anInt7092, local61.anInt7094) - local19.anInt7010, Static400.anInt6752);
						}
					}
				}
				if (local19.anInt7019 < 0) {
					@Pc(108) int local108 = -local19.anInt7019 - 1;
					@Pc(117) Class24_Sub3_Sub2_Sub2 local117;
					if (local108 == Static245.anInt4435) {
						local117 = Static263.aClass24_Sub3_Sub2_Sub2_4;
					} else {
						local117 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local108];
					}
					if (local117 != null && local117.anInt7092 >= 0 && Static2.anInt7 * 128 > local117.anInt7092 && local117.anInt7094 >= 0 && Static17.anInt315 * 128 > local117.anInt7094) {
						local19.method5509(local117.anInt7092, local117.anInt7094, Static326.method4459(local19.aByte98, local117.anInt7092, local117.anInt7094) - local19.anInt7010, Static400.anInt6752);
					}
				}
				local19.method5519(Static68.anInt1469);
				Static10.method119(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "(I)[Lclient!mo;")
	public static Class168[] method2516() {
		return new Class168[] { Static366.aClass168_32, Static326.aClass168_27, Static277.aClass168_25, Static379.aClass168_6, Static168.aClass168_14, Static90.aClass168_8, Static410.aClass168_35, Static230.aClass168_19, Static124.aClass168_9, Static61.aClass168_7, Static247.aClass168_23, Static191.aClass168_17, Static437.aClass168_39, Static233.aClass168_20, Static367.aClass168_33 };
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(IB)C")
	public static char method2522(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static191.aCharArray5[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}
}
