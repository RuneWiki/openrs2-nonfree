import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
	public static final int[] anIntArray497 = new int[3];

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "Lclient!sj;")
	public static final Class296 aClass296_4 = new Class296();

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
	public static final int[] anIntArray498 = new int[4];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method6006(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(31) boolean local31 = false;
		if (arg0 < 0L) {
			local31 = true;
			arg0 = -arg0;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg3 > 0) {
			for (local52 = 0; local52 < arg3; local52++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local45.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local45.append(local7);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local45.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local31) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg2) {
				local52++;
				if (local52 % 3 == 0) {
					local45.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public static void method6007() {
		if (Static137.aClass260_1 != null) {
			Static137.aClass260_1.method5790();
		}
		if (Static202.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static202.aThread4.join();
				break;
			} catch (@Pc(14) InterruptedException local14) {
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	public static void method6008() {
		@Pc(9) int[] local9 = new int[Static46.aClass234_1.anInt6530];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static46.aClass234_1.anInt6530; local13++) {
			@Pc(20) Class322 local20 = Static46.aClass234_1.method5390(local13);
			if (local20.anInt8601 >= 0 || local20.anInt8602 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static509.anIntArray583 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static509.anIntArray583[local52] = local9[local52];
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V")
	public static void method6009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(7, arg0);
		local8.method491();
		local8.anInt548 = arg1;
	}
}
