import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array18;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "[S")
	public static short[] aShortArray144 = new short[256];

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_122 = new Class130(38, 3);

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_12 = new Class311("", 18);

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([II[IBI)V")
	public static void method7940(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(24) int local24 = (arg3 + arg1) / 2;
		@Pc(26) int local26 = arg3;
		@Pc(30) int local30 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(44) int local44 = arg2[local24];
		arg2[local24] = arg2[arg1];
		arg2[arg1] = local44;
		@Pc(61) int local61 = local30 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg1; local63++) {
			if (arg0[local63] < local30 + (local61 & local63)) {
				@Pc(82) int local82 = arg0[local63];
				arg0[local63] = arg0[local26];
				arg0[local26] = local82;
				@Pc(96) int local96 = arg2[local63];
				arg2[local63] = arg2[local26];
				arg2[local26++] = local96;
			}
		}
		arg0[arg1] = arg0[local26];
		arg0[local26] = local30;
		arg2[arg1] = arg2[local26];
		arg2[local26] = local44;
		method7940(arg0, local26 - 1, arg2, arg3);
		method7940(arg0, arg1, arg2, local26 + 1);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public static void method7941() {
		if (Static323.aClass5_9 == null) {
			return;
		}
		if (Static219.aBoolean285) {
			Static41.method1346();
		}
		Static374.aClass301_3.method7458();
		Static53.method8687();
		Static628.method4779();
		Static90.method2064();
		Static580.method8228();
		Static36.method1269();
		if (Static175.aClass327_1 != null) {
			Static175.aClass327_1.method8023();
		}
		Static39.method1336();
		Static518.method7722();
		Static586.method8270();
		Static398.method6438();
		Static582.method8233(false);
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class4_Sub1_Sub2_Sub1_Sub2 local43 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local37];
			if (local43 != null) {
				for (@Pc(47) int local47 = 0; local47 < local43.aClass17Array3.length; local47++) {
					local43.aClass17Array3[local47] = null;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static294.anInt5193; local68++) {
			@Pc(75) Class4_Sub1_Sub2_Sub1_Sub1 local75 = Static28.aClass3_Sub28Array1[local68].aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass17Array3.length; local79++) {
					local75.aClass17Array3[local79] = null;
				}
			}
		}
		Static250.aClass39_4 = null;
		Static1.aClass39_12 = null;
		Static323.aClass5_9.method7548();
		Static323.aClass5_9 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!wfa;Lclient!wfa;I)V")
	public static void method7944(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0.aClass3_Sub4_67 != null) {
			arg0.method8732();
		}
		arg0.aClass3_Sub4_67 = arg1;
		arg0.aClass3_Sub4_66 = arg1.aClass3_Sub4_66;
		arg0.aClass3_Sub4_67.aClass3_Sub4_66 = arg0;
		arg0.aClass3_Sub4_66.aClass3_Sub4_67 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method7945(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg2 >> 2);
		@Pc(20) int local20 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg0++;
				arg7[local31] += arg1[arg4++];
				@Pc(43) int local43 = arg0++;
				arg7[local43] += arg1[arg4++];
				@Pc(55) int local55 = arg0++;
				arg7[local55] += arg1[arg4++];
				@Pc(67) int local67 = arg0++;
				arg7[local67] += arg1[arg4++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg0++;
				arg7[local31] += arg1[arg4++];
			}
			arg4 += arg3;
			arg0 += arg6;
		}
	}
}
