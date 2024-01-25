import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class304 implements Interface22 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString85;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class304(@OriginalArg(0) String arg0) {
		this.aString85 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
	public boolean method7323() {
		return this.aBoolean734;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
	@Override
	public int method8097() {
		@Pc(8) int local8 = Static115.method2136(this.aString85);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean734 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Lclient!dca;")
	@Override
	public Class77 method8098() {
		return Static99.aClass77_4;
	}
}
