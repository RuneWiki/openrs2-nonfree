import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	public static int anInt3563;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
	public static int anInt3568;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "[I")
	public static final int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "Lclient!em;")
	public static Class68 aClass68_7 = null;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!dw;IBI)V")
	public static void method2924(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt6163 == arg2 && arg2 != -1) {
			@Pc(79) Class250 local79 = Static338.aClass12_2.method255(arg2);
			@Pc(82) int local82 = local79.anInt7015;
			if (local82 == 1) {
				arg0.anInt6178 = 0;
				arg0.anInt6182 = 0;
				arg0.anInt6139 = arg1;
				arg0.anInt6149 = 0;
				arg0.anInt6169 = 1;
				Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, false, local79, arg0.anInt6149);
			}
			if (local82 == 2) {
				arg0.anInt6182 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt6163 == -1 || Static338.aClass12_2.method255(arg2).anInt7019 >= Static338.aClass12_2.method255(arg0.anInt6163).anInt7019) {
			arg0.anInt6204 = arg0.anInt6206;
			arg0.anInt6149 = 0;
			arg0.anInt6169 = 1;
			arg0.anInt6139 = arg1;
			arg0.anInt6182 = 0;
			arg0.anInt6178 = 0;
			arg0.anInt6163 = arg2;
			if (arg0.anInt6163 != -1) {
				Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, false, Static338.aClass12_2.method255(arg0.anInt6163), arg0.anInt6149);
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V")
	public static void method2925() {
		Static342.aClass171_47.method3934();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)I")
	public static int method2927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static36.method600(local7, local17);
		@Pc(35) int local35 = Static36.method600(local7 + 1, local17);
		@Pc(42) int local42 = Static36.method600(local7, local17 + 1);
		@Pc(56) int local56 = Static36.method600(local7 + 1, local17 - -1);
		@Pc(63) int local63 = Static180.method2888(arg0, local13, local35, local28);
		@Pc(70) int local70 = Static180.method2888(arg0, local13, local56, local42);
		return Static180.method2888(arg0, local23, local70, local63);
	}
}
