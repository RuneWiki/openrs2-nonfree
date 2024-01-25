import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "S")
	public static short aShort49;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array7;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public static int anInt3411 = 0;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!taa;")
	public static final Class352 aClass352_3 = new Class352();

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!kka;")
	public static final Class214 aClass214_1 = new Class214(16);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public static int method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static642.method8454(arg1 - 1, arg0 - 1) + Static642.method8454(arg1 + 1, arg0 - 1) + Static642.method8454(arg1 - 1, arg0 - -1) + Static642.method8454(arg1 - -1, arg0 - -1);
		@Pc(70) int local70 = Static642.method8454(arg1 - 1, arg0) + Static642.method8454(arg1 + 1, arg0) + Static642.method8454(arg1, arg0 - 1) + Static642.method8454(arg1, arg0 - -1);
		@Pc(82) int local82 = Static642.method8454(arg1, arg0);
		return local82 / 4 + local40 / 16 + local70 / 8;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method3119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg0; local13 <= arg2; local13++) {
			for (@Pc(19) int local19 = arg3; local19 <= arg1; local19++) {
				if (arg4 == Static672.anIntArrayArray64[local13][local19] && Static44.anIntArrayArray5[local13][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)[Lclient!sla;")
	public static Class344[] method3120() {
		return new Class344[] { Static353.aClass344_7, Static425.aClass344_9, Static689.aClass344_14, Static623.aClass344_13, Static496.aClass344_10, Static322.aClass344_6, Static383.aClass344_8, Static507.aClass344_11, Static141.aClass344_3, Static235.aClass344_4, Static64.aClass344_1, Static271.aClass344_5, Static547.aClass344_12, Static711.aClass344_16, Static111.aClass344_2 };
	}
}
