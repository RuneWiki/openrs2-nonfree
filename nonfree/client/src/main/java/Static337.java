import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!lfa", name = "C", descriptor = "Ljava/lang/Class;")
	private static Class aClass16;

	// $FF: synthetic field
	@OriginalMember(owner = "client!lfa", name = "L", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)I")
	public static int method5133() {
		@Pc(7) int local7 = 0;
		@Pc(20) Field[] local20 = (aClass16 == null ? (aClass16 = Class5_Sub1_Sub17.a("hia")) : aClass16).getDeclaredFields();
		for (@Pc(30) int local30 = 0; local30 < local20.length; local30++) {
			@Pc(36) Field local36 = local20[local30];
			if ((aClass17 == null ? (aClass17 = Class5_Sub1_Sub17.a("gja")) : aClass17).isAssignableFrom(local36.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(Z)V")
	public static void method5134() {
		if (Static222.anInt3623 == 0) {
			return;
		}
		try {
			if (++Static436.anInt7486 > 2000) {
				if (Static492.aClass295_1 != null) {
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
				}
				if (Static467.anInt7942 >= 2) {
					Static67.anInt1085 = -5;
					Static222.anInt3623 = 0;
					return;
				}
				Static71.aClass54_5.method825();
				Static436.anInt7486 = 0;
				Static467.anInt7942++;
				Static222.anInt3623 = 1;
			}
			if (Static222.anInt3623 == 1) {
				Static186.aClass366_2 = Static71.aClass54_5.method826(Static294.aClass230_3);
				Static222.anInt3623 = 2;
			}
			if (Static222.anInt3623 == 2) {
				if (Static186.aClass366_2.anInt10206 == 2) {
					throw new IOException();
				}
				if (Static186.aClass366_2.anInt10206 != 1) {
					return;
				}
				Static492.aClass295_1 = Static95.method1405((Socket) Static186.aClass366_2.anObject18);
				Static186.aClass366_2 = null;
				Static253.method3720();
				Static222.anInt3623 = 4;
			}
			if (Static222.anInt3623 == 4) {
				if (!Static492.aClass295_1.method7021(1)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				@Pc(123) int local123 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
				Static222.anInt3623 = 0;
				Static67.anInt1085 = local123;
				Static492.aClass295_1.method7023();
				Static492.aClass295_1 = null;
				return;
			}
		} catch (@Pc(134) IOException local134) {
			if (Static492.aClass295_1 != null) {
				Static492.aClass295_1.method7023();
				Static492.aClass295_1 = null;
			}
			if (Static467.anInt7942 < 2) {
				Static71.aClass54_5.method825();
				Static222.anInt3623 = 1;
				Static436.anInt7486 = 0;
				Static467.anInt7942++;
			} else {
				Static67.anInt1085 = -4;
				Static222.anInt3623 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)Z")
	public static boolean method5135() {
		if (Static301.aBoolean679) {
			try {
				Static681.method743(Static492.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5136(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static387.method5648(-1, -1, arg1, arg0);
	}
}
