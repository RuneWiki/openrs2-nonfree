import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class277 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
	public int anInt8272;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
	public int anInt8273;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	public Class277() {
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!tba;)V")
	public Class277(@OriginalArg(0) Class277 arg0) {
		this.anInt8273 = arg0.anInt8273;
		this.anInt8272 = arg0.anInt8272;
		this.anInt8274 = arg0.anInt8274;
	}
}
