import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class146 {

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "[Lclient!ag;")
	private Class8_Sub1[] aClass8_Sub1Array1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.aClass8_Sub1Array1 = new Class8_Sub1[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) Class8_Sub1 local23 = this.aClass8_Sub1Array1[local7] = new Class8_Sub1();
			local23.aClass8_Sub1_69 = local23;
			local23.aClass8_Sub1_68 = local23;
		}
	}
}
