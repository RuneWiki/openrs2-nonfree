import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "Lclient!eha;")
	public static Class97 aClass97_13;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "[S")
	private static final short[] aShortArray115 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_181 = new Class200(112, -1);

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "[S")
	private static final short[] aShortArray116 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "[S")
	private static final short[] aShortArray117 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray12 = new short[][] { aShortArray116, aShortArray117, aShortArray115 };

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public static int anInt7772 = 0;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_11 = new Class117(0, 2, 2, 1);

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "[Lclient!ot;")
	public static final Class2_Sub32[] aClass2_Sub32Array1 = new Class2_Sub32[1024];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method6802() {
		Static137.method2510(-1, 255);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	public static void method6803() {
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0 && Static531.anInt8550 != Static245.anInt4753) {
			Static183.method3129(false, Static470.anInt7589, 11, Static456.anInt7439);
		} else {
			Static183.method3126(Static141.aClass13_27);
			if (Static419.anInt7337 != Static531.anInt8550) {
				Static196.method3388();
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6805(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([J[IB)V")
	public static void method6806(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static178.method8633(0, arg0.length - 1, arg0, arg1);
	}
}
