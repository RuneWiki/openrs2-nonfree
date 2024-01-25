import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class27 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	private final int anInt531;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(II)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt531 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
	public int method450() {
		return this.anInt531;
	}
}
