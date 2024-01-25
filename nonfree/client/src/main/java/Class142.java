import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class142 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public int anInt3542;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public int anInt3543;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public int anInt3544;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class142() {
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!lc;)V")
	public Class142(@OriginalArg(0) Class142 arg0) {
		this.anInt3542 = arg0.anInt3542;
		this.anInt3543 = arg0.anInt3543;
		this.anInt3544 = arg0.anInt3544;
	}
}
