import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	public static int method7231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)Z")
	public static boolean method7232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static513.aByteArrayArrayArray18[1].length && Static513.aByteArrayArrayArray18[1][arg1].length > arg0) {
			return (Static513.aByteArrayArrayArray18[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method7235() {
		Static594.aClass3_Sub7_Sub2_3.method2461();
		Static236.aClass3_Sub7_Sub2_1 = null;
		Static402.aClass196_83 = null;
		Static324.anInt8117 = 1;
	}
}
