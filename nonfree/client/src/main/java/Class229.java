import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class229 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
	public int anInt6702;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
	public int anInt6703;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	public int anInt6704;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	public Class229() {
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!mw;)V")
	public Class229(@OriginalArg(0) Class229 arg0) {
		this.anInt6701 = arg0.anInt6701;
		this.anInt6704 = arg0.anInt6704;
		this.anInt6703 = arg0.anInt6703;
		this.anInt6702 = arg0.anInt6702;
	}
}
