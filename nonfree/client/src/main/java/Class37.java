import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class37 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public final int anInt1012;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class37(@OriginalArg(0) int arg0) {
		this.anInt1012 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
