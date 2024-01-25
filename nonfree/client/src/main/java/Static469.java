import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pt", name = "U", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas11;

	@OriginalMember(owner = "client!pt", name = "eb", descriptor = "I")
	public static int anInt8009 = 0;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V")
	public static void method6704() {
		if (Static190.aBoolean282) {
			return;
		}
		Static663.method8651(Static559.aClass247ArrayArrayArray2);
		if (Static618.aClass247ArrayArrayArray3 != null) {
			Static663.method8651(Static618.aClass247ArrayArrayArray3);
		}
		Static190.aBoolean282 = true;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BJ)V")
	public static void method6727(@OriginalArg(1) long arg0) {
		if (Static332.aClass247ArrayArrayArray1 != null) {
			if (Static378.anInt6662 == 1 || Static378.anInt6662 == 5) {
				Static94.method1883(arg0);
			} else if (Static378.anInt6662 == 4) {
				Static487.method6990(arg0);
			}
		}
		Static83.method1771((long) Static621.anInt9665, Static582.aClass16_12);
		if (Static277.anInt5201 != -1) {
			Static190.method3054(Static277.anInt5201);
		}
		for (@Pc(46) int local46 = 0; local46 < Static47.anInt1250; local46++) {
			if (Static119.aBooleanArray10[local46]) {
				Static496.aBooleanArray23[local46] = true;
			}
			Static389.aBooleanArray18[local46] = Static119.aBooleanArray10[local46];
			Static119.aBooleanArray10[local46] = false;
		}
		Static618.anInt9583 = Static621.anInt9665;
		Static250.method3961(-1, (Class208) null, -1);
		Static488.method7009(-1, (Class208) null, -1);
		if (Static277.anInt5201 != -1) {
			Static47.anInt1250 = 0;
			Static52.method1372();
		}
		Static582.aClass16_12.la();
		Static358.method5375(Static582.aClass16_12);
		@Pc(101) int local101 = Static128.method2245();
		if (local101 == -1) {
			local101 = Static267.anInt5035;
		}
		if (local101 == -1) {
			local101 = Static503.anInt8458;
		}
		Static445.method6441(local101);
		@Pc(120) int local120 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() << 8;
		Static6.method65(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, local120 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109, Static527.anInt8716, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 + local120);
		Static527.anInt8716 = 0;
	}
}
