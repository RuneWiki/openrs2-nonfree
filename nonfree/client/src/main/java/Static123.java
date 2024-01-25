import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt2176;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!hh;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "S")
	public static short aShort27 = 205;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Lclient!rea;")
	public static Class2_Sub40 method1776() {
		@Pc(11) Class2_Sub40 local11 = Static40.method643();
		local11.anInt8041 = 0;
		local11.aClass179_105 = null;
		local11.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(5000);
		return local11;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	public static void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static615.anInt9912 == 1) {
			Static530.method7339(Static472.aClass2_Sub2_Sub11_3, arg1, arg0);
		} else if (Static615.anInt9912 == 2) {
			if (Static319.aBoolean356) {
				Static565.method7738(arg1 + Static69.method966(), arg0 - -Static274.method3801());
			} else {
				Static565.method7738(arg1, arg0);
			}
		}
		Static472.aClass2_Sub2_Sub11_3 = null;
		Static615.anInt9912 = 0;
	}
}
