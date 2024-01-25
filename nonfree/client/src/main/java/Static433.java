import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_387 = new Class305(60, -1);

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Lclient!js;")
	public static final Class156 aClass156_18 = new Class156(13, 0, 1, 0);

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public static int anInt7516 = -1;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;ZLclient!ra;I)V")
	public static void method6712(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class36 arg2) {
		@Pc(25) int local25 = Static234.aClass96_8.method2367(250, null, arg0);
		@Pc(34) int local34 = Static234.aClass96_8.method2374(arg0, null, 250) * 13;
		Static455.aClass4_11.f(6, 6, local25 + 4 + 4, local34 + 4 + 4, -16777216, 0);
		Static455.aClass4_11.method7181(6, 6, local25 + 8, local34 + 4 - -4, -1, 0);
		arg2.method7963(null, 10, null, null, arg0, local34, 0, 0, -1, local25, 10, -1, 1);
		Static193.method3693(local34 + 4 + 4, 6, local25 + 4 + 4, 6);
		if (arg1) {
			Static455.aClass4_11.method7164();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIILclient!ig;)V")
	public static void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub3 arg4) {
		@Pc(4) Class64 local4 = Static442.method6845(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1461 = (arg1 << Static275.anInt5260) + Static270.anInt5197;
		arg4.anInt1457 = arg3;
		arg4.anInt1459 = (arg2 << Static275.anInt5260) + Static270.anInt5197;
		for (@Pc(28) Class232 local28 = local4.aClass232_2; local28 != null; local28 = local28.aClass232_3) {
			if (local28.aClass20_Sub1_2.aBoolean675) {
				@Pc(38) int local38 = local28.aClass20_Sub1_2.method7798();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1457 += local8;
			arg4.aBoolean115 = true;
		} else if (local4.aClass20_Sub5_1 != null) {
			arg4.anInt1457 -= local4.aClass20_Sub5_1.aShort112;
		}
		local4.aClass20_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!fp;B)Z")
	public static boolean method6714(@OriginalArg(0) Interface7 arg0) {
		@Pc(18) Class51 local18 = Static398.aClass18_4.method609(arg0.method8046());
		if (local18.anInt1614 == -1) {
			return true;
		} else {
			@Pc(30) Class318 local30 = Static152.aClass160_1.method4292(local18.anInt1614);
			return local30.anInt9444 == -1 ? true : local30.method8140();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII[BII)V")
	public static void method6715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static329.method5606(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static329.method5606(arg0)) {
			@Pc(39) int local39 = Static74.method1729(arg5);
			@Pc(46) int local46 = 0;
			@Pc(53) int local53 = arg0 <= arg3 ? arg0 : arg3;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) byte[] local63 = arg4;
			@Pc(70) byte[] local70 = new byte[local39 * local57 * local61];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local46, arg2, arg3, arg0, 0, arg5, 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(90) int local90 = local39 * arg3;
				for (@Pc(92) int local92 = 0; local92 < local39; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local61; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local57; local108++) {
							@Pc(114) byte local114 = local63[local98];
							local98 += local39;
							@Pc(124) int local124 = local114 + local63[local98];
							@Pc(130) int local130 = local124 + local63[local102];
							local98 += local39;
							local102 += local39;
							@Pc(144) int local144 = local130 + local63[local102];
							local70[local96] = (byte) (local144 >> 2);
							local102 += local39;
							local96 += local39;
						}
						local102 += local90;
						local98 += local90;
					}
				}
				@Pc(189) byte[] local189 = local70;
				local70 = local63;
				arg3 = local57;
				arg0 = local61;
				local63 = local189;
				local57 >>= 0x1;
				local61 >>= 0x1;
				local53 >>= 0x1;
				local46++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
