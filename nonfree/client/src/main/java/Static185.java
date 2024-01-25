import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!wh;")
	public static Class261 aClass261_1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIIIF)[I")
	public static int[] method3113(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub4_Sub26 local10 = new Class3_Sub4_Sub26();
		local10.anInt5535 = 8;
		local10.aBoolean405 = true;
		local10.anInt5536 = 4;
		local10.anInt5540 = 8;
		local10.anInt5547 = 35;
		local10.anInt5548 = (int) (arg0 * 4096.0F);
		local10.method5963();
		Static287.method4200(1, 2048);
		local10.method4476(0, local6);
		return local6;
	}
}
