import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Lclient!jb;")
	public static Class28 aClass28_7;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Lclient!sc;")
	private static Class107 aClass107_133 = Static231.method3737("Please remove ");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_130 = aClass107_133;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_131 = aClass107_133;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
	public static int[] anIntArray38 = new int[2048];

	@OriginalMember(owner = "client!be", name = "r", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array1 = new Class107[100];

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_132 = Static231.method3737("<col=ffb000>");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!o;)V")
	public static void method354(@OriginalArg(1) Class86 arg0) {
		if (arg0.anInt3254 == Static176.anInt3805) {
			Static39.aBooleanArray5[arg0.anInt3234] = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[B)V")
	public static void method356(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub26 local10 = new Class1_Sub26(arg0);
		local10.anInt4021 = arg0.length - 2;
		Static40.anInt855 = local10.method2964();
		Static159.aByteArrayArray8 = new byte[Static40.anInt855][];
		Static141.anIntArray266 = new int[Static40.anInt855];
		Static56.anIntArray124 = new int[Static40.anInt855];
		Static223.anIntArray373 = new int[Static40.anInt855];
		Static169.aBooleanArray23 = new boolean[Static40.anInt855];
		Static158.aByteArrayArray7 = new byte[Static40.anInt855][];
		Static172.anIntArray329 = new int[Static40.anInt855];
		local10.anInt4021 = arg0.length - Static40.anInt855 * 8 - 7;
		Static155.anInt432 = local10.method2964();
		Static182.anInt4094 = local10.method2964();
		@Pc(72) int local72 = (local10.method2945() & 0xFF) + 1;
		for (@Pc(74) int local74 = 0; local74 < Static40.anInt855; local74++) {
			Static56.anIntArray124[local74] = local10.method2964();
		}
		for (@Pc(92) int local92 = 0; local92 < Static40.anInt855; local92++) {
			Static223.anIntArray373[local92] = local10.method2964();
		}
		for (@Pc(106) int local106 = 0; local106 < Static40.anInt855; local106++) {
			Static141.anIntArray266[local106] = local10.method2964();
		}
		for (@Pc(120) int local120 = 0; local120 < Static40.anInt855; local120++) {
			Static172.anIntArray329[local120] = local10.method2964();
		}
		local10.anInt4021 = arg0.length + 3 - Static40.anInt855 * 8 - local72 * 3 - 7;
		Static169.anIntArray324 = new int[local72];
		for (@Pc(158) int local158 = 1; local158 < local72; local158++) {
			Static169.anIntArray324[local158] = local10.method2937();
			if (Static169.anIntArray324[local158] == 0) {
				Static169.anIntArray324[local158] = 1;
			}
		}
		local10.anInt4021 = 0;
		for (@Pc(183) int local183 = 0; local183 < Static40.anInt855; local183++) {
			@Pc(189) int local189 = Static141.anIntArray266[local183];
			@Pc(193) int local193 = Static172.anIntArray329[local183];
			@Pc(197) int local197 = local189 * local193;
			@Pc(200) byte[] local200 = new byte[local197];
			Static158.aByteArrayArray7[local183] = local200;
			@Pc(207) byte[] local207 = new byte[local197];
			Static159.aByteArrayArray8[local183] = local207;
			@Pc(215) int local215 = local10.method2945();
			@Pc(217) boolean local217 = false;
			@Pc(223) int local223;
			@Pc(241) int local241;
			if ((local215 & 0x1) == 0) {
				for (local223 = 0; local223 < local197; local223++) {
					local200[local223] = local10.method2992();
				}
				if ((local215 & 0x2) != 0) {
					for (local241 = 0; local241 < local197; local241++) {
						@Pc(251) byte local251 = local207[local241] = local10.method2992();
						local217 |= local251 != -1;
					}
				}
			} else {
				local223 = 0;
				label96: while (true) {
					if (local223 >= local189) {
						if ((local215 & 0x2) == 0) {
							break;
						}
						local241 = 0;
						while (true) {
							if (local241 >= local189) {
								break label96;
							}
							for (@Pc(314) int local314 = 0; local314 < local193; local314++) {
								@Pc(329) byte local329 = local207[local241 + local189 * local314] = local10.method2992();
								local217 |= local329 != -1;
							}
							local241++;
						}
					}
					for (local241 = 0; local241 < local193; local241++) {
						local200[local189 * local241 + local223] = local10.method2992();
					}
					local223++;
				}
			}
			Static169.aBooleanArray23[local183] = local217;
		}
	}
}
