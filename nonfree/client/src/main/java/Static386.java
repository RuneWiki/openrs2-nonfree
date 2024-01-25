import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_61 = new Class307(5);

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	public static final int[] anIntArray438 = new int[4096];

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_8 = new Class390(0, 1);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZZI)V")
	public static void method5212(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub38 local10 = Static14.method503(arg0, arg1);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray410.length; local23++) {
				local10.anIntArray410[local23] = -1;
				local10.anIntArray411[local23] = 0;
			}
		}
	}
}
