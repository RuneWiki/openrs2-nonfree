import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class197 {

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public final int anInt5079;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class197(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString57 = arg0;
		this.anInt5079 = arg1;
	}

	@OriginalMember(owner = "client!pt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
