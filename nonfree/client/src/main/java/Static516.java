import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public static int anInt8591;

	@OriginalMember(owner = "client!rk", name = "B", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "[Lclient!is;")
	public static final Class5_Sub3_Sub9[] aClass5_Sub3_Sub9Array4 = new Class5_Sub3_Sub9[14];

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!qt;")
	public static final Class294 aClass294_10 = new Class294();

	@OriginalMember(owner = "client!rk", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!uaa;IIILclient!ha;)V")
	public static void method7315(@OriginalArg(1) Class345 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class65 arg4) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(7) int local7 = 127; local7 >= 0; local7--) {
				@Pc(25) int local25 = local7 & 0x7F | (local3 & 0x7) << 7 | (arg3 & 0x3F) << 10;
				Static238.method3722(true, false);
				@Pc(35) int local35 = Static336.anIntArray357[local25];
				Static358.method5409(true, false);
				arg4.aa((arg0.anInt9649 * local7 >> 7) + arg1, ((7 - local3) * arg0.anInt9606 >> 3) + arg2, (arg0.anInt9649 >> 7) + 1, (arg0.anInt9606 >> 3) - -1, local35, 0);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[BB)[B")
	public static byte[] method7317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static686.method4972(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
