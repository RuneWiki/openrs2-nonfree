import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!nba;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_162 = new Class359(88, 6);

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
	public static int anInt7663 = 0;

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)Z")
	public static boolean method6472() {
		try {
			if (Static26.anInt352 == 2) {
				if (Static424.aClass5_Sub33_2 == null) {
					Static424.aClass5_Sub33_2 = Static685.method4709(Static234.aClass390_55, Static561.anInt9131, Static67.anInt1002);
					if (Static424.aClass5_Sub33_2 == null) {
						return false;
					}
				}
				if (Static430.aClass290_2 == null) {
					Static430.aClass290_2 = new Class290(Static306.aClass390_78, Static174.aClass390_40);
				}
				@Pc(29) Class5_Sub17_Sub1 local29 = Static386.aClass5_Sub17_Sub1_2;
				if (Static439.aClass5_Sub17_Sub1_3 != null) {
					local29 = Static439.aClass5_Sub17_Sub1_3;
				}
				if (local29.method2551(Static424.aClass5_Sub33_2, Static43.aClass390_6, Static430.aClass290_2)) {
					Static386.aClass5_Sub17_Sub1_2 = local29;
					Static386.aClass5_Sub17_Sub1_2.method2545();
					@Pc(58) int local58;
					if (Static496.anInt8309 <= 0) {
						Static26.anInt352 = 0;
						Static386.aClass5_Sub17_Sub1_2.method2542(Static577.anInt9443);
						for (local58 = 0; local58 < Static326.anIntArray343.length; local58++) {
							Static386.aClass5_Sub17_Sub1_2.method2531(local58, Static326.anIntArray343[local58]);
							Static326.anIntArray343[local58] = 255;
						}
					} else {
						Static26.anInt352 = 3;
						Static386.aClass5_Sub17_Sub1_2.method2542(Static496.anInt8309 > Static577.anInt9443 ? Static577.anInt9443 : Static496.anInt8309);
						for (local58 = 0; local58 < Static326.anIntArray343.length; local58++) {
							Static386.aClass5_Sub17_Sub1_2.method2531(local58, Static326.anIntArray343[local58]);
							Static326.anIntArray343[local58] = 255;
						}
					}
					if (Static439.aClass5_Sub17_Sub1_3 == null) {
						if (Static548.aLong256 > 0L) {
							Static386.aClass5_Sub17_Sub1_2.method2536(Static128.aBoolean231, Static424.aClass5_Sub33_2, Static548.aLong256);
						} else {
							Static386.aClass5_Sub17_Sub1_2.method2543(Static128.aBoolean231, Static424.aClass5_Sub33_2);
						}
					}
					if (Static327.aClass255_2 != null) {
						Static327.aClass255_2.method7454(Static386.aClass5_Sub17_Sub1_2);
					}
					Static424.aClass5_Sub33_2 = null;
					Static234.aClass390_55 = null;
					Static430.aClass290_2 = null;
					Static548.aLong256 = 0L;
					Static439.aClass5_Sub17_Sub1_3 = null;
					return true;
				}
			}
		} catch (@Pc(166) Exception local166) {
			local166.printStackTrace();
			Static386.aClass5_Sub17_Sub1_2.method2527();
			Static430.aClass290_2 = null;
			Static424.aClass5_Sub33_2 = null;
			Static234.aClass390_55 = null;
			Static26.anInt352 = 0;
			Static439.aClass5_Sub17_Sub1_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!uaa;III)V")
	public static void method6473(@OriginalArg(0) Class345 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static383.aClass345_10 != null || Static493.aBoolean702 || (arg0 == null || Static491.method7048(arg0) == null)) {
			return;
		}
		Static383.aClass345_10 = arg0;
		Static303.aClass345_8 = Static491.method7048(arg0);
		Static637.anInt10351 = arg2;
		Static316.anInt5982 = arg1;
		Static511.aBoolean731 = false;
		Static365.anInt6630 = 0;
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(B)V")
	public static void method6474() {
		Static17.aClass252_1.method8821();
		Static359.aClass11_1.method6138();
		Static209.aClient2.method1806();
		Static141.aCanvas7.setBackground(Color.black);
		Static455.anInt7736 = -1;
		Static17.aClass252_1 = Static213.method8046(Static141.aCanvas7);
		Static359.aClass11_1 = Static353.method5338(Static141.aCanvas7);
	}
}
