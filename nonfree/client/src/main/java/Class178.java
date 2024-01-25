import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class178 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public final int anInt4367;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class178(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4367 = arg1;
	}

	@OriginalMember(owner = "client!ni", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
