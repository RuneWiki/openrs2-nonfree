import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class173 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	public final int anInt4509;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	private final int anInt4513;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4509 = arg1;
		this.anInt4513 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
	public int method3954() {
		return this.anInt4513;
	}

	@OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
