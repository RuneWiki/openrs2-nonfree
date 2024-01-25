import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class117 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public final int anInt3461;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class117(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3461 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	public int method2865() {
		return this.anInt3461;
	}
}
