import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class21 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	public final int anInt409;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt409 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
