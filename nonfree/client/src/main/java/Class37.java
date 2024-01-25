import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class37 {

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public final int anInt1407;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString7 = arg0;
		this.anInt1407 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
