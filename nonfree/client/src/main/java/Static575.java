import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Lclient!nj;")
	public static final Class212 aClass212_41 = new Class212(512);

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	public static int anInt9609 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[Lclient!fca;I)V")
	public static void method7838(@OriginalArg(0) int arg0, @OriginalArg(1) Class97[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class97 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt2325 && !Static65.method860(local9)) {
				if (local9.anInt2264 == 0) {
					method7838(local9.anInt2311, arg1);
					if (local9.aClass97Array1 != null) {
						method7838(local9.anInt2311, local9.aClass97Array1);
					}
					@Pc(43) Class6_Sub31 local43 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local9.anInt2311);
					if (local43 != null) {
						Static344.method5182(local43.anInt4563);
					}
				}
				if (local9.anInt2264 == 6 && local9.anInt2310 != -1) {
					@Pc(65) Class108 local65 = Static31.aClass345_1.method7798(local9.anInt2310);
					if (local65 != null) {
						local9.anInt2272 += Static267.anInt4424;
						while (local9.anInt2272 > local65.anIntArray313[local9.anInt2304]) {
							local9.anInt2272 -= local65.anIntArray313[local9.anInt2304];
							local9.anInt2304++;
							if (local65.anIntArray312.length <= local9.anInt2304) {
								local9.anInt2304 -= local65.anInt2603;
								if (local9.anInt2304 < 0 || local65.anIntArray312.length <= local9.anInt2304) {
									local9.anInt2304 = 0;
								}
							}
							local9.anInt2287 = local9.anInt2304 + 1;
							if (local9.anInt2287 >= local65.anIntArray312.length) {
								local9.anInt2287 -= local65.anInt2603;
								if (local9.anInt2287 < 0 || local65.anIntArray312.length <= local9.anInt2287) {
									local9.anInt2287 = -1;
								}
							}
							Static390.method5794(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)V")
	public static void method7841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static205.anInt3498 = arg0;
		Static309.anInt5560 = arg3;
		Static152.anInt2703 = arg2;
		Static277.anInt4615 = arg4;
		Static71.anInt1189 = arg1;
		if (Static205.anInt3498 >= 100) {
			@Pc(24) int local24 = Static71.anInt1189 * 512 + 256;
			@Pc(30) int local30 = Static152.anInt2703 * 512 + 256;
			@Pc(38) int local38 = Static490.method6768(local24, Static282.anInt4677, local30) - Static277.anInt4615;
			@Pc(43) int local43 = local24 - Static388.anInt6921;
			@Pc(48) int local48 = local38 - Static33.anInt568;
			@Pc(52) int local52 = local30 - Static220.anInt3753;
			@Pc(63) int local63 = (int) Math.sqrt((double) (local43 * local43 + local52 * local52));
			Static162.anInt2840 = (int) (Math.atan2((double) local48, (double) local63) * 2607.5945876176133D) & 0x3FFF;
			Static261.anInt4257 = (int) (-2607.5945876176133D * Math.atan2((double) local43, (double) local52)) & 0x3FFF;
			Static218.anInt3720 = 0;
			if (Static162.anInt2840 < 1024) {
				Static162.anInt2840 = 1024;
			}
			if (Static162.anInt2840 > 3072) {
				Static162.anInt2840 = 3072;
			}
		}
		Static354.anInt6233 = 2;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method7842(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static466.anInt7907 = 1;
		Static177.anInt3167 = -1;
		Static217.method3195(arg1, arg0, false);
	}
}
