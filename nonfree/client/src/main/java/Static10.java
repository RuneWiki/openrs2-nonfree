import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
	public static int anInt247;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)I", line = 72)
	public static int method236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V", line = 109)
	public static void method237(@OriginalArg(1) int arg0) {
		Static221.anInt4331 = arg0;
		Class2_Sub2_Sub8.aClass98_17.method2616();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)I", line = 122)
	public static int method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Class86.anIntArray152[arg0 & 0x3] : Class2_Sub2_Sub6.anIntArray460[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILjava/lang/String;)V", line = 136)
	public static void method239(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(2, arg0);
		local8.method2313();
		local8.aString21 = arg1;
	}
}
