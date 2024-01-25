import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class127 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public final int anInt3507;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V")
	public Class127(@OriginalArg(0) int arg0) {
		this.anInt3507 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
