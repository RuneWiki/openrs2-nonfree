import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
	public static int anInt3864;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!im;")
	public static final Class140 aClass140_64 = new Class140(90, 7);

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	public static int anInt3862 = -1;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIII)V")
	public static void method3412(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(18) Class72_Sub8 local18 = (Class72_Sub8) Static265.aClass299_4.method7030(); local18 != null; local18 = (Class72_Sub8) Static265.aClass299_4.method7031()) {
			if (Static436.anInt6850 >= local18.anInt7656) {
				local18.method6719();
			} else {
				Static381.method5836(arg0 >> 1, local18.anInt7659 * 2, local18.anInt7657, (local18.anInt7660 << 9) + 256, arg1 >> 1, (local18.anInt7655 << 9) + 256);
				Static296.aClass67_9.method7489(local18.anInt7661 | 0xFF000000, 0, Static393.anIntArray684[1] + arg3, arg2 - -Static393.anIntArray684[0], local18.aString70);
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	public static boolean method3413(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub24 local15 = (Class1_Sub24) Static248.aClass37_30.method977(); local15 != null; local15 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			if (Static295.method4713(local15.anInt3161) && local15.aLong150 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
