import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public static int anInt9142;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public static int anInt9139 = 1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_136 = new Class314(8, 7);

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public static void method7845() {
		Static47.aClass3_Sub9_Sub2_1.method5645();
		@Pc(13) int local13 = Static47.aClass3_Sub9_Sub2_1.method5642(8);
		@Pc(18) int local18;
		if (Static596.anInt9702 > local13) {
			for (local18 = local13; local18 < Static596.anInt9702; local18++) {
				Static455.anIntArray478[Static493.anInt8364++] = Static43.anIntArray50[local18];
			}
		}
		if (local13 > Static596.anInt9702) {
			throw new RuntimeException("gnpov1");
		}
		Static596.anInt9702 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static43.anIntArray50[local18];
			@Pc(68) Class9_Sub2_Sub1_Sub2_Sub2 local68 = ((Class3_Sub43) Static545.aClass25_40.method426((long) local60)).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			@Pc(73) int local73 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
			if (local73 == 0) {
				Static43.anIntArray50[Static596.anInt9702++] = local60;
				local68.anInt10198 = Static648.anInt10294;
			} else {
				@Pc(95) int local95 = Static47.aClass3_Sub9_Sub2_1.method5642(2);
				if (local95 == 0) {
					Static43.anIntArray50[Static596.anInt9702++] = local60;
					local68.anInt10198 = Static648.anInt10294;
					Static533.anIntArray99[Static585.anInt9494++] = local60;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local95 == 1) {
						Static43.anIntArray50[Static596.anInt9702++] = local60;
						local68.anInt10198 = Static648.anInt10294;
						local140 = Static47.aClass3_Sub9_Sub2_1.method5642(3);
						local68.method8641(1, local140);
						local150 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
						if (local150 == 1) {
							Static533.anIntArray99[Static585.anInt9494++] = local60;
						}
					} else if (local95 == 2) {
						Static43.anIntArray50[Static596.anInt9702++] = local60;
						local68.anInt10198 = Static648.anInt10294;
						if (Static47.aClass3_Sub9_Sub2_1.method5642(1) == 1) {
							local140 = Static47.aClass3_Sub9_Sub2_1.method5642(3);
							local68.method8641(2, local140);
							local150 = Static47.aClass3_Sub9_Sub2_1.method5642(3);
							local68.method8641(2, local150);
						} else {
							local140 = Static47.aClass3_Sub9_Sub2_1.method5642(3);
							local68.method8641(0, local140);
						}
						local140 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
						if (local140 == 1) {
							Static533.anIntArray99[Static585.anInt9494++] = local60;
						}
					} else if (local95 == 3) {
						Static455.anIntArray478[Static493.anInt8364++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method7846(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
