import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public static int anInt5487;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public static int anInt5488;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
	public static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	public static int method4699(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method4701(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(35) boolean local35 = false;
		if (arg2 < 0L) {
			local35 = true;
			arg2 = -arg2;
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(26);
		@Pc(55) int local55;
		@Pc(60) int local60;
		if (arg0 > 0) {
			for (local55 = 0; local55 < arg0; local55++) {
				local60 = (int) arg2;
				arg2 /= 10L;
				local51.append((char) (local60 + 48 - (int) arg2 * 10));
			}
			local51.append(local7);
		}
		local55 = 0;
		while (true) {
			local60 = (int) arg2;
			arg2 /= 10L;
			local51.append((char) (local60 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local35) {
					local51.append('-');
				}
				return local51.reverse().toString();
			}
			if (arg1) {
				local55++;
				if (local55 % 3 == 0) {
					local51.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZILclient!ec;)V")
	public static void method4702(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		if (Static270.anInt4355 >= 50 || (arg1 == null || arg1.anIntArrayArray7 == null || arg0 >= arg1.anIntArrayArray7.length || arg1.anIntArrayArray7[arg0] == null)) {
			return;
		}
		@Pc(37) int local37 = arg1.anIntArrayArray7[arg0][0];
		@Pc(41) int local41 = local37 >> 8;
		@Pc(47) int local47 = local37 >> 5 & 0x7;
		@Pc(64) int local64;
		if (arg1.anIntArrayArray7[arg0].length > 1) {
			local64 = (int) ((double) arg1.anIntArrayArray7[arg0].length * Math.random());
			if (local64 > 0) {
				local41 = arg1.anIntArrayArray7[arg0][local64];
			}
		}
		local64 = 256;
		if (arg1.anIntArray150 != null && arg1.anIntArray148 != null) {
			local64 = Static440.method6030(arg1.anIntArray150[arg0], arg1.anIntArray148[arg0]);
		}
		if (arg1.aBoolean157) {
			Static305.method4186(0, false, local41, local64, local47, 255);
		} else {
			Static245.method3378(255, local47, local41, local64, 0);
		}
	}
}
