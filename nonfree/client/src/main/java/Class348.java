import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class348 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
	private final int anInt10146;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
	private final int anInt10151;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Z")
	private final boolean aBoolean712;

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "Z")
	private final boolean aBoolean713;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(ZIIZ)V")
	public Class348(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10146 = arg1;
		this.anInt10151 = arg2;
		this.aBoolean712 = arg3;
		this.aBoolean713 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)Z")
	public boolean method8440() {
		return this.aBoolean712;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
	public int method8441() {
		return this.anInt10146;
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)Z")
	public boolean method8446() {
		return this.aBoolean713;
	}

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "(B)I")
	public int method8447() {
		return this.anInt10151;
	}
}
