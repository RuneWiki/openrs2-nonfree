import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class44 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt949 = arg0.anInt949;
		this.anInt947 = arg0.anInt947;
		this.anInt946 = arg0.anInt946;
		this.anInt948 = arg0.anInt948;
	}
}
