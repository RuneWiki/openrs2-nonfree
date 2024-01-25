import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array3;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "[Lclient!lf;")
	public static Class114[] aClass114Array1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public static int anInt378;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
	public static final int[] anIntArray30 = new int[14];

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "J")
	public static volatile long aLong13 = 0L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)I")
	public static int method431(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!tm;B)V")
	public static void method432(@OriginalArg(0) Class10_Sub3_Sub3_Sub2 arg0) {
		if (Static41.anInt980 >= 400 || arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1) {
			return;
		}
		@Pc(137) String local137;
		@Pc(68) int local68;
		if (arg0.anInt6007 == 0) {
			@Pc(26) boolean local26 = true;
			if (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6006 != -1 && arg0.anInt6006 != -1) {
				@Pc(46) int local46 = arg0.anInt6005 < Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005 ? Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005 : arg0.anInt6005;
				@Pc(57) int local57 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6006 < arg0.anInt6006 ? Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6006 : arg0.anInt6006;
				local68 = local46 * 10 / 100 + local57 + 5;
				@Pc(74) int local74 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005 - arg0.anInt6005;
				if (local74 < 0) {
					local74 = -local74;
				}
				if (local74 > local68) {
					local26 = false;
				}
			}
			@Pc(96) String local96 = Static45.anInt1136 == 1 ? Static93.aString81 : Static148.aString115;
			if (arg0.anInt6005 >= arg0.anInt5998) {
				local137 = arg0.method5375() + (local26 ? Static202.method3737(arg0.anInt6005, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005) : "<col=ffffff>") + " (" + local96 + arg0.anInt6005 + ")";
			} else {
				local137 = arg0.method5375() + (local26 ? Static202.method3737(arg0.anInt6005, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005) : "<col=ffffff>") + " (" + local96 + arg0.anInt6005 + "+" + (arg0.anInt5998 - arg0.anInt6005) + ")";
			}
		} else {
			local137 = arg0.method5375() + " (" + Static249.aString181 + arg0.anInt6007 + ")";
		}
		if (Static312.anInt6025 == 1) {
			Static223.method5291((long) arg0.anInt5954, Static2.aString1, 0, Static37.anInt891, 32, 0, Static328.aString237 + " -> <col=ffffff>" + local137);
		} else if (!Static184.aBoolean241) {
			for (@Pc(241) int local241 = 7; local241 >= 0; local241--) {
				if (Static348.aStringArray64[local241] != null) {
					@Pc(249) short local249 = 0;
					if (Static45.anInt1136 == 0 && Static348.aStringArray64[local241].equalsIgnoreCase(Static161.aString122)) {
						if (arg0.anInt6005 > Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005) {
							local249 = 2000;
						}
						if (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5992 != 0 && arg0.anInt5992 != 0) {
							if (arg0.anInt5992 == Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5992) {
								local249 = 2000;
							} else {
								local249 = 0;
							}
						}
					} else if (Static325.aBooleanArray27[local241]) {
						local249 = 2000;
					}
					@Pc(303) short local303 = (short) (Static171.aShortArray86[local241] + local249);
					local68 = Static56.anIntArray92[local241] == -1 ? Static60.anInt1450 : Static56.anIntArray92[local241];
					Static223.method5291((long) arg0.anInt5954, Static348.aStringArray64[local241], 0, local68, local303, 0, "<col=ffffff>" + local137);
				}
			}
		} else if ((Static103.anInt2305 & 0x8) != 0) {
			Static223.method5291((long) arg0.anInt5954, Static324.aString230, 0, Static5.anInt4503, 44, 0, Static78.aString73 + " -> <col=ffffff>" + local137);
		}
		for (@Pc(375) Class14_Sub23 local375 = (Class14_Sub23) Static95.aClass18_9.method459(); local375 != null; local375 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			if (local375.anInt4355 == 34) {
				local375.aString155 = "<col=ffffff>" + local137;
				return;
			}
		}
	}
}
