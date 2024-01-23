import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public static int anInt5399;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!lh;")
	public static Class1_Sub11_Sub1 aClass1_Sub11_Sub1_3 = new Class1_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "[I")
	public static int[] anIntArray537 = new int[100];

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString315 = "M";

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)V")
	public static void method4250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static258.anInt5077 = Static95.anInt2218 + Static254.anInt4979 - arg1 - 1;
		Static22.anInt448 = arg0 - Static264.anInt5177;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public static void method4251() {
		Static279.aClass135_40.method3324();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public static void method4252() {
		Static191.aClass135_19.method3320(5);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIILclient!dn;IJ)Z")
	public static boolean method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static163.method2819(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
