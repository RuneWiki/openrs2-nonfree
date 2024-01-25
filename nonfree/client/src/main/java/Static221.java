import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!vf;")
	public static final Class348 aClass348_5 = new Class348();

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static final int anInt3209 = 1407;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method2688() {
		@Pc(14) int local14 = (int) ((double) Static281.anInt4822 * 34.46D);
		local14 <<= 0x2;
		if (Static417.aClass162_17.method6872()) {
			local14 += 512;
		}
		Static417.aClass162_17.GA(200, local14);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2689(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static124.anInt9459 = -1;
		Static377.anInt6297 = 1;
		Static24.method350(false, arg0, arg1);
	}
}
