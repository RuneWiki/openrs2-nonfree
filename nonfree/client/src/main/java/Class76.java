import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class76 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public int anInt2545;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public int anInt2546;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!uc;)V")
	public Class76(@OriginalArg(0) Class76 arg0) {
		this.anInt2546 = arg0.anInt2546;
		this.anInt2542 = arg0.anInt2542;
		this.anInt2545 = arg0.anInt2545;
		this.anInt2541 = arg0.anInt2541;
	}
}
