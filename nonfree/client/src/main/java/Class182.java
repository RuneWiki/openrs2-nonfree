import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class182 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
	public final int anInt4681;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.anInt4681 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
