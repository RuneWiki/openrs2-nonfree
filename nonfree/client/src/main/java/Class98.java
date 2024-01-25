import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class98 implements Interface15 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	public final int anInt2425;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class98(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2425 = arg1;
	}

	@OriginalMember(owner = "client!ew", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
