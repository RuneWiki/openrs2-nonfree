import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class6 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
	public final int anInt83;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt83 = arg1;
	}

	@OriginalMember(owner = "client!aca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
