import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static506 {

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!td;")
	public static Class3_Sub5_Sub18 aClass3_Sub5_Sub18_6;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!fga;")
	public static final Class115 aClass115_4 = new Class115();

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "[Lclient!cm;")
	public static final Class34_Sub1_Sub1_Sub2_Sub1[] aClass34_Sub1_Sub1_Sub2_Sub1Array1 = new Class34_Sub1_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIB)Z")
	public static boolean method6604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static408.method5610(arg0, arg1)) {
			return Static505.method6600(arg1, arg0) | (arg1 & 0xB000) != 0 | Static226.method3387(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static382.method5376(arg1, arg0) | Static452.method6107(arg1, arg0));
		} else {
			return false;
		}
	}
}
