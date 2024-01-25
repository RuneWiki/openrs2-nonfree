import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!kh;")
	public static Class54 aClass54_13;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!jf;")
	public static Class96 aClass96_15 = null;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	public static int anInt4543 = -1;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	public static int anInt4546 = -1;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public static int anInt4547 = 0;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
	public static final int[] anIntArray330 = new int[50];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class103 local13 = local7.aClass103_1; local13 != null; local13 = local13.aClass103_2) {
			@Pc(17) Class25_Sub1 local17 = local13.aClass25_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort76 == arg1 && local17.aShort75 == arg2) {
				Static24.method1833(local17);
				return;
			}
		}
	}
}
