import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_14 = new Class40("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "S")
	public static short aShort15 = 320;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Lclient!dg;")
	public static final Class63 aClass63_2 = new Class63();

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method899(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static248.aClass131Array4 != Static511.aClass131Array6) {
			@Pc(11) int local11 = Static493.aClass131Array5[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class131 local18 = Static493.aClass131Array5[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7185(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
