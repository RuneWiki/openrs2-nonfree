import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!us;")
	public static final Class234 aClass234_75 = new Class234(99, 7);

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
	public static void method3315() {
		Static105.anInt2076 = 0;
		Static47.aClass138_7.method3046();
		Static47.aClass138_7.method3053(Static135.aClass3_Sub4_1);
		Static105.anInt2076++;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method3319(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static180.method2815(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static306.method4731(arg1, local45);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!bj;B)V")
	public static void method3320(@OriginalArg(0) Class28_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4368 == Static76.anInt1617 || arg0.anInt4314 == -1 || arg0.anInt4327 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class177 local30 = Static176.aClass43_2.method930(arg0.anInt4314);
			if (local30.aBoolean351 || arg0.anInt4363 + 1 > local30.anIntArray501[arg0.anInt4356]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt4368 - arg0.anInt4339;
			@Pc(64) int local64 = Static76.anInt1617 - arg0.anInt4339;
			@Pc(76) int local76 = arg0.anInt4359 * 128 + arg0.method4009() * 64;
			@Pc(87) int local87 = arg0.anInt4319 * 128 + arg0.method4009() * 64;
			@Pc(98) int local98 = arg0.anInt4353 * 128 + arg0.method4009() * 64;
			@Pc(109) int local109 = arg0.anInt4342 * 128 + arg0.method4009() * 64;
			arg0.anInt5774 = (local98 * local64 + (local58 - local64) * local76) / local58;
			arg0.anInt5766 = (local64 * local109 + local87 * (local58 - local64)) / local58;
		}
		arg0.anInt4376 = 0;
		if (arg0.anInt4354 == 0) {
			arg0.method4005(8192);
		}
		if (arg0.anInt4354 == 1) {
			arg0.method4005(12288);
		}
		if (arg0.anInt4354 == 2) {
			arg0.method4005(0);
		}
		if (arg0.anInt4354 == 3) {
			arg0.method4005(4096);
		}
	}
}
