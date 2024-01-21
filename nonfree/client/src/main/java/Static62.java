import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_455 = Static158.method3034("AUS");

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!ra;")
	public static Class72 aClass72_5 = null;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_456 = Static158.method3034("::fpsoff");

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
	public static int anInt1922 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public static void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10;
		if (arg2 < arg3) {
			for (local10 = arg2; local10 < arg3; local10++) {
				Static42.anIntArrayArray8[local10][arg0] = arg1;
			}
		} else {
			for (local10 = arg3; local10 < arg2; local10++) {
				Static42.anIntArrayArray8[local10][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	public static boolean method1442(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Z")
	public static boolean method1443(@OriginalArg(1) int arg0) {
		if (Static65.aBooleanArray9[arg0]) {
			return true;
		} else if (Static151.aClass13_18.method525(arg0)) {
			@Pc(23) int local23 = Static151.aClass13_18.method513(arg0);
			if (local23 == 0) {
				Static65.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static197.aClass72ArrayArray1[arg0] == null) {
				Static197.aClass72ArrayArray1[arg0] = new Class72[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static197.aClass72ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static151.aClass13_18.method521(local45, arg0);
					if (local59 != null) {
						Static197.aClass72ArrayArray1[arg0][local45] = new Class72();
						Static197.aClass72ArrayArray1[arg0][local45].anInt3935 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							Static197.aClass72ArrayArray1[arg0][local45].method2977(new Class2_Sub3(local59));
						} else {
							Static197.aClass72ArrayArray1[arg0][local45].method2976(new Class2_Sub3(local59));
						}
					}
				}
			}
			Static65.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
