import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt4496 = 1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method3961() {
		if (Static6.anIntArray6 != null) {
			return;
		}
		Static6.anIntArray6 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = (local50 + 1.0D) * local57;
				} else {
					local80 = local57 + local50 - local50 * local57;
				}
				@Pc(94) double local94 = local57 * 2.0D - local80;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local94 + local98 * 6.0D * (local80 - local94);
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = local94 + (0.6666666666666666D - local98) * (local80 - local94) * 6.0D;
				} else {
					local59 = local94;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + (local80 - local94) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local94 + (0.6666666666666666D - local39) * (-local94 + local80) * 6.0D;
				} else {
					local61 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = (local80 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local112) * 6.0D * (local80 - local94) + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local17);
			local61 = Math.pow(local61, local17);
			local63 = Math.pow(local63, local17);
			@Pc(282) int local282 = (int) (local59 * 256.0D);
			@Pc(287) int local287 = (int) (local61 * 256.0D);
			@Pc(292) int local292 = (int) (local63 * 256.0D);
			@Pc(302) int local302 = (local287 << 8) + (local282 << 16) + local292;
			Static6.anIntArray6[local26] = local302;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3962(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static527.method7366(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ha;Lclient!cb;I)V")
	public static void method3963(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(8) Class301[] local8 = Static684.method7227(arg1, Static628.anInt10042);
		Static117.aClass59Array3 = new Class59[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static117.aClass59Array3[local14] = arg0.method6247(local8[local14], true);
		}
		local8 = Static684.method7227(arg1, Static326.anInt5967);
		Static574.aClass59Array17 = new Class59[local8.length];
		for (@Pc(40) int local40 = 0; local40 < local8.length; local40++) {
			Static574.aClass59Array17[local40] = arg0.method6247(local8[local40], true);
		}
		local8 = Static684.method7227(arg1, Static353.anInt6238);
		Static267.aClass59Array9 = new Class59[local8.length];
		for (@Pc(70) int local70 = 0; local70 < local8.length; local70++) {
			Static267.aClass59Array9[local70] = arg0.method6247(local8[local70], true);
		}
		local8 = Static684.method7227(arg1, Static151.anInt8737);
		Static177.aClass59Array6 = new Class59[local8.length];
		for (@Pc(100) int local100 = 0; local100 < local8.length; local100++) {
			Static177.aClass59Array6[local100] = arg0.method6247(local8[local100], true);
		}
		local8 = Static684.method7227(arg1, Static16.anInt9839);
		Static474.aClass59Array15 = new Class59[local8.length];
		for (@Pc(130) int local130 = 0; local130 < local8.length; local130++) {
			Static474.aClass59Array15[local130] = arg0.method6247(local8[local130], true);
		}
		local8 = Static684.method7227(arg1, Static427.anInt10574);
		Static283.aClass59Array10 = new Class59[local8.length];
		for (@Pc(160) int local160 = 0; local160 < local8.length; local160++) {
			Static283.aClass59Array10[local160] = arg0.method6247(local8[local160], true);
		}
		local8 = Static684.method7227(arg1, Static187.anInt3086);
		Static558.aClass59Array16 = new Class59[local8.length];
		for (@Pc(186) int local186 = 0; local186 < local8.length; local186++) {
			Static558.aClass59Array16[local186] = arg0.method6247(local8[local186], true);
		}
		local8 = Static684.method7227(arg1, Static494.anInt8445);
		Static326.aClass59Array13 = new Class59[local8.length];
		for (@Pc(216) int local216 = 0; local216 < local8.length; local216++) {
			Static326.aClass59Array13[local216] = arg0.method6247(local8[local216], true);
		}
		local8 = Static684.method7227(arg1, Static494.anInt8451);
		Static237.aClass59Array7 = new Class59[local8.length];
		for (@Pc(246) int local246 = 0; local246 < local8.length; local246++) {
			Static237.aClass59Array7[local246] = arg0.method6247(local8[local246], true);
		}
		local8 = Static684.method7227(arg1, Static675.anInt10615);
		Static665.aClass59Array14 = new Class59[local8.length];
		for (@Pc(272) int local272 = 0; local272 < local8.length; local272++) {
			Static665.aClass59Array14[local272] = arg0.method6247(local8[local272], true);
		}
		local8 = Static684.method7227(arg1, Static311.anInt5530);
		Static137.aClass59Array4 = new Class59[local8.length];
		for (@Pc(302) int local302 = 0; local302 < local8.length; local302++) {
			Static137.aClass59Array4[local302] = arg0.method6247(local8[local302], true);
		}
		local8 = Static684.method7227(arg1, Static560.anInt9142);
		Static166.aClass59Array5 = new Class59[local8.length];
		for (@Pc(328) int local328 = 0; local328 < local8.length; local328++) {
			Static166.aClass59Array5[local328] = arg0.method6247(local8[local328], true);
		}
		Static283.aClass59_12 = arg0.method6247(Static684.method7228(arg1, Static35.anInt492, 0), true);
		Static649.aClass59_39 = arg0.method6247(Static684.method7228(arg1, Static476.anInt8259, 0), true);
		local8 = Static684.method7227(arg1, Static307.anInt5470);
		Static24.aClass59Array1 = new Class59[local8.length];
		for (@Pc(370) int local370 = 0; local370 < local8.length; local370++) {
			Static24.aClass59Array1[local370] = arg0.method6247(local8[local370], true);
		}
	}
}
