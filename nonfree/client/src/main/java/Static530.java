import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wca", name = "T", descriptor = "Lclient!dda;")
	public static Class53 aClass53_149;

	@OriginalMember(owner = "client!wca", name = "bb", descriptor = "Lclient!bca;")
	public static Class20 aClass20_9;

	@OriginalMember(owner = "client!wca", name = "tc", descriptor = "Lclient!dda;")
	public static Class53 aClass53_150;

	@OriginalMember(owner = "client!wca", name = "Xc", descriptor = "Lclient!kn;")
	public static Class163 aClass163_6;

	@OriginalMember(owner = "client!wca", name = "pb", descriptor = "Ljava/lang/String;")
	public static String aString206 = null;

	@OriginalMember(owner = "client!wca", name = "jc", descriptor = "I")
	public static int anInt9204 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIBI)I")
	public static int method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static532.aClass75Array3 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(21) int local21 = arg3 >> 7;
			@Pc(25) int local25 = arg1 >> 7;
			if (arg2 < 0 || arg0 < 0 || Static363.anInt1158 - 1 < arg2 || arg0 > Static511.anInt8889 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || local21 > Static363.anInt1158 - 1 || local25 > Static511.anInt8889 - 1) {
				return 0;
			}
			@Pc(94) boolean local94 = (Static267.aByteArrayArrayArray19[1][arg3 >> 7][arg1 >> 7] & 0x2) != 0;
			@Pc(119) boolean local119;
			@Pc(135) boolean local135;
			if ((arg3 & 0x7F) == 0) {
				local119 = (Static267.aByteArrayArrayArray19[1][local21 - 1][arg1 >> 7] & 0x2) != 0;
				local135 = (Static267.aByteArrayArrayArray19[1][local21][arg1 >> 7] & 0x2) != 0;
				if (local119 != local135) {
					local94 = (Static267.aByteArrayArrayArray19[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x7F) == 0) {
				local119 = (Static267.aByteArrayArrayArray19[1][arg3 >> 7][local25 - 1] & 0x2) != 0;
				local135 = (Static267.aByteArrayArrayArray19[1][arg3 >> 7][local25] & 0x2) != 0;
				if (local119 != local135) {
					local94 = (Static267.aByteArrayArrayArray19[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local94) {
				arg4++;
			}
		}
		return Static532.aClass75Array3[arg4].aa(arg3, arg1);
	}
}
