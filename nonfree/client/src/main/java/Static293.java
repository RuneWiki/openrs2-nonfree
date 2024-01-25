import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!jt", name = "P", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_85 = new Class216(56, -1);

	@OriginalMember(owner = "client!jt", name = "Z", descriptor = "I")
	public static int anInt4644 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIFIZIII)[[I")
	public static int[][] method4167(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub2_Sub35 local13 = new Class4_Sub2_Sub35();
		local13.anInt9820 = 3;
		local13.anInt9828 = 4;
		local13.anInt9825 = (int) (arg0 * 4096.0F);
		local13.anInt9818 = 4;
		local13.aBoolean766 = false;
		local13.method8769();
		Static592.method7785(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method8411(local45, local9[local45]);
		}
		return local9;
	}
}
