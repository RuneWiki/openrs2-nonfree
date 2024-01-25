import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class98 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
	public final int anInt2677;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString13;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class98(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2677 = arg1;
		this.aString13 = arg0;
	}

	@OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
