import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Lclient!su;")
	public static final Class298 aClass298_129 = new Class298();

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_7 = new Class179(7, 0, 1, 1);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)I")
	public static int method5045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static2.anIntArray3[arg1 & 0x3] : Static55.anIntArray96[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oa;Lclient!pj;I)V")
	public static void method5046(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class248 arg1) {
		@Pc(10) Class177[] local10 = Static593.method4140(arg1, Static181.anInt3477);
		Static118.aClass71Array57 = new Class71[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static118.aClass71Array57[local16] = arg0.method7522(local10[local16]);
		}
		local10 = Static593.method4140(arg1, Static427.anInt7586);
		Static280.aClass71Array34 = new Class71[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static280.aClass71Array34[local43] = arg0.method7522(local10[local43]);
		}
		local10 = Static593.method4140(arg1, Static503.anInt8755);
		Static357.aClass71Array41 = new Class71[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static357.aClass71Array41[local74] = arg0.method7522(local10[local74]);
		}
		local10 = Static593.method4140(arg1, Static44.anInt833);
		Static230.aClass71Array27 = new Class71[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static230.aClass71Array27[local105] = arg0.method7522(local10[local105]);
		}
		local10 = Static593.method4140(arg1, Static10.anInt139);
		Static187.aClass71Array23 = new Class71[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static187.aClass71Array23[local132] = arg0.method7522(local10[local132]);
		}
		local10 = Static593.method4140(arg1, Static255.anInt4660);
		Static544.aClass71Array44 = new Class71[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static544.aClass71Array44[local159] = arg0.method7522(local10[local159]);
		}
		local10 = Static593.method4140(arg1, Static194.anInt3795);
		Static143.aClass71Array17 = new Class71[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static143.aClass71Array17[local190] = arg0.method7522(local10[local190]);
		}
		local10 = Static593.method4140(arg1, Static377.anInt6888);
		Static570.aClass71Array56 = new Class71[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static570.aClass71Array56[local217] = arg0.method7522(local10[local217]);
		}
		local10 = Static593.method4140(arg1, Static450.anInt7953);
		Static244.aClass71Array31 = new Class71[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static244.aClass71Array31[local244] = arg0.method7522(local10[local244]);
		}
		local10 = Static593.method4140(arg1, Static585.anInt6434);
		Static201.aClass71Array24 = new Class71[local10.length];
		for (@Pc(271) int local271 = 0; local271 < local10.length; local271++) {
			Static201.aClass71Array24[local271] = arg0.method7522(local10[local271]);
		}
		local10 = Static593.method4140(arg1, Static493.anInt8640);
		Static279.aClass71Array33 = new Class71[local10.length];
		for (@Pc(302) int local302 = 0; local302 < local10.length; local302++) {
			Static279.aClass71Array33[local302] = arg0.method7522(local10[local302]);
		}
		local10 = Static593.method4140(arg1, Static425.anInt7500);
		Static390.aClass71Array43 = new Class71[local10.length];
		for (@Pc(333) int local333 = 0; local333 < local10.length; local333++) {
			Static390.aClass71Array43[local333] = arg0.method7522(local10[local333]);
		}
		Static171.aClass71_55 = arg0.method7522(Static593.method4148(arg1, Static574.anInt4894, 0));
		Static449.aClass71_48 = arg0.method7522(Static593.method4148(arg1, Static536.anInt9212, 0));
		local10 = Static593.method4140(arg1, Static389.anInt7106);
		Static353.aClass71Array39 = new Class71[local10.length];
		for (@Pc(376) int local376 = 0; local376 < local10.length; local376++) {
			Static353.aClass71Array39[local376] = arg0.method7522(local10[local376]);
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	public static void method5047() {
		if (Static568.anInt9823 <= 0) {
			Static232.aString91 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static415.aStringArray33.length; local7++) {
			if (Static415.aStringArray33[local7].startsWith("--> ")) {
				local5++;
				if (local5 == Static568.anInt9823) {
					Static232.aString91 = Static415.aStringArray33[local7].substring(4);
					break;
				}
			}
		}
	}
}
