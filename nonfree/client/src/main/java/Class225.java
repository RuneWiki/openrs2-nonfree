import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class225 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public int anInt6923;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
	public int anInt6924;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	public int anInt6925;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public int anInt6926;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class225() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nl;)V")
	public Class225(@OriginalArg(0) Class225 arg0) {
		this.anInt6925 = arg0.anInt6925;
		this.anInt6923 = arg0.anInt6923;
		this.anInt6924 = arg0.anInt6924;
		this.anInt6926 = arg0.anInt6926;
	}
}
