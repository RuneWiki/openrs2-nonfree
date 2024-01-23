import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
	public static int anInt1303;

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!bo", name = "bb", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!p;I)Lclient!ud;")
	public static Class95_Sub4 method1071(@OriginalArg(0) Class4_Sub17 arg0) {
		return new Class95_Sub4(arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1835(), arg0.method1835(), arg0.method1874());
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V")
	public static void method1073() {
		aFrame3 = null;
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)V")
	public static void method1074() {
		Static152.method2433(Static86.anInt1777);
		@Pc(21) int local21 = (Static170.anInt3385 >> 3) + (Static149.anInt3032 >> 10);
		@Pc(29) int local29 = (Static211.anInt4210 >> 10) + (Static239.anInt4613 >> 3);
		Static207.aByteArrayArray17 = new byte[18][];
		Static262.anIntArray442 = new int[18];
		Static81.aByteArrayArray16 = new byte[18][];
		Static249.aByteArrayArray19 = new byte[18][];
		Static271.anIntArray451 = new int[18];
		Static90.aByteArrayArray9 = new byte[18][];
		Static61.anIntArray133 = new int[18];
		Static22.anIntArray43 = new int[18];
		Static51.anIntArrayArray15 = new int[18][4];
		Static233.anIntArray422 = new int[18];
		Static171.aByteArrayArray13 = new byte[18][];
		Static22.anIntArray42 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(82) int local82;
		for (local82 = (local21 - 6) / 8; local82 <= (local21 + 6) / 8; local82++) {
			for (@Pc(99) int local99 = (local29 - 6) / 8; local99 <= (local29 + 6) / 8; local99++) {
				@Pc(112) int local112 = local99 + (local82 << 8);
				Static262.anIntArray442[local76] = local112;
				Static233.anIntArray422[local76] = Static106.aClass98_65.method2376("m" + local82 + "_" + local99);
				Static22.anIntArray43[local76] = Static106.aClass98_65.method2376("l" + local82 + "_" + local99);
				Static22.anIntArray42[local76] = Static106.aClass98_65.method2376("n" + local82 + "_" + local99);
				Static61.anIntArray133[local76] = Static106.aClass98_65.method2376("um" + local82 + "_" + local99);
				Static271.anIntArray451[local76] = Static106.aClass98_65.method2376("ul" + local82 + "_" + local99);
				if (Static22.anIntArray42[local76] == -1) {
					Static233.anIntArray422[local76] = -1;
					Static22.anIntArray43[local76] = -1;
					Static61.anIntArray133[local76] = -1;
					Static271.anIntArray451[local76] = -1;
				}
				local76++;
			}
		}
		for (local82 = local76; local82 < Static22.anIntArray42.length; local82++) {
			Static22.anIntArray42[local82] = -1;
			Static233.anIntArray422[local82] = -1;
			Static22.anIntArray43[local82] = -1;
			Static61.anIntArray133[local82] = -1;
			Static271.anIntArray451[local82] = -1;
		}
		Static121.method2054(0, 8, false, local21, local29, 8, true);
	}
}
