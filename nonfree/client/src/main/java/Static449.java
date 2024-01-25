import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "[I")
	public static final int[] anIntArray742 = new int[100];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILclient!lt;)I")
	public static int method5990(@OriginalArg(2) Class159 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ph;IIZIII)V")
	public static void method5991(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		Static285.aClass187_87 = arg0;
		Static345.anInt5874 = arg1;
		Static300.aBoolean350 = false;
		Static212.anInt4104 = arg3;
		Static398.anInt6739 = 0;
		Static152.anInt3124 = 1;
		Static124.anInt2565 = Static114.aClass10_Sub7_Sub4_1.method4854() / arg2;
		if (Static124.anInt2565 < 1) {
			Static124.anInt2565 = 1;
		}
	}
}
