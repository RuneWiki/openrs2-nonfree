import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class93 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(I)V")
	public Class93(@OriginalArg(0) int arg0) {
		this.anInt2936 = arg0;
	}

	@OriginalMember(owner = "client!fda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
