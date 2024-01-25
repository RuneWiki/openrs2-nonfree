import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jja", name = "s", descriptor = "J")
	public static long aLong154 = 1L;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method4139(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg0.length() > 320 || !Static354.method5310()) {
			return;
		}
		if (Static492.aClass295_1 != null) {
			Static492.aClass295_1.method7023();
			Static492.aClass295_1 = null;
		}
		Static400.method5892();
		Static43.aString11 = arg1;
		Static289.aString139 = arg0;
		Static21.method316(5);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)Z")
	public static boolean method4140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static179.method2591(arg0, arg1) || Static275.method4066(arg1, arg0);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static570.aBoolean734 || !Static119.aBoolean171) {
			return false;
		} else if (Static224.anInt3656 < 100) {
			return false;
		} else if (Static9.method108(arg0, arg2, 113, arg4)) {
			@Pc(31) int local31 = arg4 << Static611.anInt10115;
			if (arg3 > -107) {
				return true;
			}
			@Pc(41) int local41 = arg0 << Static611.anInt10115;
			if (Static63.method884(Static242.aClass22Array3[arg2].method8038(arg0, arg4), arg1, local41, local31, Static88.anInt7739, Static88.anInt7739)) {
				Static267.anInt4664++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ZLclient!sg;)V")
	public static void method4143(@OriginalArg(1) Class5_Sub5_Sub19 arg0) {
		if (Static526.aBoolean669) {
			return;
		}
		arg0.method9327(1);
		Static481.anInt8130--;
		if (!arg0.aBoolean709) {
			@Pc(27) long local27 = arg0.aLong268;
			@Pc(33) Class5_Sub5_Sub18 local33;
			for (local33 = (Class5_Sub5_Sub18) Static595.aClass291_42.method6993(local27, 1); local33 != null && !local33.aString102.equals(arg0.aString120); local33 = (Class5_Sub5_Sub18) Static595.aClass291_42.method6985(-119)) {
			}
			if (local33 != null && local33.method6562(arg0)) {
				Static677.method9299(local33);
				return;
			}
			return;
		}
		for (@Pc(78) Class5_Sub5_Sub18 local78 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local78 != null; local78 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
			if (local78.aString102.equals(arg0.aString120)) {
				@Pc(90) boolean local90 = false;
				for (@Pc(96) Class5_Sub5_Sub19 local96 = (Class5_Sub5_Sub19) local78.aClass149_8.method2890(); local96 != null; local96 = (Class5_Sub5_Sub19) local78.aClass149_8.method2894()) {
					if (local96 == arg0) {
						local90 = true;
						if (local78.method6562(arg0)) {
							Static677.method9299(local78);
						}
						break;
					}
				}
				if (local90) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZ)V")
	public static void method4144(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static253.anInt4356;
		@Pc(12) int local12 = Static33.anInt568;
		if (arg0 && Static565.aBoolean768) {
			local5 <<= 0x1;
			local12 = -local5;
		}
		Static457.aClass57_11.f(local12, local5);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILclient!fda;B)V")
	public static void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1) {
		if (Static400.aBoolean530) {
			arg0 = 0;
			Static400.aBoolean530 = false;
		}
		if (Static169.aClass120_2 != null && Static169.aClass120_2.method2196(arg1)) {
			return;
		}
		Static169.aClass120_2 = arg1;
		Static140.aLong64 = Static515.method7499(96);
		Static307.anInt5461 = arg0;
		Static377.anInt6462 = arg0;
		if (Static377.anInt6462 == 0) {
			Static130.method1894();
			return;
		}
		Static16.aFloat4 = Static5.aFloat183;
		Static200.anInt3242 = Static432.anInt7421;
		Static170.anInt2901 = Static420.anInt7261;
		Static80.aFloat10 = Static521.aFloat163;
		Static178.aClass29_2 = Static246.aClass29_3;
		Static468.aFloat138 = Static656.aFloat207;
		Static236.aFloat55 = Static18.aFloat5;
		Static503.aFloat161 = Static484.aFloat142;
		Static294.anInt5121 = Static141.anInt4797;
		Static588.aFloat204 = Static677.aFloat208;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IBIIII)V")
	public static void method4146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static456.method6719(arg4, arg0, arg3, arg2);
		} else if (Static642.anInt10429 <= arg3 - arg0 && arg0 + arg3 <= Static456.anInt7806 && Static456.anInt7815 <= arg2 - arg1 && arg2 + arg1 <= Static604.anInt10083) {
			Static103.method1467(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static312.method4752(arg1, arg4, arg2, arg3, arg0);
		}
	}
}
