import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_25 = new Class177(81, 8);

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_30 = new Class263(74, 6);

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "[I")
	public static final int[] anIntArray145 = new int[1000];

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(II)Z")
	public static boolean method1142(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!ec;)V")
	public static void method1144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray33 != null) {
			@Pc(21) Class1_Sub10 local21 = new Class1_Sub10();
			local21.anObjectArray2 = arg2.anObjectArray33;
			local21.aClass68_3 = arg2;
			Static178.method3000(local21);
		}
		Static189.anInt3984 = arg2.anInt2136;
		Static118.anInt2743 = arg2.anInt2188;
		Static293.aBoolean300 = true;
		Static439.anInt7742 = arg0;
		Static132.anInt2941 = arg2.anInt2135;
		Static49.anInt1209 = arg2.anInt2154;
		Static181.anInt3937 = arg1;
		Static263.anInt5067 = arg2.anInt2139;
		Static446.method6042(arg2);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ou;Z)I")
	public static int method1146(@OriginalArg(0) Class30_Sub1_Sub1 arg0) {
		if (arg0.anInt1302 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(55) int local55;
		if (arg0.anInt1243 != -1) {
			@Pc(15) Class30_Sub1_Sub1 local15 = null;
			if (arg0.anInt1243 < 32768) {
				@Pc(27) Class1_Sub27 local27 = (Class1_Sub27) Static24.aClass38_3.method765((long) arg0.anInt1243);
				if (local27 != null) {
					local15 = local27.aClass30_Sub1_Sub1_Sub1_2;
				}
			} else if (arg0.anInt1243 >= 32768) {
				local15 = Static135.aClass30_Sub1_Sub1_Sub2Array1[arg0.anInt1243 - 32768];
			}
			if (local15 != null) {
				local55 = arg0.anInt7490 - local15.anInt7490;
				local61 = arg0.anInt7488 - local15.anInt7488;
				if (local55 != 0 || local61 != 0) {
					arg0.method941((int) (Math.atan2((double) local55, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class30_Sub1_Sub1_Sub2) {
			@Pc(87) Class30_Sub1_Sub1_Sub2 local87 = (Class30_Sub1_Sub1_Sub2) arg0;
			if (local87.anInt1318 != -1 && (local87.anInt1314 == 0 || local87.anInt1316 > 0)) {
				local87.method941(local87.anInt1318);
				local87.anInt1318 = -1;
			}
		} else if (arg0 instanceof Class30_Sub1_Sub1_Sub1) {
			@Pc(120) Class30_Sub1_Sub1_Sub1 local120 = (Class30_Sub1_Sub1_Sub1) arg0;
			if (local120.anInt896 != -1 && (local120.anInt1314 == 0 || local120.anInt1316 > 0)) {
				local55 = local120.anInt7490 - (local120.anInt896 - Static278.anInt5374 - Static278.anInt5374) * 64;
				local61 = local120.anInt7488 - (local120.anInt908 - Static380.anInt6896 - Static380.anInt6896) * 64;
				if (local55 != 0 || local61 != 0) {
					local120.method941((int) (Math.atan2((double) local55, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local120.anInt896 = -1;
			}
		}
		return arg0.method952();
	}
}
