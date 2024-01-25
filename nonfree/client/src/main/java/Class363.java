import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class363 implements Interface26 {

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Z")
	private boolean aBoolean746;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString112;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class363(@OriginalArg(0) String arg0) {
		this.aString112 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lclient!vca;")
	@Override
	public Class353 method8362() {
		return Static592.aClass353_5;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8361() {
		@Pc(8) int local8 = Static181.method3457(this.aString112);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean746 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)Z")
	public boolean method8366() {
		return this.aBoolean746;
	}
}
