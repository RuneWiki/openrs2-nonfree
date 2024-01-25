import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class19 {

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	private final int anInt577;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	private final int anInt578;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ZIIZ)V")
	public Class19(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt577 = arg1;
		this.aBoolean43 = arg3;
		this.aBoolean44 = arg0;
		this.anInt578 = arg2;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z")
	public boolean method449() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	public int method450() {
		return this.anInt578;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	public int method454() {
		return this.anInt577;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z")
	public boolean method455() {
		return this.aBoolean43;
	}
}
