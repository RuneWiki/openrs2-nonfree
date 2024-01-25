import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2918(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vo;BLclient!ha;)V")
	public static void method2919(@OriginalArg(0) Class381 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(38) boolean local38 = Static149.aClass244_1.method5959(arg0.anInt10149, arg0.anInt10160, arg0.anInt10090 | 0xFF000000, arg0.anInt10083, arg0.aBoolean747 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null, arg0.anInt10140, arg1) == null;
		if (local38) {
			Static107.aClass340_16.method8131(new Class6_Sub45(arg0.anInt10149, arg0.anInt10160, arg0.anInt10140, arg0.anInt10090 | 0xFF000000, arg0.anInt10083, arg0.aBoolean747));
			Static168.method3312(arg0);
		}
	}
}
