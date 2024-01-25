import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class81 {

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
	public final int anInt2281;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
	private final int anInt2278;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(II)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2281 = arg1;
		this.anInt2278 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)I")
	public int method1970() {
		return this.anInt2278;
	}

	@OriginalMember(owner = "client!eba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
