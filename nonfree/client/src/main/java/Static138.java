import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public static int anInt2726;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt2720 = 0;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "[C")
	public static char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!sb;I)Lclient!sg;")
	public static Class160 method2210(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) Class160 local7 = new Class160();
		local7.anInt4975 = arg0.method2593();
		local7.aClass1_Sub1_Sub20_1 = Static57.method981(local7.anInt4975);
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)I")
	public static int method2211(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
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
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
