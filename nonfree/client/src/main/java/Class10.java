import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class10 {

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public final int anInt259;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class10(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt259 = arg1;
		this.aString1 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
