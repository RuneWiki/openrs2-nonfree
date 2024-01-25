import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	public static final int anInt10537 = 0;

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "Z")
	public static boolean aBoolean832 = false;

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_187 = new Class73(37, -2);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)V")
	public static void method8566(@OriginalArg(0) int arg0) {
		if (Static554.anInt9496 == 1) {
			Static453.anInt8162 = arg0;
		} else if (Static554.anInt9496 == 2) {
			Static64.anInt10754 = arg0;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public static void method8568() {
		if (Static144.aClass40ArrayArray12 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < Static144.aClass40ArrayArray12.length; local5++) {
			for (@Pc(9) int local9 = 0; local9 < Static144.aClass40ArrayArray12[local5].length; local9++) {
				Static144.aClass40ArrayArray12[local5][local9] = Static164.aClass40_2;
			}
		}
	}
}
