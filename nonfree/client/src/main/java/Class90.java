import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class90 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	private final int anInt2624;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(II)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2624 = arg0;
		this.anInt2627 = arg1;
	}

	@OriginalMember(owner = "client!eda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)I")
	public int method2107() {
		return this.anInt2624;
	}
}
