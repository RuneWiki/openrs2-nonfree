import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!efa", name = "D", descriptor = "[[Lclient!in;")
	public static Class160[][] aClass160ArrayArray1;

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "Lclient!em;")
	public static final Class83 aClass83_54 = new Class83(47, 2);

	@OriginalMember(owner = "client!efa", name = "B", descriptor = "[S")
	public static final short[] aShortArray13 = new short[] { 18, 17, 13, 51, 3, 15, 48, 58 };

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "[I")
	public static final int[] anIntArray90 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII)Z")
	public static boolean method1622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V")
	public static void method1623() {
		Static541.aClass91_36.method2275();
		Static239.aClass91_18.method2275();
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)V")
	public static void method1625() {
		Static497.method4591(-1, 255);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1626(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static583.method7816(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static99.anInt1760; local27++) {
			@Pc(33) String local33 = Static187.aStringArray6[local27];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static583.method7816(local33);
			if (local33 != null && local33.equals(local22)) {
				Static99.anInt1760--;
				for (@Pc(57) int local57 = local27; local57 < Static99.anInt1760; local57++) {
					Static187.aStringArray6[local57] = Static187.aStringArray6[local57 + 1];
					Static527.aStringArray36[local57] = Static527.aStringArray36[local57 + 1];
					Static225.anIntArray201[local57] = Static225.anIntArray201[local57 + 1];
					Static481.aStringArray32[local57] = Static481.aStringArray32[local57 + 1];
					Static7.anIntArray8[local57] = Static7.anIntArray8[local57 + 1];
					Static317.aBooleanArray37[local57] = Static317.aBooleanArray37[local57 + 1];
				}
				Static544.anInt9118 = Static259.anInt4739;
				@Pc(126) Class1_Sub9 local126 = Static123.method2194(Static469.aClass235_2, Static519.aClass208_103);
				local126.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0));
				local126.aClass1_Sub3_Sub1_1.method7920(arg0);
				Static42.method746(local126);
				break;
			}
		}
	}
}
