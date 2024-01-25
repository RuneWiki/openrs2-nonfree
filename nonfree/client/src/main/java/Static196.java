import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[[Lclient!wca;")
	public static Class310[][] aClass310ArrayArray1;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!eaa;")
	public static final Class65 aClass65_3 = new Class65(128);

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "J")
	public static long aLong100 = -1L;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_86 = new Class239(86, 5);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)I")
	public static int method3170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
	public static void method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static47.method857(arg4);
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg4 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg4;
		@Pc(28) int local28 = -arg4;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(60) int local60;
		@Pc(70) int local70;
		@Pc(81) int local81;
		@Pc(89) int local89;
		if (arg1 >= Static328.anInt6154 && Static394.anInt7462 >= arg1) {
			@Pc(51) int[] local51 = Static130.anIntArrayArray89[arg1];
			local60 = Static84.method1650(Static7.anInt8119, arg2 - arg4, Static34.anInt603);
			local70 = Static84.method1650(Static7.anInt8119, arg4 + arg2, Static34.anInt603);
			local81 = Static84.method1650(Static7.anInt8119, arg2 - local19, Static34.anInt603);
			local89 = Static84.method1650(Static7.anInt8119, local19 + arg2, Static34.anInt603);
			Static403.method6377(arg0, local51, local81, local60);
			Static403.method6377(arg3, local51, local89, local81);
			Static403.method6377(arg0, local51, local70, local89);
		}
		while (local25 > local15) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				local33 -= local30 << 1;
				Static155.anIntArray340[local30] = local15;
			}
			local15++;
			@Pc(201) int local201;
			@Pc(212) int local212;
			@Pc(219) int[] local219;
			@Pc(155) int local155;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local155 = arg1 - local25;
				local60 = arg1 + local25;
				if (Static328.anInt6154 <= local60 && Static394.anInt7462 >= local155) {
					if (local25 < local19) {
						local70 = Static155.anIntArray340[local25];
						local81 = Static84.method1650(Static7.anInt8119, local15 + arg2, Static34.anInt603);
						local89 = Static84.method1650(Static7.anInt8119, arg2 - local15, Static34.anInt603);
						local201 = Static84.method1650(Static7.anInt8119, local70 + arg2, Static34.anInt603);
						local212 = Static84.method1650(Static7.anInt8119, arg2 - local70, Static34.anInt603);
						if (local60 <= Static394.anInt7462) {
							local219 = Static130.anIntArrayArray89[local60];
							Static403.method6377(arg0, local219, local212, local89);
							Static403.method6377(arg3, local219, local201, local212);
							Static403.method6377(arg0, local219, local81, local201);
						}
						if (local155 >= Static328.anInt6154) {
							local219 = Static130.anIntArrayArray89[local155];
							Static403.method6377(arg0, local219, local212, local89);
							Static403.method6377(arg3, local219, local201, local212);
							Static403.method6377(arg0, local219, local81, local201);
						}
					} else {
						local70 = Static84.method1650(Static7.anInt8119, local15 + arg2, Static34.anInt603);
						local81 = Static84.method1650(Static7.anInt8119, arg2 - local15, Static34.anInt603);
						if (Static394.anInt7462 >= local60) {
							Static403.method6377(arg0, Static130.anIntArrayArray89[local60], local70, local81);
						}
						if (local155 >= Static328.anInt6154) {
							Static403.method6377(arg0, Static130.anIntArrayArray89[local155], local70, local81);
						}
					}
				}
			}
			local155 = arg1 - local15;
			local60 = local15 + arg1;
			if (local60 >= Static328.anInt6154 && Static394.anInt7462 >= local155) {
				local70 = arg2 + local25;
				local81 = arg2 - local25;
				if (Static7.anInt8119 <= local70 && Static34.anInt603 >= local81) {
					local70 = Static84.method1650(Static7.anInt8119, local70, Static34.anInt603);
					local81 = Static84.method1650(Static7.anInt8119, local81, Static34.anInt603);
					if (local15 < local19) {
						local89 = local15 <= local30 ? local30 : Static155.anIntArray340[local15];
						local201 = Static84.method1650(Static7.anInt8119, arg2 + local89, Static34.anInt603);
						local212 = Static84.method1650(Static7.anInt8119, arg2 - local89, Static34.anInt603);
						if (Static394.anInt7462 >= local60) {
							local219 = Static130.anIntArrayArray89[local60];
							Static403.method6377(arg0, local219, local212, local81);
							Static403.method6377(arg3, local219, local201, local212);
							Static403.method6377(arg0, local219, local70, local201);
						}
						if (Static328.anInt6154 <= local155) {
							local219 = Static130.anIntArrayArray89[local155];
							Static403.method6377(arg0, local219, local212, local81);
							Static403.method6377(arg3, local219, local201, local212);
							Static403.method6377(arg0, local219, local70, local201);
						}
					} else {
						if (local60 <= Static394.anInt7462) {
							Static403.method6377(arg0, Static130.anIntArrayArray89[local60], local70, local81);
						}
						if (local155 >= Static328.anInt6154) {
							Static403.method6377(arg0, Static130.anIntArrayArray89[local155], local70, local81);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3174(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static60.anInt1162; local19++) {
			if (arg0.equalsIgnoreCase(Static290.aStringArray30[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static454.aStringArray38[local19])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method3177() {
		Static132.method2415((long) Static115.anInt2326, Static103.aClass39_3);
		if (Static387.anInt7341 != -1) {
			Static439.method6716(Static387.anInt7341);
		}
		for (@Pc(21) int local21 = 0; local21 < Static528.anInt9120; local21++) {
			if (Static368.aBooleanArray32[local21]) {
				Static36.aBooleanArray6[local21] = true;
			}
			Static503.aBooleanArray37[local21] = Static368.aBooleanArray32[local21];
			Static368.aBooleanArray32[local21] = false;
		}
		Static99.anInt1978 = Static115.anInt2326;
		if (Static103.aClass39_3.method6036()) {
			Static338.aBoolean472 = true;
		}
		if (Static387.anInt7341 != -1) {
			Static528.anInt9120 = 0;
			Static480.method7150();
		}
		Static103.aClass39_3.n();
		Static319.method5091(Static103.aClass39_3);
		@Pc(67) int local67 = Static297.method4698();
		if (local67 == -1) {
			local67 = Static94.anInt1853;
		}
		if (local67 == -1) {
			local67 = Static161.anInt2925;
		}
		Static532.method7661(local67);
		Static436.anInt7972 = 0;
	}
}
