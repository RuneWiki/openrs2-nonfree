import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "Lclient!w;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "Lclient!lk;")
	public static Class153 aClass153_3;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
	public static int anInt5617;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!di;")
	public static final Class54 aClass54_79 = new Class54(16, 2);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
	public static int method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static225.anIntArrayArray41 == null ? 0 : Static225.anIntArrayArray41[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIZII)Lclient!mg;")
	public static Class160 method4520(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class248 local10 = null;
		if (Static199.aClass220_2 != null) {
			local10 = new Class248(arg2, Static199.aClass220_2, Static86.aClass220Array4[arg2], 1000000);
		}
		Static318.aClass94_Sub1Array6[arg2] = Static292.aClass27_1.method523(Static13.aClass248_1, arg2, local10);
		if (arg1) {
			Static318.aClass94_Sub1Array6[arg2].method2181();
		}
		return new Class160(Static318.aClass94_Sub1Array6[arg2], arg0, 1);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4524(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLclient!sk;ILclient!vc;)V")
	public static void method4526(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub23_Sub2 arg3) {
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if ((arg0 & 0x20) != 0) {
			local20 = arg3.method5460();
			local24 = arg3.method5495();
			local28 = arg3.method5452();
			@Pc(31) int local31 = arg3.anInt6952;
			@Pc(42) boolean local42 = (local20 & 0x8000) != 0;
			if (arg1.aString56 != null && arg1.aClass97_1 != null) {
				@Pc(50) boolean local50 = false;
				if (local24 <= 1) {
					if (!local42 && (Static340.aBoolean411 && !Static62.aBoolean83 || Static223.aBoolean314)) {
						local50 = true;
					} else if (Static309.method4371(arg1.aString56)) {
						local50 = true;
					}
				}
				if (!local50 && Static68.anInt5456 == 0) {
					Static38.aClass2_Sub23_9.anInt6952 = 0;
					arg3.method5477(Static38.aClass2_Sub23_9.aByteArray130, local28);
					Static38.aClass2_Sub23_9.anInt6952 = 0;
					@Pc(94) int local94 = -1;
					@Pc(113) String local113;
					if (local42) {
						local20 &= 0x7FFF;
						@Pc(104) Class206 local104 = Static281.method5826(Static38.aClass2_Sub23_9);
						local94 = local104.anInt5626;
						local113 = local104.aClass2_Sub5_Sub10_1.method3922(Static38.aClass2_Sub23_9);
					} else {
						local113 = Static331.method4592(Static238.method3684(Static38.aClass2_Sub23_9));
					}
					arg1.aString54 = local113.trim();
					arg1.anInt6151 = 150;
					arg1.anInt6193 = local20 & 0xFF;
					arg1.anInt6170 = local20 >> 8;
					@Pc(152) int local152;
					if (local24 == 1 || local24 == 2) {
						local152 = local42 ? 17 : 1;
					} else {
						local152 = local42 ? 17 : 2;
					}
					if (local24 == 2) {
						Static8.method202(local94, "<img=1>" + arg1.method4943(), local152, 0, "<img=1>" + arg1.method4950(), null, local113);
					} else if (local24 == 1) {
						Static8.method202(local94, "<img=0>" + arg1.method4943(), local152, 0, "<img=0>" + arg1.method4950(), null, local113);
					} else {
						Static8.method202(local94, arg1.method4943(), local152, 0, arg1.method4950(), null, local113);
					}
				}
			}
			arg3.anInt6952 = local28 + local31;
		}
		@Pc(252) byte local252 = -1;
		if ((arg0 & 0x40) != 0) {
			local20 = arg3.method5495();
			@Pc(263) byte[] local263 = new byte[local20];
			@Pc(268) Class2_Sub23 local268 = new Class2_Sub23(local263);
			arg3.method5503(local263, local20);
			Static316.aClass2_Sub23Array2[arg2] = local268;
			arg1.method4942(local268);
		}
		if ((arg0 & 0x800) != 0) {
			arg1.aBoolean432 = arg3.method5452() == 1;
		}
		if ((arg0 & 0x2000) != 0) {
			local20 = arg3.method5500();
			arg1.anInt6142 = arg3.method5499();
			arg1.anInt6141 = arg3.method5499();
			arg1.anInt6145 = local20 & 0x7FFF;
			arg1.aBoolean426 = (local20 & 0x8000) != 0;
			arg1.anInt6140 = arg1.anInt6142 + arg1.anInt6145 + Static131.anInt2821;
		}
		if ((arg0 & 0x4000) != 0) {
			local20 = Static131.anInt2821;
			local24 = arg3.method5479();
			local28 = arg3.method5464();
			arg1.method4934(local24, local28, local20);
		}
		if ((arg0 & 0x8) != 0) {
			local20 = arg3.method5479();
			local24 = arg3.method5499();
			arg1.method4934(local20, local24, Static131.anInt2821);
			arg1.anInt6156 = Static131.anInt2821 + 300;
			arg1.anInt6174 = arg3.method5499();
		}
		if ((arg0 & 0x400) != 0) {
			arg1.aString54 = arg3.method5494();
			if (arg1.aString54.charAt(0) == '~') {
				arg1.aString54 = arg1.aString54.substring(1);
				Static334.method4660(2, 0, arg1.method4950(), arg1.method4943(), arg1.aString54);
			} else if (arg1 == Static375.aClass3_Sub2_Sub1_Sub2_7) {
				Static334.method4660(2, 0, arg1.method4950(), arg1.method4943(), arg1.aString54);
			}
			arg1.anInt6170 = 0;
			arg1.anInt6151 = 150;
			arg1.anInt6193 = 0;
		}
		if ((arg0 & 0x1) != 0) {
			arg1.anInt6209 = arg3.method5460();
			if (arg1.anInt6206 == 0) {
				arg1.method4928(arg1.anInt6209);
				arg1.anInt6209 = -1;
			}
		}
		if ((arg0 & 0x80) != 0) {
			local20 = arg3.method5500();
			if (local20 == 65535) {
				local20 = -1;
			}
			arg1.anInt6167 = local20;
		}
		if ((arg0 & 0x20000) != 0) {
			local20 = arg3.method5499();
			@Pc(521) int[] local521 = new int[local20];
			@Pc(524) int[] local524 = new int[local20];
			@Pc(527) int[] local527 = new int[local20];
			for (@Pc(529) int local529 = 0; local529 < local20; local529++) {
				@Pc(535) int local535 = arg3.method5493();
				if (local535 == 65535) {
					local535 = -1;
				}
				local521[local529] = local535;
				local524[local529] = arg3.method5464();
				local527[local529] = arg3.method5500();
			}
			Static191.method3003(arg1, local527, local524, local521);
		}
		if ((arg0 & 0x10) != 0) {
			local20 = arg3.method5460();
			if (local20 == 65535) {
				local20 = -1;
			}
			local24 = arg3.method5495();
			Static47.method795(arg1, local24, local20);
		}
		if ((arg0 & 0x100) != 0) {
			local252 = arg3.method5511();
		}
		if ((arg0 & 0x4) != 0) {
			Static160.aByteArray86[arg2] = arg3.method5484();
		}
		if ((arg0 & 0x10000) != 0) {
			arg1.lb = arg3.method5511();
			arg1.aByte91 = arg3.method5511();
			arg1.aByte90 = arg3.method5484();
			arg1.aByte92 = (byte) arg3.method5452();
			arg1.anInt6148 = Static131.anInt2821 + arg3.method5493();
			arg1.anInt6132 = Static131.anInt2821 + arg3.method5492();
		}
		if ((arg0 & 0x40000) != 0) {
			local20 = arg3.method5500();
			if (local20 == 65535) {
				local20 = -1;
			}
			local24 = arg3.method5468();
			local28 = arg3.method5464();
			arg1.method4924(local28, true, local20, local24);
		}
		if ((arg0 & 0x1000) != 0) {
			arg1.anInt6175 = arg3.method5471();
			arg1.anInt6173 = arg3.method5497();
			arg1.anInt6189 = arg3.method5471();
			arg1.anInt6179 = arg3.method5511();
			arg1.anInt6181 = arg3.method5493() + Static131.anInt2821;
			arg1.anInt6183 = arg3.method5500() + Static131.anInt2821;
			arg1.anInt6131 = arg3.method5464();
			arg1.anInt6204 = 0;
			if (arg1.aBoolean431) {
				arg1.anInt6179 += arg1.anInt6212;
				arg1.anInt6189 += arg1.anInt6222;
				arg1.anInt6173 += arg1.anInt6212;
				arg1.anInt6175 += arg1.anInt6222;
				arg1.anInt6206 = 0;
			} else {
				arg1.anInt6189 += arg1.anIntArray525[0];
				arg1.anInt6206 = 1;
				arg1.anInt6179 += arg1.anIntArray524[0];
				arg1.anInt6173 += arg1.anIntArray524[0];
				arg1.anInt6175 += arg1.anIntArray525[0];
			}
		}
		if ((arg0 & 0x8000) != 0) {
			local20 = arg3.method5492();
			local24 = arg3.method5508();
			if (local20 == 65535) {
				local20 = -1;
			}
			local28 = arg3.method5495();
			arg1.method4924(local28, false, local20, local24);
		}
		if (!arg1.aBoolean431) {
			return;
		}
		if (local252 == 127) {
			arg1.method4948(arg1.anInt6222, arg1.anInt6212);
			return;
		}
		@Pc(864) byte local864;
		if (local252 == -1) {
			local864 = Static160.aByteArray86[arg2];
		} else {
			local864 = local252;
		}
		arg1.method4938(arg1.anInt6212, arg1.anInt6222, local864);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method4527() {
		if (Static424.anInt7096 != -1) {
			Static239.method3693(Static424.anInt7096, -1, -1, false);
			Static424.anInt7096 = -1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Z")
	public static boolean method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static387.method5127(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static307.anInt5425;
			@Pc(14) int local14 = arg2 << Static307.anInt5425;
			return Static389.method5165(local10 + 1, Static58.aClass64Array1[arg0].l(arg1, arg2) + arg3, local14 + 1) && Static389.method5165(local10 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg2) + arg3, local14 + 1) && Static389.method5165(local10 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg2 + 1) + arg3, local14 + Static8.anInt242 - 1) && Static389.method5165(local10 + 1, Static58.aClass64Array1[arg0].l(arg1, arg2 + 1) + arg3, local14 + Static8.anInt242 - 1);
		} else {
			return false;
		}
	}
}
