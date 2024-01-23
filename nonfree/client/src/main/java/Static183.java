import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	public static int anInt3487;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public static int anInt3490;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt3483 = 0;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString215 = "glow3:";

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt3486 = 0;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt3488 = 500;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!d;")
	public static Class34 aClass34_1 = new Class34();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!wf;)Lclient!wf;")
	public static Class189 method2955(@OriginalArg(1) Class189 arg0) {
		if (arg0.anInt5941 != -1) {
			return Static114.method1814(arg0.anInt5941);
		}
		@Pc(20) int local20 = arg0.anInt5918 >>> 16;
		@Pc(33) Class144 local33 = new Class144(Static148.aClass85_13);
		for (@Pc(38) Class4_Sub27 local38 = (Class4_Sub27) local33.method3577(); local38 != null; local38 = (Class4_Sub27) local33.method3581()) {
			if (local20 == local38.anInt4621) {
				return Static114.method1814((int) local38.aLong217);
			}
		}
		return null;
	}
}
