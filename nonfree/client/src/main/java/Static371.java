import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_91 = new Class209(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II[BIII)V")
	public static void method3277(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg0 += arg2;
		@Pc(24) int local24 = arg3 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg0 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
