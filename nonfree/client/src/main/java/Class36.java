import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class36 {

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
	public final int anInt1123;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		this.anInt1123 = arg0;
	}

	@OriginalMember(owner = "client!bia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
