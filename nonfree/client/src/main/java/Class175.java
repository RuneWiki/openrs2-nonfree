import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class175 {

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public final int anInt4655;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class175(@OriginalArg(0) int arg0) {
		this.anInt4655 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
