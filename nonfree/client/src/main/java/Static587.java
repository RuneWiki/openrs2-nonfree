import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!ac;")
	public static final Class5 aClass5_5 = new Class5("WTWIP", 3);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZII)V")
	public static void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static314.anInt5780; local8++) {
			@Pc(14) Rectangle local14 = Class3_Sub16_Sub1.aRectangleArray2[local8];
			if (local14.x + local14.width > arg0 && local14.x < arg1 + arg0 && arg3 < local14.y + local14.height && arg3 + arg2 > local14.y) {
				Static544.aBooleanArray32[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public static void method1505() {
		if (Static367.aClass106Array1 == null) {
			Static367.aClass106Array1 = Static152.method2843();
			Static338.aClass106_24 = Static367.aClass106Array1[0];
			Static57.aLong23 = Static96.method2000();
		}
		if (Static372.aClass163_1 == null) {
			Static509.method5295();
		}
		@Pc(23) Class106 local23 = Static338.aClass106_24;
		@Pc(26) int local26 = Static563.method5335();
		if (Static338.aClass106_24 == local23) {
			Static339.aString156 = Static338.aClass106_24.aClass350_2.method7730(Static201.anInt4321);
			if (Static338.aClass106_24.aBoolean250) {
				Static63.anInt1757 = Static338.aClass106_24.anInt3505 + (Static338.aClass106_24.anInt3500 - Static338.aClass106_24.anInt3505) * local26 / 100;
			}
			if (Static338.aClass106_24.aBoolean251) {
				Static339.aString156 = Static339.aString156 + Static63.anInt1757 + "%";
			}
		} else if (Static152.aClass106_22 == Static338.aClass106_24) {
			Static372.aClass163_1 = null;
			Static27.method293(3);
		} else {
			Static339.aString156 = local23.aClass350_1.method7730(Static201.anInt4321);
			Static63.anInt1757 = local23.anInt3500;
			if (Static338.aClass106_24.aBoolean251) {
				Static339.aString156 = Static339.aString156 + local23.anInt3500 + "%";
			}
			if (Static338.aClass106_24.aBoolean250 || local23.aBoolean250) {
				Static57.aLong23 = Static96.method2000();
			}
		}
		if (Static372.aClass163_1 == null) {
			return;
		}
		Static372.aClass163_1.method4032(Static63.anInt1757, Static338.aClass106_24, Static57.aLong23, Static339.aString156);
		if (Static596.anInterface23Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static36.anInt1027 + 1; local131 < Static596.anInterface23Array1.length; local131++) {
			if (Static596.anInterface23Array1[local131].method8167() >= 100 && Static36.anInt1027 == local131 - 1 && Static409.anInt1461 >= 1 && Static372.aClass163_1.method4030()) {
				try {
					Static596.anInterface23Array1[local131].method8169();
				} catch (@Pc(163) Exception local163) {
					Static596.anInterface23Array1 = null;
					return;
				}
				Static372.aClass163_1.method4029(Static596.anInterface23Array1[local131]);
				Static36.anInt1027++;
				if (Static596.anInterface23Array1.length - 1 <= Static36.anInt1027 && Static596.anInterface23Array1.length > 1) {
					Static36.anInt1027 = Static575.aClass24_2.method246() ? 0 : -1;
				}
			}
		}
		return;
	}
}
