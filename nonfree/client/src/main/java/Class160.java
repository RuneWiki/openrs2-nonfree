import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class160 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	private final int anInt3966;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3966 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public int method3424() {
		return this.anInt3966;
	}
}
