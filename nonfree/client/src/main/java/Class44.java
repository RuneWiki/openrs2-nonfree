import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class44 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public int anInt935;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public int anInt936;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt935 = arg0.anInt935;
		this.anInt937 = arg0.anInt937;
		this.anInt936 = arg0.anInt936;
	}
}
