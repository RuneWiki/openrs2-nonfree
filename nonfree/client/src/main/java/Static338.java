import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
	public static final int anInt6015 = 2;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "(I)V")
	public static void method5050() {
		if (!Static7.aBoolean4) {
			return;
		}
		while (true) {
			while (Static161.aClass208_Sub1Array1.length > Static393.anInt6805) {
				@Pc(29) Class208_Sub1 local29 = Static161.aClass208_Sub1Array1[Static393.anInt6805];
				if (local29 != null && local29.anInt5561 == -1) {
					if (Static232.aClass1_Sub45_1 == null) {
						Static232.aClass1_Sub45_1 = Static103.aClass308_1.method6990(local29.aString62);
					}
					@Pc(53) int local53 = Static232.aClass1_Sub45_1.anInt8349;
					if (local53 == -1) {
						return;
					}
					Static232.aClass1_Sub45_1 = null;
					local29.anInt5561 = local53;
					Static393.anInt6805++;
				} else {
					Static393.anInt6805++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!r;)V")
	public static void method5051(@OriginalArg(1) Class12 arg0) {
		Static443.aClass35_11 = Static56.method1302(arg0, Static428.anInt4964, true);
		Static481.aClass13_13 = Static133.method2255(Static428.anInt4964, arg0);
		Static21.aClass35_1 = Static56.method1302(arg0, Static474.anInt1074, true);
		Static510.aClass13_14 = Static133.method2255(Static474.anInt1074, arg0);
		Static260.aClass35_7 = Static56.method1302(arg0, Static178.anInt3195, true);
		Static566.aClass13_15 = Static133.method2255(Static178.anInt3195, arg0);
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)V")
	public static void method5052() {
		@Pc(6) Class326 local6 = Static11.aClass326_1;
		synchronized (Static11.aClass326_1) {
			Static11.aClass326_1.method7230();
		}
		local6 = Static282.aClass326_26;
		synchronized (Static282.aClass326_26) {
			Static282.aClass326_26.method7230();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!r;Lclient!ga;I)V")
	public static void method5054(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class111 arg1) {
		@Pc(10) Class318[] local10 = Static604.method7068(arg1, Static437.anInt8760);
		Static344.aClass10Array16 = new Class10[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static344.aClass10Array16[local16] = arg0.method6434(local10[local16], true);
		}
		local10 = Static604.method7068(arg1, Static293.anInt5408);
		Static384.aClass10Array19 = new Class10[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static384.aClass10Array19[local43] = arg0.method6434(local10[local43], true);
		}
		local10 = Static604.method7068(arg1, Static381.anInt6721);
		Static484.aClass10Array22 = new Class10[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static484.aClass10Array22[local74] = arg0.method6434(local10[local74], true);
		}
		local10 = Static604.method7068(arg1, Static519.anInt8577);
		Static192.aClass10Array12 = new Class10[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static192.aClass10Array12[local101] = arg0.method6434(local10[local101], true);
		}
		local10 = Static604.method7068(arg1, Static258.anInt4753);
		Static114.aClass10Array9 = new Class10[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static114.aClass10Array9[local128] = arg0.method6434(local10[local128], true);
		}
		local10 = Static604.method7068(arg1, Static152.anInt2853);
		Static30.aClass10Array1 = new Class10[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static30.aClass10Array1[local159] = arg0.method6434(local10[local159], true);
		}
		local10 = Static604.method7068(arg1, Static410.anInt7006);
		Static492.aClass10Array23 = new Class10[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static492.aClass10Array23[local186] = arg0.method6434(local10[local186], true);
		}
		local10 = Static604.method7068(arg1, Static88.anInt1982);
		Static482.aClass10Array21 = new Class10[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static482.aClass10Array21[local221] = arg0.method6434(local10[local221], true);
		}
		local10 = Static604.method7068(arg1, Static303.anInt9538);
		Static78.aClass10Array8 = new Class10[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static78.aClass10Array8[local248] = arg0.method6434(local10[local248], true);
		}
		local10 = Static604.method7068(arg1, Static485.anInt8187);
		Static523.aClass10Array25 = new Class10[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static523.aClass10Array25[local279] = arg0.method6434(local10[local279], true);
		}
		local10 = Static604.method7068(arg1, Static293.anInt5413);
		Static538.aClass10Array24 = new Class10[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static538.aClass10Array24[local310] = arg0.method6434(local10[local310], true);
		}
		local10 = Static604.method7068(arg1, Static46.anInt1216);
		Static39.aClass10Array5 = new Class10[local10.length];
		for (@Pc(341) int local341 = 0; local341 < local10.length; local341++) {
			Static39.aClass10Array5[local341] = arg0.method6434(local10[local341], true);
		}
		Static9.aClass10_4 = arg0.method6434(Static604.method7062(arg1, Static246.anInt8756, 0), true);
		Static276.aClass10_18 = arg0.method6434(Static604.method7062(arg1, Static355.anInt6209, 0), true);
		local10 = Static604.method7068(arg1, Static501.anInt8419);
		Static130.aClass10Array20 = new Class10[local10.length];
		for (@Pc(388) int local388 = 0; local388 < local10.length; local388++) {
			Static130.aClass10Array20[local388] = arg0.method6434(local10[local388], true);
		}
	}
}
