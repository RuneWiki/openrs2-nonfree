import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!la;")
	public static Class207 aClass207_2;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "[I")
	public static final int[] anIntArray2 = new int[8];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ[B)I")
	public static int method102(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static71.method1207(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)V")
	public static void method103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(12, arg0);
		local8.method8958();
		local8.anInt10530 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
	public static boolean method104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
