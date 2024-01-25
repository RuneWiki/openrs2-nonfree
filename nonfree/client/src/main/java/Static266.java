import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[Lclient!mn;")
	public static final Class143[] aClass143Array3 = new Class143[128];

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_137 = new Class137(34, 7);

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_126 = new Class214(88, -2);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
	public static boolean method2725(@OriginalArg(0) int arg0) {
		if (Static332.aBooleanArray26[arg0]) {
			return true;
		} else if (Static142.aClass113_47.method2278(arg0)) {
			@Pc(23) int local23 = Static142.aClass113_47.method2271(arg0);
			if (local23 == 0) {
				Static332.aBooleanArray26[arg0] = true;
				return true;
			}
			if (Static369.aClass250ArrayArray5[arg0] == null) {
				Static369.aClass250ArrayArray5[arg0] = new Class250[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static369.aClass250ArrayArray5[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static142.aClass113_47.method2274(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class250 local71 = Static369.aClass250ArrayArray5[arg0][local45] = new Class250();
						local71.anInt6994 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method5346(new Class1_Sub11(local59));
					}
				}
			}
			Static332.aBooleanArray26[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	public static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 + 1;
		Static298.method3891(arg0, arg3, Static106.anIntArrayArray46[arg2], arg4);
		@Pc(19) int local19 = arg1 - 1;
		Static298.method3891(arg0, arg3, Static106.anIntArrayArray46[arg1], arg4);
		for (@Pc(25) int local25 = local6; local25 <= local19; local25++) {
			@Pc(38) int[] local38 = Static106.anIntArrayArray46[local25];
			local38[arg3] = local38[arg0] = arg4;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!vg;)Lclient!vg;")
	public static Class250 method2728(@OriginalArg(1) Class250 arg0) {
		if (arg0.anInt7002 != -1) {
			return Static96.method1379(arg0.anInt7002);
		}
		@Pc(25) int local25 = arg0.anInt6994 >>> 16;
		@Pc(30) Class198 local30 = new Class198(Static304.aClass257_21);
		for (@Pc(35) Class1_Sub26 local35 = (Class1_Sub26) local30.method4121(); local35 != null; local35 = (Class1_Sub26) local30.method4123()) {
			if (local35.anInt3847 == local25) {
				return Static96.method1379((int) local35.aLong226);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!et;)V")
	public static void method2729(@OriginalArg(0) Class71 arg0) {
		if (Static73.anInt1403 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub24 local6 = arg0.aClass1_Sub24_1;
		Static280.aClass71Array1[Static73.anInt1403] = arg0;
		Static330.aBooleanArray25[Static73.anInt1403] = false;
		Static73.anInt1403++;
		@Pc(21) int local21 = arg0.anInt1818;
		if (arg0.aBoolean134) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt1818;
		if (arg0.aBoolean135) {
			local29 = Static97.anInt1709 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4369() + Static188.anInt3025 - local6.method4374() >> Static384.anInt6381;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4369() + local6.method4374() - Static188.anInt3025 >> Static384.anInt6381;
			if (local73 >= Static195.anInt3127) {
				local73 = Static195.anInt3127 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray30[local41++];
				@Pc(105) int local105 = (local6.method4367() + Static188.anInt3025 - local6.method4374() >> Static384.anInt6381) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static362.anInt6113) {
					local113 = Static362.anInt6113 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static112.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static112.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static73.anInt1403;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static112.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static73.anInt1403 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static112.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static73.anInt1403 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static112.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static73.anInt1403 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	public static void method2730() {
		if (Static98.anInt1721 == 10) {
			Static430.method5422(28);
		}
		if (Static98.anInt1721 == 30) {
			Static430.method5422(25);
		}
	}
}
