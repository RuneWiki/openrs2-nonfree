import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class180 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	private final int anInt4282;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	private final int anInt4274;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(ZIIZ)V")
	public Class180(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt4282 = arg2;
		this.aBoolean285 = arg3;
		this.anInt4274 = arg1;
		this.aBoolean284 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method3940() {
		return this.anInt4282;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Z")
	public boolean method3941() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
	public int method3942() {
		return this.anInt4274;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z")
	public boolean method3946() {
		return this.aBoolean285;
	}
}
