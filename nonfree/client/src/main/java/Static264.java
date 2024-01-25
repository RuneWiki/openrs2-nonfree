import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt5402;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
	public static int anInt5404;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt5400 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kh;Ljava/lang/String;I)I")
	public static int method4569(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) String arg1) {
		@Pc(14) int local14 = arg0.anInt6076;
		@Pc(18) byte[] local18 = Static49.method711(arg1);
		arg0.method5177(local18.length);
		arg0.anInt6076 += Static164.aClass150_1.method4034(0, arg0.aByteArray93, local18.length, local18, arg0.anInt6076);
		return arg0.anInt6076 - local14;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
	public static void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static303.anIntArrayArray55 != null) {
			Static303.anIntArrayArray55[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
	public static boolean method4577(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 48 || arg0 == 57 || arg0 == 51 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 60 || arg0 == 1004;
		}
	}
}
