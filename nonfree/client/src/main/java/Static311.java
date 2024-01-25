import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!jma", name = "e", descriptor = "Z")
	public static final boolean aBoolean455 = false;

	@OriginalMember(owner = "client!jma", name = "g", descriptor = "[I")
	public static final int[] anIntArray312 = new int[32];

	@OriginalMember(owner = "client!jma", name = "d", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_8 = new Class225(0, 2, 2, 1);

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "(Z)I")
	public static int method4684() {
		return Static664.anInt10591;
	}

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "(III)V")
	public static void method4687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub4_Sub2 local15 = Static502.method7211(15, 0L);
		local15.method630();
		local15.anInt805 = arg0;
		local15.anInt803 = arg1;
	}
}
