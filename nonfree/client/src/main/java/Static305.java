import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	public static boolean aBoolean426;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt6003;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static int anInt6006 = 127;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public static int anInt6008 = 0;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString229 = "K";

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!rg;ZI)V")
	public static void method4914(@OriginalArg(1) int arg0, @OriginalArg(2) Class151 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt4773;
		@Pc(15) int local15 = arg1.anInt4751;
		if (arg1.aByte26 == 0) {
			arg1.anInt4773 = arg1.anInt4761;
		} else if (arg1.aByte26 == 1) {
			arg1.anInt4773 = arg3 - arg1.anInt4761;
		} else if (arg1.aByte26 == 2) {
			arg1.anInt4773 = arg1.anInt4761 * arg3 >> 14;
		} else if (arg1.aByte26 == 3) {
			if (arg1.anInt4721 == 2) {
				arg1.anInt4773 = arg1.anInt4723 * (arg1.anInt4761 - 1) + arg1.anInt4761 * 32;
			} else if (arg1.anInt4721 == 7) {
				arg1.anInt4773 = arg1.anInt4723 * (arg1.anInt4761 - 1) + arg1.anInt4761 * 115;
			}
		}
		if (arg1.aByte27 == 0) {
			arg1.anInt4751 = arg1.anInt4792;
		} else if (arg1.aByte27 == 1) {
			arg1.anInt4751 = arg0 - arg1.anInt4792;
		} else if (arg1.aByte27 == 2) {
			arg1.anInt4751 = arg1.anInt4792 * arg0 >> 14;
		} else if (arg1.aByte27 == 3) {
			if (arg1.anInt4721 == 2) {
				arg1.anInt4751 = arg1.anInt4771 * (arg1.anInt4792 - 1) + arg1.anInt4792 * 32;
			} else if (arg1.anInt4721 == 7) {
				arg1.anInt4751 = arg1.anInt4771 * (arg1.anInt4792 - 1) + arg1.anInt4792 * 12;
			}
		}
		if (arg1.aByte26 == 4) {
			arg1.anInt4773 = arg1.anInt4751 * arg1.anInt4789 / arg1.anInt4759;
		}
		if (arg1.aByte27 == 4) {
			arg1.anInt4751 = arg1.anInt4773 * arg1.anInt4759 / arg1.anInt4789;
		}
		if (Static244.aBoolean346 && (Static42.method612(arg1).anInt5831 != 0 || arg1.anInt4721 == 0)) {
			if (arg1.anInt4751 < 5 && arg1.anInt4773 < 5) {
				arg1.anInt4751 = 5;
				arg1.anInt4773 = 5;
			} else {
				if (arg1.anInt4773 <= 0) {
					arg1.anInt4773 = 5;
				}
				if (arg1.anInt4751 <= 0) {
					arg1.anInt4751 = 5;
				}
			}
		}
		if (arg1.anInt4797 == 1337) {
			Static186.aClass151_9 = arg1;
		}
		if (arg2 && arg1.anObjectArray6 != null && (arg1.anInt4773 != local8 || local15 != arg1.anInt4751)) {
			@Pc(292) Class3_Sub24 local292 = new Class3_Sub24();
			local292.aClass151_13 = arg1;
			local292.anObjectArray1 = arg1.anObjectArray6;
			Static5.aClass56_1.method1282(local292);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method4915() {
		Static108.aClass98_14.method2565(5);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIJIZ)Ljava/lang/String;")
	public static String method4916(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(3) char local3 = ',';
		@Pc(5) char local5 = '.';
		@Pc(11) boolean local11 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local11 = true;
		}
		if (arg0 == 0) {
			local5 = ',';
			local3 = '.';
		}
		if (arg0 == 2) {
			local5 = ' ';
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(26);
		@Pc(47) int local47;
		if (arg2 > 0) {
			for (local47 = 0; local47 < arg2; local47++) {
				@Pc(57) int local57 = (int) arg1;
				arg1 /= 10L;
				local42.append((char) (local57 + 48 - (int) arg1 * 10));
			}
			local42.append(local3);
		}
		local47 = 0;
		while (true) {
			@Pc(94) int local94 = (int) arg1;
			arg1 /= 10L;
			local42.append((char) (local94 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local11) {
					local42.append('-');
				}
				return local42.reverse().toString();
			}
			if (arg3) {
				local47++;
				if (local47 % 3 == 0) {
					local42.append(local5);
				}
			}
		}
	}
}
