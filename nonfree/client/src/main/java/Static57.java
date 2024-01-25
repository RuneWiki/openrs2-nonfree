import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "[Lclient!jf;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	public static int anInt1544;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	public static int anInt1548;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_77 = new Class123(18, 12);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILclient!bn;II)V")
	public static void method1269(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class3_Sub2_Sub1 arg2, @OriginalArg(6) int arg3) {
		Static253.method4330(arg1, arg2.aByte103, arg2.anInt7207, arg2.anInt7202, 0, arg0, arg3);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!eq;IIIILclient!hn;)V")
	public static void method1272(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106 arg4) {
		@Pc(9) Class81 local9 = Static314.aClass108_4.method2647(arg4.anInt3183);
		if (local9.anInt2453 == -1) {
			return;
		}
		if (arg4.aBoolean206) {
			@Pc(26) int local26 = arg3 + arg4.anInt3168;
			arg3 = local26 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(40) Class87 local40 = local9.method2024(arg0, arg3, arg4.aBoolean204);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg4.anInt3158;
		@Pc(49) int local49 = arg4.anInt3194;
		if ((arg3 & 0x1) == 1) {
			local46 = arg4.anInt3194;
			local49 = arg4.anInt3158;
		}
		@Pc(63) int local63 = local40.method6565();
		@Pc(66) int local66 = local40.method6561();
		if (local9.aBoolean165) {
			local66 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt2454 == 0) {
			local40.method6564(arg1, arg2 - (local49 - 1) * 4, local63, local66);
		} else {
			local40.method6571(arg1, arg2 + 4 - local49 * 4, local63, local66, 0, local9.anInt2454 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1273(@OriginalArg(1) String arg0) {
		return Static440.method6358(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIZZ)Lclient!he;")
	public static Class100 method1274(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class63 local10 = null;
		if (Static397.aClass136_15 != null) {
			local10 = new Class63(arg0, Static397.aClass136_15, Static247.aClass136Array1[arg0], 1000000);
		}
		Static360.aClass68_Sub1Array2[arg0] = Static297.aClass163_1.method3813(local10, Static32.aClass63_5, arg0);
		if (arg2) {
			Static360.aClass68_Sub1Array2[arg0].method5221();
		}
		return new Class100(Static360.aClass68_Sub1Array2[arg0], arg1, 1);
	}
}
