import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "[I")
	public static final int[] anIntArray292 = new int[4];

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	public static int anInt3729 = -1;

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
	public static int anInt3736 = 0;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_133 = new Class214(64, -1);

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
	public static int anInt3737 = 0;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_47 = new Class21("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!tf;B)V")
	public static void method3358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240 arg2) {
		if (arg2.aByte84 == 0) {
			arg2.anInt6879 = arg2.anInt6913;
		} else if (arg2.aByte84 == 1) {
			arg2.anInt6879 = (arg1 - arg2.anInt6894) / 2 + arg2.anInt6913;
		} else if (arg2.aByte84 == 2) {
			arg2.anInt6879 = arg1 - arg2.anInt6913 - arg2.anInt6894;
		} else if (arg2.aByte84 == 3) {
			arg2.anInt6879 = arg1 * arg2.anInt6913 >> 14;
		} else if (arg2.aByte84 == 4) {
			arg2.anInt6879 = (arg1 - arg2.anInt6894) / 2 + (arg2.anInt6913 * arg1 >> 14);
		} else {
			arg2.anInt6879 = arg1 - arg2.anInt6894 - (arg2.anInt6913 * arg1 >> 14);
		}
		if (arg2.aByte83 == 0) {
			arg2.anInt6862 = arg2.anInt6920;
		} else if (arg2.aByte83 == 1) {
			arg2.anInt6862 = (arg0 - arg2.anInt6904) / 2 + arg2.anInt6920;
		} else if (arg2.aByte83 == 2) {
			arg2.anInt6862 = arg0 - arg2.anInt6904 - arg2.anInt6920;
		} else if (arg2.aByte83 == 3) {
			arg2.anInt6862 = arg2.anInt6920 * arg0 >> 14;
		} else if (arg2.aByte83 == 4) {
			arg2.anInt6862 = (arg0 * arg2.anInt6920 >> 14) + (arg0 - arg2.anInt6904) / 2;
		} else {
			arg2.anInt6862 = arg0 - (arg0 * arg2.anInt6920 >> 14) - arg2.anInt6904;
		}
		if (!Static341.aBoolean453 || Static50.method1146(arg2).anInt7357 == 0 && arg2.anInt6873 != 0) {
			return;
		}
		if (arg2.anInt6879 < 0) {
			arg2.anInt6879 = 0;
		} else if (arg1 < arg2.anInt6894 + arg2.anInt6879) {
			arg2.anInt6879 = arg1 - arg2.anInt6894;
		}
		if (arg2.anInt6862 < 0) {
			arg2.anInt6862 = 0;
		} else if (arg2.anInt6862 + arg2.anInt6904 > arg0) {
			arg2.anInt6862 = arg0 - arg2.anInt6904;
			return;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)I")
	public static int method3362(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method3363(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(59) char local59;
			if (local17 == '\u0000') {
				local59 = arg0.charAt(local13++);
			} else {
				local59 = local17;
			}
			@Pc(69) char local69;
			if (local19 == '\u0000') {
				local69 = arg1.charAt(local15++);
			} else {
				local69 = local19;
			}
			local17 = Static148.method5169(local59);
			local19 = Static148.method5169(local69);
			local59 = Static89.method1783(arg2, local59);
			local69 = Static89.method1783(arg2, local69);
			if (local69 != local59 && Character.toUpperCase(local59) != Character.toUpperCase(local69)) {
				local59 = Character.toLowerCase(local59);
				local69 = Character.toLowerCase(local69);
				if (local69 != local59) {
					return Static446.method6090(arg2, local59) - Static446.method6090(arg2, local69);
				}
			}
		}
		@Pc(127) int local127 = Math.min(local8, local11);
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			if (arg2 == 2) {
				local15 = local11 - local129 - 1;
				local13 = local8 - local129 - 1;
			} else {
				local15 = local129;
				local13 = local129;
			}
			@Pc(160) char local160 = arg0.charAt(local13);
			@Pc(164) char local164 = arg1.charAt(local15);
			if (local164 != local160 && Character.toUpperCase(local160) != Character.toUpperCase(local164)) {
				local160 = Character.toLowerCase(local160);
				local164 = Character.toLowerCase(local164);
				if (local164 != local160) {
					return Static446.method6090(arg2, local160) - Static446.method6090(arg2, local164);
				}
			}
		}
		@Pc(211) int local211 = local8 - local11;
		if (local211 != 0) {
			return local211;
		}
		for (@Pc(225) int local225 = 0; local225 < local127; local225++) {
			@Pc(231) char local231 = arg0.charAt(local225);
			@Pc(235) char local235 = arg1.charAt(local225);
			if (local231 != local235) {
				return Static446.method6090(arg2, local231) - Static446.method6090(arg2, local235);
			}
		}
		return 0;
	}
}
