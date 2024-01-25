import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nda", name = "A", descriptor = "[Lclient!fg;")
	public static Class98[] aClass98Array1;

	@OriginalMember(owner = "client!nda", name = "D", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "Lclient!sg;")
	public static final Class6_Sub42 aClass6_Sub42_1 = new Class6_Sub42(0, 0);

	@OriginalMember(owner = "client!nda", name = "B", descriptor = "Z")
	public static boolean aBoolean450 = true;

	@OriginalMember(owner = "client!nda", name = "C", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_121 = new Class268(107, 16);

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "Lclient!jg;")
	public static final Class160 aClass160_6 = new Class160();

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZILclient!ha;IIII)V")
	public static void method5824(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((Static335.aClass32_15 == null || Static599.aClass32_39 == null || Static617.aClass32_40 == null) && Static540.aClass353_110.method8401(Static95.anInt1866) && Static540.aClass353_110.method8401(Static84.anInt1737) && Static540.aClass353_110.method8401(Static506.anInt8730)) {
			@Pc(27) Class98 local27 = Static651.method2404(Static540.aClass353_110, Static84.anInt1737, 0);
			Static599.aClass32_39 = arg1.method8773(local27, true);
			local27.method2399();
			Static632.aClass32_41 = arg1.method8773(local27, true);
			Static335.aClass32_15 = arg1.method8773(Static651.method2404(Static540.aClass353_110, Static95.anInt1866, 0), true);
			@Pc(52) Class98 local52 = Static651.method2404(Static540.aClass353_110, Static506.anInt8730, 0);
			Static617.aClass32_40 = arg1.method8773(local52, true);
			local52.method2399();
			Static491.aClass32_37 = arg1.method8773(local52, true);
		}
		if (Static335.aClass32_15 == null || Static599.aClass32_39 == null || Static617.aClass32_40 == null) {
			return;
		}
		@Pc(89) int local89 = (arg0 - Static617.aClass32_40.method5072() * 2) / Static335.aClass32_15.method5072();
		for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
			Static335.aClass32_15.method5071(arg2 + Static617.aClass32_40.method5072() + local91 * Static335.aClass32_15.method5072(), arg4 + arg3 + -Static335.aClass32_15.method5077());
		}
		@Pc(132) int local132 = (arg4 - Static617.aClass32_40.method5077() - 20) / Static599.aClass32_39.method5077();
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			Static599.aClass32_39.method5071(arg2, arg3 + local134 * Static599.aClass32_39.method5077() + 20);
			Static632.aClass32_41.method5071(arg0 + arg2 - Static632.aClass32_41.method5072(), Static599.aClass32_39.method5077() * local134 + 20 + arg3);
		}
		Static617.aClass32_40.method5071(arg2, arg3 + arg4 - Static617.aClass32_40.method5077());
		Static491.aClass32_37.method5071(arg2 + arg0 - Static617.aClass32_40.method5072(), -Static617.aClass32_40.method5077() + arg4 + arg3);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)Lclient!cda;")
	public static Class47 method5825(@OriginalArg(0) int arg0) {
		@Pc(8) Class47[] local8 = Static587.method8272();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(25) Class47 local25 = local8[local10];
			if (arg0 == local25.anInt1394) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZI)V")
	public static void method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 < arg0) {
			for (local6 = arg1; local6 < arg0; local6++) {
				Static484.anIntArrayArray41[local6][arg3] = arg2;
			}
		} else {
			for (local6 = arg0; local6 < arg1; local6++) {
				Static484.anIntArrayArray41[local6][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)Z")
	public static boolean method5827() {
		return Static139.aBoolean186;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!k;B)Ljava/lang/String;")
	public static String method5828(@OriginalArg(0) Class6_Sub2_Sub12 arg0) {
		return arg0.aString58 + " <col=ffffff>>";
	}
}
