import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_27 = new Class34("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = null;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method915() {
		if (Static254.aClass131_1 == null) {
			return;
		}
		while (true) {
			while (Static90.anInt2261 < Static90.aClass104_Sub1Array3.length) {
				@Pc(25) Class104_Sub1 local25 = Static90.aClass104_Sub1Array3[Static90.anInt2261];
				if (local25 != null && local25.anInt4717 == -1) {
					if (Static86.aClass1_Sub39_1 == null) {
						Static86.aClass1_Sub39_1 = Static254.aClass131_1.method3605(local25.aString47);
					}
					@Pc(48) int local48 = Static86.aClass1_Sub39_1.anInt6392;
					if (local48 == -1) {
						return;
					}
					local25.anInt4717 = local48;
					Static86.aClass1_Sub39_1 = null;
					Static90.anInt2261++;
				} else {
					Static90.anInt2261++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method916(@OriginalArg(1) Class55 arg0) {
		Static213.aClass55_1 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
	public static int method917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = (local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
	public static boolean method918(@OriginalArg(1) int arg0) {
		@Pc(7) Class104_Sub1 local7 = Static283.method4901(arg0);
		if (local7 == null) {
			return false;
		} else if (Static207.anInt4332 == 3) {
			@Pc(36) String local36 = "";
			if (Static63.anInt5669 != 0) {
				local36 = ":" + (local7.anInt4715 + 7000);
			}
			@Pc(51) String local51 = "";
			if (Static158.aString33 != null) {
				local51 = "/p=" + Static158.aString33;
			}
			@Pc(100) String local100 = "http://" + local7.aString47 + local36 + "/l=" + Static259.anInt2907 + "/a=" + Static163.anInt3550 + local51 + "/j" + (Static148.aBoolean313 ? "1" : "0") + ",o" + (Static141.aBoolean617 ? "1" : "0") + ",a2";
			try {
				Static93.aClient1.getAppletContext().showDocument(new URL(local100), "_self");
				return true;
			} catch (@Pc(115) Exception local115) {
				return false;
			}
		} else {
			Static292.anInt4638 = local7.anInt4715;
			Static114.aString46 = local7.aString47;
			if (Static63.anInt5669 != 0) {
				Static286.anInt5727 = Static292.anInt4638 + 50000;
				Static266.anInt5404 = Static292.anInt4638 + 40000;
				Static274.anInt5608 = Static266.anInt5404;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[III)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(14) int local14 = arg2 - 1;
		@Pc(18) int local18 = local14 - 7;
		while (local18 > arg3) {
			@Pc(22) int local22 = arg3 + 1;
			arg1[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg0;
			@Pc(47) int local47 = local42 + 1;
			arg1[local47] = arg0;
			@Pc(52) int local52 = local47 + 1;
			arg1[local52] = arg0;
			arg3 = local52 + 1;
			arg1[arg3] = arg0;
		}
		while (arg3 < local14) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
	public static boolean method920() {
		return Static33.anInt1108 == 0 ? Static37.aClass1_Sub1_Sub1_1.method42() : true;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method921() {
		Static324.aClass87_58.method2485();
	}
}
