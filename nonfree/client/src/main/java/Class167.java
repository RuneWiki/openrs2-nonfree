import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class167 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
	public final int anInt3992;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V")
	public Class167(@OriginalArg(0) int arg0) {
		this.anInt3992 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
