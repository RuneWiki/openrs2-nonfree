import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
	public static int anInt3899;

	@OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
	public static final int anInt3907 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method3257() {
		Static191.aClass83_30.method1663(50);
		Static361.aClass83_52.method1663(50);
		Static158.aClass83_25.method1663(50);
		Static40.aClass83_6.method1663(50);
		Static72.aClass83_12.method1663(50);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method3258() {
		Static114.aClass27_16.method566();
		Static442.aClass27_30.method566();
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	public static void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21;
		if (arg1 != Static347.anInt5974) {
			Static384.anIntArray551 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static384.anIntArray551[local21] = (local21 << 12) / arg1;
			}
			Static347.anInt5974 = arg1;
			Static307.anInt5524 = arg1 - 1;
			Static286.anInt4991 = arg1 * 32;
		}
		if (arg0 == Static241.anInt4307) {
			return;
		}
		if (arg0 == Static347.anInt5974) {
			Static342.anIntArray469 = Static384.anIntArray551;
		} else {
			Static342.anIntArray469 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static342.anIntArray469[local21] = (local21 << 12) / arg0;
			}
		}
		Static274.anInt4887 = arg0 - 1;
		Static241.anInt4307 = arg0;
	}
}
