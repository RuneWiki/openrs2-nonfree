import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!qg;")
	public static Class87 aClass87_27;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_351 = new Class123(15, 2);

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "S")
	public static short aShort89 = 256;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_137 = new Class92(24, -1);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public static final int anInt6784 = 50;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "[I")
	public static final int[] anIntArray463 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
	public static final int[] anIntArray464 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
	public static final int[] anIntArray465 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
	public static final int[] anIntArray466 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "[I")
	public static final int[] anIntArray467 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
	public static final int[] anIntArray468 = new int[anInt6784];

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[anInt6784];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIZII)V")
	public static void method5649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static264.aFrame2 != null && (arg0 != 3 || arg4 != Static291.aClass28_Sub1_1.anInt1031 || Static291.aClass28_Sub1_1.anInt1024 != arg1)) {
			Static298.method4403(Static264.aFrame2, Static45.aClass209_127);
			Static264.aFrame2 = null;
		}
		if (arg0 == 3 && Static264.aFrame2 == null) {
			Static264.aFrame2 = Static385.method5704(Static45.aClass209_127, arg1, arg4, 0);
			if (Static264.aFrame2 != null) {
				Static291.aClass28_Sub1_1.anInt1024 = arg1;
				Static291.aClass28_Sub1_1.anInt1031 = arg4;
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
			}
		}
		if (arg0 == 3 && Static264.aFrame2 == null) {
			method5649(Static291.aClass28_Sub1_1.anInt1023, -1, true, arg3, -1);
			return;
		}
		@Pc(113) Container local113;
		@Pc(87) Insets local87;
		if (Static264.aFrame2 != null) {
			Static212.anInt3904 = arg1;
			Static142.anInt2934 = arg4;
			local113 = Static264.aFrame2;
		} else if (Static133.aFrame3 == null) {
			local113 = Static45.aClass209_127.anApplet1;
			Static142.anInt2934 = local113.getSize().width;
			Static212.anInt3904 = local113.getSize().height;
		} else {
			local87 = Static133.aFrame3.getInsets();
			@Pc(93) int local93 = -local87.left;
			Static142.anInt2934 = Static133.aFrame3.getSize().width + local93 - local87.right;
			@Pc(105) int local105 = -local87.bottom;
			Static212.anInt3904 = Static133.aFrame3.getSize().height + local105 - local87.top;
			local113 = Static133.aFrame3;
		}
		@Pc(154) int local154;
		if (arg0 == 1) {
			Static217.anInt3944 = 0;
			Static348.anInt6272 = Static365.anInt6516;
			Static199.anInt3767 = Static357.anInt6368;
			Static221.anInt4007 = (Static142.anInt2934 - Static365.anInt6516) / 2;
		} else if (Static270.anInt4876 < 96 && Static294.anInt5208 == 0) {
			local154 = Static142.anInt2934 > 1024 ? 1024 : Static142.anInt2934;
			Static221.anInt4007 = (Static142.anInt2934 - local154) / 2;
			@Pc(168) int local168 = Static212.anInt3904 <= 768 ? Static212.anInt3904 : 768;
			Static348.anInt6272 = local154;
			Static199.anInt3767 = local168;
			Static217.anInt3944 = 0;
		} else {
			Static217.anInt3944 = 0;
			Static348.anInt6272 = Static142.anInt2934;
			Static221.anInt4007 = 0;
			Static199.anInt3767 = Static212.anInt3904;
		}
		if (Static170.aClass193_5 != Static136.aClass193_3) {
			@Pc(211) boolean local211;
			if (Static348.anInt6272 < 1024 && Static199.anInt3767 < 768) {
				local211 = true;
			} else {
				local211 = false;
			}
		}
		if (arg2) {
			Static45.method6529();
		} else {
			Static280.aCanvas3.setSize(Static348.anInt6272, Static199.anInt3767);
			Static126.aClass66_5.method5052(Static280.aCanvas3);
			if (Static133.aFrame3 == local113) {
				local87 = Static133.aFrame3.getInsets();
				Static280.aCanvas3.setLocation(Static221.anInt4007 + local87.left, Static217.anInt3944 + local87.top);
			} else {
				Static280.aCanvas3.setLocation(Static221.anInt4007, Static217.anInt3944);
			}
		}
		if (arg0 >= 2) {
			Static365.aBoolean415 = true;
		} else {
			Static365.aBoolean415 = false;
		}
		if (Static36.anInt1129 != -1) {
			Static26.method687(true);
		}
		if (Static177.aClass73_6 != null && (Static217.anInt3941 == 30 || Static217.anInt3941 == 25)) {
			Static311.method4532();
		}
		for (local154 = 0; local154 < 100; local154++) {
			Static180.aBooleanArray8[local154] = true;
		}
		Static30.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method5650() {
		Static76.anInt7822 = Static237.aClass166_8.anInt4593 + Static237.aClass166_8.anInt4596 + 2;
		Static406.aStringArray46 = new String[500];
		Static381.anInt6823 = Static58.aClass166_6.anInt4593 + Static58.aClass166_6.anInt4596 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static406.aStringArray46.length; local30++) {
			Static406.aStringArray46[local30] = "";
		}
	}
}
