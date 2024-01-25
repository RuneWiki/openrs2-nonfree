import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class311 implements Interface26 {

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "Z")
	private boolean aBoolean645;

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString100;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class311(@OriginalArg(0) String arg0) {
		this.aString100 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)I")
	@Override
	public int method8918() {
		@Pc(15) int local15 = Static42.method754(this.aString100);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean645 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)Lclient!oi;")
	@Override
	public Class258 method8919() {
		return Static403.aClass258_4;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z")
	public boolean method7533() {
		return this.aBoolean645;
	}
}
