import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt770 = -1;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	public static int anInt771 = -1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method743() {
		if (Static199.aBoolean362) {
			return;
		}
		Static65.method1246(Static214.aClass164ArrayArrayArray4);
		if (Static2.aClass164ArrayArrayArray1 != null) {
			Static65.method1246(Static2.aClass164ArrayArrayArray1);
		}
		Static199.aBoolean362 = true;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public static void method744() {
		if (Static104.aClass219_2 != Static286.aClass219_5) {
			try {
				Static458.method2593(Static6.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([[IB)V")
	public static void method747(@OriginalArg(0) int[][] arg0) {
		Static96.anIntArrayArray21 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method748(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(33) boolean local33 = false;
		if (arg1 < 0L) {
			local33 = true;
			arg1 = -arg1;
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (arg2 > 0) {
			for (local53 = 0; local53 < arg2; local53++) {
				local58 = (int) arg1;
				arg1 /= 10L;
				local49.append((char) (local58 + 48 - (int) arg1 * 10));
			}
			local49.append(local7);
		}
		local53 = 0;
		while (true) {
			local58 = (int) arg1;
			arg1 /= 10L;
			local49.append((char) (local58 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local33) {
					local49.append('-');
				}
				return local49.reverse().toString();
			}
			if (arg0) {
				local53++;
				if (local53 % 3 == 0) {
					local49.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	public static void method750(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 9);
		local13.method2608();
	}
}
