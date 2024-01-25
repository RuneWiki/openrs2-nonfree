import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class53 {

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private final int anInt1709;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	private final int anInt1712;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ZIIZ)V")
	public Class53(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1709 = arg2;
		this.aBoolean115 = arg0;
		this.anInt1712 = arg1;
		this.aBoolean114 = arg3;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)Z")
	public boolean method1706() {
		return this.aBoolean114;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	public int method1707() {
		return this.anInt1709;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Z")
	public boolean method1711() {
		return this.aBoolean115;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	public int method1712() {
		return this.anInt1712;
	}
}
