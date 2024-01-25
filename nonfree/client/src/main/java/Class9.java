import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class9 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class9() {
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!al;)V")
	public Class9(@OriginalArg(0) Class9 arg0) {
		this.anInt347 = arg0.anInt347;
		this.anInt346 = arg0.anInt346;
		this.anInt348 = arg0.anInt348;
	}
}
