import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array11;

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
	public static int anInt7801 = 0;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIII)I")
	public static int method6529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static500.aClass274Array2 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(25) int local25 = arg2 >> 9;
			@Pc(29) int local29 = arg0 >> 9;
			if (arg3 < 0 || arg1 < 0 || Static394.anInt7540 - 1 < arg3 || arg1 > Static462.anInt8391 - 1) {
				return 0;
			}
			if (local25 < 1 || local29 < 1 || Static394.anInt7540 - 1 < local25 || local29 > Static462.anInt8391 - 1) {
				return 0;
			}
			@Pc(97) boolean local97 = (Static244.aByteArrayArrayArray10[1][arg2 >> 9][arg0 >> 9] & 0x2) != 0;
			@Pc(125) boolean local125;
			@Pc(141) boolean local141;
			if ((arg2 & 0x1FF) == 0) {
				local125 = (Static244.aByteArrayArrayArray10[1][local25 - 1][arg0 >> 9] & 0x2) != 0;
				local141 = (Static244.aByteArrayArrayArray10[1][local25][arg0 >> 9] & 0x2) != 0;
				if (local141 != local125) {
					local97 = (Static244.aByteArrayArrayArray10[1][arg3][arg1] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x1FF) == 0) {
				local125 = (Static244.aByteArrayArrayArray10[1][arg2 >> 9][local29 - 1] & 0x2) != 0;
				local141 = (Static244.aByteArrayArrayArray10[1][arg2 >> 9][local29] & 0x2) != 0;
				if (local125 != local141) {
					local97 = (Static244.aByteArrayArrayArray10[1][arg3][arg1] & 0x2) != 0;
				}
			}
			if (local97) {
				arg4++;
			}
		}
		return Static500.aClass274Array2[arg4].method8043(arg0, arg2);
	}
}
