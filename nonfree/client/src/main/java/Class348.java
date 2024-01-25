import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class348 implements Interface22 {

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "Lclient!wm;")
	private final Class390 aClass390_116;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class348(@OriginalArg(0) Class390 arg0) {
		this.aClass390_116 = arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Lclient!dca;")
	@Override
	public Class77 method8098() {
		return Static99.aClass77_1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8097() {
		return this.aClass390_116.method8932() ? 100 : this.aClass390_116.method8934();
	}
}
