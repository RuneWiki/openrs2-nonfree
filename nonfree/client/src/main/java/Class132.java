import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class132 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public int anInt3967;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public int anInt3968;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public int anInt3969;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class132() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class132(@OriginalArg(0) Class132 arg0) {
		this.anInt3969 = arg0.anInt3969;
		this.anInt3968 = arg0.anInt3968;
		this.anInt3967 = arg0.anInt3967;
	}
}
