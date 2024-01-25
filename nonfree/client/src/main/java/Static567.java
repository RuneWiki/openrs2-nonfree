import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt7671;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	public static int anInt7672;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!rt;")
	public static Class6_Sub42 aClass6_Sub42_4;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
	public static final int[] anIntArray540 = new int[16];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZII)Lclient!va;")
	public static Class6_Sub48 method6404(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class6_Sub48 local15 = new Class6_Sub48();
		local15.anInt9207 = arg2;
		local15.anInt9210 = arg0;
		Static459.aClass305_24.method7448((long) arg3, local15);
		Static76.method1689(arg2);
		@Pc(34) Class93 local34 = Static223.method4011(arg3);
		if (local34 != null) {
			Static468.method7221(local34);
		}
		if (Static469.aClass93_15 != null) {
			Static468.method7221(Static469.aClass93_15);
			Static469.aClass93_15 = null;
		}
		Static5.method207();
		if (local34 != null) {
			Static29.method991(local34, !arg1);
		}
		if (!arg1) {
			Static89.method1984(arg2);
		}
		if (!arg1 && Static6.anInt302 != -1) {
			Static417.method6511(Static6.anInt302, 1);
		}
		return local15;
	}
}
