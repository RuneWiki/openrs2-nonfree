import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!vo;")
	public static Class348 aClass348_12;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_11 = new Class90(113, 4);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_6 = new Class344(40, 16);

	@OriginalMember(owner = "client!b", name = "j", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!d;)I")
	public static int method904(@OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) Class51 local8 = arg0.aClass51_1;
		if (local8.anIntArray61 != null) {
			local8 = local8.method1371(Static523.aClass173_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt1610;
		@Pc(32) Class252 local32 = arg0.method3322();
		if (arg0.anInt4254 == -1 || arg0.aBoolean294) {
			local23 = local8.anInt1598;
		} else if (local32.anInt7486 == arg0.anInt4254 || local32.anInt7504 == arg0.anInt4254 || local32.anInt7518 == arg0.anInt4254 || arg0.anInt4254 == local32.anInt7511) {
			local23 = local8.anInt1605;
		} else if (local32.anInt7478 == arg0.anInt4254 || local32.anInt7484 == arg0.anInt4254 || local32.anInt7516 == arg0.anInt4254 || arg0.anInt4254 == local32.anInt7492) {
			local23 = local8.anInt1609;
		}
		return local23;
	}
}
