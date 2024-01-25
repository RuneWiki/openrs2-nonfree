import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_57 = new Class223(32);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!bi;B)V")
	public static void method6626(@OriginalArg(0) Class31 arg0) {
		Static153.aClass31_33 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)[Lclient!db;")
	public static Class64[] method6627() {
		return new Class64[] { Static388.aClass64_330, Static312.aClass64_491, Static584.aClass64_484, Static369.aClass64_320, Static424.aClass64_346, Static350.aClass64_297, Static272.aClass64_233, Static286.aClass64_432, Static277.aClass64_235, Static10.aClass64_11, Static320.aClass64_288, Static65.aClass64_67, Static93.aClass64_89, Static21.aClass64_28, Static109.aClass64_102, Static86.aClass64_78, Static365.aClass64_315, Static85.aClass64_77, Static351.aClass64_299, Static70.aClass64_71, Static57.aClass64_57, Static288.aClass64_250, Static390.aClass64_332, Static395.aClass64_334, Static320.aClass64_287, Static369.aClass64_321, Static299.aClass64_259, Static86.aClass64_79, Static439.aClass64_481, Static436.aClass64_359, Static423.aClass64_345, Static264.aClass64_230, Static161.aClass64_136, Static43.aClass64_53, Static277.aClass64_236, Static133.aClass64_118, Static439.aClass64_483, Static31.aClass64_43, Static137.aClass64_122, Static2.aClass64_4, Static161.aClass64_137, Static96.aClass64_94, Static440.aClass64_366, Static172.aClass64_150, Static204.aClass64_171, Static535.aClass64_446, Static493.aClass64_425, Static154.aClass64_135, Static370.aClass64_322, Static571.aClass64_466, Static310.aClass64_277, Static317.aClass64_283, Static150.aClass64_436, Static408.aClass64_340, Static286.aClass64_431, Static497.aClass64_426, Static451.aClass64_493, Static537.aClass64_448, Static83.aClass64_490, Static366.aClass64_318, Static34.aClass64_459, Static333.aClass64_291, Static269.aClass64_231, Static364.aClass64_312, Static511.aClass64_56, Static586.aClass64_69, Static435.aClass64_353, Static315.aClass64_280, Static416.aClass64_343, Static12.aClass64_13, Static439.aClass64_482, Static317.aClass64_282, Static97.aClass64_419, Static172.aClass64_149, Static261.aClass64_229, Static198.aClass64_158, Static213.aClass64_176, Static227.aClass64_201, Static595.aClass64_492, Static443.aClass64_373, Static532.aClass64_445, Static135.aClass64_119, Static196.aClass64_157, Static353.aClass64_305, Static444.aClass64_375, Static464.aClass64_422, Static379.aClass64_338, Static27.aClass64_30, Static6.aClass64_7, Static589.aClass64_486, Static548.aClass64_458, Static439.aClass64_480, Static75.aClass64_74, Static442.aClass64_372, Static69.aClass64_70, Static215.aClass64_182, Static231.aClass64_207, Static45.aClass64_54, Static541.aClass64_454, Static178.aClass64_154, Static441.aClass64_365, Static39.aClass64_49, Static11.aClass64_12, Static210.aClass64_174, Static12.aClass64_14, Static408.aClass64_341, Static208.aClass64_173, Static200.aClass64_164, Static8.aClass64_463, Static389.aClass64_331, Static535.aClass64_447, Static242.aClass64_209, Static478.aClass64_418, Static518.aClass64_435, Static482.aClass64_421, Static217.aClass64_183, Static581.aClass64_478, Static578.aClass64_476 };
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)Lclient!fr;")
	public static Class4_Sub7_Sub5 method6629() {
		@Pc(16) Class4_Sub7_Sub5 local16 = (Class4_Sub7_Sub5) Static511.aClass286_2.method6403();
		if (local16 != null) {
			local16.method8013();
			local16.method7963();
			return local16;
		}
		do {
			local16 = (Class4_Sub7_Sub5) Static211.aClass286_5.method6403();
			if (local16 == null) {
				return null;
			}
			if (local16.method3064() > Static184.method3422()) {
				return null;
			}
			local16.method8013();
			local16.method7963();
		} while ((Long.MIN_VALUE & local16.aLong303) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method6630(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static200.method3596(arg1.charAt(local12));
			@Pc(39) int local39 = local12 + 1 < local10 ? Static200.method3596(arg1.charAt(local12 + 1)) : -1;
			@Pc(58) int local58 = local12 + 2 < local10 ? Static200.method3596(arg1.charAt(local12 + 2)) : -1;
			@Pc(73) int local73 = local10 <= local12 + 3 ? -1 : Static200.method3596(arg1.charAt(local12 + 3));
			arg0[arg2++] = (byte) (local20 << 2 | local39 >>> 4);
			if (local58 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local58 >>> 2 | (local39 & 0xF) << 4);
			if (local73 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local58 & 0x3) << 6 | local73);
		}
		return arg2;
	}
}
