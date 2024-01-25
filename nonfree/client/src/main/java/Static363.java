import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sf", name = "Fb", descriptor = "I")
	public static int anInt6198;

	@OriginalMember(owner = "client!sf", name = "Gb", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
	public static int anInt6169 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIII)V")
	public static void method4978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static194.method2939(true, local35);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!ss;)Z")
	public static boolean method4991(@OriginalArg(1) Class219 arg0) {
		if (Static6.anInt217 == arg0.anInt6384) {
			Static398.anInt6924 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method4998() {
		if (Static239.aClass110_2 != null) {
			Static239.aClass110_2.method4785();
		}
		if (Static220.aClass110_1 != null) {
			Static220.aClass110_1.method4785();
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	public static void method5009() {
		if (Static359.anInt6125 == 0) {
			return;
		}
		try {
			if (++Static452.anInt7817 > 1500) {
				if (Static372.aClass161_6 != null) {
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
				}
				if (Static100.anInt1855 >= 1) {
					Static359.anInt6125 = 0;
					Static430.anInt7428 = -5;
					return;
				}
				if (Static320.anInt5611 == Static231.anInt4160) {
					Static231.anInt4160 = Static194.anInt3509;
				} else {
					Static231.anInt4160 = Static320.anInt5611;
				}
				Static452.anInt7817 = 0;
				Static359.anInt6125 = 1;
				Static100.anInt1855++;
			}
			if (Static359.anInt6125 == 1) {
				Static184.aClass100_3 = Static119.aClass138_7.method3205(Static231.anInt4160, Static136.aString14);
				Static359.anInt6125 = 2;
			}
			@Pc(112) int local112;
			if (Static359.anInt6125 == 2) {
				if (Static184.aClass100_3.anInt2365 == 2) {
					throw new IOException();
				}
				if (Static184.aClass100_3.anInt2365 != 1) {
					return;
				}
				Static372.aClass161_6 = new Class161((Socket) Static184.aClass100_3.anObject4, Static119.aClass138_7);
				Static184.aClass100_3 = null;
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				method4998();
				local112 = Static372.aClass161_6.method3770();
				method4998();
				if (local112 != 101) {
					Static359.anInt6125 = 0;
					Static430.anInt7428 = local112;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					return;
				}
				Static359.anInt6125 = 3;
			}
			if (Static359.anInt6125 == 3 && Static372.aClass161_6.method3765() >= 2) {
				local112 = Static372.aClass161_6.method3770() << 8 | Static372.aClass161_6.method3770();
				Static406.method5488(local112);
				if (Static193.anInt1052 == -1) {
					Static430.anInt7428 = 6;
					Static359.anInt6125 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
				} else {
					Static359.anInt6125 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					Static103.method1573();
				}
			}
		} catch (@Pc(182) IOException local182) {
			if (Static372.aClass161_6 != null) {
				Static372.aClass161_6.method3764();
				Static372.aClass161_6 = null;
			}
			if (Static100.anInt1855 >= 1) {
				Static359.anInt6125 = 0;
				Static430.anInt7428 = -4;
			} else {
				Static452.anInt7817 = 0;
				Static100.anInt1855++;
				if (Static231.anInt4160 == Static320.anInt5611) {
					Static231.anInt4160 = Static194.anInt3509;
				} else {
					Static231.anInt4160 = Static320.anInt5611;
				}
				Static359.anInt6125 = 1;
			}
		}
	}
}
