import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!rq;")
	public static Class208 aClass208_1;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static int anInt7011;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
	public static int anInt7014;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[B")
	public static final byte[] aByteArray102 = new byte[16384];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
	public static boolean method5437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method5438(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static340.anIntArray411[local7] = Static340.anIntArray411[local7 - 1];
			Static3.anIntArray267[local7] = Static3.anIntArray267[local7 - 1];
			Static353.aStringArray32[local7] = Static353.aStringArray32[local7 - 1];
			Static122.aStringArray9[local7] = Static122.aStringArray9[local7 - 1];
			Static15.aStringArray2[local7] = Static15.aStringArray2[local7 - 1];
			Static200.aStringArray15[local7] = Static200.aStringArray15[local7 - 1];
			Static227.anIntArray294[local7] = Static227.anIntArray294[local7 - 1];
		}
		Static340.anIntArray411[0] = arg6;
		Static353.aStringArray32[0] = arg5;
		Static3.anIntArray267[0] = arg4;
		Static122.aStringArray9[0] = arg1;
		Static15.aStringArray2[0] = arg2;
		Static401.anInt6639++;
		Static296.anInt5303 = Static325.anInt5640;
		Static200.aStringArray15[0] = arg3;
		Static227.anIntArray294[0] = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method5439(@OriginalArg(0) int arg0) {
		if (!Static112.method2034(arg0)) {
			return;
		}
		@Pc(14) Class247[] local14 = Static297.aClass247ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class247 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt6783 = 1;
				local22.anInt6829 = 0;
				local22.anInt6815 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Z")
	public static boolean method5440() {
		return Static69.aBoolean292;
	}
}
