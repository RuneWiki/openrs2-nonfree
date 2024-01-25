import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class123 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public int anInt3395;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public int anInt3396;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public int anInt3397;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class123() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class123(@OriginalArg(0) Class123 arg0) {
		this.anInt3395 = arg0.anInt3395;
		this.anInt3397 = arg0.anInt3397;
		this.anInt3396 = arg0.anInt3396;
	}
}
