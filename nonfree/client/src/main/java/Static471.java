import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	public static int anInt7983;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt7980 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method6859(@OriginalArg(1) Class57 arg0) {
		Static344.aClass81Array1 = new Class81[Static351.anIntArray339.length];
		for (@Pc(19) int local19 = 0; local19 < Static351.anIntArray339.length; local19++) {
			@Pc(25) int local25 = Static351.anIntArray339[local19];
			@Pc(30) Class224 local30 = Static439.method6500(local25, Static367.aClass208_140);
			@Pc(38) Class80 local38 = arg0.method7708(local30, Static684.method3657(Static341.aClass208_75, local25));
			Static344.aClass81Array1[local19] = new Class81(local38, local30);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method6860() {
		for (@Pc(18) Class5_Sub9 local18 = (Class5_Sub9) Static134.aClass291_12.method6987(); local18 != null; local18 = (Class5_Sub9) Static134.aClass291_12.method6989()) {
			Static441.method6513(local18.anInt1440);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method6861() {
		for (@Pc(12) Class5_Sub22 local12 = (Class5_Sub22) Static343.aClass102_41.method1916(); local12 != null; local12 = (Class5_Sub22) Static343.aClass102_41.method1915()) {
			if (local12.aBoolean308) {
				local12.method3422();
			}
		}
		for (@Pc(40) Class5_Sub22 local40 = (Class5_Sub22) Static509.aClass102_60.method1916(); local40 != null; local40 = (Class5_Sub22) Static509.aClass102_60.method1915()) {
			if (local40.aBoolean308) {
				local40.method3422();
			}
		}
	}
}
