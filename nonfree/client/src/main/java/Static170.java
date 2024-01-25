import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
	public static int anInt3104 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;IZLclient!kk;Z)V")
	public static void method2645(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class192 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static598.method8369(3, arg2, arg0);
			return;
		}
		@Pc(18) String local18;
		if (Static295.aString75.startsWith("win") && arg2.aBoolean389) {
			local18 = null;
			if (Static270.anApplet5 != null) {
				local18 = Static270.anApplet5.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(36) Class330 local36 = Static598.method8369(0, arg2, arg0);
				Static378.aString107 = arg0;
				Static627.aClass192_6 = arg2;
				Static229.aClass330_2 = local36;
				return;
			}
		}
		if (Static295.aString75.startsWith("mac")) {
			local18 = null;
			if (Static270.anApplet5 != null) {
				local18 = Static270.anApplet5.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg1) {
				Static598.method8369(1, arg2, arg0);
				return;
			}
		}
		Static598.method8369(2, arg2, arg0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method2646() {
		for (@Pc(14) Class5_Sub4_Sub11 local14 = (Class5_Sub4_Sub11) Static471.aClass306_45.method7313(); local14 != null; local14 = (Class5_Sub4_Sub11) Static471.aClass306_45.method7301()) {
			@Pc(19) Class14_Sub1_Sub1_Sub2 local19 = local14.aClass14_Sub1_Sub1_Sub2_1;
			if (local19.anInt2017 < Static235.anInt3998) {
				local14.method8911();
				local19.method1863();
			} else if (local19.anInt2044 <= Static235.anInt3998) {
				local19.method1866();
				if (local19.anInt2030 > 0) {
					@Pc(47) Class5_Sub13 local47 = (Class5_Sub13) Static51.aClass81_11.method1599((long) (local19.anInt2030 - 1));
					if (local47 != null) {
						@Pc(52) Class14_Sub1_Sub1_Sub3_Sub2 local52 = local47.aClass14_Sub1_Sub1_Sub3_Sub2_1;
						if (local52.anInt9317 >= 0 && local52.anInt9317 < Static111.anInt1752 * 512 && local52.anInt9315 >= 0 && local52.anInt9315 < Static279.anInt4567 * 512) {
							local19.method1865(local52.anInt9317, local52.anInt9315, Static600.method8378(local52.anInt9315, local52.anInt9317, local19.aByte125) - local19.anInt2020, Static235.anInt3998);
						}
					}
				}
				if (local19.anInt2030 < 0) {
					@Pc(110) int local110 = -local19.anInt2030 - 1;
					@Pc(117) Class14_Sub1_Sub1_Sub3_Sub1 local117;
					if (Static620.anInt10055 == local110) {
						local117 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1;
					} else {
						local117 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local110];
					}
					if (local117 != null && local117.anInt9317 >= 0 && local117.anInt9317 < Static111.anInt1752 * 512 && local117.anInt9315 >= 0 && Static279.anInt4567 * 512 > local117.anInt9315) {
						local19.method1865(local117.anInt9317, local117.anInt9315, Static600.method8378(local117.anInt9315, local117.anInt9317, local19.aByte125) - local19.anInt2020, Static235.anInt3998);
					}
				}
				local19.method1870(Static128.anInt2091);
				Static509.method7368(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(JI)V")
	public static void method2647(@OriginalArg(0) long arg0) {
		Static222.aCalendar1.setTime(new Date(arg0));
	}
}
