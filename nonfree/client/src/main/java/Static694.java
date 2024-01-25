import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_93 = new Class307(64);

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "[I")
	public static int[] anIntArray777 = new int[2];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!rw;I)V")
	public static void method9183(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg1) {
		if (Static716.anInt11158 >= 400) {
			return;
		}
		@Pc(13) Class219 local13 = arg1.aClass219_1;
		@Pc(16) String local16 = arg1.aString115;
		if (local13.anIntArray405 != null) {
			local13 = local13.method5035(Static380.aClass127_1);
			if (local13 == null) {
				return;
			}
			local16 = local13.aString69;
		}
		if (!local13.aBoolean370) {
			return;
		}
		if (arg1.anInt8835 != 0) {
			@Pc(55) String local55 = Static422.aClass309_8 == Static346.aClass309_6 ? Static430.aClass257_29.method5699(Static456.anInt7118) : Static430.aClass257_27.method5699(Static456.anInt7118);
			local16 = local16 + method9187(arg1.anInt8835, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552) + " (" + local55 + arg1.anInt8835 + ")";
		}
		if (Static474.aBoolean505 && !arg0) {
			@Pc(102) Class303 local102 = Static496.anInt7898 == -1 ? null : Static583.aClass150_2.method3385(Static496.anInt7898);
			if ((Static723.anInt11214 & 0x2) != 0 && (local102 == null || local13.method5030(local102.anInt8150, Static496.anInt7898) != local102.anInt8150)) {
				Static283.method4000(0, Static261.aString59, true, (long) arg1.anInt8783, -1, Static302.anInt4875, false, 0, Static96.aString130 + " -> <col=ffff00>" + local16, 21, (long) arg1.anInt8783, false);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(165) String[] local165 = local13.aStringArray24;
		if (Static670.aBoolean706) {
			local165 = Static17.method558(local165);
		}
		if (local165 == null) {
			return;
		}
		for (@Pc(178) int local178 = local165.length - 1; local178 >= 0; local178--) {
			if (local165[local178] != null && (local13.aByte86 == 0 || !local165[local178].equalsIgnoreCase(Static430.aClass257_23.method5699(Static456.anInt7118)) && !local165[local178].equalsIgnoreCase(Static430.aClass257_22.method5699(Static456.anInt7118)))) {
				@Pc(215) short local215 = 0;
				@Pc(217) int local217 = Static337.anInt5410;
				if (local178 == 0) {
					local215 = 2;
				}
				if (local178 == 1) {
					local215 = 51;
				}
				if (local178 == 2) {
					local215 = 10;
				}
				if (local178 == 3) {
					local215 = 6;
				}
				if (local178 == 4) {
					local215 = 12;
				}
				if (local178 == 5) {
					local215 = 1006;
				}
				if (local178 == local13.anInt5680) {
					local217 = local13.anInt5698;
				}
				if (local178 == local13.anInt5716) {
					local217 = local13.anInt5699;
				}
				Static283.method4000(0, local165[local178], true, (long) arg1.anInt8783, -1, local165[local178].equalsIgnoreCase(Static430.aClass257_23.method5699(Static456.anInt7118)) ? local13.anInt5687 : local217, false, 0, "<col=ffff00>" + local16, local215, (long) arg1.anInt8783, false);
			}
		}
		if (local13.aByte86 != 1) {
			return;
		}
		for (@Pc(332) int local332 = 0; local332 < local165.length; local332++) {
			if (local165[local332] != null && (local165[local332].equalsIgnoreCase(Static430.aClass257_23.method5699(Static456.anInt7118)) || local165[local332].equalsIgnoreCase(Static430.aClass257_22.method5699(Static456.anInt7118)))) {
				@Pc(364) short local364 = 0;
				if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552 < arg1.anInt8835) {
					local364 = 2000;
				}
				@Pc(373) short local373 = 0;
				@Pc(375) int local375 = Static337.anInt5410;
				if (local332 == 0) {
					local373 = 2;
				}
				if (local332 == 1) {
					local373 = 51;
				}
				if (local332 == 2) {
					local373 = 10;
				}
				if (local332 == 3) {
					local373 = 6;
				}
				if (local332 == 4) {
					local373 = 12;
				}
				if (local332 == 5) {
					local373 = 1006;
				}
				if (local332 == local13.anInt5680) {
					local375 = local13.anInt5698;
				}
				if (local373 != 0) {
					local373 += local364;
				}
				if (local332 == local13.anInt5716) {
					local375 = local13.anInt5699;
				}
				Static283.method4000(0, local165[local332], true, (long) arg1.anInt8783, -1, local165[local332].equalsIgnoreCase(Static430.aClass257_23.method5699(Static456.anInt7118)) ? local13.anInt5687 : local375, false, 0, "<col=ffff00>" + local16, local373, (long) arg1.anInt8783, false);
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)V")
	public static void method9185(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub50 local15 = (Class3_Sub50) Static55.aClass313_7.method7104((long) arg0);
		if (local15 != null) {
			local15.aBoolean555 = !local15.aBoolean555;
			local15.aClass253_Sub1_1.method7299(local15.aBoolean555);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!lu;ZIZILclient!lu;I)I")
	public static int method9186(@OriginalArg(0) Class238_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class238_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static17.method560(arg0, arg3, arg1, arg4);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static17.method560(arg0, arg5, arg2, arg4);
			return arg2 ? -local41 : local41;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method9187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
