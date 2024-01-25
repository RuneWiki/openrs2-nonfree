import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
	public static int anInt30;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)I")
	public static int method54(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!pj;Lclient!pj;Lclient!pj;Lclient!pj;B)V")
	public static void method55(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		Static271.aClass248_39 = arg0;
		Static24.aClass248_4 = arg3;
		Static509.aClass248_76 = arg2;
		Static208.aClass248_31 = arg1;
		Static360.aClass97ArrayArray2 = new Class97[Static24.aClass248_4.method5774()][];
		Static431.aBooleanArray26 = new boolean[Static24.aClass248_4.method5774()];
	}
}
