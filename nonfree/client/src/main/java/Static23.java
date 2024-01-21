import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public static int anInt663;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_7;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!qc;")
	private static Class60 aClass60_246 = Static121.method2047("Connection lost");

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_245 = aClass60_246;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!qc;")
	private static Class60 aClass60_254 = Static121.method2047("glow2:");

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_247 = aClass60_254;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_248 = Static121.method2047("<img=1>");

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public static int anInt664 = -1;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!qc;")
	public static Class60 aClass60_249 = Static121.method2047("");

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "Lclient!qc;")
	private static Class60 aClass60_253 = Static121.method2047("shake:");

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_250 = aClass60_253;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_251 = aClass60_254;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Lclient!qc;")
	public static Class60 aClass60_252 = Static121.method2047("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_2 = null;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Z")
	public static volatile boolean aBoolean20 = true;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "Lclient!qc;")
	private static Class60 aClass60_255 = Static121.method2047(" has logged out)3");

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Lclient!qc;")
	public static Class60 aClass60_256 = aClass60_253;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "[I")
	public static int[] anIntArray45 = new int[4000];

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_257 = aClass60_255;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method457() {
		aClass60_249 = null;
		aClass60_250 = null;
		aClass60_248 = null;
		aClass4_Sub17_2 = null;
		aClass60_245 = null;
		aClass60_256 = null;
		aClass60_255 = null;
		anIntArray44 = null;
		aClass60_251 = null;
		aClass60_253 = null;
		aClass60_254 = null;
		anIntArray45 = null;
		aClass60_257 = null;
		aClass40_Sub1_7 = null;
		aClass60_247 = null;
		aClass60_246 = null;
		aClass60_252 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class4_Sub4_Sub6 method458(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub4_Sub6 local12 = (Class4_Sub4_Sub6) Static51.aClass48_30.method1390((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static72.aClass40_Sub1_11.method1110(0, arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(28) int local28 = 0;
		local12 = new Class4_Sub4_Sub6();
		@Pc(37) Class4_Sub13 local37 = new Class4_Sub13(local22);
		local37.anInt1643 = local37.aByteArray68.length - 12;
		@Pc(48) int local48 = local37.method1215();
		local12.anInt1195 = local37.method1244();
		local12.anInt1197 = local37.method1244();
		local12.anInt1192 = local37.method1244();
		local12.anInt1205 = local37.method1244();
		local37.anInt1643 = 0;
		local12.aClass60_472 = local37.method1222();
		local12.anIntArray114 = new int[local48];
		local12.aClass60Array8 = new Class60[local48];
		local12.anIntArray113 = new int[local48];
		while (local37.anInt1643 < local37.aByteArray68.length - 12) {
			@Pc(94) int local94 = local37.method1244();
			if (local94 == 3) {
				local12.aClass60Array8[local28] = local37.method1249();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray114[local28] = local37.method1223();
			} else {
				local12.anIntArray114[local28] = local37.method1215();
			}
			local12.anIntArray113[local28++] = local94;
		}
		Static51.aClass48_30.method1392(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZI)Lclient!q;")
	public static Class4_Sub17 method459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub17 local8 = Static16.method283(arg0);
		if (arg1 == -1) {
			return local8;
		} else if (local8 == null || local8.aClass4_Sub17Array3 == null || arg1 >= local8.aClass4_Sub17Array3.length) {
			return null;
		} else {
			return local8.aClass4_Sub17Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I")
	public static int method460(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCE) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public static void method461() {
		for (@Pc(15) Class4_Sub4_Sub1_Sub1 local15 = (Class4_Sub4_Sub1_Sub1) Static127.aClass70_18.method1939(); local15 != null; local15 = (Class4_Sub4_Sub1_Sub1) Static127.aClass70_18.method1936()) {
			if (local15.anInt230 != Static129.anInt3003 || local15.aBoolean7) {
				local15.method2124();
			} else if (Static81.anInt1944 >= local15.anInt227) {
				local15.method196(Static15.anInt2962);
				if (local15.aBoolean7) {
					local15.method2124();
				} else {
					Static7.aClass28_3.method774(local15.anInt230, local15.anInt237, local15.anInt243, local15.anInt236, 60, local15, 0, -1, false);
				}
			}
		}
	}
}
