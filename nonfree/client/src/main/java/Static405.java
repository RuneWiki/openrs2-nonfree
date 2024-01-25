import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!kr;")
	public static Class20 aClass20_31;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_116 = new Class274(7, 1);

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	public static void method6250() {
		if (Static113.anInt2175 == 0 || Static463.aClass64_12 == null) {
			return;
		}
		Static328.aClass87_6.K(Static42.anIntArray105);
		for (@Pc(12) int local12 = 0; local12 < Static643.anIntArray750.length; local12++) {
			Static328.aClass87_6.method7921(Static643.anIntArray750[local12] + Static641.anIntArray741[local12], -256, Static42.anIntArray105[1], Static42.anIntArray105[3] - Static42.anIntArray105[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static612.anInt9984; local41++) {
			@Pc(46) Class10 local46 = Static76.aClass10Array1[local41];
			Static328.aClass87_6.H(local46.anIntArray25[0], local46.anIntArray26[0], local46.anIntArray24[0], Static265.anIntArray351);
			Static328.aClass87_6.H(local46.anIntArray25[1], local46.anIntArray26[1], local46.anIntArray24[1], Static527.anIntArray606);
			Static328.aClass87_6.H(local46.anIntArray25[2], local46.anIntArray26[2], local46.anIntArray24[2], Static343.anIntArray414);
			Static328.aClass87_6.H(local46.anIntArray25[3], local46.anIntArray26[3], local46.anIntArray24[3], Static369.anIntArray442);
			if (Static265.anIntArray351[2] != -1 && Static527.anIntArray606[2] != -1 && Static343.anIntArray414[2] != -1 && Static369.anIntArray442[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte1 == 4) {
					local128 = -16776961;
				}
				Static328.aClass87_6.method7964(Static527.anIntArray606[1], Static527.anIntArray606[0], Static265.anIntArray351[0], local128, Static265.anIntArray351[1]);
				Static328.aClass87_6.method7964(Static343.anIntArray414[1], Static343.anIntArray414[0], Static527.anIntArray606[0], local128, Static527.anIntArray606[1]);
				Static328.aClass87_6.method7964(Static369.anIntArray442[1], Static369.anIntArray442[0], Static343.anIntArray414[0], local128, Static343.anIntArray414[1]);
				Static328.aClass87_6.method7964(Static265.anIntArray351[1], Static265.anIntArray351[0], Static369.anIntArray442[0], local128, Static369.anIntArray442[1]);
				Static328.aClass87_6.method7964(Static343.anIntArray414[1], Static343.anIntArray414[0], Static265.anIntArray351[0], local128, Static265.anIntArray351[1]);
			}
		}
		Static463.aClass64_12.method7508(30, "Static Opaque: OW: " + Static336.anIntArray411[0] + "/" + Static243.anIntArray331[0] + " UW: " + Static336.anIntArray411[1] + "/" + Static243.anIntArray331[1], -16777216, 10, -256);
		Static463.aClass64_12.method7508(45, "Static Trans: OW: " + Static442.anIntArray535[0] + "/" + Static368.anIntArray275[0] + " UW: " + Static442.anIntArray535[1] + "/" + Static368.anIntArray275[1], -16777216, 10, -256);
		Static463.aClass64_12.method7508(60, "Static Anim: OW: " + Static429.anIntArray527[0] + "/" + Static625.anIntArray722[0] + " UW: " + Static429.anIntArray527[1] + "/" + Static625.anIntArray722[1], -16777216, 10, -256);
		Static463.aClass64_12.method7508(75, "Dynamic: " + Static226.anInt4632 + "/" + 5000, -16777216, 10, -256);
		Static463.aClass64_12.method7508(90, "Total Opaque Onscreen: " + Static530.anInt8847 + "/" + 10000, -16777216, 10, -256);
		Static463.aClass64_12.method7508(105, "Total Trans Onscreen: " + Static539.anInt8993 + "/" + 5000, -16777216, 10, -256);
		Static463.aClass64_12.method7508(120, "Occluders: " + (Static509.anInt8568 + Static220.anInt4569) + " Active: " + Static612.anInt9984, -16777216, 10, -256);
		Static463.aClass64_12.method7508(135, "Occluded: Ground:" + Static451.anInt7925 + " Walls: " + Static120.anInt5454 + " CPs: " + Static33.anInt861 + " Pixels: " + Static141.anInt3106, -16777216, 10, -256);
		Static463.aClass64_12.method7508(150, "Occlude Calc Took: " + Static427.aLong216 / 1000L + "us", -16777216, 10, -256);
		if (Static113.anInt2175 != 2 || Static385.anIntArray465 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static385.anIntArray465.length; local461++) {
			@Pc(467) float local467 = (float) Static385.anIntArray465[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static385.anIntArray465[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(516) Class20 local516 = Static328.aClass87_6.method7913(Static64.anInt1374, Static385.anIntArray465, Static64.anInt1374, Static16.anInt299);
		local516.method4581(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!dm;Z)V")
	public static void method6251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2) {
		if (Static301.aBoolean423) {
			@Pc(14) Class79 local14 = Static608.anInt3500 == -1 ? null : Static584.aClass206_2.method4916(Static608.anInt3500);
			if (Static69.method1332(arg2).method6405() && (Static73.anInt1590 & 0x20) != 0 && (local14 == null || arg2.method1689(local14.anInt2016, Static608.anInt3500) != local14.anInt2016)) {
				Static115.method1856((long) (arg2.anInt1978 << 0 | arg2.anInt1968), Static109.aString27 + " -> " + arg2.aString23, arg2.anInt1978, 0L, true, Static81.aString20, 51, false, arg2.anInt1968, false, Static20.anInt623, arg2.anInt2006);
			}
		}
		@Pc(89) String local89;
		for (@Pc(82) int local82 = 9; local82 >= 5; local82--) {
			local89 = Static80.method1498(arg2, local82);
			if (local89 != null) {
				Static115.method1856((long) (arg2.anInt1978 << 0 | arg2.anInt1968), arg2.aString23, arg2.anInt1978, (long) (local82 + 1), true, local89, 1001, false, arg2.anInt1968, false, Static593.method8174(arg2, local82), arg2.anInt2006);
			}
		}
		local89 = Static371.method5590(arg2);
		if (local89 != null) {
			Static115.method1856((long) (arg2.anInt1968 | arg2.anInt1978 << 0), arg2.aString23, arg2.anInt1978, 0L, true, local89, 47, false, arg2.anInt1968, false, arg2.lb, arg2.anInt2006);
		}
		for (@Pc(168) int local168 = 4; local168 >= 0; local168--) {
			@Pc(175) String local175 = Static80.method1498(arg2, local168);
			if (local175 != null) {
				Static115.method1856((long) (arg2.anInt1978 << 0 | arg2.anInt1968), arg2.aString23, arg2.anInt1978, (long) (local168 + 1), true, local175, 44, false, arg2.anInt1968, false, Static593.method8174(arg2, local168), arg2.anInt2006);
			}
		}
		if (!Static69.method1332(arg2).method6408()) {
			return;
		}
		if (arg2.aString24 == null) {
			Static115.method1856((long) (arg2.anInt1978 << 0 | arg2.anInt1968), "", arg2.anInt1978, 0L, true, Static628.aClass369_9.method8475(Static377.anInt6756), 60, false, arg2.anInt1968, false, -1, arg2.anInt2006);
		} else {
			Static115.method1856((long) (arg2.anInt1978 << 0 | arg2.anInt1968), "", arg2.anInt1978, 0L, true, arg2.aString24, 60, false, arg2.anInt1968, false, -1, arg2.anInt2006);
		}
	}
}
