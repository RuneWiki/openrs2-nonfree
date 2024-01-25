import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	public static void method7542(@OriginalArg(0) boolean arg0) {
		Static67.method1356(Static240.anInt4852, Static468.anInt8036, Static196.anInt4059, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)I")
	public static int method7544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static445.anIntArray556[arg0 & 0x3] : 256;
	}
}
