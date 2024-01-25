import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!cn;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_9 = new Class363(19, -2);

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[16];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)I")
	public static int method213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static421.aClass67Array7 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(27) int local27 = arg0 >> 9;
			@Pc(31) int local31 = arg3 >> 9;
			if (arg4 < 0 || arg2 < 0 || Static188.anInt3850 - 1 < arg4 || arg2 > Static49.anInt1174 - 1) {
				return 0;
			} else if (local27 >= 1 && local31 >= 1 && Static188.anInt3850 - 1 >= local27 && Static49.anInt1174 - 1 >= local31) {
				@Pc(86) boolean local86 = (Static521.aByteArrayArrayArray45[1][arg0 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(108) boolean local108;
				@Pc(124) boolean local124;
				if ((arg0 & 0x1FF) == 0) {
					local108 = (Static521.aByteArrayArrayArray45[1][local27 - 1][arg3 >> 9] & 0x2) != 0;
					local124 = (Static521.aByteArrayArrayArray45[1][local27][arg3 >> 9] & 0x2) != 0;
					if (local108 != local124) {
						local86 = (Static521.aByteArrayArrayArray45[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local108 = (Static521.aByteArrayArrayArray45[1][arg0 >> 9][local31 - 1] & 0x2) != 0;
					local124 = (Static521.aByteArrayArrayArray45[1][arg0 >> 9][local31] & 0x2) != 0;
					if (local124 != local108) {
						local86 = (Static521.aByteArrayArrayArray45[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if (local86) {
					arg1++;
				}
				return Static421.aClass67Array7[arg1].method6711(arg3, arg0);
			} else {
				return 0;
			}
		} else {
			return Static421.aClass67Array7[arg1].method6711(arg3, arg0);
		}
	}
}
