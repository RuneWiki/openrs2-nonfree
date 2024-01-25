import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!fg;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt8986;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "I")
	public static int anInt8990;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_54 = new Class112(4);

	@OriginalMember(owner = "client!se", name = "z", descriptor = "J")
	public static long aLong222 = 0L;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "[I")
	public static final int[] anIntArray564 = new int[4];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I")
	public static int method7397(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIBLclient!gaa;I)V")
	public static void method7402(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class108 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt4067;
		if (arg2.aByte50 == 0) {
			arg2.anInt4067 = arg2.anInt4087;
		} else if (arg2.aByte50 == 1) {
			arg2.anInt4067 = arg3 - arg2.anInt4087;
		} else if (arg2.aByte50 == 2) {
			arg2.anInt4067 = arg2.anInt4087 * arg3 >> 14;
		}
		@Pc(49) int local49 = arg2.anInt4037;
		if (arg2.aByte47 == 0) {
			arg2.anInt4037 = arg2.anInt4030;
		} else if (arg2.aByte47 == 1) {
			arg2.anInt4037 = arg1 - arg2.anInt4030;
		} else if (arg2.aByte47 == 2) {
			arg2.anInt4037 = arg1 * arg2.anInt4030 >> 14;
		}
		if (arg2.aByte50 == 4) {
			arg2.anInt4067 = arg2.anInt4037 * arg2.anInt4034 / arg2.anInt4086;
		}
		if (arg2.aByte47 == 4) {
			arg2.anInt4037 = arg2.anInt4086 * arg2.anInt4067 / arg2.anInt4034;
		}
		if (Static401.aBoolean650 && (Static71.method1836(arg2).anInt1134 != 0 || arg2.anInt4018 == 0)) {
			if (arg2.anInt4037 < 5 && arg2.anInt4067 < 5) {
				arg2.anInt4037 = 5;
				arg2.anInt4067 = 5;
			} else {
				if (arg2.anInt4037 <= 0) {
					arg2.anInt4037 = 5;
				}
				if (arg2.anInt4067 <= 0) {
					arg2.anInt4067 = 5;
				}
			}
		}
		if (arg2.anInt4031 == Static527.anInt9098) {
			Static397.aClass108_9 = arg2;
		}
		if (arg0 && arg2.anObjectArray14 != null && (local8 != arg2.anInt4067 || local49 != arg2.anInt4037)) {
			@Pc(197) Class3_Sub51 local197 = new Class3_Sub51();
			local197.anObjectArray33 = arg2.anObjectArray14;
			local197.aClass108_13 = arg2;
			Static306.aClass276_42.method6906(local197);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/net/Socket;BI)Lclient!cr;")
	public static Class51 method7403(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class51_Sub1(arg0, 7500);
	}
}
