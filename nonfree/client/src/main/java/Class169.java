import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class169 {

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	private final int anInt4992;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public final int anInt4990;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4992 = arg0;
		this.anInt4990 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I")
	public int method4517() {
		return this.anInt4992;
	}

	@OriginalMember(owner = "client!in", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
