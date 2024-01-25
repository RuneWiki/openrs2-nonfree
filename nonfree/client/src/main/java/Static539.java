import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	public static int anInt8839;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!wu;")
	public static Class380 aClass380_121;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!uha;")
	public static Class177 aClass177_10;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "[Lclient!sc;")
	public static final Class312[] aClass312Array1 = new Class312[16];

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	public static void method7447(@OriginalArg(0) int arg0) {
		Static249.anInt3980 = -1;
		Static95.anInt1808 = 3;
		Static20.anInt544 = 100;
		Static525.anInt5960 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIZIII)V")
	public static void method7448(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static298.aFrame3 != null && (arg3 != 3 || Static454.anInt7345 != arg2 || arg4 != Static365.anInt5779)) {
			Static120.method1758(Static298.aFrame3, Static452.aClass226_6);
			Static298.aFrame3 = null;
		}
		if (arg3 == 3 && Static298.aFrame3 == null) {
			Static298.aFrame3 = Static393.method5367(arg4, arg2, Static452.aClass226_6, 0);
			if (Static298.aFrame3 != null) {
				Static365.anInt5779 = arg4;
				Static454.anInt7345 = arg2;
				Static329.method4407();
			}
		}
		if (arg3 == 3 && Static298.aFrame3 == null) {
			method7448(arg0, true, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437(), -1);
			return;
		}
		@Pc(94) Container local94;
		@Pc(68) Insets local68;
		if (Static298.aFrame3 != null) {
			Static236.anInt3828 = arg4;
			Static550.anInt9024 = arg2;
			local94 = Static298.aFrame3;
		} else if (Static202.aFrame2 == null) {
			if (Static617.anApplet2 == null) {
				local94 = Static263.anApplet_Sub1_1;
			} else {
				local94 = Static617.anApplet2;
			}
			Static550.anInt9024 = local94.getSize().width;
			Static236.anInt3828 = local94.getSize().height;
		} else {
			local68 = Static202.aFrame2.getInsets();
			Static550.anInt9024 = Static202.aFrame2.getSize().width - local68.right - local68.left;
			@Pc(86) int local86 = -local68.bottom;
			Static236.anInt3828 = Static202.aFrame2.getSize().height + local86 - local68.top;
			local94 = Static202.aFrame2;
		}
		if (arg3 == 1) {
			Static511.anInt8548 = Static66.anInt10099;
			Static223.anInt3639 = 0;
			Static394.anInt6214 = (Static550.anInt9024 - Static66.anInt10099) / 2;
			Static153.anInt2747 = Static364.anInt5763;
		} else {
			Static332.method4473();
		}
		if (Static252.aClass80_3 != Static162.aClass80_2) {
			@Pc(152) boolean local152;
			if (Static511.anInt8548 < 1024 && Static153.anInt2747 < 768) {
				local152 = true;
			} else {
				local152 = false;
			}
		}
		if (arg1) {
			Static467.method6315();
		} else {
			Static504.aCanvas11.setSize(Static511.anInt8548, Static153.anInt2747);
			if (Static319.aBoolean356) {
				Static203.method2860(Static504.aCanvas11);
			} else {
				Static192.aClass95_4.method6950(Static504.aCanvas11, Static511.anInt8548, Static153.anInt2747);
			}
			if (local94 == Static202.aFrame2) {
				local68 = Static202.aFrame2.getInsets();
				Static504.aCanvas11.setLocation(Static394.anInt6214 + local68.left, Static223.anInt3639 + local68.top);
			} else {
				Static504.aCanvas11.setLocation(Static394.anInt6214, Static223.anInt3639);
			}
		}
		if (arg3 < 2) {
			Static507.aBoolean635 = false;
		} else {
			Static507.aBoolean635 = true;
		}
		if (Static38.anInt777 != -1) {
			Static311.method4222(true);
		}
		if (Static155.aClass121_2 != null && Static569.method7798(Static324.anInt5145)) {
			Static557.method7636();
		}
		for (@Pc(228) int local228 = 0; local228 < 100; local228++) {
			Static69.aBooleanArray25[local228] = true;
		}
		Static377.aBoolean430 = true;
	}
}
