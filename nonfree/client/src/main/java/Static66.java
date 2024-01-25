import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cha", name = "M", descriptor = "I")
	public static int anInt1114;

	@OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
	public static int anInt1115;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "(I)V")
	public static void method1106() {
		@Pc(7) Class223 local7 = null;
		try {
			local7 = Static576.method7734("2");
			@Pc(22) Class5_Sub36 local22 = new Class5_Sub36(Static262.anInt4702 * 6 + 3);
			local22.method7324(1);
			local22.method7296(Static262.anInt4702);
			for (@Pc(34) int local34 = 0; local34 < Static123.anIntArray120.length; local34++) {
				if (Static624.aBooleanArray27[local34]) {
					local22.method7296(local34);
					local22.method7287(Static123.anIntArray120[local34]);
				}
			}
			local7.method5093(local22.anInt8456, 0, local22.aByteArray89);
		} catch (@Pc(75) Exception local75) {
		}
		try {
			if (local7 != null) {
				local7.method5092();
			}
		} catch (@Pc(82) Exception local82) {
		}
		Static274.aLong141 = Static480.method6763();
		Static195.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(CB)Z")
	public static boolean method1107(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static340.method5097(arg0)) {
			return true;
		} else {
			@Pc(27) char[] local27 = Static44.aCharArray3;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(37) char local37 = local27[local29];
				if (arg0 == local37) {
					return true;
				}
			}
			@Pc(50) char[] local50 = Static159.aCharArray7;
			for (@Pc(54) int local54 = 0; local54 < local50.length; local54++) {
				@Pc(62) char local62 = local50[local54];
				if (local62 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BI)V")
	public static void method1108(@OriginalArg(1) int arg0) {
		if (Static178.aBoolean244 && Static347.aClass5_Sub1_Sub21Array2.length >= arg0) {
			return;
		}
		Static347.aClass5_Sub1_Sub21Array2 = new Class5_Sub1_Sub21[arg0];
		Static653.anIntArray608 = new int[arg0];
		Static519.anIntArray474 = new int[arg0];
		Static300.aClass5_Sub1_Sub21Array1 = new Class5_Sub1_Sub21[arg0];
		Static459.aClass264Array1 = new Class264[arg0];
		Static378.anIntArray367 = new int[arg0];
		Static492.anIntArray461 = new int[arg0];
	}
}
