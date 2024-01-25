import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class349 {

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	private final int anInt9428;

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
	public final int anInt9427;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(II)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9428 = arg0;
		this.anInt9427 = arg1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)I")
	public int method8323() {
		return this.anInt9428;
	}

	@OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
