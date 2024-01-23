import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array12;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public static int anInt5185 = 0;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public static void method4120() {
		aClass4_Sub2_Sub1Array12 = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lclient!wl;")
	public static Class4_Sub2_Sub21 method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class4_Sub2_Sub21 local15 = (Class4_Sub2_Sub21) Static281.aClass97_24.method2360((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class4_Sub2_Sub21(arg1, arg0);
			Static281.aClass97_24.method2364(local15, local15.aLong200);
		}
		return local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(CII)I")
	public static int method4122(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local15 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local15 = 1762;
		}
		return local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	public static int method4123() {
		if (Static192.aClass9_2 == null) {
			return -1;
		}
		while (Static17.anInt367 < Static192.aClass9_2.anInt203) {
			if (Static192.aClass9_2.method174(Static17.anInt367)) {
				return Static17.anInt367++;
			}
			Static17.anInt367++;
		}
		return -1;
	}
}
