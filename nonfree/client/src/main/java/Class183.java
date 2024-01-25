import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class183 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	private final int anInt4907;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	private final int anInt4906;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "Z")
	private final boolean aBoolean315;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ZIIZ)V")
	public Class183(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean313 = arg0;
		this.anInt4907 = arg2;
		this.anInt4906 = arg1;
		this.aBoolean315 = arg3;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
	public int method4181() {
		return this.anInt4906;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z")
	public boolean method4182() {
		return this.aBoolean313;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Z")
	public boolean method4183() {
		return this.aBoolean315;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I")
	public int method4184() {
		return this.anInt4907;
	}
}
