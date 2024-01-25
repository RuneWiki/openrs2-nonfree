import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_7 = new Class55(14, 16);

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "[I")
	public static final int[] anIntArray250 = new int[3];

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "S")
	public static short aShort64 = 1;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)I")
	public static int method3392() {
		return Static518.anInt8368 == 1 ? Static431.anInt7666 : Static631.anInt10242;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIBI)I")
	public static int method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static511.aClass91Array3 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(21) int local21 = arg4 >> 9;
			@Pc(25) int local25 = arg1 >> 9;
			if (arg2 < 0 || arg0 < 0 || arg2 > Static456.anInt7428 - 1 || arg0 > Static5.anInt112 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static456.anInt7428 - 1 < local21 || Static5.anInt112 - 1 < local25) {
				return 0;
			}
			@Pc(94) boolean local94 = (Static372.aByteArrayArrayArray3[1][arg4 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(116) boolean local116;
			@Pc(132) boolean local132;
			if ((arg4 & 0x1FF) == 0) {
				local116 = (Static372.aByteArrayArrayArray3[1][local21 - 1][arg1 >> 9] & 0x2) != 0;
				local132 = (Static372.aByteArrayArrayArray3[1][local21][arg1 >> 9] & 0x2) != 0;
				if (local132 != local116) {
					local94 = (Static372.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local116 = (Static372.aByteArrayArrayArray3[1][arg4 >> 9][local25 - 1] & 0x2) != 0;
				local132 = (Static372.aByteArrayArrayArray3[1][arg4 >> 9][local25] & 0x2) != 0;
				if (local132 != local116) {
					local94 = (Static372.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local94) {
				arg3++;
			}
		}
		return Static511.aClass91Array3[arg3].method7446(arg4, arg1);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!sl;B)Lclient!au;")
	public static Class2_Sub4 method3394(@OriginalArg(0) Class2_Sub17 arg0) {
		arg0.method2859();
		@Pc(13) int local13 = arg0.method2859();
		@Pc(17) Class2_Sub4 local17 = Static35.method849(local13);
		local17.anInt10456 = arg0.method2859();
		@Pc(31) int local31 = arg0.method2859();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method2859();
			local17.method8895(arg0, local39);
		}
		local17.method8902();
		return local17;
	}
}
