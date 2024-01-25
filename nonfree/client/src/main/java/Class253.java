import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class253 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
	public int anInt7246;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public int anInt7247;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	public int anInt7248;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class253() {
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!vl;)V")
	public Class253(@OriginalArg(0) Class253 arg0) {
		this.anInt7246 = arg0.anInt7246;
		this.anInt7247 = arg0.anInt7247;
		this.anInt7248 = arg0.anInt7248;
	}
}
