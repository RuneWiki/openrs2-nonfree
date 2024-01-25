import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wc", name = "ld", descriptor = "[[Lclient!saa;")
	public static Class312[][] aClass312ArrayArray1;

	@OriginalMember(owner = "client!wc", name = "Kd", descriptor = "[I")
	public static int[] anIntArray928;

	@OriginalMember(owner = "client!wc", name = "Nd", descriptor = "I")
	public static int anInt10519;

	@OriginalMember(owner = "client!wc", name = "Yd", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!wc", name = "Cd", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_212 = new Class180(129, 4);

	@OriginalMember(owner = "client!wc", name = "Wd", descriptor = "Z")
	public static boolean aBoolean796 = true;

	@OriginalMember(owner = "client!wc", name = "ce", descriptor = "Z")
	public static boolean aBoolean797 = false;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(B)V")
	public static void method9100() {
		Static601.anIntArray838 = Static76.method1429(0.4F);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lclient!ib;")
	public static Class147 method9105(@OriginalArg(1) int arg0) {
		@Pc(15) Class147[] local15 = Static419.method1503();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class147 local23 = local15[local17];
			if (arg0 == local23.anInt4410) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IBI)Z")
	public static boolean method9112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method9114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static450.method6576(arg0, arg1) || Static81.method1578(arg1, arg0);
	}
}
