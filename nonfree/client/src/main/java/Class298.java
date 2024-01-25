import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class298 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
	public int anInt8645;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public int anInt8646;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public int anInt8647;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class298() {
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class298(@OriginalArg(0) Class298 arg0) {
		this.anInt8645 = arg0.anInt8645;
		this.anInt8646 = arg0.anInt8646;
		this.anInt8647 = arg0.anInt8647;
	}
}
