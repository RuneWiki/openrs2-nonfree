import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class196 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	private final int anInt4623;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4620 = arg1;
		this.anInt4623 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public int method4065() {
		return this.anInt4623;
	}

	@OriginalMember(owner = "client!ke", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
