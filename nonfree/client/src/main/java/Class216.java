import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public final class Class216 {

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "I")
	private final int anInt5283;

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "I")
	public final int anInt5284;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(II)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5283 = arg0;
		this.anInt5284 = arg1;
	}

	@OriginalMember(owner = "client!lja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)I")
	public int method4670() {
		return this.anInt5283;
	}
}
