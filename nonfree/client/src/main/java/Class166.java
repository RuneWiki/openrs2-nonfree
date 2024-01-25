import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class166 {

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	private final int anInt4826;

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
	private final int anInt4824;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(ZIIZ)V")
	public Class166(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt4826 = arg2;
		this.aBoolean421 = arg0;
		this.anInt4824 = arg1;
		this.aBoolean420 = arg3;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)I")
	public int method4076() {
		return this.anInt4826;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)Z")
	public boolean method4079() {
		return this.aBoolean420;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
	public boolean method4080() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
	public int method4081() {
		return this.anInt4824;
	}
}
