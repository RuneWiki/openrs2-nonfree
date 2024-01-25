import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Lclient!gp;")
	public static Class75 aClass75_8;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_81;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method3918() {
		if (Static252.aBoolean377) {
			return;
		}
		Static255.aBoolean381 = true;
		Static252.aBoolean377 = true;
		if (Static139.aBoolean462) {
			Static5.aFloat2 = (int) Static5.aFloat2 + 47 & 0xFFFFFFF0;
		} else {
			Static230.aFloat69 += (12.0F - Static230.aFloat69) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public static void method3919() {
		if (Static180.anInt3602 < 0) {
			Static180.anInt3602 = 0;
			Static55.anInt1337 = -1;
			Static321.anInt6091 = -1;
		}
		if (Static180.anInt3602 > Static186.anInt6008) {
			Static55.anInt1337 = -1;
			Static321.anInt6091 = -1;
			Static180.anInt3602 = Static186.anInt6008;
		}
		if (Static9.anInt302 < 0) {
			Static55.anInt1337 = -1;
			Static9.anInt302 = 0;
			Static321.anInt6091 = -1;
		}
		if (Static186.anInt6011 < Static9.anInt302) {
			Static55.anInt1337 = -1;
			Static321.anInt6091 = -1;
			Static9.anInt302 = Static186.anInt6011;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!bq;)V")
	public static void method3920(@OriginalArg(1) Class5_Sub4 arg0) {
		if (!Static188.aBoolean264) {
			arg0.method5803();
			Static27.anInt5324--;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILclient!bo;I)V")
	public static void method3921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class33 local9 = arg2.method4659();
		@Pc(19) int local19 = arg2.anInt5328 - arg2.aClass131_7.anInt3850 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg2.anInt5270 > 25) {
				if (arg0 < 0 && local9.anInt970 != -1) {
					arg2.anInt5276 = local9.anInt970;
				} else if (arg0 <= 0 || local9.anInt983 == -1) {
					arg2.anInt5276 = local9.anInt947;
				} else {
					arg2.anInt5276 = local9.anInt983;
				}
				arg2.aBoolean405 = false;
			} else if (!arg2.aBoolean405 || !local9.method885(arg2.anInt5276)) {
				arg2.anInt5276 = local9.method880();
				arg2.aBoolean405 = arg2.anInt5276 != -1;
			}
		} else if (arg2.anInt5332 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(49) int local49 = Static27.anIntArray399[arg3] - arg2.aClass131_7.anInt3850 & 0x3FFF;
			if (arg1 == 2 && local9.anInt950 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local9.anInt982 != -1) {
					arg2.anInt5276 = local9.anInt982;
				} else if (local49 >= 10240 && local49 < 14336 && local9.anInt971 != -1) {
					arg2.anInt5276 = local9.anInt971;
				} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt965 == -1) {
					arg2.anInt5276 = local9.anInt950;
				} else {
					arg2.anInt5276 = local9.anInt965;
				}
			} else if (arg1 == 0 && local9.anInt973 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local9.anInt954 != -1) {
					arg2.anInt5276 = local9.anInt954;
				} else if (local49 >= 10240 && local49 < 14336 && local9.anInt952 != -1) {
					arg2.anInt5276 = local9.anInt952;
				} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt961 == -1) {
					arg2.anInt5276 = local9.anInt973;
				} else {
					arg2.anInt5276 = local9.anInt961;
				}
			} else if (local49 > 2048 && local49 <= 6144 && local9.anInt949 != -1) {
				arg2.anInt5276 = local9.anInt949;
			} else if (local49 >= 10240 && local49 < 14336 && local9.anInt960 != -1) {
				arg2.anInt5276 = local9.anInt960;
			} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt955 == -1) {
				arg2.anInt5276 = local9.anInt947;
			} else {
				arg2.anInt5276 = local9.anInt955;
			}
			arg2.aBoolean405 = false;
		} else if (local19 == 0 && arg2.anInt5270 <= 25) {
			if (arg1 == 2 && local9.anInt950 != -1) {
				arg2.anInt5276 = local9.anInt950;
			} else if (arg1 == 0 && local9.anInt973 != -1) {
				arg2.anInt5276 = local9.anInt973;
			} else {
				arg2.anInt5276 = local9.anInt947;
			}
			arg2.aBoolean405 = false;
		} else {
			if (arg1 == 2 && local9.anInt950 != -1) {
				if (arg0 < 0 && local9.anInt962 != -1) {
					arg2.anInt5276 = local9.anInt962;
				} else if (arg0 <= 0 || local9.anInt956 == -1) {
					arg2.anInt5276 = local9.anInt950;
				} else {
					arg2.anInt5276 = local9.anInt956;
				}
			} else if (arg1 == 0 && local9.anInt973 != -1) {
				if (arg0 < 0 && local9.anInt967 != -1) {
					arg2.anInt5276 = local9.anInt967;
				} else if (arg0 <= 0 || local9.anInt975 == -1) {
					arg2.anInt5276 = local9.anInt973;
				} else {
					arg2.anInt5276 = local9.anInt975;
				}
			} else if (arg0 < 0 && local9.anInt945 != -1) {
				arg2.anInt5276 = local9.anInt945;
			} else if (arg0 <= 0 || local9.anInt953 == -1) {
				arg2.anInt5276 = local9.anInt947;
			} else {
				arg2.anInt5276 = local9.anInt953;
			}
			arg2.aBoolean405 = false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!nl;")
	public static Class137 method3923(@OriginalArg(1) int arg0) {
		@Pc(5) Class66 local5 = Static289.aClass66_97;
		@Pc(14) Class137 local14;
		synchronized (Static289.aClass66_97) {
			local14 = (Class137) Static289.aClass66_97.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static169.aClass170_63.method4584(Static352.method5793(arg0), Static238.method4048(arg0));
		local14 = new Class137();
		local14.anInt4114 = arg0;
		if (local34 != null) {
			local14.method3717(new Class5_Sub1(local34));
		}
		local14.method3715();
		if (local14.aBoolean291) {
			local14.aBoolean290 = false;
			local14.anInt4128 = 0;
		}
		if (!Static22.aBoolean44 && local14.aBoolean304) {
			local14.aStringArray29 = null;
			local14.anIntArray298 = null;
		}
		@Pc(75) Class66 local75 = Static289.aClass66_97;
		synchronized (Static289.aClass66_97) {
			Static289.aClass66_97.method1936((long) arg0, local14);
			return local14;
		}
	}
}
