import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "Lclient!o;")
	public static Class41 aClass41_11;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Lclient!hw;")
	public static final Class2_Sub17 aClass2_Sub17_5 = new Class2_Sub17(new byte[5000]);

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
	public static final int anInt4260 = 1;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!oq;III)V")
	public static void method3421(@OriginalArg(1) Class192 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) Static463.aClass181_52.method3972(); local8 != null; local8 = (Class2_Sub3) Static463.aClass181_52.method3975()) {
			if (arg1 == local8.anInt347 && local8.anInt345 == arg2 << 7 && arg3 << 7 == local8.anInt348 && local8.aClass192_1.anInt5422 == arg0.anInt5422) {
				if (local8.aClass2_Sub8_Sub4_2 != null) {
					Static414.aClass2_Sub8_Sub1_2.method1041(local8.aClass2_Sub8_Sub4_2);
					local8.aClass2_Sub8_Sub4_2 = null;
				}
				if (local8.aClass2_Sub8_Sub4_1 != null) {
					Static414.aClass2_Sub8_Sub1_2.method1041(local8.aClass2_Sub8_Sub4_1);
					local8.aClass2_Sub8_Sub4_1 = null;
				}
				local8.method6260();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBIIII)I")
	public static int method3423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static241.aClass22Array3 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(21) int local21 = arg4 >> 7;
			@Pc(25) int local25 = arg1 >> 7;
			if (arg0 < 0 || arg2 < 0 || arg0 > Static234.anInt3949 - 1 || arg2 > Static371.anInt6492 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static234.anInt3949 - 1 && local25 <= Static371.anInt6492 - 1) {
				@Pc(90) boolean local90 = (Static326.aByteArrayArrayArray15[1][arg4 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(134) boolean local134;
				if ((arg4 & 0x7F) == 0) {
					local115 = (Static326.aByteArrayArrayArray15[1][local21 - 1][arg1 >> 7] & 0x2) != 0;
					local134 = (Static326.aByteArrayArrayArray15[1][local21][arg1 >> 7] & 0x2) != 0;
					if (local115 != local134) {
						local90 = (Static326.aByteArrayArrayArray15[1][arg0][arg2] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local115 = (Static326.aByteArrayArrayArray15[1][arg4 >> 7][local25 - 1] & 0x2) != 0;
					local134 = (Static326.aByteArrayArrayArray15[1][arg4 >> 7][local25] & 0x2) != 0;
					if (local115 != local134) {
						local90 = (Static326.aByteArrayArrayArray15[1][arg0][arg2] & 0x2) != 0;
					}
				}
				if (local90) {
					arg3++;
				}
				return Static241.aClass22Array3[arg3].ca(arg4, arg1);
			} else {
				return 0;
			}
		} else {
			return Static241.aClass22Array3[arg3].ca(arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
	public static void method3424(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg0, 9);
		local12.method2578();
	}
}
