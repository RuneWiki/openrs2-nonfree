import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt2368;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "J")
	public static volatile long aLong88 = 0L;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method2522() {
		if (Static215.anInt3939 == 0) {
			return;
		}
		try {
			if (++Static166.anInt3137 > 2000) {
				if (Static216.aClass11_5 != null) {
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
				}
				if (Static291.anInt5474 >= 1) {
					Static215.anInt3939 = 0;
					Static92.anInt1691 = -5;
					return;
				}
				if (Static253.anInt4714 == Static309.anInt5826) {
					Static253.anInt4714 = Static47.anInt914;
				} else {
					Static253.anInt4714 = Static309.anInt5826;
				}
				Static215.anInt3939 = 1;
				Static166.anInt3137 = 0;
				Static291.anInt5474++;
			}
			if (Static215.anInt3939 == 1) {
				Static173.aClass196_4 = Static308.aClass206_5.method5525(Static253.anInt4714, Static239.aString304);
				Static215.anInt3939 = 2;
			}
			@Pc(112) int local112;
			if (Static215.anInt3939 == 2) {
				if (Static173.aClass196_4.anInt5851 == 2) {
					throw new IOException();
				}
				if (Static173.aClass196_4.anInt5851 != 1) {
					return;
				}
				Static216.aClass11_5 = new Class11((Socket) Static173.aClass196_4.anObject8, Static308.aClass206_5);
				Static173.aClass196_4 = null;
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				local112 = Static216.aClass11_5.method167();
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				if (local112 != 21) {
					Static92.anInt1691 = local112;
					Static215.anInt3939 = 0;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					return;
				}
				Static215.anInt3939 = 3;
			}
			if (Static215.anInt3939 == 3) {
				if (Static216.aClass11_5.method160() < 1) {
					return;
				}
				Static182.aStringArray21 = new String[Static216.aClass11_5.method167()];
				Static215.anInt3939 = 4;
			}
			if (Static215.anInt3939 == 4 && Static216.aClass11_5.method160() >= Static182.aStringArray21.length * 8) {
				Static142.aClass6_Sub10_Sub1_3.anInt4188 = 0;
				Static216.aClass11_5.method164(Static142.aClass6_Sub10_Sub1_3.aByteArray67, Static182.aStringArray21.length * 8, 0);
				for (local112 = 0; local112 < Static182.aStringArray21.length; local112++) {
					Static182.aStringArray21[local112] = Static252.method4318(Static142.aClass6_Sub10_Sub1_3.method4016());
				}
				Static215.anInt3939 = 0;
				Static92.anInt1691 = 21;
				Static216.aClass11_5.method159();
				Static216.aClass11_5 = null;
			}
		} catch (@Pc(222) IOException local222) {
			if (Static216.aClass11_5 != null) {
				Static216.aClass11_5.method159();
				Static216.aClass11_5 = null;
			}
			if (Static291.anInt5474 < 1) {
				Static291.anInt5474++;
				if (Static253.anInt4714 == Static309.anInt5826) {
					Static253.anInt4714 = Static47.anInt914;
				} else {
					Static253.anInt4714 = Static309.anInt5826;
				}
				Static215.anInt3939 = 1;
				Static166.anInt3137 = 0;
			} else {
				Static92.anInt1691 = -4;
				Static215.anInt3939 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method2523() {
		@Pc(1) Class70 local1 = Static319.aClass70_101;
		synchronized (Static319.aClass70_101) {
			Static319.aClass70_101.method1399();
		}
	}
}
