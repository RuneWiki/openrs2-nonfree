import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class261 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	public final int anInt7631;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt7631 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
