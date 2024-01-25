import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class204 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public final int anInt6009;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
	public Class204(@OriginalArg(0) int arg0) {
		this.anInt6009 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
