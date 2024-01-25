import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!um;")
	public static Class247 aClass247_3;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_20 = new Class94(11, 16);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	public static int anInt3620 = -1;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_78 = new Class55(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "()V")
	public static void method2948() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt5022; local1++) {
			@Pc(6) Class26_Sub2 local6 = Static49.aClass26_Sub2Array1[local1];
			Static391.method4978(local6);
			Static49.aClass26_Sub2Array1[local1] = null;
		}
		Static135.anInt5022 = 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[Lclient!go;)V")
	public static void method2949(@OriginalArg(0) int arg0, @OriginalArg(2) Class95[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class95 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt2616 == 0) {
					if (local9.aClass95Array1 != null) {
						method2949(arg0, local9.aClass95Array1);
					}
					@Pc(30) Class7_Sub44 local30 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local9.anInt2583);
					if (local30 != null) {
						Static379.method4657(arg0, local30.anInt7165);
					}
				}
				@Pc(48) Class7_Sub18 local48;
				if (arg0 == 0 && local9.anObjectArray6 != null) {
					local48 = new Class7_Sub18();
					local48.aClass95_5 = local9;
					local48.anObjectArray1 = local9.anObjectArray6;
					Static159.method2352(local48);
				}
				if (arg0 == 1 && local9.anObjectArray14 != null) {
					if (local9.anInt2602 >= 0) {
						@Pc(76) Class95 local76 = Static313.method4088(local9.anInt2583);
						if (local76 == null || local76.aClass95Array1 == null || local9.anInt2602 >= local76.aClass95Array1.length || local76.aClass95Array1[local9.anInt2602] != local9) {
							continue;
						}
					}
					local48 = new Class7_Sub18();
					local48.aClass95_5 = local9;
					local48.anObjectArray1 = local9.anObjectArray14;
					Static159.method2352(local48);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLclient!vd;I[II)Lclient!wq;")
	public static Class59_Sub3_Sub1 method2951(@OriginalArg(2) Class51_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		if (arg0.aBoolean467 || Static217.method3066(arg3) && Static217.method3066(arg1)) {
			return new Class59_Sub3_Sub1(arg0, 3553, arg3, arg1, false, arg2);
		} else if (arg0.aBoolean442) {
			return new Class59_Sub3_Sub1(arg0, 34037, arg3, arg1, false, arg2);
		} else {
			return new Class59_Sub3_Sub1(arg0, arg3, arg1, Static444.method5654(arg3), Static444.method5654(arg1), arg2);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2952(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static345.method4461(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static206.anInt3640; local25++) {
			@Pc(31) String local31 = Static84.aStringArray37[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static345.method4461(local31);
			if (local31 != null && local31.equals(local20)) {
				Static206.anInt3640--;
				for (@Pc(55) int local55 = local25; local55 < Static206.anInt3640; local55++) {
					Static84.aStringArray37[local55] = Static84.aStringArray37[local55 + 1];
					Static248.aStringArray35[local55] = Static248.aStringArray35[local55 + 1];
					Static332.aStringArray46[local55] = Static332.aStringArray46[local55 + 1];
					Static226.aStringArray33[local55] = Static226.aStringArray33[local55 + 1];
					Static45.aBooleanArray1[local55] = Static45.aBooleanArray1[local55 + 1];
				}
				Static324.anInt5357 = Static90.anInt1865;
				Static81.method1414(Static88.aClass2_30);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0));
				Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
				break;
			}
		}
	}
}
