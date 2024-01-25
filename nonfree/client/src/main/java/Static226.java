import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array5;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_36 = new Class245(50);

	@OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
	public static final int[] anIntArray304 = new int[14];

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_30 = new Class211();

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
	public static final int[] anIntArray305 = new int[32];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!jo;Lclient!jo;Lclient!jo;Lclient!jo;I)V")
	public static void method4054(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		Static313.aClass168_109 = arg3;
		Static94.aClass168_26 = arg0;
		Static215.aClass168_54 = arg2;
		Static217.aClass168_44 = arg1;
		Static336.aClass93ArrayArray2 = new Class93[Static313.aClass168_109.method4456()][];
		Static87.aBooleanArray7 = new boolean[Static313.aClass168_109.method4456()];
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Z")
	public static boolean method4055(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static454.aCharArray8[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZ)V")
	public static void method4056(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		Static6.method506(true, -1, arg1, arg2, arg3, arg0);
	}
}
