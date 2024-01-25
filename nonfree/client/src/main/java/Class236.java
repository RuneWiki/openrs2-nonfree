import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class236 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public final int anInt6448;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6448 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
