import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!ug;")
	public static Class43 aClass43_28;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!nca;")
	public static Class254 aClass254_156;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_26 = new Class197(12, 0, 1, 0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!tw;B)I")
	public static int method8450(@OriginalArg(0) Class2_Sub20_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method8608(2);
		@Pc(24) int local24;
		if (local10 == 0) {
			local24 = 0;
		} else if (local10 == 1) {
			local24 = arg0.method8608(5);
		} else if (local10 == 2) {
			local24 = arg0.method8608(8);
		} else {
			local24 = arg0.method8608(11);
		}
		return local24;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IJBI)V")
	public static void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static633.method8625(local10, 0, arg2, 0, 0, arg0, true, local17);
			return;
		}
		@Pc(65) Class81 local65 = Static148.aClass153_3.method3342(local24);
		@Pc(77) int local77;
		@Pc(80) int local80;
		if (local17 == 0 || local17 == 2) {
			local77 = local65.anInt1902;
			local80 = local65.anInt1881;
		} else {
			local80 = local65.anInt1902;
			local77 = local65.anInt1881;
		}
		@Pc(91) int local91 = local65.anInt1866;
		if (local17 != 0) {
			local91 = (local91 << local17 & 0xF) + (local91 >> 4 - local17);
		}
		Static633.method8625(0, local77, arg2, local91, local80, arg0, true, 0);
	}
}
