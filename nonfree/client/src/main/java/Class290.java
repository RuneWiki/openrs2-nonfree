import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class290 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public final int anInt7898;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
	public Class290(@OriginalArg(0) int arg0) {
		this.anInt7898 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
