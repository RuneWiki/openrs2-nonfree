import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class170 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt4738;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class170(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4738 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
