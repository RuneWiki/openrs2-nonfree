import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!kda;")
	public static final Class173 aClass173_10 = new Class173();

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!efa;)V")
	public static void method5505(@OriginalArg(1) Class15_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(15) Class8_Sub4 local15 = (Class8_Sub4) Static413.aClass253_30.method6594((long) arg0.anInt8075);
		if (local15 == null) {
			Static586.method8144(null, arg0.anIntArray436[0], 0, arg0, arg0.aByte124, null, arg0.anIntArray435[0]);
		} else {
			local15.method976();
		}
	}
}
