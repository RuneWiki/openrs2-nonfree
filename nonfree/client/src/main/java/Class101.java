import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class101 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public int anInt3933;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public int anInt3937;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public int anInt3941;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class101() {
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!sa;)V")
	public Class101(@OriginalArg(0) Class101 arg0) {
		this.anInt3934 = arg0.anInt3934;
		this.anInt3937 = arg0.anInt3937;
		this.anInt3941 = arg0.anInt3941;
		this.anInt3933 = arg0.anInt3933;
	}
}
