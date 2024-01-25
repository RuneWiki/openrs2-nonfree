import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!oj;")
	public static Class240 aClass240_2;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
	public static int[] anIntArray267 = new int[1];

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)V")
	public static void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(4, arg0);
		local8.method7326();
		local8.anInt8802 = arg1;
		local8.anInt8806 = arg2;
		local8.anInt8798 = arg3;
	}
}
