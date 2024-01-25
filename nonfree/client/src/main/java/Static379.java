import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!ln;")
	public static Class7_Sub2_Sub3_Sub2 aClass7_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
	public static void method4943() {
		if (Static241.aBoolean395) {
			Static241.aBoolean395 = false;
			Static437.aClass8_27 = null;
			Static186.aClass8_13 = null;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!na;)V")
	public static void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1) {
		Static444.aClass159Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method4945(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(8) int local8 = Static300.method4233(arg0, arg1);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(22) int local22;
			for (local22 = local17; arg0.charAt(local22) != arg1; local22++) {
			}
			local13[local15++] = arg0.substring(local17, local22);
			local17 = local22 + 1;
		}
		local13[local8] = arg0.substring(local17);
		return local13;
	}
}
