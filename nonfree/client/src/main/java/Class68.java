import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class68 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public final int anInt1509;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class68(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString6 = arg0;
		this.anInt1509 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
