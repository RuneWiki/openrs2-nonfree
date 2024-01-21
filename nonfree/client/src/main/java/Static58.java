import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_458 = Static181.method2795("Clientscript error in: ");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!eh;)Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 method1119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		return Static66.method1261(arg1, arg0, arg2) ? Static176.method2705() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	public static void method1121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) long local19 = (long) ((arg1 << 16) + arg0);
		@Pc(25) Class2_Sub2_Sub15 local25 = (Class2_Sub2_Sub15) Static152.aClass63_13.method2110(local19);
		if (local25 != null) {
			Static50.aClass71_1.method2229(local25);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)J")
	public static long method1122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass79_1 == null ? 0L : local7.aClass79_1.aLong108;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I")
	public static int method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + (arg2 >> 5 << 7) + (arg1 >> 2 << 10);
	}
}
