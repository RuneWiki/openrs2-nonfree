import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class234 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public int anInt6550;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public int anInt6551;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public int anInt6552;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 5)
	public Class234() {
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!um;)V", line = 7)
	public Class234(@OriginalArg(0) Class234 arg0) {
		this.anInt6552 = arg0.anInt6552;
		this.anInt6550 = arg0.anInt6550;
		this.anInt6551 = arg0.anInt6551;
	}
}
