import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public static int anInt1672;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Lclient!ds;")
	public static Class11_Sub4 method1619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIILclient!fp;Lclient!gn;)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class63 arg3, @OriginalArg(5) Class71 arg4) {
		@Pc(8) Class85 local8 = Static251.method4730(arg4.anInt2368);
		if (local8.anInt2751 == -1) {
			return;
		}
		if (arg4.aBoolean161) {
			@Pc(31) int local31 = arg0 + arg4.anInt2374;
			arg0 = local31 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(43) Class4 local43 = local8.method2629(arg0, arg4.aBoolean166, arg3);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg4.anInt2411;
		@Pc(52) int local52 = arg4.anInt2376;
		if ((arg0 & 0x1) == 1) {
			local49 = arg4.anInt2376;
			local52 = arg4.anInt2411;
		}
		@Pc(68) int local68 = local43.method5961();
		@Pc(71) int local71 = local43.method5963();
		if (local8.aBoolean202) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local8.anInt2756 == 0) {
			local43.method5964(arg1, arg2 - (local52 - 1) * 4, local68, local71);
		} else {
			local43.method5955(arg1, arg2 + 4 - local52 * 4, local68, local71, 1, local8.anInt2756 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method1621() {
		@Pc(15) int local15 = Static99.anInt2276;
		@Pc(17) int[] local17 = Static238.anIntArray382;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class11_Sub2_Sub6_Sub1 local27 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local17[local19]];
			if (local27 != null) {
				Static91.method6078(local27, local27.method5894());
			}
		}
	}
}
