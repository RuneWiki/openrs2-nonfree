import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[Lclient!wr;")
	public static Class41_Sub7_Sub1_Sub1[] aClass41_Sub7_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public static int anInt5351 = 0;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!rp;")
	public static Class4_Sub30_Sub2 aClass4_Sub30_Sub2_3 = new Class4_Sub30_Sub2(8192);

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
	public static final int[] anIntArray465 = new int[32];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public static void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = Static446.aClass31ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static292.anInt5290 = local9.anInt1296;
			Static187.anInt3601 = local9.anInt1294;
			Static412.anInt7034 = local9.anInt1290;
		}
		Static48.method1020();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
	public static String method4125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if ((long) 0 > arg3) {
			arg3 = -arg3;
			local22 = true;
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(26);
		@Pc(44) int local44;
		@Pc(49) int local49;
		if (arg1 > 0) {
			for (local44 = 0; local44 < arg1; local44++) {
				local49 = (int) arg3;
				arg3 /= 10L;
				local37.append((char) (local49 + 48 - (int) arg3 * 10));
			}
			local37.append(local7);
		}
		local44 = 0;
		while (true) {
			local49 = (int) arg3;
			arg3 /= 10L;
			local37.append((char) (local49 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local22) {
					local37.append('-');
				}
				return local37.reverse().toString();
			}
			if (arg2) {
				local44++;
				if (local44 % 3 == 0) {
					local37.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method4131() {
		Static86.aClass69_60.method1593();
	}
}
