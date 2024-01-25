import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class81 {

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private final int anInt2297;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public final int anInt2296;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2297 = arg0;
		this.anInt2296 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	public int method1697() {
		return this.anInt2297;
	}
}
