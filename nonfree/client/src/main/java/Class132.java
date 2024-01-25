import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class132 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public final int anInt3866;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V")
	public Class132(@OriginalArg(0) int arg0) {
		this.anInt3866 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
