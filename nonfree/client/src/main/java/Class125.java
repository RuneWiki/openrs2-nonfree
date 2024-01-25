import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public final class Class125 {

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
	public final int anInt3483;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class125(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3483 = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I")
	public int method3065() {
		return this.anInt3483;
	}
}
