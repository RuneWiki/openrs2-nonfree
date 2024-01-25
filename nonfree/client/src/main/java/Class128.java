import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class128 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public int anInt3964;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public int anInt3965;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public int anInt3966;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class128() {
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class128(@OriginalArg(0) Class128 arg0) {
		this.anInt3965 = arg0.anInt3965;
		this.anInt3964 = arg0.anInt3964;
		this.anInt3966 = arg0.anInt3966;
	}
}
