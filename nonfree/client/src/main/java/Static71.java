import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dr", name = "X", descriptor = "Lclient!sh;")
	public static Class211 aClass211_28;

	@OriginalMember(owner = "client!dr", name = "ob", descriptor = "Lclient!dp;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString10 = "";

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_10 = new Class227(4);

	@OriginalMember(owner = "client!dr", name = "qb", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method1146() {
		if (Static67.anInt1357 == 0) {
			return;
		}
		try {
			if (++Static277.anInt4833 > 1500) {
				if (Static6.aClass130_1 != null) {
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
				}
				if (Static307.anInt5744 >= 1) {
					Static288.anInt4959 = -5;
					Static67.anInt1357 = 0;
					return;
				}
				if (Static108.anInt1883 == Static78.anInt1493) {
					Static108.anInt1883 = Static151.anInt2793;
				} else {
					Static108.anInt1883 = Static78.anInt1493;
				}
				Static307.anInt5744++;
				Static277.anInt4833 = 0;
				Static67.anInt1357 = 1;
			}
			if (Static67.anInt1357 == 1) {
				Static41.aClass112_1 = Static341.aClass162_5.method3289(Static108.anInt1883, Static125.aString20);
				Static67.anInt1357 = 2;
			}
			@Pc(118) int local118;
			if (Static67.anInt1357 == 2) {
				if (Static41.aClass112_1.anInt2969 == 2) {
					throw new IOException();
				}
				if (Static41.aClass112_1.anInt2969 != 1) {
					return;
				}
				Static6.aClass130_1 = new Class130((Socket) Static41.aClass112_1.anObject5, Static341.aClass162_5);
				Static41.aClass112_1 = null;
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				local118 = Static6.aClass130_1.method2672();
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				if (local118 != 101) {
					Static67.anInt1357 = 0;
					Static288.anInt4959 = local118;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					return;
				}
				Static67.anInt1357 = 3;
			}
			if (Static67.anInt1357 == 3 && Static6.aClass130_1.method2675() >= 2) {
				local118 = Static6.aClass130_1.method2672() << 8 | Static6.aClass130_1.method2672();
				Static181.method4755(local118);
				if (Static233.anInt3887 == -1) {
					Static67.anInt1357 = 0;
					Static288.anInt4959 = 6;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
				} else {
					Static67.anInt1357 = 0;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					Static240.method3327();
				}
			}
		} catch (@Pc(192) IOException local192) {
			if (Static6.aClass130_1 != null) {
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
			}
			if (Static307.anInt5744 >= 1) {
				Static288.anInt4959 = -4;
				Static67.anInt1357 = 0;
			} else {
				Static307.anInt5744++;
				if (Static108.anInt1883 == Static78.anInt1493) {
					Static108.anInt1883 = Static151.anInt2793;
				} else {
					Static108.anInt1883 = Static78.anInt1493;
				}
				Static277.anInt4833 = 0;
				Static67.anInt1357 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!td;B)V")
	public static void method1153(@OriginalArg(0) Class220 arg0) {
		Static201.aClass220_1 = arg0;
	}
}
