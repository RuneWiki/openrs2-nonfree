import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class182 implements Interface21 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	public final int anInt5047;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5047 = arg1;
	}

	@OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
