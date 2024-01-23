import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class122 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	public int anInt3672;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public int anInt3674;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class122() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nl;)V")
	public Class122(@OriginalArg(0) Class122 arg0) {
		this.anInt3670 = arg0.anInt3670;
		this.anInt3674 = arg0.anInt3674;
		this.anInt3676 = arg0.anInt3676;
		this.anInt3672 = arg0.anInt3672;
	}
}
