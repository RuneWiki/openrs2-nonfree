import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Lclient!qk;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public static int anInt6255;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "I")
	public static int anInt6257 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZIII)I")
	public static int method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static345.aClass162Array3 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(19) int local19 = arg1 >> 7;
			@Pc(23) int local23 = arg2 >> 7;
			if (arg3 < 0 || arg0 < 0 || Static166.anInt2852 - 1 < arg3 || arg0 > Static426.anInt6923 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static166.anInt2852 - 1 >= local19 && local23 <= Static426.anInt6923 - 1) {
				@Pc(90) boolean local90 = (Static253.aByteArrayArrayArray11[1][arg1 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg1 & 0x7F) == 0) {
					local115 = (Static253.aByteArrayArrayArray11[1][local19 - 1][arg2 >> 7] & 0x2) != 0;
					local131 = (Static253.aByteArrayArrayArray11[1][local19][arg2 >> 7] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static253.aByteArrayArrayArray11[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local115 = (Static253.aByteArrayArrayArray11[1][arg1 >> 7][local23 - 1] & 0x2) != 0;
					local131 = (Static253.aByteArrayArrayArray11[1][arg1 >> 7][local23] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static253.aByteArrayArrayArray11[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if (local90) {
					arg4++;
				}
				return Static345.aClass162Array3[arg4].ca(arg1, arg2);
			} else {
				return 0;
			}
		} else {
			return Static345.aClass162Array3[arg4].ca(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	public static void method4878(@OriginalArg(1) int arg0) {
		Static152.anInt2660 = arg0;
		Static264.aClass132_40.method2698();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!pf;IB)V")
	public static void method4879(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt4903 == arg2 && arg2 != -1) {
			@Pc(28) Class128 local28 = Static334.aClass62_2.method1418(arg2);
			@Pc(31) int local31 = local28.anInt3329;
			if (local31 == 1) {
				arg1.anInt4929 = 0;
				arg1.anInt4954 = arg0;
				arg1.anInt4945 = 1;
				arg1.lb = 0;
				arg1.anInt4940 = 0;
				Static128.method1905(local28, arg1.anInt6835, arg1 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg1.aByte91, arg1.anInt6833, arg1.anInt4929);
			}
			if (local31 == 2) {
				arg1.anInt4940 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt4903 == -1 || Static334.aClass62_2.method1418(arg2).anInt3326 >= Static334.aClass62_2.method1418(arg1.anInt4903).anInt3326) {
			arg1.anInt4954 = arg0;
			arg1.anInt4940 = 0;
			arg1.anInt4945 = 1;
			arg1.anInt4929 = 0;
			arg1.lb = 0;
			arg1.anInt4903 = arg2;
			arg1.anInt4976 = arg1.anInt4977;
			if (arg1.anInt4903 == -1) {
				return;
			}
			Static128.method1905(Static334.aClass62_2.method1418(arg1.anInt4903), arg1.anInt6835, arg1 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg1.aByte91, arg1.anInt6833, arg1.anInt4929);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)Z")
	public static boolean method4880(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
