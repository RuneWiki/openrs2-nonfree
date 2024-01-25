import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!al;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BI[S)[S")
	public static short[] method1330(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static589.method5378(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BILclient!lt;)V")
	public static void method1331(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26_Sub2 arg1) {
		Static548.aBoolean699 = false;
		Static534.anInt9243 = 0;
		Static570.method8039(arg1);
		Static455.method7057(arg1);
		if (Static548.aBoolean699) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt5769) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt5769 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z")
	public static boolean method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
