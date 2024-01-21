import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_77 = Static119.method1462("rot:");

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt185 = 0;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public static int anInt186 = 0;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_78 = Static119.method1462("<br>");

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_79 = Static119.method1462(":trade:");

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_80 = Static119.method1462("sl_stars");

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!bc;")
	public static Class8 aClass8_9 = new Class8(64);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLclient!ba;)V")
	public static void method130(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class7 arg1) {
		if (Static13.aClass7_3 != null) {
			try {
				Static13.aClass7_3.method157();
			} catch (@Pc(16) Exception local16) {
			}
			Static13.aClass7_3 = null;
		}
		Static13.aClass7_3 = arg1;
		Static102.method1662(arg0);
		Static3.aClass2_Sub4_4 = null;
		Static13.aClass2_Sub4_32.anInt1298 = 0;
		anInt182 = 0;
		Static37.aClass2_Sub1_Sub16_1 = null;
		while (true) {
			@Pc(41) Class2_Sub1_Sub16 local41 = (Class2_Sub1_Sub16) Static34.aClass40_9.method854();
			if (local41 == null) {
				while (true) {
					local41 = (Class2_Sub1_Sub16) Static81.aClass40_15.method854();
					if (local41 == null) {
						if (Static134.aByte8 != 0) {
							try {
								@Pc(93) Class2_Sub4 local93 = new Class2_Sub4(4);
								local93.method926(4);
								local93.method926(Static134.aByte8);
								local93.method925(0);
								Static13.aClass7_3.method161(local93.aByteArray20, 4);
							} catch (@Pc(114) IOException local114) {
								try {
									Static13.aClass7_3.method157();
								} catch (@Pc(119) Exception local119) {
								}
								Static76.anInt1705++;
								Static13.aClass7_3 = null;
							}
						}
						Static83.anInt1793 = 0;
						Static127.aLong92 = Static78.method1296();
						return;
					}
					Static39.aClass74_2.method1825(local41);
					Static7.aClass40_3.method849(local41, local41.aLong100);
					Static20.anInt506--;
					Static34.anInt787++;
				}
			}
			Static68.aClass40_23.method849(local41, local41.aLong100);
			Static7.anInt224++;
			Static47.anInt1163--;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BIII)I")
	public static int method131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 & arg1 - 1;
		@Pc(13) int local13 = arg2 / arg1;
		@Pc(27) int local27 = arg0 & arg1 - 1;
		@Pc(31) int local31 = arg0 / arg1;
		@Pc(36) int local36 = Static48.method830(local31, local13);
		@Pc(43) int local43 = Static48.method830(local31, local13 + 1);
		@Pc(50) int local50 = Static48.method830(local31 + 1, local13);
		@Pc(59) int local59 = Static48.method830(local31 + 1, local13 - -1);
		@Pc(66) int local66 = Static52.method881(local43, local9, local36, arg1);
		@Pc(73) int local73 = Static52.method881(local59, local9, local50, arg1);
		return Static52.method881(local73, local27, local66, arg1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method132() {
		aClass8_9 = null;
		aClass65_77 = null;
		aClass65_79 = null;
		aClass65_78 = null;
		aClass65_80 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method133() {
		Static101.aClass10_1.method1861();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static48.aLongArray2[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static117.aLongArray7[local22] = 0L;
		}
		Static50.anInt1216 = 0;
	}
}
