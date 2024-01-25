import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "J")
	public static long aLong239;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lclient!mc;")
	public static final Class5_Sub41 aClass5_Sub41_10 = new Class5_Sub41(1350);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)V")
	public static void method7268(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(14, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7269(@OriginalArg(0) Class65 arg0) {
		Static255.aClass88Array1 = new Class88[Static16.anIntArray14.length];
		for (@Pc(14) int local14 = 0; local14 < Static16.anIntArray14.length; local14++) {
			@Pc(19) int local19 = Static16.anIntArray14[local14];
			@Pc(24) Class247 local24 = Static331.method5104(Static519.aClass390_100, local19);
			@Pc(32) Class73 local32 = arg0.method6886(local24, Static689.method8546(Static504.aClass390_97, local19));
			Static255.aClass88Array1[local14] = new Class88(local32, local24);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method7270(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static111.method4954(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static17.method232(local45, arg0);
		}
	}
}
