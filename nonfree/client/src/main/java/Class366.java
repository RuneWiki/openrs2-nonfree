import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class366 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
	public final int anInt9633;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	public Class366(@OriginalArg(0) int arg0) {
		this.anInt9633 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
