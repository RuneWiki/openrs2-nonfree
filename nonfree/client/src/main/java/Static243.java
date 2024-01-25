import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "Lclient!sl;")
	public static final Class310 aClass310_16 = new Class310(64);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(FIIIIIZB)[I")
	public static int[] method4016(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub1_Sub26 local10 = new Class3_Sub1_Sub26();
		local10.aBoolean479 = true;
		local10.anInt5931 = 8;
		local10.anInt5925 = (int) (arg0 * 4096.0F);
		local10.anInt5919 = 4;
		local10.anInt5928 = 8;
		local10.anInt5930 = 35;
		local10.method7763();
		Static296.method4706(1, 2048);
		local10.method5121(0, local6);
		return local6;
	}
}
