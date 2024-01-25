import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public final class Class351 implements Interface14 {

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "Lclient!aj;")
	private final Class15 aClass15_151;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class351(@OriginalArg(0) Class15 arg0) {
		this.aClass15_151 = arg0;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Lclient!jq;")
	@Override
	public Class174 method8680() {
		return Static286.aClass174_2;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)I")
	@Override
	public int method8681() {
		return this.aClass15_151.method535() ? 100 : this.aClass15_151.method525();
	}
}
