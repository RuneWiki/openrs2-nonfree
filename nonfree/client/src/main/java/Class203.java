import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class203 {

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public final int anInt5389;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class203(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString69 = arg0;
		this.anInt5389 = arg1;
	}

	@OriginalMember(owner = "client!kw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
