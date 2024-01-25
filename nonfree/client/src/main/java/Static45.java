import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
	public static int anInt1048;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "[I")
	public static final int[] anIntArray143 = new int[32];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method977(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Z")
	public static boolean method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static190.method3581(arg0, arg1) || Static490.method7167(arg0, arg1);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!kea;IB)Lclient!ko;")
	public static Class3_Sub26 method980(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method4265(arg1);
		return local8 == null ? null : new Class3_Sub26(local8);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)Lclient!eba;")
	public static Class68_Sub1 method983(@OriginalArg(1) int arg0) {
		return Static276.aBoolean366 && arg0 >= Static32.anInt850 && Static205.anInt4555 >= arg0 ? Static246.aClass68_Sub1Array1[arg0 - Static32.anInt850] : null;
	}
}
