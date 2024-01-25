import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_107 = new Class322(17, 3);

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_108 = new Class322(24, -1);

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public static void method5447() {
		if (Static243.anInt4675 < 0) {
			return;
		}
		@Pc(16) long local16 = Static549.method7758();
		Static243.anInt4675 = (int) ((long) Static243.anInt4675 + Static300.aLong272 - local16);
		if (Static243.anInt4675 <= 0) {
			Static496.aFloat163 = Static524.aClass304_2.aFloat169;
			Static366.aFloat111 = Static524.aClass304_2.aFloat165;
			Static557.anInt9015 = Static524.aClass304_2.anInt8395;
			Static548.aFloat178 = Static524.aClass304_2.aFloat167;
			Static358.aFloat110 = Static524.aClass304_2.aFloat166;
			Static547.aClass81_3 = Static524.aClass304_2.aClass81_1;
			Static255.aFloat98 = Static524.aClass304_2.aFloat168;
			Static15.anInt224 = Static524.aClass304_2.anInt8399;
			Static194.aFloat71 = Static524.aClass304_2.aFloat164;
			Static223.anInt4381 = Static524.aClass304_2.anInt8397;
			if (Static372.aClass277_7 != null) {
				Static372.aClass277_7.method6938();
			}
			Static372.aClass277_7 = Static524.aClass304_2.aClass277_6;
			Static243.anInt4675 = -1;
		} else {
			@Pc(80) int local80 = (Static243.anInt4675 << 8) / Static288.anInt5174;
			@Pc(84) int local84 = 255 - local80;
			@Pc(89) float local89 = (float) local80 / 255.0F;
			@Pc(93) float local93 = 1.0F - local89;
			Static223.anInt4381 = (local84 * (Static524.aClass304_2.anInt8397 & 0xFF00FF) + (Static188.anInt3779 & 0xFF00FF) * local80 & 0xFF00FF00) + (local80 * (Static188.anInt3779 & 0xFF00) + local84 * (Static524.aClass304_2.anInt8397 & 0xFF00) & 0xFF0000) >>> 8;
			Static255.aFloat98 = Static49.aFloat2 + (Static524.aClass304_2.aFloat168 - Static49.aFloat2) * local93;
			Static548.aFloat178 = Static520.aFloat173 + (Static524.aClass304_2.aFloat167 - Static520.aFloat173) * local93;
			Static366.aFloat111 = local93 * (Static524.aClass304_2.aFloat165 - Static95.aFloat7) + Static95.aFloat7;
			Static194.aFloat71 = (Static524.aClass304_2.aFloat164 - Static467.aFloat160) * local93 + Static467.aFloat160;
			Static15.anInt224 = (local80 * (Static659.anInt10194 & 0xFF00) + local84 * (Static524.aClass304_2.anInt8399 & 0xFF00) & 0xFF0000) + ((Static659.anInt10194 & 0xFF00FF) * local80 + ((Static524.aClass304_2.anInt8399 & 0xFF00FF) * local84) & 0xFF00FF00) >>> 8;
			Static496.aFloat163 = (Static524.aClass304_2.aFloat169 - Static34.aFloat1) * local93 + Static34.aFloat1;
			Static358.aFloat110 = local93 * (Static524.aClass304_2.aFloat166 - Static621.aFloat197) + Static621.aFloat197;
			Static557.anInt9015 = Static524.aClass304_2.anInt8395 * local84 + local80 * Static15.anInt228 >> 8;
			if (Static602.aClass81_4 != Static524.aClass304_2.aClass81_1) {
				Static547.aClass81_3 = Static473.aClass75_14.method6656(Static602.aClass81_4, Static524.aClass304_2.aClass81_1, local93, Static547.aClass81_3);
			}
			if (Static524.aClass304_2.aClass277_6 != Static251.aClass277_4) {
				if (Static251.aClass277_4 == null) {
					Static372.aClass277_7 = Static524.aClass304_2.aClass277_6;
					if (Static372.aClass277_7 != null) {
						Static372.aClass277_7.method6934(0, local84);
					}
				} else {
					Static372.aClass277_7 = Static251.aClass277_4;
					if (Static372.aClass277_7 != null) {
						Static372.aClass277_7.method6934(255, local84);
					}
				}
			}
		}
		Static300.aLong272 = local16;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!bka;")
	public static Class42 method5448(@OriginalArg(0) Component arg0) {
		try {
			@Pc(28) Constructor local28 = Class.forName("ne").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class42) local28.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(52) Throwable local52) {
			return new Class42_Sub1(arg0, true);
		}
	}
}
