import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class152 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public final int anInt4478;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	public Class152(@OriginalArg(0) int arg0) {
		this.anInt4478 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
