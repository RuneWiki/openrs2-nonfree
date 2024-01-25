import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_117 = new Class85("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
	private static int method4620(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4625(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) boolean local5 = false;
		for (@Pc(11) int local11 = 0; local11 < Static22.anInt472; local11++) {
			@Pc(18) Class4_Sub5_Sub2_Sub1 local18 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local11]];
			if (local18 != null && local18.aString40 != null && local18.aString40.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static125.aClass5_Sub12_Sub2_3.method5125(108);
					Static125.aClass5_Sub12_Sub2_3.method5071(0);
					Static125.aClass5_Sub12_Sub2_3.method5084(Static88.anIntArray137[local11]);
				} else if (arg0 == 4) {
					Static125.aClass5_Sub12_Sub2_3.method5125(64);
					Static125.aClass5_Sub12_Sub2_3.method5076(Static88.anIntArray137[local11]);
					Static125.aClass5_Sub12_Sub2_3.method5069(0);
				} else if (arg0 == 5) {
					Static125.aClass5_Sub12_Sub2_3.method5125(185);
					Static125.aClass5_Sub12_Sub2_3.method5088(Static88.anIntArray137[local11]);
					Static125.aClass5_Sub12_Sub2_3.method5071(0);
				} else if (arg0 == 6) {
					Static125.aClass5_Sub12_Sub2_3.method5125(233);
					Static125.aClass5_Sub12_Sub2_3.method5089(0);
					Static125.aClass5_Sub12_Sub2_3.method5095(Static88.anIntArray137[local11]);
				} else if (arg0 == 7) {
					Static125.aClass5_Sub12_Sub2_3.method5125(167);
					Static125.aClass5_Sub12_Sub2_3.method5095(Static88.anIntArray137[local11]);
					Static125.aClass5_Sub12_Sub2_3.method5059(0);
				}
				local5 = true;
				break;
			}
		}
		if (!local5) {
			Static45.method713(Static268.aClass85_118.method2020(Static41.anInt726) + arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V")
	public static void method4626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub1_Sub2 local12 = Static166.method3027(arg0, 1);
		local12.method850();
		local12.anInt996 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bm;ILclient!ea;IIIII)V")
	public static void method4628(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Interface5 local9 = null;
		if (arg4 == 0) {
			local9 = (Interface5) Static330.method5730(arg3, arg6, arg5);
		}
		if (arg4 == 1) {
			local9 = (Interface5) Static241.method4296(arg3, arg6, arg5);
		}
		if (arg4 == 2) {
			local9 = (Interface5) Static259.method4533(arg3, arg6, arg5, iq.class);
		}
		if (arg4 == 3) {
			local9 = (Interface5) Static101.method1810(arg3, arg6, arg5);
		}
		if (local9 == null) {
			return;
		}
		@Pc(60) int local60 = local9.method5913();
		@Pc(64) int local64 = local9.method5908();
		@Pc(70) Class156 local70 = Static111.method1967(local9.method5910());
		if (local70.method4227()) {
			Static68.method4996(arg6, arg3, arg5, local70);
		}
		if (local9.method5909()) {
			local9.method5912(arg2);
		}
		if (arg4 == 0) {
			Static241.method4299(arg3, arg6, arg5);
			if (local70.anInt4779 != 0) {
				arg0.method482(local60, !local70.aBoolean387, arg5, local70.aBoolean391, local64, arg6);
				return;
			}
		} else if (arg4 == 1) {
			Static166.method3023(arg3, arg6, arg5);
		} else if (arg4 == 2) {
			Static100.method1802(arg3, arg6, arg5, iq.class);
			if (local70.anInt4779 != 0 && arg6 + local70.anInt4775 < Static22.anInt481 && arg5 + local70.anInt4775 < Static269.anInt5281 && arg6 + local70.anInt4769 < Static22.anInt481 && arg5 + local70.anInt4769 < Static269.anInt5281) {
				arg0.method498(local70.aBoolean391, arg5, !local70.aBoolean387, local64, local70.anInt4769, arg6, local70.anInt4775);
				return;
			}
			return;
		} else if (arg4 == 3) {
			Static222.method4045(arg3, arg6, arg5);
			if (local70.anInt4779 == 1) {
				arg0.method487(arg5, arg6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!ga;")
	public static Class74 method4630(@OriginalArg(1) int arg0) {
		@Pc(10) Class109 local10 = Static291.aClass109_53;
		@Pc(19) Class74 local19;
		synchronized (Static291.aClass109_53) {
			local19 = (Class74) Static291.aClass109_53.method2857((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static87.aClass93_36.method2410(method4620(arg0), Static33.method562(arg0));
		local19 = new Class74();
		if (local39 != null) {
			local19.method1778(new Class5_Sub12(local39));
		}
		@Pc(54) Class109 local54 = Static291.aClass109_53;
		synchronized (Static291.aClass109_53) {
			Static291.aClass109_53.method2855((long) arg0, local19);
			return local19;
		}
	}
}
