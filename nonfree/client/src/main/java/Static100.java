import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean120 = true;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!va;III)V")
	public static void method1446(@OriginalArg(1) Class15_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class154 local13 = arg0.method7131();
		@Pc(23) int local23 = arg0.anInt8990 - arg0.aClass218_7.anInt6583 & 0x3FFF;
		if (arg1 == -1) {
			if (local23 != 0 || arg0.anInt8965 > 25) {
				if (arg2 < 0 && local13.anInt4532 != -1) {
					arg0.anInt8985 = local13.anInt4532;
				} else if (arg2 <= 0 || local13.anInt4505 == -1) {
					arg0.anInt8985 = local13.anInt4534;
				} else {
					arg0.anInt8985 = local13.anInt4505;
				}
				arg0.aBoolean579 = false;
			} else if (!arg0.aBoolean579 || !local13.method3827(arg0.anInt8985)) {
				arg0.anInt8985 = local13.method3825();
				arg0.aBoolean579 = arg0.anInt8985 != -1;
			}
		} else if (arg0.anInt8927 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(49) int local49 = Static503.anIntArray622[arg3] - arg0.aClass218_7.anInt6583 & 0x3FFF;
			if (arg1 == 2 && local13.anInt4538 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local13.anInt4516 != -1) {
					arg0.anInt8985 = local13.anInt4516;
				} else if (local49 >= 10240 && local49 < 14336 && local13.anInt4507 != -1) {
					arg0.anInt8985 = local13.anInt4507;
				} else if (local49 <= 6144 || local49 >= 10240 || local13.anInt4524 == -1) {
					arg0.anInt8985 = local13.anInt4538;
				} else {
					arg0.anInt8985 = local13.anInt4524;
				}
			} else if (arg1 == 0 && local13.anInt4523 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local13.anInt4531 != -1) {
					arg0.anInt8985 = local13.anInt4531;
				} else if (local49 >= 10240 && local49 < 14336 && local13.anInt4519 != -1) {
					arg0.anInt8985 = local13.anInt4519;
				} else if (local49 <= 6144 || local49 >= 10240 || local13.anInt4506 == -1) {
					arg0.anInt8985 = local13.anInt4523;
				} else {
					arg0.anInt8985 = local13.anInt4506;
				}
			} else if (local49 > 2048 && local49 <= 6144 && local13.anInt4496 != -1) {
				arg0.anInt8985 = local13.anInt4496;
			} else if (local49 >= 10240 && local49 < 14336 && local13.anInt4512 != -1) {
				arg0.anInt8985 = local13.anInt4512;
			} else if (local49 <= 6144 || local49 >= 10240 || local13.anInt4539 == -1) {
				arg0.anInt8985 = local13.anInt4534;
			} else {
				arg0.anInt8985 = local13.anInt4539;
			}
			arg0.aBoolean579 = false;
		} else if (local23 == 0 && arg0.anInt8965 <= 25) {
			if (arg1 == 2 && local13.anInt4538 != -1) {
				arg0.anInt8985 = local13.anInt4538;
			} else if (arg1 == 0 && local13.anInt4523 != -1) {
				arg0.anInt8985 = local13.anInt4523;
			} else {
				arg0.anInt8985 = local13.anInt4534;
			}
			arg0.aBoolean579 = false;
		} else {
			arg0.aBoolean579 = false;
			if (arg1 == 2 && local13.anInt4538 != -1) {
				if (arg2 < 0 && local13.anInt4509 != -1) {
					arg0.anInt8985 = local13.anInt4509;
				} else if (arg2 <= 0 || local13.anInt4503 == -1) {
					arg0.anInt8985 = local13.anInt4538;
				} else {
					arg0.anInt8985 = local13.anInt4503;
				}
			} else if (arg1 == 0 && local13.anInt4523 != -1) {
				if (arg2 < 0 && local13.anInt4515 != -1) {
					arg0.anInt8985 = local13.anInt4515;
				} else if (arg2 <= 0 || local13.anInt4500 == -1) {
					arg0.anInt8985 = local13.anInt4523;
				} else {
					arg0.anInt8985 = local13.anInt4500;
				}
			} else if (arg2 < 0 && local13.anInt4511 != -1) {
				arg0.anInt8985 = local13.anInt4511;
			} else if (arg2 <= 0 || local13.anInt4514 == -1) {
				arg0.anInt8985 = local13.anInt4534;
			} else {
				arg0.anInt8985 = local13.anInt4514;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method1448(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub5_Sub8 local12 = Static49.method760(9, arg0);
		local12.method3257();
	}
}
