import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class292 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public final int anInt7532;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
	public Class292(@OriginalArg(0) int arg0) {
		this.anInt7532 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
