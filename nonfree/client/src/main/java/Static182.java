import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!efa;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt3294;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
	public static boolean method2926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILclient!ka;)Lclient!ck;")
	public static Class55 method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class180 arg3) {
		return arg3 == null ? null : new Class55(arg1, arg2, arg0, arg3.na(), arg3.V(), arg3.RA(), arg3.fa(), arg3.EA(), arg3.HA(), arg3.G());
	}
}
