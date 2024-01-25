import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class243 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	public int anInt6463;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
	public int anInt6464;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class243() {
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class243(@OriginalArg(0) Class243 arg0) {
		this.anInt6462 = arg0.anInt6462;
		this.anInt6463 = arg0.anInt6463;
		this.anInt6464 = arg0.anInt6464;
	}
}
