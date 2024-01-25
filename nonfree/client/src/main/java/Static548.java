import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!la;")
	public static Class29 aClass29_15;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	public static int anInt8906;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)J")
	public static synchronized long method7437() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static263.aLong121 > local5) {
			Static581.aLong264 += Static263.aLong121 - local5;
		}
		Static263.aLong121 = local5;
		return local5 + Static581.aLong264;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IJ)V")
	public static void method7439(@OriginalArg(1) long arg0) {
		@Pc(6) Class2_Sub42 local6 = Static180.method3103();
		local6.aClass2_Sub15_Sub2_2.method4333(Static193.aClass180_8.anInt4831);
		local6.aClass2_Sub15_Sub2_2.method4318(arg0);
		local6.aClass2_Sub15_Sub2_2.method4333(Static52.anInt1264);
		Static531.method7296(local6);
		Static317.anInt5928 = 0;
		Static508.anInt8480 = 0;
		Static257.anInt4784 = -3;
		Static109.anInt2235 = 1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([Lclient!kp;IZ)V")
	public static void method7440(@OriginalArg(0) Class196[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class196 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt5098 == 0) {
					if (local17.aClass196Array2 != null) {
						method7440(local17.aClass196Array2, arg1);
					}
					@Pc(41) Class2_Sub44 local41 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local17.anInt5112);
					if (local41 != null) {
						Static58.method952(local41.anInt8608, arg1);
					}
				}
				@Pc(60) Class2_Sub31 local60;
				if (arg1 == 0 && local17.anObjectArray24 != null) {
					local60 = new Class2_Sub31();
					local60.anObjectArray32 = local17.anObjectArray24;
					local60.aClass196_4 = local17;
					Static552.method7490(local60);
				}
				if (arg1 == 1 && local17.anObjectArray25 != null) {
					if (local17.anInt5154 >= 0) {
						@Pc(86) Class196 local86 = Static117.method1748(local17.anInt5112);
						if (local86 == null || local86.aClass196Array2 == null || local17.anInt5154 >= local86.aClass196Array2.length || local17 != local86.aClass196Array2[local17.anInt5154]) {
							continue;
						}
					}
					local60 = new Class2_Sub31();
					local60.aClass196_4 = local17;
					local60.anObjectArray32 = local17.anObjectArray25;
					Static552.method7490(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7441(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static451.anInt487; local11++) {
			if (arg0.equalsIgnoreCase(Static306.aStringArray92[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
