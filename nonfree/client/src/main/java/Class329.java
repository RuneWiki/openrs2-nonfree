import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class329 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public int anInt8286;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public int anInt8287;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public int anInt8288;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	public int anInt8289;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class329() {
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!to;)V")
	public Class329(@OriginalArg(0) Class329 arg0) {
		this.anInt8289 = arg0.anInt8289;
		this.anInt8286 = arg0.anInt8286;
		this.anInt8288 = arg0.anInt8288;
		this.anInt8287 = arg0.anInt8287;
	}
}
