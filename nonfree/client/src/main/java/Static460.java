import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Lclient!jfa;")
	public static Class176 aClass176_1 = new Class176(8);

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	public static int anInt7816 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
	public static void method6467() {
		Static529.aClass223_62.method4933(50);
		Static401.aClass223_47.method4933(50);
		Static304.aClass223_43.method4933(50);
		Static258.aClass223_37.method4933(50);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIII)V")
	public static void method6469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static363.method5455(local35, false, true);
	}
}
