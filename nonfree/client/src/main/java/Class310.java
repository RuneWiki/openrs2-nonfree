import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class310 {

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public final int anInt9119;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
	public Class310(@OriginalArg(0) int arg0) {
		this.anInt9119 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
