import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class123 {

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public final int anInt3994;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class123(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3994 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
