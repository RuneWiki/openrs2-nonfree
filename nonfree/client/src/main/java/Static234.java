import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39 = new String[200];

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "[C")
	public static char[] aCharArray6 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public static int anInt4914 = 0;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString345 = "Take";

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "I")
	public static int anInt4944 = -1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)I")
	public static int method3704() {
		return Static77.aBoolean122 && Static23.aBooleanArray3[81] && Static181.anInt3973 > 2 ? Static144.anIntArray304[Static181.anInt3973 - 2] : Static144.anIntArray304[Static181.anInt3973 - 1];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)Lclient!qf;")
	public static Class139 method3708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(37) long local37 = (long) arg3 & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 16 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg2 & 0xFFFFL) << 48;
		@Pc(43) Class139 local43 = (Class139) Static215.aClass89_33.method2268(local37);
		if (local43 != null) {
			return local43;
		}
		@Pc(50) Class144[] local50 = null;
		@Pc(54) Class154 local54 = Static71.method1241(arg3);
		if (local54.anIntArray466 != null) {
			local50 = new Class144[local54.anIntArray466.length];
			for (@Pc(65) int local65 = 0; local65 < local50.length; local65++) {
				@Pc(80) Class87 local80 = Static297.method4543(local54.anIntArray466[local65]);
				local50[local65] = new Class144(local80.anInt2731, local80.anInt2725, local80.anInt2729, local80.anInt2730, local80.anInt2723, local80.anInt2728, local80.anInt2724, local80.aBoolean170);
			}
		}
		local43 = new Class139(local54.anInt5029, local50, local54.anInt5025, arg2, arg1, arg0);
		Static215.aClass89_33.method2272(local37, local43);
		return local43;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3710(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static78.aClass24_1);
		arg0.removeFocusListener(Static78.aClass24_1);
		Static299.anInt5939 = -1;
	}
}
