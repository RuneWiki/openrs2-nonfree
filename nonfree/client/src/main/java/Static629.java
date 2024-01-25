import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wfa", name = "x", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_152 = new Class218(68, 6);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
	public static int method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static453.aShortArrayArray18 == null ? 0 : Static453.aShortArrayArray18[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method8529(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local11 < local19 && Static362.method5871(arg0.charAt(local11))) {
			local11++;
		}
		while (local19 > local11 && Static362.method5871(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local54);
		for (@Pc(73) int local73 = local11; local73 < local19; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static445.method6740(local79)) {
				@Pc(87) char local87 = Static251.method4759(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public static String method8530() {
		return Static433.aBoolean672 || Static300.aClass3_Sub1_Sub4_3 == null ? "" : Static300.aClass3_Sub1_Sub4_3.aString28;
	}

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "(B)V")
	public static void method8531() {
		if (!Static144.aBoolean300) {
			Static550.aFloat251 += (-12.0F - Static550.aFloat251) / 2.0F;
			Static168.aBoolean336 = true;
			Static144.aBoolean300 = true;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "(I)V")
	public static void method8532() {
		@Pc(1) Class112 local1 = Static185.aClass112_20;
		synchronized (Static185.aClass112_20) {
			Static185.aClass112_20.method3643();
		}
	}
}
