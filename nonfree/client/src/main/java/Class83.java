import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class83 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class83(@OriginalArg(0) Class83 arg0) {
		this.anInt2481 = arg0.anInt2481;
		this.anInt2482 = arg0.anInt2482;
		this.anInt2480 = arg0.anInt2480;
	}
}
