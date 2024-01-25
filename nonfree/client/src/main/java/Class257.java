import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class257 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Z")
	private final boolean aBoolean624;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
	private final int anInt7222;

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
	private final int anInt7224;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "Z")
	private final boolean aBoolean625;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(ZIIZ)V")
	public Class257(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean624 = arg0;
		this.anInt7222 = arg2;
		this.anInt7224 = arg1;
		this.aBoolean625 = arg3;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)I")
	public int method5980() {
		return this.anInt7222;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I")
	public int method5982() {
		return this.anInt7224;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)Z")
	public boolean method5983() {
		return this.aBoolean625;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)Z")
	public boolean method5984() {
		return this.aBoolean624;
	}
}
