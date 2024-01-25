import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method2458(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static40.anInt824;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class235 local19 = Static274.aClass392_1.method9736(arg0[local11]);
			if (local19.anInt7155 != -1) {
				@Pc(32) Class71 local32 = (Class71) Static388.aClass22_34.method462((long) local19.anInt7155);
				if (local32 == null) {
					@Pc(40) Class67 local40 = Static676.method1693(Static409.aClass124_84, local19.anInt7155, 0);
					if (local40 != null) {
						local32 = Static607.aClass101_15.method8063(local40, true);
						Static388.aClass22_34.method470((long) local19.anInt7155, local32);
					}
				}
				if (local32 != null) {
					Static251.aClass71Array25[local9] = local32;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[FB)[F")
	public static float[] method2459(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static679.method4133(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public static void method2460() {
		Static656.aClass22_68.method473();
	}
}
