import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class102 implements Interface4 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public final int anInt3008;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class102(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3008 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
