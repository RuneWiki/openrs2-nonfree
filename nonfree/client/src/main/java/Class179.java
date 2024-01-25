import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class179 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	private final int anInt4911;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(II)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4911 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	public int method4060() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
