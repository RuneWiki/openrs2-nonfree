import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class73 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public final int anInt1642;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class73(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1642 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
