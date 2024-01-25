import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class133 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public final int anInt3403;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	public Class133(@OriginalArg(0) int arg0) {
		this.anInt3403 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
