import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public static int anInt3176;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!vh;")
	public static Class250 aClass250_39;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
	public static int[] anIntArray267 = new int[2];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public static int method2719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static333.anIntArray459[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)I")
	public static int method2720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILclient!fq;Lclient!fq;)V")
	public static void method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub1 arg3, @OriginalArg(4) Class26_Sub1 arg4) {
		@Pc(4) Class211 local4 = Static197.method3007(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub1_2 = arg3;
			local4.aClass26_Sub1_3 = arg4;
		}
	}
}
