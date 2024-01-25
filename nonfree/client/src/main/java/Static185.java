import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "Lclient!oa;")
	public static Class66 aClass66_14;

	@OriginalMember(owner = "client!hba", name = "v", descriptor = "Lclient!r;")
	public static Class285 aClass285_5;

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
	public static int anInt8672;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!dw;IIII)V")
	public static void method7125(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static245.method4154(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static173.anInt3719) {
			Static245.method4154(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static245.method4154(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static357.anInt6212) {
			Static245.method4154(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static357.anInt6212) {
			Static245.method4154(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static173.anInt3719 && arg4 <= Static357.anInt6212) {
			Static245.method4154(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static245.method4154(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static173.anInt3719 && arg4 > 0) {
			Static245.method4154(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!eh;BLjava/lang/String;)I")
	public static int method7126(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt7219;
		@Pc(19) byte[] local19 = Static306.method4736(arg1);
		arg0.method6016(local19.length);
		arg0.anInt7219 += Static261.aClass133_1.method3382(local19.length, arg0.aByteArray97, 0, arg0.anInt7219, local19);
		return arg0.anInt7219 - local6;
	}
}
