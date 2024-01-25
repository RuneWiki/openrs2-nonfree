import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZBZII)I")
	public static int method2882(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class5_Sub24 local10 = Static459.method6391(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10.anIntArray261.length; local26++) {
			if (local10.anIntArray261[local26] >= 0 && local10.anIntArray261[local26] < Static451.aClass67_2.anInt2179) {
				@Pc(51) Class22 local51 = Static451.aClass67_2.method2006(local10.anIntArray261[local26]);
				@Pc(61) int local61 = local51.method674(arg1, Static216.aClass298_11.method6969(arg1).anInt3793);
				if (arg0) {
					local16 += local61 * local10.anIntArray260[local26];
				} else {
					local16 += local61;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
	public static void method2883(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 9);
		local8.method1324();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)Z")
	public static boolean method2884(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2885(@OriginalArg(0) String arg0) {
		if (Static9.aString8.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static9.aString8.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static9.aString8.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)Z")
	public static boolean method2886(@OriginalArg(0) int arg0) {
		Static360.aBoolean479 = true;
		Static39.anInt914 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I")
	public static int method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local26 + (((arg0 & 0xFF00) * local8 & 0xFF0000 | (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8);
	}
}
