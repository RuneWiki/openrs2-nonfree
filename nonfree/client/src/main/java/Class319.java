import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class319 {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "I")
	public int anInt8970;

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
	public int anInt8971;

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
	public int anInt8972;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "()V")
	public Class319() {
	}

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!sha;)V")
	public Class319(@OriginalArg(0) Class319 arg0) {
		this.anInt8972 = arg0.anInt8972;
		this.anInt8971 = arg0.anInt8971;
		this.anInt8970 = arg0.anInt8970;
	}
}
