import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class315 {

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
	public final int anInt8431;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(I)V")
	public Class315(@OriginalArg(0) int arg0) {
		this.anInt8431 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
