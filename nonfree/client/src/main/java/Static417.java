import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static417 {

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	public static int anInt7783;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_155 = new Class239(92, -1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6514(@OriginalArg(0) String arg0) {
		if (Static308.aClass105Array1 != null) {
			Static93.method1721(Static168.aClass243_40);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0));
			Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
	public static int method6515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
	}
}
