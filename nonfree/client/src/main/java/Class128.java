import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class128 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	private final int anInt3255;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	private final int anInt3254;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
	private final boolean aBoolean273;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ZIIZ)V")
	public Class128(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3255 = arg1;
		this.anInt3254 = arg2;
		this.aBoolean272 = arg3;
		this.aBoolean273 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z")
	public boolean method2904() {
		return this.aBoolean273;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method2905() {
		return this.anInt3254;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Z")
	public boolean method2907() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
	public int method2908() {
		return this.anInt3255;
	}
}
