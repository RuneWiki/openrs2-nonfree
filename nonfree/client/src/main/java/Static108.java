import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lclient!me;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	public static int anInt2405;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_790 = Static64.method1101(" )2> ");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ia;I)Lclient!ia;")
	public static Class51 method1837(@OriginalArg(0) Class51 arg0) {
		@Pc(7) Class1_Sub22 local7 = Static208.method3443(arg0);
		return local7 == null ? Static93.aClass51_674 : local7.aClass51_1107;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1838(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(12) int local12 = local8.method3793();
		@Pc(16) int local16 = local8.method3784();
		if (local16 < 0 || Static26.anInt3084 != 0 && Static26.anInt3084 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(92) byte[] local92 = new byte[local16];
			local8.method3792(local92, local16);
			return local92;
		} else {
			@Pc(48) int local48 = local8.method3784();
			if (local48 < 0 || Static26.anInt3084 != 0 && local48 > Static26.anInt3084) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local48];
			if (local12 == 1) {
				Static35.method612(local68, local48, arg0, local16);
			} else {
				Static81.aClass103_1.method3099(local8, local68);
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method1839(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static10.method162(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local39 <= local42);
			return Static12.method264(local42, arg1);
		}
	}
}
