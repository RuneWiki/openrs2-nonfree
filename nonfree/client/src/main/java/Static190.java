import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!vg", name = "X", descriptor = "Lclient!pi;")
	public static Class67 aClass67_14 = new Class67();

	@OriginalMember(owner = "client!vg", name = "fb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1295 = Static158.method3034("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!vg", name = "db", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1294 = aClass60_1295;

	@OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
	public static int anInt4541 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIILclient!ra;I)V")
	public static void method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class72 arg5, @OriginalArg(7) int arg6) {
		if (Static43.aBoolean47) {
			Static52.anInt1625 = 32;
		} else {
			Static52.anInt1625 = 0;
		}
		Static43.aBoolean47 = false;
		@Pc(141) int local141;
		if (Static113.anInt3165 != 0) {
			if (arg3 <= arg2 && arg2 < arg3 + 16 && arg6 <= arg1 && arg6 + 16 > arg1) {
				arg5.anInt3926 -= 4;
				Static39.method900(arg5);
			} else if (arg3 <= arg2 && arg3 + 16 > arg2 && arg4 + arg6 - 16 <= arg1 && arg1 < arg6 + arg4) {
				arg5.anInt3926 += 4;
				Static39.method900(arg5);
			} else if (arg3 - Static52.anInt1625 <= arg2 && Static52.anInt1625 + arg3 + 16 > arg2 && arg1 >= arg6 + 16 && arg1 < arg6 + arg4 - 16) {
				local141 = arg4 * (arg4 - 32) / arg0;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(153) int local153 = arg4 - local141 - 32;
				@Pc(163) int local163 = arg1 - arg6 - local141 / 2 - 16;
				arg5.anInt3926 = local163 * (arg0 - arg4) / local153;
				Static39.method900(arg5);
				Static43.aBoolean47 = true;
			}
		}
		if (Static26.anInt803 == 0) {
			return;
		}
		local141 = arg5.anInt3878;
		if (arg3 - local141 <= arg2 && arg6 <= arg1 && arg2 < arg3 + 16 && arg4 + arg6 >= arg1) {
			arg5.anInt3926 += Static26.anInt803 * 45;
			Static39.method900(arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!og;)V")
	public static void method3484(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static148.aClass40_4 != null) {
			@Pc(30) int local30;
			try {
				Static148.aClass40_4.method1928(0L);
				Static148.aClass40_4.method1922(local16);
				for (local30 = 0; local30 < 24 && local16[local30] == 0; local30++) {
				}
				if (local30 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(54) Exception local54) {
				for (local30 = 0; local30 < 24; local30++) {
					local16[local30] = -1;
				}
			}
		}
		arg0.method214(24, local16);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ra;III)V")
	public static void method3485(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static62.aClass72_5 != null || Static103.aBoolean115 || (arg0 == null || Static61.method1429(arg0) == null)) {
			return;
		}
		Static62.aClass72_5 = arg0;
		Static181.aClass72_13 = Static61.method1429(arg0);
		Static17.anInt558 = 0;
		Static179.aBoolean174 = false;
		Static187.anInt4632 = arg1;
		Static174.anInt4252 = arg2;
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
	public static void method3486() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)V")
	public static void method3488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static62.method1443(arg1)) {
			Static197.method3577(arg0, Static197.aClass72ArrayArray1[arg1]);
		}
	}
}
