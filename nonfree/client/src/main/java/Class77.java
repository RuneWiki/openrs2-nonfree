import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class77 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
	public final int anInt2295;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class77(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.anInt2295 = arg2;
		this.aString27 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
