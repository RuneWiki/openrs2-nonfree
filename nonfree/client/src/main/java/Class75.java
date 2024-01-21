import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class75 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public int anInt3185;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public int anInt3187;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public int anInt3188;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public int anInt3190;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class75() {
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class75(@OriginalArg(0) Class75 arg0) {
		this.anInt3185 = arg0.anInt3185;
		this.anInt3190 = arg0.anInt3190;
		this.anInt3187 = arg0.anInt3187;
		this.anInt3188 = arg0.anInt3188;
	}
}
