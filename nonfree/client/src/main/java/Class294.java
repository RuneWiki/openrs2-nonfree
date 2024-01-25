import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class294 {

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
	private final int anInt8369;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	private final int anInt8368;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Z")
	private final boolean aBoolean604;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(ZIIZ)V")
	public Class294(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8369 = arg2;
		this.aBoolean603 = arg3;
		this.anInt8368 = arg1;
		this.aBoolean604 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Z")
	public boolean method7214() {
		return this.aBoolean604;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)I")
	public int method7215() {
		return this.anInt8369;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)I")
	public int method7216() {
		return this.anInt8368;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Z")
	public boolean method7217() {
		return this.aBoolean603;
	}
}
