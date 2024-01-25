import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class18 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	private final int anInt675;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt675 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	public int method697() {
		return this.anInt675;
	}
}
