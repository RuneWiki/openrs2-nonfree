import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lclient!ur;")
	public static Class127_Sub1[] aClass127_Sub1Array2;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public static int anInt3459;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt3461 = 0;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
	public static boolean aBoolean267 = true;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!ii;ILclient!wl;Lclient!ls;Lclient!ii;ZZIII)Lclient!cq;")
	public static Class8 method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class29 arg4, @OriginalArg(5) Class136 arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class8 local15 = Static269.method4846(arg9, arg10, arg2, arg0, arg5, arg3, arg1);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class102 local23 = Static348.method5333(arg9);
		@Pc(33) int local33;
		if (arg10 > 1 && local23.anIntArray252 != null) {
			@Pc(31) int local31 = -1;
			for (local33 = 0; local33 < 10; local33++) {
				if (local23.anIntArray250[local33] <= arg10 && local23.anIntArray250[local33] != 0) {
					local31 = local23.anIntArray252[local33];
				}
			}
			if (local31 != -1) {
				local23 = Static348.method5333(local31);
			}
		}
		@Pc(76) Class219 local76 = Static154.method2690(local23.anInt2438, Static173.aClass134_85);
		if (local76 == null) {
			return null;
		}
		if (local23.aShortArray37 != null) {
			for (local33 = 0; local33 < local23.aShortArray37.length; local33++) {
				if (local23.aByteArray21 == null || local23.aByteArray21.length <= local33) {
					local76.method5851(local23.aShortArray36[local33], local23.aShortArray37[local33]);
				} else {
					local76.method5851(Static203.aShortArray59[local23.aByteArray21[local33] & 0xFF], local23.aShortArray37[local33]);
				}
			}
		}
		if (local23.aShortArray38 != null) {
			for (local33 = 0; local33 < local23.aShortArray38.length; local33++) {
				local76.method5847(local23.aShortArray38[local33], local23.aShortArray35[local33]);
			}
		}
		if (arg5 != null) {
			for (local33 = 0; local33 < 5; local33++) {
				if (arg5.anIntArray351[local33] < Static259.aShortArrayArray11[local33].length) {
					local76.method5851(Static259.aShortArrayArray11[local33][arg5.anIntArray351[local33]], Static325.aShortArray47[local33]);
				}
				if (arg5.anIntArray351[local33] < Static262.aShortArrayArray5[local33].length) {
					local76.method5851(Static262.aShortArrayArray5[local33][arg5.anIntArray351[local33]], Static238.aShortArray66[local33]);
				}
			}
		}
		@Pc(227) short local227 = 1024;
		@Pc(229) boolean local229 = false;
		if (local23.anInt2412 != 128 || local23.anInt2439 != 128 || local23.anInt2428 != 128) {
			local227 = 1031;
			local229 = true;
		}
		@Pc(269) Class40 local269 = arg6.method4301(local76, local227, 0, local23.anInt2407 + 64, 768 - -local23.anInt2378);
		if (!local269.method4603()) {
			return null;
		}
		if (local229) {
			local269.method4611(local23.anInt2412, local23.anInt2439, local23.anInt2428);
		}
		@Pc(286) Class8 local286 = null;
		if (local23.anInt2395 != -1) {
			local286 = method2927(0, 0, arg2, 1, arg4, arg5, arg6, true, true, local23.anInt2409, 10);
			if (local286 == null) {
				return null;
			}
		} else if (local23.anInt2432 != -1) {
			local286 = method2927(arg0, 0, arg2, arg3, arg4, arg5, arg6, true, false, local23.anInt2411, arg10);
			if (local286 == null) {
				return null;
			}
		}
		@Pc(336) int local336 = local23.anInt2416;
		arg6.method4282(16, 16, 512, 512);
		if (arg8) {
			local336 = (int) ((double) local336 * 1.5D);
		} else if (arg3 == 2) {
			local336 = (int) ((double) local336 * 1.04D);
		}
		@Pc(364) Class31 local364 = arg6.method4267();
		local364.method3182();
		arg6.method4213(local364);
		arg6.method4286(1.0F);
		arg6.method4243(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(383) Class31 local383 = arg6.method4304();
		local383.method3186(-local23.anInt2385 << 3);
		local383.method3173(local23.anInt2380 << 3);
		local383.method3184(local23.anInt2397, (Class1_Sub5_Sub15.anIntArray335[local23.anInt2405 << 3] * local336 >> 15) + local23.anInt2441 - (local269.method4572() / 2), local23.anInt2441 + (Class1_Sub5_Sub15.anIntArray333[local23.anInt2405 << 3] * local336 >> 15));
		local383.method3178(local23.anInt2405 << 3);
		@Pc(442) int local442 = arg6.method4239();
		@Pc(445) int local445 = arg6.method4297();
		arg6.method4277(50, Integer.MAX_VALUE);
		arg6.method4246();
		arg6.method4233();
		arg6.method4249(0, 0, 36, 32, 0, 0);
		local269.method4587(local383, null, 1);
		arg6.method4277(local442, local445);
		@Pc(477) int[] local477 = arg6.method4271();
		if (arg3 >= 1) {
			local477 = Static315.method5399(-16777215, local477);
			if (arg3 >= 2) {
				local477 = Static315.method5399(-1, local477);
			}
		}
		if (arg0 != 0) {
			Static325.method2373(arg0, local477);
		}
		arg6.method4257(local477, 36, 36, 32).method4393(0, 0);
		if (local23.anInt2395 != -1) {
			local286.method4393(0, 0);
		} else if (local23.anInt2432 != -1) {
			local286.method4393(0, 0);
		}
		if (arg1 == 1 || arg1 == 2 && (local23.anInt2399 == 1 || arg10 != 1) && arg10 != -1) {
			arg4.method3742(9, -16777215, -256, Static124.method1982(arg10), 0);
		}
		local477 = arg6.method4271();
		for (@Pc(570) int local570 = 0; local570 < local477.length; local570++) {
			if ((local477[local570] & 0xFFFFFF) == 0) {
				local477[local570] = 0;
			} else {
				local477[local570] |= 0xFF000000;
			}
		}
		@Pc(610) Class8 local610;
		if (arg7) {
			local610 = arg6.method4257(local477, 36, 36, 32);
		} else {
			local610 = arg2.method4257(local477, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(626) Class19 local626 = new Class19();
			local626.aBoolean30 = arg5 != null;
			local626.anInt392 = arg10;
			local626.anInt394 = arg2.anInt4861;
			local626.anInt391 = arg9;
			local626.anInt397 = arg1;
			local626.anInt395 = arg0;
			local626.anInt387 = arg3;
			Static61.aClass75_1.method1462(local610, local626);
		}
		return local610;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2928(@OriginalArg(0) String arg0) {
		if (Static188.aClass189Array1 != null) {
			Static305.aClass1_Sub21_Sub2_3.method5757(176);
			Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg0));
			Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
		}
	}
}
