import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!rj;")
	public static Class209 aClass209_4;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_207 = new Class107(70, 8);

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_156 = new Class7("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	public static final int anInt7054 = 328;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method5773() {
		if (Static388.aBoolean439) {
			return;
		}
		Static388.aBoolean439 = true;
		if (Static38.aClass135_Sub1_1.aBoolean362) {
			Static201.aFloat56 = (int) Static201.aFloat56 + 47 & 0xFFFFFFF0;
		} else {
			Static316.aFloat76 += (12.0F - Static316.aFloat76) / 2.0F;
		}
		Static84.aBoolean109 = true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method5774() {
		if (Static373.aFrame5 != null) {
			return;
		}
		@Pc(15) Container local15;
		if (Static285.aFrame4 == null) {
			local15 = Static77.aClass180_1.anApplet1;
		} else {
			local15 = Static285.aFrame4;
		}
		Static299.anInt700 = local15.getSize().width;
		Static107.anInt2270 = local15.getSize().height;
		@Pc(33) Insets local33;
		if (local15 == Static285.aFrame4) {
			local33 = Static285.aFrame4.getInsets();
			Static299.anInt700 -= local33.left + local33.right;
			Static107.anInt2270 -= local33.bottom + local33.top;
		}
		if (Static432.method5740() == 1) {
			Static202.anInt3872 = (Static299.anInt700 - Static392.anInt6303) / 2;
			Static34.anInt715 = Static270.anInt4804;
			Static95.anInt1971 = Static392.anInt6303;
			Static308.anInt5300 = 0;
		} else if (Static79.anInt1766 < 96 && Static143.anInt2766 == 0) {
			@Pc(89) int local89 = Static299.anInt700 > 1024 ? 1024 : Static299.anInt700;
			Static202.anInt3872 = (Static299.anInt700 - local89) / 2;
			@Pc(105) int local105 = Static107.anInt2270 > 768 ? 768 : Static107.anInt2270;
			Static95.anInt1971 = local89;
			Static308.anInt5300 = 0;
			Static34.anInt715 = local105;
		} else {
			Static34.anInt715 = Static107.anInt2270;
			Static308.anInt5300 = 0;
			Static202.anInt3872 = 0;
			Static95.anInt1971 = Static299.anInt700;
		}
		if (Static45.aClass137_10 != Static35.aClass137_11) {
			@Pc(125) boolean local125;
			if (Static95.anInt1971 < 1024 && Static34.anInt715 < 768) {
				local125 = true;
			} else {
				local125 = false;
			}
		}
		Static155.aCanvas4.setSize(Static95.anInt1971, Static34.anInt715);
		if (Static415.aClass39_11 != null) {
			Static415.aClass39_11.method4498(Static155.aCanvas4);
		}
		if (Static285.aFrame4 == local15) {
			local33 = Static285.aFrame4.getInsets();
			Static155.aCanvas4.setLocation(Static202.anInt3872 + local33.left, Static308.anInt5300 + local33.top);
		} else {
			Static155.aCanvas4.setLocation(Static202.anInt3872, Static308.anInt5300);
		}
		if (Static407.anInt6564 != -1) {
			Static292.method4245(true);
		}
		Static55.method5709();
	}
}
