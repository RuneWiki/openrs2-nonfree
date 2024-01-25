import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_96 = new Class257(15, 8);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIB)Lclient!gp;")
	public static Class8_Sub5_Sub8 method7344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class8_Sub5_Sub8 local15 = (Class8_Sub5_Sub8) Static134.aClass253_10.method6594((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class8_Sub5_Sub8(arg0, arg1);
			Static134.aClass253_10.method6591(local15, local15.aLong285);
		}
		return local15;
	}
}
