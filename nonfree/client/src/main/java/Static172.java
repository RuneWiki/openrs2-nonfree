import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "Lclient!dq;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!iu", name = "G", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_70 = new Class265(11, -1);

	@OriginalMember(owner = "client!iu", name = "L", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_76 = new Class209("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!iu", name = "O", descriptor = "[I")
	public static final int[] anIntArray305 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!iu", name = "P", descriptor = "S")
	public static short aShort43 = 32767;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(II)I")
	public static int method2801(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIZJLjava/lang/String;ILjava/lang/String;IIZI)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static123.aBoolean212 && Static373.anInt4900 < 500) {
			@Pc(21) int local21 = arg1 == -1 ? Static54.anInt1162 : arg1;
			@Pc(35) Class2_Sub22 local35 = new Class2_Sub22(arg4, arg6, local21, arg0, arg7, arg3, arg5, arg9, arg2, arg8);
			Static248.aClass14_35.method300(local35);
			Static373.anInt4900++;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method2803(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static450.aBoolean486) {
			try {
				@Pc(25) Class13 local25 = (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
				local25.method264(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static450.aBoolean486 = true;
			}
		}
		return arg0;
	}
}
