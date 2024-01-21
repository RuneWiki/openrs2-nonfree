import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class89 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public int anInt4000;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class89(@OriginalArg(0) Class89 arg0) {
		this.anInt3999 = arg0.anInt3999;
		this.anInt4001 = arg0.anInt4001;
		this.anInt4002 = arg0.anInt4002;
		this.anInt4000 = arg0.anInt4000;
	}
}
