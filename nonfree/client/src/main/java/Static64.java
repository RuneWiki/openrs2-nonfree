import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt1223;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public static boolean aBoolean77;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt1228 = 127;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
	public static int[] anIntArray112 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method1152(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static184.method3002();
		} else if (arg0 == 2) {
			Static85.method1596();
		} else if (arg0 == 3) {
			Static224.method3479();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method1153(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(10) int local10 = 0;
		@Pc(13) String local13 = arg0.toLowerCase();
		for (@Pc(15) int local15 = 0; local15 < Static131.anInt2608; local15++) {
			@Pc(22) Class102 local22 = Static49.method909(local15);
			if ((!arg1 || local22.aBoolean218) && local22.anInt3224 == -1 && local22.anInt3207 == -1 && local22.anInt3169 == 0 && local22.aString181.toLowerCase().indexOf(local13) != -1) {
				if (local10 >= 250) {
					Static86.aShortArray35 = null;
					Static136.anInt2742 = -1;
					return;
				}
				if (local8.length <= local10) {
					@Pc(75) short[] local75 = new short[local8.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local10; local77++) {
						local75[local77] = local8[local77];
					}
					local8 = local75;
				}
				local8[local10++] = (short) local15;
			}
		}
		Static169.anInt3314 = 0;
		Static136.anInt2742 = local10;
		Static86.aShortArray35 = local8;
		@Pc(109) String[] local109 = new String[Static136.anInt2742];
		for (@Pc(119) int local119 = 0; local119 < Static136.anInt2742; local119++) {
			local109[local119] = Static49.method909(local8[local119]).aString181;
		}
		Static196.method3169(Static86.aShortArray35, local109);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1154() {
		Static306.anIntArray482 = Static30.method496(0.4F);
	}
}
