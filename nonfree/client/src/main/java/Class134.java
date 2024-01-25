import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class134 {

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	public final int anInt4451;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(I)V")
	public Class134(@OriginalArg(0) int arg0) {
		this.anInt4451 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
