import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Lclient!ir;")
	public static Class100 aClass100_51;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!sj;")
	public static Class181 aClass181_22;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
	public static boolean aBoolean141;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
	public static final int[] anIntArray149 = new int[13];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
	public static void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 7);
		local8.method2509();
		local8.anInt3054 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public static void method2062() {
		Static313.aClass198_55.method5230();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public static void method2063() {
		Static266.anInt5363 = 0;
		Static273.aBoolean343 = false;
		Static182.anInt3880 = -1;
		Static110.anInt2318 = 0;
		Static71.anInt5326 = 1;
		Static10.anInt249 = 0;
		Static84.anInt1683 = -3;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!qc;IBILclient!qr;ILclient!kg;)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub4_Sub4_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class170 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub4_Sub4_Sub1 arg6) {
		@Pc(12) Class3_Sub12 local12 = new Class3_Sub12();
		local12.anInt1261 = arg3 * 128;
		local12.anInt1272 = arg0 * 128;
		local12.anInt1267 = arg5;
		if (arg4 != null) {
			local12.aClass170_1 = arg4;
			@Pc(33) int local33 = arg4.anInt5235;
			@Pc(36) int local36 = arg4.anInt5251;
			if (arg2 == 1 || arg2 == 3) {
				local36 = arg4.anInt5235;
				local33 = arg4.anInt5251;
			}
			local12.anInt1271 = (local33 + arg3) * 128;
			local12.anInt1269 = arg4.anInt5252;
			local12.anInt1270 = arg4.anInt5241 * 128;
			local12.anInt1257 = (local36 + arg0) * 128;
			local12.anIntArray81 = arg4.anIntArray425;
			local12.anInt1259 = arg4.anInt5214;
			local12.anInt1260 = arg4.anInt5220;
			local12.anInt1263 = arg4.anInt5243;
			if (arg4.anIntArray424 != null) {
				local12.aBoolean58 = true;
				local12.method955();
			}
			if (local12.anIntArray81 != null) {
				local12.anInt1268 = (int) ((double) (local12.anInt1269 - local12.anInt1263) * Math.random()) + local12.anInt1263;
			}
			Static269.aClass127_28.method3387(local12);
		} else if (arg1 != null) {
			local12.aClass5_Sub4_Sub4_Sub2_1 = arg1;
			@Pc(177) Class119 local177 = arg1.aClass119_1;
			if (local177.anIntArray248 != null) {
				local12.aBoolean58 = true;
				local177 = local177.method2882();
			}
			if (local177 != null) {
				local12.anInt1271 = (arg3 + local177.anInt3645) * 128;
				local12.anInt1257 = (arg0 + local177.anInt3645) * 128;
				local12.anInt1259 = Static350.method5690(arg1);
				local12.anInt1270 = local177.anInt3674 * 128;
				local12.anInt1260 = local177.anInt3637;
			}
			Static102.aClass127_7.method3387(local12);
		} else if (arg6 != null) {
			local12.aClass5_Sub4_Sub4_Sub1_1 = arg6;
			local12.anInt1271 = (arg3 + arg6.method4208()) * 128;
			local12.anInt1257 = (arg6.method4208() + arg0) * 128;
			local12.anInt1259 = Static286.method4914(arg6);
			local12.anInt1260 = arg6.anInt3427;
			local12.anInt1270 = arg6.anInt3416 * 128;
			Static41.aClass24_2.method598((long) arg6.anInt4946, local12);
			return;
		}
	}
}
