import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class97 {

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	public final int anInt2836;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2836 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
