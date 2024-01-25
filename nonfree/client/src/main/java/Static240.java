import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray81;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_72 = new Class242(65, 8);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZ)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Static198.method2841(Static398.aClass265_9, arg1, arg2);
		} else if (arg0 == 1003) {
			Static198.method2841(Static197.aClass265_3, arg1, arg2);
		} else if (arg0 == 1012) {
			Static198.method2841(Static355.aClass265_7, arg1, arg2);
		} else if (arg0 == 1011) {
			Static198.method2841(Static273.aClass265_4, arg1, arg2);
		} else if (arg0 == 1007) {
			Static198.method2841(Static445.aClass265_11, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)I")
	public static int method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(24) int local24 = 65536 - Class1_Sub29.anIntArray536[arg1 * 8192 / arg0] >> 1;
		return (arg3 * (65536 - local24) >> 16) + (local24 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
	public static void method3457() {
		Static74.aClass1_Sub10_5 = new Class1_Sub10(Static135.aClass142_35.method3118(Static63.anInt981), "", Static211.anInt5191, 1010, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIIII)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static105.anIntArrayArray18 != null) {
			Static105.anIntArrayArray18[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static425.aShortArrayArray9 != null) {
			Static425.aShortArrayArray9[arg0][arg1] = (short) arg3;
		}
		if (aByteArrayArray81 != null) {
			aByteArrayArray81[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!oi;I)Lclient!br;")
	public static Class1_Sub7 method3459(@OriginalArg(1) Class185 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3997(arg1);
		return local16 == null ? null : new Class1_Sub7(local16);
	}
}
