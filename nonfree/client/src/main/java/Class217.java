import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class217 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	private final int anInt6556;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public final int anInt6557;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(II)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6556 = arg0;
		this.anInt6557 = arg1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
	public int method5768() {
		return this.anInt6556;
	}

	@OriginalMember(owner = "client!vq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
