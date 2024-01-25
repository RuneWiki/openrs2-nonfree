import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public static int anInt6187;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public static int anInt6188;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public static int anInt6180 = -1;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public static final int anInt6186 = 52;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray215 = new int[128][128];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V")
	public static void method5597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
		Static131.aClass6_Sub10_Sub1_2.method3968(20);
		Static131.aClass6_Sub10_Sub1_2.method3968(arg3);
		Static131.aClass6_Sub10_Sub1_2.method3968(arg1);
		Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		Static131.aClass6_Sub10_Sub1_2.method4025(arg2);
		Static215.anInt3939 = 1;
		Static291.anInt5474 = 0;
		Static166.anInt3137 = 0;
		Static92.anInt1691 = -3;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public static void method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class20_Sub4 local7 = new Class20_Sub4();
		local7.anInt1603 = arg3;
		local7.anInt1601 = arg1;
		local7.aString56 = arg4;
		local7.anInt1598 = arg5;
		local7.anInt1607 = arg0 + Static76.anInt2853;
		local7.anInt1606 = arg2;
		Static227.aClass109_6.method2935(local7);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)I")
	public static int method5600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static203.aClass106Array3 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(21) int local21 = arg2 >> 7;
			@Pc(25) int local25 = arg3 >> 7;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static153.anInt2883 - 1 || Static246.anInt4606 - 1 < arg4) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static153.anInt2883 - 1 >= local21 && Static246.anInt4606 - 1 >= local25) {
				@Pc(90) boolean local90 = (Static265.aByteArrayArrayArray11[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg2 & 0x7F) == 0) {
					local115 = (Static265.aByteArrayArrayArray11[1][local21 - 1][arg3 >> 7] & 0x2) != 0;
					local131 = (Static265.aByteArrayArrayArray11[1][local21][arg3 >> 7] & 0x2) != 0;
					if (local131 != local115) {
						local90 = (Static265.aByteArrayArrayArray11[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local115 = (Static265.aByteArrayArrayArray11[1][arg2 >> 7][local25 - 1] & 0x2) != 0;
					local131 = (Static265.aByteArrayArrayArray11[1][arg2 >> 7][local25] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static265.aByteArrayArrayArray11[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local90) {
					arg1++;
				}
				return Static203.aClass106Array3[arg1].method5717(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static203.aClass106Array3[arg1].method5717(arg2, arg3);
		}
	}
}
