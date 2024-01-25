import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_141 = new Class150(8, 2);

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt5881 = 0;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!ro;")
	public static final Class259 aClass259_1 = new Class259();

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public static int anInt5882 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BC)Z")
	public static boolean method4882(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)Z")
	public static boolean method4883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static141.method2634(arg0, arg1) || Static523.method7171(arg0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method4884() {
		for (@Pc(3) int local3 = 0; local3 < Static438.anInt7689; local3++) {
			@Pc(9) int local9 = Static547.anIntArray731[local3];
			@Pc(16) Class5_Sub51 local16 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local9);
			if (local16 != null) {
				@Pc(21) Class15_Sub2_Sub1_Sub2 local21 = local16.aClass15_Sub2_Sub1_Sub2_2;
				Static465.method6479(local21, local21.aClass305_1.anInt8815);
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
	public static void method4886() {
		Static445.method6296(Static460.anInt7893);
	}
}
