import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray76 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
	public static int anInt7596 = 0;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IZ)V")
	public static void method6358(@OriginalArg(1) boolean arg0) {
		Static273.aClass25_3.method4297(Static535.aClass16_10.method8159());
		@Pc(16) int[] local16 = Static535.aClass16_10.Y();
		Static87.anInt1928 = local16[2];
		Static147.anInt2779 = local16[0];
		Static320.anInt5959 = local16[3];
		Static67.anInt9116 = local16[1];
		if (arg0) {
			Static535.aClass16_10.DA(Static557.anInt8985, Static511.anInt10255, Static204.anInt3800, Static344.anInt6203);
			Static238.method3816(Static637.aDouble34);
		} else {
			Static535.aClass16_10.DA(Static323.anInt6010, Static95.anInt2053, Static525.anInt8702, Static641.anInt9891);
			Static238.method3816(Static154.aDouble16);
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Lclient!uv;Z)V")
	public static void method6360(@OriginalArg(0) Class23_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anIntArray652 == null && arg0.anIntArray656 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray652.length; local20++) {
			@Pc(24) int local24 = -1;
			if (arg0.anIntArray652 != null) {
				local24 = arg0.anIntArray652[local20];
			}
			if (local24 != -1) {
				local14 = false;
				@Pc(86) int local86;
				@Pc(79) int local79;
				@Pc(100) int local100;
				if ((-1073741824 & local24) == -1073741824) {
					local100 = local24 & 0xFFFFFFF;
					@Pc(138) int local138 = local100 >> 14;
					local86 = arg0.anInt10108 - (local138 - Static417.anInt7047) * 512 - 256;
					@Pc(154) int local154 = local100 & 0x3FFF;
					local79 = arg0.anInt10109 - (local154 - Static347.anInt7851) * 512 - 256;
				} else if ((local24 & 0x8000) == 0) {
					@Pc(67) Class3_Sub11 local67 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local24);
					if (local67 == null) {
						arg0.method8618(local20, -1);
						continue;
					}
					@Pc(72) Class23_Sub2_Sub1_Sub2_Sub2 local72 = local67.aClass23_Sub2_Sub1_Sub2_Sub2_1;
					local79 = arg0.anInt10109 - local72.anInt10109;
					local86 = arg0.anInt10108 - local72.anInt10108;
				} else {
					local100 = local24 & 0x7FFF;
					@Pc(104) Class23_Sub2_Sub1_Sub2_Sub1 local104 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local100];
					if (local104 == null) {
						arg0.method8618(local20, -1);
						continue;
					}
					local79 = arg0.anInt10109 - local104.anInt10109;
					local86 = arg0.anInt10108 - local104.anInt10108;
				}
				if (local86 != 0 || local79 != 0) {
					arg0.method8618(local20, (int) (Math.atan2((double) local86, (double) local79) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method8618(local20, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray652 = null;
			arg0.anIntArray656 = null;
		}
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(I)V")
	public static void method6361() {
		@Pc(1) Class279 local1 = Static415.aClass279_37;
		synchronized (Static415.aClass279_37) {
			Static415.aClass279_37.method6638();
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ZZ)V")
	public static void method6362(@OriginalArg(1) boolean arg0) {
		if (Static673.aClass160_3 != null) {
			Static673.aClass160_3.method3506();
			Static673.aClass160_3 = null;
		}
		Static216.anInt3999 = 0;
		Static389.method5059();
		Static418.method5969();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static27.aClass198Array1[local19].method4537();
		}
		Static585.method7868(false);
		System.gc();
		Static186.method3006();
		Static666.aBoolean755 = false;
		Static149.anInt2812 = -1;
		Static361.method5397();
		Static397.method5726(true);
		Static347.anInt7851 = 0;
		Static417.anInt7047 = 0;
		Static660.anInt10217 = 0;
		Static279.anInt5230 = 0;
		Static176.anInt3321 = 0;
		Static11.anInt122 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static110.aClass70Array1.length; local60++) {
			Static110.aClass70Array1[local60] = null;
		}
		Static34.method1086();
		for (@Pc(79) int local79 = 0; local79 < 2048; local79++) {
			Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local79] = null;
		}
		Static308.anInt5687 = 0;
		Static500.aClass62_40.method1683();
		Static609.anInt6433 = 0;
		Static421.aClass62_32.method1683();
		Static480.method6835();
		Static154.anInt2874 = 0;
		Static592.aClass47_2.method1438();
		Static132.method2272();
		Static411.method5824();
		Static196.aClass3_Sub55_1 = null;
		Static338.aClass308_2 = null;
		Static45.aClass308_1 = null;
		Static4.aLong3 = 0L;
		Static430.aClass3_Sub20_3 = null;
		Static656.aClass3_Sub20_2 = null;
		if (arg0) {
			Static482.method6863(12);
			return;
		}
		Static482.method6863(3);
		try {
			Static685.method3974(Static287.anApplet2, "loggedout");
		} catch (@Pc(140) Throwable local140) {
		}
	}
}
