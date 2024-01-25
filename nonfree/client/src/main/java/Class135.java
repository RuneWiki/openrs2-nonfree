import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class135 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	private final int anInt4064;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	private final int anInt4065;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(ZIIZ)V")
	public Class135(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean342 = arg0;
		this.anInt4064 = arg2;
		this.aBoolean341 = arg3;
		this.anInt4065 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z")
	public boolean method3337() {
		return this.aBoolean341;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	public boolean method3338() {
		return this.aBoolean342;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I")
	public int method3339() {
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)I")
	public int method3341() {
		return this.anInt4065;
	}
}
