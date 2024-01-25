import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class205 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public int anInt6146;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt6147;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class205() {
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!uh;)V")
	public Class205(@OriginalArg(0) Class205 arg0) {
		this.anInt6146 = arg0.anInt6146;
		this.anInt6147 = arg0.anInt6147;
		this.anInt6145 = arg0.anInt6145;
		this.anInt6144 = arg0.anInt6144;
	}
}
