import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class264 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public final int anInt7501;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class264(@OriginalArg(0) int arg0) {
		this.anInt7501 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
