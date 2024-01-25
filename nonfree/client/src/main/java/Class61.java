import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class61 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	public final int anInt1610;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	private final int anInt1613;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1610 = arg1;
		this.anInt1613 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	public int method1368() {
		return this.anInt1613;
	}
}
