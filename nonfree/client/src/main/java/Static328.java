import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZLjava/util/Random;I)I")
	public static int method4754(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static259.method3656(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local42 >= local39);
			return Static114.method1673(local42, arg1);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	public static void method4755() {
		Static201.method2518();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B[Lclient!f;)V")
	public static void method4756(@OriginalArg(1) Class38[] arg0) {
		Static156.anInt2487 = arg0.length;
		Static309.anIntArray355 = new int[Static156.anInt2487 + 10];
		Static389.aClass38Array21 = new Class38[Static156.anInt2487 + 10];
		Static598.method4266(arg0, 0, Static389.aClass38Array21, 0, Static156.anInt2487);
		for (@Pc(30) int local30 = 0; local30 < Static156.anInt2487; local30++) {
			Static309.anIntArray355[local30] = Static389.aClass38Array21[local30].ca();
		}
		for (@Pc(45) int local45 = Static156.anInt2487; local45 < Static389.aClass38Array21.length; local45++) {
			Static309.anIntArray355[local45] = 12;
		}
	}
}
