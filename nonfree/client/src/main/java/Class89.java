import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class89 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public int anInt4740;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public int anInt4741;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public int anInt4742;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class89(@OriginalArg(0) Class89 arg0) {
		this.anInt4742 = arg0.anInt4742;
		this.anInt4740 = arg0.anInt4740;
		this.anInt4744 = arg0.anInt4744;
		this.anInt4741 = arg0.anInt4741;
	}
}
