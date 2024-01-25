import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	public static int anInt8098;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
	public static final int anInt8105 = 52;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method6935(@OriginalArg(1) String arg0) {
		return Static687.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZIIII)V")
	public static void method6939(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg3 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(46) int local46 = Static680.aShort119 + local23 * (Static304.aShort63 - Static680.aShort119) / 100;
		if (local46 < Static232.aShort50) {
			local46 = Static232.aShort50;
		} else if (local46 > Static59.aShort26) {
			local46 = Static59.aShort26;
		}
		@Pc(74) int local74 = arg3 * local46 * 512 / (arg4 * 334);
		@Pc(120) int local120;
		@Pc(127) int local127;
		@Pc(91) short local91;
		if (local74 < Static720.aShort128) {
			local91 = Static720.aShort128;
			local46 = arg4 * 334 * local91 / (arg3 * 512);
			if (local46 > Static59.aShort26) {
				local46 = Static59.aShort26;
				local120 = local46 * arg3 * 512 / (local91 * 334);
				local127 = (arg4 - local120) / 2;
				if (arg1) {
					Static153.aClass22_4.la();
					Static153.aClass22_4.method9378(arg2, arg0, -16777216, arg3, local127);
					Static153.aClass22_4.method9378(arg2, arg4 + arg0 - local127, -16777216, arg3, local127);
				}
				arg4 -= local127 * 2;
				arg0 += local127;
			}
		} else if (Static608.aShort99 < local74) {
			local91 = Static608.aShort99;
			local46 = local91 * 334 * arg4 / (arg3 * 512);
			if (local46 < Static232.aShort50) {
				local46 = Static232.aShort50;
				local120 = arg4 * local91 * 334 / (local46 * 512);
				local127 = (arg3 - local120) / 2;
				if (arg1) {
					Static153.aClass22_4.la();
					Static153.aClass22_4.method9378(arg2, arg0, -16777216, local127, arg4);
					Static153.aClass22_4.method9378(arg2 + arg3 - local127, arg0, -16777216, local127, arg4);
				}
				arg2 += local127;
				arg3 -= local127 * 2;
			}
		}
		Static117.anInt2407 = arg2;
		Static239.anInt3796 = (short) arg4;
		Static469.anInt7375 = arg0;
		Static599.anInt9087 = arg3 * local46 / 334;
		Static581.anInt8861 = (short) arg3;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public static void method6941() {
		Static265.aClass292_3.method6856();
		Static265.aClass292_3.anInt8011 = 0;
		Static265.aClass292_3.aClass397_133 = null;
		Static708.anInt11107 = 0;
		Static265.aClass292_3.aClass397_130 = null;
		Static265.aClass292_3.aClass397_132 = null;
		Static265.aClass292_3.anInt8012 = 0;
		Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
		Static265.aClass292_3.aClass397_131 = null;
		Static338.method4844();
		Static136.method2376();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local45] = null;
		}
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 = null;
		for (@Pc(61) int local61 = 0; local61 < Static568.anInt8629; local61++) {
			@Pc(70) Class9_Sub1_Sub1_Sub2_Sub2 local70 = Static169.aClass3_Sub52Array1[local61].aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local70 != null) {
				local70.anInt8767 = -1;
			}
		}
		Static56.method1313();
		Static262.anInt4081 = 1;
		Static358.anInt5640 = -1;
		Static494.anInt7853 = -1;
		Static336.method4832(11);
		for (@Pc(94) int local94 = 0; local94 < 100; local94++) {
			Static572.aBooleanArray23[local94] = true;
		}
		Static353.method4960();
		Static369.aClass3_Sub3_2 = null;
		Static85.aLong68 = 0L;
	}
}
