import java.awt.Canvas;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Z")
	public static boolean method25(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZLclient!ih;)V")
	public static void method27(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class60_Sub1_Sub1_Sub3_Sub2 arg1) {
		if (Static539.anInt8776 >= 400) {
			return;
		}
		@Pc(15) Class294 local15 = arg1.aClass294_1;
		@Pc(18) String local18 = arg1.aString51;
		if (local15.anIntArray511 != null) {
			local15 = local15.method7168(Static303.aClass55_2);
			if (local15 == null) {
				return;
			}
			local18 = local15.aString91;
		}
		if (!local15.aBoolean615) {
			return;
		}
		if (arg1.anInt4884 != 0) {
			@Pc(65) String local65 = Static567.aClass121_9 == Static129.aClass121_1 ? Static50.aClass43_29.method596(Static601.anInt9518) : Static50.aClass43_27.method596(Static601.anInt9518);
			local18 = local18 + Static54.method651(arg1.anInt4884, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869) + " (" + local65 + arg1.anInt4884 + ")";
		}
		if (Static162.aBoolean266 && !arg0) {
			@Pc(110) Class302 local110 = Static417.anInt7211 == -1 ? null : Static521.aClass20_21.method250(Static417.anInt7211);
			if ((Static109.anInt2151 & 0x2) != 0 && (local110 == null || local15.method7162(Static417.anInt7211, local110.anInt8386) != local110.anInt8386)) {
				Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> <col=ffff00>" + local18, 0, (long) arg1.anInt4845, true, Static185.aString41, -1, false, 0, false, 19, (long) arg1.anInt4845);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(173) String[] local173 = local15.aStringArray34;
		if (Static142.aBoolean237) {
			local173 = Static190.method3592(local173);
		}
		if (local173 == null) {
			return;
		}
		for (@Pc(186) int local186 = local173.length - 1; local186 >= 0; local186--) {
			if (local173[local186] != null && (local15.aByte112 == 0 || !local173[local186].equalsIgnoreCase(Static50.aClass43_23.method596(Static601.anInt9518)) && !local173[local186].equalsIgnoreCase(Static50.aClass43_22.method596(Static601.anInt9518)))) {
				@Pc(223) short local223 = 0;
				if (local186 == 0) {
					local223 = 22;
				}
				@Pc(229) int local229 = Static295.anInt5252;
				if (local186 == 1) {
					local223 = 8;
				}
				if (local186 == 2) {
					local223 = 5;
				}
				if (local186 == 3) {
					local223 = 20;
				}
				if (local186 == 4) {
					local223 = 4;
				}
				if (local15.anInt8147 == local186) {
					local229 = local15.anInt8158;
				}
				if (local186 == 5) {
					local223 = 1003;
				}
				if (local186 == local15.anInt8178) {
					local229 = local15.anInt8181;
				}
				Static541.method8078(local173[local186].equalsIgnoreCase(Static50.aClass43_23.method596(Static601.anInt9518)) ? local15.anInt8143 : local229, "<col=ffff00>" + local18, 0, (long) arg1.anInt4845, true, local173[local186], -1, false, 0, false, local223, (long) arg1.anInt4845);
			}
		}
		if (local15.aByte112 != 1) {
			return;
		}
		for (@Pc(336) int local336 = 0; local336 < local173.length; local336++) {
			if (local173[local336] != null && (local173[local336].equalsIgnoreCase(Static50.aClass43_23.method596(Static601.anInt9518)) || local173[local336].equalsIgnoreCase(Static50.aClass43_22.method596(Static601.anInt9518)))) {
				@Pc(368) short local368 = 0;
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869 < arg1.anInt4884) {
					local368 = 2000;
				}
				@Pc(377) short local377 = 0;
				@Pc(379) int local379 = Static295.anInt5252;
				if (local336 == 0) {
					local377 = 22;
				}
				if (local336 == 1) {
					local377 = 8;
				}
				if (local336 == 2) {
					local377 = 5;
				}
				if (local336 == 3) {
					local377 = 20;
				}
				if (local336 == 4) {
					local377 = 4;
				}
				if (local336 == 5) {
					local377 = 1003;
				}
				if (local15.anInt8147 == local336) {
					local379 = local15.anInt8158;
				}
				if (local377 != 0) {
					local377 += local368;
				}
				if (local336 == local15.anInt8178) {
					local379 = local15.anInt8181;
				}
				Static541.method8078(local173[local336].equalsIgnoreCase(Static50.aClass43_23.method596(Static601.anInt9518)) ? local15.anInt8143 : local379, "<col=ffff00>" + local18, 0, (long) arg1.anInt4845, true, local173[local336], -1, false, 0, false, local377, (long) arg1.anInt4845);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method29(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static265.anInt5023 >= 200 && !Static200.aBoolean328 || Static265.anInt5023 >= 200) {
			Static298.method4814(Static50.aClass43_11.method596(Static601.anInt9518));
			return;
		}
		@Pc(46) String local46 = Static273.method4625(arg0);
		if (local46 == null) {
			return;
		}
		@Pc(98) String local98;
		for (@Pc(52) int local52 = 0; local52 < Static265.anInt5023; local52++) {
			@Pc(64) String local64 = Static273.method4625(Static35.aStringArray5[local52]);
			if (local64 != null && local64.equals(local46)) {
				Static298.method4814(arg0 + Static50.aClass43_37.method596(Static601.anInt9518));
				return;
			}
			if (Static665.aStringArray45[local52] != null) {
				local98 = Static273.method4625(Static665.aStringArray45[local52]);
				if (local98 != null && local98.equals(local46)) {
					Static298.method4814(arg0 + Static50.aClass43_37.method596(Static601.anInt9518));
					return;
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < Static287.anInt5151; local136++) {
			local98 = Static273.method4625(Static73.aStringArray11[local136]);
			if (local98 != null && local98.equals(local46)) {
				Static298.method4814(Static50.aClass43_42.method596(Static601.anInt9518) + arg0 + Static50.aClass43_43.method596(Static601.anInt9518));
				return;
			}
			if (Static433.aStringArray31[local136] != null) {
				@Pc(185) String local185 = Static273.method4625(Static433.aStringArray31[local136]);
				if (local185 != null && local185.equals(local46)) {
					Static298.method4814(Static50.aClass43_42.method596(Static601.anInt9518) + arg0 + Static50.aClass43_43.method596(Static601.anInt9518));
					return;
				}
			}
		}
		if (Static273.method4625(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23).equals(local46)) {
			Static298.method4814(Static50.aClass43_40.method596(Static601.anInt9518));
			return;
		}
		@Pc(249) Class260 local249 = Static629.method8573();
		@Pc(255) Class6_Sub13 local255 = Static30.method353(Static376.aClass241_82, local249.aClass270_2);
		local255.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg0));
		local255.aClass6_Sub15_Sub1_1.method2991(arg0);
		local249.method6404(local255);
	}
}
