import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class304 {

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
	private final int anInt8708;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Z")
	private final boolean aBoolean659;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
	private final int anInt8699;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "Z")
	private final boolean aBoolean658;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(ZIIZ)V")
	public Class304(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8708 = arg1;
		this.aBoolean659 = arg3;
		this.anInt8699 = arg2;
		this.aBoolean658 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)I")
	public int method7445() {
		return this.anInt8708;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Z")
	public boolean method7447() {
		return this.aBoolean659;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)Z")
	public boolean method7448() {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)I")
	public int method7449() {
		return this.anInt8699;
	}
}
