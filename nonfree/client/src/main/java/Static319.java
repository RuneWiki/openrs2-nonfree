import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_6 = new Class162("", 13);

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
	public static int anInt6347 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	public static void method4996() {
		@Pc(10) int local10 = 0;
		if (Static455.aClass4_Sub35_Sub1_1 != null) {
			local10 = Static455.aClass4_Sub35_Sub1_1.method7632(Static453.anInt8614);
		}
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (local10 == 2) {
			local29 = Static308.anInt6203 > 800 ? 800 : Static308.anInt6203;
			local36 = Static507.anInt9504 > 600 ? 600 : Static507.anInt9504;
			Static7.anInt723 = (Static308.anInt6203 - local29) / 2;
			Static123.anInt9150 = local29;
			Static347.anInt6686 = 0;
			Static71.anInt1872 = local36;
		} else if (local10 == 1) {
			local29 = Static308.anInt6203 > 1024 ? 1024 : Static308.anInt6203;
			local36 = Static507.anInt9504 <= 768 ? Static507.anInt9504 : 768;
			Static123.anInt9150 = local29;
			Static7.anInt723 = (Static308.anInt6203 - local29) / 2;
			Static71.anInt1872 = local36;
			Static347.anInt6686 = 0;
		} else {
			Static7.anInt723 = 0;
			Static71.anInt1872 = Static507.anInt9504;
			Static347.anInt6686 = 0;
			Static123.anInt9150 = Static308.anInt6203;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method4997(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static32.method1002(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local34 <= local37);
			return Static442.method6525(local37, arg1);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)I")
	public static int method5001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 ^ local10 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * local21 * 15731 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}
}
