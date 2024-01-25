import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class350 {

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	private final int anInt10089;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	private final int anInt10086;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
	private final boolean aBoolean710;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "Z")
	private final boolean aBoolean709;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(ZIIZ)V")
	public Class350(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10089 = arg1;
		this.anInt10086 = arg2;
		this.aBoolean710 = arg0;
		this.aBoolean709 = arg3;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Z")
	public boolean method8229() {
		return this.aBoolean709;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)I")
	public int method8230() {
		return this.anInt10086;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)Z")
	public boolean method8232() {
		return this.aBoolean710;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)I")
	public int method8234() {
		return this.anInt10089;
	}
}
