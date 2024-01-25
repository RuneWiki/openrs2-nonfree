import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Z")
	public static boolean aBoolean853 = false;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	public static int anInt10429 = 0;

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
	public static int anInt10431 = -1;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)V")
	public static void method8413() {
		if (Static537.aClass24_3 != null) {
			Static537.aClass24_3.method1139();
		}
		if (Static481.aClass24_1 != null) {
			Static481.aClass24_1.method1139();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(FFIFFIIIFLclient!jr;I)[B")
	public static byte[] method8415(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class175 arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static301.method5006(arg3, arg1, 0, arg5, arg2, local15, arg0, arg4);
		return local15;
	}

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "(I)V")
	public static void method8416() {
		Static474.aClass25_35.method948();
		Static321.aClass39_4.method1279();
		Static539.aClass39_10.method1279();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BII)V")
	public static void method8417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static9.aClass297_1.method7314(Static139.aClass101_23.method2841(Static126.anInt2904));
		@Pc(21) int local21;
		for (@Pc(16) Class3_Sub40 local16 = (Class3_Sub40) Static342.aClass183_44.method4795(); local16 != null; local16 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			local21 = Static130.method2555(local16);
			if (local21 > local11) {
				local11 = local21;
			}
		}
		local11 += 8;
		local21 = Static309.anInt6170 * 16 + 21;
		@Pc(54) int local54 = arg1 - local11 / 2;
		if (Static582.anInt10234 < local11 + local54) {
			local54 = Static582.anInt10234 - local11;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(72) int local72 = arg0;
		if (local21 + arg0 > Static294.anInt10217) {
			local72 = Static294.anInt10217 - local21;
		}
		if (local72 < 0) {
			local72 = 0;
		}
		Static386.anInt7409 = local54;
		Static489.anInt9112 = local72;
		Static256.aBoolean474 = true;
		Static344.anInt6998 = Static309.anInt6170 * 16 + (Static254.aBoolean661 ? 26 : 22);
		Static277.anInt5863 = local11;
	}

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "(I)V")
	public static void method8418() {
		Static565.method8136(Static455.aClass3_Sub27_Sub1_1.aBoolean394);
		Static393.aClass3_Sub14_Sub4_1 = new Class3_Sub14_Sub4();
		Static393.aClass3_Sub14_Sub4_1.method7861();
		Static537.aClass24_3 = Static408.method6626(Static545.aCanvas14, Static480.aClass326_3, 22050, 0);
		Static537.aClass24_3.method1126(Static393.aClass3_Sub14_Sub4_1);
		Static197.method3344(Static252.aClass254_73, Static33.aClass254_14, Static393.aClass3_Sub14_Sub4_1, Static151.aClass254_50);
		Static481.aClass24_1 = Static408.method6626(Static545.aCanvas14, Static480.aClass326_3, 2048, 1);
		Static485.aClass3_Sub14_Sub1_2 = new Class3_Sub14_Sub1();
		Static481.aClass24_1.method1126(Static485.aClass3_Sub14_Sub1_2);
		Static56.aClass222_1 = new Class222(22050, Static149.anInt2863);
		Static453.anInt8597 = Static302.aClass254_86.method6414("scape main");
	}
}
