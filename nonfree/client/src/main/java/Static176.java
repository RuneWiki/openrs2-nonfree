import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
	public static int[] anIntArray444;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_54;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray53 = new boolean[112];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([Lclient!dd;I)[Lclient!dd;")
	public static Class13[] method2935(@OriginalArg(0) Class13[] arg0) {
		@Pc(8) Class13[] local8 = new Class13[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static57.method1349(new Class13[] { Static3.method75(local10), Static83.aClass13_777 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static57.method1349(new Class13[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method2936() {
		anIntArray444 = null;
		aBooleanArray53 = null;
		aClass4_Sub1_54 = null;
	}
}
