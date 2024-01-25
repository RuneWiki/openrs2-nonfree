import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "[I")
	public static final int[] anIntArray498 = new int[4];

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Z")
	public static boolean aBoolean653 = false;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static void method7634() {
		Static561.anInt9146 = Static364.aClass198_8.anInt4648 + Static364.aClass198_8.anInt4647 + 2;
		Static167.anInt2767 = Static358.aClass198_7.anInt4647 + Static358.aClass198_7.anInt4648 + 2;
		Static223.aStringArray14 = new String[500];
		for (@Pc(24) int local24 = 0; local24 < Static223.aStringArray14.length; local24++) {
			Static223.aStringArray14[local24] = "";
		}
		Static611.method8213(Static49.aClass42_1.method730(Static259.anInt4113));
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
	public static void method7635(@OriginalArg(1) int arg0) {
		if (Static131.anIntArray115 == null || arg0 > Static131.anIntArray115.length) {
			Static131.anIntArray115 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method7636(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)Z")
	public static boolean method7638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static234.method3349(arg0, arg1) || Static304.method4153(arg0, arg1);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public static void method7639() {
		for (@Pc(4) Class5_Sub2_Sub5 local4 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local4 != null; local4 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
			if (local4.anInt2821 > 1) {
				local4.anInt2821 = 0;
				Static440.aClass265_47.method6566(local4, ((Class5_Sub2_Sub13) local4.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67).aLong197);
				local4.aClass150_3.method3097();
			}
		}
		Static223.anInt3566 = 0;
		Static150.anInt2471 = 0;
		Static153.aClass124_24.method2567();
		Static277.aClass335_21.method7773();
		Static600.aClass150_16.method3097();
		Static423.aBoolean549 = false;
	}
}
