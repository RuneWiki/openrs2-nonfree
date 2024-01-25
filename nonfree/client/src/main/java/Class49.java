import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class49 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public final int anInt1393;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class49(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1393 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
