import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class69 {

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!t", name = "M", descriptor = "I")
	public int anInt2628;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
	public int anInt2629;

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class69() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!t;)V")
	public Class69(@OriginalArg(0) Class69 arg0) {
		this.anInt2628 = arg0.anInt2628;
		this.anInt2630 = arg0.anInt2630;
		this.anInt2623 = arg0.anInt2623;
		this.anInt2629 = arg0.anInt2629;
	}
}
