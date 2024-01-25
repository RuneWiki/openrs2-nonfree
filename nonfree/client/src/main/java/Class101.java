import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class101 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	public int anInt3242;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public int anInt3243;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	public int anInt3244;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
	public int anInt3245;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class101() {
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!hv;)V")
	public Class101(@OriginalArg(0) Class101 arg0) {
		this.anInt3245 = arg0.anInt3245;
		this.anInt3244 = arg0.anInt3244;
		this.anInt3243 = arg0.anInt3243;
		this.anInt3242 = arg0.anInt3242;
	}
}
