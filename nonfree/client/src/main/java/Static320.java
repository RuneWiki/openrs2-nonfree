import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_43 = new Class44(32);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public static final int anInt5537 = 1401;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_16 = new Class10(8, 0, 4, 1);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!vp;ILclient!eq;)I")
	public static int method4620(@OriginalArg(0) Class254 arg0, @OriginalArg(2) Class66 arg1) {
		if (arg0.anInt7619 != -1) {
			return arg0.anInt7619;
		}
		if (arg0.anInt7611 != -1) {
			@Pc(28) Class184 local28 = arg1.anInterface8_5.method5566(arg1.method5065() ? arg0.anInt7611 : arg0.anInt7620);
			if (!local28.aBoolean330) {
				return local28.aShort72;
			}
		}
		return arg0.anInt7607;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public static void method4622() {
		if (Static264.aFrame2 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static133.aFrame3 == null) {
			local12 = Static45.aClass209_127.anApplet1;
		} else {
			local12 = Static133.aFrame3;
		}
		Static142.anInt2934 = local12.getSize().width;
		Static212.anInt3904 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static133.aFrame3) {
			local31 = Static133.aFrame3.getInsets();
			Static212.anInt3904 -= local31.top + local31.bottom;
			Static142.anInt2934 -= local31.left + local31.right;
		}
		if (Static374.method5599() == 1) {
			Static221.anInt4007 = (Static142.anInt2934 - Static365.anInt6516) / 2;
			Static348.anInt6272 = Static365.anInt6516;
			Static217.anInt3944 = 0;
			Static199.anInt3767 = Static357.anInt6368;
		} else if (Static270.anInt4876 < 96 && Static294.anInt5208 == 0) {
			@Pc(82) int local82 = Static142.anInt2934 > 1024 ? 1024 : Static142.anInt2934;
			Static348.anInt6272 = local82;
			@Pc(91) int local91 = Static212.anInt3904 > 768 ? 768 : Static212.anInt3904;
			Static221.anInt4007 = (Static142.anInt2934 - local82) / 2;
			Static199.anInt3767 = local91;
			Static217.anInt3944 = 0;
		} else {
			Static199.anInt3767 = Static212.anInt3904;
			Static221.anInt4007 = 0;
			Static217.anInt3944 = 0;
			Static348.anInt6272 = Static142.anInt2934;
		}
		if (Static170.aClass193_5 != Static136.aClass193_3) {
			@Pc(134) boolean local134;
			if (Static348.anInt6272 < 1024 && Static199.anInt3767 < 768) {
				local134 = true;
			} else {
				local134 = false;
			}
		}
		Static280.aCanvas3.setSize(Static348.anInt6272, Static199.anInt3767);
		if (Static126.aClass66_5 != null) {
			Static126.aClass66_5.method5052(Static280.aCanvas3);
		}
		if (Static133.aFrame3 == local12) {
			local31 = Static133.aFrame3.getInsets();
			Static280.aCanvas3.setLocation(local31.left + Static221.anInt4007, Static217.anInt3944 + local31.top);
		} else {
			Static280.aCanvas3.setLocation(Static221.anInt4007, Static217.anInt3944);
		}
		if (Static36.anInt1129 != -1) {
			Static26.method687(true);
		}
		Static344.method5291();
	}
}
