import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class89 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public int anInt2593;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt2594;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ed;)V")
	public Class89(@OriginalArg(0) Class89 arg0) {
		this.anInt2593 = arg0.anInt2593;
		this.anInt2594 = arg0.anInt2594;
		this.anInt2595 = arg0.anInt2595;
	}
}
