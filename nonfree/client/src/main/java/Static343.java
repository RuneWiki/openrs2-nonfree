import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[Lclient!ya;")
	public static Class157[] aClass157Array3;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_139 = new Class119("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
	public static int anInt5889 = 0;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_140 = new Class119("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
	public static int anInt5894 = 16777215;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!wk;IBIIII)V")
	public static void method4625(@OriginalArg(0) Class25_Sub5_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static216.method3149(arg1, arg3, arg0.aByte94, arg0.anInt5518, arg2, 0, arg0.anInt5514);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method4626(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static94.aClass157Array1 != aClass157Array3) {
			@Pc(11) int local11 = Static330.aClass157Array2[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class157 local18 = Static330.aClass157Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4946(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
