import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	public static int anInt4660;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	public static int anInt4664;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Lclient!cl;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_152 = new Class123(114, 6);

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	public static int anInt4663 = 0;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_153 = new Class123(78, 6);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!cs;)V")
	public static void method3737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25_Sub2_Sub4 arg4) {
		@Pc(4) Class333 local4 = Static195.method3408(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8476 = (arg1 << Static385.anInt6657) + Static211.anInt8485;
		arg4.anInt8480 = arg3;
		arg4.anInt8482 = (arg2 << Static385.anInt6657) + Static211.anInt8485;
		if (local4.aClass25_Sub2_Sub5_1 != null) {
			arg4.anInt8480 -= local4.aClass25_Sub2_Sub5_1.aShort48;
		}
		local4.aClass25_Sub2_Sub4_1 = arg4;
		@Pc(44) int local44 = Static256.aClass127Array3 == Static108.aClass127Array5 ? 1 : 0;
		if (arg4.method6653()) {
			if (arg4.method6655()) {
				Static468.aClass25_Sub2ArrayArray4[local44][Static154.anIntArray135[local44]++] = arg4;
				return;
			}
			Static530.aClass25_Sub2ArrayArray5[local44][Static199.anIntArray186[local44]++] = arg4;
			return;
		}
		Static69.aClass25_Sub2ArrayArray3[local44][Static473.anIntArray482[local44]++] = arg4;
	}
}
