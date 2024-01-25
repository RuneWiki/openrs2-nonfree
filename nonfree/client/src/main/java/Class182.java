import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class182 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public final int anInt5379;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.anInt5379 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
