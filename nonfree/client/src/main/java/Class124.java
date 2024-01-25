import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class124 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public int anInt3970;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public int anInt3972;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class124() {
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!j;)V")
	public Class124(@OriginalArg(0) Class124 arg0) {
		this.anInt3972 = arg0.anInt3972;
		this.anInt3971 = arg0.anInt3971;
		this.anInt3970 = arg0.anInt3970;
		this.anInt3973 = arg0.anInt3973;
	}
}
