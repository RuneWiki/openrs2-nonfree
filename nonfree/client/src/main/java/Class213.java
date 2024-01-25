import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class213 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public int anInt6508;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public int anInt6509;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public int anInt6510;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class213() {
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class213(@OriginalArg(0) Class213 arg0) {
		this.anInt6509 = arg0.anInt6509;
		this.anInt6510 = arg0.anInt6510;
		this.anInt6508 = arg0.anInt6508;
	}
}
