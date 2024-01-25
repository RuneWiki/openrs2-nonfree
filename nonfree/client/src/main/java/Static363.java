import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!re;")
	public static final Class320 aClass320_4 = new Class320();

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!vd;")
	public static final Class378 aClass378_4 = new Class378(128);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBIII)V")
	public static void method5219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static394.anInt6507;
		@Pc(14) int local14 = Static55.anInt902;
		if (Static392.aBoolean549) {
			local12 += Static637.method3733();
			local14 += Static400.method5900();
		}
		@Pc(35) Class43 local35;
		if (Static427.anInt6966 == 1) {
			local35 = Static271.aClass43Array10[Static29.anInt415 / 100];
			local35.method9588(local12 - 8, local14 + -8);
			Static5.method72(local35.method9600() + local14 - 8, local14 - 8, local12 + local35.method9587() - 8, local12 + -8);
		}
		if (Static427.anInt6966 == 2) {
			local35 = Static271.aClass43Array10[Static29.anInt415 / 100 + 4];
			local35.method9588(local12 - 8, local14 + -8);
			Static5.method72(local35.method9600() + local14 - 8, local14 + -8, local35.method9587() + local12 - 8, local12 + -8);
		}
		Static253.method3572();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIII)I")
	public static int method5222(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub3 local17 = Static549.method7662(-125, arg0, arg1);
		if (local17 == null) {
			return 0;
		} else if (arg2 >= 0 && local17.anIntArray29.length > arg2) {
			return local17.anIntArray29[arg2];
		} else {
			return 0;
		}
	}
}
