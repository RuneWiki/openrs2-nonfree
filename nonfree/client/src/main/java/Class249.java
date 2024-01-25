import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class249 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
	public int anInt6669;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public int anInt6670;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public int anInt6671;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class249() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!oq;)V")
	public Class249(@OriginalArg(0) Class249 arg0) {
		this.anInt6670 = arg0.anInt6670;
		this.anInt6671 = arg0.anInt6671;
		this.anInt6669 = arg0.anInt6669;
	}
}
