import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class334 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public int anInt9277;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public int anInt9278;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public int anInt9279;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class334() {
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!tg;)V")
	public Class334(@OriginalArg(0) Class334 arg0) {
		this.anInt9278 = arg0.anInt9278;
		this.anInt9277 = arg0.anInt9277;
		this.anInt9279 = arg0.anInt9279;
	}
}
