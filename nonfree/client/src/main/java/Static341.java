import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public static final int anInt6031 = 205;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZ)Ljava/lang/String;")
	public static String method5230(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static222.method3740(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method5231() {
		if (Static363.aFrame4 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static154.aFrame1 == null) {
			local17 = Static92.aClass53_2.anApplet1;
		} else {
			local17 = Static154.aFrame1;
		}
		Static269.anInt4774 = local17.getSize().width;
		Static388.anInt4032 = local17.getSize().height;
		@Pc(35) Insets local35;
		if (Static154.aFrame1 == local17) {
			local35 = Static154.aFrame1.getInsets();
			Static388.anInt4032 -= local35.bottom + local35.top;
			Static269.anInt4774 -= local35.right + local35.left;
		}
		if (Static238.method3868() == 1) {
			Static125.anInt2378 = (Static269.anInt4774 - Static155.anInt2779) / 2;
			Static335.anInt5875 = Static155.anInt2779;
			Static263.anInt4662 = Static15.anInt364;
			Static284.anInt5038 = 0;
		} else if (Static314.anInt5576 < 96 && Static123.anInt2363 == 0) {
			@Pc(87) int local87 = Static269.anInt4774 <= 1024 ? Static269.anInt4774 : 1024;
			Static335.anInt5875 = local87;
			Static125.anInt2378 = (Static269.anInt4774 - local87) / 2;
			@Pc(105) int local105 = Static388.anInt4032 > 768 ? 768 : Static388.anInt4032;
			Static263.anInt4662 = local105;
			Static284.anInt5038 = 0;
		} else {
			Static335.anInt5875 = Static269.anInt4774;
			Static125.anInt2378 = 0;
			Static263.anInt4662 = Static388.anInt4032;
			Static284.anInt5038 = 0;
		}
		if (Static91.aClass143_12 != Static337.aClass143_27) {
			@Pc(133) boolean local133;
			if (Static335.anInt5875 < 1024 && Static263.anInt4662 < 768) {
				local133 = true;
			} else {
				local133 = false;
			}
		}
		Static170.aCanvas4.setSize(Static335.anInt5875, Static263.anInt4662);
		if (Static304.aClass82_4 != null) {
			Static304.aClass82_4.method4526();
		}
		if (local17 == Static154.aFrame1) {
			local35 = Static154.aFrame1.getInsets();
			Static170.aCanvas4.setLocation(Static125.anInt2378 + local35.left, local35.top + Static284.anInt5038);
		} else {
			Static170.aCanvas4.setLocation(Static125.anInt2378, Static284.anInt5038);
		}
		if (Static226.anInt4223 != -1) {
			Static260.method4054(true);
		}
		Static353.method5355();
	}
}
