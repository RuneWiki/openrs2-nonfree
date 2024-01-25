import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public static void method4350() {
		for (@Pc(6) Class5_Sub4_Sub6 local6 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local6 != null; local6 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
			if (local6.anInt2325 > 1) {
				local6.anInt2325 = 0;
				Static517.aClass293_59.method6925(((Class5_Sub4_Sub14) local6.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67).aLong164, local6);
				local6.aClass80_3.method1542();
			}
		}
		Static642.anInt10370 = 0;
		Static198.anInt3547 = 0;
		Static607.aClass306_63.method7315();
		Static28.aClass81_7.method1602();
		Static616.aClass80_12.method1542();
		Static251.aBoolean343 = false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIII)V")
	public static void method4351(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static304.anInt4824 = 0;
		Static231.anInt3977 = arg1;
		Static487.anInt8320 = arg0;
		Static514.anInt8603 = 0;
	}
}
