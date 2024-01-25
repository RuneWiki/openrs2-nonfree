import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method765(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static223.method4290(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static223.method4290(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local16;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(69) StringBuffer local69 = new StringBuffer(local54);
		for (@Pc(71) int local71 = local16; local71 < local19; local71++) {
			@Pc(77) char local77 = arg0.charAt(local71);
			if (Static167.method3598(local77)) {
				@Pc(87) char local87 = Static609.method8924(local77);
				if (local87 != '\u0000') {
					local69.append(local87);
				}
			}
		}
		if (local69.length() == 0) {
			return null;
		} else {
			return local69.toString();
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!cea;)Lclient!fu;")
	public static Class110_Sub1_Sub1 method766(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(9) Class110_Sub1 local9 = Static633.method9185(arg0);
		@Pc(13) int local13 = arg0.method8368();
		return new Class110_Sub1_Sub1(local9.aClass309_11, local9.aClass86_10, local9.anInt7742, local9.anInt7733, local9.anInt7743, local9.anInt7736, local9.anInt7739, local9.anInt7738, local9.anInt7735, local9.anInt4102, local9.anInt4099, local9.anInt4105, local9.anInt4104, local9.anInt4103, local9.anInt4100, local13);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
	public static void method767() {
		Static214.aClass20_7.method7241(Static475.aClass30_12);
		Static214.aClass20_7.DA(Static542.anInt9758, Static290.anInt6164, Static447.anInt8318, Static224.anInt4986);
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)V")
	public static void method769(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static149.anInt3867 == 2) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[0]);
				Static68.aClass366Array1[1].method8990(Static78.aClass59Array1[1]);
			} else if (Static149.anInt3867 == 3) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[0]);
				Static68.aClass366Array1[1].method8990(Static78.aClass59Array1[1]);
				Static68.aClass366Array1[2].method8990(Static78.aClass59Array1[2]);
			} else {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[0]);
				Static68.aClass366Array1[1].method8990(Static78.aClass59Array1[1]);
				Static68.aClass366Array1[2].method8990(Static78.aClass59Array1[2]);
				Static68.aClass366Array1[3].method8990(Static78.aClass59Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static149.anInt3867 == 2) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[2]);
			} else if (Static149.anInt3867 == 3) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[3]);
				Static68.aClass366Array1[1].method8990(Static78.aClass59Array1[4]);
			} else {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[4]);
				Static68.aClass366Array1[1].method8990(Static78.aClass59Array1[5]);
				Static68.aClass366Array1[2].method8990(Static78.aClass59Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static149.anInt3867 == 2) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[3]);
				return;
			}
			if (Static149.anInt3867 == 3) {
				Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[5]);
				return;
			}
			Static68.aClass366Array1[0].method8990(Static78.aClass59Array1[7]);
		}
	}
}
