import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	public static int anInt5421;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "[Lclient!ya;")
	public static Class162[] aClass162Array2;

	@OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
	public static int anInt5426;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_48 = new Class132(8);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBI)Z")
	public static boolean method4289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I")
	public static int method4290(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(CI)Z")
	public static boolean method4291(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!nf;B)I")
	public static int method4295(@OriginalArg(0) Class2_Sub13_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method3615(2);
		@Pc(25) int local25;
		if (local10 == 0) {
			local25 = 0;
		} else if (local10 == 1) {
			local25 = arg0.method3615(5);
		} else if (local10 == 2) {
			local25 = arg0.method3615(8);
		} else {
			local25 = arg0.method3615(11);
		}
		return local25;
	}
}
