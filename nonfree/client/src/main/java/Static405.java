import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!pe;")
	public static Class254 aClass254_106;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public static int anInt7968 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method6588(@OriginalArg(1) Class15 arg0) {
		for (@Pc(12) Class55_Sub8 local12 = (Class55_Sub8) Static388.aClass134_7.method3233(); local12 != null; local12 = (Class55_Sub8) Static388.aClass134_7.method3230()) {
			if (local12.aBoolean713) {
				local12.method7125(arg0);
			}
		}
	}
}
