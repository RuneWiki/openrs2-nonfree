import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class43 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
	public final int anInt1115;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		this.anInt1115 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
