import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public static int anInt5806;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!hm;ZII)V")
	public static void method4687(@OriginalArg(0) Class107 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static441.anInt4982 = arg2;
		Static261.aClass107_12 = arg0;
		Static61.anInt7288 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
	public static int method4688(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
