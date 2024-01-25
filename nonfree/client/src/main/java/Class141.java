import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class141 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public int anInt3517;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public int anInt3519;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class141() {
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class141(@OriginalArg(0) Class141 arg0) {
		this.anInt3517 = arg0.anInt3517;
		this.anInt3520 = arg0.anInt3520;
		this.anInt3518 = arg0.anInt3518;
		this.anInt3519 = arg0.anInt3519;
	}
}
