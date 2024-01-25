import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class16 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public final int anInt871;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt871 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
