import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5() {
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class5(@OriginalArg(0) Class5 arg0) {
		this.anInt34 = arg0.anInt34;
		this.anInt33 = arg0.anInt33;
		this.anInt35 = arg0.anInt35;
	}
}
