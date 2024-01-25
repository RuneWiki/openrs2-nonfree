import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class247 {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	public final int anInt6763;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class247(@OriginalArg(0) int arg0) {
		this.anInt6763 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
