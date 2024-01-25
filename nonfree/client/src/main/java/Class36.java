import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class36 {

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public final int anInt1242;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class36(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString5 = arg0;
		this.anInt1242 = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
