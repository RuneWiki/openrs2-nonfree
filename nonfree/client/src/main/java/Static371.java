import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static371 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	public static int anInt6170;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!gq;")
	public static Class6_Sub5_Sub2 aClass6_Sub5_Sub2_2;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[I")
	public static final int[] anIntArray541 = new int[14];

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public static int anInt6171 = 0;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt6173 = 0;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_100 = new Class231("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "J")
	public static long aLong181 = 0L;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)Z")
	public static boolean method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static289.method4312(arg1, arg0) | Static324.method4598(arg0, arg1) | Static192.method3032(arg1, arg0)) & Static269.method4104(arg1, arg0);
	}
}
