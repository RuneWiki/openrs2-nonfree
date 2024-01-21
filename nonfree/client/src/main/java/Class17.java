import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class17 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class17() {
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class17(@OriginalArg(0) Class17 arg0) {
		this.anInt1059 = arg0.anInt1059;
		this.anInt1055 = arg0.anInt1055;
		this.anInt1056 = arg0.anInt1056;
		this.anInt1063 = arg0.anInt1063;
	}
}
