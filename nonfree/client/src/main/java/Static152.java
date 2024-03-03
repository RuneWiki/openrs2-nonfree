import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt2957;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!df;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I", line = 100)
	public static int method2978(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V", line = 144)
	public static void method2980(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static120.aBooleanArray21[arg0]) {
			Static260.aClass197_68.method5096(arg0);
			Static25.aClass161ArrayArray1[arg0] = null;
			Static106.aClass161ArrayArray2[arg0] = null;
			Static120.aBooleanArray21[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!wm;I)V", line = 189)
	public static void method2981(@OriginalArg(0) Class19 arg0) {
		if (Class243.aBoolean477) {
			Static33.method4811(arg0);
		} else {
			Static155.method3157(arg0);
		}
	}
}
