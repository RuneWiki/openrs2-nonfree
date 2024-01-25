import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class219 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
	public Class219(@OriginalArg(0) int arg0) {
		this.anInt6139 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
