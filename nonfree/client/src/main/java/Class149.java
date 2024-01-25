import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class149 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	public Class149() {
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class149(@OriginalArg(0) Class149 arg0) {
		this.anInt3715 = arg0.anInt3715;
		this.anInt3716 = arg0.anInt3716;
		this.anInt3714 = arg0.anInt3714;
		this.anInt3717 = arg0.anInt3717;
	}
}
