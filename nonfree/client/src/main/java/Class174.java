import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class174 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public final int anInt4514;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class174(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4514 = arg1;
	}

	@OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
