import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt8430;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "F")
	public static float aFloat170;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	public static int anInt8431 = 0;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
	public static final int[] anIntArray531 = new int[32];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Z")
	public static boolean aBoolean645 = true;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "[I")
	public static final int[] anIntArray532 = new int[5];

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Z")
	public static boolean aBoolean646 = false;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
	public static int method7361() {
		if (Static598.anInt9468 == 0) {
			Static462.aClass287_2.method7022(new Class13("jaclib"));
			if (Static462.aClass287_2.method7024().method8618() != 100) {
				return 1;
			}
			if (!((Class13) Static462.aClass287_2.method7024()).method179()) {
				Static635.aClient1.method1049();
			}
			Static598.anInt9468 = 1;
		}
		@Pc(265) int local265;
		@Pc(291) int local291;
		@Pc(307) int local307;
		@Pc(313) int local313;
		if (Static598.anInt9468 == 1) {
			Static136.aClass287Array1 = Static462.method7020();
			Static462.aClass287_1.method7022(new Class202(Static136.aClass223_28));
			Static462.aClass287_3.method7022(new Class13("jaggl"));
			Static462.aClass287_4.method7022(new Class13("jagdx"));
			Static462.aClass287_5.method7022(new Class13("jagmisc"));
			Static462.aClass287_6.method7022(new Class13("sw3d"));
			Static462.aClass287_7.method7022(new Class13("hw3d"));
			Static462.aClass287_8.method7022(new Class13("jagtheora"));
			Static462.aClass287_9.method7022(new Class202(Static377.aClass223_80));
			Static462.aClass287_10.method7022(new Class202(Static167.aClass223_30));
			Static462.aClass287_11.method7022(new Class202(Static460.aClass223_93));
			Static462.aClass287_12.method7022(new Class202(Static531.aClass223_103));
			Static462.aClass287_13.method7022(new Class202(Static57.aClass223_11));
			Static462.aClass287_14.method7022(new Class202(Static74.aClass223_16));
			Static462.aClass287_15.method7022(new Class202(Static479.aClass223_94));
			Static462.aClass287_16.method7022(new Class202(Static84.aClass223_19));
			Static462.aClass287_17.method7022(new Class202(Static317.aClass223_71));
			Static462.aClass287_18.method7022(new Class202(Static672.aClass223_120));
			Static462.aClass287_19.method7022(new Class202(Static275.aClass223_64));
			Static462.aClass287_20.method7022(new Class202(Static373.aClass223_78));
			Static462.aClass287_21.method7022(new Class202(Static681.aClass223_125));
			Static462.aClass287_22.method7022(new Class202(Static253.aClass223_56));
			Static462.aClass287_23.method7022(new Class327(Static120.aClass223_26, "huffman"));
			Static462.aClass287_24.method7022(new Class202(Static675.aClass223_72));
			Static462.aClass287_25.method7022(new Class202(Static314.aClass223_70));
			Static462.aClass287_26.method7022(new Class202(Static373.aClass223_79));
			Static462.aClass287_27.method7022(new Class373(Static482.aClass223_95, "details"));
			for (local265 = 0; local265 < Static136.aClass287Array1.length; local265++) {
				if (Static136.aClass287Array1[local265].method7024() == null) {
					throw new RuntimeException();
				}
			}
			local291 = 0;
			@Pc(293) Class287[] local293 = Static136.aClass287Array1;
			for (@Pc(295) int local295 = 0; local295 < local293.length; local295++) {
				@Pc(303) Class287 local303 = local293[local295];
				local307 = local303.method7021();
				local313 = local303.method7024().method8618();
				local291 += local313 * local307 / 100;
			}
			Static315.anInt5460 = local291;
			Static598.anInt9468 = 2;
		}
		if (Static136.aClass287Array1 == null) {
			return 100;
		}
		local265 = 0;
		local291 = 0;
		@Pc(343) boolean local343 = true;
		@Pc(352) Class287[] local352 = Static136.aClass287Array1;
		for (@Pc(354) int local354 = 0; local354 < local352.length; local354++) {
			@Pc(360) Class287 local360 = local352[local354];
			local313 = local360.method7021();
			@Pc(370) int local370 = local360.method7024().method8618();
			local291 += local313 * local370 / 100;
			local265 += local313;
			if (local370 < 100) {
				local343 = false;
			}
		}
		if (local343) {
			if (!((Class13) Static462.aClass287_5.method7024()).method179()) {
				Static635.aClient1.method1041();
			}
			if (!((Class13) Static462.aClass287_8.method7024()).method179()) {
				Static272.aBoolean77 = Static635.aClient1.method1043();
			}
			Static136.aClass287Array1 = null;
		}
		local291 -= Static315.anInt5460;
		local265 -= Static315.anInt5460;
		local307 = local265 > 0 ? local291 * 100 / local265 : 100;
		if (!local343 && local307 > 99) {
			local307 = 99;
		}
		return local307;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!jc;B)Lclient!rea;")
	public static Class134_Sub3 method7362(@OriginalArg(0) Class6_Sub15 arg0) {
		return new Class134_Sub3(arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2987(), arg0.method2987(), arg0.method3030());
	}
}
