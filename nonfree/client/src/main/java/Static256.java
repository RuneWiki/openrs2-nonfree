import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array7;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
	public static final int[] anIntArray368 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!ni;")
	public static final Class169 aClass169_6 = new Class169();

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public static int anInt4317 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z")
	public static boolean method3399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBII)I")
	public static int method3400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB[B)V")
	public static void method3402(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static277.aClass7_Sub14_5 == null) {
			Static277.aClass7_Sub14_5 = new Class7_Sub14(20000);
		}
		Static277.aClass7_Sub14_5.method3952(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static342.method4433(Static277.aClass7_Sub14_5.aByteArray75);
		Static31.aClass19_Sub1Array1 = new Class19_Sub1[Static58.anInt1041];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static147.anInt2783; local37 <= Static417.anInt6629; local37++) {
			@Pc(43) Class19_Sub1 local43 = Static333.method2746(local37);
			if (local43 != null) {
				Static31.aClass19_Sub1Array1[local35++] = local43;
			}
		}
		Static202.aBoolean217 = false;
		Static56.aLong37 = Static158.method2342();
		Static277.aClass7_Sub14_5 = null;
	}
}
