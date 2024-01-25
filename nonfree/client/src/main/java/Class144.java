import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class144 implements Interface10 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public final int anInt3723;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class144(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3723 = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
