import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	public static int anInt5861;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!qi;")
	public static Class19 aClass19_3;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!dp;")
	public static Class53 aClass53_144;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_10 = new Class31(64);

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	public static int anInt5862 = 0;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString271 = "Please wait...";

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "J")
	public static long aLong196 = 0L;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "[S")
	public static final short[] aShortArray112 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BD)V")
	public static void method5302(@OriginalArg(1) double arg0) {
		if (arg0 == Static252.aDouble9) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static226.anIntArray482[local12] = local24 > 255 ? 255 : local24;
		}
		Static252.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ec;I)Ljava/lang/String;")
	public static String method5305(@OriginalArg(1) Class6_Sub10 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4017();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local7];
			arg0.anInt4188 += Static310.aClass190_1.method5110(local7, 0, arg0.aByteArray67, local24, arg0.anInt4188);
			return Static322.method4786(local7, local24, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method5306() {
		if (Static30.aBoolean40) {
			return;
		}
		if (Static317.aBoolean395) {
			Static117.aFloat58 = (int) Static117.aFloat58 - 65 & 0xFFFFFF80;
		} else {
			Static265.aFloat76 += (-24.0F - Static265.aFloat76) / 2.0F;
		}
		Static30.aBoolean40 = true;
		Static211.aBoolean291 = true;
	}
}
