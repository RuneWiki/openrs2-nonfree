import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class179 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	private final int anInt4839;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public final int anInt4843;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4839 = arg0;
		this.anInt4843 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	public int method4112() {
		return this.anInt4839;
	}
}
