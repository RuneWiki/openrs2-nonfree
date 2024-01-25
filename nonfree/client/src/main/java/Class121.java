import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class121 {

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
	public Class121(@OriginalArg(0) int arg0) {
		this.anInt3423 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
