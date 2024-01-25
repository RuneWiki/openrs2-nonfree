import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class56 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	public final int anInt1569;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class56(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1569 = arg1;
	}

	@OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
