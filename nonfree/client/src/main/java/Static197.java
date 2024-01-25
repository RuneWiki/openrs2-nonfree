import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!qs;Lclient!za;)V")
	public static void method3164(@OriginalArg(1) Class211 arg0, @OriginalArg(2) Class106 arg1) {
		if (Static9.aBoolean184) {
			return;
		}
		arg1.t(0);
		Static406.aClass137_14 = arg1.method5938(Static470.method6046(arg0, Static64.anInt1738));
		Static406.aClass137_14.method5708((Static152.anInt3234 - Static406.aClass137_14.RA()) / 2, (Static342.anInt6292 - Static406.aClass137_14.Q()) / 2);
		Static398.aClass137_19 = arg1.method5938(Static470.method6046(arg0, Static265.anInt5129));
		Static398.aClass137_19.method5708((Static152.anInt3234 - Static398.aClass137_19.RA()) / 2, 18);
		Static9.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[Ljava/lang/String;ZI[S)V")
	public static void method3165(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg0) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) String local18 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local18;
		@Pc(32) short local32 = arg3[local12];
		arg3[local12] = arg3[arg0];
		arg3[arg0] = local32;
		for (@Pc(44) int local44 = arg2; local44 < arg0; local44++) {
			if (local18 == null || arg1[local44] != null && arg1[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(64) String local64 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14] = local64;
				@Pc(78) short local78 = arg3[local44];
				arg3[local44] = arg3[local14];
				arg3[local14++] = local78;
			}
		}
		arg1[arg0] = arg1[local14];
		arg1[local14] = local18;
		arg3[arg0] = arg3[local14];
		arg3[local14] = local32;
		method3165(local14 - 1, arg1, arg2, arg3);
		method3165(arg0, arg1, local14 + 1, arg3);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public static void method3166(@OriginalArg(0) int arg0) {
		Static143.method2295();
		Static441.method5990();
		Static92.method1587(true, arg0);
		Static259.method3824(Static140.aClass211_38, Static24.aClass211_8, Static30.aClass106_3);
		Static318.method4543(Static30.aClass106_3, Static140.aClass211_38);
		Static27.method561();
		Static415.method5631(Static184.aClass137Array8);
		Static179.method3014();
		Static226.method3464();
		if (Static170.anInt3494 == 2) {
			Static118.method2017(3);
		} else if (Static170.anInt3494 == 6) {
			Static118.method2017(7);
		} else if (Static170.anInt3494 == 9) {
			Static118.method2017(10);
			return;
		} else if (Static170.anInt3494 == 1) {
			method3164(Static140.aClass211_38, Static30.aClass106_3);
			return;
		}
	}
}
