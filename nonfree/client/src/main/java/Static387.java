import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
	public static int anInt7348;

	@OriginalMember(owner = "client!ps", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ps", name = "S", descriptor = "Lclient!ha;")
	public static Class84 aClass84_18;

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_9 = new Class98("", 16);

	@OriginalMember(owner = "client!ps", name = "P", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_66 = new Class77(33, 4);

	@OriginalMember(owner = "client!ps", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
	public static int anInt7356 = 0;

	@OriginalMember(owner = "client!ps", name = "U", descriptor = "Z")
	public static boolean aBoolean531 = true;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIII)V")
	public static void method6120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static208.aClass12_Sub10_Sub1_1.anInt2227 * arg1 >> 8;
		if (local6 != 0 && arg0 != -1) {
			Static535.method7885(arg0, local6, Static207.aClass16_53);
			Static542.aBoolean685 = true;
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Z")
	public static boolean method6121() {
		if (Static48.aBoolean51) {
			try {
				Static549.method683(Static375.aClass71_3.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
	public static void method6122(@OriginalArg(0) int arg0) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(11, arg0);
		local8.method823();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lclient!ld;")
	public static Class184 method6124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class184 local7 = new Class184();
		local7.anInt5438 = arg0 + 1 + 5;
		local7.anInt5447 = arg1 + 5 + 1;
		local7.anInt5440 = -1;
		local7.anInt5439 = -1;
		local7.anIntArrayArray51 = new int[local7.anInt5447][local7.anInt5438];
		local7.method4591();
		return local7;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIB)V")
	public static void method6125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = Static208.aClass12_Sub10_Sub1_1.anInt2227 * arg1 >> 8;
		if (arg2 == -1 && !Static542.aBoolean685) {
			Static208.method3861();
		} else if (arg2 != -1 && (Static471.anInt8643 != arg2 || !Static494.method7351()) && local10 != 0 && !Static542.aBoolean685) {
			Static107.method2242(arg0, local10, arg2, Static250.aClass16_67);
		}
		Static471.anInt8643 = arg2;
	}
}
