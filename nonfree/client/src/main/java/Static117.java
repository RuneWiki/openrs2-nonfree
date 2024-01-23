import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public static int anInt2405;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
	public static int[] anIntArray170 = new int[25];

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Loaded title screen";

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
	public static int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method2129() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static273.aClass96_27.method2340(); local10 != null; local10 = (Class1_Sub4) Static273.aClass96_27.method2342()) {
			if (local10.anInt329 > 0) {
				local10.anInt329--;
			}
			if (local10.anInt329 != 0) {
				if (local10.anInt318 > 0) {
					local10.anInt318--;
				}
				if (local10.anInt318 == 0 && local10.anInt325 >= 1 && local10.anInt333 >= 1 && local10.anInt325 <= 102 && local10.anInt333 <= 102 && (local10.anInt324 < 0 || Static78.method1608(local10.anInt324, local10.anInt331))) {
					Static307.method4582(local10.anInt325, local10.anInt326, local10.anInt333, local10.anInt331, local10.anInt324, local10.anInt323, local10.anInt319);
					local10.anInt318 = -1;
					if (local10.anInt324 == local10.anInt317 && local10.anInt317 == -1) {
						local10.method4573();
					} else if (local10.anInt324 == local10.anInt317 && local10.anInt326 == local10.anInt322 && local10.anInt331 == local10.anInt332) {
						local10.method4573();
					}
				}
			} else if (local10.anInt317 < 0 || Static78.method1608(local10.anInt317, local10.anInt332)) {
				Static307.method4582(local10.anInt325, local10.anInt322, local10.anInt333, local10.anInt332, local10.anInt317, local10.anInt323, local10.anInt319);
				local10.method4573();
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method2130() {
		Static22.aClass175_4.method4287();
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I")
	public static int method2131() {
		try {
			if (Static189.anInt3640 == 0) {
				if (Static145.aLong103 > Static244.method3859() - 5000L) {
					return 0;
				}
				Static224.aClass153_5 = Static222.aClass176_3.method4371(Static292.aString210, Static203.anInt3367);
				Static2.aLong4 = Static244.method3859();
				Static189.anInt3640 = 1;
			}
			if (Static2.aLong4 + 30000L < Static244.method3859()) {
				return Static286.method4304(1000);
			}
			@Pc(92) int local92;
			@Pc(130) int local130;
			if (Static189.anInt3640 == 1) {
				if (Static224.aClass153_5.anInt4614 == 2) {
					return Static286.method4304(1001);
				}
				if (Static224.aClass153_5.anInt4614 != 1) {
					return -1;
				}
				Static97.aClass49_2 = new Class49((Socket) Static224.aClass153_5.anObject6, Static222.aClass176_3);
				Static224.aClass153_5 = null;
				Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
				local92 = 0;
				if (Static179.aBoolean302) {
					local92 = Static280.anInt5135;
				}
				Static116.aClass1_Sub13_Sub1_48.method1822(23);
				Static116.aClass1_Sub13_Sub1_48.method1851(local92);
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				local130 = Static97.aClass49_2.method1301();
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				if (local130 != 0) {
					return Static286.method4304(local130);
				}
				Static189.anInt3640 = 2;
			}
			if (Static189.anInt3640 == 2) {
				if (Static97.aClass49_2.method1300() < 2) {
					return -1;
				}
				Static31.anInt569 = Static97.aClass49_2.method1301();
				Static31.anInt569 <<= 0x8;
				Static31.anInt569 += Static97.aClass49_2.method1301();
				Static189.anInt3640 = 3;
				Static148.aByteArray91 = new byte[Static31.anInt569];
				Static311.anInt5588 = 0;
			}
			if (Static189.anInt3640 != 3) {
				return -1;
			}
			local92 = Static97.aClass49_2.method1300();
			if (local92 < 1) {
				return -1;
			}
			if (local92 > Static31.anInt569 - Static311.anInt5588) {
				local92 = Static31.anInt569 - Static311.anInt5588;
			}
			Static97.aClass49_2.method1303(Static311.anInt5588, Static148.aByteArray91, local92);
			Static311.anInt5588 += local92;
			if (Static311.anInt5588 < Static31.anInt569) {
				return -1;
			} else if (Static305.method4553(Static148.aByteArray91)) {
				Static25.aClass4_Sub1Array3 = new Class4_Sub1[Static21.anInt448];
				local130 = 0;
				for (@Pc(242) int local242 = Static310.anInt5535; local242 <= Static103.anInt2199; local242++) {
					@Pc(249) Class4_Sub1 local249 = Static235.method3787(local242);
					if (local249 != null) {
						Static25.aClass4_Sub1Array3[local130++] = local249;
					}
				}
				Static97.aClass49_2.method1307();
				Static189.anInt3640 = 0;
				Static97.aClass49_2 = null;
				Static22.anInt452 = 0;
				Static148.aByteArray91 = null;
				Static145.aLong103 = Static244.method3859();
				return 0;
			} else {
				return Static286.method4304(1002);
			}
		} catch (@Pc(277) IOException local277) {
			return Static286.method4304(1003);
		}
	}
}
