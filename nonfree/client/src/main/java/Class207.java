import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class207 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	public int anInt6017;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class207() {
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!ms;)V")
	public Class207(@OriginalArg(0) Class207 arg0) {
		this.anInt6020 = arg0.anInt6020;
		this.anInt6018 = arg0.anInt6018;
		this.anInt6019 = arg0.anInt6019;
		this.anInt6017 = arg0.anInt6017;
	}
}
