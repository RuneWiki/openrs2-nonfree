import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class41 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public final int anInt1145;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt1145 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
