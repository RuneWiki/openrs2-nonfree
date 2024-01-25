import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class233 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	public int anInt6237;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "I")
	public int anInt6238;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	public int anInt6239;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class233() {
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class233(@OriginalArg(0) Class233 arg0) {
		this.anInt6239 = arg0.anInt6239;
		this.anInt6238 = arg0.anInt6238;
		this.anInt6237 = arg0.anInt6237;
	}
}
