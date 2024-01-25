import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class37 implements Interface14 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	public final int anInt1245;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1245 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
