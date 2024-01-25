import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class208 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	public final int anInt5814;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5814 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
