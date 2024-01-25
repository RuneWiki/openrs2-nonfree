import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class105 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public int anInt3024;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public int anInt3025;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class105() {
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!ew;)V")
	public Class105(@OriginalArg(0) Class105 arg0) {
		this.anInt3023 = arg0.anInt3023;
		this.anInt3025 = arg0.anInt3025;
		this.anInt3024 = arg0.anInt3024;
	}
}
