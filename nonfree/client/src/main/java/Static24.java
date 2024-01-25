import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!mu;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	public static int anInt330;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt329 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method367(@OriginalArg(1) Class144 arg0) {
		for (@Pc(20) Class4_Sub8 local20 = (Class4_Sub8) Static440.aClass283_5.method6791(); local20 != null; local20 = (Class4_Sub8) Static440.aClass283_5.method6792()) {
			if (local20.aBoolean707) {
				local20.method8676(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	public static boolean method368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
