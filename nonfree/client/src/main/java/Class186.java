import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class186 {

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	private final int anInt5618;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(II)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5618 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)I")
	public int method4851() {
		return this.anInt5618;
	}

	@OriginalMember(owner = "client!lu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
