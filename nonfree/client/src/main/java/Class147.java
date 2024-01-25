import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class147 implements Interface8 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public final int anInt3824;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3824 = arg1;
	}

	@OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
