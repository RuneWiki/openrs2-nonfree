import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class42 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public final int anInt1150;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1150 = arg1;
		this.aString8 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
