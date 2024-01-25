import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public static int anInt6686;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	public static int anInt6687 = 0;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
	public static int anInt6690 = 999999;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
	public static int method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static184.aShortArrayArray3 == null ? 0 : Static184.aShortArrayArray3[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!kda;I)Lclient!ce;")
	public static Class1_Sub8 method5787(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(13) byte[] local13 = arg1.method4216(arg0);
		return local13 == null ? null : new Class1_Sub8(local13);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5788(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(5) Class1_Sub37 local5 = null;
		for (@Pc(14) Class1_Sub37 local14 = (Class1_Sub37) Static500.aClass38_71.method1419(); local14 != null; local14 = (Class1_Sub37) Static500.aClass38_71.method1415()) {
			if (arg3 == local14.anInt6619 && arg4 == local14.anInt6624 && local14.anInt6615 == arg0 && arg5 == local14.anInt6621) {
				local5 = local14;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class1_Sub37();
			local5.anInt6615 = arg0;
			local5.anInt6621 = arg5;
			local5.anInt6624 = arg4;
			local5.anInt6619 = arg3;
			if (arg4 >= 0 && arg0 >= 0 && arg4 < Static542.anInt9387 && Static36.anInt1324 > arg0) {
				Static381.method7904(local5);
			}
			Static500.aClass38_71.method1426(local5);
		}
		local5.anInt6620 = -1;
		local5.anInt6614 = arg1;
		local5.anInt6612 = arg2;
		local5.anInt6625 = arg6;
		local5.anInt6623 = 0;
	}
}
