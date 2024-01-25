import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class106 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public int anInt2589;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public int anInt2591;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class106(@OriginalArg(0) Class106 arg0) {
		this.anInt2590 = arg0.anInt2590;
		this.anInt2589 = arg0.anInt2589;
		this.anInt2591 = arg0.anInt2591;
	}
}
