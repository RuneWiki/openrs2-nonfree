import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class89 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public int anInt2609;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class89(@OriginalArg(0) Class89 arg0) {
		this.anInt2608 = arg0.anInt2608;
		this.anInt2611 = arg0.anInt2611;
		this.anInt2609 = arg0.anInt2609;
		this.anInt2610 = arg0.anInt2610;
	}
}
