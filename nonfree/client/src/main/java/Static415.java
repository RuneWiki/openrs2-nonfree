import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pu", name = "O", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_86 = new Class90(24, 8);

	@OriginalMember(owner = "client!pu", name = "U", descriptor = "I")
	public static int anInt5970 = 0;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)V")
	public static void method4709() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static179.aBooleanArray8[local7] = false;
		}
		Static458.anInt8765 = 0;
		Static275.anInt5759 = Static534.anInt9775;
		Static474.anInt1324 = Static114.anInt2613;
		Static166.anInt3460 = -1;
		Static300.anInt6053 = 5;
		Static68.anInt1813 = 0;
		Static464.anInt8840 = Static139.anInt3067;
		Static360.anInt6968 = Static306.anInt6122;
		Static108.anInt9764 = Static353.anInt6831;
		Static328.anInt6427 = Static233.anInt4905;
		Static453.anInt8613 = -1;
		Static587.anInt10508 = -1;
		Static456.anInt8707 = -1;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(ZII)V")
	public static void method4712(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static313.anInt6277 = arg1;
		Static274.anInt5755 = 3;
		Static435.method6471(Static518.aClass271_6.anInt7991, Static518.aClass271_6.aString164);
		if (arg0) {
			Static200.method3273(false, "", "");
		} else {
			Static387.method5967();
			Static200.method3273(false, Static543.aString213, Static570.aString228);
		}
	}
}
