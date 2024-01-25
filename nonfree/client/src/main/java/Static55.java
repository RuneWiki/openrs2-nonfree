import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public static int anInt999;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public static int anInt1001;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
	public static final int[] anIntArray86 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method941(@OriginalArg(0) int arg0) {
		@Pc(16) Class10_Sub1_Sub17 local16 = Static154.method2630(5, arg0);
		local16.method5346();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)Z")
	public static boolean method942(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
