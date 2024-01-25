import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class153 {

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class153(@OriginalArg(0) int arg0) {
		this.anInt4248 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
