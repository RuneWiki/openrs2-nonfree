import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class208 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public final int anInt5341;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	private final int anInt5346;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5341 = arg1;
		this.anInt5346 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public int method4400() {
		return this.anInt5346;
	}
}
