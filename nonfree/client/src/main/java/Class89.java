import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class89 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ed;)V")
	public Class89(@OriginalArg(0) Class89 arg0) {
		this.anInt2621 = arg0.anInt2621;
		this.anInt2622 = arg0.anInt2622;
		this.anInt2620 = arg0.anInt2620;
		this.anInt2623 = arg0.anInt2623;
	}
}
