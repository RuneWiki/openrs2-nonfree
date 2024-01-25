import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "Z")
	public static boolean aBoolean711;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_141 = new Class71(41, 3);

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public static void method8106() {
		if (Static197.aFrame1 != null) {
			return;
		}
		@Pc(18) int local18 = Static508.anInt8942;
		@Pc(20) int local20 = Static34.anInt8073;
		@Pc(28) int local28 = Static354.anInt6829 - local18 - Static235.anInt5298;
		@Pc(36) int local36 = Static69.anInt7730 - Static313.anInt6355 - local20;
		if (local18 <= 0 && local28 <= 0 && local20 <= 0 && local36 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static602.aFrame3 != null) {
				local54 = Static602.aFrame3;
			} else if (Static152.anApplet1 == null) {
				local54 = Static370.anApplet_Sub1_1;
			} else {
				local54 = Static152.anApplet1;
			}
			@Pc(66) int local66 = 0;
			@Pc(68) int local68 = 0;
			if (local54 == Static602.aFrame3) {
				@Pc(74) Insets local74 = Static602.aFrame3.getInsets();
				local68 = local74.top;
				local66 = local74.left;
			}
			@Pc(83) Graphics local83 = local54.getGraphics();
			local83.setColor(Color.black);
			if (local18 > 0) {
				local83.fillRect(local66, local68, local18, Static69.anInt7730);
			}
			if (local20 > 0) {
				local83.fillRect(local66, local68, Static354.anInt6829, local20);
			}
			if (local28 > 0) {
				local83.fillRect(local66 + Static354.anInt6829 - local28, local68, local28, Static69.anInt7730);
			}
			if (local36 > 0) {
				local83.fillRect(local66, Static69.anInt7730 + local68 - local36, Static354.anInt6829, local36);
				return;
			}
		} catch (@Pc(134) Exception local134) {
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public static void method8107() {
		Static72.method1882();
		@Pc(12) int local12 = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382();
		if (local12 == 2) {
			Static365.method5685(Static171.aClass16_5, Static235.anInt5298, Static313.anInt6355);
		} else if (local12 == 3) {
			Static38.method1270(Static171.aClass16_5, Static23.anInt1014, Static235.anInt5298, Static292.anInt5942, Static313.anInt6355);
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7385()) {
			Static188.method3577(Static549.aCanvas13);
		}
		if (Static171.aClass16_5 != null) {
			Static45.method1364();
		}
		Static183.aBoolean308 = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382() != 0;
		Static513.aBoolean642 = Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7385();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;[BIB)I")
	public static int method8109(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static291.method4857(arg0.charAt(local12));
			@Pc(35) int local35 = local10 > local12 + 1 ? Static291.method4857(arg0.charAt(local12 + 1)) : -1;
			@Pc(50) int local50 = local12 + 2 < local10 ? Static291.method4857(arg0.charAt(local12 + 2)) : -1;
			@Pc(65) int local65 = local12 + 3 >= local10 ? -1 : Static291.method4857(arg0.charAt(local12 + 3));
			arg1[arg2++] = (byte) (local20 << 2 | local35 >>> 4);
			if (local50 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local50 >>> 2 | (local35 & 0xF) << 4);
			if (local65 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local50 & 0x3) << 6 | local65);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)Z")
	public static boolean method8110(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class8_Sub5_Sub7 local15 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local15 != null; local15 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
			if (Static95.method2218(local15.anInt3779) && (long) arg0 == local15.aLong93) {
				return true;
			}
		}
		return false;
	}
}
