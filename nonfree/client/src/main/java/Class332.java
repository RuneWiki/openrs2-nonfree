import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class332 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
	public int anInt8856;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	public int anInt8857;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
	public int anInt8858;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class332() {
	}

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!tda;)V")
	public Class332(@OriginalArg(0) Class332 arg0) {
		this.anInt8857 = arg0.anInt8857;
		this.anInt8858 = arg0.anInt8858;
		this.anInt8856 = arg0.anInt8856;
	}
}
