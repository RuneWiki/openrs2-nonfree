import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_129 = new Class103(67, 2);

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	public static final int anInt2894 = 1338;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method2496(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg0 < 0L) {
			local22 = true;
			arg0 = -arg0;
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		@Pc(43) int local43;
		@Pc(48) int local48;
		if (arg2 > 0) {
			for (local43 = 0; local43 < arg2; local43++) {
				local48 = (int) arg0;
				arg0 /= 10L;
				local36.append((char) (local48 + 48 - (int) arg0 * 10));
			}
			local36.append(local7);
		}
		local43 = 0;
		while (true) {
			local48 = (int) arg0;
			arg0 /= 10L;
			local36.append((char) (local48 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local22) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg1) {
				local43++;
				if (local43 % 3 == 0) {
					local36.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
	public static void method2497() {
		Static387.method5068(Static105.anInt1943);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!jk;Z)V")
	public static void method2498(@OriginalArg(1) Class124 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt3389 == 0 ? arg0.anInt3376 : arg0.anInt3389;
		@Pc(22) int local22 = arg0.anInt3415 == 0 ? arg0.anInt3356 : arg0.anInt3415;
		Static392.method5129(arg0.anInt3348, local12, local22, arg1, Static87.aClass124ArrayArray7[arg0.anInt3348 >> 16]);
		if (arg0.aClass124Array1 != null) {
			Static392.method5129(arg0.anInt3348, local12, local22, arg1, arg0.aClass124Array1);
		}
		@Pc(55) Class1_Sub14 local55 = (Class1_Sub14) Static94.aClass199_54.method4387((long) arg0.anInt3348);
		if (local55 != null) {
			Static56.method980(local12, local22, local55.anInt1425, arg1);
		}
	}
}
