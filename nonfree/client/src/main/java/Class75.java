import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class75 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public int anInt2333;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public int anInt2334;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class75() {
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class75(@OriginalArg(0) Class75 arg0) {
		this.anInt2332 = arg0.anInt2332;
		this.anInt2334 = arg0.anInt2334;
		this.anInt2333 = arg0.anInt2333;
	}
}
