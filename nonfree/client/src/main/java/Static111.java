import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Lclient!vc;")
	public static Class63 aClass63_3;

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!co;")
	public static final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!gk", name = "J", descriptor = "Lclient!kk;")
	public static final Class2_Sub16 aClass2_Sub16_3 = new Class2_Sub16(new byte[5000]);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLclient!ae;)I")
	public static int method2289(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		if (!Static45.method784(arg1).method634(arg0) && arg1.anObjectArray27 == null) {
			return -1;
		} else if (arg1.anIntArray34 == null || arg0 >= arg1.anIntArray34.length) {
			return -1;
		} else {
			return arg1.anIntArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I")
	public static int method2291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static96.aByteArrayArrayArray8[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static96.aByteArrayArrayArray8[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
