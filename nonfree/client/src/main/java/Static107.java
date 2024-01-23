import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_786 = null;

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_787 = Static64.method1101("hitbar_default");

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_788 = Static64.method1101("blinken1:");

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_789 = Static64.method1101(")1");

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array12 = new Class51[1000];

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "S")
	public static short aShort11 = 32767;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "Z")
	public static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	public static void method1834(@OriginalArg(1) boolean arg0) {
		Static45.aBoolean52 = arg0;
		Static154.aBoolean161 = !Static112.method1883();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z[B)V")
	public static void method1835(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = 0;
		while (true) {
			while (local11 < arg0.length) {
				@Pc(25) int local25 = (arg0[local11++] & 0xFF) * 64 - Static200.anInt4248;
				@Pc(36) int local36 = (arg0[local11++] & 0xFF) * 64 - Static108.anInt2405;
				@Pc(82) byte local82;
				@Pc(61) int local61;
				if (local25 > 0 && local36 > 0 && Static3.anInt75 > local25 + 64 && local36 + 64 < Static87.anInt2017) {
					local61 = local25 >> 6;
					@Pc(69) int local69 = Static87.anInt2017 - local36 - 1 >> 6;
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						for (@Pc(75) int local75 = -64; local75 < 0; local75++) {
							local82 = arg0[local11++];
							if (local82 != 0) {
								if (Static203.aByteArrayArrayArray11[local61][local69] == null) {
									Static203.aByteArrayArrayArray11[local61][local69] = new byte[4096];
								}
								Static203.aByteArrayArrayArray11[local61][local69][local71 + (-(local75 + 1) << 6)] = local82;
								@Pc(117) byte local117 = arg0[local11++];
								if (Static71.aByteArrayArrayArray6[local61][local69] == null) {
									Static71.aByteArrayArrayArray6[local61][local69] = new byte[4096];
								}
								Static71.aByteArrayArrayArray6[local61][local69][(-(local75 + 1) << 6) + local71] = local117;
							}
						}
					}
				} else {
					for (local61 = -4096; local61 < 0; local61++) {
						local82 = arg0[local11++];
						if (local82 != 0) {
							local11++;
						}
					}
				}
			}
			return;
		}
	}
}
