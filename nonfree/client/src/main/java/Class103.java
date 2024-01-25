import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class103 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public int anInt3474;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public int anInt3475;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public int anInt3476;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public int anInt3477;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class103() {
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class103(@OriginalArg(0) Class103 arg0) {
		this.anInt3477 = arg0.anInt3477;
		this.anInt3475 = arg0.anInt3475;
		this.anInt3474 = arg0.anInt3474;
		this.anInt3476 = arg0.anInt3476;
	}
}
