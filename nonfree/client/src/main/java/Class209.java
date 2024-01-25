import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class209 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public int anInt5941;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt5942;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class209() {
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class209(@OriginalArg(0) Class209 arg0) {
		this.anInt5943 = arg0.anInt5943;
		this.anInt5942 = arg0.anInt5942;
		this.anInt5941 = arg0.anInt5941;
	}
}
