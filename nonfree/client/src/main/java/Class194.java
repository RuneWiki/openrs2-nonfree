import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class194 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	private final int anInt5033;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5033 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	public int method3978() {
		return this.anInt5033;
	}
}
