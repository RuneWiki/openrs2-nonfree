import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "[B")
	public static byte[] aByteArray9;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
	public static int anInt1236;

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
	public static int anInt1237;

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "Lclient!ff;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!rd;")
	public static Class64 aClass64_776 = Static69.method1153("(Udns");

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Lclient!md;")
	public static Class50 aClass50_7 = new Class50();

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	public static int anInt1231 = 0;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Lclient!rd;")
	private static Class64 aClass64_777 = Static69.method1153("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "Lclient!rd;")
	private static Class64 aClass64_778 = Static69.method1153("Unexpected server response");

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_779 = aClass64_778;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_780 = Static69.method1153(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_781 = Static69.method1153("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_782 = aClass64_777;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	public static void method931() {
		aClass64_780 = null;
		aClass64_777 = null;
		aClass64_778 = null;
		aClass64_782 = null;
		aClass64_776 = null;
		aByteArray9 = null;
		aClass64_781 = null;
		aClass27_3 = null;
		aClass50_7 = null;
		aClass64_779 = null;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	public static void method932() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static64.anIntArray228[local9 + 32512] = 255;
			}
		}
		@Pc(51) int local51;
		@Pc(44) int local44;
		@Pc(57) int local57;
		for (local16 = 0; local16 < 100; local16++) {
			local44 = (int) (Math.random() * 128.0D) + 128;
			local51 = (int) (Math.random() * 124.0D) + 2;
			local57 = local51 + (local44 << 7);
			Static64.anIntArray228[local57] = 192;
		}
		for (local51 = 1; local51 < 255; local51++) {
			for (local44 = 1; local44 < 127; local44++) {
				local57 = (local51 << 7) + local44;
				Static52.anIntArray449[local57] = (Static64.anIntArray228[local57 + 128] + Static64.anIntArray228[local57 - 128] + Static64.anIntArray228[local57 + 1] + Static64.anIntArray228[local57 + -1]) / 4;
			}
		}
		Static30.anInt787 += 128;
		if (Static6.anIntArray47.length < Static30.anInt787) {
			Static30.anInt787 -= Static6.anIntArray47.length;
			local44 = (int) (Math.random() * 12.0D);
			Static38.method685(Static15.aClass1_Sub1_Sub5_Sub3Array1[local44]);
		}
		@Pc(158) int local158;
		for (local44 = 1; local44 < 255; local44++) {
			for (local57 = 1; local57 < 127; local57++) {
				local158 = local57 + (local44 << 7);
				@Pc(178) int local178 = Static52.anIntArray449[local158 + 128] - Static6.anIntArray47[Static30.anInt787 + local158 & Static6.anIntArray47.length + -1] / 5;
				if (local178 < 0) {
					local178 = 0;
				}
				Static64.anIntArray228[local158] = local178;
			}
		}
		for (local57 = 0; local57 < 255; local57++) {
			Static28.anIntArray356[local57] = Static28.anIntArray356[local57 + 1];
		}
		Static28.anIntArray356[255] = (int) (Math.sin((double) Static15.anInt471 / 14.0D) * 16.0D + Math.sin((double) Static15.anInt471 / 15.0D) * 14.0D + Math.sin((double) Static15.anInt471 / 16.0D) * 12.0D);
		if (Static50.anInt1201 > 0) {
			Static50.anInt1201 -= 4;
		}
		if (Static40.anInt927 > 0) {
			Static40.anInt927 -= 4;
		}
		if (Static50.anInt1201 != 0 || Static40.anInt927 != 0) {
			return;
		}
		local158 = (int) (Math.random() * 2000.0D);
		if (local158 == 1) {
			Static40.anInt927 = 1024;
		}
		if (local158 == 0) {
			Static50.anInt1201 = 1024;
			return;
		}
	}
}
