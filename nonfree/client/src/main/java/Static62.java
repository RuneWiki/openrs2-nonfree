import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!mca;")
	public static Class43 aClass43_7;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!kea;")
	public static Class161 aClass161_105;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "J")
	public static long aLong265 = -1L;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "F")
	public static float aFloat251 = 1.0F;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V")
	public static void method7107(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static232.aByteArrayArrayArray18 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z")
	public static boolean method7109(@OriginalArg(0) int arg0) {
		if (Static57.aBooleanArray6[arg0]) {
			return true;
		} else if (Static337.aClass161_70.method4269(arg0)) {
			@Pc(23) int local23 = Static337.aClass161_70.method4266(arg0);
			if (local23 == 0) {
				Static57.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static459.aClass245ArrayArray2[arg0] == null) {
				Static459.aClass245ArrayArray2[arg0] = new Class245[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static459.aClass245ArrayArray2[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static337.aClass161_70.method4243(local45, arg0);
					if (local59 != null) {
						@Pc(71) Class245 local71 = Static459.aClass245ArrayArray2[arg0][local45] = new Class245();
						local71.anInt7256 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method6011(new Class3_Sub27(local59));
					}
				}
			}
			Static57.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
