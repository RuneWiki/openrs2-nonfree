import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class200 implements Interface6 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public final int anInt5475;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class200(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5475 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
