import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class110 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public final int anInt2917;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
	public Class110(@OriginalArg(0) int arg0) {
		this.anInt2917 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
