import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
	public static int anInt4939 = 0;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_54 = new Class61(61, 8);

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
	public static int anInt4940 = 0;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
	public static int anInt4941 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIZ)I")
	public static int method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static112.aClass16Array3 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(21) int local21 = arg3 >> 9;
			@Pc(25) int local25 = arg4 >> 9;
			if (arg0 < 0 || arg2 < 0 || arg0 > Static38.anInt740 - 1 || arg2 > Static38.anInt741 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || local21 > Static38.anInt740 - 1 || Static38.anInt741 - 1 < local25) {
				return 0;
			}
			@Pc(87) boolean local87 = (Static97.aByteArrayArrayArray19[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
			@Pc(112) boolean local112;
			@Pc(128) boolean local128;
			if ((arg3 & 0x1FF) == 0) {
				local112 = (Static97.aByteArrayArrayArray19[1][local21 - 1][arg4 >> 9] & 0x2) != 0;
				local128 = (Static97.aByteArrayArrayArray19[1][local21][arg4 >> 9] & 0x2) != 0;
				if (local128 != local112) {
					local87 = (Static97.aByteArrayArrayArray19[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x1FF) == 0) {
				local112 = (Static97.aByteArrayArrayArray19[1][arg3 >> 9][local25 - 1] & 0x2) != 0;
				local128 = (Static97.aByteArrayArrayArray19[1][arg3 >> 9][local25] & 0x2) != 0;
				if (local128 != local112) {
					local87 = (Static97.aByteArrayArrayArray19[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if (local87) {
				arg1++;
			}
		}
		return Static112.aClass16Array3[arg1].sa(arg3, arg4);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!oa;BLclient!gba;)V")
	public static void method4207(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class115 arg1) {
		@Pc(31) boolean local31 = Static195.aClass99_1.method2794(arg1.anInt3482, arg1.aBoolean278 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null, arg1.anInt3525 | 0xFF000000, arg0, arg1.anInt3487, arg1.anInt3512, arg1.anInt3510) == null;
		if (local31) {
			Static263.aClass124_52.method3275(new Class4_Sub25(arg1.anInt3510, arg1.anInt3487, arg1.anInt3482, arg1.anInt3525 | 0xFF000000, arg1.anInt3512, arg1.aBoolean278));
			Static330.method4950(arg1);
		}
	}
}
