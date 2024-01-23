import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public static int anInt5548 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method4610() {
		Static81.aClass34_1.method4656();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static269.aLongArray10[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static11.aLongArray1[local10] = 0L;
		}
		Static37.anInt680 = 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZ)V")
	public static void method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static43.aBoolean88) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static167.anInt636 != arg0) {
			if (Static213.aBoolean520) {
				return;
			}
			if (Static167.anInt636 != 0) {
				Static281.anInterface3Array2[Static167.anInt636].method3931();
			}
			if (arg0 != 0) {
				@Pc(65) Interface3 local65 = Static281.anInterface3Array2[arg0];
				local65.method3929();
				local65.method3930(arg1);
			}
			Static82.anInt1831 = arg1;
			Static167.anInt636 = arg0;
		} else if (arg0 != 0 && arg1 != Static82.anInt1831) {
			Static281.anInterface3Array2[arg0].method3930(arg1);
			Static82.anInt1831 = arg1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I")
	public static int method4613(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub18 local19 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local19 == null) {
			return Static179.method3040(arg0).anInt5408;
		}
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = 0; local38 < local19.anIntArray219.length; local38++) {
			if (local19.anIntArray219[local38] == -1) {
				local36++;
			}
		}
		return local36 + Static179.method3040(arg0).anInt5408 - local19.anIntArray219.length;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method4615(@OriginalArg(2) String arg0) {
		return Static302.method4512(16, arg0);
	}
}
