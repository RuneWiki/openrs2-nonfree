import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class30 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
	public final int anInt715;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class30(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt715 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
