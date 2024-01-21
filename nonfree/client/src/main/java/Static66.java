import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	public static int anInt1971;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Lclient!rc;")
	private static Class55 aClass55_779 = Static34.method846("The server is being updated)3");

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public static int anInt1970 = 1;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "Lclient!rc;")
	public static Class55 aClass55_780 = null;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_781 = aClass55_779;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!rc;")
	public static Class55 aClass55_782 = Static34.method846("Lade Sprites )2 ");

	@OriginalMember(owner = "client!o", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!rc;")
	public static Class55 aClass55_783 = Static34.method846("backleft1");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method1357() {
		if (!Static3.aBoolean1) {
			return;
		}
		Static8.aClass6_Sub2_Sub2_Sub1_3 = null;
		Static6.aClass21_2 = null;
		Static76.anIntArray214 = null;
		Static111.aClass6_Sub2_Sub2_Sub1_25 = null;
		Static109.aClass21_26 = null;
		Static98.aClass6_Sub2_Sub2_Sub1_23 = null;
		Static44.anIntArray258 = null;
		Static33.aClass6_Sub2_Sub2_Sub1_9 = null;
		Static96.aClass6_Sub2_Sub2_Sub1_21 = null;
		Static99.aClass21_20 = null;
		Static34.aClass6_Sub2_Sub2_Sub1_10 = null;
		Static22.aClass6_Sub2_Sub2_Sub1_6 = null;
		Static103.aClass21_23 = null;
		Static21.aClass21_5 = null;
		Static67.aClass6_Sub2_Sub2_Sub1_15 = null;
		Static107.aClass21_24 = null;
		Static23.aClass21_6 = null;
		Static58.aClass21_13 = null;
		Static3.aBoolean1 = false;
		Static26.aClass6_Sub2_Sub2_Sub1_17 = null;
		Static109.aClass6_Sub2_Sub2_Sub1_24 = null;
		Static85.anIntArray238 = null;
		Static14.aClass21_4 = null;
		Static11.aClass6_Sub2_Sub2_Sub1_4 = null;
		Static81.anIntArray230 = null;
		Static3.anIntArray5 = null;
		Static65.aClass6_Sub2_Sub2_Sub1_14 = null;
		Static65.aClass21_17 = null;
		Static5.aClass6_Sub2_Sub2_Sub1_18 = null;
		Static6.aClass21_1 = null;
		Static43.aClass21_11 = null;
		Static17.aClass6_Sub2_Sub2_Sub1Array15 = null;
		Static97.aClass6_Sub2_Sub2_Sub1_22 = null;
		Static41.anIntArray97 = null;
		Static64.aClass21_16 = null;
		Static102.aClass21_21 = null;
		Static86.aClass21_19 = null;
		Static85.anIntArray237 = null;
		Static26.aClass6_Sub2_Sub2_Sub1_16 = null;
		Static55.aClass6_Sub2_Sub2_Sub1_13 = null;
		Static74.aClass21_15 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZ)Lclient!rc;")
	public static Class55 method1358(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(17) int local17 = arg0 / 10;
		@Pc(19) int local19 = 1;
		while (local17 != 0) {
			local19++;
			local17 /= 10;
		}
		@Pc(30) int local30 = local19;
		if (arg0 < 0 || arg1) {
			local30 = local19 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local30];
		if (arg0 < 0) {
			local43[0] = 45;
		} else if (arg1) {
			local43[0] = 43;
		}
		for (@Pc(59) int local59 = 0; local59 < local19; local59++) {
			@Pc(65) int local65 = arg0 % 10;
			arg0 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local43[local30 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(99) Class55 local99 = new Class55();
		local99.aByteArray12 = local43;
		local99.anInt2411 = local30;
		return local99;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public static void method1359() {
		try {
			@Pc(11) Graphics local11 = Static32.aCanvas1.getGraphics();
			Static14.aClass21_4.method1442(4, local11, 4);
		} catch (@Pc(19) Exception local19) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	public static void method1360() {
		aClass55_780 = null;
		aClass55_779 = null;
		aClass55_783 = null;
		aClass55_782 = null;
		aClass55_781 = null;
		aBooleanArray8 = null;
	}
}
