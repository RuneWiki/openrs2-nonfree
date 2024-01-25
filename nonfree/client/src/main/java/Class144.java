import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class144 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
	public int anInt5124;

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
	public int anInt5125;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
	public int anInt5126;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class144() {
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class144(@OriginalArg(0) Class144 arg0) {
		this.anInt5125 = arg0.anInt5125;
		this.anInt5126 = arg0.anInt5126;
		this.anInt5124 = arg0.anInt5124;
	}
}
