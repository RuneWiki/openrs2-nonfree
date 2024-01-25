import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class158 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public final int anInt3816;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	public Class158(@OriginalArg(0) int arg0) {
		this.anInt3816 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
