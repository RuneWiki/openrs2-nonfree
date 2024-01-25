import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "B")
	public static byte aByte41;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_85 = new Class205(21, 3);

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	public static int anInt3866 = 2;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZII)I")
	public static int method3563(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub1 local8 = Static72.method4067(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray14.length) {
			return local8.anIntArray14[arg0];
		} else {
			return -1;
		}
	}
}
