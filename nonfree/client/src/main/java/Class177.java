import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class177 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public int anInt5612;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public int anInt5613;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public int anInt5614;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class177() {
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class177(@OriginalArg(0) Class177 arg0) {
		this.anInt5612 = arg0.anInt5612;
		this.anInt5614 = arg0.anInt5614;
		this.anInt5613 = arg0.anInt5613;
	}
}
