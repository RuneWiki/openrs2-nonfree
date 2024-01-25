import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class44 {

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	private final int anInt1713;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1713 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
	public int method1215() {
		return this.anInt1713;
	}
}
