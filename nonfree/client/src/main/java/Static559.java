import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
	public static int anInt9106;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Lclient!pa;")
	public static final Class249 aClass249_24 = new Class249();

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
	public static int anInt9109 = -1;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V")
	public static void method7529(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub18 local14 = Static543.method7218(9, arg0);
		local14.method7329();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZI)Z")
	public static boolean method7530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!du;)V")
	public static void method7531(@OriginalArg(1) Class75 arg0) {
		Static69.aClass75_1 = arg0;
	}
}
