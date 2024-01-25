import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_17 = new Class364(5, 3);

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
	public static int anInt6112 = 1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZLclient!cca;Lclient!cca;)I")
	public static int method4952(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class48_Sub1 arg2, @OriginalArg(4) Class48_Sub1 arg3) {
		@Pc(14) int local14;
		if (arg0 == 1) {
			@Pc(11) int local11 = arg2.anInt1526;
			local14 = arg3.anInt1526;
			if (!arg1) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static102.method2107(arg2.method1393().aString11, Static201.anInt4321, arg3.method1393().aString11);
		} else if (arg0 == 3) {
			if (arg2.aString31.equals("-")) {
				if (arg3.aString31.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString31.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static102.method2107(arg2.aString31, Static201.anInt4321, arg3.aString31);
			}
		} else if (arg0 == 4) {
			if (arg2.method1387()) {
				return arg3.method1387() ? 0 : 1;
			} else if (arg3.method1387()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method1389()) {
				return arg3.method1389() ? 0 : 1;
			} else if (arg3.method1389()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method1391()) {
				return arg3.method1391() ? 0 : 1;
			} else if (arg3.method1391()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method1388()) {
				return arg3.method1388() ? 0 : 1;
			} else if (arg3.method1388()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local14 = arg2.anInt1536;
			@Pc(201) int local201 = arg3.anInt1536;
			if (arg1) {
				if (local201 == 1000) {
					local201 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local201 == -1) {
					local201 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local14 - local201;
		} else {
			return arg2.anInt1533 - arg3.anInt1533;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([SII)[S")
	public static short[] method4954(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static604.method6226(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method4955(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!oo;BI)Z")
	public static boolean method4956(@OriginalArg(0) Class3_Sub26_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method5553(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg0.method5553(1) != 0) {
				method4956(arg0, arg1);
			}
			local31 = arg0.method5553(6);
			local36 = arg0.method5553(6);
			@Pc(46) boolean local46 = arg0.method5553(1) == 1;
			if (local46) {
				Static479.anIntArray492[Static222.anInt4597++] = arg1;
			}
			if (Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class286 local69 = Static267.aClass286Array1[arg1];
			@Pc(77) Class25_Sub2_Sub2_Sub5_Sub1 local77 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[arg1] = new Class25_Sub2_Sub2_Sub5_Sub1();
			local77.anInt8529 = arg1;
			if (Static173.aClass3_Sub26Array1[arg1] != null) {
				local77.method5677(Static173.aClass3_Sub26Array1[arg1]);
			}
			local77.method6672(true, local69.anInt8078);
			local77.anInt8536 = local69.anInt8077;
			local103 = local69.anInt8076;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			@Pc(126) int local126 = (local113 << 6) + local31 - Static321.anInt5874;
			@Pc(134) int local134 = local36 + (local117 << 6) - Static137.anInt3293;
			local77.aBoolean494 = local69.aBoolean556;
			local77.aByteArray209[0] = Static112.aByteArray56[arg1];
			local77.aByte117 = local77.aByte118 = (byte) local107;
			if (Static269.method4098(local126, local134)) {
				local77.aByte118++;
			}
			local77.method5675(local134, local126);
			local77.aBoolean493 = false;
			Static267.aClass286Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method5553(2);
			local36 = Static267.aClass286Array1[arg1].anInt8076;
			Static267.aClass286Array1[arg1].anInt8076 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(231) int local231;
			@Pc(236) int local236;
			@Pc(245) int local245;
			if (local8 != 2) {
				local31 = arg0.method5553(18);
				local36 = local31 >> 16;
				local231 = local31 >> 8 & 0xFF;
				local236 = local31 & 0xFF;
				local245 = Static267.aClass286Array1[arg1].anInt8076;
				local103 = (local245 >> 28) + local36 & 0x3;
				local113 = (local245 >> 14) + local231 & 0xFF;
				local117 = local245 + local236 & 0xFF;
				Static267.aClass286Array1[arg1].anInt8076 = local117 + (local103 << 28) + (local113 << 14);
				return false;
			}
			local31 = arg0.method5553(5);
			local36 = local31 >> 3;
			local231 = local31 & 0x7;
			local236 = Static267.aClass286Array1[arg1].anInt8076;
			local245 = (local236 >> 28) + local36 & 0x3;
			local103 = local236 >> 14 & 0xFF;
			local107 = local236 & 0xFF;
			if (local231 == 0) {
				local103--;
				local107--;
			}
			if (local231 == 1) {
				local107--;
			}
			if (local231 == 2) {
				local107--;
				local103++;
			}
			if (local231 == 3) {
				local103--;
			}
			if (local231 == 4) {
				local103++;
			}
			if (local231 == 5) {
				local107++;
				local103--;
			}
			if (local231 == 6) {
				local107++;
			}
			if (local231 == 7) {
				local107++;
				local103++;
			}
			Static267.aClass286Array1[arg1].anInt8076 = local107 + (local103 << 14) + (local245 << 28);
			return false;
		}
	}
}
