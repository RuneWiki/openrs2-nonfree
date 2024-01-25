import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class128 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public final int anInt3174;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
	public Class128(@OriginalArg(0) int arg0) {
		this.anInt3174 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
