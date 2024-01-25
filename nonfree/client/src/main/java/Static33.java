import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public static boolean method1205(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!ha;Lclient!la;)V")
	public static void method1208(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class196 arg1) {
		@Pc(10) Class107[] local10 = Static645.method2767(arg1, Static75.anInt1784);
		Static621.aClass24Array19 = new Class24[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static621.aClass24Array19[local16] = arg0.method7525(local10[local16], true);
		}
		local10 = Static645.method2767(arg1, Static626.anInt10074);
		Static445.aClass24Array15 = new Class24[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static445.aClass24Array15[local47] = arg0.method7525(local10[local47], true);
		}
		local10 = Static645.method2767(arg1, Static470.anInt8243);
		Static350.aClass24Array13 = new Class24[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static350.aClass24Array13[local74] = arg0.method7525(local10[local74], true);
		}
		local10 = Static645.method2767(arg1, Static417.anInt7578);
		Static2.aClass24Array1 = new Class24[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static2.aClass24Array1[local101] = arg0.method7525(local10[local101], true);
		}
		local10 = Static645.method2767(arg1, Static445.anInt7955);
		Static544.aClass24Array18 = new Class24[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static544.aClass24Array18[local128] = arg0.method7525(local10[local128], true);
		}
		local10 = Static645.method2767(arg1, Static613.anInt9932);
		Static203.aClass24Array9 = new Class24[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static203.aClass24Array9[local155] = arg0.method7525(local10[local155], true);
		}
		local10 = Static645.method2767(arg1, Static202.anInt3188);
		Static524.aClass24Array17 = new Class24[local10.length];
		for (@Pc(182) int local182 = 0; local182 < local10.length; local182++) {
			Static524.aClass24Array17[local182] = arg0.method7525(local10[local182], true);
		}
		local10 = Static645.method2767(arg1, Static509.anInt8813);
		Static636.aClass24Array21 = new Class24[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static636.aClass24Array21[local213] = arg0.method7525(local10[local213], true);
		}
		local10 = Static645.method2767(arg1, Static643.anInt10223);
		Static101.aClass24Array6 = new Class24[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static101.aClass24Array6[local244] = arg0.method7525(local10[local244], true);
		}
		local10 = Static645.method2767(arg1, Static596.anInt9746);
		Static255.aClass24Array11 = new Class24[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static255.aClass24Array11[local275] = arg0.method7525(local10[local275], true);
		}
		local10 = Static645.method2767(arg1, Static103.anInt2270);
		Static448.aClass24Array16 = new Class24[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static448.aClass24Array16[local306] = arg0.method7525(local10[local306], true);
		}
		local10 = Static645.method2767(arg1, Static379.anInt7091);
		Static135.aClass24Array7 = new Class24[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static135.aClass24Array7[local337] = arg0.method7525(local10[local337], true);
		}
		Static480.aClass24_27 = arg0.method7525(Static645.method2771(arg1, Static609.anInt9881, 0), true);
		Static287.aClass24_15 = arg0.method7525(Static645.method2771(arg1, Static252.anInt4623, 0), true);
		local10 = Static645.method2767(arg1, Static166.anInt3242);
		Static622.aClass24Array20 = new Class24[local10.length];
		for (@Pc(384) int local384 = 0; local384 < local10.length; local384++) {
			Static622.aClass24Array20[local384] = arg0.method7525(local10[local384], true);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
	public static String[] method1210(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static245.method4003(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1.charAt(local33) != arg0; local33++) {
			}
			local15[local17++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local15[local10] = arg1.substring(local27);
		return local15;
	}
}
