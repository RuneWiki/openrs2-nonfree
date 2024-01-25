import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!wt;")
	public static Class365 aClass365_2;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "Lclient!os;")
	public static final Class245 aClass245_14 = new Class245(3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLclient!pt;)V")
	public static void method6512(@OriginalArg(0) int arg0, @OriginalArg(2) Class263 arg1) {
		if (Static516.aBoolean592) {
			Static516.aBoolean592 = false;
			arg0 = 0;
		}
		if (Static196.aClass263_1 != null && Static196.aClass263_1.method5840(arg1)) {
			return;
		}
		Static196.aClass263_1 = arg1;
		Static383.aLong183 = Static96.method2000();
		Static40.anInt1150 = arg0;
		Static375.anInt6514 = arg0;
		if (Static375.anInt6514 == 0) {
			Static579.method7896();
			return;
		}
		Static57.anInt1530 = Static144.anInt3368;
		Static478.aClass47_4 = Static111.aClass47_1;
		Static196.aFloat108 = Static481.aFloat179;
		Static145.aFloat102 = Static108.aFloat133;
		Static389.anInt8541 = Static121.anInt2823;
		Static488.anInt8419 = Static79.anInt2119;
		Static39.aFloat43 = Static570.aFloat226;
		Static96.aFloat66 = Static288.aFloat126;
		Static405.aFloat157 = Static471.aFloat174;
		Static272.aFloat124 = Static271.aFloat123;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ol;I)I")
	public static int method6513(@OriginalArg(0) Class25_Sub2_Sub2_Sub5 arg0) {
		if (arg0.anInt8506 == 0) {
			return 0;
		}
		@Pc(73) int local73;
		@Pc(66) int local66;
		if (arg0.anInt8536 != -1) {
			@Pc(24) Class25_Sub2_Sub2_Sub5 local24 = null;
			if (arg0.anInt8536 < 32768) {
				@Pc(52) Class3_Sub39 local52 = (Class3_Sub39) Static581.aClass297_39.method6531((long) arg0.anInt8536);
				if (local52 != null) {
					local24 = local52.aClass25_Sub2_Sub2_Sub5_Sub2_2;
				}
			} else if (arg0.anInt8536 >= 32768) {
				local24 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[arg0.anInt8536 - 32768];
			}
			if (local24 != null) {
				local66 = arg0.anInt8476 - local24.anInt8476;
				local73 = arg0.anInt8482 - local24.anInt8482;
				if (local66 != 0 || local73 != 0) {
					arg0.method6662((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class25_Sub2_Sub2_Sub5_Sub1) {
			@Pc(176) Class25_Sub2_Sub2_Sub5_Sub1 local176 = (Class25_Sub2_Sub2_Sub5_Sub1) arg0;
			if (local176.anInt7144 != -1 && (local176.anInt8580 == 0 || local176.anInt8579 > 0)) {
				local176.method6662(local176.anInt7144);
				local176.anInt7144 = -1;
			}
		} else if (arg0 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
			@Pc(104) Class25_Sub2_Sub2_Sub5_Sub2 local104 = (Class25_Sub2_Sub2_Sub5_Sub2) arg0;
			if (local104.anInt8584 != -1 && (local104.anInt8580 == 0 || local104.anInt8579 > 0)) {
				local66 = local104.anInt8476 - (local104.anInt8584 - Static321.anInt5874 - Static321.anInt5874) * 256;
				local73 = local104.anInt8482 - (local104.anInt8601 - Static137.anInt3293 - Static137.anInt3293) * 256;
				if (local66 != 0 || local73 != 0) {
					local104.method6662((int) (Math.atan2((double) local66, (double) local73) * 2607.5945876176133D) & 0x3FFF);
				}
				local104.anInt8584 = -1;
			}
		}
		return arg0.method6670();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!jo;)Lclient!uda;")
	public static Class3_Sub7_Sub18 method6514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class161 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt5018;
		@Pc(19) Class3_Sub7_Sub18 local19 = (Class3_Sub7_Sub18) Static456.aClass321_2.method7220((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static468.aClass284_131.method6357(Static468.aClass284_131.method6351(local10));
		if (local36 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt5018;
			local19 = (Class3_Sub7_Sub18) Static456.aClass321_2.method7220((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static468.aClass284_131.method6357(Static468.aClass284_131.method6351(local10));
			if (local36 == null) {
				local10 = arg2.anInt5018 | 0x3FFFC00;
				local19 = (Class3_Sub7_Sub18) Static456.aClass321_2.method7220((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static468.aClass284_131.method6357(Static468.aClass284_131.method6351(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static556.method7414(local36);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass161_9 = arg2;
					Static456.aClass321_2.method7223((long) local10 << 16, local19);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static556.method7414(local36);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local19.aClass161_9 = arg2;
				Static456.aClass321_2.method7223((long) local10 << 16, local19);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static556.method7414(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local10);
			}
			local19.aClass161_9 = arg2;
			Static456.aClass321_2.method7223((long) local10 << 16, local19);
			return local19;
		}
	}
}
