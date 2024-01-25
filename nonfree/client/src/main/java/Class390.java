import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class390 {

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	private final int anInt10341;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
	private final boolean aBoolean758;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
	private final boolean aBoolean759;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	private final int anInt10339;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(ZIIZ)V")
	public Class390(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10341 = arg2;
		this.aBoolean758 = arg3;
		this.aBoolean759 = arg0;
		this.anInt10339 = arg1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	public int method8628() {
		return this.anInt10341;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Z")
	public boolean method8629() {
		return this.aBoolean758;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
	public int method8630() {
		return this.anInt10339;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Z")
	public boolean method8632() {
		return this.aBoolean759;
	}
}
