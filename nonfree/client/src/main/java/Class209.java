import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class209 implements Interface11 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public final int anInt5604;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class209(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5604 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
