import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class333 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public final int anInt9710;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString123;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class333(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.anInt9710 = arg2;
		this.aString123 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
