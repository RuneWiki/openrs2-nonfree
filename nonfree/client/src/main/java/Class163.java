import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class163 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	private final int anInt4602;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4602 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I")
	public int method3810() {
		return this.anInt4602;
	}
}
