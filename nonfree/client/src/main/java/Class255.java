import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class255 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
	public final int anInt7179;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
	public Class255(@OriginalArg(0) int arg0) {
		this.anInt7179 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
