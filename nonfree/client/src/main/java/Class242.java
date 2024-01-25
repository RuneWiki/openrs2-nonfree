import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class242 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public final int anInt7529;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	public Class242(@OriginalArg(0) int arg0) {
		this.anInt7529 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
