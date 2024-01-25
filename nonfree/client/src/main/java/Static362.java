import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Lclient!gga;")
	public static Class124 aClass124_115;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
	public static int anInt9575;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "Lclient!in;")
	public static final Class169 aClass169_230 = new Class169(87, -2);

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "Lclient!nia;")
	public static final Class248 aClass248_3 = new Class248();

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_92 = new Class341(47, -1);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIZ)I")
	public static int method8403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class12_Sub2.anIntArray203[arg3 * 8192 / arg1] >> 1;
		return (local16 * arg2 >> 16) + ((65536 - local16) * arg0 >> 16);
	}
}
