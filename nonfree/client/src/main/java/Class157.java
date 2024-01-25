import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class157 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	private final int anInt5213;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5213 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	public int method4402() {
		return this.anInt5213;
	}
}
