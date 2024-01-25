import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public static int anInt81;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Z")
	public static boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt83 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
	public static boolean method108() {
		@Pc(10) Class6_Sub29 local10 = (Class6_Sub29) Static403.aClass362_34.method8538();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt4677; local24++) {
			if (local10.aClass103Array2[local24] != null && local10.aClass103Array2[local24].anInt2541 == 0) {
				return false;
			}
			if (local10.aClass103Array1[local24] != null && local10.aClass103Array1[local24].anInt2541 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lclient!iaa;")
	public static Class6_Sub26 method111() {
		@Pc(11) Class6_Sub26 local11 = Static375.method5345();
		local11.aClass289_57 = null;
		local11.anInt3956 = 0;
		local11.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(5000);
		return local11;
	}
}
