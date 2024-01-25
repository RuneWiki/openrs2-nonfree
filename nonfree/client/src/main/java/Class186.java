import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class186 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	private final int anInt4812;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4810 = arg1;
		this.anInt4812 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	public int method4264() {
		return this.anInt4812;
	}
}
