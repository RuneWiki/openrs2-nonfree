import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
	private final boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	private final boolean aBoolean4;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	private final int anInt129;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	private final int anInt131;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ZIIZ)V")
	public Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean5 = arg0;
		this.aBoolean4 = arg3;
		this.anInt129 = arg2;
		this.anInt131 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
	public boolean method129() {
		return this.aBoolean5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	public int method130() {
		return this.anInt129;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
	public int method131() {
		return this.anInt131;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z")
	public boolean method133() {
		return this.aBoolean4;
	}
}
