import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Lclient!uq;")
	public static Class362 aClass362_99;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_117 = new Class171(101, -1);

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_118 = new Class171(14, 2);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(FIIIZIII)[I")
	public static int[] method6046(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(15) Class3_Sub8_Sub19 local15 = new Class3_Sub8_Sub19();
		local15.anInt6931 = (int) (arg0 * 4096.0F);
		local15.aBoolean487 = true;
		local15.anInt6939 = 8;
		local15.anInt6932 = 4;
		local15.anInt6941 = 8;
		local15.anInt6938 = 35;
		local15.method8780();
		Static565.method7440(2048, 1);
		local15.method5879(0, local6);
		return local6;
	}
}
