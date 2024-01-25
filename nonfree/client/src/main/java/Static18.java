import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!ui;")
	public static Class295 aClass295_4;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public static int anInt348;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!an", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[6][];

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString9 = null;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZIBIILjava/lang/String;Ljava/lang/String;JZI)V")
	public static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static238.aBoolean354 && Static197.anInt4015 < 500) {
			@Pc(17) int local17 = arg3 == -1 ? Static245.anInt4711 : arg3;
			@Pc(31) Class1_Sub25 local31 = new Class1_Sub25(arg6, arg5, local17, arg0, arg9, arg7, arg4, arg2, arg1, arg8);
			Static105.aClass295_10.method7533(local31);
			Static197.anInt4015++;
		}
	}
}
