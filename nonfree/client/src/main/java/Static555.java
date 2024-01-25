import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "Lclient!wu;")
	public static Class380 aClass380_125;

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
	public static int anInt9085 = 100;

	@OriginalMember(owner = "client!tp", name = "W", descriptor = "Z")
	public static boolean aBoolean676 = false;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z")
	public static boolean method7621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(FIFIIFFIFILclient!gaa;)[B")
	public static byte[] method7625(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) Class115 arg5) {
		@Pc(20) byte[] local20 = new byte[262144];
		Static590.method8027(arg5, arg4, 0, local20, arg2, arg3, arg1, arg0);
		return local20;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public static void method7632(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static414.aBooleanArray118[arg0]) {
			Static92.aClass380_29.method8611(arg0);
			Static559.aClass261ArrayArray2[arg0] = null;
			Static8.aClass261ArrayArray1[arg0] = null;
			Static414.aBooleanArray118[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIZII)V")
	public static void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static379.anInt5914 && arg4 <= Static624.anInt10032 && Static257.anInt4068 <= arg3 && arg1 <= Static67.anInt1214) {
			Static386.method5163(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static509.method7170(arg1, arg2, arg0, arg4, arg3);
		}
	}
}
