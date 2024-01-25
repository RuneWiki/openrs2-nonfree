import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!es;")
	public static Class5_Sub19 aClass5_Sub19_25;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt9007 = -1;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_7 = new Class392(7, 2);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZ)Lclient!gda;")
	public static Class126 method7755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class75 local11 = null;
		if (Static546.aClass62_7 != null) {
			local11 = new Class75(arg1, Static546.aClass62_7, Static222.aClass62Array1[arg1], 1000000);
		}
		Static35.aClass222_Sub1Array1[arg1] = Static62.aClass318_1.method7164(arg1, local11, Static45.aClass75_1);
		Static35.aClass222_Sub1Array1[arg1].method7717();
		return new Class126(Static35.aClass222_Sub1Array1[arg1], arg2, arg0);
	}
}
