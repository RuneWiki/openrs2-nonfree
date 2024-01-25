import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([Lclient!oh;IB)V")
	public static void method1436(@OriginalArg(0) Class220[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class220 local21 = arg0[local15];
			if (local21 != null) {
				if (local21.anInt6669 == 0) {
					if (local21.aClass220Array6 != null) {
						method1436(local21.aClass220Array6, arg1);
					}
					@Pc(47) Class5_Sub43 local47 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local21.anInt6661);
					if (local47 != null) {
						Static207.method3360(local47.anInt7801, arg1);
					}
				}
				@Pc(66) Class5_Sub17 local66;
				if (arg1 == 0 && local21.anObjectArray19 != null) {
					local66 = new Class5_Sub17();
					local66.anObjectArray3 = local21.anObjectArray19;
					local66.aClass220_5 = local21;
					Static266.method4403(local66);
				}
				if (arg1 == 1 && local21.anObjectArray20 != null) {
					if (local21.anInt6674 >= 0) {
						@Pc(89) Class220 local89 = Static352.method5447(local21.anInt6661);
						if (local89 == null || local89.aClass220Array6 == null || local89.aClass220Array6.length <= local21.anInt6674 || local21 != local89.aClass220Array6[local21.anInt6674]) {
							continue;
						}
					}
					local66 = new Class5_Sub17();
					local66.anObjectArray3 = local21.anObjectArray20;
					local66.aClass220_5 = local21;
					Static266.method4403(local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method1437(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class14 local9 = Static193.aClass14Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static193.aClass14Array1[local11] = Static193.aClass14Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class14(arg6, arg1, arg3, arg5, arg2, arg4, arg0);
		} else {
			local9.method533(arg5, arg1, arg6, arg3, arg2, arg4, arg0);
		}
		Static193.aClass14Array1[0] = local9;
		Static383.anInt6995 = Static356.anInt6716;
		Static484.anInt8950++;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public static void method1438() {
		Static286.aBoolean403 = true;
	}
}
