import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class133 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public final int anInt4521;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	private final int anInt4519;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4521 = arg1;
		this.anInt4519 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	public int method3770() {
		return this.anInt4519;
	}

	@OriginalMember(owner = "client!ig", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
