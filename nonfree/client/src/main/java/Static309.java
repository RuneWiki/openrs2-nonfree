import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt4983;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public static int anInt4985;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4208(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local30++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static498.aCharArray6[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!hg;I)V")
	public static void method4209(@OriginalArg(1) Class13_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray300 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray300[arg1 + 1];
		if (local13 == arg0.anInt4559) {
			return;
		}
		arg0.anInt4559 = local13;
		arg0.anInt4591 = 0;
		arg0.anInt4634 = 1;
		arg0.anInt4564 = 0;
		arg0.anInt4567 = 0;
		arg0.anInt4637 = arg0.anInt4639;
		if (arg0.anInt4559 != -1) {
			Static589.method8022(arg0.anInt4591, Static540.aClass173_2.method3791(arg0.anInt4559), arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method4210() {
		Static18.aClass96_1.method2123();
		Static244.aClass242_7.method5369();
		Static502.aClass23_2.method549();
		Static319.aClass141_4.method2969();
		Static409.aClass107_2.method2287();
		Static72.aClass225_2.method4780();
		Static540.aClass173_2.method3790();
		Static460.aClass155_2.method3364();
		Static89.aClass330_3.method7451();
		Static361.aClass106_1.method2247();
		Static43.aClass283_1.method6257();
		Static599.aClass197_4.method4163();
		Static264.aClass207_3.method4281();
		Static339.aClass66_1.method1435();
		Static71.aClass345_1.method7732();
		Static355.aClass157_1.method3386();
		Static263.aClass224_1.method4716();
		Static516.aClass43_3.method889();
		Static537.aClass308_2.method6910();
		Static105.aClass339_1.method7579();
		Static379.method5065();
		Static338.method4550();
		Static430.method7125();
		Static452.method6143();
		Static176.method2604();
		Static352.aClass32_57.method634(5);
		Static247.aClass32_43.method634(5);
		Static84.aClass32_14.method634(5);
		Static234.aClass32_87.method634(5);
		Static300.aClass32_48.method634(5);
	}
}
