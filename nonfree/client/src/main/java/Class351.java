import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class351 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	private final int anInt9764;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	private final int anInt9758;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(ZIIZ)V")
	public Class351(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean671 = arg3;
		this.aBoolean672 = arg0;
		this.anInt9764 = arg1;
		this.anInt9758 = arg2;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	public int method8395() {
		return this.anInt9764;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z")
	public boolean method8396() {
		return this.aBoolean672;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)I")
	public int method8397() {
		return this.anInt9758;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Z")
	public boolean method8399() {
		return this.aBoolean671;
	}
}
