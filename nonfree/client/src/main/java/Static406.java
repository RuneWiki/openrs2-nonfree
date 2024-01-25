import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public static int anInt9843;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!jo;")
	public static Class168 aClass168_127;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public static int anInt9845;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt9841 = 0;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_73 = new Class245(4);

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public static int anInt9844 = -1;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)V")
	public static void method8178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static21.method864(0, 0, arg1, local17, 0, local10, arg0, true);
			return;
		}
		@Pc(60) Class31 local60 = Static480.aClass57_11.method1469(local32);
		@Pc(68) int local68;
		@Pc(71) int local71;
		if (local17 == 0 || local17 == 2) {
			local71 = local60.anInt1058;
			local68 = local60.anInt1109;
		} else {
			local68 = local60.anInt1058;
			local71 = local60.anInt1109;
		}
		@Pc(82) int local82 = local60.anInt1095;
		if (local17 != 0) {
			local82 = (local82 << local17 & 0xF) + (local82 >> 4 - local17);
		}
		Static21.method864(local68, local71, arg1, 0, local82, 0, arg0, true);
	}
}
