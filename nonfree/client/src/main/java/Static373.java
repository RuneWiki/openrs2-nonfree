import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vn", name = "ab", descriptor = "Lclient!b;")
	public static Class20 aClass20_97;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public static int anInt6219 = 0;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	public static int anInt6224 = 0;

	@OriginalMember(owner = "client!vn", name = "Z", descriptor = "Z")
	public static final boolean aBoolean488 = false;

	@OriginalMember(owner = "client!vn", name = "cb", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_92 = new Class244(12, 8);

	@OriginalMember(owner = "client!vn", name = "db", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_97 = new Class57("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!re;)V")
	public static void method5558(@OriginalArg(1) Class3_Sub36 arg0) {
		if (Static69.aClass48ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface3 local8 = null;
		if (arg0.anInt5108 == 0) {
			local8 = (Interface3) Static343.method5200(arg0.anInt5112, arg0.anInt5104, arg0.anInt5110);
		}
		if (arg0.anInt5108 == 1) {
			local8 = (Interface3) Static202.method3148(arg0.anInt5112, arg0.anInt5104, arg0.anInt5110);
		}
		if (arg0.anInt5108 == 2) {
			local8 = (Interface3) Static30.method472(arg0.anInt5112, arg0.anInt5104, arg0.anInt5110, gg.class);
		}
		if (arg0.anInt5108 == 3) {
			local8 = (Interface3) Static277.method4347(arg0.anInt5112, arg0.anInt5104, arg0.anInt5110);
		}
		if (local8 == null) {
			arg0.anInt5114 = -1;
			arg0.anInt5105 = 0;
			arg0.anInt5102 = 0;
		} else {
			arg0.anInt5114 = local8.method5420();
			arg0.anInt5105 = local8.method5425();
			arg0.anInt5102 = local8.method5423();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!o;)Z")
	public static boolean method5560(@OriginalArg(1) Class171 arg0) {
		return arg0 == Static199.aClass171_3 || arg0 == Static178.aClass171_2 || arg0 == Static63.aClass171_1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIILclient!np;ILclient!f;III)Lclient!f;")
	public static Class75 method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class155 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class75 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class75 local12 = (Class75) Static186.aClass139_39.method3076(local6);
		if (local12 == null) {
			@Pc(22) Class239 local22 = Static214.method3327(Static299.aClass20_73, arg1);
			if (local22 == null) {
				return null;
			}
			local12 = arg4.method4930(local22, 1031, Static21.anInt266, 64, 768);
			Static186.aClass139_39.method3070(local12, local6);
		}
		local12 = local12.method5473((byte) 2, 1031, true);
		if (arg3 != 0) {
			local12.method5475(arg3);
		}
		if (arg0 != 0) {
			local12.method5466(arg0);
		}
		if (arg9 != 0) {
			local12.method5474(arg9);
		}
		if (arg8 != 0) {
			local12.method5482(0, arg8, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIILclient!np;B)V")
	public static void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class155 arg7) {
		@Pc(11) Interface3 local11 = (Interface3) Static343.method5200(arg3, arg5, arg2);
		@Pc(22) Class60 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(38) int local38;
		if (local11 != null) {
			local22 = Static97.aClass217_4.method5007(local11.method5420());
			local28 = local11.method5423() & 0x3;
			local32 = local11.method5425();
			if (local22.anInt1380 == -1) {
				local38 = arg1;
				if (local22.anInt1415 > 0) {
					local38 = arg4;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg7.method4925(4, arg6, arg0, local38);
					} else if (local28 == 1) {
						arg7.method4879(local38, 4, arg6, arg0);
					} else if (local28 == 2) {
						arg7.method4925(4, arg6, arg0 + 3, local38);
					} else if (local28 == 3) {
						arg7.method4879(local38, 4, arg6 + 3, arg0);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg7.method4954(1, arg6, 1, arg0, local38);
					} else if (local28 == 1) {
						arg7.method4954(1, arg6, 1, arg0 + 3, local38);
					} else if (local28 == 2) {
						arg7.method4954(1, arg6 + 3, 1, arg0 + 3, local38);
					} else if (local28 == 3) {
						arg7.method4954(1, arg6 + 3, 1, arg0, local38);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg7.method4879(local38, 4, arg6, arg0);
					} else if (local28 == 1) {
						arg7.method4925(4, arg6, arg0 + 3, local38);
					} else if (local28 == 2) {
						arg7.method4879(local38, 4, arg6 + 3, arg0);
					} else if (local28 == 3) {
						arg7.method4925(4, arg6, arg0, local38);
					}
				}
			} else {
				Static4.method83(arg7, local28, local22, arg0, arg6);
			}
		}
		local11 = (Interface3) Static30.method472(arg3, arg5, arg2, gg.class);
		if (local11 != null) {
			local22 = Static97.aClass217_4.method5007(local11.method5420());
			local28 = local11.method5423() & 0x3;
			local32 = local11.method5425();
			if (local22.anInt1380 != -1) {
				Static4.method83(arg7, local28, local22, arg0, arg6);
			} else if (local32 == 9) {
				local38 = -1118482;
				if (local22.anInt1415 > 0) {
					local38 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg7.method4942(arg6, arg0 + 3, arg6 + 3, local38, arg0);
				} else {
					arg7.method4942(arg6 + 3, arg0 + 3, arg6, local38, arg0);
				}
			}
		}
		local11 = (Interface3) Static277.method4347(arg3, arg5, arg2);
		if (local11 == null) {
			return;
		}
		local22 = Static97.aClass217_4.method5007(local11.method5420());
		local28 = local11.method5423() & 0x3;
		if (local22.anInt1380 != -1) {
			Static4.method83(arg7, local28, local22, arg0, arg6);
			return;
		}
	}
}
