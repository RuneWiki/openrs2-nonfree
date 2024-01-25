import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class200 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private final int anInt5908;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public final int anInt5907;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(II)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5908 = arg0;
		this.anInt5907 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I")
	public int method5148() {
		return this.anInt5908;
	}
}
