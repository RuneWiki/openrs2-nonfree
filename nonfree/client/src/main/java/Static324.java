import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_113 = new Class254(76, 16);

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I")
	public static int method5239() {
		if (Static218.aBoolean366) {
			return 6;
		} else if (Static567.aClass6_Sub42_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static567.aClass6_Sub42_4.anInt8285;
			if (Static542.method7784(local19)) {
				return 1;
			} else if (Static394.method6227(local19)) {
				return 2;
			} else if (Static472.method5255(local19)) {
				return 3;
			} else if (Static390.method6168(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
	public static void method5242(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub4_Sub6 local12 = Static68.method1408(2, arg0);
		local12.method3828();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BII)[B")
	public static byte[] method5243(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static589.method5382(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
