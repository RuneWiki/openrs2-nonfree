import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
	public static int anInt8569;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_45 = new Class279(4);

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
	public static final int[] anIntArray550 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "F")
	public static float aFloat185 = 0.0F;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_43 = new Class62(16);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z")
	public static boolean method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static122.method2192(arg1, arg0) | (arg0 & 0x800) != 0 || Static460.method6619(arg0, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Lclient!ni;")
	public static Class247 method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static332.aClass247ArrayArrayArray1[0][arg1][arg2] != null && Static332.aClass247ArrayArrayArray1[0][arg1][arg2].aClass247_1 != null;
			if (local28 && arg0 >= Static373.anInt6613 - 1) {
				return null;
			}
			Static371.method5493(arg0, arg1, arg2);
		}
		return Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
	}
}
