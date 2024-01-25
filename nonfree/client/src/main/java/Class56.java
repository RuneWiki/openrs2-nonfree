import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class56 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public final int anInt1919;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
	public Class56(@OriginalArg(0) int arg0) {
		this.anInt1919 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
