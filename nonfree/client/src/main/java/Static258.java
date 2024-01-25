import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!im;")
	public static Class120 aClass120_4;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_18 = new Class209("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Lclient!ht;")
	public static final Class112 aClass112_5 = new Class112();

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIZIIII)V")
	public static void method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg4 < 0 || Static229.anInt4427 - 1 <= arg3 || Static379.anInt6422 - 1 <= arg4) {
			return;
		}
		if (Static440.aClass106ArrayArrayArray3 == null) {
			return;
		}
		@Pc(52) Interface6 local52;
		if (arg5 != 0) {
			if (arg5 != 1) {
				if (arg5 == 2) {
					local52 = (Interface6) Static455.method4456(arg6, arg3, arg4, jn.class);
					if (local52 != null) {
						if (arg0 == 11) {
							arg0 = 10;
						}
						if (!(local52 instanceof Class3_Sub2_Sub4)) {
							Static330.method4568(arg6, local52.method5153(), arg3, arg1, arg4, arg2, arg5, arg0);
							return;
						}
						((Class3_Sub2_Sub4) local52).aClass83_3.method2042(arg1);
						return;
					}
				} else if (arg5 == 3) {
					local52 = (Interface6) Static139.method2376(arg6, arg3, arg4);
					if (local52 == null) {
						return;
					}
					if (local52 instanceof Class3_Sub1_Sub2) {
						((Class3_Sub1_Sub2) local52).aClass83_2.method2042(arg1);
						return;
					}
					Static330.method4568(arg6, local52.method5153(), arg3, arg1, arg4, arg2, arg5, arg0);
				} else {
					return;
				}
				return;
			}
			local52 = (Interface6) Static414.method5443(arg6, arg3, arg4);
			if (local52 != null) {
				if (!(local52 instanceof Class3_Sub3_Sub2)) {
					@Pc(131) int local131 = local52.method5153();
					if (arg0 != 4 && arg0 != 5) {
						if (arg0 == 6) {
							Static330.method4568(arg6, local131, arg3, arg1, arg4, arg2 + 4, arg5, 4);
						} else if (arg0 == 7) {
							Static330.method4568(arg6, local131, arg3, arg1, arg4, (arg2 + 2 & 0x3) + 4, arg5, 4);
							return;
						} else if (arg0 == 8) {
							Static330.method4568(arg6, local131, arg3, arg1, arg4, arg2 + 4, arg5, 4);
							Static330.method4568(arg6, local131, arg3, arg1, arg4, (arg2 + 2 & 0x3) + 4, arg5, 4);
							return;
						}
						return;
					}
					Static330.method4568(arg6, local131, arg3, arg1, arg4, arg2, arg5, 4);
					return;
				}
				((Class3_Sub3_Sub2) local52).aClass83_1.method2042(arg1);
				return;
			}
			return;
		}
		local52 = (Interface6) Static215.method3376(arg6, arg3, arg4);
		@Pc(239) Interface6 local239 = (Interface6) Static389.method5166(arg6, arg3, arg4);
		if (local52 != null && arg0 != 2) {
			if (local52 instanceof Class3_Sub5_Sub2) {
				((Class3_Sub5_Sub2) local52).aClass83_4.method2042(arg1);
			} else {
				Static330.method4568(arg6, local52.method5153(), arg3, arg1, arg4, arg2, arg5, arg0);
			}
		}
		if (local239 == null) {
			return;
		}
		if (local239 instanceof Class3_Sub5_Sub2) {
			((Class3_Sub5_Sub2) local239).aClass83_4.method2042(arg1);
			return;
		}
		Static330.method4568(arg6, local239.method5153(), arg3, arg1, arg4, arg2, arg5, arg0);
		return;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	public static void method584(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static410.anInt6841 != -1) {
				Static384.method5097(Static410.anInt6841);
			}
			for (@Pc(19) Class2_Sub35 local19 = (Class2_Sub35) Static113.aClass163_11.method3771(); local19 != null; local19 = (Class2_Sub35) Static113.aClass163_11.method3770()) {
				if (!local19.method5865()) {
					local19 = (Class2_Sub35) Static113.aClass163_11.method3771();
					if (local19 == null) {
						break;
					}
				}
				Static313.method4400(local19, true, false);
			}
			Static410.anInt6841 = -1;
			Static113.aClass163_11 = new Class163(8);
			Static267.method5790();
			Static410.anInt6841 = Static275.anInt5051;
			Static64.method1245(false);
			Static260.method3927();
			Static168.method2742(Static410.anInt6841);
		}
		Static236.method3663();
		Static54.anInt1162 = -1;
		Static10.method226(Static368.anInt6315);
		Static375.aClass3_Sub2_Sub1_Sub2_7 = new Class3_Sub2_Sub1_Sub2();
		Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 = Static229.anInt4427 * 128 / 2;
		Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 = Static379.anInt6422 * 128 / 2;
		Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] = Static229.anInt4427 / 2;
		Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0] = Static379.anInt6422 / 2;
		Static23.anInt567 = 0;
		Static364.anInt6270 = 0;
		if (Static159.anInt3195 == 2) {
			Static364.anInt6270 = Static233.anInt4506 << 7;
			Static23.anInt567 = Static262.anInt6676 << 7;
		} else {
			Static176.method188();
		}
		Static277.method4067();
		if (Static364.anInt6270 == 0 || Static23.anInt567 == 0) {
			Static365.method4986(10);
		} else {
			Static348.method3781();
			Static365.method4986(28);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method586(@OriginalArg(1) int arg0) {
		Static77.anInt1732 = arg0;
		@Pc(7) Class171 local7 = Static224.aClass171_36;
		synchronized (Static224.aClass171_36) {
			Static224.aClass171_36.method3936();
		}
		local7 = Static226.aClass171_22;
		synchronized (Static226.aClass171_22) {
			Static226.aClass171_22.method3936();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method587() {
		if (Static23.aBoolean27) {
			return;
		}
		Static185.method2955(Static195.aClass106ArrayArrayArray2);
		if (Static79.aClass106ArrayArrayArray1 != null) {
			Static185.method2955(Static79.aClass106ArrayArrayArray1);
		}
		Static23.aBoolean27 = true;
	}
}
