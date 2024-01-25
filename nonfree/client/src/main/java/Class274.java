import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class274 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public final int anInt7437;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V")
	public Class274(@OriginalArg(0) int arg0) {
		this.anInt7437 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
