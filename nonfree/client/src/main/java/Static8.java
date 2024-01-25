import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!uu;")
	public static Class250 aClass250_2;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!la;")
	public static final Class136 aClass136_1 = new Class136(99, -1);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(FIIIIIIZI)[[I")
	public static int[][] method94(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(18) Class3_Sub4_Sub32 local18 = new Class3_Sub4_Sub32();
		local18.anInt5855 = 3;
		local18.anInt5851 = 8;
		local18.anInt5858 = (int) (arg0 * 4096.0F);
		local18.aBoolean411 = false;
		local18.anInt5857 = 4;
		local18.method6146();
		Static110.method1806(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method4858(local45, local9[local45]);
		}
		return local9;
	}
}
