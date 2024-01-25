import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class283 {

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
	public final int anInt7694;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class283(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7694 = arg1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	public int method6125() {
		return this.anInt7694;
	}

	@OriginalMember(owner = "client!rca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
