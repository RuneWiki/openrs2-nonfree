import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class37 {

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public final int anInt1063;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1063 = arg1;
		this.aString9 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
