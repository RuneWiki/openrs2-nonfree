import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!ft;")
	public static final Class107 aClass107_4 = new Class107();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!ha;I)V")
	public static void method4837(@OriginalArg(0) Class104[] arg0) {
		Static175.anInt3485 = arg0.length;
		Static527.anIntArray813 = new int[Static175.anInt3485 + 10];
		Static204.aClass104Array38 = new Class104[Static175.anInt3485 + 10];
		Static556.method7041(arg0, 0, Static204.aClass104Array38, 0, Static175.anInt3485);
		for (@Pc(30) int local30 = 0; local30 < Static175.anInt3485; local30++) {
			Static527.anIntArray813[local30] = Static204.aClass104Array38[local30].ma();
		}
		for (@Pc(49) int local49 = Static175.anInt3485; local49 < Static204.aClass104Array38.length; local49++) {
			Static527.anIntArray813[local49] = 12;
		}
	}
}
