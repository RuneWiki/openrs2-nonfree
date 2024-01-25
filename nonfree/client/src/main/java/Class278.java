import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class278 implements Interface14 {

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString88;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class278(@OriginalArg(0) String arg0) {
		this.aString88 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Z")
	public boolean method6826() {
		return this.aBoolean592;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I")
	@Override
	public int method8681() {
		@Pc(16) int local16 = Static190.method3493(this.aString88);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean592 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lclient!jq;")
	@Override
	public Class174 method8680() {
		return Static286.aClass174_5;
	}
}
