import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class85 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	public int anInt3270;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public int anInt3272;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public int anInt3276;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public int anInt3277;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class85() {
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class85(@OriginalArg(0) Class85 arg0) {
		this.anInt3276 = arg0.anInt3276;
		this.anInt3270 = arg0.anInt3270;
		this.anInt3272 = arg0.anInt3272;
		this.anInt3277 = arg0.anInt3277;
	}
}
