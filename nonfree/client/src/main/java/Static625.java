import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_200 = new Class180(128, -1);

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "Lclient!lb;")
	public static final Class3_Sub36 aClass3_Sub36_1 = new Class3_Sub36(0, 0);

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "[I")
	public static int[] anIntArray867 = new int[1];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIF[BILclient!gv;FIFIIFF)V")
	public static void method8765(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) Class126 arg3, @OriginalArg(6) float arg4, @OriginalArg(8) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static228.method3899(arg5, arg1, arg3, arg7, arg2, arg4, local5, arg6, arg0);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8768(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static458.anInt7581; local11++) {
			if (arg0.equalsIgnoreCase(Static461.aStringArray20[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIII)I")
	public static int method8770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static121.aClass21Array2 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(33) int local33 = arg3 >> 9;
			@Pc(37) int local37 = arg4 >> 9;
			if (arg0 < 0 || arg2 < 0 || Static158.anInt927 - 1 < arg0 || arg2 > Static515.anInt8292 - 1) {
				return 0;
			}
			if (local33 < 1 || local37 < 1 || Static158.anInt927 - 1 < local33 || local37 > Static515.anInt8292 - 1) {
				return 0;
			}
			@Pc(93) boolean local93 = (Static90.aByteArrayArrayArray25[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
			@Pc(118) boolean local118;
			@Pc(137) boolean local137;
			if ((arg3 & 0x1FF) == 0) {
				local118 = (Static90.aByteArrayArrayArray25[1][local33 - 1][arg4 >> 9] & 0x2) != 0;
				local137 = (Static90.aByteArrayArrayArray25[1][local33][arg4 >> 9] & 0x2) != 0;
				if (local118 != local137) {
					local93 = (Static90.aByteArrayArrayArray25[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x1FF) == 0) {
				local118 = (Static90.aByteArrayArrayArray25[1][arg3 >> 9][local37 - 1] & 0x2) != 0;
				local137 = (Static90.aByteArrayArrayArray25[1][arg3 >> 9][local37] & 0x2) != 0;
				if (local137 != local118) {
					local93 = (Static90.aByteArrayArrayArray25[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if (local93) {
				arg1++;
			}
		}
		return Static121.aClass21Array2[arg1].method7980(arg4, arg3);
	}
}
