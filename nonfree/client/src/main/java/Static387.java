import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III[BZILclient!kv;I)Lclient!bo;")
	public static Class44_Sub1_Sub1 method5664(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) Class143_Sub2 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean406 || Static384.method5636(arg3) && Static384.method5636(arg0)) {
			return new Class44_Sub1_Sub1(arg2, 3553, 6406, arg3, arg0, false, arg1, 6406);
		} else if (arg2.aBoolean424) {
			return new Class44_Sub1_Sub1(arg2, 34037, 6406, arg3, arg0, false, arg1, 6406);
		} else {
			return new Class44_Sub1_Sub1(arg2, 6406, arg3, arg0, Static209.method2991(arg3), Static209.method2991(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BIIII)V")
	public static void method5665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static361.anInt6317 <= arg3 && Static651.anInt10267 >= arg3) {
			@Pc(23) int local23 = Static439.method6578(arg0, Static128.anInt2200, Static380.anInt6585);
			@Pc(29) int local29 = Static439.method6578(arg1, Static128.anInt2200, Static380.anInt6585);
			Static4.method47(arg2, local29, local23, arg3);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!ha;Lclient!wq;II)V")
	public static void method5667(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class394 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 7; local5 >= 0; local5--) {
			for (@Pc(8) int local8 = 127; local8 >= 0; local8--) {
				@Pc(25) int local25 = local8 & 0x7F | (local5 & 0x7) << 7 | (arg4 & 0x3F) << 10;
				Static168.method2468(false, true);
				@Pc(33) int local33 = Static6.anIntArray6[local25];
				Static501.method7248(false, true);
				arg1.aa(arg0 + (local8 * arg2.anInt10536 >> 7), (arg2.anInt10532 * (7 - local5) >> 3) + arg3, (arg2.anInt10536 >> 7) + 1, (arg2.anInt10532 >> 3) + 1, local33, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
	public static void method5668(@OriginalArg(1) int arg0) {
		Static312.anInt5545 = arg0;
		Static203.aClass265_16.method6568();
	}
}
