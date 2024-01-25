import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class253 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public final int anInt7017;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
	public Class253(@OriginalArg(0) int arg0) {
		this.anInt7017 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
