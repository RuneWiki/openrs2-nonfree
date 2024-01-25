import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class63 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public final int anInt1618;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class63(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1618 = arg1;
		this.aString23 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
