import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class207 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public final int anInt5542;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class207(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5542 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
