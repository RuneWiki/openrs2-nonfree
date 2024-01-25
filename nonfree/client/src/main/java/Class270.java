import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class270 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public final int anInt7654;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(I)V")
	public Class270(@OriginalArg(0) int arg0) {
		this.anInt7654 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
