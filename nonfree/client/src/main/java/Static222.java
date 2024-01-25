import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!od;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_90 = new Class362(14, 2);

	@OriginalMember(owner = "client!io", name = "x", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_35 = new Class244();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([Ljava/lang/String;B)V")
	public static void method3618(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static41.aString3 = Static41.aString3 + arg0[0];
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < arg0.length; local27++) {
			if (arg0[local27].startsWith("pause")) {
				@Pc(46) int local46 = 5;
				try {
					local46 = Integer.parseInt(arg0[local27].substring(6));
				} catch (@Pc(55) Exception local55) {
				}
				Static82.method1376("Pausing for " + local46 + " seconds...");
				Static524.anInt9933 = local27 + 1;
				Static45.aStringArray9 = arg0;
				Static205.aLong111 = (long) (local46 * 1000) + Static574.method8210();
				return;
			}
			Static41.aString3 = arg0[local27];
			Static62.method1015(false);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)Z")
	public static boolean method3619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIFIIZ)[I")
	public static int[] method3621(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub1_Sub4 local10 = new Class4_Sub1_Sub4();
		local10.aBoolean35 = true;
		local10.anInt675 = (int) (arg0 * 4096.0F);
		local10.anInt683 = 8;
		local10.anInt679 = 4;
		local10.anInt676 = 8;
		local10.anInt681 = 35;
		local10.method8391();
		Static419.method6557(2048, 1);
		local10.method632(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public static void method3622() {
		Static49.aBoolean36 = false;
		Static82.method1377(Static543.anInt9642, Static179.anInt3618, Static17.anInt279, Static19.anInt285);
	}
}
