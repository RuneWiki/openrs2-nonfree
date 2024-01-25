import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Lclient!cj;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	public static int anInt5623;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	public static int anInt5625;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!eq;")
	public static final Class61 aClass61_3 = new Class61();

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!bo;ZLclient!bo;IIIIII)V")
	public static void method4976(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub1_Sub1 arg1, @OriginalArg(3) Class25_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method4643();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class54 local20 = (Class54) Static95.aClass66_105.method1939((long) local7);
		if (local20 == null) {
			@Pc(27) Class37[] local27 = Static360.method918(Static317.aClass170_114, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static15.aClass59_1.method4872(local27[0]);
			Static95.aClass66_105.method1936((long) local7, local20);
		}
		Static78.method1746(arg1.anInt5773, arg3 >> 1, arg1.anInt5769, arg1.method4646() * 64, arg0 >> 1, 0);
		@Pc(72) int local72 = arg4 + Static330.anIntArray121[0] - 18;
		@Pc(82) int local82 = arg5 + Static330.anIntArray121[1] - 54 - 16;
		@Pc(90) int local90 = local72 + arg6 / 4 * 18;
		@Pc(98) int local98 = local82 + arg6 % 4 * 18;
		local20.method5569(local90, local98);
		if (arg1 == arg2) {
			Static15.aClass59_1.method4830(-256, local98 - 1, local90 - 1, 18, 18);
		}
		@Pc(134) Class63_Sub4 local134 = Static160.method2980();
		local134.anInt4441 = local98;
		local134.anInt4442 = local90 + 16;
		local134.anInt4436 = local98 + 16;
		local134.anInt4445 = local90;
		local134.aClass25_Sub1_Sub1_1 = arg2;
		Static178.aClass24_3.method620(local134);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method4979(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static90.method3837(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(48) int local48;
			do {
				local48 = arg1.nextInt();
			} while (local48 >= local45);
			return Static229.method3950(arg0, local48);
		}
	}
}
