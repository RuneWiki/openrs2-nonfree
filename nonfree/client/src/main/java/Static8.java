import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_47 = Static121.method2047("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
	public static int[] anIntArray10 = new int[32];

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[I")
	public static int[] anIntArray11 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_48 = aClass60_47;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public static int anInt130 = 0;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!mf;")
	public static Class48 aClass48_5 = new Class48(64);

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_49 = Static121.method2047("nav");

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public static int anInt131 = 0;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!tb;")
	public static Class70 aClass70_2 = new Class70();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method118(@OriginalArg(0) int arg0) {
		if (!Static27.method520(arg0)) {
			return;
		}
		@Pc(14) Class4_Sub17[] local14 = Static82.aClass4_Sub17ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class4_Sub17 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt2251 = 0;
				local27.anInt2207 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Lclient!pc;")
	public static Class4_Sub4_Sub12 method119(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub12 local10 = (Class4_Sub4_Sub12) Static51.aClass48_31.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static39.aClass40_30.method1110(arg0, 5);
		local10 = new Class4_Sub4_Sub12();
		if (local20 != null) {
			local10.method1519(new Class4_Sub13(local20));
		}
		Static51.aClass48_31.method1392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method120() {
		aClass60_49 = null;
		anIntArray11 = null;
		anIntArray12 = null;
		anIntArray10 = null;
		aClass60_47 = null;
		aClass70_2 = null;
		aClass48_5 = null;
		aClass60_48 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B[B)[B")
	public static byte[] method121(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class4_Sub13 local16 = new Class4_Sub13(arg0);
		@Pc(20) int local20 = local16.method1223();
		@Pc(24) int local24 = local16.method1215();
		if (local24 < 0 || Static82.anInt1964 != 0 && local24 > Static82.anInt1964) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(50) byte[] local50 = new byte[local24];
			local16.method1226(local24, local50);
			return local50;
		} else {
			@Pc(62) int local62 = local16.method1215();
			if (local62 < 0 || Static82.anInt1964 != 0 && local62 > Static82.anInt1964) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local62];
			if (local20 == 1) {
				Static12.method214(local76, local62, arg0, local24);
			} else {
				Static128.aClass51_3.method1421(local16, local76);
			}
			return local76;
		}
	}
}
