import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class284 {

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public final int anInt7923;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7923 = arg1;
		this.aString74 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
