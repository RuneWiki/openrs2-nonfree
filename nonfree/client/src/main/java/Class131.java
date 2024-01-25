import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class131 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	private final int anInt3606;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(II)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3606 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)I")
	public int method3011() {
		return this.anInt3606;
	}

	@OriginalMember(owner = "client!jm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
