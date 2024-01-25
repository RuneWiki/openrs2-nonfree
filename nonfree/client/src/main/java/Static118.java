import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
	public static int anInt2260;

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
	public static int anInt2240 = 0;

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
	public static int anInt2251 = 0;

	@OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
	public static int anInt2258 = 0;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
	public static void method2408() {
		@Pc(5) Class70 local5 = Static126.aClass70_40;
		synchronized (Static126.aClass70_40) {
			Static126.aClass70_40.method1397(5);
		}
		local5 = Static108.aClass70_34;
		synchronized (Static108.aClass70_34) {
			Static108.aClass70_34.method1397(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2411(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) char[] local19 = new char[local16];
		@Pc(21) byte local21 = 2;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(29) char local29 = arg0.charAt(local23);
			if (local21 == 0) {
				local29 = Character.toLowerCase(local29);
			} else if (local21 == 2 || Character.isUpperCase(local29)) {
				local29 = Static224.method3950(local29);
			}
			if (Character.isLetter(local29)) {
				local21 = 0;
			} else if (local29 == '.' || local29 == '?' || local29 == '!') {
				local21 = 2;
			} else if (!Character.isSpaceChar(local29)) {
				local21 = 1;
			} else if (local21 != 2) {
				local21 = 1;
			}
			local19[local23] = local29;
		}
		return new String(local19);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIILclient!mb;)V")
	public static void method2412(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class132 arg3) {
		@Pc(8) int local8 = arg3.anInt3507;
		if (arg3.aByte57 == 0) {
			arg3.anInt3507 = arg3.anInt3580;
		} else if (arg3.aByte57 == 1) {
			arg3.anInt3507 = arg0 - arg3.anInt3580;
		} else if (arg3.aByte57 == 2) {
			arg3.anInt3507 = arg3.anInt3580 * arg0 >> 14;
		} else if (arg3.aByte57 == 3) {
			if (arg3.anInt3524 == 2) {
				arg3.anInt3507 = (arg3.anInt3580 - 1) * arg3.anInt3511 + arg3.anInt3580 * 32;
			} else if (arg3.anInt3524 == 7) {
				arg3.anInt3507 = (arg3.anInt3580 - 1) * arg3.anInt3511 + arg3.anInt3580 * 115;
			}
		}
		@Pc(96) int local96 = arg3.anInt3503;
		if (arg3.aByte56 == 0) {
			arg3.anInt3503 = arg3.anInt3536;
		} else if (arg3.aByte56 == 1) {
			arg3.anInt3503 = arg2 - arg3.anInt3536;
		} else if (arg3.aByte56 == 2) {
			arg3.anInt3503 = arg2 * arg3.anInt3536 >> 14;
		} else if (arg3.aByte56 == 3) {
			if (arg3.anInt3524 == 2) {
				arg3.anInt3503 = arg3.anInt3536 * 32 + (arg3.anInt3536 - 1) * arg3.anInt3501;
			} else if (arg3.anInt3524 == 7) {
				arg3.anInt3503 = arg3.anInt3536 * 12 + arg3.anInt3501 * (arg3.anInt3536 - 1);
			}
		}
		if (arg3.aByte57 == 4) {
			arg3.anInt3507 = arg3.anInt3503 * arg3.anInt3554 / arg3.anInt3525;
		}
		if (arg3.aByte56 == 4) {
			arg3.anInt3503 = arg3.anInt3525 * arg3.anInt3507 / arg3.anInt3554;
		}
		if (Static249.aBoolean326 && (Static43.method751(arg3).anInt5011 != 0 || arg3.anInt3524 == 0)) {
			if (arg3.anInt3503 < 5 && arg3.anInt3507 < 5) {
				arg3.anInt3507 = 5;
				arg3.anInt3503 = 5;
			} else {
				if (arg3.anInt3507 <= 0) {
					arg3.anInt3507 = 5;
				}
				if (arg3.anInt3503 <= 0) {
					arg3.anInt3503 = 5;
				}
			}
		}
		if (arg3.anInt3539 == 1337) {
			Static79.aClass132_4 = arg3;
		}
		if (arg1 && arg3.anObjectArray5 != null && (arg3.anInt3507 != local8 || local96 != arg3.anInt3503)) {
			@Pc(287) Class6_Sub15 local287 = new Class6_Sub15();
			local287.anObjectArray2 = arg3.anObjectArray5;
			local287.aClass132_5 = arg3;
			Static116.aClass211_18.method5585(local287);
		}
	}
}
