import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class286 implements Interface6 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public final int anInt7724;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class286(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7724 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
