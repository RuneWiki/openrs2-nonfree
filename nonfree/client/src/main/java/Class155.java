import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class155 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public final int anInt4123;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	public Class155(@OriginalArg(0) int arg0) {
		this.anInt4123 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
