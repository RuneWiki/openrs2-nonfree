import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public static int anInt7959 = 0;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!gfa;Z[[[BIB)Z")
	public static boolean method6744(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static231.aBoolean340) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8975 >> Static458.anInt7508;
		@Pc(13) int local13 = arg0.anInt8980 >> Static458.anInt7508;
		if (local8 < Static269.anInt5039 || local8 >= Static498.anInt7923 || local13 < Static115.anInt2655 || local13 >= Static191.anInt3711) {
			return true;
		} else if ((arg2 == null || arg0.aByte126 < arg3 || arg2[arg0.aByte126][local8][local13] != arg4) && arg0.method7475() && !arg0.method7484()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static210.anInt4205 - 16 && local8 <= Static210.anInt4205 + 16 && local13 >= Static12.anInt136 - 16 && local13 <= Static12.anInt136 + 16) {
				if (Static495.aBoolean622) {
					Static366.aClass66Array1[Static384.anInt6605++].method2152(arg0);
					Static384.anInt6605 %= Static77.anInt1994;
				} else {
					arg0.method7471(Static482.aClass43_12);
				}
			}
			return true;
		}
	}
}
