import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class65 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class65() {
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class65(@OriginalArg(0) Class65 arg0) {
		this.anInt3117 = arg0.anInt3117;
		this.anInt3113 = arg0.anInt3113;
		this.anInt3114 = arg0.anInt3114;
		this.anInt3115 = arg0.anInt3115;
	}
}
